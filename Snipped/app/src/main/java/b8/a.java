package B8;

import C.v;
import D9.b;
import K8.c;
import O9.p;
import P9.n;
import P9.s;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cards.DailyLimitDomain;
import com.luminary.business.domain.entity.cards.TopUpCommissionDomain;
import f4.C0744a;
import f4.h;
import g4.C0765a;
import h4.d;
import h4.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0969n;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import s5.e;
import s5.f;
import t5.j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f461a;

    public /* synthetic */ a(int i) {
        this.f461a = i;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        switch (this.f461a) {
            case 0:
                String str = (String) obj;
                return C0969n.Y(str, "/", false) ? s.P(C0969n.r0(str, new String[]{"/"}), "/", null, null, new a(1), 30) : b.C0(str);
            case 1:
                return b.C0((String) obj);
            case 2:
                return p.f3034a;
            case 3:
                fb.a aVar = (fb.a) obj;
                c cVar = new c(0);
                Kind kind = Kind.f25549b;
                EmptyList emptyList = EmptyList.f23104a;
                aVar.a(new db.a(new BeanDefinition(h.a(K8.a.class), null, cVar, kind, emptyList)));
                SingleInstanceFactory<?> v10 = v.v(new BeanDefinition(h.a(D8.a.class), null, new c(1), Kind.f25548a, emptyList), aVar);
                if (aVar.f20722a) {
                    aVar.b(v10);
                }
                return p.f3034a;
            case 4:
                return K4.a.a((C0744a) obj);
            case 5:
                ArrayList b9 = K4.a.b((List) obj);
                return b9 == null ? new ArrayList() : b9;
            case 6:
                return Ja.a.G((List) obj);
            case 7:
                f4.h hVar = (f4.h) obj;
                ArrayList arrayList = new ArrayList();
                List<h.a> b10 = hVar.b();
                if (b10 != null) {
                    List<h.a> list = b10;
                    ArrayList arrayList2 = new ArrayList(n.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(K4.c.a((h.a) it.next()));
                    }
                    arrayList.addAll(arrayList2);
                }
                List<h.a> c2 = hVar.c();
                if (c2 != null) {
                    List<h.a> list2 = c2;
                    ArrayList arrayList3 = new ArrayList(n.u(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(K4.c.a((h.a) it2.next()));
                    }
                    arrayList.addAll(arrayList3);
                }
                return arrayList;
            case 8:
                f4.c cVar2 = (f4.c) obj;
                return new f(cVar2.e(), cVar2.b(), cVar2.f(), cVar2.d(), cVar2.g(), cVar2.h(), cVar2.c());
            case 9:
                f4.b bVar = (f4.b) obj;
                return new e(bVar.e(), bVar.b(), bVar.f(), bVar.d(), bVar.g(), bVar.h(), bVar.c());
            case 10:
                return K4.a.a((C0744a) obj);
            case 11:
                return Ja.a.D((d) obj);
            case 12:
                return L4.a.a((q) obj);
            case 13:
                List list3 = (List) obj;
                ArrayList arrayList4 = new ArrayList(n.u(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(Ja.a.D((d) it3.next()));
                }
                return arrayList4;
            case 14:
                return Ja.a.D((d) obj);
            case 15:
                return Ja.a.D((d) obj);
            case 16:
                g4.d dVar = (g4.d) obj;
                return new j(dVar.i(), dVar.d(), dVar.l(), dVar.j(), dVar.c(), dVar.h(), dVar.b(), dVar.f(), dVar.m(), dVar.k(), dVar.e(), dVar.g());
            case 17:
                h4.n nVar = (h4.n) obj;
                return new TopUpCommissionDomain(nVar.c(), nVar.b(), nVar.d());
            case 18:
                return new DailyLimitDomain(((h4.f) obj).b());
            case 19:
                return Ja.a.O((h4.p) obj);
            case 20:
                return Ja.a.D((d) obj);
            case 21:
                return Ja.a.D((d) obj);
            case 22:
                return Ja.a.J((n4.b) obj);
            case 23:
                h4.n nVar2 = (h4.n) obj;
                return new TopUpCommissionDomain(nVar2.c(), nVar2.b(), nVar2.d());
            case 24:
                ArrayList<C0765a> b11 = ((g4.b) obj).b();
                ArrayList arrayList5 = new ArrayList(n.u(b11, 10));
                Iterator<T> it4 = b11.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(Ja.a.E((C0765a) it4.next()));
                }
                return arrayList5;
            case 25:
                return Ja.a.J((n4.b) obj);
            case 26:
                ArrayList<C0765a> b12 = ((g4.b) obj).b();
                ArrayList arrayList6 = new ArrayList(n.u(b12, 10));
                Iterator<T> it5 = b12.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(Ja.a.E((C0765a) it5.next()));
                }
                return arrayList6;
            case 27:
                return Ja.a.O((h4.p) obj);
            case 28:
                return Ja.a.D((d) obj);
            default:
                return L4.a.a((q) obj);
        }
    }
}
