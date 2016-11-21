package com.draw.practice.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.draw.practice.R;
import com.draw.practice.widget.CalligraphyView;

/**
 * 签名
 */
public class SignatureActivity extends AppCompatActivity implements View.OnClickListener {

    private CalligraphyView signature_draw;
    private TextView tv_hint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signature);

        tv_hint = (TextView) findViewById(R.id.tv_hint);
        signature_draw = (CalligraphyView) findViewById(R.id.signature_draw);
        signature_draw.setOnSignatureReadyListener(new CalligraphyView.SignatureReadyListener() {
            @Override
            public void onSignatureReady(boolean ready) {
                if (!ready) tv_hint.setVisibility(View.VISIBLE);
            }

            @Override
            public void onStartSigningSignature(boolean startSigning) {
                tv_hint.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sign_clean:
                signature_draw.clear();
                break;
            case R.id.sign_confirm:
                break;
        }
    }
}
