package Q3;

import P9.n;
import a4.k;
import a4.l;
import c4.b;
import c4.d;
import com.google.gson.g;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeCreateRequestDomain;
import g5.InterfaceC0766a;
import java.util.ArrayList;
import java.util.Iterator;
import u5.j;
import v5.c;
import v5.e;
import v5.f;
import v5.i;

/* compiled from: CryptowalletRemoteDataSource.kt */
/* loaded from: classes.dex */
public final class b implements InterfaceC0766a {

    /* renamed from: a, reason: collision with root package name */
    public final C4.a f3186a;

    /* renamed from: b, reason: collision with root package name */
    public final g f3187b;

    public b(C4.a aVar, g gVar) {
        this.f3186a = aVar;
        this.f3187b = gVar;
    }

    @Override // g5.InterfaceC0766a
    public final J5.a a(String str, String str2) {
        return X4.a.a(this.f3186a.a(str, str2), this.f3187b, true, new a(1));
    }

    @Override // g5.InterfaceC0766a
    public final J5.a b(int i, int i9) {
        return X4.a.a(this.f3186a.b(i, i9), this.f3187b, true, new a(0));
    }

    @Override // g5.InterfaceC0766a
    public final J5.a c(int i, int i9) {
        return X4.a.a(this.f3186a.c(i, i9), this.f3187b, true, new N3.a(27));
    }

    @Override // g5.InterfaceC0766a
    public final J5.a d(String str) {
        return X4.a.a(this.f3186a.k(str), this.f3187b, true, new N3.a(24));
    }

    @Override // g5.InterfaceC0766a
    public final J5.a e(int i, f fVar) {
        return X4.a.a(this.f3186a.n(i, new d(fVar.f30621a, fVar.f30622b, fVar.f30623c, fVar.f30624d, fVar.f30625e, fVar.f30626f, fVar.f30627g)), this.f3187b, true, new a(4));
    }

    @Override // g5.InterfaceC0766a
    public final J5.a f(int i) {
        return X4.a.a(this.f3186a.e(i, 200), this.f3187b, true, new N3.a(29));
    }

    @Override // g5.InterfaceC0766a
    public final J5.a g(int i, CryptoExchangeCreateRequestDomain cryptoExchangeCreateRequestDomain) {
        b.a aVar;
        CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = cryptoExchangeCreateRequestDomain.i;
        if (externalAccountRequisitesDomain != null) {
            aVar = new b.a(externalAccountRequisitesDomain.f10997a, externalAccountRequisitesDomain.f10998b, externalAccountRequisitesDomain.f10999c, externalAccountRequisitesDomain.f11000d, externalAccountRequisitesDomain.f11001e, externalAccountRequisitesDomain.f11002f, externalAccountRequisitesDomain.f11003g, externalAccountRequisitesDomain.f11004h, externalAccountRequisitesDomain.i, externalAccountRequisitesDomain.f11005j, externalAccountRequisitesDomain.f11006k, externalAccountRequisitesDomain.f11007l);
        } else {
            aVar = null;
        }
        return X4.a.a(this.f3186a.f(i, new c4.b(cryptoExchangeCreateRequestDomain.f10986a, cryptoExchangeCreateRequestDomain.f10987b, cryptoExchangeCreateRequestDomain.f10988c, cryptoExchangeCreateRequestDomain.f10989d, cryptoExchangeCreateRequestDomain.f10990e, cryptoExchangeCreateRequestDomain.f10991f, cryptoExchangeCreateRequestDomain.f10992g, cryptoExchangeCreateRequestDomain.f10993h, aVar, cryptoExchangeCreateRequestDomain.f10994j, cryptoExchangeCreateRequestDomain.f10995k, cryptoExchangeCreateRequestDomain.f10996l)), this.f3187b, true, new N3.a(25));
    }

    @Override // g5.InterfaceC0766a
    public final J5.a h(int i, String str, String str2, Integer num, Integer num2) {
        return X4.a.a(this.f3186a.l(i, str, str2, num, num2), this.f3187b, true, new a(3));
    }

    @Override // g5.InterfaceC0766a
    public final J5.a i(e eVar) {
        return X4.a.a(this.f3186a.h(eVar.f30615a, eVar.f30616b, eVar.f30617c, eVar.f30619e, eVar.f30620f, eVar.f30618d, 50), this.f3187b, true, new N3.a(28));
    }

    @Override // g5.InterfaceC0766a
    public final J5.a j(v5.d dVar) {
        return X4.a.a(this.f3186a.m(dVar.f30610a, new k(dVar.f30611b, dVar.f30612c, dVar.f30613d, dVar.f30614e)), this.f3187b, true, new N3.a(26));
    }

    @Override // g5.InterfaceC0766a
    public final J5.a k(int i, c cVar) {
        return X4.a.a(this.f3186a.d(i, new c4.c(cVar.f30606b, cVar.f30607c, cVar.f30608d, cVar.f30609e)), this.f3187b, true, new a(6));
    }

    @Override // g5.InterfaceC0766a
    public final J5.a l(i iVar) {
        Long l10 = iVar.f30646a;
        ArrayList<j> arrayList = iVar.f30650e;
        ArrayList arrayList2 = new ArrayList(n.u(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Ja.a.Q((j) it.next()));
        }
        return X4.a.a(this.f3186a.g(l10, iVar.f30647b, new l(iVar.f30648c, iVar.f30649d, arrayList2)), this.f3187b, true, new a(7));
    }

    @Override // g5.InterfaceC0766a
    public final J5.a m() {
        return X4.a.a(this.f3186a.j(), this.f3187b, true, new a(2));
    }

    @Override // g5.InterfaceC0766a
    public final J5.a n(int i, int i9, v5.g gVar) {
        ArrayList arrayList;
        ArrayList<j> arrayList2 = gVar.f30634g;
        if (arrayList2 != null) {
            arrayList = new ArrayList(n.u(arrayList2, 10));
            Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(Ja.a.Q((j) it.next()));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList3 = arrayList;
        return X4.a.a(this.f3186a.i(i, i9, new c4.e(gVar.f30630c, gVar.f30631d, gVar.f30632e, gVar.f30633f, arrayList3, gVar.f30635h)), this.f3187b, true, new a(5));
    }
}
