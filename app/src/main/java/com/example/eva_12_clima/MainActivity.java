package com.example.eva_12_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Clima[] aClimaCd  = {
            new Clima(R.drawable.sunny, "Chihuahua", 28, "Despejado con viento"),
            new Clima(R.drawable.atmospher, "Monterry", 15, "Vientos huracanados"),
            new Clima(R.drawable.cloudy, "Juarez", 31, "Nublado con probabilidad de lluvia"),
            new Clima(R.drawable.light_rain, "Delicias", 23.1, "Lluvia ligera"),
            new Clima(R.drawable.rainy, "Casas Grandes", 26, "Lluvioso con tormentas electricas"),
            new Clima(R.drawable.snow, "Cuauhtemoc", -3, "Nieve"),
            new Clima(R.drawable.thunderstorm, "Madera", 23, "Tormentas fuertes"),
            new Clima(R.drawable.tornado, "Guerrero", 17, "Run like hell"),
            new Clima(R.drawable.sunny, "Creel", 12, "A todo dar"),
            new Clima(R.drawable.light_rain, "Ahumada", 5, "pa el cafecito")

            };
    ListView lstVwClima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        lstVwClima = findViewById(R.id.lstVwClima);
        lstVwClima.setAdapter(new Clima_Adaptador(this, R.layout.mi_lista_clima, aClimaCd));
    }
}