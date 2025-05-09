package F6;

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
    public final /* synthetic */ int f1233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f1234b;

    public /* synthetic */ f(g gVar, int i) {
        this.f1233a = i;
        this.f1234b = gVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        int i = 2;
        int i9 = 3;
        g gVar = this.f1234b;
        switch (this.f1233a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                f fVar = new f(gVar, i);
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar.invoke(((a.b) aVar).f2146a);
                }
                return p.f3034a;
            case 1:
                J5.a aVar2 = (J5.a) obj;
                gVar.k();
                f fVar2 = new f(gVar, i9);
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    J5.b bVar = (J5.b) ((a.C0026a) aVar2).f2145a;
                    if (gVar.a(bVar)) {
                        gVar.f413E0 = gVar.f419K0;
                    }
                    gVar.d(bVar);
                    gVar.f1241Z0.setValue(null);
                    p pVar2 = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar2.invoke(((a.b) aVar2).f2146a);
                }
                return p.f3034a;
            case 2:
                C1545a c1545a = (C1545a) obj;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c1545a.f30602b);
                arrayList.addAll(c1545a.f30601a);
                gVar.f1236U0.P(arrayList);
                return p.f3034a;
            default:
                k kVar = (k) obj;
                gVar.getClass();
                String str = kVar.V;
                if (str != null) {
                    gVar.f1236U0.d(str);
                }
                String str2 = kVar.Y;
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    C0559z<Pair<k, Integer>> c0559z = gVar.f1239X0;
                    String str3 = kVar.f1826g0;
                    String str4 = kVar.f1820d0;
                    switch (hashCode) {
                        case -1363898457:
                            if (str2.equals("ACCEPTED")) {
                                if (!kotlin.jvm.internal.f.b(str3, "QUEST_RATIFIED")) {
                                    c0559z.postValue(new Pair<>(kVar, 6));
                                    break;
                                } else {
                                    c0559z.postValue(new Pair<>(kVar, 3));
                                    break;
                                }
                            }
                            break;
                        case -797365250:
                            if (str2.equals("AML_HOLD")) {
                                c0559z.postValue(new Pair<>(kVar, 2));
                                break;
                            }
                            break;
                        case 65307009:
                            if (str2.equals("DRAFT")) {
                                if (!kotlin.jvm.internal.f.b(kVar.f1818c0, "CONFIRMED")) {
                                    c0559z.postValue(new Pair<>(kVar, 0));
                                    break;
                                } else if (!kotlin.jvm.internal.f.b(str4, "CONFIRMED")) {
                                    c0559z.postValue(new Pair<>(kVar, 1));
                                    break;
                                } else {
                                    c0559z.postValue(new Pair<>(kVar, 5));
                                    break;
                                }
                            }
                            break;
                        case 696544716:
                            if (str2.equals("BLOCKED")) {
                                c0559z.postValue(new Pair<>(kVar, 4));
                                break;
                            }
                            break;
                        case 1024499391:
                            if (str2.equals("UNDER_REVIEW")) {
                                if (kVar.f1839p != null) {
                                    if (!kotlin.jvm.internal.f.b(str4, "DRAFT")) {
                                        String str5 = kVar.f1822e0;
                                        if (!kotlin.jvm.internal.f.b(str5, "REQUESTED") && !kotlin.jvm.internal.f.b(str5, "APPROVED_VERIFIED")) {
                                            c0559z.postValue(new Pair<>(kVar, 5));
                                            break;
                                        } else if (!kotlin.jvm.internal.f.b(str3, "QUEST_RATIFIED")) {
                                            c0559z.postValue(new Pair<>(kVar, 6));
                                            break;
                                        } else {
                                            c0559z.postValue(new Pair<>(kVar, 3));
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
}
