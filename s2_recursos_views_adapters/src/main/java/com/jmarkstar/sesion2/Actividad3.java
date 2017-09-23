package com.jmarkstar.sesion2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Actividad3 extends AppCompatActivity {

    private EditText mEdRecibido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        mEdRecibido = (EditText)findViewById(R.id.et_Actividad3_recibido);
        String elTextoRecibido = getIntent().getStringExtra("para1");
        mEdRecibido.setText(elTextoRecibido);

    }


    public void onBack(View view)
    {
        finish();
    }

}
