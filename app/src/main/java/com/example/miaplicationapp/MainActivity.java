package com.example.miaplicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewFlipper vf;
    private int[] images = {R.drawable.a, R.drawable.b, R.drawable.c};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vf = (ViewFlipper)findViewById(R.id.slider);

        for(int i = 0; i <images.length; i++)
        {
            flip_image(images[i]);
        }
    }

    public void flip_image(int i)
    {
        //vamos a dar la configuracion al Slider
        ImageView view = new ImageView(this);
        view.setBackgroundResource(i);

        vf.addView(view); //añadimos las imagenes al ViewFlipper
        vf.setFlipInterval(2800);//su desplasamiento seria de 2300 mili
        vf.setAutoStart(true);// iniciar de forma automatica

        //sentido al slider
        vf.setInAnimation(this, android.R.anim.slide_in_left);
        vf.setOutAnimation(this, android.R.anim.slide_out_right);
      }

      public void Maps(View v)
      {
          Intent i = new Intent(this,Maps_act.class);
          startActivity(i);
      }

      public void Info(View v)
      {
          Intent i = new Intent(this, Info_act.class);
          startActivity(i);
      }

      public void Clientes(View v)
      {

          ArrayList<String> clientes = new ArrayList<String>();
          ArrayList<String> planes = new ArrayList<String>();
          clientes.add("Roberto");
          clientes.add("Ivan");
          clientes.add("Felipe");
          planes.add("extrem");
          planes.add("mindfullness");
          planes.add("basico");


          Intent i = new Intent(this, Clientes_act.class);
          i.putExtra("listaClientes", clientes);
          i.putExtra("listaPlanes", planes);
          startActivity(i);
      }



}