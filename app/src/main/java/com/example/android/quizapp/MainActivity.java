package com.example.android.quizapp;

import android.provider.ContactsContract;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Imported all of the ID's relevant to the app. These should be all the correct questions the user
     * will select the correct answers to app.
     */
    RadioButton stem_op_1, stem_op_2, stem_op_3, stem_op_4;
    RadioButton stem_funding_q_1, stem_funding_q_2, stem_funding_q_3, stem_funding_q_4;
    CheckBox stem_career_1, stem_career_2, stem_career_3, stem_career_4;
    CheckBox stem_fact_1, stem_fact_2, stem_fact_3, stem_fact_4;
    EditText email_input;
    Button submission;


    int correctAnswers = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user touches the button
     */

    public void correctAnswerOne(View view) {
        correctAnswers += 1;
        Toast.makeText(this, "Getting somewhere!", Toast.LENGTH_SHORT).show();
        // Do something in response to button click
    }


    public void correctAnswerTwo(View view) {
        correctAnswers += 1;
        Toast.makeText(this, "Now we're talking", Toast.LENGTH_SHORT).show();
        // Do something in response to button click
    }

    public void stemCareer(View view) {
        // Is the view now checked?
        //int checkboxcareers = 0;
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            //Check to see if stem_career_1 is checked. All must be checked to get 1 point.
            case R.id.stem_career_1:
                if (checked)
                    correctAnswers += 1;
                else
                    correctAnswers -= 1;

                break;
        }


        switch (view.getId()) {
            case R.id.stem_career_2:
                if (checked)
                    correctAnswers += 1;
                else
                    correctAnswers += 0;
                break;
        }

        switch (view.getId()) {
            case R.id.stem_career_3:
                if (checked)
                    correctAnswers += 1;
                else
                    correctAnswers += 0;
                break;
        }
        switch (view.getId()) {
            case R.id.stem_career_4:
                if (checked)
                    correctAnswers += 1;
                else
                    correctAnswers += 0;
                break;
        }
    }

    public void stemFact(View view) {
        // Is the view now checked?
        //int checkboxcareers = 0;
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.stem_fact_1:
                if (checked)
                    correctAnswers += 1;
                else
                    correctAnswers += 0;
                break;
        }

        switch (view.getId()) {
            case R.id.stem_fact_2:
                if (checked)
                    correctAnswers += 1;
                else
                    correctAnswers += 0;
                break;
        }

        switch (view.getId()) {
            case R.id.stem_fact_3:
                if (checked)
                    correctAnswers += 1;
                else
                    correctAnswers += 0;
                break;
        }

        switch (view.getId()) {
            case R.id.stem_fact_4:
                if (checked)
                    correctAnswers += 1;
                else
                    correctAnswers += 0;
                break;
        }

        //Submission Button should show score and email name.
    }


    public void submission(View view) {
        EditText
    }
        Toast.makeText(this, "You got" + correctAnswers + "out of 4 correct! " , Toast.LENGTH_SHORT).show();

    }

    public void submitOrder(View view) {

        EditText emailMessage = (EditText) findViewById(R.id.input_email);
        String name = emailMessage.getText().toString();
}
