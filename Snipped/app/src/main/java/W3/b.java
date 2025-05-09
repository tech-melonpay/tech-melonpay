package W3;

import I5.o;
import I5.p;
import I5.s;
import P9.n;
import P9.z;
import c4.b;
import ca.InterfaceC0646l;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.l;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeCreateRequestDomain;
import com.luminary.business.domain.entity.templates.CheckRequisitesDomain;
import f4.i;
import h4.C0796a;
import h4.h;
import i4.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.f;
import r4.g;
import s5.C1205a;
import s5.j;
import s5.k;
import s5.m;
import u4.C1519a;
import u4.C1520b;
import v4.d;
import w4.C1569a;
import w4.C1570b;
import w4.C1571c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3808a;

    public /* synthetic */ b(int i) {
        this.f3808a = i;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        String str;
        C1205a c1205a;
        j jVar;
        m mVar;
        ArrayList arrayList;
        k kVar;
        String str2;
        ArrayList arrayList2;
        switch (this.f3808a) {
            case 0:
                return U4.b.H(((V4.a) obj).a());
            case 1:
                return U4.b.G((C1520b) obj);
            case 2:
                return U4.b.G((C1520b) obj);
            case 3:
                return U4.b.G((C1520b) obj);
            case 4:
                return U4.b.K((d) obj);
            case 5:
                C1519a c1519a = (C1519a) obj;
                String d10 = c1519a.d();
                String e10 = c1519a.e();
                Boolean c2 = c1519a.c();
                HashMap<String, b.a> f10 = c1519a.f();
                LinkedHashMap linkedHashMap = null;
                if (f10 != null && !f10.isEmpty()) {
                    HashMap<String, b.a> f11 = c1519a.f();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(z.n(f11.size()));
                    Iterator<T> it = f11.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object key = entry.getKey();
                        b.a aVar = (b.a) entry.getValue();
                        linkedHashMap2.put(key, aVar != null ? new CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain(aVar.a(), aVar.i(), aVar.l(), aVar.g(), aVar.h(), aVar.f(), aVar.b(), aVar.k(), aVar.c(), aVar.j(), aVar.d(), aVar.e()) : null);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new CheckRequisitesDomain(d10, e10, c2, linkedHashMap, c1519a.b());
            case 6:
                List<d> a10 = ((v4.c) obj).a();
                if (a10 == null) {
                    return EmptyList.f23104a;
                }
                List<d> list = a10;
                ArrayList arrayList3 = new ArrayList(n.u(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(U4.b.K((d) it2.next()));
                }
                return arrayList3;
            case 7:
                g gVar = (g) obj;
                return new o(gVar.a(), gVar.c(), gVar.b());
            case 8:
                G5.a aVar2 = new G5.a(0);
                G5.a aVar3 = aVar2;
                for (e4.c cVar : (List) obj) {
                    if (f.b(cVar.a(), "support_email")) {
                        aVar3 = G5.a.a(aVar3, cVar.c(), null, null, null, 14);
                    }
                    if (f.b(cVar.a(), "useful_links")) {
                        l b9 = cVar.b();
                        b9.getClass();
                        if (!(b9 instanceof com.google.gson.j)) {
                            throw new IllegalStateException("Not a JSON Array: " + b9);
                        }
                        Iterator<l> it3 = ((com.google.gson.j) b9).f10406a.iterator();
                        while (true) {
                            G5.a aVar4 = aVar3;
                            while (it3.hasNext()) {
                                l next = it3.next();
                                next.getClass();
                                if (!(next instanceof com.google.gson.n)) {
                                    throw new IllegalStateException("Not a JSON Object: " + next);
                                }
                                LinkedTreeMap<String, l> linkedTreeMap = ((com.google.gson.n) next).f10408a;
                                String a11 = linkedTreeMap.get("type").a();
                                String a12 = linkedTreeMap.get(ImagesContract.URL).a();
                                if (a11 != null) {
                                    int hashCode = a11.hashCode();
                                    if (hashCode != 926873033) {
                                        if (hashCode != 1248254064) {
                                            if (hashCode == 1867767661 && a11.equals("cookie_policy")) {
                                                aVar3 = G5.a.a(aVar4, null, a12, null, null, 13);
                                            }
                                        } else if (a11.equals("terms_conditions")) {
                                            aVar3 = G5.a.a(aVar4, null, null, null, a12, 7);
                                        }
                                    } else if (a11.equals("privacy_policy")) {
                                        aVar3 = G5.a.a(aVar4, null, null, a12, null, 11);
                                    }
                                }
                            }
                            aVar3 = aVar4;
                        }
                    }
                }
                return aVar3;
            case 9:
                String a13 = ((r4.f) obj).a();
                return a13 == null ? " " : a13;
            case 10:
                String b10 = ((r4.f) obj).b();
                return b10 == null ? "" : b10;
            case 11:
                return new I5.f(((C1569a) obj).b());
            case 12:
                return U4.b.I((r4.d) obj);
            case 13:
                return U4.b.I((r4.d) obj);
            case 14:
                return U4.a.a((h) obj);
            case 15:
                return Ja.a.G((List) obj);
            case 16:
                return new I5.c(((r4.a) obj).a());
            case 17:
                return U4.b.I((r4.d) obj);
            case 18:
                List<i> list2 = (List) obj;
                ArrayList arrayList4 = new ArrayList(n.u(list2, 10));
                for (i iVar : list2) {
                    String b11 = iVar.b();
                    i.a c10 = iVar.c();
                    arrayList4.add(new p(b11, new p.a(new p.a.C0022a(c10.a().a()), new p.a.C0022a(c10.b().a()))));
                }
                return arrayList4;
            case 19:
                e.a a14 = ((e) obj).a();
                return Boolean.valueOf(f.b(a14 != null ? a14.a() : null, "ok"));
            case 20:
                f4.g gVar2 = (f4.g) obj;
                return new s5.i(gVar2.f(), gVar2.b(), gVar2.c(), gVar2.e(), gVar2.d());
            case 21:
                return U4.b.I((r4.d) obj);
            case 22:
                f4.g gVar3 = (f4.g) obj;
                return new s5.i(gVar3.f(), gVar3.b(), gVar3.c(), gVar3.e(), gVar3.d());
            case 23:
                return U4.b.I((r4.d) obj);
            case 24:
                return U4.b.F((r4.b) obj);
            case 25:
                f4.f fVar = (f4.f) obj;
                String c11 = fVar.c();
                C0796a b12 = fVar.b();
                if (b12 != null) {
                    String l10 = b12.l();
                    Integer f12 = b12.f();
                    String e11 = b12.e();
                    String g10 = b12.g();
                    String j10 = b12.j();
                    Integer c12 = b12.c();
                    h4.g k3 = b12.k();
                    if (k3 != null) {
                        h4.b a15 = k3.a();
                        s5.c cVar2 = a15 != null ? new s5.c(a15.a(), a15.b(), a15.c()) : null;
                        h4.b b13 = k3.b();
                        s5.c cVar3 = b13 != null ? new s5.c(b13.a(), b13.b(), b13.c()) : null;
                        h4.b c13 = k3.c();
                        jVar = new j(cVar2, cVar3, c13 != null ? new s5.c(c13.a(), c13.b(), c13.c()) : null);
                    } else {
                        jVar = null;
                    }
                    String p10 = b12.p();
                    Boolean i = b12.i();
                    h4.m r8 = b12.r();
                    if (r8 != null) {
                        h4.l a16 = r8.a();
                        s5.l lVar = a16 != null ? new s5.l(a16.b(), a16.a()) : null;
                        h4.l b14 = r8.b();
                        mVar = new m(lVar, b14 != null ? new s5.l(b14.b(), b14.a()) : null);
                    } else {
                        mVar = null;
                    }
                    String m2 = b12.m();
                    Integer t3 = b12.t();
                    List<h4.d> d11 = b12.d();
                    if (d11 != null) {
                        List<h4.d> list3 = d11;
                        str = c11;
                        ArrayList arrayList5 = new ArrayList(n.u(list3, 10));
                        Iterator<T> it4 = list3.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(Ja.a.D((h4.d) it4.next()));
                        }
                        arrayList = arrayList5;
                    } else {
                        str = c11;
                        arrayList = null;
                    }
                    Integer s10 = b12.s();
                    Boolean n10 = b12.n();
                    String q10 = b12.q();
                    Boolean h9 = b12.h();
                    h4.k o10 = b12.o();
                    k kVar2 = o10 != null ? new k(o10.a(), o10.b(), o10.c()) : null;
                    List<h4.c> b15 = b12.b();
                    if (b15 != null) {
                        List<h4.c> list4 = b15;
                        arrayList2 = new ArrayList(n.u(list4, 10));
                        Iterator it5 = list4.iterator();
                        while (it5.hasNext()) {
                            h4.c cVar4 = (h4.c) it5.next();
                            arrayList2.add(new s5.d(cVar4.c(), cVar4.d(), cVar4.e(), cVar4.b()));
                            it5 = it5;
                            kVar2 = kVar2;
                            m2 = m2;
                        }
                        kVar = kVar2;
                        str2 = m2;
                    } else {
                        kVar = kVar2;
                        str2 = m2;
                        arrayList2 = null;
                    }
                    c1205a = new C1205a(l10, f12, e11, g10, j10, c12, jVar, p10, i, mVar, str2, t3, arrayList, s10, n10, q10, h9, kVar, arrayList2);
                } else {
                    str = c11;
                    c1205a = null;
                }
                return new I5.e(str, c1205a);
            case 26:
                HashMap<String, C1571c> b16 = ((C1570b) obj).b();
                C1571c c1571c = b16 != null ? b16.get("android") : null;
                return new s(c1571c != null ? c1571c.b() : null, c1571c != null ? c1571c.a() : null, c1571c != null ? c1571c.c() : null);
            case 27:
                return ((f4.d) obj).toString();
            case 28:
                String b17 = ((r4.f) obj).b();
                return b17 == null ? "" : b17;
            default:
                return U4.b.I((r4.d) obj);
        }
    }
}
