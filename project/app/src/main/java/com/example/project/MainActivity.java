package com.example.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editUserName, editPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editUserName = findViewById(R.id.usernametxt);
        editPassword = findViewById(R.id.passwordtxt);
        btnLogin = findViewById(R.id.loginbtn);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dataUsername = editUserName.getText().toString();
                Toast.makeText(MainActivity.this, "Datanya : "+dataUsername, Toast.LENGTH_SHORT).show();
            }
        }
        );
    }
}