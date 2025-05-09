package okhttp3;

import Ka.z;
import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;

/* compiled from: RequestBody.kt */
/* loaded from: classes2.dex */
public final class l extends o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f24655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ File f24656e;

    public l(i iVar, File file) {
        this.f24655d = iVar;
        this.f24656e = file;
    }

    @Override // okhttp3.o
    public final long contentLength() {
        return this.f24656e.length();
    }

    @Override // okhttp3.o
    public final i contentType() {
        return this.f24655d;
    }

    @Override // okhttp3.o
    public final void writeTo(Ka.h hVar) {
        Logger logger = Ka.p.f2319a;
        Ka.d dVar = new Ka.d(1, new FileInputStream(this.f24656e), z.f2346d);
        try {
            hVar.c0(dVar);
            U4.b.d(dVar, null);
        } finally {
        }
    }
}
