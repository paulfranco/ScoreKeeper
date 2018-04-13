package co.paulfran.paulfranco.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showTeamAScore(score);
        showTeamBScore(score);
    }

    public void showTeamAScore(int score){
        TextView teamAScore = (TextView) findViewById(R.id.teamAScore);
        teamAScore.setText(String.valueOf(score));
    }

    public void teamAScored(View view){
        score += 1;
        showTeamAScore(score);

    }
    public void showTeamBScore(int score){
        TextView teamBScore = (TextView) findViewById(R.id.teamBScore);
        teamBScore.setText(String.valueOf(score));
    }

    public void teamBScored(View view){
        score += 1;
        showTeamBScore(score);

    }
}
