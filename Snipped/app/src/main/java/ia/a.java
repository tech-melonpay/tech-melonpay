package Ia;

import java.io.Closeable;
import java.util.zip.Deflater;

/* compiled from: MessageDeflater.kt */
/* loaded from: classes2.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1945a;

    /* renamed from: b, reason: collision with root package name */
    public final Ka.f f1946b;

    /* renamed from: c, reason: collision with root package name */
    public final Deflater f1947c;

    /* renamed from: d, reason: collision with root package name */
    public final Ka.j f1948d;

    public a(boolean z10) {
        this.f1945a = z10;
        Ka.f fVar = new Ka.f();
        this.f1946b = fVar;
        Deflater deflater = new Deflater(-1, true);
        this.f1947c = deflater;
        this.f1948d = new Ka.j(fVar, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1948d.close();
    }
}
