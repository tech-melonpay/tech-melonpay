package d0;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun.java */
/* loaded from: classes.dex */
public final class c extends WidgetRun {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList<WidgetRun> f20383k;

    /* renamed from: l, reason: collision with root package name */
    public int f20384l;

    public c(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        ConstraintWidget constraintWidget2;
        this.f20383k = new ArrayList<>();
        this.f6096f = i;
        ConstraintWidget constraintWidget3 = this.f6092b;
        ConstraintWidget m2 = constraintWidget3.m(i);
        while (true) {
            ConstraintWidget constraintWidget4 = m2;
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidget4;
            if (constraintWidget3 == null) {
                break;
            } else {
                m2 = constraintWidget3.m(this.f6096f);
            }
        }
        this.f6092b = constraintWidget2;
        int i9 = this.f6096f;
        WidgetRun widgetRun = i9 == 0 ? constraintWidget2.f6026d : i9 == 1 ? constraintWidget2.f6028e : null;
        ArrayList<WidgetRun> arrayList = this.f20383k;
        arrayList.add(widgetRun);
        ConstraintWidget l10 = constraintWidget2.l(this.f6096f);
        while (l10 != null) {
            int i10 = this.f6096f;
            arrayList.add(i10 == 0 ? l10.f6026d : i10 == 1 ? l10.f6028e : null);
            l10 = l10.l(this.f6096f);
        }
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            int i11 = this.f6096f;
            if (i11 == 0) {
                next.f6092b.f6022b = this;
            } else if (i11 == 1) {
                next.f6092b.f6024c = this;
            }
        }
        if (this.f6096f == 0 && ((androidx.constraintlayout.core.widgets.d) this.f6092b.W).f6140x0 && arrayList.size() > 1) {
            this.f6092b = ((WidgetRun) com.google.android.gms.measurement.internal.a.f(1, arrayList)).f6092b;
        }
        this.f20384l = this.f6096f == 0 ? this.f6092b.f6042l0 : this.f6092b.f6044m0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:293:0x03d0, code lost:
    
        r3 = r3 - r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, d0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(d0.d r28) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.c.a(d0.d):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ArrayList<WidgetRun> arrayList = this.f20383k;
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = arrayList.get(0).f6092b;
        ConstraintWidget constraintWidget2 = arrayList.get(size - 1).f6092b;
        int i = this.f6096f;
        DependencyNode dependencyNode = this.i;
        DependencyNode dependencyNode2 = this.f6098h;
        if (i == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.f6012K;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.f6014M;
            DependencyNode i9 = WidgetRun.i(constraintAnchor, 0);
            int e10 = constraintAnchor.e();
            ConstraintWidget m2 = m();
            if (m2 != null) {
                e10 = m2.f6012K.e();
            }
            if (i9 != null) {
                WidgetRun.b(dependencyNode2, i9, e10);
            }
            DependencyNode i10 = WidgetRun.i(constraintAnchor2, 0);
            int e11 = constraintAnchor2.e();
            ConstraintWidget n10 = n();
            if (n10 != null) {
                e11 = n10.f6014M.e();
            }
            if (i10 != null) {
                WidgetRun.b(dependencyNode, i10, -e11);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.f6013L;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.f6015N;
            DependencyNode i11 = WidgetRun.i(constraintAnchor3, 1);
            int e12 = constraintAnchor3.e();
            ConstraintWidget m9 = m();
            if (m9 != null) {
                e12 = m9.f6013L.e();
            }
            if (i11 != null) {
                WidgetRun.b(dependencyNode2, i11, e12);
            }
            DependencyNode i12 = WidgetRun.i(constraintAnchor4, 1);
            int e13 = constraintAnchor4.e();
            ConstraintWidget n11 = n();
            if (n11 != null) {
                e13 = n11.f6015N.e();
            }
            if (i12 != null) {
                WidgetRun.b(dependencyNode, i12, -e13);
            }
        }
        dependencyNode2.f6072a = this;
        dependencyNode.f6072a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList<WidgetRun> arrayList = this.f20383k;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.get(i).e();
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.f6093c = null;
        Iterator<WidgetRun> it = this.f20383k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final long j() {
        ArrayList<WidgetRun> arrayList = this.f20383k;
        int size = arrayList.size();
        long j10 = 0;
        for (int i = 0; i < size; i++) {
            j10 = r5.i.f6077f + arrayList.get(i).j() + j10 + r5.f6098h.f6077f;
        }
        return j10;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        ArrayList<WidgetRun> arrayList = this.f20383k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!arrayList.get(i).k()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget m() {
        int i = 0;
        while (true) {
            ArrayList<WidgetRun> arrayList = this.f20383k;
            if (i >= arrayList.size()) {
                return null;
            }
            ConstraintWidget constraintWidget = arrayList.get(i).f6092b;
            if (constraintWidget.f6038j0 != 8) {
                return constraintWidget;
            }
            i++;
        }
    }

    public final ConstraintWidget n() {
        ArrayList<WidgetRun> arrayList = this.f20383k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = arrayList.get(size).f6092b;
            if (constraintWidget.f6038j0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f6096f == 0 ? "horizontal : " : "vertical : ");
        Iterator<WidgetRun> it = this.f20383k.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            sb2.append("<");
            sb2.append(next);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
