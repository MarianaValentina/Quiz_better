package com.example.marry.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 * Created by Mary on 03/28/2018.
 */

public class Fashion_Quiz extends Activity {

    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fashion_quiz);

    }

    private int checkAnswers() {
        /*
          finds the answer for question 1 and if it's the right one adds it to total
         */
        RadioButton q1RadioButton = findViewById(R.id.answer_one_question_one_fashion_quiz);
        Boolean q1 = q1RadioButton.isChecked();

        if (q1) {
            total++;
        }

        /*
          finds the answer for question 2 and if it's the right one adds it to total
         */
        RadioButton q2RadioButton = findViewById(R.id.answer_three_question_two_fashion_quiz);
        Boolean q2 = q2RadioButton.isChecked();

        if (q2) {
            total++;
        }

        /*
          finds the answer for question 3 and if it's the right one adds it to total
         */
        EditText q3EditText = findViewById(R.id.answer_question_three_fashion_quiz);
        String q3 = q3EditText.getText().toString();

        if (q3.equals("Handbags") || q3.equals("Handbag") || q3.equals("Purse") || q3.equals("Purses")) {
            total++;
        }

        /*
          finds the answer for question 4 and if it's the right one adds it to total
         */
        RadioButton q4RadioButton = findViewById(R.id.answer_two_question_four_fashion_quiz);
        Boolean q4 = q4RadioButton.isChecked();

        if (q4) {
            total++;
        }

        /*
          finds the answer for question 5 and if it's the right one adds it to total
         */
        RadioButton q5RadioButton = findViewById(R.id.answer_two_question_five_fashion_quiz);
        Boolean q5 = q5RadioButton.isChecked();

        if (q5) {
            total++;
        }

        /*
          finds the answer for question 6 and if it's the right one adds it to total
         */
        RadioButton q6RadioButton = findViewById(R.id.answer_one_question_six_fashion_quiz);
        Boolean q6 = q6RadioButton.isChecked();

        if (q6) {
            total++;
        }

        /*
          finds the answer for question 7 and if it's the right one adds it to total
         */
        EditText q7EditText = findViewById(R.id.answer_question_seven_fashion_quiz);
        String q7 = q7EditText.getText().toString();

        if (q7.equals("Milliner") || q7.equals("Milliners")) {
            total++;
        }

        /*
          finds the answer for question 8 and if it's the right one adds it to total
         */
        RadioButton q8RadioButton = findViewById(R.id.answer_one_question_eight_fashion_quiz);
        Boolean q8 = q8RadioButton.isChecked();

        if (q8) {
            total++;
        }

        /*
          finds the answer for question 9 and if it's the right one adds it to total
         */
        RadioButton q9RadioButton = findViewById(R.id.answer_three_question_nine_fashion_quiz);
        Boolean q9 = q9RadioButton.isChecked();

        if (q9) {
            total++;
        }

        /*
          finds the answer for question 10 and if it's the right one adds it to total
         */
        EditText q10EditText = findViewById(R.id.answer_question_ten_fashion_quiz);
        String q10 = q10EditText.getText().toString();

        if (q10.equals("Clothing") || q10.equals("Clothes")) {
            total++;
        }

        return total;
    }

    /**
     * it opens the pop up to see the results
     */
    public void seeAnswerFashionQuiz(View v) {
        Button b = findViewById(R.id.fashion_button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fashion_Quiz.this, Pop_Fashion.class));
            }
        });

        /*
            passes the data to the view I need: pop fashion
         */
        Intent passDataFashionQuiz = new Intent(this, Pop_Fashion.class);
        passDataFashionQuiz.putExtra("answer", checkAnswers());
        startActivity(passDataFashionQuiz);
    }
}
