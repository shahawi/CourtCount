package com.example.courtcount;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView apple;
    TextView orange;
    int scorea = 0;
    int scoreb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        apple = (TextView) findViewById(R.id.dispa);
        orange = (TextView) findViewById(R.id.dispb);
        apple.setText(Integer.toString(scorea));
        orange.setText(Integer.toString(scoreb));
        disp(null);
    }


    public void add3a(View v) {
       if(scorea < 30 && scoreb < 30) {
            scorea = scorea + 3;
            apple.setText(Integer.toString(scorea));
            disp(null);
        }
        else {
           return;
       }
       }


    public void add2a(View v) {
        if(scorea < 30 && scoreb < 30) {
            scorea = scorea + 2;
            apple.setText(Integer.toString(scorea));
            disp(null);
        }
    }

    public void add1a(View v) {
        if(scorea < 30 && scoreb < 30) {
            scorea = scorea + 1;
            apple.setText(Integer.toString(scorea));
            disp(null);
        }
    }

    public void add3b(View v) {
        if(scorea < 30 && scoreb < 30) {
            scoreb = scoreb + 3;
            orange.setText(Integer.toString(scoreb));
            disp(null);
        }
    }

    public void add2b(View v) {
        if(scorea < 30 && scoreb < 30) {
            scoreb = scoreb + 2;
            orange.setText(Integer.toString(scoreb));
            disp(null);
        }
    }

    public void add1b(View v) {
        if(scorea < 30 && scoreb < 30) {
            scoreb = scoreb + 1;
            orange.setText(Integer.toString(scoreb));
            disp(null);
        }
    }
public void reset(View v)
{
    scorea=0;
    scoreb=0;
    apple.setText(Integer.toString(scorea));
    orange.setText(Integer.toString(scoreb));
    disp(null);
}
    public void disp(View v) {
        TextView disp = (TextView) findViewById(R.id.disp);
        if ((scorea >= 30) || (scoreb >= 30)) {

            if (scorea > scoreb) {
                disp.setText("Team a wins");
            } else {
                disp.setText("Team b wins");
            }
        }
            else
            {
                disp.setText("");
            }
        }
    }


