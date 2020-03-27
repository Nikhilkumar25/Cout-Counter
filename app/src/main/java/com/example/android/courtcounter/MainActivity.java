package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int A = 0;
    int B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
    }

    public void reset(View view){
        A=0;
        B=0;
        displayA (A);
        displayB (B);
        Result (" ");
    }
    public void A3(View view){
        A = A+3;
        displayA (A);
    }
    public void A2(View view){
        A = A +2;
        displayA (A);
    }
    public void A1(View view){
        A= A+1;
        displayA (A);
    }
    public void A01(View view){
        A= A-1;
        displayA (A);
    }
    public void A02(View view){
        A= A-2;
        displayA (A);
    }
    public void B3(View view){
        B= B+3;
        displayB (B);
    }
    public void B2(View view){
        B= B+2;
        displayB (B);
    }
    public void B1(View view){
        B=B+1;
        displayB (B);
    }
    public void B01(View view){
        B= B-1;
        displayB (B);
    }
    public void B02(View view){
        B= B-2;
        displayB (B);

    }
    public void result(View view){
        if(A>B){ Result ("Team A Won");}else{if(B>A){Result ("Team B Won");}else {Result ("Match Draw");}}
    }





    private void displayA(int number){
        TextView scoreAtextview = findViewById (R.id.textView_scoreA);
        scoreAtextview.setText (""+number);

    }
    private void displayB(int number){
        TextView scoreBtextview = findViewById (R.id.textView_scoreB);
        scoreBtextview.setText (""+number);
    }
    private void Result(String string){
        TextView Resulttextview = findViewById (R.id.textView_result);
        Resulttextview.setText (""+string);
    }



}
