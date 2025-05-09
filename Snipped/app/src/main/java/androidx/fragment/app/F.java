package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter.java */
/* loaded from: classes.dex */
public final class F extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f6676b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f6675a = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d();
    }

    public final void d() {
        StringBuilder sb2 = this.f6676b;
        if (sb2.length() > 0) {
            Log.d(this.f6675a, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        d();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            char c2 = cArr[i + i10];
            if (c2 == '\n') {
                d();
            } else {
                this.f6676b.append(c2);
            }
        }
    }
}
