package com.asrat19stanford.gymmin;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Scanner;

public class miracle extends AppCompatActivity {

    String [] workit = {"Bench Press", "Pull Up", "Squats", "Arnold Press", "Bicep Curls", "Parallel Dips", "Run"};
    Integer [] pics = {R.drawable.bench, R.drawable.pullups,R.drawable.squats, R.drawable.arnold, R.drawable.bicep, R.drawable.parallel, R.drawable.track};
    String[] body = {"Chest", "Back", "Legs", "Shoulders", "Biceps", "Triceps", "Cardio"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miracle);

        Intent intent = getIntent();
        int bodyPart = intent.getIntExtra("num", -1);

        TextView details = (TextView) findViewById(R.id.textView2);
        details.setText(workit[bodyPart]);


        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(pics[bodyPart]);

        Scanner scan = new Scanner(getResources().openRawResource(R.raw.please));

       switch (bodyPart) {
           case 0:
               scan = new Scanner(getResources().openRawResource(R.raw.chest));
            break;
           case 1:
               scan = new Scanner(getResources().openRawResource(R.raw.back));
            break;
           case 2:
               scan = new Scanner(getResources().openRawResource(R.raw.legs));
            break;
           case 3:
               scan = new Scanner(getResources().openRawResource(R.raw.shoulders));
               break;
           case 4:
               scan = new Scanner(getResources().openRawResource(R.raw.biceps));
               break;
           case 5:
               scan = new Scanner(getResources().openRawResource(R.raw.triceps));
               break;
           case 6:
               scan = new Scanner(getResources().openRawResource(R.raw.cardio));
       }


        String please = "";
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            please += line;
        }
        scan.close();

    TextView detail = (TextView) findViewById(R.id.details);
        detail.setText(please);



    }
}
