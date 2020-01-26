package com.example.android.footballscoresapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.footballscoresapp.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamRealM = 0;
    int scoreTeamJuv = 0;
    int foulTeamRealM = 0;
    int foulTeamJuv = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamRealM(0);
        displayForTeamJuv(0);
        displayForTeamRealM1(0);
        displayForTeamJuv1(0);
    }

//scores

    public void displayForTeamRealM(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_realm_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamJuv(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_juv_score);
        scoreView.setText(String.valueOf(score));
    }
    public void resetScoreRealM(View view){
        scoreTeamRealM = 0;
        displayForTeamRealM(scoreTeamRealM);
    }
    public void resetScoreJuv(View view){
        scoreTeamJuv = 0;
        displayForTeamJuv(scoreTeamJuv);
    }

    public void addOneForTeamRealM(View view){
        scoreTeamRealM = scoreTeamRealM + 1;
        displayForTeamRealM(scoreTeamRealM);
    }

    public void addOneForTeamJuv(View view){
        scoreTeamJuv = scoreTeamJuv + 1;
        displayForTeamJuv(scoreTeamJuv);
    }
//Fouls
    public void displayForTeamRealM1(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_realm_foul);
        foulView.setText(String.valueOf(foul));
    }
    public void displayForTeamJuv1(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_juv_foul);
        foulView.setText(String.valueOf(foul));
    }
    public void resetFoulRealM(View view){
        foulTeamRealM = 0;
        displayForTeamRealM1(foulTeamRealM);
    }
    public void resetFoulJuv(View view){
        foulTeamJuv = 0;
        displayForTeamJuv1(foulTeamJuv);
    }

    public void addOneForTeamRealM1(View view){
        foulTeamRealM = foulTeamRealM + 1;
        displayForTeamRealM1(foulTeamRealM);
    }

    public void addOneForTeamJuv1(View view){
        foulTeamJuv = foulTeamJuv + 1;
        displayForTeamJuv1(foulTeamJuv);
    }

}