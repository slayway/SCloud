package com.slayway.slaycloud;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.strictmode.SqliteObjectLeakedViolation;
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
    DBHelper dbHelper;

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
        dbHelper = new DBHelper(this);
        creaateAcc.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        SQLiteDatabase database = dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        String firstName = etFirstName.getText().toString();
        String lastName = etLastName.getText().toString();
        String email = etEmail.getText().toString();
        String login = etLogin.getText().toString();
        String password = etPass.getText().toString();
        switch (view.getId()){
            case R.id.buttonCreateAcc:

                contentValues.put(dbHelper.KEY_FIRSTNAME, firstName);
                contentValues.put(dbHelper.KEY_LASTNAME, lastName);
                contentValues.put(dbHelper.KEY_MAIL, email);
                contentValues.put(dbHelper.KEY_LOGIN, login);
                contentValues.put(dbHelper.KEY_PASSWORD, password);

                database.insert(dbHelper.TABLE_USERS, null, contentValues);
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}
