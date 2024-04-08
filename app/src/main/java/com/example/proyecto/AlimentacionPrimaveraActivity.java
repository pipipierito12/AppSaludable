package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AlimentacionPrimaveraActivity extends AppCompatActivity {

    private EditText editTextQuantityTomate;
    private EditText editTextQuantityPollo;
    private EditText editTextQuantityArroz;
    private EditText editTextQuantityPapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentacion_primavera);

        // Inicializar las referencias a las casillas editables
        editTextQuantityTomate = findViewById(R.id.editTextQuantityTomate);
        editTextQuantityPollo = findViewById(R.id.editTextQuantityPollo);
        editTextQuantityArroz = findViewById(R.id.editTextQuantityArroz);
        editTextQuantityPapa = findViewById(R.id.editTextQuantityPapa);

        // Botón "Actualizar"
        Button btnActualizar = findViewById(R.id.button4);
        btnActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Verificar si se ha ingresado un número en al menos una de las casillas editables
                if (hasNumberInput()) {
                    showToast("Alimentos actualizados");
                    // Crear un Intent para regresar al menú
                    Intent intent = new Intent(AlimentacionPrimaveraActivity.this, MenuActivity.class);
                    // Iniciar la actividad del menú
                    startActivity(intent);
                    // Cerrar la actividad actual (opcional, depende de lo que necesites)
                    finish();
                } else {
                    showToast("No se actualizó nada");
                }
            }
        });
    }

    // Método para verificar si se ha ingresado un número en alguna de las casillas editables
    private boolean hasNumberInput() {
        return isNumeric(editTextQuantityTomate.getText().toString()) ||
                isNumeric(editTextQuantityPollo.getText().toString()) ||
                isNumeric(editTextQuantityArroz.getText().toString()) ||
                isNumeric(editTextQuantityPapa.getText().toString());
    }

    // Método para verificar si una cadena es un número
    private boolean isNumeric(String str) {
        if (TextUtils.isEmpty(str)) return false;
        return TextUtils.isDigitsOnly(str);
    }

    // Método para mostrar un Toast con el mensaje especificado
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
