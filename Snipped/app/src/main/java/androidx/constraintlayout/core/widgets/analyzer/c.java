package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import c0.C0620a;

/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes.dex */
public final class c extends WidgetRun {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f6104k = new int[2];

    public c(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f6098h.f6076e = DependencyNode.Type.f6086d;
        this.i.f6076e = DependencyNode.Type.f6087e;
        this.f6096f = 0;
    }

    public static void m(int[] iArr, int i, int i9, int i10, int i11, float f10, int i12) {
        int i13 = i9 - i;
        int i14 = i11 - i10;
        if (i12 != -1) {
            if (i12 == 0) {
                iArr[0] = (int) ((i14 * f10) + 0.5f);
                iArr[1] = i14;
                return;
            } else {
                if (i12 != 1) {
                    return;
                }
                iArr[0] = i13;
                iArr[1] = (int) ((i13 * f10) + 0.5f);
                return;
            }
        }
        int i15 = (int) ((i14 * f10) + 0.5f);
        int i16 = (int) ((i13 / f10) + 0.5f);
        if (i15 <= i13) {
            iArr[0] = i15;
            iArr[1] = i14;
        } else if (i16 <= i14) {
            iArr[0] = i13;
            iArr[1] = i16;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x024a, code lost:
    
        if (r8 != 1) goto L128;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, d0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(d0.d r24) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.c.a(d0.d):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget constraintWidget5 = this.f6092b;
        boolean z10 = constraintWidget5.f6020a;
        a aVar = this.f6095e;
        if (z10) {
            aVar.d(constraintWidget5.q());
        }
        boolean z11 = aVar.f6080j;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f6066d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f6065c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f6063a;
        DependencyNode dependencyNode = this.i;
        DependencyNode dependencyNode2 = this.f6098h;
        if (!z11) {
            ConstraintWidget constraintWidget6 = this.f6092b;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidget6.V[0];
            this.f6094d = dimensionBehaviour6;
            if (dimensionBehaviour6 != dimensionBehaviour4) {
                if (dimensionBehaviour6 == dimensionBehaviour3 && (constraintWidget4 = constraintWidget6.W) != null && ((dimensionBehaviour2 = constraintWidget4.V[0]) == dimensionBehaviour5 || dimensionBehaviour2 == dimensionBehaviour3)) {
                    int q10 = (constraintWidget4.q() - this.f6092b.f6012K.e()) - this.f6092b.f6014M.e();
                    WidgetRun.b(dependencyNode2, constraintWidget4.f6026d.f6098h, this.f6092b.f6012K.e());
                    WidgetRun.b(dependencyNode, constraintWidget4.f6026d.i, -this.f6092b.f6014M.e());
                    aVar.d(q10);
                    return;
                }
                if (dimensionBehaviour6 == dimensionBehaviour5) {
                    aVar.d(constraintWidget6.q());
                }
            }
        } else if (this.f6094d == dimensionBehaviour3 && (constraintWidget2 = (constraintWidget = this.f6092b).W) != null && ((dimensionBehaviour = constraintWidget2.V[0]) == dimensionBehaviour5 || dimensionBehaviour == dimensionBehaviour3)) {
            WidgetRun.b(dependencyNode2, constraintWidget2.f6026d.f6098h, constraintWidget.f6012K.e());
            WidgetRun.b(dependencyNode, constraintWidget2.f6026d.i, -this.f6092b.f6014M.e());
            return;
        }
        if (aVar.f6080j) {
            ConstraintWidget constraintWidget7 = this.f6092b;
            if (constraintWidget7.f6020a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.S;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f5991f;
                if (constraintAnchor2 != null && constraintAnchorArr[1].f5991f != null) {
                    if (constraintWidget7.x()) {
                        dependencyNode2.f6077f = this.f6092b.S[0].e();
                        dependencyNode.f6077f = -this.f6092b.S[1].e();
                        return;
                    }
                    DependencyNode h9 = WidgetRun.h(this.f6092b.S[0]);
                    if (h9 != null) {
                        WidgetRun.b(dependencyNode2, h9, this.f6092b.S[0].e());
                    }
                    DependencyNode h10 = WidgetRun.h(this.f6092b.S[1]);
                    if (h10 != null) {
                        WidgetRun.b(dependencyNode, h10, -this.f6092b.S[1].e());
                    }
                    dependencyNode2.f6073b = true;
                    dependencyNode.f6073b = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode h11 = WidgetRun.h(constraintAnchor);
                    if (h11 != null) {
                        WidgetRun.b(dependencyNode2, h11, this.f6092b.S[0].e());
                        WidgetRun.b(dependencyNode, dependencyNode2, aVar.f6078g);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.f5991f != null) {
                    DependencyNode h12 = WidgetRun.h(constraintAnchor3);
                    if (h12 != null) {
                        WidgetRun.b(dependencyNode, h12, -this.f6092b.S[1].e());
                        WidgetRun.b(dependencyNode2, dependencyNode, -aVar.f6078g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof C0620a) || constraintWidget7.W == null || constraintWidget7.i(ConstraintAnchor.Type.f5999f).f5991f != null) {
                    return;
                }
                ConstraintWidget constraintWidget8 = this.f6092b;
                WidgetRun.b(dependencyNode2, constraintWidget8.W.f6026d.f6098h, constraintWidget8.r());
                WidgetRun.b(dependencyNode, dependencyNode2, aVar.f6078g);
                return;
            }
        }
        if (this.f6094d == dimensionBehaviour4) {
            ConstraintWidget constraintWidget9 = this.f6092b;
            int i = constraintWidget9.f6055s;
            if (i == 2) {
                ConstraintWidget constraintWidget10 = constraintWidget9.W;
                if (constraintWidget10 != null) {
                    a aVar2 = constraintWidget10.f6028e.f6095e;
                    aVar.f6082l.add(aVar2);
                    aVar2.f6081k.add(aVar);
                    aVar.f6073b = true;
                    aVar.f6081k.add(dependencyNode2);
                    aVar.f6081k.add(dependencyNode);
                }
            } else if (i == 3) {
                if (constraintWidget9.f6056t == 3) {
                    dependencyNode2.f6072a = this;
                    dependencyNode.f6072a = this;
                    d dVar = constraintWidget9.f6028e;
                    dVar.f6098h.f6072a = this;
                    dVar.i.f6072a = this;
                    aVar.f6072a = this;
                    if (constraintWidget9.y()) {
                        aVar.f6082l.add(this.f6092b.f6028e.f6095e);
                        this.f6092b.f6028e.f6095e.f6081k.add(aVar);
                        d dVar2 = this.f6092b.f6028e;
                        dVar2.f6095e.f6072a = this;
                        aVar.f6082l.add(dVar2.f6098h);
                        aVar.f6082l.add(this.f6092b.f6028e.i);
                        this.f6092b.f6028e.f6098h.f6081k.add(aVar);
                        this.f6092b.f6028e.i.f6081k.add(aVar);
                    } else if (this.f6092b.x()) {
                        this.f6092b.f6028e.f6095e.f6082l.add(aVar);
                        aVar.f6081k.add(this.f6092b.f6028e.f6095e);
                    } else {
                        this.f6092b.f6028e.f6095e.f6082l.add(aVar);
                    }
                } else {
                    a aVar3 = constraintWidget9.f6028e.f6095e;
                    aVar.f6082l.add(aVar3);
                    aVar3.f6081k.add(aVar);
                    this.f6092b.f6028e.f6098h.f6081k.add(aVar);
                    this.f6092b.f6028e.i.f6081k.add(aVar);
                    aVar.f6073b = true;
                    aVar.f6081k.add(dependencyNode2);
                    aVar.f6081k.add(dependencyNode);
                    dependencyNode2.f6082l.add(aVar);
                    dependencyNode.f6082l.add(aVar);
                }
            }
        }
        ConstraintWidget constraintWidget11 = this.f6092b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget11.S;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f5991f;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].f5991f != null) {
            if (constraintWidget11.x()) {
                dependencyNode2.f6077f = this.f6092b.S[0].e();
                dependencyNode.f6077f = -this.f6092b.S[1].e();
                return;
            }
            DependencyNode h13 = WidgetRun.h(this.f6092b.S[0]);
            DependencyNode h14 = WidgetRun.h(this.f6092b.S[1]);
            if (h13 != null) {
                h13.b(this);
            }
            if (h14 != null) {
                h14.b(this);
            }
            this.f6099j = WidgetRun.RunType.f6101b;
            return;
        }
        if (constraintAnchor5 != null) {
            DependencyNode h15 = WidgetRun.h(constraintAnchor4);
            if (h15 != null) {
                WidgetRun.b(dependencyNode2, h15, this.f6092b.S[0].e());
                c(dependencyNode, dependencyNode2, 1, aVar);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.f5991f != null) {
            DependencyNode h16 = WidgetRun.h(constraintAnchor6);
            if (h16 != null) {
                WidgetRun.b(dependencyNode, h16, -this.f6092b.S[1].e());
                c(dependencyNode2, dependencyNode, -1, aVar);
                return;
            }
            return;
        }
        if ((constraintWidget11 instanceof C0620a) || (constraintWidget3 = constraintWidget11.W) == null) {
            return;
        }
        WidgetRun.b(dependencyNode2, constraintWidget3.f6026d.f6098h, constraintWidget11.r());
        c(dependencyNode, dependencyNode2, 1, aVar);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.f6098h;
        if (dependencyNode.f6080j) {
            this.f6092b.f6023b0 = dependencyNode.f6078g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.f6093c = null;
        this.f6098h.c();
        this.i.c();
        this.f6095e.c();
        this.f6097g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return this.f6094d != ConstraintWidget.DimensionBehaviour.f6065c || this.f6092b.f6055s == 0;
    }

    public final void n() {
        this.f6097g = false;
        DependencyNode dependencyNode = this.f6098h;
        dependencyNode.c();
        dependencyNode.f6080j = false;
        DependencyNode dependencyNode2 = this.i;
        dependencyNode2.c();
        dependencyNode2.f6080j = false;
        this.f6095e.f6080j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f6092b.f6040k0;
    }
}
