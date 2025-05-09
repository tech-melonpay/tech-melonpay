package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* compiled from: Flow.java */
/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: c1, reason: collision with root package name */
    public ConstraintWidget[] f6165c1;

    /* renamed from: F0, reason: collision with root package name */
    public int f6143F0 = -1;

    /* renamed from: G0, reason: collision with root package name */
    public int f6144G0 = -1;

    /* renamed from: H0, reason: collision with root package name */
    public int f6145H0 = -1;

    /* renamed from: I0, reason: collision with root package name */
    public int f6146I0 = -1;

    /* renamed from: J0, reason: collision with root package name */
    public int f6147J0 = -1;

    /* renamed from: K0, reason: collision with root package name */
    public int f6148K0 = -1;

    /* renamed from: L0, reason: collision with root package name */
    public float f6149L0 = 0.5f;

    /* renamed from: M0, reason: collision with root package name */
    public float f6150M0 = 0.5f;
    public float N0 = 0.5f;

    /* renamed from: O0, reason: collision with root package name */
    public float f6151O0 = 0.5f;

    /* renamed from: P0, reason: collision with root package name */
    public float f6152P0 = 0.5f;

    /* renamed from: Q0, reason: collision with root package name */
    public float f6153Q0 = 0.5f;

    /* renamed from: R0, reason: collision with root package name */
    public int f6154R0 = 0;

    /* renamed from: S0, reason: collision with root package name */
    public int f6155S0 = 0;

    /* renamed from: T0, reason: collision with root package name */
    public int f6156T0 = 2;

    /* renamed from: U0, reason: collision with root package name */
    public int f6157U0 = 2;

    /* renamed from: V0, reason: collision with root package name */
    public int f6158V0 = 0;

    /* renamed from: W0, reason: collision with root package name */
    public int f6159W0 = -1;

    /* renamed from: X0, reason: collision with root package name */
    public int f6160X0 = 0;

    /* renamed from: Y0, reason: collision with root package name */
    public final ArrayList<a> f6161Y0 = new ArrayList<>();

    /* renamed from: Z0, reason: collision with root package name */
    public ConstraintWidget[] f6162Z0 = null;

    /* renamed from: a1, reason: collision with root package name */
    public ConstraintWidget[] f6163a1 = null;

    /* renamed from: b1, reason: collision with root package name */
    public int[] f6164b1 = null;

    /* renamed from: d1, reason: collision with root package name */
    public int f6166d1 = 0;

    /* compiled from: Flow.java */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f6167a;

        /* renamed from: d, reason: collision with root package name */
        public ConstraintAnchor f6170d;

        /* renamed from: e, reason: collision with root package name */
        public ConstraintAnchor f6171e;

        /* renamed from: f, reason: collision with root package name */
        public ConstraintAnchor f6172f;

        /* renamed from: g, reason: collision with root package name */
        public ConstraintAnchor f6173g;

        /* renamed from: h, reason: collision with root package name */
        public int f6174h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public int f6175j;

        /* renamed from: k, reason: collision with root package name */
        public int f6176k;

        /* renamed from: q, reason: collision with root package name */
        public int f6182q;

        /* renamed from: b, reason: collision with root package name */
        public ConstraintWidget f6168b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f6169c = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f6177l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f6178m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f6179n = 0;

        /* renamed from: o, reason: collision with root package name */
        public int f6180o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f6181p = 0;

        public a(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i9) {
            this.f6174h = 0;
            this.i = 0;
            this.f6175j = 0;
            this.f6176k = 0;
            this.f6182q = 0;
            this.f6167a = i;
            this.f6170d = constraintAnchor;
            this.f6171e = constraintAnchor2;
            this.f6172f = constraintAnchor3;
            this.f6173g = constraintAnchor4;
            this.f6174h = e.this.f6199y0;
            this.i = e.this.f6195u0;
            this.f6175j = e.this.f6200z0;
            this.f6176k = e.this.f6196v0;
            this.f6182q = i9;
        }

        public final void a(ConstraintWidget constraintWidget) {
            int i = this.f6167a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f6065c;
            e eVar = e.this;
            if (i == 0) {
                int W = eVar.W(constraintWidget, this.f6182q);
                if (constraintWidget.V[0] == dimensionBehaviour) {
                    this.f6181p++;
                    W = 0;
                }
                this.f6177l = W + (constraintWidget.f6038j0 != 8 ? eVar.f6154R0 : 0) + this.f6177l;
                int V = eVar.V(constraintWidget, this.f6182q);
                if (this.f6168b == null || this.f6169c < V) {
                    this.f6168b = constraintWidget;
                    this.f6169c = V;
                    this.f6178m = V;
                }
            } else {
                int W10 = eVar.W(constraintWidget, this.f6182q);
                int V10 = eVar.V(constraintWidget, this.f6182q);
                if (constraintWidget.V[1] == dimensionBehaviour) {
                    this.f6181p++;
                    V10 = 0;
                }
                this.f6178m = V10 + (constraintWidget.f6038j0 != 8 ? eVar.f6155S0 : 0) + this.f6178m;
                if (this.f6168b == null || this.f6169c < W10) {
                    this.f6168b = constraintWidget;
                    this.f6169c = W10;
                    this.f6177l = W10;
                }
            }
            this.f6180o++;
        }

        public final void b(int i, boolean z10, boolean z11) {
            e eVar;
            int i9;
            int i10;
            int i11;
            ConstraintWidget constraintWidget;
            int i12;
            char c2;
            int i13;
            float f10;
            float f11;
            int i14;
            float f12;
            int i15;
            int i16 = this.f6180o;
            int i17 = 0;
            while (true) {
                eVar = e.this;
                if (i17 >= i16 || (i15 = this.f6179n + i17) >= eVar.f6166d1) {
                    break;
                }
                ConstraintWidget constraintWidget2 = eVar.f6165c1[i15];
                if (constraintWidget2 != null) {
                    constraintWidget2.D();
                }
                i17++;
            }
            if (i16 == 0 || this.f6168b == null) {
                return;
            }
            boolean z12 = z11 && i == 0;
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < i16; i20++) {
                int i21 = this.f6179n + (z10 ? (i16 - 1) - i20 : i20);
                if (i21 >= eVar.f6166d1) {
                    break;
                }
                ConstraintWidget constraintWidget3 = eVar.f6165c1[i21];
                if (constraintWidget3 != null && constraintWidget3.f6038j0 == 0) {
                    if (i18 == -1) {
                        i18 = i20;
                    }
                    i19 = i20;
                }
            }
            if (this.f6167a != 0) {
                ConstraintWidget constraintWidget4 = this.f6168b;
                constraintWidget4.f6042l0 = eVar.f6143F0;
                int i22 = this.f6174h;
                if (i > 0) {
                    i22 += eVar.f6154R0;
                }
                ConstraintAnchor constraintAnchor = constraintWidget4.f6012K;
                ConstraintAnchor constraintAnchor2 = constraintWidget4.f6014M;
                if (z10) {
                    constraintAnchor2.a(this.f6172f, i22);
                    if (z11) {
                        constraintAnchor.a(this.f6170d, this.f6175j);
                    }
                    if (i > 0) {
                        this.f6172f.f5989d.f6012K.a(constraintAnchor2, 0);
                    }
                } else {
                    constraintAnchor.a(this.f6170d, i22);
                    if (z11) {
                        constraintAnchor2.a(this.f6172f, this.f6175j);
                    }
                    if (i > 0) {
                        this.f6170d.f5989d.f6014M.a(constraintAnchor, 0);
                    }
                }
                ConstraintWidget constraintWidget5 = null;
                for (int i23 = 0; i23 < i16; i23++) {
                    int i24 = this.f6179n + i23;
                    if (i24 >= eVar.f6166d1) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = eVar.f6165c1[i24];
                    if (constraintWidget6 != null) {
                        ConstraintAnchor constraintAnchor3 = constraintWidget6.f6013L;
                        if (i23 == 0) {
                            constraintWidget6.f(constraintAnchor3, this.f6171e, this.i);
                            int i25 = eVar.f6144G0;
                            float f13 = eVar.f6150M0;
                            if (this.f6179n == 0) {
                                i11 = eVar.f6146I0;
                                i9 = i25;
                                i10 = -1;
                                if (i11 != -1) {
                                    f13 = eVar.f6151O0;
                                    constraintWidget6.f6044m0 = i11;
                                    constraintWidget6.f6035h0 = f13;
                                }
                            } else {
                                i9 = i25;
                                i10 = -1;
                            }
                            if (!z11 || (i11 = eVar.f6148K0) == i10) {
                                i11 = i9;
                            } else {
                                f13 = eVar.f6153Q0;
                            }
                            constraintWidget6.f6044m0 = i11;
                            constraintWidget6.f6035h0 = f13;
                        }
                        if (i23 == i16 - 1) {
                            constraintWidget6.f(constraintWidget6.f6015N, this.f6173g, this.f6176k);
                        }
                        if (constraintWidget5 != null) {
                            int i26 = eVar.f6155S0;
                            ConstraintAnchor constraintAnchor4 = constraintWidget5.f6015N;
                            constraintAnchor3.a(constraintAnchor4, i26);
                            if (i23 == i18) {
                                int i27 = this.i;
                                if (constraintAnchor3.h()) {
                                    constraintAnchor3.f5993h = i27;
                                }
                            }
                            constraintAnchor4.a(constraintAnchor3, 0);
                            if (i23 == i19 + 1) {
                                int i28 = this.f6176k;
                                if (constraintAnchor4.h()) {
                                    constraintAnchor4.f5993h = i28;
                                }
                            }
                        }
                        if (constraintWidget6 != constraintWidget4) {
                            ConstraintAnchor constraintAnchor5 = constraintWidget6.f6014M;
                            ConstraintAnchor constraintAnchor6 = constraintWidget6.f6012K;
                            if (z10) {
                                int i29 = eVar.f6156T0;
                                if (i29 == 0) {
                                    constraintAnchor5.a(constraintAnchor2, 0);
                                } else if (i29 == 1) {
                                    constraintAnchor6.a(constraintAnchor, 0);
                                } else if (i29 == 2) {
                                    constraintAnchor6.a(constraintAnchor, 0);
                                    constraintAnchor5.a(constraintAnchor2, 0);
                                }
                            } else {
                                int i30 = eVar.f6156T0;
                                if (i30 == 0) {
                                    constraintAnchor6.a(constraintAnchor, 0);
                                } else if (i30 == 1) {
                                    constraintAnchor5.a(constraintAnchor2, 0);
                                } else if (i30 == 2) {
                                    if (z12) {
                                        constraintAnchor6.a(this.f6170d, this.f6174h);
                                        constraintAnchor5.a(this.f6172f, this.f6175j);
                                    } else {
                                        constraintAnchor6.a(constraintAnchor, 0);
                                        constraintAnchor5.a(constraintAnchor2, 0);
                                    }
                                }
                                constraintWidget5 = constraintWidget6;
                            }
                        }
                        constraintWidget5 = constraintWidget6;
                    }
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.f6168b;
            constraintWidget7.f6044m0 = eVar.f6144G0;
            int i31 = this.i;
            if (i > 0) {
                i31 += eVar.f6155S0;
            }
            ConstraintAnchor constraintAnchor7 = this.f6171e;
            ConstraintAnchor constraintAnchor8 = constraintWidget7.f6013L;
            constraintAnchor8.a(constraintAnchor7, i31);
            ConstraintAnchor constraintAnchor9 = constraintWidget7.f6015N;
            if (z11) {
                constraintAnchor9.a(this.f6173g, this.f6176k);
            }
            if (i > 0) {
                this.f6171e.f5989d.f6015N.a(constraintAnchor8, 0);
            }
            if (eVar.f6157U0 == 3 && !constraintWidget7.f6007F) {
                for (int i32 = 0; i32 < i16; i32++) {
                    int i33 = this.f6179n + (z10 ? (i16 - 1) - i32 : i32);
                    if (i33 >= eVar.f6166d1) {
                        break;
                    }
                    constraintWidget = eVar.f6165c1[i33];
                    if (constraintWidget.f6007F) {
                        break;
                    }
                }
            }
            constraintWidget = constraintWidget7;
            int i34 = 0;
            ConstraintWidget constraintWidget8 = null;
            while (i34 < i16) {
                int i35 = z10 ? (i16 - 1) - i34 : i34;
                int i36 = this.f6179n + i35;
                if (i36 >= eVar.f6166d1) {
                    return;
                }
                ConstraintWidget constraintWidget9 = eVar.f6165c1[i36];
                if (constraintWidget9 == null) {
                    i12 = i16;
                    c2 = 3;
                } else {
                    ConstraintAnchor constraintAnchor10 = constraintWidget9.f6012K;
                    if (i34 == 0) {
                        constraintWidget9.f(constraintAnchor10, this.f6170d, this.f6174h);
                    }
                    if (i35 == 0) {
                        int i37 = eVar.f6143F0;
                        if (z10) {
                            i13 = i37;
                            f10 = 1.0f - eVar.f6149L0;
                        } else {
                            i13 = i37;
                            f10 = eVar.f6149L0;
                        }
                        if (this.f6179n == 0) {
                            int i38 = eVar.f6145H0;
                            f11 = f10;
                            if (i38 != -1) {
                                f12 = z10 ? 1.0f - eVar.N0 : eVar.N0;
                                i14 = i38;
                                constraintWidget9.f6042l0 = i14;
                                constraintWidget9.f6033g0 = f12;
                            }
                        } else {
                            f11 = f10;
                        }
                        if (!z11 || (i14 = eVar.f6147J0) == -1) {
                            i14 = i13;
                            f12 = f11;
                        } else {
                            f12 = z10 ? 1.0f - eVar.f6152P0 : eVar.f6152P0;
                        }
                        constraintWidget9.f6042l0 = i14;
                        constraintWidget9.f6033g0 = f12;
                    }
                    if (i34 == i16 - 1) {
                        i12 = i16;
                        constraintWidget9.f(constraintWidget9.f6014M, this.f6172f, this.f6175j);
                    } else {
                        i12 = i16;
                    }
                    if (constraintWidget8 != null) {
                        int i39 = eVar.f6154R0;
                        ConstraintAnchor constraintAnchor11 = constraintWidget8.f6014M;
                        constraintAnchor10.a(constraintAnchor11, i39);
                        if (i34 == i18) {
                            int i40 = this.f6174h;
                            if (constraintAnchor10.h()) {
                                constraintAnchor10.f5993h = i40;
                            }
                        }
                        constraintAnchor11.a(constraintAnchor10, 0);
                        if (i34 == i19 + 1) {
                            int i41 = this.f6175j;
                            if (constraintAnchor11.h()) {
                                constraintAnchor11.f5993h = i41;
                            }
                        }
                    }
                    if (constraintWidget9 != constraintWidget7) {
                        int i42 = eVar.f6157U0;
                        c2 = 3;
                        if (i42 == 3 && constraintWidget.f6007F && constraintWidget9 != constraintWidget && constraintWidget9.f6007F) {
                            constraintWidget9.f6016O.a(constraintWidget.f6016O, 0);
                        } else {
                            ConstraintAnchor constraintAnchor12 = constraintWidget9.f6013L;
                            if (i42 != 0) {
                                ConstraintAnchor constraintAnchor13 = constraintWidget9.f6015N;
                                if (i42 == 1) {
                                    constraintAnchor13.a(constraintAnchor9, 0);
                                } else if (z12) {
                                    constraintAnchor12.a(this.f6171e, this.i);
                                    constraintAnchor13.a(this.f6173g, this.f6176k);
                                } else {
                                    constraintAnchor12.a(constraintAnchor8, 0);
                                    constraintAnchor13.a(constraintAnchor9, 0);
                                }
                            } else {
                                constraintAnchor12.a(constraintAnchor8, 0);
                            }
                        }
                    } else {
                        c2 = 3;
                    }
                    constraintWidget8 = constraintWidget9;
                }
                i34++;
                i16 = i12;
            }
        }

        public final int c() {
            return this.f6167a == 1 ? this.f6178m - e.this.f6155S0 : this.f6178m;
        }

        public final int d() {
            return this.f6167a == 0 ? this.f6177l - e.this.f6154R0 : this.f6177l;
        }

        public final void e(int i) {
            int i9 = this.f6181p;
            if (i9 == 0) {
                return;
            }
            int i10 = this.f6180o;
            int i11 = i / i9;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = this.f6179n;
                int i14 = i13 + i12;
                e eVar = e.this;
                if (i14 >= eVar.f6166d1) {
                    break;
                }
                ConstraintWidget constraintWidget = eVar.f6165c1[i13 + i12];
                int i15 = this.f6167a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f6063a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f6065c;
                if (i15 == 0) {
                    if (constraintWidget != null) {
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
                        if (dimensionBehaviourArr[0] == dimensionBehaviour2 && constraintWidget.f6055s == 0) {
                            eVar.U(constraintWidget, dimensionBehaviour, i11, dimensionBehaviourArr[1], constraintWidget.k());
                        }
                    }
                } else if (constraintWidget != null) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.V;
                    if (dimensionBehaviourArr2[1] == dimensionBehaviour2 && constraintWidget.f6056t == 0) {
                        eVar.U(constraintWidget, dimensionBehaviourArr2[0], constraintWidget.q(), dimensionBehaviour, i11);
                    }
                }
            }
            this.f6177l = 0;
            this.f6178m = 0;
            this.f6168b = null;
            this.f6169c = 0;
            int i16 = this.f6180o;
            for (int i17 = 0; i17 < i16; i17++) {
                int i18 = this.f6179n + i17;
                e eVar2 = e.this;
                if (i18 >= eVar2.f6166d1) {
                    return;
                }
                ConstraintWidget constraintWidget2 = eVar2.f6165c1[i18];
                if (this.f6167a == 0) {
                    int q10 = constraintWidget2.q();
                    int i19 = eVar2.f6154R0;
                    if (constraintWidget2.f6038j0 == 8) {
                        i19 = 0;
                    }
                    this.f6177l = q10 + i19 + this.f6177l;
                    int V = eVar2.V(constraintWidget2, this.f6182q);
                    if (this.f6168b == null || this.f6169c < V) {
                        this.f6168b = constraintWidget2;
                        this.f6169c = V;
                        this.f6178m = V;
                    }
                } else {
                    int W = eVar2.W(constraintWidget2, this.f6182q);
                    int V10 = eVar2.V(constraintWidget2, this.f6182q);
                    int i20 = eVar2.f6155S0;
                    if (constraintWidget2.f6038j0 == 8) {
                        i20 = 0;
                    }
                    this.f6178m = V10 + i20 + this.f6178m;
                    if (this.f6168b == null || this.f6169c < W) {
                        this.f6168b = constraintWidget2;
                        this.f6169c = W;
                        this.f6177l = W;
                    }
                }
            }
        }

        public final void f(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i9, int i10, int i11, int i12, int i13) {
            this.f6167a = i;
            this.f6170d = constraintAnchor;
            this.f6171e = constraintAnchor2;
            this.f6172f = constraintAnchor3;
            this.f6173g = constraintAnchor4;
            this.f6174h = i9;
            this.i = i10;
            this.f6175j = i11;
            this.f6176k = i12;
            this.f6182q = i13;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0769  */
    @Override // androidx.constraintlayout.core.widgets.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(int r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1951
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.e.T(int, int, int, int):void");
    }

    public final int V(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        if (dimensionBehaviourArr[1] == ConstraintWidget.DimensionBehaviour.f6065c) {
            int i9 = constraintWidget.f6056t;
            if (i9 == 0) {
                return 0;
            }
            if (i9 == 2) {
                int i10 = (int) (constraintWidget.f6002A * i);
                if (i10 != constraintWidget.k()) {
                    constraintWidget.f6032g = true;
                    U(constraintWidget, dimensionBehaviourArr[0], constraintWidget.q(), ConstraintWidget.DimensionBehaviour.f6063a, i10);
                }
                return i10;
            }
            if (i9 == 1) {
                return constraintWidget.k();
            }
            if (i9 == 3) {
                return (int) ((constraintWidget.q() * constraintWidget.f6019Z) + 0.5f);
            }
        }
        return constraintWidget.k();
    }

    public final int W(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        if (dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.f6065c) {
            int i9 = constraintWidget.f6055s;
            if (i9 == 0) {
                return 0;
            }
            if (i9 == 2) {
                int i10 = (int) (constraintWidget.f6060x * i);
                if (i10 != constraintWidget.q()) {
                    constraintWidget.f6032g = true;
                    U(constraintWidget, ConstraintWidget.DimensionBehaviour.f6063a, i10, dimensionBehaviourArr[1], constraintWidget.k());
                }
                return i10;
            }
            if (i9 == 1) {
                return constraintWidget.q();
            }
            if (i9 == 3) {
                return (int) ((constraintWidget.k() * constraintWidget.f6019Z) + 0.5f);
            }
        }
        return constraintWidget.q();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void b(androidx.constraintlayout.core.c cVar, boolean z10) {
        ConstraintWidget constraintWidget;
        float f10;
        int i;
        super.b(cVar, z10);
        ConstraintWidget constraintWidget2 = this.W;
        boolean z11 = constraintWidget2 != null && ((d) constraintWidget2).f6140x0;
        int i9 = this.f6158V0;
        ArrayList<a> arrayList = this.f6161Y0;
        if (i9 != 0) {
            if (i9 == 1) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    arrayList.get(i10).b(i10, z11, i10 == size + (-1));
                    i10++;
                }
            } else if (i9 != 2) {
                if (i9 == 3) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        arrayList.get(i11).b(i11, z11, i11 == size2 + (-1));
                        i11++;
                    }
                }
            } else if (this.f6164b1 != null && this.f6163a1 != null && this.f6162Z0 != null) {
                for (int i12 = 0; i12 < this.f6166d1; i12++) {
                    this.f6165c1[i12].D();
                }
                int[] iArr = this.f6164b1;
                int i13 = iArr[0];
                int i14 = iArr[1];
                float f11 = this.f6149L0;
                ConstraintWidget constraintWidget3 = null;
                int i15 = 0;
                while (i15 < i13) {
                    if (z11) {
                        i = (i13 - i15) - 1;
                        f10 = 1.0f - this.f6149L0;
                    } else {
                        f10 = f11;
                        i = i15;
                    }
                    ConstraintWidget constraintWidget4 = this.f6163a1[i];
                    if (constraintWidget4 != null && constraintWidget4.f6038j0 != 8) {
                        ConstraintAnchor constraintAnchor = constraintWidget4.f6012K;
                        if (i15 == 0) {
                            constraintWidget4.f(constraintAnchor, this.f6012K, this.f6199y0);
                            constraintWidget4.f6042l0 = this.f6143F0;
                            constraintWidget4.f6033g0 = f10;
                        }
                        if (i15 == i13 - 1) {
                            constraintWidget4.f(constraintWidget4.f6014M, this.f6014M, this.f6200z0);
                        }
                        if (i15 > 0 && constraintWidget3 != null) {
                            int i16 = this.f6154R0;
                            ConstraintAnchor constraintAnchor2 = constraintWidget3.f6014M;
                            constraintWidget4.f(constraintAnchor, constraintAnchor2, i16);
                            constraintWidget3.f(constraintAnchor2, constraintAnchor, 0);
                        }
                        constraintWidget3 = constraintWidget4;
                    }
                    i15++;
                    f11 = f10;
                }
                for (int i17 = 0; i17 < i14; i17++) {
                    ConstraintWidget constraintWidget5 = this.f6162Z0[i17];
                    if (constraintWidget5 != null && constraintWidget5.f6038j0 != 8) {
                        ConstraintAnchor constraintAnchor3 = constraintWidget5.f6013L;
                        if (i17 == 0) {
                            constraintWidget5.f(constraintAnchor3, this.f6013L, this.f6195u0);
                            constraintWidget5.f6044m0 = this.f6144G0;
                            constraintWidget5.f6035h0 = this.f6150M0;
                        }
                        if (i17 == i14 - 1) {
                            constraintWidget5.f(constraintWidget5.f6015N, this.f6015N, this.f6196v0);
                        }
                        if (i17 > 0 && constraintWidget3 != null) {
                            int i18 = this.f6155S0;
                            ConstraintAnchor constraintAnchor4 = constraintWidget3.f6015N;
                            constraintWidget5.f(constraintAnchor3, constraintAnchor4, i18);
                            constraintWidget3.f(constraintAnchor4, constraintAnchor3, 0);
                        }
                        constraintWidget3 = constraintWidget5;
                    }
                }
                for (int i19 = 0; i19 < i13; i19++) {
                    for (int i20 = 0; i20 < i14; i20++) {
                        int i21 = (i20 * i13) + i19;
                        if (this.f6160X0 == 1) {
                            i21 = (i19 * i14) + i20;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.f6165c1;
                        if (i21 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i21]) != null && constraintWidget.f6038j0 != 8) {
                            ConstraintWidget constraintWidget6 = this.f6163a1[i19];
                            ConstraintWidget constraintWidget7 = this.f6162Z0[i20];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.f(constraintWidget.f6012K, constraintWidget6.f6012K, 0);
                                constraintWidget.f(constraintWidget.f6014M, constraintWidget6.f6014M, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.f(constraintWidget.f6013L, constraintWidget7.f6013L, 0);
                                constraintWidget.f(constraintWidget.f6015N, constraintWidget7.f6015N, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).b(0, z11, true);
        }
        this.f6190A0 = false;
    }
}
