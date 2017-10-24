package com.example.fibonacci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    int click = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<String> arrayList = new ArrayList<>();
        int f = 0;
        int g = 1;


        for (int i = 1; i <= 40; i++) {
            arrayList.add(Integer.toString(f));

            f = f + g;
            g = f - g;

        }


    tv = (TextView)findViewById(R.id.fibonacciTextView);
    Button nBtn = (Button)findViewById(R.id.nextButton);
    Button rBtn = (Button)findViewById(R.id.resetButton);
    nBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {



            tv.setText(arrayList.get(click));
            click++;


        }


    });

    rBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            click = 1;
            tv.setText("1");

        }
    });
    }
}
