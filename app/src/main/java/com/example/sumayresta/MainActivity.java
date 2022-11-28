package com.example.sumayresta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numero1;
    EditText numero2;
    TextView resul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1 = (EditText) findViewById(R.id.Numeros1);
        numero2 = (EditText) findViewById(R.id.Numeros2);
        resul = (TextView) findViewById(R.id.Resul);
    }

    public void suma(View view){
        Log.i("info","Boton Suma Presionado");
        numero1 = findViewById(R.id.Numeros1);
        numero2 = findViewById(R.id.Numeros2);
        String n1 = numero1.getText().toString();
        String n2 = numero2.getText().toString();
        int entero1 = Integer.parseInt(n1);
        int entero2 = Integer.parseInt(n2);
        int resultado = 0;
        resultado = entero1 + entero2;
        resul.setText("" +resultado);
    }

    public void resta(View view){
        Log.i("info","Boton Suma Presionado");
        numero1 = findViewById(R.id.Numeros1);
        numero2 = findViewById(R.id.Numeros2);
        String n1 = numero1.getText().toString();
        String n2 = numero2.getText().toString();
        int entero1 = Integer.parseInt(n1);
        int entero2 = Integer.parseInt(n2);
        int resultado = 0;
        resultado = entero1 - entero2;
        resul.setText("" +resultado);
    }

    public void limpiar (View view){
        numero1.setText("");
        numero2.setText("");
        resul.setText("00");
    }

}