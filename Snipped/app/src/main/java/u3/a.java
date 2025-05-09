package U3;

import com.google.gson.g;
import l5.InterfaceC0985a;

/* compiled from: PlanRemoteDataSource.kt */
/* loaded from: classes.dex */
public final class a implements InterfaceC0985a {

    /* renamed from: a, reason: collision with root package name */
    public final G4.a f3666a;

    /* renamed from: b, reason: collision with root package name */
    public final g f3667b;

    public a(G4.a aVar, g gVar) {
        this.f3666a = aVar;
        this.f3667b = gVar;
    }

    @Override // l5.InterfaceC0985a
    public final J5.a a(String str) {
        return X4.a.a(this.f3666a.a(str), this.f3667b, true, new Q3.a(24));
    }

    @Override // l5.InterfaceC0985a
    public final J5.a b(String str) {
        return X4.a.a(this.f3666a.b(str), this.f3667b, true, new Q3.a(23));
    }

    @Override // l5.InterfaceC0985a
    public final J5.a c(String str, String str2) {
        return X4.a.a(this.f3666a.c(str, str2), this.f3667b, true, new Q3.a(25));
    }
}
