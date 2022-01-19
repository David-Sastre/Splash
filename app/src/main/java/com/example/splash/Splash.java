package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView text1 = (TextView) findViewById(R.id.TextViewTopTitle);
        Animation fade1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        text1.startAnimation(fade1);

        ImageView imageView = (ImageView) findViewById(R.id.ImageView);
        Animation spinin = AnimationUtils.loadAnimation(this, R.anim.custom_anim);
        imageView.startAnimation(spinin);

        TextView text2 = (TextView) findViewById(R.id.TextViewBottomTitle);
        Animation fade2 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        text2.startAnimation(fade2);

        fade1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(Splash.this,MainActivity.class));
                Splash.this.finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();

        TextView text1 = (TextView) findViewById(R.id.TextViewTopTitle);
        text1.clearAnimation();
        ImageView imageView = (ImageView) findViewById(R.id.ImageView);
        imageView.clearAnimation();
        TextView text2 = (TextView) findViewById(R.id.TextViewBottomTitle);
        text2.clearAnimation();
    }


}