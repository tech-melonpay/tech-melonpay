package k8;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: k8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0952a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0953b f23044b;

    public /* synthetic */ C0952a(C0953b c0953b, int i) {
        this.f23043a = i;
        this.f23044b = c0953b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        C0953b c0953b = this.f23044b;
        J5.a aVar = (J5.a) obj;
        switch (this.f23043a) {
            case 0:
                c0953b.k();
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    c0953b.d((J5.b) ((a.C0026a) aVar).f2145a);
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0953b.f23049X0.setValue(null);
                    c0953b.h0();
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 1:
                c0953b.k();
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    c0953b.d((J5.b) ((a.C0026a) aVar).f2145a);
                    p pVar3 = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0953b.h0();
                    p pVar4 = p.f3034a;
                }
                return p.f3034a;
            default:
                c0953b.k();
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    c0953b.d((J5.b) ((a.C0026a) aVar).f2145a);
                    p pVar5 = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0953b.f23048W0.postValue((List) ((a.b) aVar).f2146a);
                    p pVar6 = p.f3034a;
                }
                return p.f3034a;
        }
    }
}
