package com.slayway.slaycloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    Button signUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signUp = (Button) findViewById(R.id.buttonSignUp);

        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.buttonSignUp:
                Intent register = new Intent(this, RegisterActivity.class);
                startActivity(register);
                break;

             default:
                 break;
        }
    }
}
