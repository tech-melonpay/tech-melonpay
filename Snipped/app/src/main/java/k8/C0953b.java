package k8;

import B6.i;
import J8.d;
import O9.p;
import androidx.lifecycle.C0559z;
import java.util.List;
import l6.C0986a;
import l6.C0987b;

/* compiled from: PlansViewModel.kt */
/* renamed from: k8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0953b extends i {

    /* renamed from: T0, reason: collision with root package name */
    public final l6.c f23045T0;

    /* renamed from: U0, reason: collision with root package name */
    public final C0986a f23046U0;

    /* renamed from: V0, reason: collision with root package name */
    public final K5.a f23047V0;

    /* renamed from: W0, reason: collision with root package name */
    public final C0559z<List<C5.a>> f23048W0 = new C0559z<>();

    /* renamed from: X0, reason: collision with root package name */
    public final d<p> f23049X0 = new d<>();

    public C0953b(C0987b c0987b, l6.c cVar, C0986a c0986a, K5.a aVar) {
        Integer num;
        String num2;
        this.f23045T0 = cVar;
        this.f23046U0 = c0986a;
        this.f23047V0 = aVar;
        u5.d u6 = aVar.u();
        if (u6 == null || (num = u6.f30237a) == null || (num2 = num.toString()) == null) {
            return;
        }
        l();
        c0987b.a(new C0952a(this, 1), num2);
    }

    public final void h0() {
        Integer num;
        String num2;
        u5.d u6 = this.f23047V0.u();
        if (u6 == null || (num = u6.f30237a) == null || (num2 = num.toString()) == null) {
            return;
        }
        l();
        this.f23045T0.a(new C0952a(this, 2), num2);
    }
}
