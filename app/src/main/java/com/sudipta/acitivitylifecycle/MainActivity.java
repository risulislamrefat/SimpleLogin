package com.sudipta.acitivitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText usernameEt,passwordEt;
        Button loginBtn;
        final TextView outputTv;

        usernameEt = findViewById(R.id.usernameEt);
        passwordEt = findViewById(R.id.passwordEt);
        loginBtn = findViewById(R.id.loginBtn);
        outputTv = findViewById(R.id.outputTv);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username= usernameEt.getText().toString();
                String password = passwordEt.getText().toString();

                if(username.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please Enter Username ", Toast.LENGTH_SHORT).show();
                }
                else if(password.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please Enter Password ", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    outputTv.setVisibility(View.VISIBLE);
                    outputTv.setText(username+ " " + password);
                }
            }
        });

        }
    }