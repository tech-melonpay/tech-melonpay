package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* compiled from: HelperReferences.java */
/* loaded from: classes.dex */
public final class b extends WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, d0.d
    public final void a(d0.d dVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.f6092b;
        int i = aVar.f6068u0;
        DependencyNode dependencyNode = this.f6098h;
        Iterator it = dependencyNode.f6082l.iterator();
        int i9 = 0;
        int i10 = -1;
        while (it.hasNext()) {
            int i11 = ((DependencyNode) it.next()).f6078g;
            if (i10 == -1 || i11 < i10) {
                i10 = i11;
            }
            if (i9 < i11) {
                i9 = i11;
            }
        }
        if (i == 0 || i == 2) {
            dependencyNode.d(i10 + aVar.f6070w0);
        } else {
            dependencyNode.d(i9 + aVar.f6070w0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget = this.f6092b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            DependencyNode dependencyNode = this.f6098h;
            dependencyNode.f6073b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int i = aVar.f6068u0;
            boolean z10 = aVar.f6069v0;
            int i9 = 0;
            if (i == 0) {
                dependencyNode.f6076e = DependencyNode.Type.f6086d;
                while (i9 < aVar.f8508t0) {
                    ConstraintWidget constraintWidget2 = aVar.s0[i9];
                    if (z10 || constraintWidget2.f6038j0 != 8) {
                        DependencyNode dependencyNode2 = constraintWidget2.f6026d.f6098h;
                        dependencyNode2.f6081k.add(dependencyNode);
                        dependencyNode.f6082l.add(dependencyNode2);
                    }
                    i9++;
                }
                m(this.f6092b.f6026d.f6098h);
                m(this.f6092b.f6026d.i);
                return;
            }
            if (i == 1) {
                dependencyNode.f6076e = DependencyNode.Type.f6087e;
                while (i9 < aVar.f8508t0) {
                    ConstraintWidget constraintWidget3 = aVar.s0[i9];
                    if (z10 || constraintWidget3.f6038j0 != 8) {
                        DependencyNode dependencyNode3 = constraintWidget3.f6026d.i;
                        dependencyNode3.f6081k.add(dependencyNode);
                        dependencyNode.f6082l.add(dependencyNode3);
                    }
                    i9++;
                }
                m(this.f6092b.f6026d.f6098h);
                m(this.f6092b.f6026d.i);
                return;
            }
            if (i == 2) {
                dependencyNode.f6076e = DependencyNode.Type.f6088f;
                while (i9 < aVar.f8508t0) {
                    ConstraintWidget constraintWidget4 = aVar.s0[i9];
                    if (z10 || constraintWidget4.f6038j0 != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.f6028e.f6098h;
                        dependencyNode4.f6081k.add(dependencyNode);
                        dependencyNode.f6082l.add(dependencyNode4);
                    }
                    i9++;
                }
                m(this.f6092b.f6028e.f6098h);
                m(this.f6092b.f6028e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            dependencyNode.f6076e = DependencyNode.Type.f6089g;
            while (i9 < aVar.f8508t0) {
                ConstraintWidget constraintWidget5 = aVar.s0[i9];
                if (z10 || constraintWidget5.f6038j0 != 8) {
                    DependencyNode dependencyNode5 = constraintWidget5.f6028e.i;
                    dependencyNode5.f6081k.add(dependencyNode);
                    dependencyNode.f6082l.add(dependencyNode5);
                }
                i9++;
            }
            m(this.f6092b.f6028e.f6098h);
            m(this.f6092b.f6028e.i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.f6092b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int i = ((androidx.constraintlayout.core.widgets.a) constraintWidget).f6068u0;
            DependencyNode dependencyNode = this.f6098h;
            if (i == 0 || i == 1) {
                constraintWidget.f6023b0 = dependencyNode.f6078g;
            } else {
                constraintWidget.f6025c0 = dependencyNode.f6078g;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.f6093c = null;
        this.f6098h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return false;
    }

    public final void m(DependencyNode dependencyNode) {
        DependencyNode dependencyNode2 = this.f6098h;
        dependencyNode2.f6081k.add(dependencyNode);
        dependencyNode.f6082l.add(dependencyNode2);
    }
}
