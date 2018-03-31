package com.example.marry.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 * Created by Mary on 03/28/2018.
 */

public class Culture_Quiz extends Activity {

    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.culture_quiz);
    }

    private int checkAnswers() {
        /*
          finds the answer for question 1 and if it's the right one adds it to total
         */
        EditText q1EditText = findViewById(R.id.answer_question_one_culture_quiz);
        String q1 = q1EditText.getText().toString();

        if (q1.equals("Bucharest")) {
            total++;
        }


        /*
          finds the answer for question 2 and if it's the right one adds it to total
         */
        RadioButton q2RadioButton = findViewById(R.id.answer_two_question_two_culture_quiz);
        Boolean q2 = q2RadioButton.isChecked();

        if (q2) {
            total++;
        }

        /*
          finds the answer for question 3 and if it's the right one adds it to total
         */
        RadioButton q3RadioButton = findViewById(R.id.answer_one_question_three_culture_quiz);
        Boolean q3 = q3RadioButton.isChecked();

        if (q3) {
            total++;
        }


        /*
          finds the answer for question 4 and if it's the right one adds it to total
         */
        RadioButton q4RadioButton = findViewById(R.id.answer_three_question_four_culture_quiz);
        Boolean q4 = q4RadioButton.isChecked();

        if (q4) {
            total++;
        }

        /*
          finds the answer for question 5 and if it's the right one adds it to total
         */
        CheckBox q5aRadioButton = findViewById(R.id.answer_one_question_five_culture_quiz);
        Boolean q5a = q5aRadioButton.isChecked();

        CheckBox q5bRadioButton = findViewById(R.id.answer_two_question_five_culture_quiz);
        Boolean q5b = q5bRadioButton.isChecked();

        if (q5a && q5b) {
            total++;
        }

        /*
          finds the answer for question 6 and if it's the right one adds it to total
         */
        RadioButton q6RadioButton = findViewById(R.id.answer_two_question_six_culture_quiz);
        Boolean q6 = q6RadioButton.isChecked();

        if (q6) {
            total++;
        }

        /*
          finds the answer for question 7 and if it's the right one adds it to total
         */
        EditText q7EditText = findViewById(R.id.answer_question_seven_sports_quiz);
        String q7 = q7EditText.getText().toString();

        if (q7.equals("Acrophobia")) {
            total++;
        }

        /*
          finds the answer for question 8 and if it's the right one adds it to total
         */
        CheckBox q8aRadioButton = findViewById(R.id.answer_one_question_eight_culture_quiz);
        Boolean q8a = q8aRadioButton.isChecked();

        CheckBox q8bRadioButton = findViewById(R.id.answer_two_question_eight_culture_quiz);
        Boolean q8b = q8bRadioButton.isChecked();

        CheckBox q8cRadioButton = findViewById(R.id.answer_three_question_eight_culture_quiz);
        Boolean q8c = q8cRadioButton.isChecked();

        if (q8a && q8b && q8c) {
            total++;
        }

        /*
          finds the answer for question 9 and if it's the right one adds it to total
         */
        EditText q9EditText = findViewById(R.id.answer_question_nine_culture_quiz);
        String q9 = q9EditText.getText().toString();

        if (q9.equals("Evaporation")) {
            total++;
        }


        /*
          finds the answer for question 10 and if it's the right one adds it to total
         */
        RadioButton q10RadioButton = findViewById(R.id.answer_three_question_ten_culture_quiz);
        Boolean q10 = q10RadioButton.isChecked();

        if (q10) {
            total++;
        }

        return total;
    }

    /**
     * it opens the pop up to see the results
     */
    public void seeAnswerSportsQuiz(View v) {
        Button b = findViewById(R.id.culture_button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Culture_Quiz.this, Pop_Culture.class));
            }
        });

        /*
            passes the data to the view I need: pop fashion
         */
        Intent passDataCultureQuiz = new Intent(Culture_Quiz.this, Pop_Culture.class);
        passDataCultureQuiz.putExtra("answer", checkAnswers());
        startActivity(passDataCultureQuiz);
    }
    
}
