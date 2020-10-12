package com.example.miaplicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.Planes;

public class Clientes_act extends AppCompatActivity {

    private Spinner spin1, spin2;
    private TextView text;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes_act);

        spin1 = (Spinner)findViewById(R.id.spinClientes);
        spin1 = (Spinner)findViewById(R.id.spinPlanes);
        text = (TextView)findViewById(R.id.tv);
        edit = (EditText)findViewById(R.id.et1);

        ArrayList<String> listaClientes = (ArrayList<String>) getIntent().getSerializableExtra("listaClientes");
        ArrayList<String> listaPlanes = (ArrayList<String>) getIntent().getSerializableExtra("listaPlanes");
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaClientes);
        ArrayAdapter<String> adapts = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaPlanes);
        spin1.setAdapter(adapt);
        spin2.setAdapter(adapts);

    }

    public void Calcular(View v)
    {
        Planes plan = new Planes();
        String clientes = spin1.getSelectedItem().toString();
        String planes = spin2.getSelectedItem().toString();

        int saldo = Integer.parseInt(edit.getText().toString());
        int xtreme = Integer.parseInt(plan.getXtreme());
        int mind = Integer.parseInt(plan.getMindfullness());
        int resultado = saldo - xtreme;
        int resultadoDos = saldo - mind;

        if(clientes.equals("Roberto") && planes.equals("xtreme"))
        {
            text.setText("El valor xtreme es: " + plan.getXtreme());
        }
        if(clientes.equals("Roberto") && planes.equals("mindfullness"))
        {
            text.setText("El valor mindfullness es: " + plan.getMindfullness());
        }
        if(clientes.equals("Ivan") && planes.equals("xtreme"))
        {
            text.setText("El valor xtreme es: " + plan.getXtreme());
        }
        if(clientes.equals("Ivan") && planes.equals("mindfullness"))
        {
            text.setText("El valor mindfullness es: " + plan.getMindfullness());
        }




    }

}