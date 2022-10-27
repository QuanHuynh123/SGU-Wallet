package com.example.sguwallet.login;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sguwallet.R;

public class Register extends AppCompatActivity {

    CheckBox checkBox ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regis_layout);

        checkBox = findViewById(R.id.terms);
        checkBox.setPaintFlags(checkBox.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}
