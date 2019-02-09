package com.example.sushmita.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class DanceIndia extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance_india);
        getSupportActionBar().hide();
        imageView=(ImageView)findViewById(R.id.imageView);
        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
        imageView.setAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                startActivity(new Intent(DanceIndia.this,MainActivity.class));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
