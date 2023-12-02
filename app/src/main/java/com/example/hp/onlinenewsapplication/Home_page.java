package com.example.hp.onlinenewsapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by HP on 26-08-2022.
 */
public class Home_page extends AppCompatActivity {
    Button ENGLISH;
    Button HINDI;
    Button KANNADA;
    Button SANSKRIT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        ENGLISH = (Button) findViewById(R.id.btn1);
        KANNADA = (Button) findViewById(R.id.btn2);
        HINDI = (Button) findViewById(R.id.btn3);
        SANSKRIT = (Button) findViewById(R.id.btn4);

        ENGLISH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity1();
            }
        });
        KANNADA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity2();
            }
        });
        HINDI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity3();
            }
        });
        SANSKRIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity4();
            }
        });
    }
    private void openInsideActivity4() {
        Intent intent = new Intent(this, News_four.class);
        startActivity(intent);

    }

    private void openInsideActivity3() {
        Intent intent = new Intent(this, News_three.class);
        startActivity(intent);
    }


    private void openInsideActivity2() {
        Intent intent = new Intent(this, News_two.class);
        startActivity(intent);
    }


    private void openInsideActivity1() {
        Intent intent = new Intent(this, News_one.class);
        startActivity(intent);
    }
}

