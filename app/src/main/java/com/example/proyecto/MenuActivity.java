package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Configurar OnClickListener para el botón "Generar una nueva receta"
        Button buttonGenerarReceta = findViewById(R.id.buttonContinue);
        buttonGenerarReceta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, OtraActividad.class);
                startActivity(intent);
            }
        });

        // Configurar OnClickListener para el botón "Mi perfil"
        Button buttonMiPerfil = findViewById(R.id.button2);
        buttonMiPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, PerfilActivity.class);
                startActivity(intent);
            }
        });

        // Configurar OnClickListener para el botón de alimentos
        ImageButton buttonAlimentos = findViewById(R.id.buttonAlimentos);
        buttonAlimentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, AlimentosActivity.class);
                startActivity(intent);
            }
        });
        // Configurar OnClickListener para el botón de alimentación en primavera
        ImageButton buttonAlimentacionPrimavera = findViewById(R.id.buttonAlimentacion);
        buttonAlimentacionPrimavera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, AlimentacionPrimaveraActivity.class);
                startActivity(intent);
            }
        });

    }

}
