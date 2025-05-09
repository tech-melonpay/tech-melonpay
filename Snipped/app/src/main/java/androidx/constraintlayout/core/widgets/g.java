package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: Optimizer.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f6189a = new boolean[3];

    public static void a(d dVar, androidx.constraintlayout.core.c cVar, ConstraintWidget constraintWidget) {
        constraintWidget.f6049p = -1;
        constraintWidget.f6051q = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.V[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f6064b;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f6066d;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        if (dimensionBehaviour != dimensionBehaviour2 && dimensionBehaviourArr[0] == dimensionBehaviour3) {
            ConstraintAnchor constraintAnchor = constraintWidget.f6012K;
            int i = constraintAnchor.f5992g;
            int q10 = dVar.q();
            ConstraintAnchor constraintAnchor2 = constraintWidget.f6014M;
            int i9 = q10 - constraintAnchor2.f5992g;
            constraintAnchor.i = cVar.k(constraintAnchor);
            constraintAnchor2.i = cVar.k(constraintAnchor2);
            cVar.d(constraintAnchor.i, i);
            cVar.d(constraintAnchor2.i, i9);
            constraintWidget.f6049p = 2;
            constraintWidget.f6023b0 = i;
            int i10 = i9 - i;
            constraintWidget.X = i10;
            int i11 = constraintWidget.f6029e0;
            if (i10 < i11) {
                constraintWidget.X = i11;
            }
        }
        if (dVar.V[1] == dimensionBehaviour2 || dimensionBehaviourArr[1] != dimensionBehaviour3) {
            return;
        }
        ConstraintAnchor constraintAnchor3 = constraintWidget.f6013L;
        int i12 = constraintAnchor3.f5992g;
        int k3 = dVar.k();
        ConstraintAnchor constraintAnchor4 = constraintWidget.f6015N;
        int i13 = k3 - constraintAnchor4.f5992g;
        constraintAnchor3.i = cVar.k(constraintAnchor3);
        constraintAnchor4.i = cVar.k(constraintAnchor4);
        cVar.d(constraintAnchor3.i, i12);
        cVar.d(constraintAnchor4.i, i13);
        if (constraintWidget.f6027d0 > 0 || constraintWidget.f6038j0 == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.f6016O;
            constraintAnchor5.i = cVar.k(constraintAnchor5);
            cVar.d(constraintAnchor5.i, constraintWidget.f6027d0 + i12);
        }
        constraintWidget.f6051q = 2;
        constraintWidget.f6025c0 = i12;
        int i14 = i13 - i12;
        constraintWidget.Y = i14;
        int i15 = constraintWidget.f6031f0;
        if (i14 < i15) {
            constraintWidget.Y = i15;
        }
    }

    public static final boolean b(int i, int i9) {
        return (i & i9) == i9;
    }
}
