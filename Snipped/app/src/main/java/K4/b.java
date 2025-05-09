package K4;

import P9.n;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import i4.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CorporateDetailsRawMapper.kt */
/* loaded from: classes.dex */
public final class b {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final CorporateDetailsDomain.a a(b.C0409b c0409b) {
        String str;
        CorporateDetailsDomain.StatusIdentification statusIdentification;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList;
        String str5;
        ArrayList arrayList2;
        ArrayList arrayList3;
        CorporateDetailsDomain.EmployeeCount employeeCount;
        CorporateDetailsDomain.EmployeeCount employeeCount2;
        CorporateDetailsDomain.SourceofWealth sourceofWealth;
        CorporateDetailsDomain.SourceofWealth sourceofWealth2;
        Integer P4 = c0409b.P();
        String C02 = c0409b.C0();
        String K2 = c0409b.K();
        Boolean L7 = c0409b.L();
        String j02 = c0409b.j0();
        String h02 = c0409b.h0();
        Boolean i02 = c0409b.i0();
        String y02 = c0409b.y0();
        String N10 = c0409b.N();
        String U = c0409b.U();
        String b9 = c0409b.b();
        String O6 = c0409b.O();
        String w02 = c0409b.w0();
        String l10 = c0409b.l();
        String m02 = c0409b.m0();
        String z10 = c0409b.z();
        String k02 = c0409b.k0();
        String i = c0409b.i();
        String Q4 = c0409b.Q();
        String R = c0409b.R();
        String S = c0409b.S();
        String o02 = c0409b.o0();
        String c02 = c0409b.c0();
        String Z10 = c0409b.Z();
        String Y = c0409b.Y();
        String p10 = c0409b.p();
        String q10 = c0409b.q();
        String w2 = c0409b.w();
        String d02 = c0409b.d0();
        String x02 = c0409b.x0();
        String F02 = c0409b.F0();
        Integer A02 = c0409b.A0();
        String B10 = c0409b.B();
        String k3 = c0409b.k();
        String j10 = c0409b.j();
        String o10 = c0409b.o();
        String v10 = c0409b.v();
        String m2 = c0409b.m();
        String t3 = c0409b.t();
        String C10 = c0409b.C();
        String s10 = c0409b.s();
        Long n02 = c0409b.n0();
        Boolean I02 = c0409b.I0();
        Boolean E02 = c0409b.E0();
        String D02 = c0409b.D0();
        String p02 = c0409b.p0();
        String u02 = c0409b.u0();
        String T = c0409b.T();
        String g10 = c0409b.g();
        String c2 = c0409b.c();
        String z02 = c0409b.z0();
        String e10 = c0409b.e();
        String f10 = c0409b.f();
        String d10 = c0409b.d();
        Object l02 = c0409b.l0();
        String v02 = c0409b.v0();
        if (v02 != null) {
            CorporateDetailsDomain.StatusIdentification.f10854a.getClass();
            switch (v02.hashCode()) {
                case -814438578:
                    str = m02;
                    if (v02.equals("REQUESTED")) {
                        statusIdentification = CorporateDetailsDomain.StatusIdentification.f10856c;
                        break;
                    }
                    statusIdentification = CorporateDetailsDomain.StatusIdentification.f10858e;
                    break;
                case 77867656:
                    str = m02;
                    if (v02.equals("RETRY")) {
                        statusIdentification = CorporateDetailsDomain.StatusIdentification.f10857d;
                        break;
                    }
                    statusIdentification = CorporateDetailsDomain.StatusIdentification.f10858e;
                    break;
                case 174130302:
                    str = m02;
                    if (v02.equals("REJECTED")) {
                        statusIdentification = CorporateDetailsDomain.StatusIdentification.f10859f;
                        break;
                    }
                    statusIdentification = CorporateDetailsDomain.StatusIdentification.f10858e;
                    break;
                case 1489012560:
                    str = m02;
                    if (v02.equals("APPROVED_VERIFIED")) {
                        statusIdentification = CorporateDetailsDomain.StatusIdentification.f10855b;
                        break;
                    }
                    statusIdentification = CorporateDetailsDomain.StatusIdentification.f10858e;
                    break;
                default:
                    str = m02;
                    statusIdentification = CorporateDetailsDomain.StatusIdentification.f10858e;
                    break;
            }
        } else {
            str = m02;
            statusIdentification = CorporateDetailsDomain.StatusIdentification.f10858e;
        }
        CorporateDetailsDomain.StatusIdentification statusIdentification2 = statusIdentification;
        float r02 = c0409b.r0();
        boolean a02 = c0409b.a0();
        Integer valueOf = Integer.valueOf(c0409b.W());
        Integer valueOf2 = Integer.valueOf(c0409b.X());
        List<b.a> h9 = c0409b.h();
        if (h9 != null) {
            List<b.a> list = h9;
            str4 = l10;
            str3 = w02;
            ArrayList arrayList4 = new ArrayList(n.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b.a aVar = (b.a) it.next();
                arrayList4.add(new CorporateDetailsDomain.a.C0113a(aVar.c(), aVar.a(), aVar.b()));
                it = it;
                O6 = O6;
            }
            str2 = O6;
            arrayList = arrayList4;
        } else {
            str2 = O6;
            str3 = w02;
            str4 = l10;
            arrayList = new ArrayList();
        }
        List<b.c> x9 = c0409b.x();
        if (x9 != null) {
            List<b.c> list2 = x9;
            ArrayList arrayList5 = new ArrayList(n.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                b.c cVar = (b.c) it2.next();
                arrayList5.add(new CorporateDetailsDomain.a.b(cVar.d(), cVar.b(), cVar.a(), cVar.c()));
                it2 = it2;
                b9 = b9;
            }
            str5 = b9;
            arrayList2 = arrayList5;
        } else {
            str5 = b9;
            arrayList2 = null;
        }
        List<b.c> y10 = c0409b.y();
        if (y10 != null) {
            List<b.c> list3 = y10;
            ArrayList arrayList6 = new ArrayList(n.u(list3, 10));
            for (Iterator it3 = list3.iterator(); it3.hasNext(); it3 = it3) {
                b.c cVar2 = (b.c) it3.next();
                arrayList6.add(new CorporateDetailsDomain.a.b(cVar2.d(), cVar2.b(), cVar2.a(), cVar2.c()));
            }
            arrayList3 = arrayList6;
        } else {
            arrayList3 = null;
        }
        Boolean G02 = c0409b.G0();
        Boolean H02 = c0409b.H0();
        String A10 = c0409b.A();
        CorporateDetailsDomain.EmployeeCount.a aVar2 = CorporateDetailsDomain.EmployeeCount.f10829b;
        String M8 = c0409b.M();
        if (M8 == null) {
            M8 = "";
        }
        aVar2.getClass();
        switch (M8.hashCode()) {
            case 48537:
                if (M8.equals("1-5")) {
                    employeeCount2 = CorporateDetailsDomain.EmployeeCount.f10830c;
                    employeeCount = employeeCount2;
                    break;
                }
                employeeCount = null;
                break;
            case 1542014:
                if (M8.equals("250+")) {
                    employeeCount2 = CorporateDetailsDomain.EmployeeCount.f10834g;
                    employeeCount = employeeCount2;
                    break;
                }
                employeeCount = null;
                break;
            case 1623766:
                if (M8.equals("5-20")) {
                    employeeCount2 = CorporateDetailsDomain.EmployeeCount.f10831d;
                    employeeCount = employeeCount2;
                    break;
                }
                employeeCount = null;
                break;
            case 47650954:
                if (M8.equals("20-50")) {
                    employeeCount2 = CorporateDetailsDomain.EmployeeCount.f10832e;
                    employeeCount = employeeCount2;
                    break;
                }
                employeeCount = null;
                break;
            case 1563064347:
                if (M8.equals("50-250")) {
                    employeeCount2 = CorporateDetailsDomain.EmployeeCount.f10833f;
                    employeeCount = employeeCount2;
                    break;
                }
                employeeCount = null;
                break;
            default:
                employeeCount = null;
                break;
        }
        Boolean b02 = c0409b.b0();
        Float G8 = c0409b.G();
        Float F10 = c0409b.F();
        Integer H10 = c0409b.H();
        Integer I10 = c0409b.I();
        List<String> f02 = c0409b.f0();
        List<String> g02 = c0409b.g0();
        List<String> B02 = c0409b.B0();
        List<String> D2 = c0409b.D();
        List<String> E8 = c0409b.E();
        List<String> J3 = c0409b.J();
        CorporateDetailsDomain.SourceofWealth.a aVar3 = CorporateDetailsDomain.SourceofWealth.f10845b;
        String t02 = c0409b.t0();
        String str6 = t02 != null ? t02 : "";
        aVar3.getClass();
        switch (str6.hashCode()) {
            case -1704036199:
                if (str6.equals("SAVINGS")) {
                    sourceofWealth2 = CorporateDetailsDomain.SourceofWealth.f10849f;
                    sourceofWealth = sourceofWealth2;
                    break;
                }
                sourceofWealth = null;
                break;
            case -1501939639:
                if (str6.equals("SALES_OF_SHARES")) {
                    sourceofWealth2 = CorporateDetailsDomain.SourceofWealth.f10850g;
                    sourceofWealth = sourceofWealth2;
                    break;
                }
                sourceofWealth = null;
                break;
            case -217633354:
                if (str6.equals("MATURED_INVESTMENT")) {
                    sourceofWealth2 = CorporateDetailsDomain.SourceofWealth.f10851h;
                    sourceofWealth = sourceofWealth2;
                    break;
                }
                sourceofWealth = null;
                break;
            case 100761948:
                if (str6.equals("EMPLOYMENT_INCOME")) {
                    sourceofWealth2 = CorporateDetailsDomain.SourceofWealth.f10846c;
                    sourceofWealth = sourceofWealth2;
                    break;
                }
                sourceofWealth = null;
                break;
            case 995593876:
                if (str6.equals("FX_TRADING")) {
                    sourceofWealth2 = CorporateDetailsDomain.SourceofWealth.f10848e;
                    sourceofWealth = sourceofWealth2;
                    break;
                }
                sourceofWealth = null;
                break;
            case 1194049092:
                if (str6.equals("DIVIDENDS")) {
                    sourceofWealth2 = CorporateDetailsDomain.SourceofWealth.f10847d;
                    sourceofWealth = sourceofWealth2;
                    break;
                }
                sourceofWealth = null;
                break;
            default:
                sourceofWealth = null;
                break;
        }
        return new CorporateDetailsDomain.a(P4, C02, K2, L7, j02, h02, i02, y02, N10, U, str5, str2, str3, str4, str, z10, k02, i, Q4, R, S, o02, c02, Z10, Y, p10, q10, w2, d02, x02, F02, A02, B10, k3, j10, o10, v10, m2, t3, C10, s10, n02, I02, E02, D02, p02, u02, T, g10, c2, z02, e10, f10, d10, l02, statusIdentification2, r02, a02, valueOf, valueOf2, arrayList, arrayList2, arrayList3, G02, H02, A10, employeeCount, b02, G8, F10, H10, I10, f02, g02, B02, D2, E8, J3, sourceofWealth, c0409b.q0(), c0409b.V(), c0409b.s0(), c0409b.e0(), c0409b.u(), c0409b.r(), c0409b.a(), c0409b.n());
    }

    public static final CorporateDetailsDomain b(i4.b bVar) {
        ArrayList arrayList;
        b.C0409b b9 = bVar.b();
        CorporateDetailsDomain.a a10 = b9 != null ? a(b9) : null;
        List<b.d> h9 = bVar.h();
        if (h9 != null) {
            List<b.d> list = h9;
            ArrayList arrayList2 = new ArrayList(n.u(list, 10));
            for (b.d dVar : list) {
                List<String> d10 = dVar.d();
                String a11 = dVar.a();
                Float e10 = dVar.e();
                String c2 = dVar.c();
                b.C0409b b10 = dVar.b();
                arrayList2.add(new CorporateDetailsDomain.b(d10, a11, e10, c2, b10 != null ? a(b10) : null, dVar.f()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new CorporateDetailsDomain(a10, arrayList, bVar.e(), bVar.d(), bVar.f(), bVar.i(), bVar.g(), bVar.c());
    }
}
