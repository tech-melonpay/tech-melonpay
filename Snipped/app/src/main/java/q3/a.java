package Q3;

import B5.h;
import C.N;
import C.v;
import P9.n;
import android.text.TextUtils;
import ca.InterfaceC0646l;
import com.bumptech.glide.load.Key;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4.C0944b;
import k4.f;
import k4.g;
import ka.C0969n;
import ka.InterfaceC0960e;
import l4.C0984a;
import m4.C1027a;
import o4.C1089a;
import p4.c;
import p4.e;
import t4.d;
import t4.e;
import v5.C1545a;
import v5.h;
import y5.C1614a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3185a;

    public /* synthetic */ a(int i) {
        this.f3185a = i;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        String requestContentType;
        e a10;
        ArrayList<d> a11;
        switch (this.f3185a) {
            case 0:
                return O4.a.a((C0944b) obj);
            case 1:
                return O4.b.a((f) obj);
            case 2:
                C0984a c0984a = (C0984a) obj;
                ArrayList<l4.b> c2 = c0984a.c();
                ArrayList arrayList2 = new ArrayList(n.u(c2, 10));
                Iterator<T> it = c2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Ja.a.H((l4.b) it.next()));
                }
                ArrayList<l4.b> b9 = c0984a.b();
                ArrayList arrayList3 = new ArrayList(n.u(b9, 10));
                Iterator<T> it2 = b9.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Ja.a.H((l4.b) it2.next()));
                }
                return new C1545a(arrayList2, arrayList3);
            case 3:
                return O4.b.a((f) obj);
            case 4:
                g gVar = (g) obj;
                return new h(gVar.l(), gVar.g(), gVar.h(), gVar.k(), gVar.f(), gVar.b(), gVar.c(), gVar.e(), gVar.d(), gVar.j(), gVar.i());
            case 5:
                return O4.b.a((f) obj);
            case 6:
                return O4.b.a((f) obj);
            case 7:
                return O4.a.a((C0944b) obj);
            case 8:
                List<C1027a> list = (List) obj;
                ArrayList arrayList4 = new ArrayList(n.u(list, 10));
                for (C1027a c1027a : list) {
                    arrayList4.add(new C1614a(c1027a.c(), c1027a.b()));
                }
                return arrayList4;
            case 9:
                List r02 = C0969n.r0((String) obj, new String[]{"="});
                return v.p((String) r02.get(0), ": ", r02.size() > 1 ? URLDecoder.decode((String) r02.get(1), Key.STRING_CHARSET_NAME) : "");
            case 10:
                return Integer.valueOf(((InterfaceC0960e) obj).b().f21226a);
            case 11:
                List list2 = (List) obj;
                ArrayList arrayList5 = new ArrayList(n.u(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(Ja.a.K((C1089a) it3.next()));
                }
                return arrayList5;
            case 12:
                String str = (String) obj;
                N n10 = Ja.a.f2210a;
                if (n10 != null) {
                    return (str == null || C0969n.i0(str)) ? ((ChuckerDatabase) n10.f535b).a().d() : TextUtils.isDigitsOnly(str) ? n10.h(str, "") : n10.h("", str);
                }
                throw new IllegalStateException("You can't access the transaction repository if you don't initialize it!".toString());
            case 13:
                return Ja.a.L((p4.d) obj);
            case 14:
                return Ja.a.L((p4.d) obj);
            case 15:
                return Ja.a.L((p4.d) obj);
            case 16:
                p4.e eVar = (p4.e) obj;
                String g10 = eVar.g();
                List<e.a> f10 = eVar.f();
                if (f10 != null) {
                    List<e.a> list3 = f10;
                    arrayList = new ArrayList(n.u(list3, 10));
                    for (e.a aVar : list3) {
                        arrayList.add(new h.a(aVar.h(), aVar.m(), aVar.o(), aVar.i(), aVar.l(), aVar.g(), aVar.c(), aVar.b(), aVar.e(), aVar.d(), aVar.j(), aVar.a(), aVar.n(), aVar.k(), aVar.f()));
                    }
                } else {
                    arrayList = null;
                }
                return new B5.h(g10, arrayList, eVar.b(), eVar.m(), eVar.k(), eVar.h(), eVar.j(), eVar.c(), eVar.d(), eVar.l(), eVar.i(), eVar.e());
            case 17:
                c cVar = (c) obj;
                return new B5.c(cVar.c(), cVar.b());
            case 18:
                return Ja.a.L((p4.d) obj);
            case 19:
                return Ja.a.L((p4.d) obj);
            case 20:
                p4.a aVar2 = (p4.a) obj;
                return new B5.a(aVar2.b(), aVar2.f(), aVar2.e(), aVar2.d(), aVar2.c());
            case 21:
                HttpTransaction httpTransaction = (HttpTransaction) obj;
                boolean z10 = false;
                if (httpTransaction != null && !kotlin.jvm.internal.f.b(httpTransaction.getFormattedPath(true), httpTransaction.getFormattedPath(false))) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 22:
                HttpTransaction httpTransaction2 = (HttpTransaction) obj;
                return Boolean.valueOf((httpTransaction2 == null || (requestContentType = httpTransaction2.getRequestContentType()) == null) ? false : C0969n.Y(requestContentType, "x-www-form-urlencoded", true));
            case 23:
                List list4 = (List) obj;
                ArrayList arrayList6 = new ArrayList(n.u(list4, 10));
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(Ja.a.M((q4.a) it4.next()));
                }
                return arrayList6;
            case 24:
                return Ja.a.M((q4.a) obj);
            case 25:
                return Ja.a.M((q4.a) obj);
            case 26:
                return O4.b.a((f) obj);
            case 27:
                t4.b a12 = ((t4.a) obj).a();
                if (a12 == null || (a10 = a12.a()) == null || (a11 = a10.a()) == null) {
                    return new ArrayList();
                }
                ArrayList arrayList7 = new ArrayList(n.u(a11, 10));
                for (d dVar : a11) {
                    arrayList7.add(new E5.a(dVar.b(), dVar.c(), dVar.a()));
                }
                return arrayList7;
            case 28:
                String a13 = ((r5.c) obj).a();
                return a13 == null ? "" : a13;
            default:
                return new E5.b(((t4.c) obj).a());
        }
    }
}
