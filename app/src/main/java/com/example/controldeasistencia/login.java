package com.example.controldeasistencia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button bInciar=(Button) findViewById(R.id.bIniciar);
        TextView bRecuperar=(TextView) findViewById(R.id.bRecuperar);
        Button bRegistrar=(Button) findViewById(R.id.bRegistrar);

        OnClickListener dashboard= new OnClickListener(this, dashboard.class);
        OnClickListener recuperar= new OnClickListener(this, recuperar.class);
        OnClickListener register= new OnClickListener(this, register.class);

        bInciar.setOnClickListener(dashboard);
        bRecuperar.setOnClickListener(recuperar);
        bRegistrar.setOnClickListener(register);
    }
}
