package com.example.controldeasistencia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class recuperar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar);

        Button bRecuperara=(Button) findViewById(R.id.bRecuperarCorreo);
        Button bRegistrar=(Button) findViewById(R.id.bRegistrarRecu);
        OnClickListener recuperar= new OnClickListener(this,login.class);
        OnClickListener registrar= new OnClickListener(this, register.class);
        bRecuperara.setOnClickListener(recuperar);
        bRegistrar.setOnClickListener(registrar);

    }
}
