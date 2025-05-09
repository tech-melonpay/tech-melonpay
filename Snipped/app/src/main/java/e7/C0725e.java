package e7;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: e7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0725e implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0726f f20549b;

    public /* synthetic */ C0725e(C0726f c0726f, int i) {
        this.f20548a = i;
        this.f20549b = c0726f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        C0726f c0726f = this.f20549b;
        switch (this.f20548a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                c0726f.k();
                C0725e c0725e = new C0725e(c0726f, 1);
                if (aVar instanceof a.C0026a) {
                    c0725e.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0726f.f20553W0.postValue((List) ((a.b) aVar).f2146a);
                    Integer valueOf = Integer.valueOf(c0726f.f20550T0.h());
                    c0726f.f20552V0.a(new C0725e(c0726f, 2), valueOf);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            case 1:
                c0726f.d((J5.b) obj);
                return p.f3034a;
            default:
                J5.a aVar2 = (J5.a) obj;
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    c0726f.d((J5.b) ((a.C0026a) aVar2).f2145a);
                    p pVar2 = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0726f.f20558b1 = (List) ((a.b) aVar2).f2146a;
                    c0726f.f20561e1.setValue(null);
                    p pVar3 = p.f3034a;
                }
                return p.f3034a;
        }
    }
}
