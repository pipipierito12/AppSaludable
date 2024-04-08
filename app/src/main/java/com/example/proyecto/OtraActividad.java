package com.example.proyecto;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class OtraActividad extends AppCompatActivity {

    private Spinner ingredientSpinner1;
    private Spinner ingredientSpinner2;
    private Spinner ingredientSpinner3;
    private Spinner ingredientSpinner4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra_actividad);

        // Inicializar los Spinners
        ingredientSpinner1 = findViewById(R.id.ingredientSpinner1);
        ingredientSpinner2 = findViewById(R.id.ingredientSpinner2);
        ingredientSpinner3 = findViewById(R.id.ingredientSpinner3);
        ingredientSpinner4 = findViewById(R.id.ingredientSpinner4);
    }

    public void generarReceta(View view) {
        // Obtener los ingredientes seleccionados de los Spinners
        String ingrediente1 = ingredientSpinner1.getSelectedItem().toString();
        String ingrediente2 = ingredientSpinner2.getSelectedItem().toString();
        String ingrediente3 = ingredientSpinner3.getSelectedItem().toString();
        String ingrediente4 = ingredientSpinner4.getSelectedItem().toString();

        // Generar la receta basada en los ingredientes seleccionados
        String recetaGenerada = generarReceta(ingrediente1, ingrediente2, ingrediente3, ingrediente4);

        // Mostrar la receta en un TextView
        TextView textViewReceta = findViewById(R.id.textViewReceta);
        textViewReceta.setText(recetaGenerada);
    }
    private String generarReceta(String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4) {
        // Verificar los ingredientes seleccionados y generar la receta correspondiente
        if ((ingrediente1.equals("Arroz") && ingrediente2.equals("Tomate") && ingrediente3.equals("Azúcar") && ingrediente4.equals("Papa")) ||
                (ingrediente1.equals("Arroz") && ingrediente2.equals("Tomate") && ingrediente3.equals("Papa") && ingrediente4.equals("Azúcar")) ||
                (ingrediente1.equals("Arroz") && ingrediente2.equals("Azúcar") && ingrediente3.equals("Tomate") && ingrediente4.equals("Papa")) ||
                (ingrediente1.equals("Arroz") && ingrediente2.equals("Azúcar") && ingrediente3.equals("Papa") && ingrediente4.equals("Tomate")) ||
                (ingrediente1.equals("Arroz") && ingrediente2.equals("Papa") && ingrediente3.equals("Tomate") && ingrediente4.equals("Azúcar")) ||
                (ingrediente1.equals("Arroz") && ingrediente2.equals("Papa") && ingrediente3.equals("Azúcar") && ingrediente4.equals("Tomate"))) {
            return "Arroz con todos los ingredientes";
        } else if ((ingrediente1.equals("Tomate") && ingrediente2.equals("Azúcar") && ingrediente3.equals("Arroz") && ingrediente4.equals("Papa")) ||
                (ingrediente1.equals("Tomate") && ingrediente2.equals("Azúcar") && ingrediente3.equals("Papa") && ingrediente4.equals("Arroz")) ||
                (ingrediente1.equals("Tomate") && ingrediente2.equals("Arroz") && ingrediente3.equals("Azúcar") && ingrediente4.equals("Papa")) ||
                (ingrediente1.equals("Tomate") && ingrediente2.equals("Arroz") && ingrediente3.equals("Papa") && ingrediente4.equals("Azúcar")) ||
                (ingrediente1.equals("Tomate") && ingrediente2.equals("Papa") && ingrediente3.equals("Azúcar") && ingrediente4.equals("Arroz")) ||
                (ingrediente1.equals("Tomate") && ingrediente2.equals("Papa") && ingrediente3.equals("Arroz") && ingrediente4.equals("Azúcar"))) {
            return "Ensalada de tomate con todos los ingredientes";
        } else {
            return "No se encontró una receta con esos ingredientes.";
        }
    }

}
