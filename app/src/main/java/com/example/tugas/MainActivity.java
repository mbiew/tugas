package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtBil1, txtBil2, txtJumlah;
    Button btnHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        initComponent();
        initEvent();
    }

    private void initComponent() {
        txtBil1 = findViewById(R.id.et_1);
        txtBil2 = findViewById(R.id.et_2);
        txtJumlah = findViewById(R.id.et_3);
        btnHasil = findViewById(R.id.btn_1);
    }

    private void initEvent() {
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung();
            }
        });
    }

    private void hitung() {
        int angka1 = Integer.parseInt(txtBil1.getText().toString());
        int angka2 = Integer.parseInt(txtBil2.getText().toString());
        int total = angka1 + angka2;
        txtJumlah.setText(total);
    }
}
