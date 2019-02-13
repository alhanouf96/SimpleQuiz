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

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton btn_one, btn_two;
    Button bt;

    TextView tv_question , res;

    private Question question = new Question();


    public static int P;
    public static int D;
    private String answer;
    private String prgg;
    private String dess;



    private int questionLength = question.questions.length;


    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();



        btn_one = (RadioButton)findViewById(R.id.btn_one);
        btn_one.setOnClickListener(this);
        btn_two = (RadioButton)findViewById(R.id.btn_two);
        btn_two.setOnClickListener(this);


        bt = (Button)findViewById(R.id.but1);
      //  bt.setOnClickListener(this);

        tv_question = (TextView)findViewById(R.id.tv_question);
        res = (TextView)findViewById(R.id.ress);

            NextQuestion(random.nextInt(questionLength));

    }



    @Override

    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_one:
                if(btn_one.getText()== answer && tv_question.getText() == prgg) {
                   P++ ;
                    NextQuestion(random.nextInt(questionLength)); }

                else if (btn_one.getText()==answer && tv_question.getText() == dess) {
                    D++;
                NextQuestion(random.nextInt(questionLength));}

                else {
                    NextQuestion(random.nextInt(questionLength));
                }
            break;

            case R.id.btn_two:
                 if(btn_two.getText()==answer && tv_question.getText() == prgg) {
                    P++;
                    NextQuestion(random.nextInt(questionLength));}

                else if (btn_two.getText()==answer && tv_question.getText() == dess){
                    D++;
                    NextQuestion(random.nextInt(questionLength));

                }
                else  {

                    NextQuestion(random.nextInt(questionLength));

                }


                break;

        }}




     private void NextQuestion(int num){

        tv_question.setText(question.getQuestion(num));
        btn_one.setText(question.getchoice(num));
        btn_two.setText(question.getchoice2(num));


        answer = question.getCorrectAnswer(num);
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
