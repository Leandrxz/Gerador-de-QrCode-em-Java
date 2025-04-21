import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.qrcodeapp.QRCodeDAO;
import com.example.qrcodeapp.QrCodeEntity;

@Database(entities = {QrCodeEntity.class}, version = 1)
public abstract class QRCodeDatabase extends RoomDatabase {

    private static QRCodeDatabase instancia;

    public abstract QRCodeDAO qrCodeDao();

    public static synchronized QRCodeDatabase getInstancia(Context context) {
        if (instancia == null) {
            instancia = Room.databaseBuilder(context.getApplicationContext(),
                            QRCodeDatabase.class, "qrcode_db")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instancia;
    }
}
