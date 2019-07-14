package com.example.tokobaju;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class harga extends AppCompatActivity {
    @BindView(R.id.txtdari)
    TextView txtdari;
    @BindView(R.id.txtke)
    TextView txtke;
    @BindView(R.id.txttgl)
    TextView txttgl;
    @BindView(R.id.txtjk)
    TextView txtjk;
    @BindView(R.id.txtharga)
    TextView txtharga;
    @BindView(R.id.txtjb)
    TextView txtjb;
    @BindView(R.id.txtjt)
    TextView txtjt;
    @BindView(R.id.btnpesan)
    Button btnpesan;
    @BindView(R.id.btncancel)
    Button btncancel;

    String strdari, strke, strtgl, strjk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.harga);

        btnpesan = (Button) findViewById(R.id.btnpesan);
        btnpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ButterKnife.bind(this);


        Intent getData = getIntent();
        strdari = getData.getStringExtra("dari");
        strke = getData.getStringExtra("ke");
        strtgl = getData.getStringExtra("tanggal");
        strjk = getData.getStringExtra("kursi");

        txtdari.setText(strdari);
        txtke.setText(strke);
        txttgl.setText(strtgl);
        txtjk.setText(strjk);
    }

    @OnClick(R.id.btnpesan)
    void Pesan() {

        Intent a = new Intent(harga.this, login.class);
        startActivity(a);
        finish();

    }

    @OnClick(R.id.btncancel)
    void Cancel() {

        Intent a = new Intent(harga.this, MainActivity.class);
        startActivity(a);
        finish();

    }
}
