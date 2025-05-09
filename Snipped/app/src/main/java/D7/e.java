package D7;

import E7.h;
import F8.o;
import M6.m;
import M6.w;
import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.domain.Quadruple;
import com.luminary.business.presentation.ui.fragments.auth.register.validation.ValidationFragment;
import e6.i;
import f7.C0751e;
import java.io.File;
import java.util.Calendar;
import java.util.Locale;
import k7.C0950c;
import kotlin.Pair;
import kotlin.Triple;
import m7.k;
import p7.C1115f;
import r7.C1158f;
import r7.C1159g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f967c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f968d;

    public /* synthetic */ e(String str, String str2, int i, Object obj) {
        this.f965a = i;
        this.f968d = obj;
        this.f966b = str;
        this.f967c = str2;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        Integer num;
        String num2;
        F5.b value;
        String str;
        Integer num3;
        Integer num4;
        String num5;
        Integer num6;
        switch (this.f965a) {
            case 0:
                g gVar = (g) this.f968d;
                gVar.l();
                gVar.f972U0.a(new f(gVar, 2), new Triple(this.f966b, this.f967c, Boolean.FALSE));
                break;
            case 1:
                h hVar = (h) this.f968d;
                u5.d u6 = hVar.f1089U0.u();
                if (u6 != null && (num = u6.f30237a) != null && (num2 = num.toString()) != null && (value = hVar.f1093Y0.getValue()) != null && (str = value.f1188a) != null) {
                    hVar.f1092X0.a(new E7.g(hVar, 1), new Quadruple(num2, str, this.f966b, this.f967c));
                }
                break;
            case 2:
                ValidationFragment validationFragment = (ValidationFragment) this.f968d;
                validationFragment.u0().f29629v.setVisibility(0);
                w U02 = validationFragment.U0();
                m mVar = new m(U02, this.f966b, this.f967c, 0);
                U02.f421M0 = mVar;
                mVar.invoke();
                validationFragment.f11709v0 = false;
                o.b(validationFragment.u0().f29631x);
                break;
            case 3:
                f7.f fVar = (f7.f) this.f968d;
                u5.d u10 = fVar.f20714U0.u();
                if (u10 != null && (num3 = u10.f30237a) != null) {
                    int intValue = num3.intValue();
                    fVar.l();
                    fVar.f20713T0.a(new C0751e(fVar, 0), new Pair(String.valueOf(intValue), new s5.g(this.f966b, this.f967c)));
                }
                break;
            case 4:
                k7.e eVar = (k7.e) this.f968d;
                eVar.l();
                eVar.f23038V0.a(new C0950c(eVar, 0), new Triple(Integer.valueOf(eVar.f23036T0.h()), this.f966b, this.f967c));
                break;
            case 5:
                k kVar = (k) this.f968d;
                i iVar = kVar.f24001W0;
                Locale locale = Locale.ROOT;
                iVar.a(new m7.i(kVar, 3), new Pair(this.f966b.toUpperCase(locale), this.f967c.toUpperCase(locale)));
                break;
            case 6:
                n7.k kVar2 = (n7.k) this.f968d;
                kVar2.l();
                kVar2.f24277U0.a(new n7.h(kVar2, this.f966b, this.f967c, 0), Integer.valueOf(kVar2.f24276T0.h()));
                break;
            case 7:
                p7.g gVar2 = (p7.g) this.f968d;
                u5.d u11 = gVar2.f25706T0.u();
                if (u11 != null && (num4 = u11.f30237a) != null && (num5 = num4.toString()) != null) {
                    long timeInMillis = Calendar.getInstance().getTimeInMillis();
                    String str2 = File.separator;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f966b);
                    sb2.append(str2);
                    sb2.append("statement_");
                    String str3 = this.f967c;
                    sb2.append(str3);
                    sb2.append("_");
                    sb2.append(timeInMillis);
                    sb2.append(".pdf");
                    String sb3 = sb2.toString();
                    File file = new File(sb3);
                    if (file.exists()) {
                        file.delete();
                    }
                    gVar2.l();
                    gVar2.f25707U0.a(new C1115f(gVar2, 0), new Triple(str3, num5, sb3));
                }
                break;
            case 8:
                C1159g c1159g = (C1159g) this.f968d;
                c1159g.l();
                c1159g.f26322V0.a(new C1158f(c1159g, 1), new Triple(Integer.valueOf(c1159g.f26320T0.h()), this.f966b, this.f967c));
                break;
            default:
                v7.d dVar = (v7.d) this.f968d;
                u5.d u12 = dVar.f30664T0.u();
                if (u12 != null && (num6 = u12.f30237a) != null) {
                    int intValue2 = num6.intValue();
                    dVar.l();
                    dVar.f30665U0.a(new v7.c(dVar, 0), new Triple(String.valueOf(intValue2), this.f966b, new s5.h(this.f967c)));
                }
                break;
        }
        return p.f3034a;
    }
}
