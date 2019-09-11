package com.example.listadeinmuebles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Inmueble> lista = new ArrayList<>();
    private ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
       lv = findViewById(R.id.mi_lista);
       lv.setClickable(true);
       lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Intent intent = new Intent(getApplicationContext(),VerFoto.class);
               intent.putExtra("posicion", lista.get(i));
               startActivity(intent);
           }
       });


    }
    public void generarListView(){
        ArrayAdapter<Inmueble> adapter =new ListaInmuebleAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv = findViewById(R.id.mi_lista);
        lv.setAdapter(adapter);
    }

    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.casa1,"Gral Paz 148, Villa Mercedes", 104000, " Casa antigua con galeria, Living comedor de 37 m2 aproximadamente. 3 dormitorios, muy amplios, cocina y comedor diario, , Patio y fondo libre. Todo en muy buen estado de conservacion."));
        lista.add(new Inmueble(R.drawable.casa2,"San Martin 789, San Luis", 134000, "Casa muy luminosa Hall de ingreso, recepción, 4 ambientes (3 dormitorios + sala de estar), cocina, baños (principal y secundario), baulera, patio de uso exclusivo con escalera a altillo. Pisos de madera de pinotea, techos altos, aberturas de madera"));
        lista.add(new Inmueble(R.drawable.casa3,"Buenos Aires 23, Justo Daract", 95000, "Tiene amplio living comedor, 3 habitación con baño, cocina y 2 pieza en el fondo con baño y 2 terrazas con una pieza de servicio y 2 patrios, uno con lavadero y churrasquera"));
    }


    }

