package com.example.numbergenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.numberTextView);
        final SeekBar seekBar = findViewById(R.id.seekBar2);

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int a=rand.nextInt(seekBar.getProgress())+1;
                textView.setText(Integer.toString(a));
            }
        }

        );

    }

}
