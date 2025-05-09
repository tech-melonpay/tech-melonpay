package androidx.constraintlayout.core.widgets;

import C.v;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import c0.C0620a;

/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public final class a extends C0620a {

    /* renamed from: u0, reason: collision with root package name */
    public int f6068u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f6069v0 = true;

    /* renamed from: w0, reason: collision with root package name */
    public int f6070w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f6071x0 = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean A() {
        return this.f6071x0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean B() {
        return this.f6071x0;
    }

    public final boolean T() {
        int i;
        int i9;
        int i10;
        boolean z10 = true;
        int i11 = 0;
        while (true) {
            i = this.f8508t0;
            if (i11 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.s0[i11];
            if ((this.f6069v0 || constraintWidget.c()) && ((((i9 = this.f6068u0) == 0 || i9 == 1) && !constraintWidget.A()) || (((i10 = this.f6068u0) == 2 || i10 == 3) && !constraintWidget.B()))) {
                z10 = false;
            }
            i11++;
        }
        if (!z10 || i <= 0) {
            return false;
        }
        int i12 = 0;
        boolean z11 = false;
        for (int i13 = 0; i13 < this.f8508t0; i13++) {
            ConstraintWidget constraintWidget2 = this.s0[i13];
            if (this.f6069v0 || constraintWidget2.c()) {
                ConstraintAnchor.Type type = ConstraintAnchor.Type.f5997d;
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.f5995b;
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f5996c;
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.f5994a;
                if (!z11) {
                    int i14 = this.f6068u0;
                    if (i14 == 0) {
                        i12 = constraintWidget2.i(type4).d();
                    } else if (i14 == 1) {
                        i12 = constraintWidget2.i(type3).d();
                    } else if (i14 == 2) {
                        i12 = constraintWidget2.i(type2).d();
                    } else if (i14 == 3) {
                        i12 = constraintWidget2.i(type).d();
                    }
                    z11 = true;
                }
                int i15 = this.f6068u0;
                if (i15 == 0) {
                    i12 = Math.min(i12, constraintWidget2.i(type4).d());
                } else if (i15 == 1) {
                    i12 = Math.max(i12, constraintWidget2.i(type3).d());
                } else if (i15 == 2) {
                    i12 = Math.min(i12, constraintWidget2.i(type2).d());
                } else if (i15 == 3) {
                    i12 = Math.max(i12, constraintWidget2.i(type).d());
                }
            }
        }
        int i16 = i12 + this.f6070w0;
        int i17 = this.f6068u0;
        if (i17 == 0 || i17 == 1) {
            J(i16, i16);
        } else {
            K(i16, i16);
        }
        this.f6071x0 = true;
        return true;
    }

    public final int U() {
        int i = this.f6068u0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void b(androidx.constraintlayout.core.c cVar, boolean z10) {
        boolean z11;
        int i;
        ConstraintAnchor[] constraintAnchorArr = this.S;
        ConstraintAnchor constraintAnchor = this.f6012K;
        constraintAnchorArr[0] = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = this.f6013L;
        int i9 = 2;
        constraintAnchorArr[2] = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = this.f6014M;
        constraintAnchorArr[1] = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = this.f6015N;
        constraintAnchorArr[3] = constraintAnchor4;
        for (ConstraintAnchor constraintAnchor5 : constraintAnchorArr) {
            constraintAnchor5.i = cVar.k(constraintAnchor5);
        }
        int i10 = this.f6068u0;
        if (i10 < 0 || i10 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr[i10];
        if (!this.f6071x0) {
            T();
        }
        if (this.f6071x0) {
            this.f6071x0 = false;
            int i11 = this.f6068u0;
            if (i11 == 0 || i11 == 1) {
                cVar.d(constraintAnchor.i, this.f6023b0);
                cVar.d(constraintAnchor3.i, this.f6023b0);
                return;
            } else {
                if (i11 == 2 || i11 == 3) {
                    cVar.d(constraintAnchor2.i, this.f6025c0);
                    cVar.d(constraintAnchor4.i, this.f6025c0);
                    return;
                }
                return;
            }
        }
        for (int i12 = 0; i12 < this.f8508t0; i12++) {
            ConstraintWidget constraintWidget = this.s0[i12];
            if (this.f6069v0 || constraintWidget.c()) {
                int i13 = this.f6068u0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f6065c;
                if (((i13 == 0 || i13 == 1) && constraintWidget.V[0] == dimensionBehaviour && constraintWidget.f6012K.f5991f != null && constraintWidget.f6014M.f5991f != null) || ((i13 == 2 || i13 == 3) && constraintWidget.V[1] == dimensionBehaviour && constraintWidget.f6013L.f5991f != null && constraintWidget.f6015N.f5991f != null)) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        boolean z12 = constraintAnchor.g() || constraintAnchor3.g();
        boolean z13 = constraintAnchor2.g() || constraintAnchor4.g();
        int i14 = (z11 || !(((i = this.f6068u0) == 0 && z12) || ((i == 2 && z13) || ((i == 1 && z12) || (i == 3 && z13))))) ? 4 : 5;
        int i15 = 0;
        while (i15 < this.f8508t0) {
            ConstraintWidget constraintWidget2 = this.s0[i15];
            if (this.f6069v0 || constraintWidget2.c()) {
                SolverVariable k3 = cVar.k(constraintWidget2.S[this.f6068u0]);
                int i16 = this.f6068u0;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.S[i16];
                constraintAnchor7.i = k3;
                ConstraintAnchor constraintAnchor8 = constraintAnchor7.f5991f;
                int i17 = (constraintAnchor8 == null || constraintAnchor8.f5989d != this) ? 0 : constraintAnchor7.f5992g;
                if (i16 == 0 || i16 == i9) {
                    SolverVariable solverVariable = constraintAnchor6.i;
                    int i18 = this.f6070w0 - i17;
                    androidx.constraintlayout.core.b l10 = cVar.l();
                    SolverVariable m2 = cVar.m();
                    m2.f5938d = 0;
                    l10.d(solverVariable, k3, m2, i18);
                    cVar.c(l10);
                } else {
                    SolverVariable solverVariable2 = constraintAnchor6.i;
                    int i19 = this.f6070w0 + i17;
                    androidx.constraintlayout.core.b l11 = cVar.l();
                    SolverVariable m9 = cVar.m();
                    m9.f5938d = 0;
                    l11.c(solverVariable2, k3, m9, i19);
                    cVar.c(l11);
                }
                cVar.e(constraintAnchor6.i, k3, this.f6070w0 + i17, i14);
            }
            i15++;
            i9 = 2;
        }
        int i20 = this.f6068u0;
        if (i20 == 0) {
            cVar.e(constraintAnchor3.i, constraintAnchor.i, 0, 8);
            cVar.e(constraintAnchor.i, this.W.f6014M.i, 0, 4);
            cVar.e(constraintAnchor.i, this.W.f6012K.i, 0, 0);
            return;
        }
        if (i20 == 1) {
            cVar.e(constraintAnchor.i, constraintAnchor3.i, 0, 8);
            cVar.e(constraintAnchor.i, this.W.f6012K.i, 0, 4);
            cVar.e(constraintAnchor.i, this.W.f6014M.i, 0, 0);
        } else if (i20 == 2) {
            cVar.e(constraintAnchor4.i, constraintAnchor2.i, 0, 8);
            cVar.e(constraintAnchor2.i, this.W.f6015N.i, 0, 4);
            cVar.e(constraintAnchor2.i, this.W.f6013L.i, 0, 0);
        } else if (i20 == 3) {
            cVar.e(constraintAnchor2.i, constraintAnchor4.i, 0, 8);
            cVar.e(constraintAnchor2.i, this.W.f6013L.i, 0, 4);
            cVar.e(constraintAnchor2.i, this.W.f6015N.i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean c() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final String toString() {
        String n10 = androidx.camera.core.impl.utils.a.n(new StringBuilder("[Barrier] "), this.f6040k0, " {");
        for (int i = 0; i < this.f8508t0; i++) {
            ConstraintWidget constraintWidget = this.s0[i];
            if (i > 0) {
                n10 = v.n(n10, ", ");
            }
            StringBuilder s10 = v.s(n10);
            s10.append(constraintWidget.f6040k0);
            n10 = s10.toString();
        }
        return v.n(n10, "}");
    }
}
