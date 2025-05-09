package N3;

import J5.a;
import J5.b;
import a4.j;
import b4.C0587a;
import b4.d;
import b4.e;
import b4.h;
import com.google.gson.g;
import com.luminary.business.domain.entity.cards.BankTopUpRequestDomain;
import com.luminary.business.domain.entity.cards.VaultTopUpRequestDomain;
import d4.C0685a;
import d5.InterfaceC0686a;
import t5.C1280a;
import t5.c;
import t5.e;
import t5.f;
import t5.i;
import z4.InterfaceC1644a;
import z5.C1645a;

/* compiled from: CardRemoteDataSource.kt */
/* loaded from: classes.dex */
public final class b implements InterfaceC0686a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1644a f2845a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2846b;

    public b(InterfaceC1644a interfaceC1644a, g gVar) {
        this.f2845a = interfaceC1644a;
        this.f2846b = gVar;
    }

    @Override // d5.InterfaceC0686a
    public final J5.a a(String str, String str2) {
        return X4.a.a(this.f2845a.a(str, str2), this.f2846b, true, new B8.a(15));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a b(String str, String str2) {
        return X4.a.a(this.f2845a.b(str, str2), this.f2846b, true, new B8.a(11));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a c(String str, String str2) {
        return X4.a.a(this.f2845a.c(str, str2), this.f2846b, true, new B8.a(14));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a d(String str) {
        return X4.a.a(this.f2845a.d(str), this.f2846b, true, new a(3));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a e(String str, String str2) {
        return X4.a.a(this.f2845a.o(str, str2), this.f2846b, true, new B8.a(21));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a f(String str, Integer num, Boolean bool) {
        return X4.a.a(this.f2845a.w(str, num, bool), this.f2846b, true, new B8.a(13));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a g(int i, VaultTopUpRequestDomain vaultTopUpRequestDomain) {
        return X4.a.a(this.f2845a.k(String.valueOf(i), new h(vaultTopUpRequestDomain.f10801b, vaultTopUpRequestDomain.f10802c, vaultTopUpRequestDomain.f10803d)), this.f2846b, true, new B8.a(27));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a h(String str, String str2, c cVar) {
        return X4.a.a(this.f2845a.f(str, str2, new d(cVar.f27527a, cVar.f27528b, cVar.f27529c, cVar.f27530d)), this.f2846b, true, new B8.a(16));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a i(int i, int i9, String str) {
        return X4.a.a(this.f2845a.r(str, i, i9, 50), this.f2846b, true, new B8.a(24));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a j(i iVar) {
        return X4.a.a(this.f2845a.p(iVar.f27549a, iVar.f27550b, new b4.g(iVar.f27551c, iVar.f27552d, iVar.f27553e)), this.f2846b, true, new B8.a(20));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a k(int i, String str) {
        return X4.a.a(this.f2845a.m(str, i), this.f2846b, true, new B8.a(18));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a l(int i, BankTopUpRequestDomain bankTopUpRequestDomain) {
        return X4.a.a(this.f2845a.q(String.valueOf(i), new C0587a(bankTopUpRequestDomain.f10746b, bankTopUpRequestDomain.f10747c, bankTopUpRequestDomain.f10748d)), this.f2846b, true, new B8.a(19));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a m(int i, String str) {
        return X4.a.a(this.f2845a.u(str, i), this.f2846b, true, new B8.a(25));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a n(String str, String str2) {
        return X4.a.a(this.f2845a.v(str, str2), this.f2846b, true, new a(1));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a o(f fVar) {
        return X4.a.a(this.f2845a.j(String.valueOf(fVar.f27543a), String.valueOf(fVar.f27544b), new e(fVar.f27545c)), this.f2846b, true, new B8.a(28));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a p(String str, int i, z5.d dVar) {
        return X4.a.a(this.f2845a.x(str, i, new d4.b(dVar.f31309a, dVar.f31310b, dVar.f31311c, dVar.f31312d, dVar.f31313e, dVar.f31314f, dVar.f31315g, dVar.f31316h, dVar.i, dVar.f31317j, dVar.f31318k, dVar.f31319l, dVar.f31320m, dVar.f31321n, dVar.f31322o, dVar.f31323p, dVar.f31324q, dVar.f31325r)), this.f2846b, true, new B8.a(22));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a q(int i, String str) {
        return X4.a.a(this.f2845a.y(str, i), this.f2846b, true, new a(2));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a r(int i, int i9, String str) {
        return X4.a.a(this.f2845a.s(str, i, i9, 50), this.f2846b, true, new B8.a(26));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a s(String str, int i, C1645a c1645a) {
        return X4.a.a(this.f2845a.t(str, i, new C0685a(c1645a.f31279a, c1645a.f31280b, c1645a.f31281c, c1645a.f31282d)), this.f2846b, true, new a(5));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a t(String str, C1280a c1280a) {
        return X4.a.a(this.f2845a.n(str, new b4.b(c1280a.f27518a, c1280a.f27519b, c1280a.f27521d, c1280a.f27520c, c1280a.f27522e, c1280a.f27523f, c1280a.f27524g)), this.f2846b, true, new B8.a(12));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a u(String str, t5.e eVar) {
        j.a aVar;
        e.a aVar2 = eVar.f27536d;
        if (aVar2 != null) {
            aVar = new j.a(aVar2.f27538a, aVar2.f27539b, aVar2.f27540c, aVar2.f27541d, aVar2.f27542e);
        } else {
            aVar = null;
        }
        return X4.a.a(this.f2845a.i(str, new j(eVar.f27533a, eVar.f27534b, eVar.f27535c, aVar, eVar.f27537e)), this.f2846b, true, new a(4));
    }

    @Override // d5.InterfaceC0686a
    public final a.C0026a v() {
        return new a.C0026a(new b.c("Functionality in development"));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a w(int i) {
        return X4.a.a(this.f2845a.g(String.valueOf(i)), this.f2846b, true, new a(0));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a x(t5.g gVar) {
        return X4.a.a(this.f2845a.h(String.valueOf(gVar.f27546a), gVar.f27547b, new b4.f(gVar.f27548c)), this.f2846b, true, new B8.a(29));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a y(String str, t5.b bVar) {
        return X4.a.a(this.f2845a.e(str, new b4.c(bVar.f27525a, bVar.f27526b)), this.f2846b, true, new B8.a(23));
    }

    @Override // d5.InterfaceC0686a
    public final J5.a z(int i, BankTopUpRequestDomain bankTopUpRequestDomain) {
        return X4.a.a(this.f2845a.l(String.valueOf(i), new C0587a(bankTopUpRequestDomain.f10746b, bankTopUpRequestDomain.f10747c, bankTopUpRequestDomain.f10748d)), this.f2846b, true, new B8.a(17));
    }
}
