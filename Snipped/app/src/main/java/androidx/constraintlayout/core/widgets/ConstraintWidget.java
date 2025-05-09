package androidx.constraintlayout.core.widgets;

import C.v;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintWidget {

    /* renamed from: A, reason: collision with root package name */
    public float f6002A;

    /* renamed from: B, reason: collision with root package name */
    public int f6003B;

    /* renamed from: C, reason: collision with root package name */
    public float f6004C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f6005D;

    /* renamed from: E, reason: collision with root package name */
    public float f6006E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f6007F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f6008G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f6009H;

    /* renamed from: I, reason: collision with root package name */
    public int f6010I;

    /* renamed from: J, reason: collision with root package name */
    public int f6011J;

    /* renamed from: K, reason: collision with root package name */
    public final ConstraintAnchor f6012K;

    /* renamed from: L, reason: collision with root package name */
    public final ConstraintAnchor f6013L;

    /* renamed from: M, reason: collision with root package name */
    public final ConstraintAnchor f6014M;

    /* renamed from: N, reason: collision with root package name */
    public final ConstraintAnchor f6015N;

    /* renamed from: O, reason: collision with root package name */
    public final ConstraintAnchor f6016O;

    /* renamed from: P, reason: collision with root package name */
    public final ConstraintAnchor f6017P;

    /* renamed from: Q, reason: collision with root package name */
    public final ConstraintAnchor f6018Q;
    public final ConstraintAnchor R;
    public final ConstraintAnchor[] S;
    public final ArrayList<ConstraintAnchor> T;
    public final boolean[] U;
    public final DimensionBehaviour[] V;
    public ConstraintWidget W;
    public int X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f6019Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f6021a0;

    /* renamed from: b, reason: collision with root package name */
    public d0.c f6022b;

    /* renamed from: b0, reason: collision with root package name */
    public int f6023b0;

    /* renamed from: c, reason: collision with root package name */
    public d0.c f6024c;

    /* renamed from: c0, reason: collision with root package name */
    public int f6025c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f6027d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f6029e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f6031f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f6033g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f6035h0;

    /* renamed from: i0, reason: collision with root package name */
    public Object f6036i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f6038j0;

    /* renamed from: k, reason: collision with root package name */
    public String f6039k;

    /* renamed from: k0, reason: collision with root package name */
    public String f6040k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6041l;

    /* renamed from: l0, reason: collision with root package name */
    public int f6042l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6043m;

    /* renamed from: m0, reason: collision with root package name */
    public int f6044m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6045n;

    /* renamed from: n0, reason: collision with root package name */
    public final float[] f6046n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6047o;

    /* renamed from: o0, reason: collision with root package name */
    public final ConstraintWidget[] f6048o0;

    /* renamed from: p, reason: collision with root package name */
    public int f6049p;

    /* renamed from: p0, reason: collision with root package name */
    public final ConstraintWidget[] f6050p0;

    /* renamed from: q, reason: collision with root package name */
    public int f6051q;

    /* renamed from: q0, reason: collision with root package name */
    public int f6052q0;

    /* renamed from: r, reason: collision with root package name */
    public int f6053r;

    /* renamed from: r0, reason: collision with root package name */
    public int f6054r0;

    /* renamed from: s, reason: collision with root package name */
    public int f6055s;

    /* renamed from: t, reason: collision with root package name */
    public int f6056t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f6057u;

    /* renamed from: v, reason: collision with root package name */
    public int f6058v;

    /* renamed from: w, reason: collision with root package name */
    public int f6059w;

    /* renamed from: x, reason: collision with root package name */
    public float f6060x;

    /* renamed from: y, reason: collision with root package name */
    public int f6061y;

    /* renamed from: z, reason: collision with root package name */
    public int f6062z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6020a = false;

    /* renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f6026d = null;

    /* renamed from: e, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.d f6028e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f6030f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f6032g = true;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6034h = true;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f6037j = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DimensionBehaviour {

        /* renamed from: a, reason: collision with root package name */
        public static final DimensionBehaviour f6063a;

        /* renamed from: b, reason: collision with root package name */
        public static final DimensionBehaviour f6064b;

        /* renamed from: c, reason: collision with root package name */
        public static final DimensionBehaviour f6065c;

        /* renamed from: d, reason: collision with root package name */
        public static final DimensionBehaviour f6066d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ DimensionBehaviour[] f6067e;

        static {
            DimensionBehaviour dimensionBehaviour = new DimensionBehaviour("FIXED", 0);
            f6063a = dimensionBehaviour;
            DimensionBehaviour dimensionBehaviour2 = new DimensionBehaviour("WRAP_CONTENT", 1);
            f6064b = dimensionBehaviour2;
            DimensionBehaviour dimensionBehaviour3 = new DimensionBehaviour("MATCH_CONSTRAINT", 2);
            f6065c = dimensionBehaviour3;
            DimensionBehaviour dimensionBehaviour4 = new DimensionBehaviour("MATCH_PARENT", 3);
            f6066d = dimensionBehaviour4;
            f6067e = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour2, dimensionBehaviour3, dimensionBehaviour4};
        }

        public DimensionBehaviour() {
            throw null;
        }

        public static DimensionBehaviour valueOf(String str) {
            return (DimensionBehaviour) Enum.valueOf(DimensionBehaviour.class, str);
        }

        public static DimensionBehaviour[] values() {
            return (DimensionBehaviour[]) f6067e.clone();
        }
    }

    public ConstraintWidget() {
        new HashMap();
        this.f6041l = false;
        this.f6043m = false;
        this.f6045n = false;
        this.f6047o = false;
        this.f6049p = -1;
        this.f6051q = -1;
        this.f6053r = 0;
        this.f6055s = 0;
        this.f6056t = 0;
        this.f6057u = new int[2];
        this.f6058v = 0;
        this.f6059w = 0;
        this.f6060x = 1.0f;
        this.f6061y = 0;
        this.f6062z = 0;
        this.f6002A = 1.0f;
        this.f6003B = -1;
        this.f6004C = 1.0f;
        this.f6005D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f6006E = Float.NaN;
        this.f6007F = false;
        this.f6009H = false;
        this.f6010I = 0;
        this.f6011J = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.f5994a);
        this.f6012K = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.f5995b);
        this.f6013L = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.f5996c);
        this.f6014M = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.f5997d);
        this.f6015N = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.f5998e);
        this.f6016O = constraintAnchor5;
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.f6000g);
        this.f6017P = constraintAnchor6;
        ConstraintAnchor constraintAnchor7 = new ConstraintAnchor(this, ConstraintAnchor.Type.f6001h);
        this.f6018Q = constraintAnchor7;
        ConstraintAnchor constraintAnchor8 = new ConstraintAnchor(this, ConstraintAnchor.Type.f5999f);
        this.R = constraintAnchor8;
        this.S = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor8};
        ArrayList<ConstraintAnchor> arrayList = new ArrayList<>();
        this.T = arrayList;
        this.U = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f6063a;
        this.V = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.f6019Z = 0.0f;
        this.f6021a0 = -1;
        this.f6023b0 = 0;
        this.f6025c0 = 0;
        this.f6027d0 = 0;
        this.f6033g0 = 0.5f;
        this.f6035h0 = 0.5f;
        this.f6038j0 = 0;
        this.f6040k0 = null;
        this.f6042l0 = 0;
        this.f6044m0 = 0;
        this.f6046n0 = new float[]{-1.0f, -1.0f};
        this.f6048o0 = new ConstraintWidget[]{null, null};
        this.f6050p0 = new ConstraintWidget[]{null, null};
        this.f6052q0 = -1;
        this.f6054r0 = -1;
        arrayList.add(constraintAnchor);
        arrayList.add(constraintAnchor2);
        arrayList.add(constraintAnchor3);
        arrayList.add(constraintAnchor4);
        arrayList.add(constraintAnchor6);
        arrayList.add(constraintAnchor7);
        arrayList.add(constraintAnchor8);
        arrayList.add(constraintAnchor5);
    }

    public static void G(int i, int i9, String str, StringBuilder sb2) {
        if (i == i9) {
            return;
        }
        v.x(sb2, str, " :   ", i, ",\n");
    }

    public static void H(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public static void o(StringBuilder sb2, String str, int i, int i9, int i10, int i11, int i12, float f10, DimensionBehaviour dimensionBehaviour) {
        sb2.append(str);
        sb2.append(" :  {\n");
        String obj = dimensionBehaviour.toString();
        if (!"FIXED".equals(obj)) {
            androidx.camera.core.impl.utils.a.u(sb2, "      behavior", " :   ", obj, ",\n");
        }
        G(i, 0, "      size", sb2);
        G(i9, 0, "      min", sb2);
        G(i10, Integer.MAX_VALUE, "      max", sb2);
        G(i11, 0, "      matchMin", sb2);
        G(i12, 0, "      matchDef", sb2);
        H(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public static void p(StringBuilder sb2, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f5991f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(constraintAnchor.f5991f);
        sb2.append("'");
        if (constraintAnchor.f5993h != Integer.MIN_VALUE || constraintAnchor.f5992g != 0) {
            sb2.append(",");
            sb2.append(constraintAnchor.f5992g);
            if (constraintAnchor.f5993h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(constraintAnchor.f5993h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public boolean A() {
        return this.f6041l || (this.f6012K.f5988c && this.f6014M.f5988c);
    }

    public boolean B() {
        return this.f6043m || (this.f6013L.f5988c && this.f6015N.f5988c);
    }

    public void C() {
        this.f6012K.j();
        this.f6013L.j();
        this.f6014M.j();
        this.f6015N.j();
        this.f6016O.j();
        this.f6017P.j();
        this.f6018Q.j();
        this.R.j();
        this.W = null;
        this.f6006E = Float.NaN;
        this.X = 0;
        this.Y = 0;
        this.f6019Z = 0.0f;
        this.f6021a0 = -1;
        this.f6023b0 = 0;
        this.f6025c0 = 0;
        this.f6027d0 = 0;
        this.f6029e0 = 0;
        this.f6031f0 = 0;
        this.f6033g0 = 0.5f;
        this.f6035h0 = 0.5f;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f6063a;
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f6036i0 = null;
        this.f6038j0 = 0;
        this.f6042l0 = 0;
        this.f6044m0 = 0;
        float[] fArr = this.f6046n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f6049p = -1;
        this.f6051q = -1;
        int[] iArr = this.f6005D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f6055s = 0;
        this.f6056t = 0;
        this.f6060x = 1.0f;
        this.f6002A = 1.0f;
        this.f6059w = Integer.MAX_VALUE;
        this.f6062z = Integer.MAX_VALUE;
        this.f6058v = 0;
        this.f6061y = 0;
        this.f6003B = -1;
        this.f6004C = 1.0f;
        boolean[] zArr = this.f6030f;
        zArr[0] = true;
        zArr[1] = true;
        this.f6009H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f6032g = true;
        int[] iArr2 = this.f6057u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.i = -1;
        this.f6037j = -1;
    }

    public final void D() {
        ConstraintWidget constraintWidget = this.W;
        if (constraintWidget != null && (constraintWidget instanceof d)) {
            ((d) constraintWidget).getClass();
        }
        ArrayList<ConstraintAnchor> arrayList = this.T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).j();
        }
    }

    public final void E() {
        this.f6041l = false;
        this.f6043m = false;
        this.f6045n = false;
        this.f6047o = false;
        ArrayList<ConstraintAnchor> arrayList = this.T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = arrayList.get(i);
            constraintAnchor.f5988c = false;
            constraintAnchor.f5987b = 0;
        }
    }

    public void F(Fa.h hVar) {
        this.f6012K.k();
        this.f6013L.k();
        this.f6014M.k();
        this.f6015N.k();
        this.f6016O.k();
        this.R.k();
        this.f6017P.k();
        this.f6018Q.k();
    }

    public final void I(int i) {
        this.f6027d0 = i;
        this.f6007F = i > 0;
    }

    public final void J(int i, int i9) {
        if (this.f6041l) {
            return;
        }
        this.f6012K.l(i);
        this.f6014M.l(i9);
        this.f6023b0 = i;
        this.X = i9 - i;
        this.f6041l = true;
    }

    public final void K(int i, int i9) {
        if (this.f6043m) {
            return;
        }
        this.f6013L.l(i);
        this.f6015N.l(i9);
        this.f6025c0 = i;
        this.Y = i9 - i;
        if (this.f6007F) {
            this.f6016O.l(i + this.f6027d0);
        }
        this.f6043m = true;
    }

    public final void L(int i) {
        this.Y = i;
        int i9 = this.f6031f0;
        if (i < i9) {
            this.Y = i9;
        }
    }

    public final void M(DimensionBehaviour dimensionBehaviour) {
        this.V[0] = dimensionBehaviour;
    }

    public final void N(DimensionBehaviour dimensionBehaviour) {
        this.V[1] = dimensionBehaviour;
    }

    public final void O(int i) {
        this.X = i;
        int i9 = this.f6029e0;
        if (i < i9) {
            this.X = i9;
        }
    }

    public void P(boolean z10, boolean z11) {
        int i;
        int i9;
        androidx.constraintlayout.core.widgets.analyzer.c cVar = this.f6026d;
        boolean z12 = z10 & cVar.f6097g;
        androidx.constraintlayout.core.widgets.analyzer.d dVar = this.f6028e;
        boolean z13 = z11 & dVar.f6097g;
        int i10 = cVar.f6098h.f6078g;
        int i11 = dVar.f6098h.f6078g;
        int i12 = cVar.i.f6078g;
        int i13 = dVar.i.f6078g;
        int i14 = i13 - i11;
        if (i12 - i10 < 0 || i14 < 0 || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE) {
            i12 = 0;
            i13 = 0;
            i10 = 0;
            i11 = 0;
        }
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        if (z12) {
            this.f6023b0 = i10;
        }
        if (z13) {
            this.f6025c0 = i11;
        }
        if (this.f6038j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f6063a;
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        if (z12) {
            if (dimensionBehaviourArr[0] == dimensionBehaviour && i15 < (i9 = this.X)) {
                i15 = i9;
            }
            this.X = i15;
            int i17 = this.f6029e0;
            if (i15 < i17) {
                this.X = i17;
            }
        }
        if (z13) {
            if (dimensionBehaviourArr[1] == dimensionBehaviour && i16 < (i = this.Y)) {
                i16 = i;
            }
            this.Y = i16;
            int i18 = this.f6031f0;
            if (i16 < i18) {
                this.Y = i18;
            }
        }
    }

    public void Q(androidx.constraintlayout.core.c cVar, boolean z10) {
        int i;
        int i9;
        androidx.constraintlayout.core.widgets.analyzer.d dVar;
        androidx.constraintlayout.core.widgets.analyzer.c cVar2;
        ConstraintAnchor constraintAnchor = this.f6012K;
        cVar.getClass();
        int n10 = androidx.constraintlayout.core.c.n(constraintAnchor);
        int n11 = androidx.constraintlayout.core.c.n(this.f6013L);
        int n12 = androidx.constraintlayout.core.c.n(this.f6014M);
        int n13 = androidx.constraintlayout.core.c.n(this.f6015N);
        if (z10 && (cVar2 = this.f6026d) != null) {
            DependencyNode dependencyNode = cVar2.f6098h;
            if (dependencyNode.f6080j) {
                DependencyNode dependencyNode2 = cVar2.i;
                if (dependencyNode2.f6080j) {
                    n10 = dependencyNode.f6078g;
                    n12 = dependencyNode2.f6078g;
                }
            }
        }
        if (z10 && (dVar = this.f6028e) != null) {
            DependencyNode dependencyNode3 = dVar.f6098h;
            if (dependencyNode3.f6080j) {
                DependencyNode dependencyNode4 = dVar.i;
                if (dependencyNode4.f6080j) {
                    n11 = dependencyNode3.f6078g;
                    n13 = dependencyNode4.f6078g;
                }
            }
        }
        int i10 = n13 - n11;
        if (n12 - n10 < 0 || i10 < 0 || n10 == Integer.MIN_VALUE || n10 == Integer.MAX_VALUE || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE || n12 == Integer.MIN_VALUE || n12 == Integer.MAX_VALUE || n13 == Integer.MIN_VALUE || n13 == Integer.MAX_VALUE) {
            n10 = 0;
            n11 = 0;
            n12 = 0;
            n13 = 0;
        }
        int i11 = n12 - n10;
        int i12 = n13 - n11;
        this.f6023b0 = n10;
        this.f6025c0 = n11;
        if (this.f6038j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.f6063a;
        if (dimensionBehaviour == dimensionBehaviour2 && i11 < (i9 = this.X)) {
            i11 = i9;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i12 < (i = this.Y)) {
            i12 = i;
        }
        this.X = i11;
        this.Y = i12;
        int i13 = this.f6031f0;
        if (i12 < i13) {
            this.Y = i13;
        }
        int i14 = this.f6029e0;
        if (i11 < i14) {
            this.X = i14;
        }
        int i15 = this.f6059w;
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.f6065c;
        if (i15 > 0 && dimensionBehaviour == dimensionBehaviour3) {
            this.X = Math.min(this.X, i15);
        }
        int i16 = this.f6062z;
        if (i16 > 0 && dimensionBehaviourArr[1] == dimensionBehaviour3) {
            this.Y = Math.min(this.Y, i16);
        }
        int i17 = this.X;
        if (i11 != i17) {
            this.i = i17;
        }
        int i18 = this.Y;
        if (i12 != i18) {
            this.f6037j = i18;
        }
    }

    public final void a(d dVar, androidx.constraintlayout.core.c cVar, HashSet<ConstraintWidget> hashSet, int i, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            g.a(dVar, cVar, this);
            hashSet.remove(this);
            b(cVar, dVar.W(64));
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.f6012K.f5986a;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f5989d.a(dVar, cVar, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.f6014M.f5986a;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f5989d.a(dVar, cVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.f6013L.f5986a;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f5989d.a(dVar, cVar, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.f6015N.f5986a;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f5989d.a(dVar, cVar, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.f6016O.f5986a;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f5989d.a(dVar, cVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:355:0x00d8, code lost:
    
        if (r0.d() > r3.f6132J0.get().d()) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x061d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c6  */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(androidx.constraintlayout.core.c r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 2067
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.b(androidx.constraintlayout.core.c, boolean):void");
    }

    public boolean c() {
        return this.f6038j0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x048b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0505 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0529 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.constraintlayout.core.c r37, boolean r38, boolean r39, boolean r40, boolean r41, androidx.constraintlayout.core.SolverVariable r42, androidx.constraintlayout.core.SolverVariable r43, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r44, boolean r45, androidx.constraintlayout.core.widgets.ConstraintAnchor r46, androidx.constraintlayout.core.widgets.ConstraintAnchor r47, int r48, int r49, int r50, int r51, float r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, int r58, int r59, int r60, int r61, float r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 1411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.d(androidx.constraintlayout.core.c, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        boolean z10;
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f5999f;
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.f6001h;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.f6000g;
        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.f5994a;
        ConstraintAnchor.Type type7 = ConstraintAnchor.Type.f5995b;
        ConstraintAnchor.Type type8 = ConstraintAnchor.Type.f5996c;
        ConstraintAnchor.Type type9 = ConstraintAnchor.Type.f5997d;
        if (type == type3) {
            if (type2 != type3) {
                if (type2 == type6 || type2 == type8) {
                    e(type6, constraintWidget, type2, 0);
                    e(type8, constraintWidget, type2, 0);
                    i(type3).a(constraintWidget.i(type2), 0);
                    return;
                } else {
                    if (type2 == type7 || type2 == type9) {
                        e(type7, constraintWidget, type2, 0);
                        e(type9, constraintWidget, type2, 0);
                        i(type3).a(constraintWidget.i(type2), 0);
                        return;
                    }
                    return;
                }
            }
            ConstraintAnchor i9 = i(type6);
            ConstraintAnchor i10 = i(type8);
            ConstraintAnchor i11 = i(type7);
            ConstraintAnchor i12 = i(type9);
            boolean z11 = true;
            if ((i9 == null || !i9.h()) && (i10 == null || !i10.h())) {
                e(type6, constraintWidget, type6, 0);
                e(type8, constraintWidget, type8, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 == null || !i11.h()) && (i12 == null || !i12.h())) {
                e(type7, constraintWidget, type7, 0);
                e(type9, constraintWidget, type9, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                i(type3).a(constraintWidget.i(type3), 0);
                return;
            } else if (z10) {
                i(type5).a(constraintWidget.i(type5), 0);
                return;
            } else {
                if (z11) {
                    i(type4).a(constraintWidget.i(type4), 0);
                    return;
                }
                return;
            }
        }
        if (type == type5 && (type2 == type6 || type2 == type8)) {
            ConstraintAnchor i13 = i(type6);
            ConstraintAnchor i14 = constraintWidget.i(type2);
            ConstraintAnchor i15 = i(type8);
            i13.a(i14, 0);
            i15.a(i14, 0);
            i(type5).a(i14, 0);
            return;
        }
        if (type == type4 && (type2 == type7 || type2 == type9)) {
            ConstraintAnchor i16 = constraintWidget.i(type2);
            i(type7).a(i16, 0);
            i(type9).a(i16, 0);
            i(type4).a(i16, 0);
            return;
        }
        if (type == type5 && type2 == type5) {
            i(type6).a(constraintWidget.i(type6), 0);
            i(type8).a(constraintWidget.i(type8), 0);
            i(type5).a(constraintWidget.i(type2), 0);
            return;
        }
        if (type == type4 && type2 == type4) {
            i(type7).a(constraintWidget.i(type7), 0);
            i(type9).a(constraintWidget.i(type9), 0);
            i(type4).a(constraintWidget.i(type2), 0);
            return;
        }
        ConstraintAnchor i17 = i(type);
        ConstraintAnchor i18 = constraintWidget.i(type2);
        if (i17.i(i18)) {
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.f5998e;
            if (type == type10) {
                ConstraintAnchor i19 = i(type7);
                ConstraintAnchor i20 = i(type9);
                if (i19 != null) {
                    i19.j();
                }
                if (i20 != null) {
                    i20.j();
                }
            } else if (type == type7 || type == type9) {
                ConstraintAnchor i21 = i(type10);
                if (i21 != null) {
                    i21.j();
                }
                ConstraintAnchor i22 = i(type3);
                if (i22.f5991f != i18) {
                    i22.j();
                }
                ConstraintAnchor f10 = i(type).f();
                ConstraintAnchor i23 = i(type4);
                if (i23.h()) {
                    f10.j();
                    i23.j();
                }
            } else if (type == type6 || type == type8) {
                ConstraintAnchor i24 = i(type3);
                if (i24.f5991f != i18) {
                    i24.j();
                }
                ConstraintAnchor f11 = i(type).f();
                ConstraintAnchor i25 = i(type5);
                if (i25.h()) {
                    f11.j();
                    i25.j();
                }
            }
            i17.a(i18, i);
        }
    }

    public final void f(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.f5989d == this) {
            e(constraintAnchor.f5990e, constraintAnchor2.f5989d, constraintAnchor2.f5990e, i);
        }
    }

    public final void g(androidx.constraintlayout.core.c cVar) {
        cVar.k(this.f6012K);
        cVar.k(this.f6013L);
        cVar.k(this.f6014M);
        cVar.k(this.f6015N);
        if (this.f6027d0 > 0) {
            cVar.k(this.f6016O);
        }
    }

    public final void h() {
        if (this.f6026d == null) {
            this.f6026d = new androidx.constraintlayout.core.widgets.analyzer.c(this);
        }
        if (this.f6028e == null) {
            this.f6028e = new androidx.constraintlayout.core.widgets.analyzer.d(this);
        }
    }

    public ConstraintAnchor i(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.f6012K;
            case 2:
                return this.f6013L;
            case 3:
                return this.f6014M;
            case 4:
                return this.f6015N;
            case 5:
                return this.f6016O;
            case 6:
                return this.R;
            case 7:
                return this.f6017P;
            case 8:
                return this.f6018Q;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final DimensionBehaviour j(int i) {
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        if (i == 0) {
            return dimensionBehaviourArr[0];
        }
        if (i == 1) {
            return dimensionBehaviourArr[1];
        }
        return null;
    }

    public final int k() {
        if (this.f6038j0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public final ConstraintWidget l(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.f6015N).f5991f) != null && constraintAnchor2.f5991f == constraintAnchor) {
                return constraintAnchor2.f5989d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f6014M;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f5991f;
        if (constraintAnchor4 == null || constraintAnchor4.f5991f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f5989d;
    }

    public final ConstraintWidget m(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.f6013L).f5991f) != null && constraintAnchor2.f5991f == constraintAnchor) {
                return constraintAnchor2.f5989d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f6012K;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f5991f;
        if (constraintAnchor4 == null || constraintAnchor4.f5991f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f5989d;
    }

    public void n(StringBuilder sb2) {
        sb2.append("  " + this.f6039k + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.X);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.Y);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f6023b0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f6025c0);
        sb2.append("\n");
        p(sb2, "left", this.f6012K);
        p(sb2, "top", this.f6013L);
        p(sb2, "right", this.f6014M);
        p(sb2, "bottom", this.f6015N);
        p(sb2, "baseline", this.f6016O);
        p(sb2, "centerX", this.f6017P);
        p(sb2, "centerY", this.f6018Q);
        int i = this.X;
        int i9 = this.f6029e0;
        int[] iArr = this.f6005D;
        int i10 = iArr[0];
        int i11 = this.f6058v;
        int i12 = this.f6055s;
        float f10 = this.f6060x;
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        float[] fArr = this.f6046n0;
        float f11 = fArr[0];
        o(sb2, "    width", i, i9, i10, i11, i12, f10, dimensionBehaviour);
        int i13 = this.Y;
        int i14 = this.f6031f0;
        int i15 = iArr[1];
        int i16 = this.f6061y;
        int i17 = this.f6056t;
        float f12 = this.f6002A;
        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
        float f13 = fArr[1];
        o(sb2, "    height", i13, i14, i15, i16, i17, f12, dimensionBehaviour2);
        float f14 = this.f6019Z;
        int i18 = this.f6021a0;
        if (f14 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f14);
            sb2.append(",");
            sb2.append(i18);
            sb2.append("");
            sb2.append("],\n");
        }
        H(sb2, "    horizontalBias", this.f6033g0, 0.5f);
        H(sb2, "    verticalBias", this.f6035h0, 0.5f);
        G(this.f6042l0, 0, "    horizontalChainStyle", sb2);
        G(this.f6044m0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public final int q() {
        if (this.f6038j0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final int r() {
        ConstraintWidget constraintWidget = this.W;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f6023b0 : ((d) constraintWidget).f6142z0 + this.f6023b0;
    }

    public final int s() {
        ConstraintWidget constraintWidget = this.W;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f6025c0 : ((d) constraintWidget).f6123A0 + this.f6025c0;
    }

    public final boolean t(int i) {
        if (i == 0) {
            return (this.f6012K.f5991f != null ? 1 : 0) + (this.f6014M.f5991f != null ? 1 : 0) < 2;
        }
        return ((this.f6013L.f5991f != null ? 1 : 0) + (this.f6015N.f5991f != null ? 1 : 0)) + (this.f6016O.f5991f != null ? 1 : 0) < 2;
    }

    public String toString() {
        StringBuilder s10 = v.s("");
        s10.append(this.f6040k0 != null ? androidx.camera.core.impl.utils.a.n(new StringBuilder("id: "), this.f6040k0, " ") : "");
        s10.append("(");
        s10.append(this.f6023b0);
        s10.append(", ");
        s10.append(this.f6025c0);
        s10.append(") - (");
        s10.append(this.X);
        s10.append(" x ");
        return s3.b.m(s10, this.Y, ")");
    }

    public final boolean u(int i, int i9) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (i == 0) {
            ConstraintAnchor constraintAnchor5 = this.f6012K;
            ConstraintAnchor constraintAnchor6 = constraintAnchor5.f5991f;
            if (constraintAnchor6 != null && constraintAnchor6.f5988c && (constraintAnchor4 = (constraintAnchor3 = this.f6014M).f5991f) != null && constraintAnchor4.f5988c) {
                return (constraintAnchor4.d() - constraintAnchor3.e()) - (constraintAnchor5.e() + constraintAnchor5.f5991f.d()) >= i9;
            }
        } else {
            ConstraintAnchor constraintAnchor7 = this.f6013L;
            ConstraintAnchor constraintAnchor8 = constraintAnchor7.f5991f;
            if (constraintAnchor8 != null && constraintAnchor8.f5988c && (constraintAnchor2 = (constraintAnchor = this.f6015N).f5991f) != null && constraintAnchor2.f5988c) {
                return (constraintAnchor2.d() - constraintAnchor.e()) - (constraintAnchor7.e() + constraintAnchor7.f5991f.d()) >= i9;
            }
        }
        return false;
    }

    public final void v(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i9) {
        i(type).b(constraintWidget.i(type2), i, i9, true);
    }

    public final boolean w(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i9 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.S;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i9];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f5991f;
        return (constraintAnchor4 == null || constraintAnchor4.f5991f == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i9 + 1]).f5991f) == null || constraintAnchor2.f5991f != constraintAnchor) ? false : true;
    }

    public final boolean x() {
        ConstraintAnchor constraintAnchor = this.f6012K;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f5991f;
        if (constraintAnchor2 != null && constraintAnchor2.f5991f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f6014M;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f5991f;
        return constraintAnchor4 != null && constraintAnchor4.f5991f == constraintAnchor3;
    }

    public final boolean y() {
        ConstraintAnchor constraintAnchor = this.f6013L;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f5991f;
        if (constraintAnchor2 != null && constraintAnchor2.f5991f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f6015N;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f5991f;
        return constraintAnchor4 != null && constraintAnchor4.f5991f == constraintAnchor3;
    }

    public final boolean z() {
        return this.f6032g && this.f6038j0 != 8;
    }
}
