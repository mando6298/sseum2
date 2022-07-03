package com.devcation.sseum;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txTitle;
    TextView txContent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txTitle = (TextView) findViewById(R.id.textView);
        txContent = (TextView) findViewById(R.id.textView1);

        txTitle.animate().alpha(0f).setDuration(0);
        txContent.animate().alpha(0f).setDuration(0);

        txTitle.animate().alpha(1f).setDuration(1000).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                txContent.animate().alpha(1f).setDuration(1000);
            }
        });

        //3초뒤
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

}
}