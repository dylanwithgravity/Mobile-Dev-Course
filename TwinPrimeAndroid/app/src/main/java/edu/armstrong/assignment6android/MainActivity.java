package edu.armstrong.assignment6android;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText et;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.textView);
        et = (EditText)findViewById(R.id.editText);
        tv.setMovementMethod(new ScrollingMovementMethod());
    }

    public void runTwin(View view) {
        int n = Integer.parseInt(et.getText().toString());
        tv.setText("Twins: ");
        new TwinPrimeTask().execute(n);

    }


    class TwinPrimeTask extends AsyncTask<Integer, Integer, Integer> {



        @Override
        protected void onPreExecute(){
        tv.setText("Twins:");
            tv.setMovementMethod(new ScrollingMovementMethod());

        }

        @Override
        protected Integer doInBackground(Integer...params) {
            TwinPrime tp = new TwinPrime();

            int end = params[0];
            int total = 0;
            for(int i = 1; i <= (end-2);i++) {
                if(tp.isPrime(i) == true && tp.isPrime(i+2) == true){
                    publishProgress(i, i+2);
                    total++;


                }
            }

            return total;
        }

        @Override
        protected void onProgressUpdate(Integer...progess) {

            tv.setText(tv.getText() + "[" + progess[0] + "," + progess[1] +"]");

        }

        @Override
        protected void onPostExecute(Integer result) {
        tv.setText(tv.getText() + " total: " + result);

        }

    }

    class TwinPrime {
        public boolean isPrime(int n) {
            int count = 0;

            for(int i = 1; i <= n; i++) {
                if (n % i == 0)
                    count++;
            }
            if (count == 2)
                return true;
            else
                return false;
        }
    }

}
