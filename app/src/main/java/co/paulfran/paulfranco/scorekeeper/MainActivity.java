package co.paulfran.paulfranco.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int foul = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Soccer Score Keeper");

        showTeamAScore(score);
        showTeamBScore(score);
        showTeamAFouls(foul);
        showTeamBFouls(foul);
    }

    /**
     * Displays the given score for Team A.
     */

    public void showTeamAScore(int score){
        TextView teamAScore = (TextView) findViewById(R.id.teamAScore);
        teamAScore.setText(String.valueOf(score));
    }

    /**
     * Updates the score for Team A.
     */

    public void teamAScored(View view){
        score += 1;
        showTeamAScore(score);
    }

    /**
     * Displays the number of fouls for Team A.
     */

    public void showTeamAFouls(int foul){
        TextView teamAFoul = (TextView) findViewById(R.id.teamAFoul);
        teamAFoul.setText(String.valueOf(foul));
    }

    /**
     * Updates the score for Team A.
     */

    public void teamAFouled(View view){
        foul += 1;
        showTeamAFouls(foul);
    }

    /**
     * Displays the given score for Team B.
     */

    public void showTeamBScore(int score){
        TextView teamBScore = (TextView) findViewById(R.id.teamBScore);
        teamBScore.setText(String.valueOf(score));
    }

    /**
     * Updates the score for Team B.
     */
    public void teamBScored(View view){
        score += 1;
        showTeamBScore(score);
    }

    /**
     * Displays the number of fouls for Team B.
     */

    public void showTeamBFouls(int foul){
        TextView teamBFoul = (TextView) findViewById(R.id.teamBFoul);
        teamBFoul.setText(String.valueOf(foul));
    }

    /**
     * Updates the score for Team B.
     */

    public void teamBFouled(View view){
        foul += 1;
        showTeamBFouls(foul);
    }

    public void reset(View view){
        score = 0;
        foul = 0;
        showTeamAScore(score);
        showTeamBScore(score);
        showTeamAFouls(foul);
        showTeamBFouls(foul);

    }


}
