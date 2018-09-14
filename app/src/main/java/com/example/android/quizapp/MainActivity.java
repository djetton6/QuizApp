package com.example.android.quizapp;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

/**Imported all of the ID's relevant to the app. These should be all the correct questions the user
    will select the correct answers to app.
 */
    RadioButton stem_op_1, stem_op_2, stem_op_3, stem_op_4;
    RadioButton stem_funding_q_1, stem_funding_q_2, stem_funding_q_3, stem_funding_q_4;
    CheckBox stem_career_1, stem_career_2, stem_career_3, stem_career_4;
    CheckBox stem_fact_1, stem_fact_2, stem_fact_3, stem_fact_4;

    int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void correctAnswerOne(View view) {
        correctAnswers = +1;
        Toast.makeText(this, "Getting somewhere!", Toast.LENGTH_SHORT).show();
        // Do something in response to button click
    }

    public void correctAnswerTwo(View view) {
        correctAnswers = +1;
        Toast.makeText(this, "Now we're talking", Toast.LENGTH_SHORT).show();
        // Do something in response to button click
    }

    public void stem_funding_q_4(View view) {
        correctAnswers = +1;
        Toast.makeText(this, "Getting somewhere!", Toast.LENGTH_SHORT).show();
        // Do something in response to button click
    }

    public void submission(View view) {
        Toast.makeText(this, "You got " + correctAnswers + "out of 4 correct! Perfect Score!", Toast.LENGTH_SHORT).show();

    }

}


