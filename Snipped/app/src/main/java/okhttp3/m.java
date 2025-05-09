package okhttp3;

import okio.ByteString;

/* compiled from: RequestBody.kt */
/* loaded from: classes2.dex */
public final class m extends o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f24665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ByteString f24666e;

    public m(i iVar, ByteString byteString) {
        this.f24665d = iVar;
        this.f24666e = byteString;
    }

    @Override // okhttp3.o
    public final long contentLength() {
        return this.f24666e.d();
    }

    @Override // okhttp3.o
    public final i contentType() {
        return this.f24665d;
    }

    @Override // okhttp3.o
    public final void writeTo(Ka.h hVar) {
        hVar.Z(this.f24666e);
    }
}
