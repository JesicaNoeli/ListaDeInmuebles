package com.example.listadeinmuebles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class VerFoto extends AppCompatActivity {
    private ImageView fotoGrande;
    private Button cerrar;
    private TextView txtDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_foto);
        cerrar=findViewById(R.id.cerrar);
        fotoGrande=findViewById(R.id.fotoGrande);
        txtDescripcion=findViewById(R.id.textDescripcion);
        Intent x= getIntent();
        Inmueble casa = (Inmueble) x.getSerializableExtra("posicion");
        fotoGrande.setImageResource(casa.getFoto());
        txtDescripcion.setText(casa.getDescripcion());

        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
