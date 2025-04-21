package com.example.qrcodeapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QRCodeListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode_list);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        QRCodeDatabase db = QRCodeDatabase.getInstancia(this);
        List<QrCodeEntity> qrCodeList = db.qrCodeDao().listarTodos();

        QRCodeAdapter adapter = new QRCodeAdapter(qrCodeList);
        recyclerView.setAdapter(adapter);
    }
}
