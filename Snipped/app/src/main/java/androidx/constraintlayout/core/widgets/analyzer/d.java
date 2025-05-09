package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import c0.C0620a;
import d0.C0680a;

/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes.dex */
public final class d extends WidgetRun {

    /* renamed from: k, reason: collision with root package name */
    public final DependencyNode f6105k;

    /* renamed from: l, reason: collision with root package name */
    public C0680a f6106l;

    public d(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f6105k = dependencyNode;
        this.f6106l = null;
        this.f6098h.f6076e = DependencyNode.Type.f6088f;
        this.i.f6076e = DependencyNode.Type.f6089g;
        dependencyNode.f6076e = DependencyNode.Type.f6090h;
        this.f6096f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, d0.d
    public final void a(d0.d dVar) {
        float f10;
        float f11;
        float f12;
        int i;
        if (this.f6099j.ordinal() == 3) {
            ConstraintWidget constraintWidget = this.f6092b;
            l(constraintWidget.f6013L, constraintWidget.f6015N, 1);
            return;
        }
        a aVar = this.f6095e;
        boolean z10 = aVar.f6074c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f6065c;
        if (z10 && !aVar.f6080j && this.f6094d == dimensionBehaviour) {
            ConstraintWidget constraintWidget2 = this.f6092b;
            int i9 = constraintWidget2.f6056t;
            if (i9 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.W;
                if (constraintWidget3 != null) {
                    if (constraintWidget3.f6028e.f6095e.f6080j) {
                        aVar.d((int) ((r1.f6078g * constraintWidget2.f6002A) + 0.5f));
                    }
                }
            } else if (i9 == 3) {
                a aVar2 = constraintWidget2.f6026d.f6095e;
                if (aVar2.f6080j) {
                    int i10 = constraintWidget2.f6021a0;
                    if (i10 == -1) {
                        f10 = aVar2.f6078g;
                        f11 = constraintWidget2.f6019Z;
                    } else if (i10 == 0) {
                        f12 = aVar2.f6078g * constraintWidget2.f6019Z;
                        i = (int) (f12 + 0.5f);
                        aVar.d(i);
                    } else if (i10 != 1) {
                        i = 0;
                        aVar.d(i);
                    } else {
                        f10 = aVar2.f6078g;
                        f11 = constraintWidget2.f6019Z;
                    }
                    f12 = f10 / f11;
                    i = (int) (f12 + 0.5f);
                    aVar.d(i);
                }
            }
        }
        DependencyNode dependencyNode = this.f6098h;
        if (dependencyNode.f6074c) {
            DependencyNode dependencyNode2 = this.i;
            if (dependencyNode2.f6074c) {
                if (dependencyNode.f6080j && dependencyNode2.f6080j && aVar.f6080j) {
                    return;
                }
                if (!aVar.f6080j && this.f6094d == dimensionBehaviour) {
                    ConstraintWidget constraintWidget4 = this.f6092b;
                    if (constraintWidget4.f6055s == 0 && !constraintWidget4.y()) {
                        DependencyNode dependencyNode3 = (DependencyNode) dependencyNode.f6082l.get(0);
                        DependencyNode dependencyNode4 = (DependencyNode) dependencyNode2.f6082l.get(0);
                        int i11 = dependencyNode3.f6078g + dependencyNode.f6077f;
                        int i12 = dependencyNode4.f6078g + dependencyNode2.f6077f;
                        dependencyNode.d(i11);
                        dependencyNode2.d(i12);
                        aVar.d(i12 - i11);
                        return;
                    }
                }
                if (!aVar.f6080j && this.f6094d == dimensionBehaviour && this.f6091a == 1 && dependencyNode.f6082l.size() > 0 && dependencyNode2.f6082l.size() > 0) {
                    DependencyNode dependencyNode5 = (DependencyNode) dependencyNode.f6082l.get(0);
                    int i13 = (((DependencyNode) dependencyNode2.f6082l.get(0)).f6078g + dependencyNode2.f6077f) - (dependencyNode5.f6078g + dependencyNode.f6077f);
                    int i14 = aVar.f6103m;
                    if (i13 < i14) {
                        aVar.d(i13);
                    } else {
                        aVar.d(i14);
                    }
                }
                if (aVar.f6080j && dependencyNode.f6082l.size() > 0 && dependencyNode2.f6082l.size() > 0) {
                    DependencyNode dependencyNode6 = (DependencyNode) dependencyNode.f6082l.get(0);
                    DependencyNode dependencyNode7 = (DependencyNode) dependencyNode2.f6082l.get(0);
                    int i15 = dependencyNode6.f6078g;
                    int i16 = dependencyNode.f6077f + i15;
                    int i17 = dependencyNode7.f6078g;
                    int i18 = dependencyNode2.f6077f + i17;
                    float f13 = this.f6092b.f6035h0;
                    if (dependencyNode6 == dependencyNode7) {
                        f13 = 0.5f;
                    } else {
                        i15 = i16;
                        i17 = i18;
                    }
                    dependencyNode.d((int) ((((i17 - i15) - aVar.f6078g) * f13) + i15 + 0.5f));
                    dependencyNode2.d(dependencyNode.f6078g + aVar.f6078g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5 = this.f6092b;
        boolean z10 = constraintWidget5.f6020a;
        a aVar = this.f6095e;
        if (z10) {
            aVar.d(constraintWidget5.k());
        }
        boolean z11 = aVar.f6080j;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f6066d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f6063a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f6065c;
        DependencyNode dependencyNode = this.i;
        DependencyNode dependencyNode2 = this.f6098h;
        if (!z11) {
            ConstraintWidget constraintWidget6 = this.f6092b;
            this.f6094d = constraintWidget6.V[1];
            if (constraintWidget6.f6007F) {
                this.f6106l = new C0680a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f6094d;
            if (dimensionBehaviour4 != dimensionBehaviour3) {
                if (dimensionBehaviour4 == dimensionBehaviour && (constraintWidget4 = this.f6092b.W) != null && constraintWidget4.V[1] == dimensionBehaviour2) {
                    int k3 = (constraintWidget4.k() - this.f6092b.f6013L.e()) - this.f6092b.f6015N.e();
                    WidgetRun.b(dependencyNode2, constraintWidget4.f6028e.f6098h, this.f6092b.f6013L.e());
                    WidgetRun.b(dependencyNode, constraintWidget4.f6028e.i, -this.f6092b.f6015N.e());
                    aVar.d(k3);
                    return;
                }
                if (dimensionBehaviour4 == dimensionBehaviour2) {
                    aVar.d(this.f6092b.k());
                }
            }
        } else if (this.f6094d == dimensionBehaviour && (constraintWidget2 = (constraintWidget = this.f6092b).W) != null && constraintWidget2.V[1] == dimensionBehaviour2) {
            WidgetRun.b(dependencyNode2, constraintWidget2.f6028e.f6098h, constraintWidget.f6013L.e());
            WidgetRun.b(dependencyNode, constraintWidget2.f6028e.i, -this.f6092b.f6015N.e());
            return;
        }
        boolean z12 = aVar.f6080j;
        DependencyNode dependencyNode3 = this.f6105k;
        if (z12) {
            ConstraintWidget constraintWidget7 = this.f6092b;
            if (constraintWidget7.f6020a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.S;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f5991f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f5991f != null) {
                    if (constraintWidget7.y()) {
                        dependencyNode2.f6077f = this.f6092b.S[2].e();
                        dependencyNode.f6077f = -this.f6092b.S[3].e();
                    } else {
                        DependencyNode h9 = WidgetRun.h(this.f6092b.S[2]);
                        if (h9 != null) {
                            WidgetRun.b(dependencyNode2, h9, this.f6092b.S[2].e());
                        }
                        DependencyNode h10 = WidgetRun.h(this.f6092b.S[3]);
                        if (h10 != null) {
                            WidgetRun.b(dependencyNode, h10, -this.f6092b.S[3].e());
                        }
                        dependencyNode2.f6073b = true;
                        dependencyNode.f6073b = true;
                    }
                    ConstraintWidget constraintWidget8 = this.f6092b;
                    if (constraintWidget8.f6007F) {
                        WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget8.f6027d0);
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode h11 = WidgetRun.h(constraintAnchor);
                    if (h11 != null) {
                        WidgetRun.b(dependencyNode2, h11, this.f6092b.S[2].e());
                        WidgetRun.b(dependencyNode, dependencyNode2, aVar.f6078g);
                        ConstraintWidget constraintWidget9 = this.f6092b;
                        if (constraintWidget9.f6007F) {
                            WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget9.f6027d0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.f5991f != null) {
                    DependencyNode h12 = WidgetRun.h(constraintAnchor3);
                    if (h12 != null) {
                        WidgetRun.b(dependencyNode, h12, -this.f6092b.S[3].e());
                        WidgetRun.b(dependencyNode2, dependencyNode, -aVar.f6078g);
                    }
                    ConstraintWidget constraintWidget10 = this.f6092b;
                    if (constraintWidget10.f6007F) {
                        WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget10.f6027d0);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.f5991f != null) {
                    DependencyNode h13 = WidgetRun.h(constraintAnchor4);
                    if (h13 != null) {
                        WidgetRun.b(dependencyNode3, h13, 0);
                        WidgetRun.b(dependencyNode2, dependencyNode3, -this.f6092b.f6027d0);
                        WidgetRun.b(dependencyNode, dependencyNode2, aVar.f6078g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof C0620a) || constraintWidget7.W == null || constraintWidget7.i(ConstraintAnchor.Type.f5999f).f5991f != null) {
                    return;
                }
                ConstraintWidget constraintWidget11 = this.f6092b;
                WidgetRun.b(dependencyNode2, constraintWidget11.W.f6028e.f6098h, constraintWidget11.s());
                WidgetRun.b(dependencyNode, dependencyNode2, aVar.f6078g);
                ConstraintWidget constraintWidget12 = this.f6092b;
                if (constraintWidget12.f6007F) {
                    WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget12.f6027d0);
                    return;
                }
                return;
            }
        }
        if (z12 || this.f6094d != dimensionBehaviour3) {
            aVar.b(this);
        } else {
            ConstraintWidget constraintWidget13 = this.f6092b;
            int i = constraintWidget13.f6056t;
            if (i == 2) {
                ConstraintWidget constraintWidget14 = constraintWidget13.W;
                if (constraintWidget14 != null) {
                    a aVar2 = constraintWidget14.f6028e.f6095e;
                    aVar.f6082l.add(aVar2);
                    aVar2.f6081k.add(aVar);
                    aVar.f6073b = true;
                    aVar.f6081k.add(dependencyNode2);
                    aVar.f6081k.add(dependencyNode);
                }
            } else if (i == 3 && !constraintWidget13.y()) {
                ConstraintWidget constraintWidget15 = this.f6092b;
                if (constraintWidget15.f6055s != 3) {
                    a aVar3 = constraintWidget15.f6026d.f6095e;
                    aVar.f6082l.add(aVar3);
                    aVar3.f6081k.add(aVar);
                    aVar.f6073b = true;
                    aVar.f6081k.add(dependencyNode2);
                    aVar.f6081k.add(dependencyNode);
                }
            }
        }
        ConstraintWidget constraintWidget16 = this.f6092b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget16.S;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f5991f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f5991f != null) {
            if (constraintWidget16.y()) {
                dependencyNode2.f6077f = this.f6092b.S[2].e();
                dependencyNode.f6077f = -this.f6092b.S[3].e();
            } else {
                DependencyNode h14 = WidgetRun.h(this.f6092b.S[2]);
                DependencyNode h15 = WidgetRun.h(this.f6092b.S[3]);
                if (h14 != null) {
                    h14.b(this);
                }
                if (h15 != null) {
                    h15.b(this);
                }
                this.f6099j = WidgetRun.RunType.f6101b;
            }
            if (this.f6092b.f6007F) {
                c(dependencyNode3, dependencyNode2, 1, this.f6106l);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode h16 = WidgetRun.h(constraintAnchor5);
            if (h16 != null) {
                WidgetRun.b(dependencyNode2, h16, this.f6092b.S[2].e());
                c(dependencyNode, dependencyNode2, 1, aVar);
                if (this.f6092b.f6007F) {
                    c(dependencyNode3, dependencyNode2, 1, this.f6106l);
                }
                if (this.f6094d == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget17 = this.f6092b;
                    if (constraintWidget17.f6019Z > 0.0f) {
                        c cVar = constraintWidget17.f6026d;
                        if (cVar.f6094d == dimensionBehaviour3) {
                            cVar.f6095e.f6081k.add(aVar);
                            aVar.f6082l.add(this.f6092b.f6026d.f6095e);
                            aVar.f6072a = this;
                        }
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f5991f != null) {
                DependencyNode h17 = WidgetRun.h(constraintAnchor7);
                if (h17 != null) {
                    WidgetRun.b(dependencyNode, h17, -this.f6092b.S[3].e());
                    c(dependencyNode2, dependencyNode, -1, aVar);
                    if (this.f6092b.f6007F) {
                        c(dependencyNode3, dependencyNode2, 1, this.f6106l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f5991f != null) {
                    DependencyNode h18 = WidgetRun.h(constraintAnchor8);
                    if (h18 != null) {
                        WidgetRun.b(dependencyNode3, h18, 0);
                        c(dependencyNode2, dependencyNode3, -1, this.f6106l);
                        c(dependencyNode, dependencyNode2, 1, aVar);
                    }
                } else if (!(constraintWidget16 instanceof C0620a) && (constraintWidget3 = constraintWidget16.W) != null) {
                    WidgetRun.b(dependencyNode2, constraintWidget3.f6028e.f6098h, constraintWidget16.s());
                    c(dependencyNode, dependencyNode2, 1, aVar);
                    if (this.f6092b.f6007F) {
                        c(dependencyNode3, dependencyNode2, 1, this.f6106l);
                    }
                    if (this.f6094d == dimensionBehaviour3) {
                        ConstraintWidget constraintWidget18 = this.f6092b;
                        if (constraintWidget18.f6019Z > 0.0f) {
                            c cVar2 = constraintWidget18.f6026d;
                            if (cVar2.f6094d == dimensionBehaviour3) {
                                cVar2.f6095e.f6081k.add(aVar);
                                aVar.f6082l.add(this.f6092b.f6026d.f6095e);
                                aVar.f6072a = this;
                            }
                        }
                    }
                }
            }
        }
        if (aVar.f6082l.size() == 0) {
            aVar.f6074c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.f6098h;
        if (dependencyNode.f6080j) {
            this.f6092b.f6025c0 = dependencyNode.f6078g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.f6093c = null;
        this.f6098h.c();
        this.i.c();
        this.f6105k.c();
        this.f6095e.c();
        this.f6097g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return this.f6094d != ConstraintWidget.DimensionBehaviour.f6065c || this.f6092b.f6056t == 0;
    }

    public final void m() {
        this.f6097g = false;
        DependencyNode dependencyNode = this.f6098h;
        dependencyNode.c();
        dependencyNode.f6080j = false;
        DependencyNode dependencyNode2 = this.i;
        dependencyNode2.c();
        dependencyNode2.f6080j = false;
        DependencyNode dependencyNode3 = this.f6105k;
        dependencyNode3.c();
        dependencyNode3.f6080j = false;
        this.f6095e.f6080j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f6092b.f6040k0;
    }
}
