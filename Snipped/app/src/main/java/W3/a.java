package W3;

import ca.InterfaceC0635a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f3806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F5.a f3807c;

    public /* synthetic */ a(c cVar, F5.a aVar, int i) {
        this.f3805a = i;
        this.f3806b = cVar;
        this.f3807c = aVar;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f3805a) {
            case 0:
                I4.a aVar = this.f3806b.f3809a;
                F5.a aVar2 = this.f3807c;
                return aVar.k(aVar2.f1165b, aVar2.f1164a, aVar2.f1170g, aVar2.f1166c, aVar2.f1167d, aVar2.f1169f).execute();
            case 1:
                I4.a aVar3 = this.f3806b.f3809a;
                F5.a aVar4 = this.f3807c;
                return aVar3.n(aVar4.f1165b, aVar4.f1164a, aVar4.f1170g, aVar4.f1166c, aVar4.f1167d, aVar4.f1169f).execute();
            case 2:
                I4.a aVar5 = this.f3806b.f3809a;
                F5.a aVar6 = this.f3807c;
                return aVar5.l(aVar6.f1165b, aVar6.f1164a, aVar6.f1170g, aVar6.f1166c, aVar6.f1167d, aVar6.f1169f).execute();
            default:
                I4.a aVar7 = this.f3806b.f3809a;
                F5.a aVar8 = this.f3807c;
                return aVar7.d(aVar8.f1165b, aVar8.f1164a, aVar8.f1170g, aVar8.f1166c, aVar8.f1167d, aVar8.f1169f).execute();
        }
    }
}
