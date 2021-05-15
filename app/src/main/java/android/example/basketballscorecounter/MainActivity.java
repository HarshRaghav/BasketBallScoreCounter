package android.example.basketballscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int total1=0;
    int total2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void inc1by1(View view) {
        total1++;
        display1(total1);
    }
    public void inc1by2(View view) {
        total1+=2;
        display1(total1);
    }
    public void inc1by3(View view) {
        total1+=3;
        display1(total1);
    }
    public void inc2by1(View view) {
        total2++;
        display2(total2);
    }
    public void inc2by2(View view) {
        total2+=2;
        display2(total2);
    }
    public void inc2by3(View view) {
        total2+=3;
        display2(total2);
    }

    private void display1(int number) {
        TextView score1TextView = (TextView) findViewById(R.id.score1);
        score1TextView.setText("" + number);
    }
    private void display2(int number) {
        TextView score2TextView = (TextView) findViewById(R.id.score2);
        score2TextView.setText("" + number);
    }
    public void finish(View view){
        if(total1==total2){
            Toast.makeText(this,"Match tied",Toast.LENGTH_SHORT).show();
            TextView score1TextView = (TextView) findViewById(R.id.score1);
            score1TextView.setText("TIE!");
            TextView score2TextView = (TextView) findViewById(R.id.score2);
            score2TextView.setText("TIE!");
        }
        else if(total1<total2){
            Toast.makeText(this,"Team-2 Won",Toast.LENGTH_SHORT).show();
            TextView score1TextView = (TextView) findViewById(R.id.score1);
            score1TextView.setText("LOSE!");
            TextView score2TextView = (TextView) findViewById(R.id.score2);
            score2TextView.setText("WIN!");
        }
        else{
            Toast.makeText(this,"Team-1 Won",Toast.LENGTH_SHORT).show();
            TextView score1TextView = (TextView) findViewById(R.id.score1);
            score1TextView.setText("WIN!");
            TextView score2TextView = (TextView) findViewById(R.id.score2);
            score2TextView.setText("LOSE!");
        }
        total1=0;
        total2=0;
    }

}



