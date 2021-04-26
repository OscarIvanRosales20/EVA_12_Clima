package com.example.eva_12_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Clima_Adaptador
extends ArrayAdapter<Clima> {

    private Context context;
    private  int layout;
    private  Clima[] cCiudades;

    public Clima_Adaptador(@NonNull Context context, int resource, @NonNull Clima[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout = resource;
        this.cCiudades = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
        //SI la fila existe
            convertView = ((Activity) context).getLayoutInflater().inflate(layout, parent, false);
        }

        //Vincula mis objetos creados en memoria con los layaouts
        ImageView imgVwClima;
        TextView  txtVwCiudad, txtVwTemp, txtVwDesc;
        imgVwClima = convertView.findViewById(R.id.imageView);
        txtVwCiudad = convertView.findViewById(R.id.Ciudad);
        txtVwDesc = convertView.findViewById(R.id.Des);
        txtVwTemp =  convertView.findViewById(R.id.Clima);

        //Llenar los widgets con datos (arreglo ciudades)
        imgVwClima.setImageResource(cCiudades[position].getImg());
        txtVwCiudad.setText(cCiudades[position].getCiudad());
        txtVwTemp.setText(cCiudades[position].getTemp() + " °C");
        txtVwDesc.setText(cCiudades[position].getDes());

        //return super.getView(position, convertView, parent);
        return convertView;
    }
}