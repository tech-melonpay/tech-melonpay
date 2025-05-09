package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import d0.i;

/* loaded from: classes.dex */
public abstract class WidgetRun implements d0.d {

    /* renamed from: a, reason: collision with root package name */
    public int f6091a;

    /* renamed from: b, reason: collision with root package name */
    public ConstraintWidget f6092b;

    /* renamed from: c, reason: collision with root package name */
    public i f6093c;

    /* renamed from: d, reason: collision with root package name */
    public ConstraintWidget.DimensionBehaviour f6094d;

    /* renamed from: e, reason: collision with root package name */
    public final a f6095e = new a(this);

    /* renamed from: f, reason: collision with root package name */
    public int f6096f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6097g = false;

    /* renamed from: h, reason: collision with root package name */
    public final DependencyNode f6098h = new DependencyNode(this);
    public final DependencyNode i = new DependencyNode(this);

    /* renamed from: j, reason: collision with root package name */
    public RunType f6099j = RunType.f6100a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RunType {

        /* renamed from: a, reason: collision with root package name */
        public static final RunType f6100a;

        /* renamed from: b, reason: collision with root package name */
        public static final RunType f6101b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ RunType[] f6102c;

        static {
            RunType runType = new RunType("NONE", 0);
            f6100a = runType;
            RunType runType2 = new RunType("START", 1);
            RunType runType3 = new RunType("END", 2);
            RunType runType4 = new RunType("CENTER", 3);
            f6101b = runType4;
            f6102c = new RunType[]{runType, runType2, runType3, runType4};
        }

        public RunType() {
            throw null;
        }

        public static RunType valueOf(String str) {
            return (RunType) Enum.valueOf(RunType.class, str);
        }

        public static RunType[] values() {
            return (RunType[]) f6102c.clone();
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f6092b = constraintWidget;
    }

    public static void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        dependencyNode.f6082l.add(dependencyNode2);
        dependencyNode.f6077f = i;
        dependencyNode2.f6081k.add(dependencyNode);
    }

    public static DependencyNode h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f5991f;
        if (constraintAnchor2 == null) {
            return null;
        }
        int ordinal = constraintAnchor2.f5990e.ordinal();
        ConstraintWidget constraintWidget = constraintAnchor2.f5989d;
        if (ordinal == 1) {
            return constraintWidget.f6026d.f6098h;
        }
        if (ordinal == 2) {
            return constraintWidget.f6028e.f6098h;
        }
        if (ordinal == 3) {
            return constraintWidget.f6026d.i;
        }
        if (ordinal == 4) {
            return constraintWidget.f6028e.i;
        }
        if (ordinal != 5) {
            return null;
        }
        return constraintWidget.f6028e.f6105k;
    }

    public static DependencyNode i(ConstraintAnchor constraintAnchor, int i) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f5991f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f5989d;
        WidgetRun widgetRun = i == 0 ? constraintWidget.f6026d : constraintWidget.f6028e;
        int ordinal = constraintAnchor2.f5990e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return widgetRun.f6098h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return widgetRun.i;
        }
        return null;
    }

    public final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, a aVar) {
        dependencyNode.f6082l.add(dependencyNode2);
        dependencyNode.f6082l.add(this.f6095e);
        dependencyNode.f6079h = i;
        dependencyNode.i = aVar;
        dependencyNode2.f6081k.add(dependencyNode);
        aVar.f6081k.add(dependencyNode);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i9) {
        int max;
        if (i9 == 0) {
            ConstraintWidget constraintWidget = this.f6092b;
            int i10 = constraintWidget.f6059w;
            max = Math.max(constraintWidget.f6058v, i);
            if (i10 > 0) {
                max = Math.min(i10, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f6092b;
            int i11 = constraintWidget2.f6062z;
            max = Math.max(constraintWidget2.f6061y, i);
            if (i11 > 0) {
                max = Math.min(i11, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public long j() {
        if (this.f6095e.f6080j) {
            return r0.f6078g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10.f6091a == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(androidx.constraintlayout.core.widgets.ConstraintAnchor r13, androidx.constraintlayout.core.widgets.ConstraintAnchor r14, int r15) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.WidgetRun.l(androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int):void");
    }

    @Override // d0.d
    public void a(d0.d dVar) {
    }
}
