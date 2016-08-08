package com.draw.practice.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.draw.practice.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                startActivity(new Intent(this, DrawLineFollowFingerActivity.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this, SignatureActivity.class));
                break;
            case R.id.button3:
                startActivity(new Intent(this, TearClothesActivity.class));
                break;
            case R.id.button4:
                startActivity(new Intent(this, IndicatorActivity.class));
                break;
            case R.id.button5:
                startActivity(new Intent(this, PaintActivity.class));
                break;
        }
    }
}
