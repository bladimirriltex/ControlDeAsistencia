package com.example.controldeasistencia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class sesiones extends AppCompatActivity   {

    private ListView listView;
    private ArrayList<sesionclass> listsesiones =new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesiones);

        TextView nomcurso= findViewById(R.id.nomCur);
        nomcurso.setText(getIntent().getStringExtra("nombreCurso"));

        listView=findViewById(R.id.id_sesiones);

        for (int i=1; i< 11 ; i++){

            listsesiones.add(new sesionclass("Sesion "+i, "Finalizada", "15/09/17","14:00","17:00"));
        }
        AdapterSesion adapterSesion=new AdapterSesion(this,R.layout.row_sesiones,listsesiones);
        listView.setAdapter(adapterSesion);




    }




}
