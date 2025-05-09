package S3;

import com.google.gson.g;
import j5.InterfaceC0897a;

/* compiled from: LoansRemoteDataSource.kt */
/* loaded from: classes.dex */
public final class a implements InterfaceC0897a {

    /* renamed from: a, reason: collision with root package name */
    public final E4.a f3375a;

    /* renamed from: b, reason: collision with root package name */
    public final g f3376b;

    public a(E4.a aVar, g gVar) {
        this.f3375a = aVar;
        this.f3376b = gVar;
    }

    @Override // j5.InterfaceC0897a
    public final J5.a a(String str) {
        return X4.a.a(this.f3375a.a(str), this.f3376b, true, new Q3.a(11));
    }

    @Override // j5.InterfaceC0897a
    public final Object b() {
        throw null;
    }
}
