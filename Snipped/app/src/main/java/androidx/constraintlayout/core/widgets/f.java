package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public final class f extends ConstraintWidget {
    public float s0 = -1.0f;

    /* renamed from: t0, reason: collision with root package name */
    public int f6184t0 = -1;

    /* renamed from: u0, reason: collision with root package name */
    public int f6185u0 = -1;

    /* renamed from: v0, reason: collision with root package name */
    public ConstraintAnchor f6186v0 = this.f6013L;

    /* renamed from: w0, reason: collision with root package name */
    public int f6187w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f6188x0;

    public f() {
        this.T.clear();
        this.T.add(this.f6186v0);
        int length = this.S.length;
        for (int i = 0; i < length; i++) {
            this.S[i] = this.f6186v0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean A() {
        return this.f6188x0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean B() {
        return this.f6188x0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void Q(androidx.constraintlayout.core.c cVar, boolean z10) {
        if (this.W == null) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.f6186v0;
        cVar.getClass();
        int n10 = androidx.constraintlayout.core.c.n(constraintAnchor);
        if (this.f6187w0 == 1) {
            this.f6023b0 = n10;
            this.f6025c0 = 0;
            L(this.W.k());
            O(0);
            return;
        }
        this.f6023b0 = 0;
        this.f6025c0 = n10;
        O(this.W.q());
        L(0);
    }

    public final void R(int i) {
        this.f6186v0.l(i);
        this.f6188x0 = true;
    }

    public final void S(int i) {
        if (this.f6187w0 == i) {
            return;
        }
        this.f6187w0 = i;
        ArrayList<ConstraintAnchor> arrayList = this.T;
        arrayList.clear();
        if (this.f6187w0 == 1) {
            this.f6186v0 = this.f6012K;
        } else {
            this.f6186v0 = this.f6013L;
        }
        arrayList.add(this.f6186v0);
        ConstraintAnchor[] constraintAnchorArr = this.S;
        int length = constraintAnchorArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            constraintAnchorArr[i9] = this.f6186v0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void b(androidx.constraintlayout.core.c cVar, boolean z10) {
        d dVar = (d) this.W;
        if (dVar == null) {
            return;
        }
        Object i = dVar.i(ConstraintAnchor.Type.f5994a);
        Object i9 = dVar.i(ConstraintAnchor.Type.f5996c);
        ConstraintWidget constraintWidget = this.W;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f6064b;
        boolean z11 = constraintWidget != null && constraintWidget.V[0] == dimensionBehaviour;
        if (this.f6187w0 == 0) {
            i = dVar.i(ConstraintAnchor.Type.f5995b);
            i9 = dVar.i(ConstraintAnchor.Type.f5997d);
            ConstraintWidget constraintWidget2 = this.W;
            z11 = constraintWidget2 != null && constraintWidget2.V[1] == dimensionBehaviour;
        }
        if (this.f6188x0) {
            ConstraintAnchor constraintAnchor = this.f6186v0;
            if (constraintAnchor.f5988c) {
                SolverVariable k3 = cVar.k(constraintAnchor);
                cVar.d(k3, this.f6186v0.d());
                if (this.f6184t0 != -1) {
                    if (z11) {
                        cVar.f(cVar.k(i9), k3, 0, 5);
                    }
                } else if (this.f6185u0 != -1 && z11) {
                    SolverVariable k10 = cVar.k(i9);
                    cVar.f(k3, cVar.k(i), 0, 5);
                    cVar.f(k10, k3, 0, 5);
                }
                this.f6188x0 = false;
                return;
            }
        }
        if (this.f6184t0 != -1) {
            SolverVariable k11 = cVar.k(this.f6186v0);
            cVar.e(k11, cVar.k(i), this.f6184t0, 8);
            if (z11) {
                cVar.f(cVar.k(i9), k11, 0, 5);
                return;
            }
            return;
        }
        if (this.f6185u0 != -1) {
            SolverVariable k12 = cVar.k(this.f6186v0);
            SolverVariable k13 = cVar.k(i9);
            cVar.e(k12, k13, -this.f6185u0, 8);
            if (z11) {
                cVar.f(k12, cVar.k(i), 0, 5);
                cVar.f(k13, k12, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1.0f) {
            SolverVariable k14 = cVar.k(this.f6186v0);
            SolverVariable k15 = cVar.k(i9);
            float f10 = this.s0;
            androidx.constraintlayout.core.b l10 = cVar.l();
            l10.f5963d.c(k14, -1.0f);
            l10.f5963d.c(k15, f10);
            cVar.c(l10);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean c() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final ConstraintAnchor i(ConstraintAnchor.Type type) {
        int ordinal = type.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f6187w0 == 0) {
                return this.f6186v0;
            }
            return null;
        }
        if (this.f6187w0 == 1) {
            return this.f6186v0;
        }
        return null;
    }
}
