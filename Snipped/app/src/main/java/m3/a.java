package M3;

import J5.a;
import J5.b;
import a4.i;
import a4.m;
import c5.InterfaceC0625a;
import com.google.gson.g;
import s5.h;
import y4.InterfaceC1613a;

/* compiled from: AccountRemoteDataSource.kt */
/* loaded from: classes.dex */
public final class a implements InterfaceC0625a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1613a f2601a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2602b;

    public a(InterfaceC1613a interfaceC1613a, g gVar) {
        this.f2601a = interfaceC1613a;
        this.f2602b = gVar;
    }

    @Override // c5.InterfaceC0625a
    public final J5.a a(String str) {
        return X4.a.a(this.f2601a.a(str), this.f2602b, true, new B8.a(9));
    }

    @Override // c5.InterfaceC0625a
    public final J5.a b() {
        return X4.a.a(this.f2601a.b(), this.f2602b, true, new B8.a(6));
    }

    @Override // c5.InterfaceC0625a
    public final a.C0026a c() {
        return new a.C0026a(new b.c("Functionality in development"));
    }

    @Override // c5.InterfaceC0625a
    public final J5.a d(String str) {
        return X4.a.a(this.f2601a.f(str), this.f2602b, true, new B8.a(5));
    }

    @Override // c5.InterfaceC0625a
    public final J5.a e(int i) {
        return X4.a.a(this.f2601a.e(i), this.f2602b, true, new B8.a(7));
    }

    @Override // c5.InterfaceC0625a
    public final J5.a f(String str, String str2) {
        return X4.a.a(this.f2601a.g(str, str2), this.f2602b, true, new B8.a(4));
    }

    @Override // c5.InterfaceC0625a
    public final a.C0026a g() {
        return new a.C0026a(new b.c("Functionality in development"));
    }

    @Override // c5.InterfaceC0625a
    public final J5.a h(String str, s5.g gVar) {
        return X4.a.a(this.f2601a.c(str, new i(gVar.f26631a, gVar.f26632b)), this.f2602b, true, new B8.a(8));
    }

    @Override // c5.InterfaceC0625a
    public final J5.a i(String str, String str2, h hVar) {
        return X4.a.a(this.f2601a.d(str, str2, new m(hVar.f26633a)), this.f2602b, true, new B8.a(10));
    }
}
