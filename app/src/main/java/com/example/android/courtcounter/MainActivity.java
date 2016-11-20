package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_a = 0;
    int score_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


/***
 *  increase the score of teamA
 */
    public void point6(View view){
        score_a = score_a + 6;
        displayForTeamA(score_a);
    }

    public void point3(View view){
        score_a = score_a + 3;
        displayForTeamA(score_a);
    }

    public void point2(View view){
        score_a = score_a + 2;
        displayForTeamA(score_a);
    }

    public void point1(View view){
        score_a = score_a + 1;
        displayForTeamA(score_a);
    }


    /*
    *  increase the score of teamB
    * */
    public  void TeamB6(View view){
        score_b = score_b + 6;
        displayForTeamB(score_b);
    }

    public void TeamB3(View view){
        score_b = score_b + 3;
        displayForTeamB(score_b);
    }

    public void TeamB2(View view){
        score_b = score_b + 2;
        displayForTeamB(score_b);
    }

    public void TeamB1(View view){
        score_b = score_b + 1;
        displayForTeamB(score_b);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * method that makes the value return to 0
     * ***/
    public void returnZero(View view){
        score_a = 0;
        score_b = 0;
        displayForTeamA(score_a);
        displayForTeamB(score_b);
    }

}
