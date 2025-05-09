package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import ca.InterfaceC0652r;
import d1.C0682a;
import d1.c;
import d1.f;
import d1.g;
import e1.C0710a;
import e1.d;
import e1.e;
import java.util.List;
import java.util.Locale;

/* compiled from: FrameworkSQLiteDatabase.kt */
/* loaded from: classes.dex */
public final class FrameworkSQLiteDatabase implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f7870b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f7871c = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f7872a;

    /* compiled from: FrameworkSQLiteDatabase.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7873a = new a();

        public final void a(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
            sQLiteDatabase.execPerConnectionSQL(str, objArr);
        }
    }

    public FrameworkSQLiteDatabase(SQLiteDatabase sQLiteDatabase) {
        this.f7872a = sQLiteDatabase;
    }

    @Override // d1.c
    public final void beginTransaction() {
        this.f7872a.beginTransaction();
    }

    @Override // d1.c
    public final void beginTransactionNonExclusive() {
        this.f7872a.beginTransactionNonExclusive();
    }

    @Override // d1.c
    public final void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        this.f7872a.beginTransactionWithListener(sQLiteTransactionListener);
    }

    @Override // d1.c
    public final void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        this.f7872a.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7872a.close();
    }

    @Override // d1.c
    public final g compileStatement(String str) {
        return new e(this.f7872a.compileStatement(str));
    }

    @Override // d1.c
    public final int delete(String str, String str2, Object[] objArr) {
        StringBuilder sb2 = new StringBuilder("DELETE FROM ");
        sb2.append(str);
        if (str2 != null && str2.length() != 0) {
            sb2.append(" WHERE ");
            sb2.append(str2);
        }
        g compileStatement = compileStatement(sb2.toString());
        C0682a.C0390a.a(compileStatement, objArr);
        return ((e) compileStatement).f20504b.executeUpdateDelete();
    }

    @Override // d1.c
    public final void disableWriteAheadLogging() {
        this.f7872a.disableWriteAheadLogging();
    }

    @Override // d1.c
    public final boolean enableWriteAheadLogging() {
        return this.f7872a.enableWriteAheadLogging();
    }

    @Override // d1.c
    public final void endTransaction() {
        this.f7872a.endTransaction();
    }

    @Override // d1.c
    public final void execPerConnectionSQL(String str, Object[] objArr) {
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            throw new UnsupportedOperationException(com.google.android.gms.measurement.internal.a.g(i, "execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: "));
        }
        a.f7873a.a(this.f7872a, str, objArr);
    }

    @Override // d1.c
    public final void execSQL(String str) {
        this.f7872a.execSQL(str);
    }

    @Override // d1.c
    public final List<Pair<String, String>> getAttachedDbs() {
        return this.f7872a.getAttachedDbs();
    }

    @Override // d1.c
    public final long getMaximumSize() {
        return this.f7872a.getMaximumSize();
    }

    @Override // d1.c
    public final long getPageSize() {
        return this.f7872a.getPageSize();
    }

    @Override // d1.c
    public final String getPath() {
        return this.f7872a.getPath();
    }

    @Override // d1.c
    public final int getVersion() {
        return this.f7872a.getVersion();
    }

    @Override // d1.c
    public final boolean inTransaction() {
        return this.f7872a.inTransaction();
    }

    @Override // d1.c
    public final long insert(String str, int i, ContentValues contentValues) {
        return this.f7872a.insertWithOnConflict(str, null, contentValues, i);
    }

    @Override // d1.c
    public final boolean isDatabaseIntegrityOk() {
        return this.f7872a.isDatabaseIntegrityOk();
    }

    @Override // d1.c
    public final boolean isDbLockedByCurrentThread() {
        return this.f7872a.isDbLockedByCurrentThread();
    }

    @Override // d1.c
    public final boolean isExecPerConnectionSQLSupported() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // d1.c
    public final boolean isOpen() {
        return this.f7872a.isOpen();
    }

    @Override // d1.c
    public final boolean isReadOnly() {
        return this.f7872a.isReadOnly();
    }

    @Override // d1.c
    public final boolean isWriteAheadLoggingEnabled() {
        return this.f7872a.isWriteAheadLoggingEnabled();
    }

    @Override // d1.c
    public final boolean needUpgrade(int i) {
        return this.f7872a.needUpgrade(i);
    }

    @Override // d1.c
    public final Cursor query(String str) {
        return query(new C0682a(str, null));
    }

    @Override // d1.c
    public final void setForeignKeyConstraintsEnabled(boolean z10) {
        this.f7872a.setForeignKeyConstraintsEnabled(z10);
    }

    @Override // d1.c
    public final void setLocale(Locale locale) {
        this.f7872a.setLocale(locale);
    }

    @Override // d1.c
    public final void setMaxSqlCacheSize(int i) {
        this.f7872a.setMaxSqlCacheSize(i);
    }

    @Override // d1.c
    public final long setMaximumSize(long j10) {
        SQLiteDatabase sQLiteDatabase = this.f7872a;
        sQLiteDatabase.setMaximumSize(j10);
        return sQLiteDatabase.getMaximumSize();
    }

    @Override // d1.c
    public final void setPageSize(long j10) {
        this.f7872a.setPageSize(j10);
    }

    @Override // d1.c
    public final void setTransactionSuccessful() {
        this.f7872a.setTransactionSuccessful();
    }

    @Override // d1.c
    public final void setVersion(int i) {
        this.f7872a.setVersion(i);
    }

    @Override // d1.c
    public final int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(f7870b[i]);
        sb2.append(str);
        sb2.append(" SET ");
        int i9 = 0;
        for (String str3 : contentValues.keySet()) {
            sb2.append(i9 > 0 ? "," : "");
            sb2.append(str3);
            objArr2[i9] = contentValues.get(str3);
            sb2.append("=?");
            i9++;
        }
        if (objArr != null) {
            for (int i10 = size; i10 < length; i10++) {
                objArr2[i10] = objArr[i10 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(" WHERE ");
            sb2.append(str2);
        }
        g compileStatement = compileStatement(sb2.toString());
        C0682a.C0390a.a(compileStatement, objArr2);
        return ((e) compileStatement).f20504b.executeUpdateDelete();
    }

    @Override // d1.c
    public final boolean yieldIfContendedSafely() {
        return this.f7872a.yieldIfContendedSafely();
    }

    @Override // d1.c
    public final void execSQL(String str, Object[] objArr) {
        this.f7872a.execSQL(str, objArr);
    }

    @Override // d1.c
    public final boolean yieldIfContendedSafely(long j10) {
        return this.f7872a.yieldIfContendedSafely(j10);
    }

    @Override // d1.c
    public final Cursor query(String str, Object[] objArr) {
        return query(new C0682a(str, objArr));
    }

    @Override // d1.c
    public final Cursor query(final f fVar) {
        return this.f7872a.rawQueryWithFactory(new C0710a(new InterfaceC0652r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$query$cursorFactory$1
            {
                super(4);
            }

            @Override // ca.InterfaceC0652r
            public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                SQLiteQuery sQLiteQuery2 = sQLiteQuery;
                f.this.bindTo(new d(sQLiteQuery2));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery2);
            }
        }, 1), fVar.getSql(), f7871c, null);
    }

    @Override // d1.c
    public final Cursor query(f fVar, CancellationSignal cancellationSignal) {
        String sql = fVar.getSql();
        String[] strArr = f7871c;
        return this.f7872a.rawQueryWithFactory(new C0710a(fVar, 0), sql, strArr, null, cancellationSignal);
    }
}
