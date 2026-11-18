package com.issa.mispromedios;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText Et1;
    EditText Et2;
    EditText Et3;
    EditText Et4;
    EditText Et5;
    EditText Et6;
    EditText Et7;
    EditText Et8;
    TextView Tv2;
    Button btncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.Et1 = (EditText) findViewById(R.id.et1);
        this.Et2 = (EditText) findViewById(R.id.et2);
        this.Et3 = (EditText) findViewById(R.id.et3);
        this.Et4 = (EditText) findViewById(R.id.et4);
        this.Et5 = (EditText) findViewById(R.id.et5);
        this.Et6 = (EditText) findViewById(R.id.et6);
        this.Et7 = (EditText) findViewById(R.id.et7);
        this.Et8 = (EditText) findViewById(R.id.et8);
        this.Tv2 = (TextView) findViewById(R.id.tv2);
    }

    public void mostrarResultado(View v) {
        double numero1 = Double.parseDouble(this.Et1.getText().toString());
        double numero2 = Double.parseDouble(this.Et2.getText().toString());
        double numero3 = Double.parseDouble(this.Et3.getText().toString());
        double numero4 = Double.parseDouble(this.Et4.getText().toString());
        double numero5 = Double.parseDouble(this.Et5.getText().toString());
        double numero6 = Double.parseDouble(this.Et6.getText().toString());
        double numero7 = Double.parseDouble(this.Et7.getText().toString());
        double numero8 = Double.parseDouble(this.Et8.getText().toString());
        double pond1 = (numero5 / 100.0d) * numero1;
        double pond2 = (numero6 / 100.0d) * numero2;
        double pond3 = (numero7 / 100.0d) * numero3;
        double pond4 = (numero8 / 100.0d) * numero4;
        double numero12 = pond1 + pond2 + pond3 + pond4;
        if (numero12 >= 40.0d) {
            this.Tv2.setText("Felicidades, aprobaste con " + numero12);
        } else {
            this.Tv2.setText("Lo sentimos, reprobaste con un " + numero12);
        }
    }
}
