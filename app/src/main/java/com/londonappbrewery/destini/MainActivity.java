package com.londonappbrewery.destini;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyLine;
    Button firstAnswer;
    Button secondAnswer;
    int mStoryIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyLine = (TextView) findViewById(R.id.storyTextView);
        firstAnswer = (Button) findViewById(R.id.buttonTop);
        secondAnswer = (Button) findViewById(R.id.buttonBottom);

        mStoryIndex = 1;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        firstAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2){
                    mStoryIndex = 3;
                    nextStoryLine();
                } else if (mStoryIndex == 3) {
                    mStoryIndex = 6;
                    nextStoryLine();
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        secondAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    mStoryIndex = 2;
                    nextStoryLine();
                } else if (mStoryIndex == 2) {
                    mStoryIndex = 4;
                    nextStoryLine();
                } else if (mStoryIndex == 3) {
                    mStoryIndex = 5;
                    nextStoryLine();
                }

            }
        });

    }

    public void nextStoryLine () {

        if (mStoryIndex == 1) {
            storyLine.setText(R.string.T1_Story);
            firstAnswer.setText(R.string.T1_Ans1);
            secondAnswer.setText(R.string.T2_Ans2);
        } else if (mStoryIndex == 2) {
            storyLine.setText(R.string.T2_Story);
            firstAnswer.setText(R.string.T2_Ans1);
            secondAnswer.setText(R.string.T2_Ans2);
        } else if (mStoryIndex == 3) {
            storyLine.setText(R.string.T3_Story);
            firstAnswer.setText(R.string.T3_Ans1);
            secondAnswer.setText(R.string.T3_Ans2);
        }  else if (mStoryIndex == 4) {
            storyLine.setText(R.string.T4_End);
            firstAnswer.setVisibility(View.GONE);
            secondAnswer.setVisibility(View.GONE);
        } else if (mStoryIndex == 5) {
            storyLine.setText(R.string.T5_End);
            firstAnswer.setVisibility(View.GONE);
            secondAnswer.setVisibility(View.GONE);
        } else if (mStoryIndex == 6) {
            storyLine.setText(R.string.T6_End);
            firstAnswer.setVisibility(View.GONE);
            secondAnswer.setVisibility(View.GONE);
        }
    }

}
