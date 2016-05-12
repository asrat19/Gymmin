package com.asrat19stanford.gymmin;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class motiva extends AppCompatActivity {

    Integer [] pics = {R.drawable.motivone, R.drawable.motivtwo, R.drawable.motivthree, R.drawable.motivfour, R.drawable.motivsix};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motiva);
    }

    public void updateMotivation(View view) {
        ImageView image = (ImageView) findViewById(R.id.imageView3);
        Random random = new Random();
        int rand = random.nextInt(5-0) + 0;
        image.setImageResource(pics[rand]);
    }
}
