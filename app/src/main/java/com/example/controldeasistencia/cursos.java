package com.example.controldeasistencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class cursos extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView mListView;
    private List<modelo> mLista=new ArrayList<>();
    ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);

        mListView=findViewById(R.id.listView);
        mListView.setOnItemClickListener(this);
        mLista.add(new modelo("Android: Modulo 1","Entenderlos conocimientos basicos " +
                "de programacion movil en android: Manifest, Activities, Intents y List view.",R.mipmap.ic_launcher
                ));
        mLista.add(new modelo("Marketing Digital estrategico: Modulo1","Profundizar en temas de " +
                "posicionamiento, desarrollo de web de exito, CRM, e-mail marketing.", R.mipmap.ic_launcher
        ));
        mLista.add(new modelo("Android: Modulo 2","Entenderlos conocimientos basicos " +
                "de programacion movil en android: Manifest, Activities, Intents y List view.",R.mipmap.ic_launcher
        ));
        mAdapter= new ListAdapter(this,R.layout.row_curso,mLista);
        mListView.setAdapter(mAdapter);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent= new Intent(this,sesiones.class);
        intent.putExtra("nombreCurso", mAdapter.getItem(position).getNomCurso());
        startActivity(intent);
    }
}
