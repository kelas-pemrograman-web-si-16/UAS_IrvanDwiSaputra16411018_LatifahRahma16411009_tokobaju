package com.example.tokobaju;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.edke)
    EditText edke;
    @BindView(R.id.edtgl)
    EditText edtanggal;
    @BindView(R.id.edkrs)
    EditText edkursi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSubmit)
    void submit() {

        String strke, strtanggal, strkursi;

        strke = edke.getText().toString();
        strtanggal = edtanggal.getText().toString();
        strkursi = edkursi.getText().toString();

        if( strke.isEmpty() && strtanggal.isEmpty() && strkursi.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Lengkapi Data", Toast.LENGTH_LONG).show();

        } else {
            Intent a = new Intent(MainActivity.this, harga.class);
            a.putExtra("ke", strke);
            a.putExtra("tanggal", strtanggal);
            a.putExtra("kursi", strkursi);
            startActivity(a);
            finish();

        }
    }
}