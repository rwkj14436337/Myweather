package com.example.acer.myweather.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by acer on 2017/6/15.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private final String CREATE_PROVINCE = "create table Province ("
            + "provinceName text," + "provinceId text )";

    private final String CREATE_CITY = "create table City("
            + "cityName text," + "cityId text," + "provinceId text)";

    private final String CREATE_COUNTY = "create table County("
            + "countyName text," + "countyId text," + "cityId text)";

    public DatabaseHelper(Context context, String DbName,
                          SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DbName, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
