package com.slayway.slaycloud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "usersDb";
    public static final String TABLE_USERS = "users";

    public static final String KEY_ID = "id";
    public static final String KEY_FIRSTNAME = "firstName";
    public static final String KEY_LASTNAME = "last name";
    public static final String KEY_MAIL = "email";
    public static final String KEY_LOGIN = "login";
    public static final String KEY_PASSWORD = "password";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_USERS + "(" + KEY_ID + "integer primary key, " + KEY_FIRSTNAME + "text,"
                + KEY_LASTNAME + "text," + KEY_MAIL + "text," + KEY_LOGIN + "text," + KEY_PASSWORD + "text" + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists" + TABLE_USERS);
        onCreate(db);
    }
}