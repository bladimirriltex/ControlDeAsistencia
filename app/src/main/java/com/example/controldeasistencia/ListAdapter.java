package com.example.controldeasistencia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter<modelo>{
    private List<modelo> mList;
    private Context mContext;
    private int resourceLayout;
    public ListAdapter(@NonNull Context context, int resource, List<modelo> objects) {
        super(context, resource, objects);
        this.mList=objects;
        this.mContext=context;
        this.resourceLayout=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=convertView;
        if (view==null){
            view= LayoutInflater.from(mContext).inflate(resourceLayout,null);
        }
        modelo modelo= mList.get(position);

        ImageView imgCurso= view.findViewById(R.id.img_curso);
        imgCurso.setImageResource(modelo.getImg());

        TextView nomCurso= view.findViewById(R.id.nom_curso);
        nomCurso.setText(modelo.getNomCurso());

        TextView desCurso= view.findViewById(R.id.des_curso);
        desCurso.setText(modelo.getDesCrurso());
        return view;
    }
}
