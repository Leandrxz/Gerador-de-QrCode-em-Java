package com.example.qrcodeapp;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.qrcodeapp.QrCodeEntity;

import java.util.List;

@Dao
public interface QRCodeDAO {
    @Insert
    void inserir(QrCodeEntity qrCode);

    @Query("SELECT * FROM qrcodes ORDER BY timestamp DESC")
    List<QrCodeEntity> listarTodos();
}
