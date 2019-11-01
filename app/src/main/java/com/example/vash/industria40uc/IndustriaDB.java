package com.example.vash.industria40uc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class IndustriaDB extends SQLiteOpenHelper {

    private static final String DB_NAME="db_industria.bd";
    private static final int VERSION_DB=1;
    private static final String TABLE_EVENTO="CREATE TABLE evento(" +
            "evento_id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "evento_nombre TEXT,"+
            "evento_ponente TEXT,"+
            "evento_fecha NUMERIC," +
            "evento_hora NUMERIC," +
            "evento_lugar TEXT)";

    public IndustriaDB(@Nullable Context context) {
        super(context, DB_NAME, null, VERSION_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLE_EVENTO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
