package P3;

import c4.C0624a;
import com.google.gson.g;
import f5.InterfaceC0745a;

/* compiled from: CryptoAccountRemoteDataSource.kt */
/* loaded from: classes.dex */
public final class a implements InterfaceC0745a {

    /* renamed from: a, reason: collision with root package name */
    public final B4.a f3071a;

    /* renamed from: b, reason: collision with root package name */
    public final g f3072b;

    public a(B4.a aVar, g gVar) {
        this.f3071a = aVar;
        this.f3072b = gVar;
    }

    @Override // f5.InterfaceC0745a
    public final J5.a a(int i, int i9) {
        return X4.a.a(this.f3071a.a(i, i9), this.f3072b, true, new N3.a(22));
    }

    @Override // f5.InterfaceC0745a
    public final J5.a b(int i) {
        return X4.a.a(this.f3071a.b(i), this.f3072b, true, new N3.a(21));
    }

    @Override // f5.InterfaceC0745a
    public final J5.a c(String str, int i, String str2) {
        return X4.a.a(this.f3071a.c(i, new C0624a(str, str2)), this.f3072b, true, new N3.a(23));
    }
}
