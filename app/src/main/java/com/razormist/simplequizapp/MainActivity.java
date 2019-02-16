package com.razormist.simplequizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton btn_one, btn_two;
    Button bt;

    TextView tv_question , res;

    private Question question = new Question();
    private RadioGroup mRadioGroup;

    public static int P;
    public static int D;
   // private String answer;
    private String prgg;
    private String dess;



    private int questionLength = question.questions.length;

    int x=0;

   // Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // random = new Random();

        mRadioGroup = (RadioGroup) findViewById(R.id.radioGroup2);

        btn_one = (RadioButton)findViewById(R.id.btn_one);
       // btn_one.setOnClickListener(this);
        btn_two = (RadioButton)findViewById(R.id.btn_two);
      //  btn_two.setOnClickListener(this);


        bt = (Button)findViewById(R.id.but1);
        bt.setOnClickListener(this);

        tv_question = (TextView)findViewById(R.id.tv_question);
        res = (TextView)findViewById(R.id.ress);


        NextQuestion(x);

    }



    @Override

    public void onClick(View v) {


        if (btn_one.isChecked() && tv_question.getText() == prgg) {
            P++;
            ++x;
            NextQuestion(x);

        }
        else if (btn_one.isChecked()  && tv_question.getText() == dess) {
            D++;
            ++x;
            NextQuestion(x);
        }

        else if(btn_two.isChecked()) {
            ++x;
            NextQuestion(x);

        }
        else if(!btn_one.isChecked() || !btn_two.isChecked()){

            Toast.makeText(MainActivity.this, "Please Select .... ", Toast.LENGTH_SHORT).show();
        }



        mRadioGroup.clearCheck();
    }




     private void NextQuestion(int num){

        tv_question.setText(question.getQuestion(num));
        btn_one.setText(question.getchoice(num));
        btn_two.setText(question.getchoice2(num));


       // answer = question.getCorrectAnswer(num);
        prgg=question.prg(num);
        dess=question.des(num);

    }

    public void resultt(View view) {
        if (P > D ) {
            res.setText("You are good with Programming");
        }
        else {
            res.setText("You are good with design");

        }
    }
}
