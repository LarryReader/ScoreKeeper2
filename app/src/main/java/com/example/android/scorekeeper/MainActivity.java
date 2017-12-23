package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(8);
    }

    /**
     * Displays the given score for Team A .
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_score_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_score_b);
        scoreView.setText(String.valueOf(score));
    }

    public void addTouchDown(View view) {
        //scoreTeamA = scoreTeamA + 6;
        //int clickedView = view.getId();
        //displayForTeamA(scoreTeamA);
        switch (view.getId()) {
            case R.id.touch_down_a:
                scoreTeamA = scoreTeamA + 6;
                displayForTeamA(scoreTeamA);
                //Toast.makeText(this, "Team A", Toast.LENGTH_SHORT).show();
                break;
            case R.id.touch_down_b:
                scoreTeamB = scoreTeamB + 6;
                displayForTeamB(scoreTeamB);
                //Toast.makeText(this, "Team B", Toast.LENGTH_SHORT).show();
                // do your stuff for btn2
                break;
        }
    }

    public void addFieldGoal(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addConvKick(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addConvPlay(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamB(scoreTeamB);
    }

    public void add2B(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void add1B(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
