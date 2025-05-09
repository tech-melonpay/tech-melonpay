package F6;

import B6.i;
import I5.k;
import O9.p;
import androidx.lifecycle.C0559z;
import f6.C0746a;
import kotlin.Pair;
import m6.C1041i;
import s5.n;

/* compiled from: WelcomeViewModel.kt */
/* loaded from: classes2.dex */
public final class g extends i {

    /* renamed from: T0, reason: collision with root package name */
    public final C1041i f1235T0;

    /* renamed from: U0, reason: collision with root package name */
    public final K5.a f1236U0;

    /* renamed from: V0, reason: collision with root package name */
    public final J8.d<p> f1237V0;

    /* renamed from: W0, reason: collision with root package name */
    public final J8.d<p> f1238W0;

    /* renamed from: X0, reason: collision with root package name */
    public final C0559z<Pair<k, Integer>> f1239X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final C0559z<n> f1240Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final J8.d<p> f1241Z0;

    public g(C1041i c1041i, K5.a aVar, C0746a c0746a) {
        this.f1235T0 = c1041i;
        this.f1236U0 = aVar;
        J8.d<p> dVar = new J8.d<>();
        this.f1237V0 = dVar;
        this.f1238W0 = new J8.d<>();
        new C0559z();
        this.f1239X0 = new C0559z<>();
        this.f1240Y0 = new C0559z<>();
        this.f1241Z0 = new J8.d<>();
        new C0559z();
        if (aVar.O().length() <= 0 || !(!kotlin.jvm.internal.f.b(aVar.K(), "default"))) {
            return;
        }
        if (aVar.G()) {
            c0746a.a(new f(this, 0), "");
            dVar.setValue(null);
        } else {
            A8.b bVar = new A8.b(this, 3);
            this.f419K0 = bVar;
            bVar.invoke();
        }
    }
}
