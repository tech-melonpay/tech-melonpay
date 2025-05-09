package t8;

import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.domain.Quadruple;
import ha.C0806e;
import java.io.File;
import java.util.Calendar;
import java.util.NoSuchElementException;
import kotlin.Triple;
import kotlin.random.Random;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f29954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29955c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29956d;

    public /* synthetic */ i(j jVar, String str, String str2, int i) {
        this.f29953a = i;
        this.f29954b = jVar;
        this.f29955c = str;
        this.f29956d = str2;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        Integer num;
        String num2;
        F5.b value;
        String str;
        Integer num3;
        String num4;
        F5.b value2;
        String str2;
        Integer num5;
        String num6;
        switch (this.f29953a) {
            case 0:
                j jVar = this.f29954b;
                u5.d u6 = jVar.f29957T0.u();
                if (u6 != null && (num = u6.f30237a) != null && (num2 = num.toString()) != null && (value = jVar.f29964a1.getValue()) != null && (str = value.f1188a) != null) {
                    jVar.l();
                    jVar.f29959V0.a(new h(jVar, 7), new Quadruple(num2, str, this.f29955c, this.f29956d));
                }
                return p.f3034a;
            case 1:
                j jVar2 = this.f29954b;
                u5.d u10 = jVar2.f29957T0.u();
                if (u10 != null && (num3 = u10.f30237a) != null && (num4 = num3.toString()) != null && (value2 = jVar2.f29964a1.getValue()) != null && (str2 = value2.f1188a) != null) {
                    C0806e c0806e = new C0806e(0, 10, 1);
                    Random.Default r52 = Random.f23193a;
                    try {
                        if (c0806e.isEmpty()) {
                            throw new IllegalArgumentException("Cannot get random in empty range: " + c0806e);
                        }
                        int i = c0806e.f21227b;
                        int c2 = i < Integer.MAX_VALUE ? r52.c(0, i + 1) : r52.c(-1, i) + 1;
                        String str3 = this.f29955c + File.separator + "statement_" + this.f29956d + "_" + c2 + ".pdf";
                        File file = new File(str3);
                        if (file.exists()) {
                            file.delete();
                        }
                        jVar2.l();
                        jVar2.f29961X0.a(new h(jVar2, 2), new Triple(str2, num4, str3));
                    } catch (IllegalArgumentException e10) {
                        throw new NoSuchElementException(e10.getMessage());
                    }
                }
                return p.f3034a;
            default:
                j jVar3 = this.f29954b;
                u5.d u11 = jVar3.f29957T0.u();
                if (u11 != null && (num5 = u11.f30237a) != null && (num6 = num5.toString()) != null) {
                    long timeInMillis = Calendar.getInstance().getTimeInMillis();
                    String str4 = File.separator;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f29955c);
                    sb2.append(str4);
                    sb2.append("statement_");
                    String str5 = this.f29956d;
                    sb2.append(str5);
                    sb2.append("_");
                    sb2.append(timeInMillis);
                    sb2.append(".pdf");
                    String sb3 = sb2.toString();
                    File file2 = new File(sb3);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    jVar3.l();
                    jVar3.f29963Z0.a(new h(jVar3, 0), new Triple(str5, num6, sb3));
                }
                return p.f3034a;
        }
    }
}
