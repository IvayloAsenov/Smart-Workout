package com.example.ivo.workoutbuilderai;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

/**
 * Activity that lets the user pick his goals when it
 * comes to his workout. The user can either pick one, two, or
 * all three of them.
 *
 * @author Ivaylo Asenov
 */
public class ChooseGoalsActivity extends AppCompatActivity {

    ImageView iv_textChooseGoals;
    ImageView iv_loseWeight;
    ImageView iv_buildMuscle;
    ImageView iv_increaseEndurance;
    ImageView iv_continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_goals);

        iv_textChooseGoals = findViewById(R.id.iv_textChooseGoals);
        iv_loseWeight = findViewById(R.id.iv_loseWeight);
        iv_buildMuscle = findViewById(R.id.iv_buildMuscle);
        iv_increaseEndurance = findViewById(R.id.iv_increaseEndurance);
        iv_continue = findViewById(R.id.iv_continueGoals);

    }

}
