package com.example.newtaipeizookotlin.room;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<User> __insertionAdapterOfUser;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `user` (`uid`,`PageNameTitle`,`click_position`,`EnglishName`,`ChineseName`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getUid());
        if (value.getPageName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPageName());
        }
        stmt.bindLong(3, value.getClickPosition());
        if (value.getEnglishName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEnglishName());
        }
        if (value.getChineseName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getChineseName());
        }
      }
    };
  }

  @Override
  public void insertUser(final User users) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUser.insert(users);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<User> getUserList() {
    final String _sql = "SELECT * from user";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfPageName = CursorUtil.getColumnIndexOrThrow(_cursor, "PageNameTitle");
      final int _cursorIndexOfClickPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "click_position");
      final int _cursorIndexOfEnglishName = CursorUtil.getColumnIndexOrThrow(_cursor, "EnglishName");
      final int _cursorIndexOfChineseName = CursorUtil.getColumnIndexOrThrow(_cursor, "ChineseName");
      final List<User> _result = new ArrayList<User>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final User _item;
        _item = new User();
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        _item.setUid(_tmpUid);
        final String _tmpPageName;
        _tmpPageName = _cursor.getString(_cursorIndexOfPageName);
        _item.setPageName(_tmpPageName);
        final int _tmpClickPosition;
        _tmpClickPosition = _cursor.getInt(_cursorIndexOfClickPosition);
        _item.setClickPosition(_tmpClickPosition);
        final String _tmpEnglishName;
        _tmpEnglishName = _cursor.getString(_cursorIndexOfEnglishName);
        _item.setEnglishName(_tmpEnglishName);
        final String _tmpChineseName;
        _tmpChineseName = _cursor.getString(_cursorIndexOfChineseName);
        _item.setChineseName(_tmpChineseName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public User findByName(final String type, final int positionID, final String EnglishName,
      final String ChineseName) {
    final String _sql = "SELECT * FROM user WHERE PageNameTitle in(?) AND click_position in(?) AND EnglishName in(?) AND ChineseName in(?) ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, positionID);
    _argIndex = 3;
    if (EnglishName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, EnglishName);
    }
    _argIndex = 4;
    if (ChineseName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, ChineseName);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfPageName = CursorUtil.getColumnIndexOrThrow(_cursor, "PageNameTitle");
      final int _cursorIndexOfClickPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "click_position");
      final int _cursorIndexOfEnglishName = CursorUtil.getColumnIndexOrThrow(_cursor, "EnglishName");
      final int _cursorIndexOfChineseName = CursorUtil.getColumnIndexOrThrow(_cursor, "ChineseName");
      final User _result;
      if(_cursor.moveToFirst()) {
        _result = new User();
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        _result.setUid(_tmpUid);
        final String _tmpPageName;
        _tmpPageName = _cursor.getString(_cursorIndexOfPageName);
        _result.setPageName(_tmpPageName);
        final int _tmpClickPosition;
        _tmpClickPosition = _cursor.getInt(_cursorIndexOfClickPosition);
        _result.setClickPosition(_tmpClickPosition);
        final String _tmpEnglishName;
        _tmpEnglishName = _cursor.getString(_cursorIndexOfEnglishName);
        _result.setEnglishName(_tmpEnglishName);
        final String _tmpChineseName;
        _tmpChineseName = _cursor.getString(_cursorIndexOfChineseName);
        _result.setChineseName(_tmpChineseName);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
