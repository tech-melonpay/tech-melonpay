package O3;

import a4.C0510a;
import a4.b;
import a4.e;
import a4.h;
import a4.n;
import com.google.gson.g;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import e5.InterfaceC0716a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u5.C1521a;
import u5.b;
import u5.c;
import u5.j;

/* compiled from: CompanyRemoteDataSource.kt */
/* loaded from: classes.dex */
public final class a implements InterfaceC0716a {

    /* renamed from: a, reason: collision with root package name */
    public final A4.a f2957a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2958b;

    public a(A4.a aVar, g gVar) {
        this.f2957a = aVar;
        this.f2958b = gVar;
    }

    @Override // e5.InterfaceC0716a
    public final J5.a a(String str) {
        return X4.a.a(this.f2957a.a(str), this.f2958b, true, new N3.a(7));
    }

    @Override // e5.InterfaceC0716a
    public final J5.a b(String str) {
        return X4.a.a(this.f2957a.b(str), this.f2958b, true, new N3.a(14));
    }

    @Override // e5.InterfaceC0716a
    public final J5.a c(u5.g gVar) {
        boolean z10 = gVar.f30304u;
        g gVar2 = this.f2958b;
        A4.a aVar = this.f2957a;
        if (!z10) {
            return X4.a.a(aVar.d(M4.a.b(gVar)), gVar2, true, new N3.a(10));
        }
        return X4.a.a(aVar.m(gVar.f30305v, M4.a.b(gVar)), gVar2, true, new N3.a(9));
    }

    @Override // e5.InterfaceC0716a
    public final J5.a d(String str) {
        return X4.a.a(this.f2957a.e(str), this.f2958b, true, new N3.a(8));
    }

    @Override // e5.InterfaceC0716a
    public final J5.a e(String str, c cVar) {
        return X4.a.a(this.f2957a.i(str, new e(cVar.f30231a, cVar.f30232b, cVar.f30233c, cVar.f30234d, cVar.f30235e, cVar.f30236f)), this.f2958b, true, new N3.a(12));
    }

    @Override // e5.InterfaceC0716a
    public final J5.a f(String str, String str2, b bVar) {
        return X4.a.a(this.f2957a.o(str, str2, M4.a.a(bVar)), this.f2958b, true, new N3.a(18));
    }

    @Override // e5.InterfaceC0716a
    public final J5.a g(String str) {
        return X4.a.a(this.f2957a.j(str, new n()), this.f2958b, true, new N3.a(19));
    }

    @Override // e5.InterfaceC0716a
    public final J5.a h(String str, b bVar) {
        return X4.a.a(this.f2957a.f(str, M4.a.a(bVar)), this.f2958b, true, new N3.a(6));
    }

    @Override // e5.InterfaceC0716a
    public final J5.a i(String str) {
        return X4.a.a(this.f2957a.l(str, new h(0)), this.f2958b, true, new N3.a(16));
    }

    @Override // e5.InterfaceC0716a
    public final J5.a j() {
        return X4.a.a(this.f2957a.g(), this.f2958b, true, new N3.a(13));
    }

    @Override // e5.InterfaceC0716a
    public final J5.a k(String str, com.luminary.business.domain.entity.company.b bVar) {
        List<CorporateDetailsDomain.a.C0113a> list = bVar.f10960g;
        ArrayList arrayList = new ArrayList(P9.n.u(list, 10));
        for (CorporateDetailsDomain.a.C0113a c0113a : list) {
            String str2 = c0113a.f10939a;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = c0113a.f10940b;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c0113a.f10941c;
            if (str5 != null) {
                str3 = str5;
            }
            arrayList.add(new C0510a.C0055a(str2, str4, str3));
        }
        Long l10 = bVar.f10959f;
        List<String> list2 = bVar.f10961h;
        Long l11 = bVar.f10954a;
        return X4.a.a(this.f2957a.k(str, new C0510a(bVar.f10955b, bVar.f10956c, bVar.f10957d, l11, l10, bVar.f10958e, arrayList, list2, bVar.i, bVar.f10962j)), this.f2958b, true, new N3.a(20));
    }

    @Override // e5.InterfaceC0716a
    public final J5.a l(String str, C1521a c1521a) {
        return X4.a.a(this.f2957a.n(str, new a4.c(c1521a.f30208a, c1521a.f30209b, c1521a.f30210c, c1521a.f30211d, c1521a.f30212e, c1521a.f30213f, c1521a.f30214g, c1521a.f30215h)), this.f2958b, true, new N3.a(15));
    }

    @Override // e5.InterfaceC0716a
    public final J5.a m(String str, j jVar) {
        return X4.a.a(this.f2957a.h(str, Ja.a.Q(jVar)), this.f2958b, true, new N3.a(17));
    }

    @Override // e5.InterfaceC0716a
    public final J5.a n(String str, com.luminary.business.domain.entity.company.a aVar) {
        b.a aVar2;
        List<CorporateDetailsDomain.a.b> list = aVar.f10953b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            b.a aVar3 = null;
            if (!it.hasNext()) {
                break;
            }
            CorporateDetailsDomain.a.b bVar = (CorporateDetailsDomain.a.b) it.next();
            if (bVar != null) {
                String str2 = bVar.f10942a;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = bVar.f10943b;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = bVar.f10944c;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = bVar.f10945d;
                aVar3 = new b.a(str2, str3, str4, str5 != null ? str5 : "");
            }
            if (aVar3 != null) {
                arrayList.add(aVar3);
            }
        }
        List<CorporateDetailsDomain.a.b> list2 = aVar.f10952a;
        ArrayList arrayList2 = new ArrayList();
        for (CorporateDetailsDomain.a.b bVar2 : list2) {
            if (bVar2 != null) {
                String str6 = bVar2.f10942a;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = bVar2.f10943b;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = bVar2.f10944c;
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = bVar2.f10945d;
                if (str9 == null) {
                    str9 = "";
                }
                aVar2 = new b.a(str6, str7, str8, str9);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        return X4.a.a(this.f2957a.c(str, new a4.b(arrayList, arrayList2)), this.f2958b, true, new N3.a(11));
    }
}
