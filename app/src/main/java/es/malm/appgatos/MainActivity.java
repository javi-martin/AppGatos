package es.malm.appgatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity
{
    EditText txtUser, txtPass;
    Switch saveSwitch;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUser = findViewById(R.id.txtUsuario);
        txtPass = findViewById(R.id.txtClave);
        saveSwitch = findViewById(R.id.switchGuardar);
        btnLogin = findViewById(R.id.btnAcceder);

    }
}