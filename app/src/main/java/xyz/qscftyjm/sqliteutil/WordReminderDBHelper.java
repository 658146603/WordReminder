package xyz.qscftyjm.sqliteutil;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class WordReminderDBHelper extends SQLiteOpenHelper {

    public static final int WORD__VERSION = 1000;
    private static final String CREATE_TABLE_WORDLIST = "";
    private static final String CREATE_TABLE_WORD_COMPLETE_INFO = "";
    private static final String CREATE_TABLE_USERINFO = "";

    public WordReminderDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
