package com.example.controldeasistencia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        CheckBox checkBox=findViewById(R.id.terminosCondiciones);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarTerminosCondiciones();
            }
        });

        Button button= findViewById(R.id.bRegistra);
        OnClickListener dashboard=new OnClickListener(this, com.example.controldeasistencia.dashboard.class);
        button.setOnClickListener(dashboard);
    }



    public  void  mostrarTerminosCondiciones()
    {
        AlertDialog.Builder sms=new AlertDialog.Builder(register.this);
        sms.setTitle("Terminos y condicionnes");
        sms.setMessage("Todo texto, informacion, datos, graficos, codigo fuente y " +
                "codigo objeto, muestras de audio y video, marcas y logotipos, y " +
                "similares pertenencen al desarrollador de esta aplicacion movil").setPositiveButton("Acepto", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Acepto los teminos y condiciones",Toast.LENGTH_LONG).show();
                CheckBox checkBox=findViewById(R.id.terminosCondiciones);
                checkBox.setChecked(true);

            }
        }).setNegativeButton("Cancelat", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"No Acepto los teminos y condiciones",Toast.LENGTH_LONG).show();
                dialog.dismiss();
                CheckBox checkBox=findViewById(R.id.terminosCondiciones);
                checkBox.setChecked(false);
            }
        }).setCancelable(false).show();

    }
}
