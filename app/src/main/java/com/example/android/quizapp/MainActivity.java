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
        //This took forever to get to work thanks Project Coach.

        CheckBox checkBoxOne = findViewById(R.id.stem_career_1);
        boolean stemCareer1 = checkBoxOne.isChecked();

        CheckBox checkBoxTwo = findViewById(R.id.stem_career_2);
        boolean stemCareer2 = checkBoxTwo.isChecked();

        CheckBox checkBoxThree = findViewById(R.id.stem_career_3);
        boolean stemCareer3 = checkBoxThree.isChecked();

        CheckBox checkBoxFour = findViewById(R.id.stem_career_4);
        boolean stemCareer4 = checkBoxFour.isChecked();

        if (stemCareer1 & stemCareer2 & stemCareer3 & stemCareer4) {
            correctAnswers += 1;
            Toast.makeText(this, "Testing" + correctAnswers, Toast.LENGTH_SHORT).show();
            return;

        }
    }

        public void stemFact(View view){
            // Is the view now checked?
            //int checkboxcareers = 0;
            //This took forever to get to work thanks Project Coach.

            CheckBox checkBoxFactOne = findViewById(R.id.stem_fact_1);
            boolean stemFact1 = checkBoxFactOne.isChecked();

            CheckBox checkBoxFactTwo = findViewById(R.id.stem_fact_2);
            boolean stemFact2 = checkBoxFactTwo.isChecked();

            CheckBox checkBoxFactThree = findViewById(R.id.stem_fact_3);
            boolean stemFact3 = checkBoxFactThree.isChecked();

            CheckBox checkBoxFactFour = findViewById(R.id.stem_fact_4);
            boolean stemFact4 = checkBoxFactFour.isChecked();

            if (stemFact1 & stemFact2 & stemFact3 & stemFact4) {
                correctAnswers += 1;
                Toast.makeText(this, "Testing" + correctAnswers, Toast.LENGTH_SHORT).show();
                return;
            }
        }
    };
            //Submission Button should show score and email name.

  /*  final Button button = findViewById(R.id.submission);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText emailMessage = (EditText) findViewById(R.id.email_input);
                String email = emailMessage.getText().toString();
                Toast.makeText(MainActivity.this, "Test" + email + correctAnswers, Toast.LENGTH_SHORT).show();

    */