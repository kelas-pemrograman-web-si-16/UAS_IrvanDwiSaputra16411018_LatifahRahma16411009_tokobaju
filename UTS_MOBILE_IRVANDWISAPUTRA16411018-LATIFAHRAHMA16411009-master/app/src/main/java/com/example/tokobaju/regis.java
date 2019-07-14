package com.example.tokobaju;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class regis extends AppCompatActivity {
    @BindView(R.id.edNama)
    EditText ednama;
    @BindView(R.id.edemail)
    EditText edemail;
    @BindView(R.id.edpsw)
    EditText edpassword;
    @BindView(R.id.edhp)
    EditText ednohp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnd)
    void Daftar() {

        String strnama, stremail, strpsw, strhp;

        strnama = ednama.getText().toString();
        stremail = edemail.getText().toString();
        strpsw = edpassword.getText().toString();
        strhp = ednohp.getText().toString();

        if (strnama.isEmpty() && stremail.isEmpty() && strpsw.isEmpty() && strhp.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Lengkapi Data", Toast.LENGTH_LONG).show();

        } else {
            Intent a = new Intent(regis.this, login.class);
            a.putExtra("Nama", strnama);
            a.putExtra("Email", stremail);
            a.putExtra("Password", strpsw);
            a.putExtra("No.HP", strhp);
            startActivity(a);
            finish();
        }
    }
}
