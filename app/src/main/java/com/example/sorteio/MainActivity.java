package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear (View view) {
        //TextView text1 = findViewById(R.id.resultado_id);
        TextView text1;
        text1 = findViewById(R.id.resultado_id);

        Random random = null;
        random = new Random();

        int x;
        x = random.nextInt(11);

        text1.setText(String.valueOf(x));
    }

}