package e.vivek.paythepiper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int x=0;

    public void generate(View view) {
        Random rand = new Random();
        int number = rand.nextInt(100)+1;
        TextView myText = (TextView)findViewById(R.id.textView);
        String myString = String.valueOf(number);
        myText.setText(myString);

    }

    public void add1(View view) {
        x++;
        TextView a = (TextView)findViewById(R.id.amt);
        String b = String.valueOf(x);
        a.setText(b);
    }
    public void add2(View view) {
        x = x + 2;
        TextView a = (TextView)findViewById(R.id.amt);
        String b = String.valueOf(x);
        a.setText(b);
    }

    public void add5(View view) {
        x = x + 5;
        TextView a = (TextView)findViewById(R.id.amt);
        String b = String.valueOf(x);
        a.setText(b);
    }

    public void add10(View view) {
        x = x + 10;
        TextView a = (TextView)findViewById(R.id.amt);
        String b = String.valueOf(x);
        a.setText(b);
    }

    public void reset(View view) {
            x = 0;
            TextView a = (TextView)findViewById(R.id.textView);
            String b = "Generate A Number";
            a.setText(b);
            TextView c = (TextView)findViewById(R.id.amt);
            String d = "Amount Paid";
            c.setText(d);
    }
}
