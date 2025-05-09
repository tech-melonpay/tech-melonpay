package za;

import Ia.d;
import Ka.i;

/* compiled from: RealConnection.kt */
/* loaded from: classes2.dex */
public final class f extends d.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f31403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Ka.h hVar, c cVar) {
        super(iVar, hVar);
        this.f31403d = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f31403d.a(true, true, null);
    }
}
