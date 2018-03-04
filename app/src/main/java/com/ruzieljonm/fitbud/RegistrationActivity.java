package com.ruzieljonm.fitbud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etBirthdate = (EditText) findViewById(R.id.etBirthdate);
        final EditText etWeight = (EditText) findViewById(R.id.etWeight);
        final EditText etHeight = (EditText) findViewById(R.id.etHeight);

        final Button bSignIn= (Button) findViewById(R.id.bSignIn);

    }
}
