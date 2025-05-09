package M6;

import ca.InterfaceC0635a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f2638b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2639c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2640d;

    public /* synthetic */ m(w wVar, String str, String str2, int i) {
        this.f2637a = i;
        this.f2638b = wVar;
        this.f2639c = str;
        this.f2640d = str2;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f2637a) {
            case 0:
                w wVar = this.f2638b;
                wVar.l();
                I5.h hVar = new I5.h(this.f2639c, this.f2640d);
                wVar.f2696W0.a(new n(wVar, 4), hVar);
                break;
            default:
                w wVar2 = this.f2638b;
                wVar2.f2705f1.a(new n(wVar2, 9), new I5.q(this.f2639c, this.f2640d));
                break;
        }
        return O9.p.f3034a;
    }
}
