package X6;

import J5.a;
import O9.p;
import ca.InterfaceC0646l;
import h4.e;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f4026b;

    public /* synthetic */ a(b bVar, int i) {
        this.f4025a = i;
        this.f4026b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        b bVar = this.f4026b;
        switch (this.f4025a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                bVar.k();
                a aVar2 = new a(bVar, 1);
                if (aVar instanceof a.C0026a) {
                    aVar2.invoke(((a.C0026a) aVar).f2145a);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.f4029V0.postValue((e) ((a.b) aVar).f2146a);
                    p pVar = p.f3034a;
                }
                return p.f3034a;
            default:
                bVar.d((J5.b) obj);
                return p.f3034a;
        }
    }
}
