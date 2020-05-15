package com.example.controldeasistencia;

import android.content.Context;
import android.se.omapi.SEService;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AdapterSesion extends ArrayAdapter<sesionclass> {

    Context context;
    int resource;
    ArrayList<sesionclass> listSesions;
    public AdapterSesion(Context context, int resource, ArrayList<sesionclass> listSesions) {
        super(context, resource, listSesions);
            this.context=context;
            this.resource=resource;
            this.listSesions=listSesions;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView==null){
            convertView =layoutInflater.inflate(R.layout.row_sesiones,parent,false);

        }


        TextView namesesion=convertView.findViewById(R.id.sesion_name);
        TextView sesion_estado=convertView.findViewById(R.id.sesion_estado);
        TextView sesion_fecha=convertView.findViewById(R.id.sesion_fecha);
        TextView sesion_ini=convertView.findViewById(R.id.sesion_ini);
        TextView sesion_fin=convertView.findViewById(R.id.sesion_fin);

        namesesion.setText(listSesions.get(position).getName_Sesiom());
        sesion_estado.setText(listSesions.get(position).getEstado_sesion());
        sesion_fecha.setText(listSesions.get(position).getFecha_sesion());
        sesion_ini.setText(listSesions.get(position).getHorainit_sesion());
        sesion_fin.setText(listSesions.get(position).getHorafin_sesion());

        return convertView;
    }
}
