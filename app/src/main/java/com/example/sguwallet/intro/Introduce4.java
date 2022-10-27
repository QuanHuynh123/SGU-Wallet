package com.example.sguwallet.intro;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sguwallet.R;
import com.example.sguwallet.login.Login;
import com.example.sguwallet.login.Register;

public class Introduce4 extends AppCompatActivity {
    Button  bt1, bt2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_sgu_layout_4);

        bt1 = findViewById(R.id.bt_intro_login);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Introduce4.this, Login.class);
                Introduce4.this.startActivity(intent);
            }
        });

        bt2 = findViewById(R.id.bt_intro_regis);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Introduce4.this, Register.class);
                Introduce4.this.startActivity(intent);
            }
        });
    }
}