package d0;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.widget.ConstraintLayout;
import c0.C0620a;
import d0.C0681b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.d f20385a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20386b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20387c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.d f20388d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<WidgetRun> f20389e;

    /* renamed from: f, reason: collision with root package name */
    public C0681b.InterfaceC0389b f20390f;

    /* renamed from: g, reason: collision with root package name */
    public C0681b.a f20391g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<i> f20392h;

    public final void a(DependencyNode dependencyNode, int i, ArrayList arrayList, i iVar) {
        WidgetRun widgetRun = dependencyNode.f6075d;
        if (widgetRun.f6093c == null) {
            androidx.constraintlayout.core.widgets.d dVar = this.f20385a;
            if (widgetRun == dVar.f6026d || widgetRun == dVar.f6028e) {
                return;
            }
            if (iVar == null) {
                iVar = new i();
                iVar.f20394a = null;
                iVar.f20395b = new ArrayList<>();
                iVar.f20394a = widgetRun;
                arrayList.add(iVar);
            }
            widgetRun.f6093c = iVar;
            iVar.f20395b.add(widgetRun);
            DependencyNode dependencyNode2 = widgetRun.f6098h;
            Iterator it = dependencyNode2.f6081k.iterator();
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                if (dVar2 instanceof DependencyNode) {
                    a((DependencyNode) dVar2, i, arrayList, iVar);
                }
            }
            DependencyNode dependencyNode3 = widgetRun.i;
            Iterator it2 = dependencyNode3.f6081k.iterator();
            while (it2.hasNext()) {
                d dVar3 = (d) it2.next();
                if (dVar3 instanceof DependencyNode) {
                    a((DependencyNode) dVar3, i, arrayList, iVar);
                }
            }
            if (i == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.d)) {
                Iterator it3 = ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f6105k.f6081k.iterator();
                while (it3.hasNext()) {
                    d dVar4 = (d) it3.next();
                    if (dVar4 instanceof DependencyNode) {
                        a((DependencyNode) dVar4, i, arrayList, iVar);
                    }
                }
            }
            Iterator it4 = dependencyNode2.f6082l.iterator();
            while (it4.hasNext()) {
                a((DependencyNode) it4.next(), i, arrayList, iVar);
            }
            Iterator it5 = dependencyNode3.f6082l.iterator();
            while (it5.hasNext()) {
                a((DependencyNode) it5.next(), i, arrayList, iVar);
            }
            if (i == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.d)) {
                Iterator it6 = ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f6105k.f6082l.iterator();
                while (it6.hasNext()) {
                    a((DependencyNode) it6.next(), i, arrayList, iVar);
                }
            }
        }
    }

    public final void b(androidx.constraintlayout.core.widgets.d dVar) {
        int i;
        int i9;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        Iterator<ConstraintWidget> it = dVar.s0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
            if (next.f6038j0 == 8) {
                next.f6020a = true;
            } else {
                float f10 = next.f6060x;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f6065c;
                if (f10 < 1.0f && dimensionBehaviour2 == dimensionBehaviour4) {
                    next.f6055s = 2;
                }
                float f11 = next.f6002A;
                if (f11 < 1.0f && dimensionBehaviour3 == dimensionBehaviour4) {
                    next.f6056t = 2;
                }
                float f12 = next.f6019Z;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f6064b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.f6063a;
                if (f12 > 0.0f) {
                    if (dimensionBehaviour2 == dimensionBehaviour4 && (dimensionBehaviour3 == dimensionBehaviour5 || dimensionBehaviour3 == dimensionBehaviour6)) {
                        next.f6055s = 3;
                    } else if (dimensionBehaviour3 == dimensionBehaviour4 && (dimensionBehaviour2 == dimensionBehaviour5 || dimensionBehaviour2 == dimensionBehaviour6)) {
                        next.f6056t = 3;
                    } else if (dimensionBehaviour2 == dimensionBehaviour4 && dimensionBehaviour3 == dimensionBehaviour4) {
                        if (next.f6055s == 0) {
                            next.f6055s = 3;
                        }
                        if (next.f6056t == 0) {
                            next.f6056t = 3;
                        }
                    }
                }
                ConstraintAnchor constraintAnchor = next.f6014M;
                ConstraintAnchor constraintAnchor2 = next.f6012K;
                if (dimensionBehaviour2 == dimensionBehaviour4 && next.f6055s == 1 && (constraintAnchor2.f5991f == null || constraintAnchor.f5991f == null)) {
                    dimensionBehaviour2 = dimensionBehaviour5;
                }
                ConstraintAnchor constraintAnchor3 = next.f6015N;
                ConstraintAnchor constraintAnchor4 = next.f6013L;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = (dimensionBehaviour3 == dimensionBehaviour4 && next.f6056t == 1 && (constraintAnchor4.f5991f == null || constraintAnchor3.f5991f == null)) ? dimensionBehaviour5 : dimensionBehaviour3;
                androidx.constraintlayout.core.widgets.analyzer.c cVar = next.f6026d;
                cVar.f6094d = dimensionBehaviour2;
                int i10 = next.f6055s;
                cVar.f6091a = i10;
                androidx.constraintlayout.core.widgets.analyzer.d dVar2 = next.f6028e;
                dVar2.f6094d = dimensionBehaviour7;
                Iterator<ConstraintWidget> it2 = it;
                int i11 = next.f6056t;
                dVar2.f6091a = i11;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.f6066d;
                if ((dimensionBehaviour2 == dimensionBehaviour8 || dimensionBehaviour2 == dimensionBehaviour6 || dimensionBehaviour2 == dimensionBehaviour5) && (dimensionBehaviour7 == dimensionBehaviour8 || dimensionBehaviour7 == dimensionBehaviour6 || dimensionBehaviour7 == dimensionBehaviour5)) {
                    int q10 = next.q();
                    if (dimensionBehaviour2 == dimensionBehaviour8) {
                        i = (dVar.q() - constraintAnchor2.f5992g) - constraintAnchor.f5992g;
                        dimensionBehaviour2 = dimensionBehaviour6;
                    } else {
                        i = q10;
                    }
                    int k3 = next.k();
                    if (dimensionBehaviour7 == dimensionBehaviour8) {
                        i9 = (dVar.k() - constraintAnchor4.f5992g) - constraintAnchor3.f5992g;
                        dimensionBehaviour = dimensionBehaviour6;
                    } else {
                        i9 = k3;
                        dimensionBehaviour = dimensionBehaviour7;
                    }
                    f(next, dimensionBehaviour2, i, dimensionBehaviour, i9);
                    next.f6026d.f6095e.d(next.q());
                    next.f6028e.f6095e.d(next.k());
                    next.f6020a = true;
                } else {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar.V;
                    ConstraintAnchor[] constraintAnchorArr = next.S;
                    if (dimensionBehaviour2 == dimensionBehaviour4 && (dimensionBehaviour7 == dimensionBehaviour5 || dimensionBehaviour7 == dimensionBehaviour6)) {
                        if (i10 == 3) {
                            if (dimensionBehaviour7 == dimensionBehaviour5) {
                                f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                            }
                            int k10 = next.k();
                            f(next, dimensionBehaviour6, (int) ((k10 * next.f6019Z) + 0.5f), dimensionBehaviour6, k10);
                            next.f6026d.f6095e.d(next.q());
                            next.f6028e.f6095e.d(next.k());
                            next.f6020a = true;
                        } else if (i10 == 1) {
                            f(next, dimensionBehaviour5, 0, dimensionBehaviour7, 0);
                            next.f6026d.f6095e.f6103m = next.q();
                        } else if (i10 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviourArr2[0];
                            if (dimensionBehaviour9 == dimensionBehaviour6 || dimensionBehaviour9 == dimensionBehaviour8) {
                                f(next, dimensionBehaviour6, (int) ((f10 * dVar.q()) + 0.5f), dimensionBehaviour7, next.k());
                                next.f6026d.f6095e.d(next.q());
                                next.f6028e.f6095e.d(next.k());
                                next.f6020a = true;
                            }
                        } else if (constraintAnchorArr[0].f5991f == null || constraintAnchorArr[1].f5991f == null) {
                            f(next, dimensionBehaviour5, 0, dimensionBehaviour7, 0);
                            next.f6026d.f6095e.d(next.q());
                            next.f6028e.f6095e.d(next.k());
                            next.f6020a = true;
                        }
                    }
                    if (dimensionBehaviour7 == dimensionBehaviour4 && (dimensionBehaviour2 == dimensionBehaviour5 || dimensionBehaviour2 == dimensionBehaviour6)) {
                        if (i11 == 3) {
                            if (dimensionBehaviour2 == dimensionBehaviour5) {
                                f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                            }
                            int q11 = next.q();
                            float f13 = next.f6019Z;
                            if (next.f6021a0 == -1) {
                                f13 = 1.0f / f13;
                            }
                            f(next, dimensionBehaviour6, q11, dimensionBehaviour6, (int) ((q11 * f13) + 0.5f));
                            next.f6026d.f6095e.d(next.q());
                            next.f6028e.f6095e.d(next.k());
                            next.f6020a = true;
                        } else if (i11 == 1) {
                            f(next, dimensionBehaviour2, 0, dimensionBehaviour5, 0);
                            next.f6028e.f6095e.f6103m = next.k();
                        } else if (i11 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviourArr2[1];
                            if (dimensionBehaviour10 == dimensionBehaviour6 || dimensionBehaviour10 == dimensionBehaviour8) {
                                f(next, dimensionBehaviour2, next.q(), dimensionBehaviour6, (int) ((f11 * dVar.k()) + 0.5f));
                                next.f6026d.f6095e.d(next.q());
                                next.f6028e.f6095e.d(next.k());
                                next.f6020a = true;
                            }
                        } else if (constraintAnchorArr[2].f5991f == null || constraintAnchorArr[3].f5991f == null) {
                            f(next, dimensionBehaviour5, 0, dimensionBehaviour7, 0);
                            next.f6026d.f6095e.d(next.q());
                            next.f6028e.f6095e.d(next.k());
                            next.f6020a = true;
                        }
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour4 && dimensionBehaviour7 == dimensionBehaviour4) {
                        if (i10 == 1 || i11 == 1) {
                            f(next, dimensionBehaviour5, 0, dimensionBehaviour5, 0);
                            next.f6026d.f6095e.f6103m = next.q();
                            next.f6028e.f6095e.f6103m = next.k();
                        } else if (i11 == 2 && i10 == 2 && dimensionBehaviourArr2[0] == dimensionBehaviour6 && dimensionBehaviourArr2[1] == dimensionBehaviour6) {
                            f(next, dimensionBehaviour6, (int) ((f10 * dVar.q()) + 0.5f), dimensionBehaviour6, (int) ((f11 * dVar.k()) + 0.5f));
                            next.f6026d.f6095e.d(next.q());
                            next.f6028e.f6095e.d(next.k());
                            next.f6020a = true;
                        }
                    }
                }
                it = it2;
            }
        }
    }

    public final void c() {
        ArrayList<WidgetRun> arrayList = this.f20389e;
        arrayList.clear();
        androidx.constraintlayout.core.widgets.d dVar = this.f20388d;
        dVar.f6026d.f();
        dVar.f6028e.f();
        arrayList.add(dVar.f6026d);
        arrayList.add(dVar.f6028e);
        Iterator<ConstraintWidget> it = dVar.s0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof androidx.constraintlayout.core.widgets.f) {
                h hVar = new h(next);
                next.f6026d.f();
                next.f6028e.f();
                hVar.f6096f = ((androidx.constraintlayout.core.widgets.f) next).f6187w0;
                arrayList.add(hVar);
            } else {
                if (next.x()) {
                    if (next.f6022b == null) {
                        next.f6022b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f6022b);
                } else {
                    arrayList.add(next.f6026d);
                }
                if (next.y()) {
                    if (next.f6024c == null) {
                        next.f6024c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f6024c);
                } else {
                    arrayList.add(next.f6028e);
                }
                if (next instanceof C0620a) {
                    arrayList.add(new androidx.constraintlayout.core.widgets.analyzer.b(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.f6092b != dVar) {
                next2.d();
            }
        }
        ArrayList<i> arrayList2 = this.f20392h;
        arrayList2.clear();
        androidx.constraintlayout.core.widgets.d dVar2 = this.f20385a;
        e(dVar2.f6026d, 0, arrayList2);
        e(dVar2.f6028e, 1, arrayList2);
        this.f20386b = false;
    }

    public final int d(androidx.constraintlayout.core.widgets.d dVar, int i) {
        ArrayList<i> arrayList;
        int i9;
        int i10;
        long max;
        float f10;
        androidx.constraintlayout.core.widgets.d dVar2 = dVar;
        ArrayList<i> arrayList2 = this.f20392h;
        int size = arrayList2.size();
        int i11 = 0;
        long j10 = 0;
        while (i11 < size) {
            WidgetRun widgetRun = arrayList2.get(i11).f20394a;
            if (!(widgetRun instanceof c) ? !(i != 0 ? (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.d) : (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.c)) : ((c) widgetRun).f6096f != i) {
                DependencyNode dependencyNode = (i == 0 ? dVar2.f6026d : dVar2.f6028e).f6098h;
                DependencyNode dependencyNode2 = (i == 0 ? dVar2.f6026d : dVar2.f6028e).i;
                boolean contains = widgetRun.f6098h.f6082l.contains(dependencyNode);
                DependencyNode dependencyNode3 = widgetRun.i;
                boolean contains2 = dependencyNode3.f6082l.contains(dependencyNode2);
                long j11 = widgetRun.j();
                DependencyNode dependencyNode4 = widgetRun.f6098h;
                if (contains && contains2) {
                    long b9 = i.b(dependencyNode4, 0L);
                    ArrayList<i> arrayList3 = arrayList2;
                    i9 = size;
                    long a10 = i.a(dependencyNode3, 0L);
                    long j12 = b9 - j11;
                    int i12 = dependencyNode3.f6077f;
                    arrayList = arrayList3;
                    i10 = i11;
                    if (j12 >= (-i12)) {
                        j12 += i12;
                    }
                    long j13 = (-a10) - j11;
                    long j14 = dependencyNode4.f6077f;
                    long j15 = j13 - j14;
                    if (j15 >= j14) {
                        j15 -= j14;
                    }
                    ConstraintWidget constraintWidget = widgetRun.f6092b;
                    if (i == 0) {
                        f10 = constraintWidget.f6033g0;
                    } else if (i == 1) {
                        f10 = constraintWidget.f6035h0;
                    } else {
                        constraintWidget.getClass();
                        f10 = -1.0f;
                    }
                    float f11 = f10 > 0.0f ? (long) ((j12 / (1.0f - f10)) + (j15 / f10)) : 0L;
                    max = (dependencyNode4.f6077f + ((((long) ((f11 * f10) + 0.5f)) + j11) + ((long) com.google.android.gms.measurement.internal.a.d(1.0f, f10, f11, 0.5f)))) - dependencyNode3.f6077f;
                } else {
                    arrayList = arrayList2;
                    i9 = size;
                    i10 = i11;
                    max = contains ? Math.max(i.b(dependencyNode4, dependencyNode4.f6077f), dependencyNode4.f6077f + j11) : contains2 ? Math.max(-i.a(dependencyNode3, dependencyNode3.f6077f), (-dependencyNode3.f6077f) + j11) : (widgetRun.j() + dependencyNode4.f6077f) - dependencyNode3.f6077f;
                }
            } else {
                arrayList = arrayList2;
                i9 = size;
                i10 = i11;
                max = 0;
            }
            j10 = Math.max(j10, max);
            i11 = i10 + 1;
            dVar2 = dVar;
            size = i9;
            arrayList2 = arrayList;
        }
        return (int) j10;
    }

    public final void e(WidgetRun widgetRun, int i, ArrayList<i> arrayList) {
        DependencyNode dependencyNode;
        Iterator it = widgetRun.f6098h.f6081k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            dependencyNode = widgetRun.i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof DependencyNode) {
                a((DependencyNode) dVar, i, arrayList, null);
            } else if (dVar instanceof WidgetRun) {
                a(((WidgetRun) dVar).f6098h, i, arrayList, null);
            }
        }
        Iterator it2 = dependencyNode.f6081k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof DependencyNode) {
                a((DependencyNode) dVar2, i, arrayList, null);
            } else if (dVar2 instanceof WidgetRun) {
                a(((WidgetRun) dVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f6105k.f6081k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof DependencyNode) {
                    a((DependencyNode) dVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i9) {
        C0681b.a aVar = this.f20391g;
        aVar.f20374a = dimensionBehaviour;
        aVar.f20375b = dimensionBehaviour2;
        aVar.f20376c = i;
        aVar.f20377d = i9;
        ((ConstraintLayout.b) this.f20390f).b(constraintWidget, aVar);
        constraintWidget.O(aVar.f20378e);
        constraintWidget.L(aVar.f20379f);
        constraintWidget.f6007F = aVar.f20381h;
        constraintWidget.I(aVar.f20380g);
    }

    public final void g() {
        C0680a c0680a;
        Iterator<ConstraintWidget> it = this.f20385a.s0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.f6020a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.V;
                boolean z10 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = next.f6055s;
                int i9 = next.f6056t;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f6064b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f6065c;
                boolean z11 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == dimensionBehaviour4 && i == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == dimensionBehaviour4 && i9 == 1)) {
                    z10 = true;
                }
                androidx.constraintlayout.core.widgets.analyzer.a aVar = next.f6026d.f6095e;
                boolean z12 = aVar.f6080j;
                androidx.constraintlayout.core.widgets.analyzer.a aVar2 = next.f6028e.f6095e;
                boolean z13 = aVar2.f6080j;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f6063a;
                if (z12 && z13) {
                    f(next, dimensionBehaviour5, aVar.f6078g, dimensionBehaviour5, aVar2.f6078g);
                    next.f6020a = true;
                } else if (z12 && z10) {
                    f(next, dimensionBehaviour5, aVar.f6078g, dimensionBehaviour3, aVar2.f6078g);
                    if (dimensionBehaviour2 == dimensionBehaviour4) {
                        next.f6028e.f6095e.f6103m = next.k();
                    } else {
                        next.f6028e.f6095e.d(next.k());
                        next.f6020a = true;
                    }
                } else if (z13 && z11) {
                    f(next, dimensionBehaviour3, aVar.f6078g, dimensionBehaviour5, aVar2.f6078g);
                    if (dimensionBehaviour == dimensionBehaviour4) {
                        next.f6026d.f6095e.f6103m = next.q();
                    } else {
                        next.f6026d.f6095e.d(next.q());
                        next.f6020a = true;
                    }
                }
                if (next.f6020a && (c0680a = next.f6028e.f6106l) != null) {
                    c0680a.d(next.f6027d0);
                }
            }
        }
    }
}
