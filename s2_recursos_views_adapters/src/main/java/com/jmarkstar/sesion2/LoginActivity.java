package com.jmarkstar.sesion2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private static  final String TAG="ActividadLogin";
    private EditText mEtUserName;
    private EditText mEtPassword;
    private Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.i(TAG,"Estamos en onCreate()");//tag: etiqueta, nombre de la clase sobre la cual se manda el log
        mEtUserName = (EditText)findViewById(R.id.et_username);
        mEtPassword=(EditText)findViewById(R.id.et_password);
        mBtnLogin = (Button)findViewById(R.id.btn_login);

        mBtnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //al hacer click en el logeo, ocultamos el teclado
                View v = LoginActivity.this.getCurrentFocus();
                if(v != null)
                {
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(),0);
                }
                //fin oculta teclado

                String user = mEtUserName.getText().toString();
                String pass = mEtPassword.getText().toString();
                if(user.equals("juve") && pass.equals("123"))
                {
                    Toast.makeText(LoginActivity.this, "Bienvenido Juvenal", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Error datos incorrectos", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i(TAG,"Estamos en onStart()");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(TAG,"Estamos en onResume()");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i(TAG,"Estamos en onPause()");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i(TAG,"Estamos en onRestart()");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.i(TAG,"Estamos en onStop()");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(TAG,"Estamos en onDestroy()");
    }

}
