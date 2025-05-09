package e1;

import android.database.sqlite.SQLiteProgram;

/* compiled from: FrameworkSQLiteProgram.kt */
/* loaded from: classes.dex */
public class d implements d1.e {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f20503a;

    public d(SQLiteProgram sQLiteProgram) {
        this.f20503a = sQLiteProgram;
    }

    @Override // d1.e
    public final void bindBlob(int i, byte[] bArr) {
        this.f20503a.bindBlob(i, bArr);
    }

    @Override // d1.e
    public final void bindDouble(int i, double d10) {
        this.f20503a.bindDouble(i, d10);
    }

    @Override // d1.e
    public final void bindLong(int i, long j10) {
        this.f20503a.bindLong(i, j10);
    }

    @Override // d1.e
    public final void bindNull(int i) {
        this.f20503a.bindNull(i);
    }

    @Override // d1.e
    public final void bindString(int i, String str) {
        this.f20503a.bindString(i, str);
    }

    @Override // d1.e
    public final void clearBindings() {
        this.f20503a.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20503a.close();
    }
}
