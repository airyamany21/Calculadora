package com.example.mycalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Variables para poder realizar las operaciones de la calculadora
    EditText numero1;
    EditText numero2;
    Button sumar;
    Button restar;
    Button multiplicar;
    Button dividir;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // las varibles creadas se tienen que asociar con el id
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        sumar = findViewById(R.id.sumar);
        restar = findViewById(R.id.restar);
        multiplicar = findViewById(R.id.multiplicar);
        dividir = findViewById(R.id.dividir);
        resultado = findViewById(R.id.resultado);

        // para cuando se presione los botones
        sumar.setOnClickListener(this);
        restar.setOnClickListener(this);
        multiplicar.setOnClickListener(this);
        dividir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        // obtiene el texto ingresado del editext
        String num1 = numero1.getText().toString();
        String num2 = numero2.getText().toString();

        //int entero1 = Integer.parseInt(num1);
        //int entero2 = Integer.parseInt(num2);

        // convierte el dato a double
        Double entero1 = Double.parseDouble(num1);
        Double entero2 = Double.parseDouble(num2);
        double result = 0;

        switch (v.getId()) {

            case R.id.sumar:
                result=entero1+entero2;
                break;
            case R.id.restar:
                result=entero1-entero2;
                break;
            case R.id.multiplicar:
                result=entero1*entero2;
                break;
            case R.id.dividir:
                result=entero1/entero2;
                break;
        }

        resultado.setText(""+result);
    }
}
