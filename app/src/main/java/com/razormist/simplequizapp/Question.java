package com.razormist.simplequizapp;

/**
 * Created by Arvin on 2/21/2018.
 */

public class Question {

    public String questions[] = {
            "ھل تستمتع بلعب الشطرنج أو الألعاب الأخرى لحل المشكلات؟",
            "ھل لدیك القدرة على استنتاج ابسط الطرق لحل المشكلات",
            "ھل لدیك معرفة واسعة بالخوارزمیات",
            "ھل انت شخص یجید التفكیر بالطرق الجدیده والغیر معتاده لفعل الامور؟",
            "ھل تمیل للتفكیر العمیق في أفكارك ومشاعرك وسلوكك ؟",
            "ھل انت منظم بشكل جید ومتحكم بالأمور ؟"

    };

    public String choices[][] = {
            {"yes", "no"},
            {"yes", "no"},
            {"yes", "no"},
            {"yes", "no"},
            {"yes", "no"},
            {"yes", "no"},
    };

    public String correctAnswer[] = {
        "yes",
        "yes",
        "yes",
        "yes",
        "yes",
        "yes"
    };

    public String prg[] ={questions[0], questions[1],questions[2],questions[0],questions[1],questions[2]};
    public String des[] ={questions[3], questions[4],questions[5],questions[3], questions[4],questions[5]};


    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }



    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }

    public String prg(int a){
        String pp=prg[a];
        return pp;
    }

    public String des(int a){
        String dd=des[a];
        return dd;
    }



}
