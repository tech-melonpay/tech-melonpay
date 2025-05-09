package M6;

import androidx.lifecycle.C0559z;
import ca.InterfaceC0635a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f2666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I5.k f2667c;

    public /* synthetic */ t(w wVar, I5.k kVar, int i) {
        this.f2665a = i;
        this.f2666b = wVar;
        this.f2667c = kVar;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f2665a) {
            case 0:
                w wVar = this.f2666b;
                C0559z<I5.k> c0559z = wVar.f2709j1;
                I5.k kVar = this.f2667c;
                c0559z.postValue(kVar);
                wVar.f2702c1.x(kVar);
                break;
            default:
                w wVar2 = this.f2666b;
                C0559z<I5.k> c0559z2 = wVar2.f2709j1;
                I5.k kVar2 = this.f2667c;
                c0559z2.postValue(kVar2);
                wVar2.f2702c1.x(kVar2);
                break;
        }
        return O9.p.f3034a;
    }
}
