package com.example.ivo.workoutbuilderai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Activity that acts as home screen from where the user can
 * build a new workout or to see previous workouts
 *
 * @author Ivaylo Asenov
 * */

public class HomeActivity extends AppCompatActivity {

    ImageView iv_buildWorkout;
    ImageView iv_seeWorkouts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        iv_buildWorkout = findViewById(R.id.iv_buildWorkout);
        iv_seeWorkouts  = findViewById(R.id.iv_seeWorkouts);
    }
}
