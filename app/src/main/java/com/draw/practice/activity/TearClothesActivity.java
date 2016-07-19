package com.draw.practice.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.draw.practice.R;

/**
 * 撕衣服
 */
public class TearClothesActivity extends AppCompatActivity {

    private int[] backgrounds = new int[]{R.drawable.after0, R.drawable.after1, R.drawable.after2, R.drawable.after3, R.drawable.after4, R.drawable.after5, R.drawable.after6, R.drawable.after7, R.drawable.after8, R.drawable.after9, R.drawable.after10};
    private int[] foregrounds = new int[]{R.drawable.pre0, R.drawable.pre1, R.drawable.pre2, R.drawable.pre3, R.drawable.pre4, R.drawable.pre5, R.drawable.pre6, R.drawable.pre7, R.drawable.pre8, R.drawable.pre9, R.drawable.pre10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tear_clothes);
    }
}
