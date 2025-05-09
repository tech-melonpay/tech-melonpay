package V3;

import com.google.gson.g;
import m5.InterfaceC1028a;

/* compiled from: SignerRemoteDataSource.kt */
/* loaded from: classes.dex */
public final class a implements InterfaceC1028a {

    /* renamed from: a, reason: collision with root package name */
    public final H4.a f3724a;

    /* renamed from: b, reason: collision with root package name */
    public final g f3725b;

    public a(H4.a aVar, g gVar) {
        this.f3724a = aVar;
        this.f3725b = gVar;
    }

    @Override // m5.InterfaceC1028a
    public final J5.a a(String str) {
        return X4.a.a(this.f3724a.a(str), this.f3725b, true, new Q3.a(27));
    }

    @Override // m5.InterfaceC1028a
    public final J5.a b(String str) {
        return X4.a.a(this.f3724a.b(str), this.f3725b, true, new Q3.a(29));
    }

    @Override // m5.InterfaceC1028a
    public final J5.a c() {
        return X4.a.a(this.f3724a.c(), this.f3725b, true, new Q3.a(28));
    }

    @Override // m5.InterfaceC1028a
    public final J5.a d(int i, int i9, String str) {
        return X4.a.a(this.f3724a.d(str, i, i9), this.f3725b, true, new Q3.a(26));
    }
}
