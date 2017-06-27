package com.leon.lgank.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.leon.lgank.R;

import jp.wasabeef.glide.transformations.BlurTransformation;


public class GuideActivity extends AppCompatActivity {
    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        mIv = (ImageView) findViewById(R.id.image_guide);
        Glide.with(this)
                .load(R.drawable.guide_bg)
                // 设置高斯模糊
                .bitmapTransform(new BlurTransformation(this, 25, 4))
                .into(mIv);
        CountDownTimer timer = new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                startActivity(new Intent(GuideActivity.this, MainActivity.class));
            }
        };
    }
}