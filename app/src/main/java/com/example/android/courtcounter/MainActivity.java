package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView a_score,b_score;
    Button button3, button2, button_free_throw,button_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = findViewById(R.id.two_pointsA);
        button3 = findViewById(R.id.three_pointsA);
        button_free_throw = findViewById(R.id.free_throwA);
        a_score = findViewById(R.id.team_a_score);
        b_score = findViewById(R.id.team_b_score);
    }

    int scoreTeamA = 0;

    public void three_pointsA(View view) {
        scoreTeamA += 3;
        displayScoreA(scoreTeamA);
    }

    public void two_pointsA(View view) {
        scoreTeamA +=2;
        displayScoreA(scoreTeamA);
    }

    public void free_throwA(View view) {
        scoreTeamA++;
        displayScoreA(scoreTeamA);
    }

    private void displayScoreA(int score) {
        a_score.setText(" " + score);
    }
    int scoreTeamB = 0;
    public void three_pointsB(View view) {
        scoreTeamB += 3;
        displayScoreB(scoreTeamB);
    }

    public void two_pointsB(View view) {
        scoreTeamB +=2;
        displayScoreB(scoreTeamB);
    }

    public void free_throwB(View view) {
        scoreTeamB++;
        displayScoreB(scoreTeamB);
    }

    private void displayScoreB(int score) {
        b_score.setText(" " + score);
    }
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreA(scoreTeamA);
        displayScoreB(scoreTeamB);
    }
}