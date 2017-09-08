package com.kikebmx.contactos;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainContactos extends AppCompatActivity {
 Button btnAce;
 ListView lsv;
 Contacto contacto;
 ArrayList<String> lista = new ArrayList<String>();
 ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_contactos);
        btnAce = (Button) findViewById(R.id.btnAgregar);

        btnAce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(getApplication(),Datos.class);
                startActivityForResult(inten,1000);
                Toast.makeText(getApplication(),"AGREGAR CONTACTO", Toast.LENGTH_LONG).show();

            }
        });

    }

     @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode==RESULT_OK)
        {
            try {
                contacto = (Contacto) data.getSerializableExtra("contact");
                String datosContact = "Nombre:"+contacto.getUsuario()+"\nEmail:"+contacto.getEmail();
                lista.add(datosContact);
                adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista);
                lsv = (ListView) findViewById(R.id.lsvContactos);
                lsv.setAdapter(adapter);
                adapter.notifyDataSetChanged();

            }catch (Exception err){
                Toast.makeText(getApplicationContext(), err.getMessage(), Toast.LENGTH_LONG).show();
            }

        }
    }



}
