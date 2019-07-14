package com.example.tokobaju;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class login extends AppCompatActivity {
    @BindView(R.id.edpw)
    EditText edpw;
    @BindView(R.id.edtemail)
    EditText edemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSubmit)
    void Login() {

        String stremail, strpw;

        strpw = edpw.getText().toString();
        stremail = edemail.getText().toString();

        if (strpw.isEmpty() && stremail.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Silahkan Daftar Dulu", Toast.LENGTH_LONG).show();

        } else {
            Intent a = new Intent(login.this, pembayaran.class);
            a.putExtra("Password", strpw);
            a.putExtra("email", stremail);
            startActivity(a);
            finish();
        }
    }

    @OnClick(R.id.btndaftar)
    void Daftar() {

        Intent a = new Intent(login.this, regis.class);
        startActivity(a);
        finish();

    }
}
