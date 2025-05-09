package J6;

import I5.j;
import I5.k;
import J5.a;
import O9.p;
import androidx.lifecycle.C0559z;
import ca.InterfaceC0646l;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import v5.C1545a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f2180b;

    public /* synthetic */ f(g gVar, int i) {
        this.f2179a = i;
        this.f2180b = gVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        Long a10;
        int i = 4;
        int i9 = 5;
        g gVar = this.f2180b;
        switch (this.f2179a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                gVar.k();
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    J5.b bVar = (J5.b) ((a.C0026a) aVar).f2145a;
                    if (!gVar.b(bVar)) {
                        gVar.d(bVar);
                    }
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j jVar = (j) ((a.b) aVar).f2146a;
                    String str = jVar.f1787b;
                    a10 = str != null ? defpackage.c.a(str) : null;
                    gVar.f2186Y0.c(jVar.f1786a, str, jVar.f1789d, Long.valueOf((a10 != null ? a10.longValue() : 0L) - defpackage.c.b(jVar.f1794j)));
                    Long l10 = jVar.f1790e;
                    if (l10 != null) {
                        gVar.f2184W0.j(l10.longValue());
                    }
                    gVar.i0();
                    gVar.h0();
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 1:
                J5.a aVar2 = (J5.a) obj;
                gVar.k();
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    J5.b bVar2 = (J5.b) ((a.C0026a) aVar2).f2145a;
                    if (!gVar.b(bVar2)) {
                        gVar.d(bVar2);
                    }
                    p pVar3 = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j jVar2 = (j) ((a.b) aVar2).f2146a;
                    String str2 = jVar2.f1787b;
                    a10 = str2 != null ? defpackage.c.a(str2) : null;
                    gVar.f2186Y0.c(jVar2.f1786a, str2, jVar2.f1789d, Long.valueOf((a10 != null ? a10.longValue() : 0L) - defpackage.c.b(jVar2.f1794j)));
                    Long l11 = jVar2.f1790e;
                    if (l11 != null) {
                        gVar.f2184W0.j(l11.longValue());
                    }
                    gVar.i0();
                    gVar.h0();
                    p pVar4 = p.f3034a;
                }
                return p.f3034a;
            case 2:
                J5.a aVar3 = (J5.a) obj;
                f fVar = new f(gVar, i);
                aVar3.getClass();
                if (aVar3 instanceof a.C0026a) {
                    p pVar5 = p.f3034a;
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar.invoke(((a.b) aVar3).f2146a);
                }
                return p.f3034a;
            case 3:
                J5.a aVar4 = (J5.a) obj;
                gVar.k();
                f fVar2 = new f(gVar, i9);
                aVar4.getClass();
                if (aVar4 instanceof a.C0026a) {
                    gVar.d((J5.b) ((a.C0026a) aVar4).f2145a);
                    gVar.f2190c1.setValue(null);
                    p pVar6 = p.f3034a;
                } else {
                    if (!(aVar4 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar2.invoke(((a.b) aVar4).f2146a);
                }
                return p.f3034a;
            case 4:
                C1545a c1545a = (C1545a) obj;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c1545a.f30602b);
                arrayList.addAll(c1545a.f30601a);
                gVar.f2184W0.P(arrayList);
                return p.f3034a;
            default:
                k kVar = (k) obj;
                gVar.getClass();
                String str3 = "+" + kVar.f1821e + kVar.f1823f;
                K5.a aVar5 = gVar.f2184W0;
                aVar5.o(str3);
                String str4 = kVar.V;
                if (str4 != null) {
                    aVar5.d(str4);
                }
                String str5 = kVar.Y;
                if (str5 != null) {
                    int hashCode = str5.hashCode();
                    C0559z<Pair<k, Integer>> c0559z = gVar.f2188a1;
                    String str6 = kVar.f1826g0;
                    String str7 = kVar.f1820d0;
                    switch (hashCode) {
                        case -1363898457:
                            if (str5.equals("ACCEPTED")) {
                                if (!kotlin.jvm.internal.f.b(str6, "QUEST_RATIFIED")) {
                                    c0559z.postValue(new Pair<>(kVar, 6));
                                    break;
                                } else {
                                    c0559z.postValue(new Pair<>(kVar, 3));
                                    aVar5.J();
                                    break;
                                }
                            }
                            break;
                        case -797365250:
                            if (str5.equals("AML_HOLD")) {
                                c0559z.postValue(new Pair<>(kVar, 2));
                                break;
                            }
                            break;
                        case 65307009:
                            if (str5.equals("DRAFT")) {
                                if (!kotlin.jvm.internal.f.b(kVar.f1818c0, "CONFIRMED")) {
                                    c0559z.postValue(new Pair<>(kVar, 0));
                                    break;
                                } else if (!kotlin.jvm.internal.f.b(str7, "CONFIRMED")) {
                                    c0559z.postValue(new Pair<>(kVar, 1));
                                    break;
                                } else {
                                    c0559z.postValue(new Pair<>(kVar, 5));
                                    break;
                                }
                            }
                            break;
                        case 696544716:
                            if (str5.equals("BLOCKED")) {
                                c0559z.postValue(new Pair<>(kVar, 4));
                                break;
                            }
                            break;
                        case 1024499391:
                            if (str5.equals("UNDER_REVIEW")) {
                                if (kVar.f1839p != null) {
                                    if (!kotlin.jvm.internal.f.b(str7, "DRAFT")) {
                                        String str8 = kVar.f1822e0;
                                        if (!kotlin.jvm.internal.f.b(str8, "REQUESTED") && !kotlin.jvm.internal.f.b(str8, "APPROVED_VERIFIED")) {
                                            c0559z.postValue(new Pair<>(kVar, 5));
                                            break;
                                        } else if (!kotlin.jvm.internal.f.b(str6, "QUEST_RATIFIED")) {
                                            c0559z.postValue(new Pair<>(kVar, 6));
                                            break;
                                        } else {
                                            c0559z.postValue(new Pair<>(kVar, 3));
                                            aVar5.J();
                                            break;
                                        }
                                    } else {
                                        c0559z.postValue(new Pair<>(kVar, 1));
                                        break;
                                    }
                                } else {
                                    c0559z.postValue(new Pair<>(kVar, 7));
                                    break;
                                }
                            }
                            break;
                    }
                }
                return p.f3034a;
        }
    }

    public /* synthetic */ f(g gVar, String str, String str2) {
        this.f2179a = 0;
        this.f2180b = gVar;
    }
}
