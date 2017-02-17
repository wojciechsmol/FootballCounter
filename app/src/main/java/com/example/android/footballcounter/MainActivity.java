package com.example.android.footballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowCardsTeamA = 0;
    int redCardsTeamA = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamB = 0;

    private static final String STATE_SCORETEAMA = "stateofScoreTeamA";
    private static final String STATE_SCORETEAMB = "stateofScoreTeamB";
    private static final String STATE_YELLOWCARDSTEAMA = "stateofYellowCardsTeamA";
    private static final String STATE_REDCARDSTEAMA = "stateofRedCardsTeamA";
    private static final String STATE_YELLOWCARDSTEAMB = "stateofYellowCardsTeamB";
    private static final String STATE_REDCARDSTEAMB = "stateofRedCardsTeamB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //------------------------------------------------------------
    // SAVING DATA
    //------------------------------------------------------------

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_SCORETEAMA, scoreTeamA);
        savedInstanceState.putInt(STATE_SCORETEAMB, scoreTeamB);
        savedInstanceState.putInt(STATE_YELLOWCARDSTEAMA, yellowCardsTeamA);
        savedInstanceState.putInt(STATE_REDCARDSTEAMA, redCardsTeamA);
        savedInstanceState.putInt(STATE_YELLOWCARDSTEAMB, yellowCardsTeamB);
        savedInstanceState.putInt(STATE_REDCARDSTEAMB, redCardsTeamB);
        super.onSaveInstanceState(savedInstanceState);
    }
    //--------------------------------------------------
    // RESTORING DATA
    //--------------------------------------------------

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt(STATE_SCORETEAMA);
        scoreTeamB = savedInstanceState.getInt(STATE_SCORETEAMB);
        yellowCardsTeamA = savedInstanceState.getInt(STATE_YELLOWCARDSTEAMA);
        redCardsTeamA = savedInstanceState.getInt(STATE_REDCARDSTEAMA);
        yellowCardsTeamB = savedInstanceState.getInt(STATE_YELLOWCARDSTEAMB);
        redCardsTeamB = savedInstanceState.getInt(STATE_REDCARDSTEAMB);

     //DISPLAY VALUES AFTER RESTORING:
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayYellowCardsTeamA(yellowCardsTeamA);
        displayRedCardsTeamA(redCardsTeamA);
        displayYellowCardsTeamB(yellowCardsTeamB);
        displayRedCardsTeamB(redCardsTeamB);
    }

    //-------------------------------------------------
//    SCORE DISPLAYS FOR BOTH TEAMS:
    //-------------------------------------------------
    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //--------------------------------------------------
    // CARDS DISPLAY FOR BOTH TEAMS
    //--------------------------------------------------

    public void displayYellowCardsTeamA(int cards_nr) {
        TextView scoreView = (TextView) findViewById(R.id.y_cards_team_a);
        scoreView.setText(String.valueOf(cards_nr));
    }

    public void displayRedCardsTeamA(int cards_nr) {
        TextView scoreView = (TextView) findViewById(R.id.r_cards_team_a);
        scoreView.setText(String.valueOf(cards_nr));
    }

    public void displayYellowCardsTeamB(int cards_nr) {
        TextView scoreView = (TextView) findViewById(R.id.y_cards_team_b);
        scoreView.setText(String.valueOf(cards_nr));
    }

    public void displayRedCardsTeamB(int cards_nr) {
        TextView scoreView = (TextView) findViewById(R.id.r_cards_team_b);
        scoreView.setText(String.valueOf(cards_nr));
    }

    //---------------------------------------------------
    // ADDING SCORE AND CARDS METHODS:
    //----------------------------------------------------

    public void addScoreTeamA(View v){
        scoreTeamA += 1;
        displayScoreTeamA(scoreTeamA);
    }

    public void addScoreTeamB(View v){
        scoreTeamB += 1;
        displayScoreTeamB(scoreTeamB);
    }

    public void addYcardsTeamA(View v){
        yellowCardsTeamA += 1;
        displayYellowCardsTeamA(yellowCardsTeamA);
    }

    public void addRcardsTeamA(View v){
        redCardsTeamA += 1;
        displayRedCardsTeamA(redCardsTeamA);
    }

    public void addYcardsTeamB(View v){
        yellowCardsTeamB += 1;
        displayYellowCardsTeamB(yellowCardsTeamB);
    }

    public void addRcardsTeamB(View v){
        redCardsTeamB += 1;
        displayRedCardsTeamB(redCardsTeamB);
    }

//    RESET:

    public void reset(View v){
        scoreTeamA = scoreTeamB = yellowCardsTeamA = yellowCardsTeamB = redCardsTeamA = redCardsTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayYellowCardsTeamA(yellowCardsTeamA);
        displayRedCardsTeamA(redCardsTeamA);
        displayYellowCardsTeamB(yellowCardsTeamB);
        displayRedCardsTeamB(redCardsTeamB);
    }
}
