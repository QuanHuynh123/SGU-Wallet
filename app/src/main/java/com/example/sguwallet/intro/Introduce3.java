package com.example.sguwallet.intro;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sguwallet.login.Login;
import com.example.sguwallet.R;

public class Introduce3 extends AppCompatActivity {

    Button nextImage ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_sgu_layout_3);

        nextImage = findViewById(R.id.nextImage);
        nextImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Introduce3.this, Introduce4.class);
                Introduce3.this.startActivity(intent);
            }
        });

    }
}
