package com.kinal.jorgemonterroso.myappaj;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {
    
    private EditText operationsText;

    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button resta;
    private Button suma;
    private Button multi;
    private Button div;
    private Button borrar;
    private Button total;
    private Button potencia;
    private Button raiz;

    String datos;
    String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datos = "";
        operacion = "";

        operationsText = (EditText)findViewById(R.id.operationsText);

        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        div = (Button)findViewById(R.id.div);
        multi = (Button)findViewById(R.id.multi);
        suma = (Button)findViewById(R.id.suma);
        resta = (Button)findViewById(R.id.resta);
        raiz = (Button)findViewById(R.id.raiz);
        total = (Button)findViewById(R.id.total);
        potencia = (Button)findViewById(R.id.potencia);
        borrar = (Button)findViewById(R.id.borrar);

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos = "";
                operationsText.setText("");
                operacion = "";
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += button0.getText().toString();
                operationsText.setText(datos);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += button1.getText().toString();
                operationsText.setText(datos);
            }
        });
            button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += button2.getText().toString();
                operationsText.setText(datos);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += button3.getText().toString();
                operationsText.setText(datos);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += button4.getText().toString();
                operationsText.setText(datos);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += button5.getText().toString();
                operationsText.setText(datos);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += button6.getText().toString();
                operationsText.setText(datos);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += button7.getText().toString();
                operationsText.setText(datos);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += button8.getText().toString();
                operationsText.setText(datos);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += button9.getText().toString();
                operationsText.setText(datos);
            }
        });
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += suma.getText().toString();
                operationsText.setText(datos);
                operacion = "+";
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += resta.getText().toString();
                operationsText.setText(datos);
                operacion = "-";
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += multi.getText().toString();
                operationsText.setText(datos);
                operacion = "*";
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += div.getText().toString();
                operationsText.setText(datos);
                operacion = "/";
            }
        });
        raiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += raiz.getText().toString();
                operationsText.setText(datos);
                operacion = "√";
                operar(datos,operacion);
            }
        });
        potencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos += potencia.getText().toString();
                operationsText.setText(datos);
                operacion = "^";
            }
        });
        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion.length() > 0){
                    operar(datos,operacion);
                }else {
                    datos = "";
                }

            }
        });
    }
    public void operar(String datosT,String operacionT)
    {
        try {
            switch (operacionT){
                case "+":
                    String[] parts = datosT.split("\\+");
                    String part1 = parts[0];
                    String part2 = parts[1];

                    double x = Double.parseDouble(part1);
                    double y = Double.parseDouble(part2);

                    double totalO = x + y;

                    datos = String.valueOf(totalO);

                    operationsText.setText(datos);

                    operacion = "";

                case "-":
                     parts = datosT.split("\\-");
                     part1 = parts[0];
                     part2 = parts[1];

                     x = Double.parseDouble(part1);
                     y = Double.parseDouble(part2);

                     totalO = x - y;

                    datos = String.valueOf(totalO);

                    operationsText.setText(datos);

                    operacion = "";

                case "/":
                     parts = datosT.split("\\/");
                     part1 = parts[0];
                     part2 = parts[1];

                     x = Double.parseDouble(part1);
                     y = Double.parseDouble(part2);

                     totalO = x / y;

                    datos = String.valueOf(totalO);

                    operationsText.setText(datos);

                    operacion = "";

                case "*":
                     parts = datosT.split("\\*");
                     part1 = parts[0];
                     part2 = parts[1];

                     x = Double.parseDouble(part1);
                     y = Double.parseDouble(part2);

                     totalO = x * y;

                    datos = String.valueOf(totalO);

                    operationsText.setText(datos);

                    operacion = "";

                case "√":
                     parts = datosT.split("\\√");
                     part1 = parts[0];

                     x = Double.parseDouble(part1);

                     totalO = Math.sqrt(x);

                    datos = String.valueOf(totalO);

                    operationsText.setText(datos);

                    operacion = "";

                case "^":
                    parts = datosT.split("\\^");
                     part1 = parts[0];
                     part2 = parts[1];

                     x = Double.parseDouble(part1);
                     y = Double.parseDouble(part2);

                     totalO = Math.pow(x, y);

                    datos = String.valueOf(totalO);

                    operationsText.setText(datos);

                    operacion = "";

            }
        }catch (Exception e){
            System.out.println(e.toString());
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
