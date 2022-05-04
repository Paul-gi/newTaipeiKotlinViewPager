package com.example.newtaipeizookotlin.room;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ViewPagerListDataDao_Impl implements ViewPagerListDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ViewPagerListData> __insertionAdapterOfViewPagerListData;

  public ViewPagerListDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfViewPagerListData = new EntityInsertionAdapter<ViewPagerListData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `ViewPagerDataList` (`FragmentPageCode`,`RawListDataStr`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ViewPagerListData value) {
        if (value.getFragmentPageCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getFragmentPageCode());
        }
        if (value.getRawListDataStr() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getRawListDataStr());
        }
      }
    };
  }

  @Override
  public void insertUser(final ViewPagerListData viewPagerListData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfViewPagerListData.insert(viewPagerListData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<ViewPagerListData> getViewPagerRawDataList() {
    final String _sql = "SELECT * from ViewPagerDataList";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfFragmentPageCode = CursorUtil.getColumnIndexOrThrow(_cursor, "FragmentPageCode");
      final int _cursorIndexOfRawListDataStr = CursorUtil.getColumnIndexOrThrow(_cursor, "RawListDataStr");
      final List<ViewPagerListData> _result = new ArrayList<ViewPagerListData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ViewPagerListData _item;
        _item = new ViewPagerListData();
        final Integer _tmpFragmentPageCode;
        if (_cursor.isNull(_cursorIndexOfFragmentPageCode)) {
          _tmpFragmentPageCode = null;
        } else {
          _tmpFragmentPageCode = _cursor.getInt(_cursorIndexOfFragmentPageCode);
        }
        _item.setFragmentPageCode(_tmpFragmentPageCode);
        final String _tmpRawListDataStr;
        _tmpRawListDataStr = _cursor.getString(_cursorIndexOfRawListDataStr);
        _item.setRawListDataStr(_tmpRawListDataStr);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public ViewPagerListData findListDataStr(final Integer FragmentPageCode) {
    final String _sql = "SELECT * FROM ViewPagerDataList WHERE FragmentPageCode in(?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (FragmentPageCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, FragmentPageCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfFragmentPageCode = CursorUtil.getColumnIndexOrThrow(_cursor, "FragmentPageCode");
      final int _cursorIndexOfRawListDataStr = CursorUtil.getColumnIndexOrThrow(_cursor, "RawListDataStr");
      final ViewPagerListData _result;
      if(_cursor.moveToFirst()) {
        _result = new ViewPagerListData();
        final Integer _tmpFragmentPageCode;
        if (_cursor.isNull(_cursorIndexOfFragmentPageCode)) {
          _tmpFragmentPageCode = null;
        } else {
          _tmpFragmentPageCode = _cursor.getInt(_cursorIndexOfFragmentPageCode);
        }
        _result.setFragmentPageCode(_tmpFragmentPageCode);
        final String _tmpRawListDataStr;
        _tmpRawListDataStr = _cursor.getString(_cursorIndexOfRawListDataStr);
        _result.setRawListDataStr(_tmpRawListDataStr);
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
