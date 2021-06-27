package com.msayeh.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView teamOneScoreTV, teamTwoScoreTV;
    Button addOneToOne, addTwoToOne, addThreeToOne, addOneToTwo, addTwoToTwo, addThreeToTwo, reset;
    int teamOneScore = 0, teamTwoScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        teamOneScoreTV = findViewById(R.id.score_1);
        teamTwoScoreTV = findViewById(R.id.score_2);
        addOneToOne = findViewById(R.id.add_1_to_1);
        addTwoToOne = findViewById(R.id.add_2_to_1);
        addThreeToOne = findViewById(R.id.add_3_to_1);
        addOneToTwo = findViewById(R.id.add_1_to_2);
        addTwoToTwo = findViewById(R.id.add_2_to_2);
        addThreeToTwo = findViewById(R.id.add_3_to_2);
        reset = findViewById(R.id.reset);

        addOneToOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamOneScore++;
                updateScreen();
            }
        });
        addTwoToOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamOneScore+=2;
                updateScreen();
            }
        });
        addThreeToOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamOneScore+=3;
                updateScreen();
            }
        });
        addOneToTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamTwoScore++;
                updateScreen();
            }
        });
        addTwoToTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamTwoScore+=2;
                updateScreen();
            }
        });
        addThreeToTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamTwoScore+=3;
                updateScreen();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamOneScore = 0;
                teamTwoScore = 0;
                updateScreen();
            }
        });

    }

    void updateScreen(){
        teamOneScoreTV.setText(String.valueOf(teamOneScore));
        teamTwoScoreTV.setText(String.valueOf(teamTwoScore));
    }
}