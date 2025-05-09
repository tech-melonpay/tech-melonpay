package okhttp3;

/* compiled from: RequestBody.kt */
/* loaded from: classes2.dex */
public final class n extends o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f24667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f24669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f24670g;

    public n(i iVar, int i, byte[] bArr, int i9) {
        this.f24667d = iVar;
        this.f24668e = i;
        this.f24669f = bArr;
        this.f24670g = i9;
    }

    @Override // okhttp3.o
    public final long contentLength() {
        return this.f24668e;
    }

    @Override // okhttp3.o
    public final i contentType() {
        return this.f24667d;
    }

    @Override // okhttp3.o
    public final void writeTo(Ka.h hVar) {
        hVar.e0(this.f24670g, this.f24668e, this.f24669f);
    }
}
