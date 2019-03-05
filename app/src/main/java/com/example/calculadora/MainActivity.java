package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double operacion1;
    double operacion2;
    double result;
    boolean inicio;
    String operacion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView pantalla = findViewById((R.id.pantalla));
        final Button btn1 = findViewById(R.id.uno);
        final Button btn2 = findViewById(R.id.dos);
        final Button btn3 = findViewById(R.id.tres);
        final Button btn4 = findViewById(R.id.cuatro);
        final Button btn5 = findViewById(R.id.cinco);
        final Button btn6 = findViewById(R.id.seis);
        final Button btn7 = findViewById(R.id.siete);
        final Button btn8 = findViewById(R.id.ocho);
        final Button btn9 = findViewById(R.id.nueve);
        final Button btn0 = findViewById(R.id.cero);
        final Button btn_igual = findViewById(R.id.igual);
        final Button btn_suma = findViewById(R.id.suma);
        final Button btn_resta = findViewById(R.id.resta);
        final Button btn_multiplicacion = findViewById(R.id.multiplicacion);
        final Button btn_borrar = findViewById(R.id.borrar);
        final Button btn_division = findViewById(R.id.division);
        final Button btn_punto = findViewById(R.id.punto);
        final Button btn_seno = findViewById(R.id.seno);
        final Button btn_coseno = findViewById(R.id.coseno);
        final Button btn_tangente = findViewById(R.id.tangente);
        final Button btn_grad_radia= findViewById(R.id.grados_radianes);

        btn1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                        if(inicio)
                        {
                            pantalla.setText(pantalla.getText().toString() + btn1.getText().toString());
                        }
                        else
                        {
                            pantalla.setText(btn1.getText().toString());
                        }
                                    }
                                });
        btn2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                        if(inicio)
                        {
                            pantalla.setText(pantalla.getText().toString() + btn2.getText().toString());
                        }
                        else
                        {
                            pantalla.setText(btn2.getText().toString());
                        }
                                    }
                                });
        btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v){
                        if(inicio)
                        {
                            pantalla.setText(pantalla.getText().toString() + btn3.getText().toString());
                        }
                        else
                        {
                            pantalla.setText(btn3.getText().toString());
                        }
                        }
                    });
        btn4.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            if(inicio)
                            {
                                pantalla.setText(pantalla.getText().toString() + btn4.getText().toString());
                            }
                            else
                            {
                                pantalla.setText(btn4.getText().toString());
                            }
                        }
                    });
        btn5.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            if(inicio)
                            {
                                pantalla.setText(pantalla.getText().toString() + btn5.getText().toString());
                            }
                            else
                            {
                                pantalla.setText(btn5.getText().toString());
                            }
                        }
                    });
        btn6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(inicio)
                            {
                                pantalla.setText(pantalla.getText().toString() + btn6.getText().toString());
                            }
                            else
                            {
                                pantalla.setText(btn6.getText().toString());
                            }
                        }
                    });
        btn7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(inicio)
                            {
                                pantalla.setText(pantalla.getText().toString() + btn7.getText().toString());
                            }
                            else
                            {
                                pantalla.setText(btn7.getText().toString());
                            }
                        }
                    });
        btn8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(inicio)
                            {
                                pantalla.setText(pantalla.getText().toString() + btn8.getText().toString());
                            }
                            else
                            {
                                pantalla.setText(btn8.getText().toString());
                            }
                        }
                    });
        btn9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(inicio)
                            {
                                pantalla.setText(pantalla.getText().toString() + btn9.getText().toString());
                            }
                            else
                            {
                                pantalla.setText(btn9.getText().toString());
                            }
                        }
                    });
        btn_suma.setOnClickListener(new View.OnClickListener()                    {
                        @Override
                        public void onClick (View v) {
                           if(operacion=="")
                           {
                               operacion1=Double.parseDouble(pantalla.getText().toString());
                               inicio=false;
                               operacion="suma";
                           }
                           else
                           {
                               if (operacion=="suma")
                               {
                                   operacion2=Double.parseDouble(pantalla.getText().toString());
                                   result=operacion1+operacion2;
                                   pantalla.setText(String.valueOf(result));
                                   operacion1=result;
                               }
                           }
                        }
                    });
        btn_resta.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick (View v){
                            result = operacion1 - operacion2;
                            pantalla.setText(String.valueOf(result));
                        }
                    });
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick (View v){
                            if(operacion=="")
                            {
                                operacion1=Double.parseDouble(pantalla.getText().toString());
                                inicio=false;
                                operacion="multi";
                            }
                            else {
                                if (operacion == "multi") {
                                    operacion2 = Double.parseDouble(pantalla.getText().toString());
                                    result = operacion1 * operacion2;
                                    pantalla.setText(String.valueOf(result));
                                    operacion1 = result;
                                }
                            }
                        }
                    });
        btn_division.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick (View v){
                            result = operacion1/operacion2;
                            pantalla.setText(String.valueOf(result));
                        }
                    });
        btn_borrar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick (View v){
                            result = 0;
                            operacion="";
                            operacion1=0;
                            operacion2=0;
                            pantalla.setText(String.valueOf(0));
                            inicio=false;
                        }
                    });
        btn_igual.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick (View v){
                            if(operacion=="suma")
                            {
                                operacion2=Double.parseDouble(pantalla.getText().toString());
                                result=operacion1+Double.parseDouble(pantalla.getText().toString());
                                pantalla.setText(String.valueOf(result));
                                operacion1=result;
                                operacion="";
                            }
                            if (operacion=="multi")
                            {
                                operacion2=Double.parseDouble(pantalla.getText().toString());
                                result=operacion1*Double.parseDouble(pantalla.getText().toString());
                                pantalla.setText(String.valueOf(result));
                                operacion1=result;
                                operacion="";
                            }

                        }
                    });
        btn_punto.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick (View v){
                            pantalla.setText((String.valueOf(result)));
                        }
                    });
    }
}
