package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA;
    int scoreTeamB;
    TextView teamAscore;
    TextView teamBscore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAscore = findViewById(R.id.team_a_score);
        teamBscore = findViewById(R.id.team_b_score);
    }

    public void threePointsTeamA(View view){
        String stringScore= teamAscore.getText().toString();
        scoreTeamA= Integer.parseInt(stringScore);
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointsTeamA(View view){
        String stringScore= teamAscore.getText().toString();
        scoreTeamA= Integer.parseInt(stringScore);
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    public void freeTrowTeamA(View view){
        String stringScore= teamAscore.getText().toString();
        scoreTeamA= Integer.parseInt(stringScore);
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    public void threePointsTeamB(View view){
        String stringScore= teamBscore.getText().toString();
        scoreTeamB= Integer.parseInt(stringScore);
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsTeamB(View view){
        String stringScore= teamBscore.getText().toString();
        scoreTeamB= Integer.parseInt(stringScore);
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    public void freeTrowTeamB(View view){
        String stringScore= teamBscore.getText().toString();
        scoreTeamB= Integer.parseInt(stringScore);
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA (int score){
        TextView scoreView= (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB (int score){
        TextView scoreView= (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
