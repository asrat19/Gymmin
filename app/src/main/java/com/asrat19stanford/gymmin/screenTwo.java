package com.asrat19stanford.gymmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screenTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_two);
    }

    //returns to main screen
    public void returnToMain(View view) {
        Intent intent = new Intent(this, gymRatzz.class);
        startActivity(intent);
    }

    public void chosenWorkout (View view) {
        Intent intent = new Intent(this, miracle.class);

        int bodyPart = -1;




        if (view == findViewById(R.id.chest)) {
           bodyPart = 0;
        } else if (view == findViewById(R.id.back)) {
            bodyPart = 1;
        } else if (view == findViewById(R.id.legs)){
            bodyPart = 2;
        } else if (view == findViewById(R.id.shoulder)) {
            bodyPart = 3;
        } else if (view == findViewById(R.id.biceps)) {
            bodyPart = 4;
        } else if (view == findViewById(R.id.triceps)) {
            bodyPart = 5;
        } else {
            bodyPart = 6;
        }
        intent.putExtra("num", bodyPart);
        startActivity(intent);



    }


}
