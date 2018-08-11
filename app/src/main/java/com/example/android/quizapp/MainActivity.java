package com.example.android.quizapp;

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

    int correctanswer=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void correctAnswerOne(View view) {
        Toast.makeText(this, "Getting somewhere!", Toast.LENGTH_SHORT).show();
        // Do something in response to button click
    }

    //Create a Method that adds each correct selection to integer//
    //Data Type= Boolean
    //
}


