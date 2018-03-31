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

public class Sports_Quiz extends Activity {

    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sports_quiz);
    }

    private int checkAnswers() {
        /*
          finds the answer for question 1 and if it's the right one adds it to total
         */
        RadioButton q1RadioButton = findViewById(R.id.answer_three_question_one_sports_quiz);
        Boolean q1 = q1RadioButton.isChecked();

        if (q1) {
            total++;
        }

        /*
          finds the answer for question 2 and if it's the right one adds it to total
         */
        EditText q2EditText = findViewById(R.id.answer_question_two_sports_quiz);
        String q2 = q2EditText.getText().toString();

        if (q2.equals("James Douglas") || q2.equals("Douglas") || q2.equals("J.Douglas") || q2.equals("J. Douglas")) {
            total++;
        }


        /*
          finds the answer for question 3 and if it's the right one adds it to total
         */
        RadioButton q3RadioButton = findViewById(R.id.answer_one_question_three_sports_quiz);
        Boolean q3 = q3RadioButton.isChecked();

        if (q3) {
            total++;
        }

        /*
          finds the answer for question 4 and if it's the right one adds it to total
         */
        EditText q4EditText = findViewById(R.id.answer_question_four_sports_quiz);
        String q4 = q4EditText.getText().toString();

        if (q4.equals("34") || q4.equals("Thirty Four")) {
            total++;
        }

        /*
          finds the answer for question 5 and if it's the right one adds it to total
         */
        CheckBox q5aRadioButton = findViewById(R.id.answer_one_question_five_sports_quiz);
        Boolean q5a = q5aRadioButton.isChecked();

        CheckBox q5bRadioButton = findViewById(R.id.answer_two_question_five_sports_quiz);
        Boolean q5b = q5bRadioButton.isChecked();

        if (q5a && q5b ) {
            total++;
        }

        /*
          finds the answer for question 6 and if it's the right one adds it to total
         */
        RadioButton q6RadioButton = findViewById(R.id.answer_one_question_six_sports_quiz);
        Boolean q6 = q6RadioButton.isChecked();

        if (q6) {
            total++;
        }

        /*
          finds the answer for question 7 and if it's the right one adds it to total
         */
        EditText q7EditText = findViewById(R.id.answer_question_seven_sports_quiz);
        String q7 = q7EditText.getText().toString();

        if (q7.equals("22") || q7.equals("Twenty Two")) {
            total++;
        }

        /*
          finds the answer for question 8 and if it's the right one adds it to total
         */
        CheckBox q8aRadioButton = findViewById(R.id.answer_one_question_eight_sports_quiz);
        Boolean q8a = q8aRadioButton.isChecked();

        CheckBox q8cRadioButton = findViewById(R.id.answer_three_question_eight_sports_quiz);
        Boolean q8c = q8cRadioButton.isChecked();

        if (q8a && q8c) {
            total++;
        }

        /*
          finds the answer for question 9 and if it's the right one adds it to total
         */
        EditText q9EditText = findViewById(R.id.answer_question_nine_sports_quiz);
        String q9 = q9EditText.getText().toString();

        if (q9.equals("11") || q9.equals("November")) {
            total++;
        }

        /*
          finds the answer for question 10 and if it's the right one adds it to total
         */
        CheckBox q10aRadioButton = findViewById(R.id.answer_one_question_ten_sports_quiz);
        Boolean q10a = q10aRadioButton.isChecked();

        CheckBox q10bRadioButton = findViewById(R.id.answer_two_question_ten_sports_quiz);
        Boolean q10b = q10bRadioButton.isChecked();

        CheckBox q10cRadioButton = findViewById(R.id.answer_three_question_ten_sports_quiz);
        Boolean q10c = q10cRadioButton.isChecked();

        if (q10a && q10b && q10c) {
            total++;
        }
        return total;
    }

    /**
     * it opens the pop up to see the results
     */
    public void seeAnswerSportsQuiz(View v) {
        Button b = findViewById(R.id.sports_button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Sports_Quiz.this, Pop_Sports.class));
            }
        });

        /*
            passes the data to the view I need: pop fashion
         */
        Intent passDataSportsQuiz = new Intent(Sports_Quiz.this, Pop_Sports.class);
        passDataSportsQuiz.putExtra("answer", checkAnswers());
        startActivity(passDataSportsQuiz);
    }
}
