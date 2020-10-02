package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    private TextView myAnswerView;
    private Button btnTrue;
    private Button falseBtn;

    private int myQuestionIndex;
    private int myQuizQuestion;

    private QuizModel[] questionCollection = new QuizModel[] {
            new QuizModel(R.string.q1, true),
            new QuizModel(R.string.q2, false),
            new QuizModel(R.string.q3, true),
            new QuizModel(R.string.q4, true),
            new QuizModel(R.string.q5, false),
            new QuizModel(R.string.q6, true),
            new QuizModel(R.string.q7, true),
            new QuizModel(R.string.q8, true),
            new QuizModel(R.string.q9, false),
            new QuizModel(R.string.q10, true),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.topText);
     // Static approach to display question
        QuizModel q1 = questionCollection[myQuestionIndex];
        myQuizQuestion = q1.getmQuestion();
        myTextView.setText(myQuizQuestion);

        btnTrue = findViewById(R.id.trueButton);
        falseBtn = findViewById(R.id.falseButton);

        View.OnClickListener myListener = new View.OnClickListener() {
          public void onClick(View view) {
              if (view.getId() == R.id.trueButton) {
                  Log.i("Listener", "True Btn tapped");
                  Toast.makeText(MainActivity.this, "True Btn Tapped!", Toast.LENGTH_SHORT).show();
                  System.out.println(questionCollection.length);
                  System.out.println(myQuestionIndex);
                  changeQuestionOnClick();
              } else if (view.getId() == R.id.falseButton) {
                  Log.i("Listener", "False Btn tapped");
              }
          }
        };

        btnTrue.setOnClickListener(myListener);
        falseBtn.setOnClickListener(myListener);


    // Could also be done like this if only used within this scope.
/*
        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
*/

    }

    private void changeQuestionOnClick() {

        if (myQuestionIndex < questionCollection.length - 1) {
            myQuestionIndex++;
        } else {
            myQuestionIndex = 0;
        }
        myQuizQuestion = questionCollection[myQuestionIndex].getmQuestion();
        myTextView.setText(myQuizQuestion);
    }

}