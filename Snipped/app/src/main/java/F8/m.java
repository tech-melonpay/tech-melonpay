package F8;

import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0635a f1277b;

    public /* synthetic */ m(int i, InterfaceC0635a interfaceC0635a) {
        this.f1276a = i;
        this.f1277b = interfaceC0635a;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        switch (this.f1276a) {
            case 0:
                this.f1277b.invoke();
                return p.f3034a;
            default:
                return this.f1277b.invoke();
        }
    }
}
