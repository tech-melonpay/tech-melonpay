package d0;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import d0.C0681b;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Direct.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0681b.a f20393a = new C0681b.a();

    public static boolean a(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
        ConstraintWidget constraintWidget2 = constraintWidget.W;
        androidx.constraintlayout.core.widgets.d dVar = constraintWidget2 != null ? (androidx.constraintlayout.core.widgets.d) constraintWidget2 : null;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f6063a;
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar.V[0];
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dVar.V[1];
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.f6065c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.f6064b;
        boolean z10 = dimensionBehaviour == dimensionBehaviour3 || constraintWidget.A() || dimensionBehaviour == dimensionBehaviour7 || (dimensionBehaviour == dimensionBehaviour6 && constraintWidget.f6055s == 0 && constraintWidget.f6019Z == 0.0f && constraintWidget.t(0)) || (dimensionBehaviour == dimensionBehaviour6 && constraintWidget.f6055s == 1 && constraintWidget.u(0, constraintWidget.q()));
        boolean z11 = dimensionBehaviour2 == dimensionBehaviour3 || constraintWidget.B() || dimensionBehaviour2 == dimensionBehaviour7 || (dimensionBehaviour2 == dimensionBehaviour6 && constraintWidget.f6056t == 0 && constraintWidget.f6019Z == 0.0f && constraintWidget.t(1)) || (dimensionBehaviour2 == dimensionBehaviour6 && constraintWidget.f6056t == 1 && constraintWidget.u(1, constraintWidget.k()));
        if (constraintWidget.f6019Z <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    public static void b(int i, ConstraintWidget constraintWidget, C0681b.InterfaceC0389b interfaceC0389b, boolean z10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        Iterator<ConstraintAnchor> it;
        boolean z11;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.f6045n) {
            return;
        }
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.z() && a(constraintWidget)) {
            androidx.constraintlayout.core.widgets.d.V(constraintWidget, interfaceC0389b, new C0681b.a());
        }
        ConstraintAnchor i9 = constraintWidget.i(ConstraintAnchor.Type.f5994a);
        ConstraintAnchor i10 = constraintWidget.i(ConstraintAnchor.Type.f5996c);
        int d10 = i9.d();
        int d11 = i10.d();
        HashSet<ConstraintAnchor> hashSet = i9.f5986a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f6065c;
        if (hashSet != null && i9.f5988c) {
            Iterator<ConstraintAnchor> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next = it2.next();
                ConstraintWidget constraintWidget2 = next.f5989d;
                int i11 = i + 1;
                boolean a10 = a(constraintWidget2);
                if (constraintWidget2.z() && a10) {
                    androidx.constraintlayout.core.widgets.d.V(constraintWidget2, interfaceC0389b, new C0681b.a());
                }
                ConstraintAnchor constraintAnchor5 = constraintWidget2.f6012K;
                ConstraintAnchor constraintAnchor6 = constraintWidget2.f6014M;
                if ((next == constraintAnchor5 && (constraintAnchor4 = constraintAnchor6.f5991f) != null && constraintAnchor4.f5988c) || (next == constraintAnchor6 && (constraintAnchor3 = constraintAnchor5.f5991f) != null && constraintAnchor3.f5988c)) {
                    it = it2;
                    z11 = true;
                } else {
                    it = it2;
                    z11 = false;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.V[0];
                if (dimensionBehaviour2 != dimensionBehaviour || a10) {
                    if (!constraintWidget2.z()) {
                        if (next == constraintAnchor5 && constraintAnchor6.f5991f == null) {
                            int e10 = constraintAnchor5.e() + d10;
                            constraintWidget2.J(e10, constraintWidget2.q() + e10);
                            b(i11, constraintWidget2, interfaceC0389b, z10);
                        } else if (next == constraintAnchor6 && constraintAnchor5.f5991f == null) {
                            int e11 = d10 - constraintAnchor6.e();
                            constraintWidget2.J(e11 - constraintWidget2.q(), e11);
                            b(i11, constraintWidget2, interfaceC0389b, z10);
                        } else if (z11 && !constraintWidget2.x()) {
                            c(i11, constraintWidget2, interfaceC0389b, z10);
                        }
                    }
                } else if (dimensionBehaviour2 == dimensionBehaviour && constraintWidget2.f6059w >= 0 && constraintWidget2.f6058v >= 0 && ((constraintWidget2.f6038j0 == 8 || (constraintWidget2.f6055s == 0 && constraintWidget2.f6019Z == 0.0f)) && !constraintWidget2.x() && !constraintWidget2.f6009H && z11 && !constraintWidget2.x())) {
                    d(i11, constraintWidget, interfaceC0389b, constraintWidget2, z10);
                }
                it2 = it;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = i10.f5986a;
        if (hashSet2 != null && i10.f5988c) {
            Iterator<ConstraintAnchor> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintAnchor next2 = it3.next();
                ConstraintWidget constraintWidget3 = next2.f5989d;
                int i12 = i + 1;
                boolean a11 = a(constraintWidget3);
                if (constraintWidget3.z() && a11) {
                    androidx.constraintlayout.core.widgets.d.V(constraintWidget3, interfaceC0389b, new C0681b.a());
                }
                ConstraintAnchor constraintAnchor7 = constraintWidget3.f6012K;
                ConstraintAnchor constraintAnchor8 = constraintWidget3.f6014M;
                boolean z12 = (next2 == constraintAnchor7 && (constraintAnchor2 = constraintAnchor8.f5991f) != null && constraintAnchor2.f5988c) || (next2 == constraintAnchor8 && (constraintAnchor = constraintAnchor7.f5991f) != null && constraintAnchor.f5988c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.V[0];
                if (dimensionBehaviour3 != dimensionBehaviour || a11) {
                    if (!constraintWidget3.z()) {
                        if (next2 == constraintAnchor7 && constraintAnchor8.f5991f == null) {
                            int e12 = constraintAnchor7.e() + d11;
                            constraintWidget3.J(e12, constraintWidget3.q() + e12);
                            b(i12, constraintWidget3, interfaceC0389b, z10);
                        } else if (next2 == constraintAnchor8 && constraintAnchor7.f5991f == null) {
                            int e13 = d11 - constraintAnchor8.e();
                            constraintWidget3.J(e13 - constraintWidget3.q(), e13);
                            b(i12, constraintWidget3, interfaceC0389b, z10);
                        } else if (z12 && !constraintWidget3.x()) {
                            c(i12, constraintWidget3, interfaceC0389b, z10);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour && constraintWidget3.f6059w >= 0 && constraintWidget3.f6058v >= 0) {
                    if (constraintWidget3.f6038j0 != 8) {
                        if (constraintWidget3.f6055s == 0) {
                            if (constraintWidget3.f6019Z == 0.0f) {
                            }
                        }
                    }
                    if (!constraintWidget3.x() && !constraintWidget3.f6009H && z12 && !constraintWidget3.x()) {
                        d(i12, constraintWidget, interfaceC0389b, constraintWidget3, z10);
                    }
                }
            }
        }
        constraintWidget.f6045n = true;
    }

    public static void c(int i, ConstraintWidget constraintWidget, C0681b.InterfaceC0389b interfaceC0389b, boolean z10) {
        float f10 = constraintWidget.f6033g0;
        ConstraintAnchor constraintAnchor = constraintWidget.f6012K;
        int d10 = constraintAnchor.f5991f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.f6014M;
        int d11 = constraintAnchor2.f5991f.d();
        int e10 = constraintAnchor.e() + d10;
        int e11 = d11 - constraintAnchor2.e();
        if (d10 == d11) {
            f10 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int q10 = constraintWidget.q();
        int i9 = (d11 - d10) - q10;
        if (d10 > d11) {
            i9 = (d10 - d11) - q10;
        }
        int i10 = ((int) (i9 > 0 ? (f10 * i9) + 0.5f : f10 * i9)) + d10;
        int i11 = i10 + q10;
        if (d10 > d11) {
            i11 = i10 - q10;
        }
        constraintWidget.J(i10, i11);
        b(i + 1, constraintWidget, interfaceC0389b, z10);
    }

    public static void d(int i, ConstraintWidget constraintWidget, C0681b.InterfaceC0389b interfaceC0389b, ConstraintWidget constraintWidget2, boolean z10) {
        float f10 = constraintWidget2.f6033g0;
        ConstraintAnchor constraintAnchor = constraintWidget2.f6012K;
        int e10 = constraintAnchor.e() + constraintAnchor.f5991f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.f6014M;
        int d10 = constraintAnchor2.f5991f.d() - constraintAnchor2.e();
        if (d10 >= e10) {
            int q10 = constraintWidget2.q();
            if (constraintWidget2.f6038j0 != 8) {
                int i9 = constraintWidget2.f6055s;
                if (i9 == 2) {
                    q10 = (int) (constraintWidget2.f6033g0 * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.q() : constraintWidget.W.q()));
                } else if (i9 == 0) {
                    q10 = d10 - e10;
                }
                q10 = Math.max(constraintWidget2.f6058v, q10);
                int i10 = constraintWidget2.f6059w;
                if (i10 > 0) {
                    q10 = Math.min(i10, q10);
                }
            }
            int i11 = e10 + ((int) ((f10 * ((d10 - e10) - q10)) + 0.5f));
            constraintWidget2.J(i11, q10 + i11);
            b(i + 1, constraintWidget2, interfaceC0389b, z10);
        }
    }

    public static void e(int i, ConstraintWidget constraintWidget, C0681b.InterfaceC0389b interfaceC0389b) {
        float f10 = constraintWidget.f6035h0;
        ConstraintAnchor constraintAnchor = constraintWidget.f6013L;
        int d10 = constraintAnchor.f5991f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.f6015N;
        int d11 = constraintAnchor2.f5991f.d();
        int e10 = constraintAnchor.e() + d10;
        int e11 = d11 - constraintAnchor2.e();
        if (d10 == d11) {
            f10 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int k3 = constraintWidget.k();
        int i9 = (d11 - d10) - k3;
        if (d10 > d11) {
            i9 = (d10 - d11) - k3;
        }
        int i10 = (int) (i9 > 0 ? (f10 * i9) + 0.5f : f10 * i9);
        int i11 = d10 + i10;
        int i12 = i11 + k3;
        if (d10 > d11) {
            i11 = d10 - i10;
            i12 = i11 - k3;
        }
        constraintWidget.K(i11, i12);
        g(i + 1, constraintWidget, interfaceC0389b);
    }

    public static void f(int i, ConstraintWidget constraintWidget, C0681b.InterfaceC0389b interfaceC0389b, ConstraintWidget constraintWidget2) {
        float f10 = constraintWidget2.f6035h0;
        ConstraintAnchor constraintAnchor = constraintWidget2.f6013L;
        int e10 = constraintAnchor.e() + constraintAnchor.f5991f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.f6015N;
        int d10 = constraintAnchor2.f5991f.d() - constraintAnchor2.e();
        if (d10 >= e10) {
            int k3 = constraintWidget2.k();
            if (constraintWidget2.f6038j0 != 8) {
                int i9 = constraintWidget2.f6056t;
                if (i9 == 2) {
                    k3 = (int) (f10 * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.k() : constraintWidget.W.k()));
                } else if (i9 == 0) {
                    k3 = d10 - e10;
                }
                k3 = Math.max(constraintWidget2.f6061y, k3);
                int i10 = constraintWidget2.f6062z;
                if (i10 > 0) {
                    k3 = Math.min(i10, k3);
                }
            }
            int i11 = e10 + ((int) ((f10 * ((d10 - e10) - k3)) + 0.5f));
            constraintWidget2.K(i11, k3 + i11);
            g(i + 1, constraintWidget2, interfaceC0389b);
        }
    }

    public static void g(int i, ConstraintWidget constraintWidget, C0681b.InterfaceC0389b interfaceC0389b) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        if (constraintWidget.f6047o) {
            return;
        }
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.z() && a(constraintWidget)) {
            androidx.constraintlayout.core.widgets.d.V(constraintWidget, interfaceC0389b, new C0681b.a());
        }
        ConstraintAnchor i9 = constraintWidget.i(ConstraintAnchor.Type.f5995b);
        ConstraintAnchor i10 = constraintWidget.i(ConstraintAnchor.Type.f5997d);
        int d10 = i9.d();
        int d11 = i10.d();
        HashSet<ConstraintAnchor> hashSet = i9.f5986a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f6065c;
        if (hashSet != null && i9.f5988c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f5989d;
                int i11 = i + 1;
                boolean a10 = a(constraintWidget2);
                if (constraintWidget2.z() && a10) {
                    androidx.constraintlayout.core.widgets.d.V(constraintWidget2, interfaceC0389b, new C0681b.a());
                }
                ConstraintAnchor constraintAnchor6 = constraintWidget2.f6013L;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.f6015N;
                boolean z10 = (next == constraintAnchor6 && (constraintAnchor5 = constraintAnchor7.f5991f) != null && constraintAnchor5.f5988c) || (next == constraintAnchor7 && (constraintAnchor4 = constraintAnchor6.f5991f) != null && constraintAnchor4.f5988c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.V[1];
                if (dimensionBehaviour2 != dimensionBehaviour || a10) {
                    if (!constraintWidget2.z()) {
                        if (next == constraintAnchor6 && constraintAnchor7.f5991f == null) {
                            int e10 = constraintAnchor6.e() + d10;
                            constraintWidget2.K(e10, constraintWidget2.k() + e10);
                            g(i11, constraintWidget2, interfaceC0389b);
                        } else if (next == constraintAnchor7 && constraintAnchor6.f5991f == null) {
                            int e11 = d10 - constraintAnchor7.e();
                            constraintWidget2.K(e11 - constraintWidget2.k(), e11);
                            g(i11, constraintWidget2, interfaceC0389b);
                        } else if (z10 && !constraintWidget2.y()) {
                            e(i11, constraintWidget2, interfaceC0389b);
                        }
                    }
                } else if (dimensionBehaviour2 == dimensionBehaviour && constraintWidget2.f6062z >= 0 && constraintWidget2.f6061y >= 0 && (constraintWidget2.f6038j0 == 8 || (constraintWidget2.f6056t == 0 && constraintWidget2.f6019Z == 0.0f))) {
                    if (!constraintWidget2.y() && !constraintWidget2.f6009H && z10 && !constraintWidget2.y()) {
                        f(i11, constraintWidget, interfaceC0389b, constraintWidget2);
                    }
                }
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = i10.f5986a;
        if (hashSet2 != null && i10.f5988c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f5989d;
                int i12 = i + 1;
                boolean a11 = a(constraintWidget3);
                if (constraintWidget3.z() && a11) {
                    androidx.constraintlayout.core.widgets.d.V(constraintWidget3, interfaceC0389b, new C0681b.a());
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget3.f6013L;
                ConstraintAnchor constraintAnchor9 = constraintWidget3.f6015N;
                boolean z11 = (next2 == constraintAnchor8 && (constraintAnchor3 = constraintAnchor9.f5991f) != null && constraintAnchor3.f5988c) || (next2 == constraintAnchor9 && (constraintAnchor2 = constraintAnchor8.f5991f) != null && constraintAnchor2.f5988c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.V[1];
                if (dimensionBehaviour3 != dimensionBehaviour || a11) {
                    if (!constraintWidget3.z()) {
                        if (next2 == constraintAnchor8 && constraintAnchor9.f5991f == null) {
                            int e12 = constraintAnchor8.e() + d11;
                            constraintWidget3.K(e12, constraintWidget3.k() + e12);
                            g(i12, constraintWidget3, interfaceC0389b);
                        } else if (next2 == constraintAnchor9 && constraintAnchor8.f5991f == null) {
                            int e13 = d11 - constraintAnchor9.e();
                            constraintWidget3.K(e13 - constraintWidget3.k(), e13);
                            g(i12, constraintWidget3, interfaceC0389b);
                        } else if (z11 && !constraintWidget3.y()) {
                            e(i12, constraintWidget3, interfaceC0389b);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour && constraintWidget3.f6062z >= 0 && constraintWidget3.f6061y >= 0) {
                    if (constraintWidget3.f6038j0 != 8) {
                        if (constraintWidget3.f6056t == 0) {
                            if (constraintWidget3.f6019Z == 0.0f) {
                            }
                        }
                    }
                    if (!constraintWidget3.y() && !constraintWidget3.f6009H && z11 && !constraintWidget3.y()) {
                        f(i12, constraintWidget, interfaceC0389b, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor i13 = constraintWidget.i(ConstraintAnchor.Type.f5998e);
        if (i13.f5986a != null && i13.f5988c) {
            int d12 = i13.d();
            Iterator<ConstraintAnchor> it3 = i13.f5986a.iterator();
            while (it3.hasNext()) {
                ConstraintAnchor next3 = it3.next();
                ConstraintWidget constraintWidget4 = next3.f5989d;
                int i14 = i + 1;
                boolean a12 = a(constraintWidget4);
                if (constraintWidget4.z() && a12) {
                    androidx.constraintlayout.core.widgets.d.V(constraintWidget4, interfaceC0389b, new C0681b.a());
                }
                if (constraintWidget4.V[1] != dimensionBehaviour || a12) {
                    if (!constraintWidget4.z() && next3 == (constraintAnchor = constraintWidget4.f6016O)) {
                        int e14 = next3.e() + d12;
                        if (constraintWidget4.f6007F) {
                            int i15 = e14 - constraintWidget4.f6027d0;
                            int i16 = constraintWidget4.Y + i15;
                            constraintWidget4.f6025c0 = i15;
                            constraintWidget4.f6013L.l(i15);
                            constraintWidget4.f6015N.l(i16);
                            constraintAnchor.l(e14);
                            constraintWidget4.f6043m = true;
                        }
                        g(i14, constraintWidget4, interfaceC0389b);
                    }
                }
            }
        }
        constraintWidget.f6047o = true;
    }
}
