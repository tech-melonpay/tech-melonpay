package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.widget.ConstraintLayout;
import c0.C0621b;
import d0.C0681b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.tls.NamedGroup;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public final class d extends C0621b {

    /* renamed from: A0, reason: collision with root package name */
    public int f6123A0;

    /* renamed from: B0, reason: collision with root package name */
    public int f6124B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f6125C0;

    /* renamed from: D0, reason: collision with root package name */
    public c[] f6126D0;

    /* renamed from: E0, reason: collision with root package name */
    public c[] f6127E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f6128F0;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f6129G0;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f6130H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f6131I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f6132J0;

    /* renamed from: K0, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f6133K0;

    /* renamed from: L0, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f6134L0;

    /* renamed from: M0, reason: collision with root package name */
    public final HashSet<ConstraintWidget> f6135M0;
    public final C0681b.a N0;

    /* renamed from: t0, reason: collision with root package name */
    public final C0681b f6136t0 = new C0681b(this);

    /* renamed from: u0, reason: collision with root package name */
    public final d0.e f6137u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f6138v0;

    /* renamed from: w0, reason: collision with root package name */
    public C0681b.InterfaceC0389b f6139w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f6140x0;

    /* renamed from: y0, reason: collision with root package name */
    public final androidx.constraintlayout.core.c f6141y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f6142z0;

    public d() {
        d0.e eVar = new d0.e();
        eVar.f20386b = true;
        eVar.f20387c = true;
        eVar.f20389e = new ArrayList<>();
        new ArrayList();
        eVar.f20390f = null;
        eVar.f20391g = new C0681b.a();
        eVar.f20392h = new ArrayList<>();
        eVar.f20385a = this;
        eVar.f20388d = this;
        this.f6137u0 = eVar;
        this.f6139w0 = null;
        this.f6140x0 = false;
        this.f6141y0 = new androidx.constraintlayout.core.c();
        this.f6124B0 = 0;
        this.f6125C0 = 0;
        this.f6126D0 = new c[4];
        this.f6127E0 = new c[4];
        this.f6128F0 = NamedGroup.ffdhe3072;
        this.f6129G0 = false;
        this.f6130H0 = false;
        this.f6131I0 = null;
        this.f6132J0 = null;
        this.f6133K0 = null;
        this.f6134L0 = null;
        this.f6135M0 = new HashSet<>();
        this.N0 = new C0681b.a();
    }

    public static void V(ConstraintWidget constraintWidget, C0681b.InterfaceC0389b interfaceC0389b, C0681b.a aVar) {
        int i;
        int i9;
        if (interfaceC0389b == null) {
            return;
        }
        if (constraintWidget.f6038j0 == 8 || (constraintWidget instanceof f) || (constraintWidget instanceof a)) {
            aVar.f20378e = 0;
            aVar.f20379f = 0;
            return;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        aVar.f20374a = dimensionBehaviourArr[0];
        aVar.f20375b = dimensionBehaviourArr[1];
        aVar.f20376c = constraintWidget.q();
        aVar.f20377d = constraintWidget.k();
        aVar.i = false;
        aVar.f20382j = 0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f20374a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f6065c;
        boolean z10 = dimensionBehaviour == dimensionBehaviour2;
        boolean z11 = aVar.f20375b == dimensionBehaviour2;
        boolean z12 = z10 && constraintWidget.f6019Z > 0.0f;
        boolean z13 = z11 && constraintWidget.f6019Z > 0.0f;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f6064b;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f6063a;
        if (z10 && constraintWidget.t(0) && constraintWidget.f6055s == 0 && !z12) {
            aVar.f20374a = dimensionBehaviour3;
            if (z11 && constraintWidget.f6056t == 0) {
                aVar.f20374a = dimensionBehaviour4;
            }
            z10 = false;
        }
        if (z11 && constraintWidget.t(1) && constraintWidget.f6056t == 0 && !z13) {
            aVar.f20375b = dimensionBehaviour3;
            if (z10 && constraintWidget.f6055s == 0) {
                aVar.f20375b = dimensionBehaviour4;
            }
            z11 = false;
        }
        if (constraintWidget.A()) {
            aVar.f20374a = dimensionBehaviour4;
            z10 = false;
        }
        if (constraintWidget.B()) {
            aVar.f20375b = dimensionBehaviour4;
            z11 = false;
        }
        int[] iArr = constraintWidget.f6057u;
        if (z12) {
            if (iArr[0] == 4) {
                aVar.f20374a = dimensionBehaviour4;
            } else if (!z11) {
                if (aVar.f20375b == dimensionBehaviour4) {
                    i9 = aVar.f20377d;
                } else {
                    aVar.f20374a = dimensionBehaviour3;
                    ((ConstraintLayout.b) interfaceC0389b).b(constraintWidget, aVar);
                    i9 = aVar.f20379f;
                }
                aVar.f20374a = dimensionBehaviour4;
                aVar.f20376c = (int) (constraintWidget.f6019Z * i9);
            }
        }
        if (z13) {
            if (iArr[1] == 4) {
                aVar.f20375b = dimensionBehaviour4;
            } else if (!z10) {
                if (aVar.f20374a == dimensionBehaviour4) {
                    i = aVar.f20376c;
                } else {
                    aVar.f20375b = dimensionBehaviour3;
                    ((ConstraintLayout.b) interfaceC0389b).b(constraintWidget, aVar);
                    i = aVar.f20378e;
                }
                aVar.f20375b = dimensionBehaviour4;
                if (constraintWidget.f6021a0 == -1) {
                    aVar.f20377d = (int) (i / constraintWidget.f6019Z);
                } else {
                    aVar.f20377d = (int) (constraintWidget.f6019Z * i);
                }
            }
        }
        ((ConstraintLayout.b) interfaceC0389b).b(constraintWidget, aVar);
        constraintWidget.O(aVar.f20378e);
        constraintWidget.L(aVar.f20379f);
        constraintWidget.f6007F = aVar.f20381h;
        constraintWidget.I(aVar.f20380g);
        aVar.f20382j = 0;
    }

    @Override // c0.C0621b, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void C() {
        this.f6141y0.t();
        this.f6142z0 = 0;
        this.f6123A0 = 0;
        super.C();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void P(boolean z10, boolean z11) {
        super.P(z10, z11);
        int size = this.s0.size();
        for (int i = 0; i < size; i++) {
            this.s0.get(i).P(z10, z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0872 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x087e A[LOOP:13: B:264:0x087c->B:265:0x087e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0632 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x065a  */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v18 */
    @Override // c0.C0621b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R() {
        /*
            Method dump skipped, instructions count: 2409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.d.R():void");
    }

    public final void S(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            int i9 = this.f6124B0 + 1;
            c[] cVarArr = this.f6127E0;
            if (i9 >= cVarArr.length) {
                this.f6127E0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.f6127E0;
            int i10 = this.f6124B0;
            cVarArr2[i10] = new c(constraintWidget, 0, this.f6140x0);
            this.f6124B0 = i10 + 1;
            return;
        }
        if (i == 1) {
            int i11 = this.f6125C0 + 1;
            c[] cVarArr3 = this.f6126D0;
            if (i11 >= cVarArr3.length) {
                this.f6126D0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.f6126D0;
            int i12 = this.f6125C0;
            cVarArr4[i12] = new c(constraintWidget, 1, this.f6140x0);
            this.f6125C0 = i12 + 1;
        }
    }

    public final void T(androidx.constraintlayout.core.c cVar) {
        boolean W = W(64);
        b(cVar, W);
        int size = this.s0.size();
        boolean z10 = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.s0.get(i);
            boolean[] zArr = constraintWidget.U;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i9 = 0; i9 < size; i9++) {
                ConstraintWidget constraintWidget2 = this.s0.get(i9);
                if (constraintWidget2 instanceof a) {
                    a aVar = (a) constraintWidget2;
                    for (int i10 = 0; i10 < aVar.f8508t0; i10++) {
                        ConstraintWidget constraintWidget3 = aVar.s0[i10];
                        if (aVar.f6069v0 || constraintWidget3.c()) {
                            int i11 = aVar.f6068u0;
                            if (i11 == 0 || i11 == 1) {
                                constraintWidget3.U[0] = true;
                            } else if (i11 == 2 || i11 == 3) {
                                constraintWidget3.U[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<ConstraintWidget> hashSet = this.f6135M0;
        hashSet.clear();
        for (int i12 = 0; i12 < size; i12++) {
            ConstraintWidget constraintWidget4 = this.s0.get(i12);
            constraintWidget4.getClass();
            boolean z11 = constraintWidget4 instanceof h;
            if (z11 || (constraintWidget4 instanceof f)) {
                if (z11) {
                    hashSet.add(constraintWidget4);
                } else {
                    constraintWidget4.b(cVar, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<ConstraintWidget> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h hVar = (h) it.next();
                for (int i13 = 0; i13 < hVar.f8508t0; i13++) {
                    if (hashSet.contains(hVar.s0[i13])) {
                        hVar.b(cVar, W);
                        hashSet.remove(hVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<ConstraintWidget> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().b(cVar, W);
                }
                hashSet.clear();
            }
        }
        boolean z12 = androidx.constraintlayout.core.c.f5965q;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f6064b;
        if (z12) {
            HashSet<ConstraintWidget> hashSet2 = new HashSet<>();
            for (int i14 = 0; i14 < size; i14++) {
                ConstraintWidget constraintWidget5 = this.s0.get(i14);
                constraintWidget5.getClass();
                if (!(constraintWidget5 instanceof h) && !(constraintWidget5 instanceof f)) {
                    hashSet2.add(constraintWidget5);
                }
            }
            a(this, cVar, hashSet2, this.V[0] == dimensionBehaviour ? 0 : 1, false);
            Iterator<ConstraintWidget> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next = it3.next();
                g.a(this, cVar, next);
                next.b(cVar, W);
            }
        } else {
            for (int i15 = 0; i15 < size; i15++) {
                ConstraintWidget constraintWidget6 = this.s0.get(i15);
                if (constraintWidget6 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.V;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f6063a;
                    if (dimensionBehaviour2 == dimensionBehaviour) {
                        constraintWidget6.M(dimensionBehaviour4);
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        constraintWidget6.N(dimensionBehaviour4);
                    }
                    constraintWidget6.b(cVar, W);
                    if (dimensionBehaviour2 == dimensionBehaviour) {
                        constraintWidget6.M(dimensionBehaviour2);
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        constraintWidget6.N(dimensionBehaviour3);
                    }
                } else {
                    g.a(this, cVar, constraintWidget6);
                    if (!(constraintWidget6 instanceof h) && !(constraintWidget6 instanceof f)) {
                        constraintWidget6.b(cVar, W);
                    }
                }
            }
        }
        if (this.f6124B0 > 0) {
            b.a(this, cVar, null, 0);
        }
        if (this.f6125C0 > 0) {
            b.a(this, cVar, null, 1);
        }
    }

    public final boolean U(int i, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z14 = z10 & true;
        d0.e eVar = this.f6137u0;
        d dVar = eVar.f20385a;
        ConstraintWidget.DimensionBehaviour j10 = dVar.j(0);
        ConstraintWidget.DimensionBehaviour j11 = dVar.j(1);
        int r8 = dVar.r();
        int s10 = dVar.s();
        ArrayList<WidgetRun> arrayList = eVar.f20389e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f6063a;
        if (z14 && (j10 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f6064b) || j11 == dimensionBehaviour)) {
            Iterator<WidgetRun> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WidgetRun next = it.next();
                if (next.f6096f == i && !next.k()) {
                    z14 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z14 && j10 == dimensionBehaviour) {
                    dVar.M(dimensionBehaviour2);
                    dVar.O(eVar.d(dVar, 0));
                    dVar.f6026d.f6095e.d(dVar.q());
                }
            } else if (z14 && j11 == dimensionBehaviour) {
                dVar.N(dimensionBehaviour2);
                dVar.L(eVar.d(dVar, 1));
                dVar.f6028e.f6095e.d(dVar.k());
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f6066d;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = dVar.V;
        if (i == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
            if (dimensionBehaviour4 == dimensionBehaviour2 || dimensionBehaviour4 == dimensionBehaviour3) {
                int q10 = dVar.q() + r8;
                dVar.f6026d.i.d(q10);
                dVar.f6026d.f6095e.d(q10 - r8);
                z12 = true;
                z11 = true;
            } else {
                z11 = true;
                z12 = false;
            }
        } else {
            z11 = true;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[1];
            if (dimensionBehaviour5 == dimensionBehaviour2 || dimensionBehaviour5 == dimensionBehaviour3) {
                int k3 = dVar.k() + s10;
                dVar.f6028e.i.d(k3);
                dVar.f6028e.f6095e.d(k3 - s10);
                z12 = true;
            }
            z12 = false;
        }
        eVar.g();
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            WidgetRun next2 = it2.next();
            if (next2.f6096f == i && (next2.f6092b != dVar || next2.f6097g)) {
                next2.e();
            }
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next3 = it3.next();
            if (next3.f6096f == i && (z12 || next3.f6092b != dVar)) {
                if (!next3.f6098h.f6080j || !next3.i.f6080j || (!(next3 instanceof d0.c) && !next3.f6095e.f6080j)) {
                    z13 = false;
                    break;
                }
            }
        }
        z13 = z11;
        dVar.M(j10);
        dVar.N(j11);
        return z13;
    }

    public final boolean W(int i) {
        return (this.f6128F0 & i) == i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void n(StringBuilder sb2) {
        sb2.append(this.f6039k + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.X);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.Y);
        sb2.append("\n");
        Iterator<ConstraintWidget> it = this.s0.iterator();
        while (it.hasNext()) {
            it.next().n(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
