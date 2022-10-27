package com.example.sguwallet.DisplayMain;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.example.sguwallet.R;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class Main extends AppCompatActivity {

    private ViewPager2 viewPager;
    private CircleIndicator3 circleIndicator;
    private List<Photo> mlistPhoto;
    private Handler handler = new Handler(Looper.getMainLooper());
    private Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            int currentPosition  = viewPager.getCurrentItem();
            if(currentPosition == mlistPhoto.size() - 1){
                viewPager.setCurrentItem(0);
            }
            else {
                viewPager.setCurrentItem(currentPosition + 1 );
            }
        }
    };

    // view
    ImageView eyes;
    TextView money ;
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        viewPager = findViewById(R.id.view_paper);
        circleIndicator = findViewById(R.id.circle_indicator);

        viewPager.setOffscreenPageLimit(3);
        viewPager.setClipToPadding(false);
        viewPager.setClipChildren(false);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });
        viewPager.setPageTransformer(compositePageTransformer);

        mlistPhoto = getListPhoto();
        PhotoAdapter photoAdapter = new PhotoAdapter(mlistPhoto);
        viewPager.setAdapter(photoAdapter);
        circleIndicator.setViewPager(viewPager);

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                handler.removeCallbacks(mRunnable);
                handler.postDelayed(mRunnable,2000);
            }
        });

        money= findViewById(R.id.text_money);
        String a  = String.valueOf(money.getText());

        final boolean[] check_eyes = {true};
        eyes = findViewById(R.id.image_eyes);
        eyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check_eyes[0] == true ){
                    eyes.setImageResource(R.drawable.ic_hide_eyes);
                    check_eyes[0] = false;
                    money.setText("*****");
                }
                else if(check_eyes[0] != true) {
                    eyes.setImageResource(R.drawable.ic_eyes);
                    money.setText(a);
                    check_eyes[0] = true ;
                }
            }
        });
    }

    private List<Photo> getListPhoto(){
        List<Photo> list = new ArrayList<>();
        list.add(new Photo(R.drawable.slide_image_1));
        list.add(new Photo(R.drawable.slide_image_2));
        list.add(new Photo(R.drawable.slide_image_3));
        return list ;
    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(mRunnable);
    }

    @Override
    protected void onResume() {
        super.onResume();
        handler.postDelayed(mRunnable,2000);
    }
}
