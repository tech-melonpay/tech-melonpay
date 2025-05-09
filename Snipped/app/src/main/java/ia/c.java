package Ia;

import Ka.o;
import Ka.t;
import java.io.Closeable;
import java.util.zip.Inflater;

/* compiled from: MessageInflater.kt */
/* loaded from: classes2.dex */
public final class c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1950a;

    /* renamed from: b, reason: collision with root package name */
    public final Ka.f f1951b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f1952c;

    /* renamed from: d, reason: collision with root package name */
    public final o f1953d;

    public c(boolean z10) {
        this.f1950a = z10;
        Ka.f fVar = new Ka.f();
        this.f1951b = fVar;
        Inflater inflater = new Inflater(true);
        this.f1952c = inflater;
        this.f1953d = new o(new t(fVar), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1953d.close();
    }
}
