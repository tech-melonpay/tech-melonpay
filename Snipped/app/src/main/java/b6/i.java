package B6;

import J5.b;
import O9.p;
import androidx.lifecycle.C0559z;
import androidx.lifecycle.Q;
import ca.InterfaceC0635a;

/* compiled from: BaseViewModel.kt */
/* loaded from: classes2.dex */
public class i extends Q {

    /* renamed from: E0, reason: collision with root package name */
    public InterfaceC0635a<p> f413E0;

    /* renamed from: F0, reason: collision with root package name */
    public String f414F0;

    /* renamed from: J0, reason: collision with root package name */
    public InterfaceC0635a<p> f418J0;

    /* renamed from: K0, reason: collision with root package name */
    public InterfaceC0635a<p> f419K0;

    /* renamed from: L0, reason: collision with root package name */
    public InterfaceC0635a<p> f420L0;

    /* renamed from: M0, reason: collision with root package name */
    public InterfaceC0635a<p> f421M0;
    public InterfaceC0635a<p> N0;

    /* renamed from: O0, reason: collision with root package name */
    public InterfaceC0635a<p> f422O0;

    /* renamed from: P0, reason: collision with root package name */
    public InterfaceC0635a<p> f423P0;

    /* renamed from: Q0, reason: collision with root package name */
    public InterfaceC0635a<p> f424Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final O9.f f425R0;

    /* renamed from: S0, reason: collision with root package name */
    public final C0559z<J5.b> f426S0;

    /* renamed from: k, reason: collision with root package name */
    public final O9.f f427k = org.koin.java.a.a(j.class);

    /* renamed from: p, reason: collision with root package name */
    public final J8.d<p> f428p = new J8.d<>();

    /* renamed from: B0, reason: collision with root package name */
    public final J8.d<p> f410B0 = new J8.d<>();

    /* renamed from: C0, reason: collision with root package name */
    public final C0559z<b.f> f411C0 = new C0559z<>();

    /* renamed from: D0, reason: collision with root package name */
    public final C0559z<b.e> f412D0 = new C0559z<>();

    /* renamed from: G0, reason: collision with root package name */
    public final J8.d<p> f415G0 = new J8.d<>();

    /* renamed from: H0, reason: collision with root package name */
    public final J8.d<p> f416H0 = new J8.d<>();

    /* renamed from: I0, reason: collision with root package name */
    public final J8.d f417I0 = new J8.d();

    public i() {
        org.koin.java.a.a(com.google.gson.g.class);
        this.f425R0 = org.koin.java.a.a(K5.a.class);
        this.f426S0 = new C0559z<>();
    }

    public final boolean a(J5.b bVar) {
        if (!(bVar instanceof b.f)) {
            return false;
        }
        b.f fVar = (b.f) bVar;
        ((K5.a) this.f425R0.getValue()).N(fVar.f2158c);
        this.f411C0.postValue(bVar);
        return fVar.f2156a == 203;
    }

    public final boolean b(J5.b bVar) {
        if (!(bVar instanceof b.e)) {
            return false;
        }
        b.e eVar = (b.e) bVar;
        ((K5.a) this.f425R0.getValue()).N(eVar.f2155c);
        this.f414F0 = eVar.f2154b;
        this.f412D0.postValue(bVar);
        return eVar.f2153a == 203;
    }

    public final boolean c(J5.b bVar) {
        Integer a10;
        Integer a11;
        Integer a12;
        Integer a13;
        Integer a14;
        Integer a15;
        Integer a16;
        Integer a17;
        Integer a18;
        Integer a19;
        if (!(bVar instanceof b.C0027b)) {
            return false;
        }
        b.C0027b c0027b = (b.C0027b) bVar;
        r5.b bVar2 = c0027b.f2150b;
        if (!(c0027b.f2149a == 401 && bVar2.a() == null) && (((a10 = bVar2.a()) == null || a10.intValue() != 3004) && (((a11 = bVar2.a()) == null || a11.intValue() != 3003) && (((a12 = bVar2.a()) == null || a12.intValue() != 3000) && (((a13 = bVar2.a()) == null || a13.intValue() != 3001) && (((a14 = bVar2.a()) == null || a14.intValue() != 3005) && (((a15 = bVar2.a()) == null || a15.intValue() != 3006) && (((a16 = bVar2.a()) == null || a16.intValue() != 3007) && (((a17 = bVar2.a()) == null || a17.intValue() != 3008) && (((a18 = bVar2.a()) == null || a18.intValue() != 3009) && ((a19 = bVar2.a()) == null || a19.intValue() != 3010))))))))))) {
            return false;
        }
        this.f428p.setValue(null);
        return true;
    }

    public final void d(J5.b bVar) {
        if (bVar instanceof b.f) {
            return;
        }
        if (bVar.a() >= 500) {
            this.f410B0.setValue(null);
        } else {
            this.f417I0.postValue(bVar.b());
        }
    }

    public final void k() {
        this.f416H0.setValue(null);
    }

    public final void l() {
        this.f415G0.setValue(null);
    }
}
