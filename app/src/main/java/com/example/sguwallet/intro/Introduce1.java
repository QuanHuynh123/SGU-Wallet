package com.example.sguwallet.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sguwallet.login.Login;
import com.example.sguwallet.R;

public class Introduce1 extends AppCompatActivity {

    TextView IntroduceText3  , skip;
    Button nextImage ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_sgu_layout_1);

        IntroduceText3 = findViewById(R.id.IntroduceText3);
        IntroduceText3.setTypeface(null, Typeface.ITALIC);

        nextImage = findViewById(R.id.nextImage);
        nextImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Introduce1.this, Introduce2.class);
                Introduce1.this.startActivity(intent);
            }
        });

        skip = findViewById(R.id.skip);
        skip.setPaintFlags(nextImage.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        skip.setTypeface(null, Typeface.ITALIC);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Introduce1.this, Introduce4.class);
                Introduce1.this.startActivity(intent);
            }
        });

    }
}