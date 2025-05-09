package d1;

import java.io.Closeable;

/* compiled from: SupportSQLiteProgram.kt */
/* loaded from: classes.dex */
public interface e extends Closeable {
    void bindBlob(int i, byte[] bArr);

    void bindDouble(int i, double d10);

    void bindLong(int i, long j10);

    void bindNull(int i);

    void bindString(int i, String str);

    void clearBindings();
}
