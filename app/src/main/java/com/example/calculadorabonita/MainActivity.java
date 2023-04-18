package com.example.calculadorabonita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv_numero, tv_1, tv_2, tv_3;

    double operacion;
    double num1;
    double num2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_numero = (TextView) findViewById(R.id.tv_numero);
        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_2 = (TextView) findViewById(R.id.tv_2);
        tv_3 = (TextView) findViewById(R.id.tv_3);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


    }

    public void Seleccion(View view){
        String resultado= tv_numero.getText().toString();
        String campo2 = tv_2.getText().toString();
        if(resultado == "0"){
            resultado = "";
            Toast.makeText(this, "Debes introducir algún número", Toast.LENGTH_SHORT).show();
        }
        switch (view.getId()) {
            case R.id.btn_0:
                tv_numero.setText(resultado + "0");
                if(tv_3.getText().equals("vacio")){
                    tv_1.setText(resultado + "0");
                }else{
                    tv_2.setText(campo2 + "0");
                }

                break;
            case R.id.btn_1:
                tv_numero.setText(resultado + "1");
                if(tv_3.getText().equals("vacio")){
                    tv_1.setText(resultado + "1");
                }else{
                    tv_2.setText(campo2 + "1");
                }

                break;
            case R.id.btn_2:
                tv_numero.setText(resultado + "2");
                if(tv_3.getText().equals("vacio")){
                    tv_1.setText(resultado + "2");
                }else{
                    tv_2.setText(campo2 + "2");
                }
                break;
            case R.id.btn_3:
                tv_numero.setText(resultado + "3");
                if(tv_3.getText().equals("vacio")){
                    tv_1.setText(resultado + "3");
                }else{
                    tv_2.setText(campo2 + "3");
                }
                break;
                case R.id.btn_4:
                tv_numero.setText(resultado + "4");
                    if(tv_3.getText().equals("vacio")){
                        tv_1.setText(resultado + "4");
                    }else{
                        tv_2.setText(campo2 + "4");
                    }
                break;
                case R.id.btn_5:
                tv_numero.setText(resultado + "5");
                    if(tv_3.getText().equals("vacio")){
                        tv_1.setText(resultado + "5");
                    }else{
                        tv_2.setText(campo2 + "5");
                    }
                break;
                case R.id.btn_6:
                tv_numero.setText(resultado + "6");
                    if(tv_3.getText().equals("vacio")){
                        tv_1.setText(resultado + "6");
                    }else{
                        tv_2.setText(campo2 + "6");
                    }
                break;
                case R.id.btn_7:
                tv_numero.setText(resultado + "7");
                    if(tv_3.getText().equals("vacio")){
                        tv_1.setText(resultado + "7");
                    }else{
                        tv_2.setText(campo2 + "7");
                    }
                break;
            case R.id.btn_8:
                tv_numero.setText(resultado + "8");
                if(tv_3.getText().equals("vacio")){
                    tv_1.setText(resultado + "8");
                }else{
                    tv_2.setText(campo2 + "8");
                }
                break;
            case R.id.btn_9:
                tv_numero.setText(resultado + "9");
                if(tv_3.getText().equals("vacio")){
                    tv_1.setText(resultado + "9");
                }else{
                    tv_2.setText(campo2 + "9");
                }
                break;
            case R.id.btn_sumar:
                tv_numero.setText(resultado + "+");
                tv_3.setText("+");

                break;
            case R.id.btn_restar:
                tv_numero.setText(resultado + "-");
                tv_3.setText("-");

                break;
            case R.id.btn_multiplicar:
                tv_numero.setText(resultado + "*");
                tv_3.setText("*");

                break;
            case R.id.btn_dividir:
                tv_numero.setText(resultado + "/");
                tv_3.setText("/");
                break;

          }

        }
        public void resultado(View view){
        if(tv_3.getText().equals("+")) {
            String tv_1_String = tv_1.getText().toString();
            String tv_2_String = tv_2.getText().toString();

            int tv_1_int = Integer.parseInt(tv_1_String);
            int tv_2_int = Integer.parseInt(tv_2_String);

            int numero_int = tv_1_int + tv_2_int;
            tv_numero.setText("=" + numero_int);
        }
            if(tv_3.getText().equals("-")) {
                String tv_1_String = tv_1.getText().toString();
                String tv_2_String = tv_2.getText().toString();

                int tv_1_int = Integer.parseInt(tv_1_String);
                int tv_2_int = Integer.parseInt(tv_2_String);

                int numero_int = tv_1_int - tv_2_int;
                tv_numero.setText("=" + numero_int);
            }
            if(tv_3.getText().equals("*")) {
                String tv_1_String = tv_1.getText().toString();
                String tv_2_String = tv_2.getText().toString();

                int tv_1_int = Integer.parseInt(tv_1_String);
                int tv_2_int = Integer.parseInt(tv_2_String);


                int numero_int = tv_1_int * tv_2_int;
                tv_numero.setText("=" + numero_int);
            }
            if(tv_3.getText().equals("/")) {
                String tv_1_String = tv_1.getText().toString();
                String tv_2_String = tv_2.getText().toString();

                int tv_1_int = Integer.parseInt(tv_1_String);
                int tv_2_int = Integer.parseInt(tv_2_String);
                if (tv_2_int != 0) {
                    int numero_int = tv_1_int / tv_2_int;
                    tv_numero.setText("=" + numero_int);

                } else {
                    Toast.makeText(this, "No se puede introducir el 0", Toast.LENGTH_SHORT).show();
                }

            }
    }
    public void Restaurar(View view){
        tv_numero.setText("");
        tv_1.setText("");
        tv_2.setText("");
        tv_3.setText("vacio");

    }
}