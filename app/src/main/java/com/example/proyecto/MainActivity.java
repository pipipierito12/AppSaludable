package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencia al EditText
        EditText editTextUsername = findViewById(R.id.editTextUsername);

        // Obtener referencia al botón "Ingresar"
        Button buttonIngresar = findViewById(R.id.button);

        // Configurar OnClickListener para el botón "Ingresar"
        buttonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el texto del EditText
                String username = editTextUsername.getText().toString().trim();

                // Verificar si el campo de texto está vacío
                if (username.isEmpty()) {
                    // Mostrar un mensaje de error o hacer algo cuando el campo está vacío
                    // Por ejemplo, puedes mostrar un Toast
                    Toast.makeText(MainActivity.this, "Por favor ingresa un usuario", Toast.LENGTH_SHORT).show();
                } else {
                    // Si el campo no está vacío, puedes proceder con la acción deseada
                    // Por ejemplo, iniciar la nueva actividad
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
