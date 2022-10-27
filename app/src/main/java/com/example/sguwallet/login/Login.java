package com.example.sguwallet.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sguwallet.DisplayMain.Main;
import com.example.sguwallet.R;

public class Login extends AppCompatActivity {

    TextView SignUp ;
    Button login ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        SignUp = findViewById(R.id.text_signup);
        SignUp.setPaintFlags(SignUp.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Register.class);
                Login.this.startActivity(intent);
            }
        });

        login = findViewById(R.id.bt_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Main.class);
                Login.this.startActivity(intent);
            }
        });
    }
}