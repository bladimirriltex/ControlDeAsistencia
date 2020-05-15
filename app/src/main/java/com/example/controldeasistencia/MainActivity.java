package com.example.controldeasistencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {


    private final int DURACION_SPLASH = 2000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable(){
            public void run(){

                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
}
