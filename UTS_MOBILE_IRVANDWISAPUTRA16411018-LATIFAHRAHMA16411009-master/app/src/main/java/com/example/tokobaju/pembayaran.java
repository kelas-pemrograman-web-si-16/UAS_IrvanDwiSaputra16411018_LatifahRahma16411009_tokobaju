package com.example.tokobaju;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class pembayaran extends AppCompatActivity {
    @BindView(R.id.txtmp)
    TextView txtmp;
    @BindView(R.id.txttotal)
    TextView txtpesan;
    @BindView(R.id.btnbayar)
    Button btnbayar;

    String strmp, strbayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnbayar)
    void Bayar() {

        Intent a = new Intent(pembayaran.this, MainActivity.class);
        startActivity(a);
        finish();

    }
}