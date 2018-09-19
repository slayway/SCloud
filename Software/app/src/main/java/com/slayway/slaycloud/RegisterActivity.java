package com.slayway.slaycloud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    Button creaateAcc;
    EditText etFirstName;
    EditText etLastName;
    EditText etEmail;
    EditText etLogin;
    EditText etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        creaateAcc = (Button) findViewById(R.id.buttonCreateAcc);
        etFirstName = (EditText) findViewById(R.id.editTextFirstName);
        etLastName = (EditText) findViewById(R.id.editTextLastName);
        etEmail = (EditText) findViewById(R.id.editTextEmail);
        etLogin = (EditText) findViewById(R.id.editTextLogin);
        etPass = (EditText) findViewById(R.id.editTextPass);

        creaateAcc.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonCreateAcc:
                break;

            default:
                break;
        }
    }
}
