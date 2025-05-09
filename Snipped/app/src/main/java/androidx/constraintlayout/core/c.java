package androidx.constraintlayout.core;

import Fa.h;
import a0.C0506b;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.d.b;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import java.util.Arrays;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f5965q = false;

    /* renamed from: d, reason: collision with root package name */
    public final d f5969d;

    /* renamed from: m, reason: collision with root package name */
    public final h f5977m;

    /* renamed from: p, reason: collision with root package name */
    public b f5980p;

    /* renamed from: a, reason: collision with root package name */
    public int f5966a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5967b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f5968c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f5970e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f5971f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5973h = false;
    public boolean[] i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    public int f5974j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f5975k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f5976l = 32;

    /* renamed from: n, reason: collision with root package name */
    public SolverVariable[] f5978n = new SolverVariable[1000];

    /* renamed from: o, reason: collision with root package name */
    public int f5979o = 0;

    /* renamed from: g, reason: collision with root package name */
    public b[] f5972g = new b[32];

    /* compiled from: LinearSystem.java */
    public interface a {
        SolverVariable a(boolean[] zArr);
    }

    public c() {
        s();
        h hVar = new h(6);
        hVar.f1299b = new C0506b();
        hVar.f1300c = new C0506b();
        hVar.f1301d = new SolverVariable[32];
        this.f5977m = hVar;
        d dVar = new d(hVar);
        dVar.f5981f = new SolverVariable[128];
        dVar.f5982g = new SolverVariable[128];
        dVar.f5983h = 0;
        dVar.i = dVar.new b();
        this.f5969d = dVar;
        this.f5980p = new b(hVar);
    }

    public static int n(ConstraintAnchor constraintAnchor) {
        SolverVariable solverVariable = constraintAnchor.i;
        if (solverVariable != null) {
            return (int) (solverVariable.f5939e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final SolverVariable a(SolverVariable.Type type) {
        C0506b c0506b = (C0506b) this.f5977m.f1300c;
        int i = c0506b.f4246b;
        SolverVariable solverVariable = null;
        if (i > 0) {
            int i9 = i - 1;
            ?? r32 = c0506b.f4245a;
            ?? r42 = r32[i9];
            r32[i9] = 0;
            c0506b.f4246b = i9;
            solverVariable = r42;
        }
        SolverVariable solverVariable2 = solverVariable;
        if (solverVariable2 == null) {
            solverVariable2 = new SolverVariable(type);
            solverVariable2.i = type;
        } else {
            solverVariable2.d();
            solverVariable2.i = type;
        }
        int i10 = this.f5979o;
        int i11 = this.f5966a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f5966a = i12;
            this.f5978n = (SolverVariable[]) Arrays.copyOf(this.f5978n, i12);
        }
        SolverVariable[] solverVariableArr = this.f5978n;
        int i13 = this.f5979o;
        this.f5979o = i13 + 1;
        solverVariableArr[i13] = solverVariable2;
        return solverVariable2;
    }

    public final void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f10, SolverVariable solverVariable3, SolverVariable solverVariable4, int i9, int i10) {
        b l10 = l();
        if (solverVariable2 == solverVariable3) {
            l10.f5963d.c(solverVariable, 1.0f);
            l10.f5963d.c(solverVariable4, 1.0f);
            l10.f5963d.c(solverVariable2, -2.0f);
        } else if (f10 == 0.5f) {
            l10.f5963d.c(solverVariable, 1.0f);
            l10.f5963d.c(solverVariable2, -1.0f);
            l10.f5963d.c(solverVariable3, -1.0f);
            l10.f5963d.c(solverVariable4, 1.0f);
            if (i > 0 || i9 > 0) {
                l10.f5961b = (-i) + i9;
            }
        } else if (f10 <= 0.0f) {
            l10.f5963d.c(solverVariable, -1.0f);
            l10.f5963d.c(solverVariable2, 1.0f);
            l10.f5961b = i;
        } else if (f10 >= 1.0f) {
            l10.f5963d.c(solverVariable4, -1.0f);
            l10.f5963d.c(solverVariable3, 1.0f);
            l10.f5961b = -i9;
        } else {
            float f11 = 1.0f - f10;
            l10.f5963d.c(solverVariable, f11 * 1.0f);
            l10.f5963d.c(solverVariable2, f11 * (-1.0f));
            l10.f5963d.c(solverVariable3, (-1.0f) * f10);
            l10.f5963d.c(solverVariable4, 1.0f * f10);
            if (i > 0 || i9 > 0) {
                l10.f5961b = (i9 * f10) + ((-i) * f11);
            }
        }
        if (i10 != 8) {
            l10.b(this, i10);
        }
        c(l10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ba, code lost:
    
        if (r4.f5945l <= 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bd, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c7, code lost:
    
        if (r4.f5945l <= 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00dc, code lost:
    
        if (r4.f5945l <= 1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00df, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e9, code lost:
    
        if (r4.f5945l <= 1) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01aa A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.constraintlayout.core.b r17) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.c.c(androidx.constraintlayout.core.b):void");
    }

    public final void d(SolverVariable solverVariable, int i) {
        int i9 = solverVariable.f5937c;
        if (i9 == -1) {
            solverVariable.e(this, i);
            for (int i10 = 0; i10 < this.f5968c + 1; i10++) {
                SolverVariable solverVariable2 = ((SolverVariable[]) this.f5977m.f1301d)[i10];
            }
            return;
        }
        if (i9 == -1) {
            b l10 = l();
            l10.f5960a = solverVariable;
            float f10 = i;
            solverVariable.f5939e = f10;
            l10.f5961b = f10;
            l10.f5964e = true;
            c(l10);
            return;
        }
        b bVar = this.f5972g[i9];
        if (bVar.f5964e) {
            bVar.f5961b = i;
            return;
        }
        if (bVar.f5963d.getCurrentSize() == 0) {
            bVar.f5964e = true;
            bVar.f5961b = i;
            return;
        }
        b l11 = l();
        if (i < 0) {
            l11.f5961b = i * (-1);
            l11.f5963d.c(solverVariable, 1.0f);
        } else {
            l11.f5961b = i;
            l11.f5963d.c(solverVariable, -1.0f);
        }
        c(l11);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(androidx.constraintlayout.core.SolverVariable r6, androidx.constraintlayout.core.SolverVariable r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L15
            boolean r1 = r7.f5940f
            if (r1 == 0) goto L15
            int r1 = r6.f5937c
            r2 = -1
            if (r1 != r2) goto L15
            float r7 = r7.f5939e
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.e(r5, r7)
            return
        L15:
            androidx.constraintlayout.core.b r1 = r5.l()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L37
            if (r8 >= 0) goto L25
            int r8 = r8 * (-1)
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            float r8 = (float) r8
            r1.f5961b = r8
            if (r4 != 0) goto L2c
            goto L37
        L2c:
            androidx.constraintlayout.core.b$a r8 = r1.f5963d
            r8.c(r6, r2)
            androidx.constraintlayout.core.b$a r6 = r1.f5963d
            r6.c(r7, r3)
            goto L41
        L37:
            androidx.constraintlayout.core.b$a r8 = r1.f5963d
            r8.c(r6, r3)
            androidx.constraintlayout.core.b$a r6 = r1.f5963d
            r6.c(r7, r2)
        L41:
            if (r9 == r0) goto L46
            r1.b(r5, r9)
        L46:
            r5.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.c.e(androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, int, int):void");
    }

    public final void f(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i9) {
        b l10 = l();
        SolverVariable m2 = m();
        m2.f5938d = 0;
        l10.c(solverVariable, solverVariable2, m2, i);
        if (i9 != 8) {
            l10.f5963d.c(j(i9), (int) (l10.f5963d.h(m2) * (-1.0f)));
        }
        c(l10);
    }

    public final void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i9) {
        b l10 = l();
        SolverVariable m2 = m();
        m2.f5938d = 0;
        l10.d(solverVariable, solverVariable2, m2, i);
        if (i9 != 8) {
            l10.f5963d.c(j(i9), (int) (l10.f5963d.h(m2) * (-1.0f)));
        }
        c(l10);
    }

    public final void h(b bVar) {
        int i;
        if (bVar.f5964e) {
            bVar.f5960a.e(this, bVar.f5961b);
        } else {
            b[] bVarArr = this.f5972g;
            int i9 = this.f5975k;
            bVarArr[i9] = bVar;
            SolverVariable solverVariable = bVar.f5960a;
            solverVariable.f5937c = i9;
            this.f5975k = i9 + 1;
            solverVariable.f(this, bVar);
        }
        if (this.f5967b) {
            int i10 = 0;
            while (i10 < this.f5975k) {
                if (this.f5972g[i10] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f5972g[i10];
                if (bVar2 != null && bVar2.f5964e) {
                    bVar2.f5960a.e(this, bVar2.f5961b);
                    ((C0506b) this.f5977m.f1299b).a(bVar2);
                    this.f5972g[i10] = null;
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (true) {
                        i = this.f5975k;
                        if (i11 >= i) {
                            break;
                        }
                        b[] bVarArr2 = this.f5972g;
                        int i13 = i11 - 1;
                        b bVar3 = bVarArr2[i11];
                        bVarArr2[i13] = bVar3;
                        SolverVariable solverVariable2 = bVar3.f5960a;
                        if (solverVariable2.f5937c == i11) {
                            solverVariable2.f5937c = i13;
                        }
                        i12 = i11;
                        i11++;
                    }
                    if (i12 < i) {
                        this.f5972g[i12] = null;
                    }
                    this.f5975k = i - 1;
                    i10--;
                }
                i10++;
            }
            this.f5967b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f5975k; i++) {
            b bVar = this.f5972g[i];
            bVar.f5960a.f5939e = bVar.f5961b;
        }
    }

    public final SolverVariable j(int i) {
        if (this.f5974j + 1 >= this.f5971f) {
            o();
        }
        SolverVariable a10 = a(SolverVariable.Type.f5948c);
        int i9 = this.f5968c + 1;
        this.f5968c = i9;
        this.f5974j++;
        a10.f5936b = i9;
        a10.f5938d = i;
        ((SolverVariable[]) this.f5977m.f1301d)[i9] = a10;
        d dVar = this.f5969d;
        dVar.i.f5984a = a10;
        float[] fArr = a10.f5942h;
        Arrays.fill(fArr, 0.0f);
        fArr[a10.f5938d] = 1.0f;
        dVar.j(a10);
        return a10;
    }

    public final SolverVariable k(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f5974j + 1 >= this.f5971f) {
            o();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.i;
            if (solverVariable == null) {
                constraintAnchor.k();
                solverVariable = constraintAnchor.i;
            }
            int i = solverVariable.f5936b;
            h hVar = this.f5977m;
            if (i == -1 || i > this.f5968c || ((SolverVariable[]) hVar.f1301d)[i] == null) {
                if (i != -1) {
                    solverVariable.d();
                }
                int i9 = this.f5968c + 1;
                this.f5968c = i9;
                this.f5974j++;
                solverVariable.f5936b = i9;
                solverVariable.i = SolverVariable.Type.f5946a;
                ((SolverVariable[]) hVar.f1301d)[i9] = solverVariable;
            }
        }
        return solverVariable;
    }

    public final b l() {
        Object obj;
        h hVar = this.f5977m;
        C0506b c0506b = (C0506b) hVar.f1299b;
        int i = c0506b.f4246b;
        if (i > 0) {
            int i9 = i - 1;
            Object[] objArr = c0506b.f4245a;
            obj = objArr[i9];
            objArr[i9] = null;
            c0506b.f4246b = i9;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(hVar);
        }
        bVar.f5960a = null;
        bVar.f5963d.clear();
        bVar.f5961b = 0.0f;
        bVar.f5964e = false;
        return bVar;
    }

    public final SolverVariable m() {
        if (this.f5974j + 1 >= this.f5971f) {
            o();
        }
        SolverVariable a10 = a(SolverVariable.Type.f5947b);
        int i = this.f5968c + 1;
        this.f5968c = i;
        this.f5974j++;
        a10.f5936b = i;
        ((SolverVariable[]) this.f5977m.f1301d)[i] = a10;
        return a10;
    }

    public final void o() {
        int i = this.f5970e * 2;
        this.f5970e = i;
        this.f5972g = (b[]) Arrays.copyOf(this.f5972g, i);
        h hVar = this.f5977m;
        hVar.f1301d = (SolverVariable[]) Arrays.copyOf((SolverVariable[]) hVar.f1301d, this.f5970e);
        int i9 = this.f5970e;
        this.i = new boolean[i9];
        this.f5971f = i9;
        this.f5976l = i9;
    }

    public final void p() {
        d dVar = this.f5969d;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f5973h) {
            q(dVar);
            return;
        }
        for (int i = 0; i < this.f5975k; i++) {
            if (!this.f5972g[i].f5964e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        int i = 0;
        while (true) {
            if (i >= this.f5975k) {
                break;
            }
            b bVar = this.f5972g[i];
            SolverVariable.Type type = bVar.f5960a.i;
            SolverVariable.Type type2 = SolverVariable.Type.f5946a;
            if (type != type2) {
                float f10 = 0.0f;
                if (bVar.f5961b < 0.0f) {
                    boolean z10 = false;
                    int i9 = 0;
                    while (!z10) {
                        i9++;
                        float f11 = Float.MAX_VALUE;
                        int i10 = 0;
                        int i11 = -1;
                        int i12 = -1;
                        int i13 = 0;
                        while (i10 < this.f5975k) {
                            b bVar2 = this.f5972g[i10];
                            if (bVar2.f5960a.i != type2 && !bVar2.f5964e && bVar2.f5961b < f10) {
                                int currentSize = bVar2.f5963d.getCurrentSize();
                                int i14 = 0;
                                while (i14 < currentSize) {
                                    SolverVariable d10 = bVar2.f5963d.d(i14);
                                    float h9 = bVar2.f5963d.h(d10);
                                    if (h9 > f10) {
                                        for (int i15 = 0; i15 < 9; i15++) {
                                            float f12 = d10.f5941g[i15] / h9;
                                            if ((f12 < f11 && i15 == i13) || i15 > i13) {
                                                i13 = i15;
                                                i12 = d10.f5936b;
                                                i11 = i10;
                                                f11 = f12;
                                            }
                                        }
                                    }
                                    i14++;
                                    f10 = 0.0f;
                                }
                            }
                            i10++;
                            f10 = 0.0f;
                        }
                        if (i11 != -1) {
                            b bVar3 = this.f5972g[i11];
                            bVar3.f5960a.f5937c = -1;
                            bVar3.g(((SolverVariable[]) this.f5977m.f1301d)[i12]);
                            SolverVariable solverVariable = bVar3.f5960a;
                            solverVariable.f5937c = i11;
                            solverVariable.f(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i9 > this.f5974j / 2) {
                            z10 = true;
                        }
                        f10 = 0.0f;
                    }
                }
            }
            i++;
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        for (int i = 0; i < this.f5974j; i++) {
            this.i[i] = false;
        }
        boolean z10 = false;
        int i9 = 0;
        while (!z10) {
            i9++;
            if (i9 >= this.f5974j * 2) {
                return;
            }
            SolverVariable solverVariable = bVar.f5960a;
            if (solverVariable != null) {
                this.i[solverVariable.f5936b] = true;
            }
            SolverVariable a10 = bVar.a(this.i);
            if (a10 != null) {
                boolean[] zArr = this.i;
                int i10 = a10.f5936b;
                if (zArr[i10]) {
                    return;
                } else {
                    zArr[i10] = true;
                }
            }
            if (a10 != null) {
                float f10 = Float.MAX_VALUE;
                int i11 = -1;
                for (int i12 = 0; i12 < this.f5975k; i12++) {
                    b bVar2 = this.f5972g[i12];
                    if (bVar2.f5960a.i != SolverVariable.Type.f5946a && !bVar2.f5964e && bVar2.f5963d.a(a10)) {
                        float h9 = bVar2.f5963d.h(a10);
                        if (h9 < 0.0f) {
                            float f11 = (-bVar2.f5961b) / h9;
                            if (f11 < f10) {
                                i11 = i12;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i11 > -1) {
                    b bVar3 = this.f5972g[i11];
                    bVar3.f5960a.f5937c = -1;
                    bVar3.g(a10);
                    SolverVariable solverVariable2 = bVar3.f5960a;
                    solverVariable2.f5937c = i11;
                    solverVariable2.f(this, bVar3);
                }
            } else {
                z10 = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.f5975k; i++) {
            b bVar = this.f5972g[i];
            if (bVar != null) {
                ((C0506b) this.f5977m.f1299b).a(bVar);
            }
            this.f5972g[i] = null;
        }
    }

    public final void t() {
        h hVar;
        int i = 0;
        while (true) {
            hVar = this.f5977m;
            SolverVariable[] solverVariableArr = (SolverVariable[]) hVar.f1301d;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.d();
            }
            i++;
        }
        C0506b c0506b = (C0506b) hVar.f1300c;
        SolverVariable[] solverVariableArr2 = this.f5978n;
        int i9 = this.f5979o;
        c0506b.getClass();
        if (i9 > solverVariableArr2.length) {
            i9 = solverVariableArr2.length;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            SolverVariable solverVariable2 = solverVariableArr2[i10];
            int i11 = c0506b.f4246b;
            Object[] objArr = c0506b.f4245a;
            if (i11 < objArr.length) {
                objArr[i11] = solverVariable2;
                c0506b.f4246b = i11 + 1;
            }
        }
        this.f5979o = 0;
        Arrays.fill((SolverVariable[]) hVar.f1301d, (Object) null);
        this.f5968c = 0;
        d dVar = this.f5969d;
        dVar.f5983h = 0;
        dVar.f5961b = 0.0f;
        this.f5974j = 1;
        for (int i12 = 0; i12 < this.f5975k; i12++) {
            b bVar = this.f5972g[i12];
        }
        s();
        this.f5975k = 0;
        this.f5980p = new b(hVar);
    }
}
