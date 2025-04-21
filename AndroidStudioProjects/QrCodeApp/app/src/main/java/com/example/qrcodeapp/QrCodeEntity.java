package com.example.qrcodeapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "qrcodes")
public class QrCodeEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String conteudo;

    public long timestamp;

    public QrCodeEntity(String conteudo, long timestamp) {
        this.conteudo = conteudo;
        this.timestamp = timestamp;
    }
}
