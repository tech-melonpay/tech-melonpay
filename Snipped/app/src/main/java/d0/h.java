package d0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
public final class h extends WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, d0.d
    public final void a(d dVar) {
        DependencyNode dependencyNode = this.f6098h;
        if (dependencyNode.f6074c && !dependencyNode.f6080j) {
            dependencyNode.d((int) ((((DependencyNode) dependencyNode.f6082l.get(0)).f6078g * ((androidx.constraintlayout.core.widgets.f) this.f6092b).s0) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget = this.f6092b;
        androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
        int i = fVar.f6184t0;
        int i9 = fVar.f6185u0;
        int i10 = fVar.f6187w0;
        DependencyNode dependencyNode = this.f6098h;
        if (i10 == 1) {
            if (i != -1) {
                dependencyNode.f6082l.add(constraintWidget.W.f6026d.f6098h);
                this.f6092b.W.f6026d.f6098h.f6081k.add(dependencyNode);
                dependencyNode.f6077f = i;
            } else if (i9 != -1) {
                dependencyNode.f6082l.add(constraintWidget.W.f6026d.i);
                this.f6092b.W.f6026d.i.f6081k.add(dependencyNode);
                dependencyNode.f6077f = -i9;
            } else {
                dependencyNode.f6073b = true;
                dependencyNode.f6082l.add(constraintWidget.W.f6026d.i);
                this.f6092b.W.f6026d.i.f6081k.add(dependencyNode);
            }
            m(this.f6092b.f6026d.f6098h);
            m(this.f6092b.f6026d.i);
            return;
        }
        if (i != -1) {
            dependencyNode.f6082l.add(constraintWidget.W.f6028e.f6098h);
            this.f6092b.W.f6028e.f6098h.f6081k.add(dependencyNode);
            dependencyNode.f6077f = i;
        } else if (i9 != -1) {
            dependencyNode.f6082l.add(constraintWidget.W.f6028e.i);
            this.f6092b.W.f6028e.i.f6081k.add(dependencyNode);
            dependencyNode.f6077f = -i9;
        } else {
            dependencyNode.f6073b = true;
            dependencyNode.f6082l.add(constraintWidget.W.f6028e.i);
            this.f6092b.W.f6028e.i.f6081k.add(dependencyNode);
        }
        m(this.f6092b.f6028e.f6098h);
        m(this.f6092b.f6028e.i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.f6092b;
        int i = ((androidx.constraintlayout.core.widgets.f) constraintWidget).f6187w0;
        DependencyNode dependencyNode = this.f6098h;
        if (i == 1) {
            constraintWidget.f6023b0 = dependencyNode.f6078g;
        } else {
            constraintWidget.f6025c0 = dependencyNode.f6078g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
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
