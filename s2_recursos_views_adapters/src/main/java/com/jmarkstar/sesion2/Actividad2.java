package com.jmarkstar.sesion2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    private EditText mEtTextoA2;
    private TextView mTvTextoArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        mEtTextoA2 = (EditText)findViewById(R.id.et_Actividad2_putExtra);


        mTvTextoArray = (TextView)findViewById(R.id.tv_texto_array);
        int myIntegerArray[]=getResources().getIntArray(R.array.numeros_primos);
        String myStringArray [] = getResources().getStringArray(R.array.paises);

        for(int i=0;i< myIntegerArray.length;i++)
        {
            Log.v("Integer = ",""+myIntegerArray[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(String item: myStringArray)
        {
            sb.append(item+"∖n");
        }
        mTvTextoArray.setText(sb.toString());


    }

    @Override
    protected void onResume()
    {
        //limpiar
        super.onResume();
        mEtTextoA2.setText("");
    }

    public void onNext(View view)
    {
        //Cuando hago click, paso para1 de la actividad2, a la actividad3
        String texto = mEtTextoA2.getText().toString();
        Intent intento = new Intent(this,Actividad3.class);
        intento.putExtra("para1",texto);
        startActivity(intento);
    }


}
