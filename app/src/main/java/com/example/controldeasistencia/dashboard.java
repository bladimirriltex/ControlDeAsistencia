package com.example.controldeasistencia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;

public class dashboard extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //FALTA IMPLEMENTAR  VIEWS
       /* LinearLayout perfil = findViewById(R.id.perfil_card);
        LinearLayout asistencias = findViewById(R.id.asistencias_card);
        LinearLayout justificaciones = findViewById(R.id.juti_card);

        */
        LinearLayout cursos = findViewById(R.id.cursos_card);
        OnClickListener listaCursos= new OnClickListener( this, cursos.class);
        cursos.setOnClickListener(listaCursos);



    }

}
