package projects.ostrich952.hourly.Model.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "hourly_database";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_CREATE = "create table jobs (ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, job_name TEXT NOT NULL);";

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        Log.w(DatabaseHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");

        database.execSQL("DROP TABLE IF EXISTS MyEmployees");
        onCreate(database);
    }
}
