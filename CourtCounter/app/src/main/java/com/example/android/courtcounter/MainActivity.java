package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreA=0;
int scoreB=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*code for functionality of buttons*/
    /*ab1=button1(+3 points) of team-A*/
    public void ab1(View view)
    {
        scoreA=scoreA+3;
        display(scoreA);
    }
    /*ab2=button2(+2 points) of team-A*/
    public void ab2(View view)
    {
        scoreA=scoreA+2;
        display(scoreA);
    }
    /*ab3=button3(free throw) of team-A*/
    public void ab3(View view)
    {
        scoreA=scoreA+1;
        display(scoreA);
    }
    /*bb1=button1(+3 points) of team-B*/
    public void bb1(View view)
    {
        scoreB=scoreB+3;
        display1(scoreB);
    }
    /*bb2=button2(+2 points) of team-B*/
    public void bb2(View view)
    {
        scoreB=scoreB+2;
        display1(scoreB);
    }
    /*bb3=button3(free throw) of team-B*/
    public void bb3(View view)
    {
        scoreB=scoreB+1;
        display1(scoreB);
    }
    /*this method is called when reset button is clicked*/
    public void reset(View view)
    {
        scoreA=0;
        scoreB=0;
        display(scoreA);
        display1(scoreB);
    }
    /*this method is to display the score in team-A score field*/
    public void display(int number)
    {
        TextView textView=(TextView)findViewById(R.id.text_view_A);
        textView.setText(""+number);}
    /*this method is to display the score in team-A score field*/
    public void display1(int number)
        {
            TextView textView1=(TextView)findViewById(R.id.text_view_B);
            textView1.setText(""+number);
        }
}

