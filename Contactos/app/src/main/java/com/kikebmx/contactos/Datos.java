package com.kikebmx.contactos;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Datos extends AppCompatActivity {
    Button btnSave;
    Contacto contacto;
    EditText usu,ema,twi,tel,fec;
    Intent i;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        btnSave = (Button) findViewById(R.id.btnGuardar);
        usu = (EditText) findViewById(R.id.txtUsuario);
        ema = (EditText) findViewById(R.id.txtEmail);
        twi = (EditText) findViewById(R.id.txtTwitter);
        tel = (EditText) findViewById(R.id.txtTelefono);
        fec = (EditText) findViewById(R.id.txtFechaN);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               contacto = new Contacto(usu.getText().toString(),ema.getText().toString(),twi.getText().toString(),
                        tel.getText().toString(),fec.getText().toString());
                Intent principal = new Intent();
                principal.putExtra("contact", contacto);
                setResult(RESULT_OK, principal);
                Toast.makeText(getApplication(),"CONTACTO GUARDADO", Toast.LENGTH_LONG).show();
                finish();


            }
        });
    }



}
