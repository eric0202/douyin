package com.byteteam.douyin.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import com.airbnb.lottie.LottieAnimationView;
import com.byteteam.douyin.R;

/**
 * @introduction： 启动动画
 * @author： 何文鹏
 * @time： 2022/8/21
 */

public class LottieActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);

        lottieAnimationView = findViewById(R.id.lottie);


        new Handler().postDelayed(() -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        },2000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.finish();
    }
}