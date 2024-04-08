package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        // Obtener referencia al botón "Volver al menú"
        Button buttonVolverMenu = findViewById(R.id.buttonVolver);

        // Configurar OnClickListener para el botón "Volver al menú"
        buttonVolverMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para abrir la actividad del menú
                Intent intent = new Intent(PerfilActivity.this, MenuActivity.class);
                startActivity(intent);
                // Finalizar la actividad actual
                finish();
            }
        });
    }
}
