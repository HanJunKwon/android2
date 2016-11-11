package com.example.a403.myapplication;

import android.graphics.Color;
import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout;
    Button b1;
    CheckBox cb1;
    RatingBar rb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButton();

       setCheckBox();

       // setRatingBar();
    }

    void setButton(){
        b1 =(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Hello World", Toast.LENGTH_SHORT).show();
            }
        });
    }

    void setCheckBox(){
        cb1 = (CheckBox) findViewById(R.id.check);
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb1.isChecked())
                    layout.setBackgroundColor(Color.BLUE);
                else
                    layout.setBackgroundColor(Color.WHITE);
            }
        });
    }

    void setRatingBar(){
        rb1=(RatingBar)findViewById(R.id.ratingBar);
        rb1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getApplicationContext(), rating+"점입니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
