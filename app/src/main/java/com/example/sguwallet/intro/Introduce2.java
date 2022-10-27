package com.example.sguwallet.intro;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sguwallet.R;
import com.example.sguwallet.login.Login;

public class Introduce2 extends AppCompatActivity {
    TextView IntroduceText5 , skip;
    Button nextImage ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_sgu_layout_2);

        IntroduceText5 = findViewById(R.id.IntroduceText5);
        IntroduceText5.setTypeface(null, Typeface.ITALIC);

        skip = findViewById(R.id.skip);
        skip.setPaintFlags(skip.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        skip.setTypeface(null, Typeface.ITALIC);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Introduce2.this, Introduce4.class);
                Introduce2.this.startActivity(intent);
            }
        });

        nextImage = findViewById(R.id.nextImage);
        nextImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Introduce2.this, Introduce3.class);
                Introduce2.this.startActivity(intent);
            }
        });

    }
}
