package com.example.knowledgeforge;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton btn = (ImageButton) findViewById(R.id.imageButton2);

        EditText userName = (EditText)findViewById(R.id.idEdtUserName);
        EditText passWord = (EditText)findViewById(R.id.editTextTextPassword);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(userName.getText().toString().equals("username") && passWord.getText().toString().equals("1234")){
                    Intent intent = new Intent(Login.this, Dashboard.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(Login.this, "LOGIN FAILED",Toast.LENGTH_SHORT).show();
            }
        });
    }
}