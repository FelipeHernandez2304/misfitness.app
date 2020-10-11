package com.example.miaplicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Clientes_act extends AppCompatActivity {

    private Spinner spin1, spin2;
    private TextView text;
    private EditText edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes_act);

        spin1 = (Spinner)findViewById(R.id.spinClientes);
        spin1 = (Spinner)findViewById(R.id.spinPlanes);
        text = (TextView)findViewById(R.id.tv);
        edit1 = (EditText)findViewById(R.id.et1);
    }
}