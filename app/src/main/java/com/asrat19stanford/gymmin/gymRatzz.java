package com.asrat19stanford.gymmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class gymRatzz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym_ratzz);
    }

    public void workouts(View view) {
        Intent intent = new Intent(this, screenTwo.class);
        startActivity(intent);
        //d
    }

    public void motivation(View view) {
        Intent intent = new Intent(this, motiva.class);
        startActivity(intent);

    }

    public void connect(View view) {
        Intent intent = new Intent(this, connecta.class);
        startActivity(intent);
    }
}
