package N3;

import P9.n;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import g4.c;
import h4.i;
import h4.j;
import h4.q;
import i4.C0821a;
import i4.f;
import j4.C0896a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4.C0943a;
import k4.C0944b;
import k4.C0945c;
import k4.d;
import kotlin.collections.EmptyList;
import u4.C1520b;
import u5.e;
import v4.C1544a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2844a;

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        switch (this.f2844a) {
            case 0:
                List<j> list = (List) obj;
                ArrayList arrayList = new ArrayList(n.u(list, 10));
                for (j jVar : list) {
                    arrayList.add(new i(jVar.d(), jVar.e(), jVar.f(), jVar.c(), jVar.g(), K4.a.b(jVar.b())));
                }
                break;
            case 1:
                List<C1520b> b9 = ((C1544a) obj).b();
                if (b9 == null) {
                    b9 = new ArrayList<>();
                }
                break;
            case 2:
                c cVar = (c) obj;
                break;
            case 3:
                List list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(n.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(L4.a.a((q) it.next()));
                }
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                List list3 = (List) obj;
                ArrayList arrayList3 = new ArrayList(n.u(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Ja.a.P((f) it2.next()));
                }
                break;
            case 8:
                List<C0821a.C0407a> b10 = ((C0821a) obj).b();
                if (b10 == null) {
                    b10 = EmptyList.f23104a;
                }
                List<C0821a.C0407a> list4 = b10;
                ArrayList arrayList4 = new ArrayList(n.u(list4, 10));
                for (C0821a.C0407a c0407a : list4) {
                    String b11 = c0407a.b();
                    C0821a.C0407a.b j10 = c0407a.j();
                    e.b bVar = j10 != null ? new e.b(j10.a()) : null;
                    String f10 = c0407a.f();
                    String i = c0407a.i();
                    String c2 = c0407a.c();
                    List<String> h9 = c0407a.h();
                    String e10 = c0407a.e();
                    String d10 = c0407a.d();
                    String g10 = c0407a.g();
                    String k3 = c0407a.k();
                    C0821a.C0407a.C0408a a10 = c0407a.a();
                    arrayList4.add(new e(b11, bVar, f10, i, c2, h9, e10, d10, g10, k3, a10 != null ? new e.a(a10.c(), a10.a(), a10.b(), a10.f(), a10.e(), a10.g(), a10.d()) : null));
                }
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                List list5 = (List) obj;
                ArrayList arrayList5 = new ArrayList(n.u(list5, 10));
                Iterator it3 = list5.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(K4.b.b((i4.b) it3.next()));
                }
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                List list6 = (List) obj;
                ArrayList arrayList6 = new ArrayList(n.u(list6, 10));
                Iterator it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(N4.a.a((C0896a) it4.next()));
                }
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                d dVar = (d) obj;
                break;
            case 25:
                C0943a c0943a = (C0943a) obj;
                k4.f b12 = c0943a.b();
                CryptoExchangeDomain a11 = b12 != null ? O4.b.a(b12) : null;
                C1520b c10 = c0943a.c();
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                List<k4.f> b13 = ((k4.e) obj).b();
                if (b13 != null) {
                    List<k4.f> list7 = b13;
                    ArrayList arrayList7 = new ArrayList(n.u(list7, 10));
                    Iterator<T> it5 = list7.iterator();
                    while (it5.hasNext()) {
                        arrayList7.add(O4.b.a((k4.f) it5.next()));
                    }
                    break;
                } else {
                    break;
                }
            default:
                ArrayList<C0944b> b14 = ((C0945c) obj).b();
                if (b14 != null) {
                    ArrayList arrayList8 = new ArrayList(n.u(b14, 10));
                    Iterator<T> it6 = b14.iterator();
                    while (it6.hasNext()) {
                        arrayList8.add(O4.a.a((C0944b) it6.next()));
                    }
                    break;
                } else {
                    break;
                }
        }
        return EmptyList.f23104a;
    }
}
