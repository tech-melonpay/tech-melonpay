package androidx.constraintlayout.core;

import Fa.h;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.c;
import java.util.ArrayList;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements c.a {

    /* renamed from: d, reason: collision with root package name */
    public final a f5963d;

    /* renamed from: a, reason: collision with root package name */
    public SolverVariable f5960a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f5961b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<SolverVariable> f5962c = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public boolean f5964e = false;

    /* compiled from: ArrayRow.java */
    public interface a {
        boolean a(SolverVariable solverVariable);

        float b(b bVar, boolean z10);

        void c(SolverVariable solverVariable, float f10);

        void clear();

        SolverVariable d(int i);

        void e(SolverVariable solverVariable, float f10, boolean z10);

        float f(int i);

        float g(SolverVariable solverVariable, boolean z10);

        int getCurrentSize();

        float h(SolverVariable solverVariable);

        void i(float f10);

        void invert();
    }

    public b() {
    }

    @Override // androidx.constraintlayout.core.c.a
    public SolverVariable a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(c cVar, int i) {
        this.f5963d.c(cVar.j(i), 1.0f);
        this.f5963d.c(cVar.j(i), -1.0f);
    }

    public final void c(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z10;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z10 = true;
            } else {
                z10 = false;
            }
            this.f5961b = i;
            if (z10) {
                this.f5963d.c(solverVariable, 1.0f);
                this.f5963d.c(solverVariable2, -1.0f);
                this.f5963d.c(solverVariable3, -1.0f);
                return;
            }
        }
        this.f5963d.c(solverVariable, -1.0f);
        this.f5963d.c(solverVariable2, 1.0f);
        this.f5963d.c(solverVariable3, 1.0f);
    }

    public final void d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z10;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z10 = true;
            } else {
                z10 = false;
            }
            this.f5961b = i;
            if (z10) {
                this.f5963d.c(solverVariable, 1.0f);
                this.f5963d.c(solverVariable2, -1.0f);
                this.f5963d.c(solverVariable3, 1.0f);
                return;
            }
        }
        this.f5963d.c(solverVariable, -1.0f);
        this.f5963d.c(solverVariable2, 1.0f);
        this.f5963d.c(solverVariable3, -1.0f);
    }

    public boolean e() {
        return this.f5960a == null && this.f5961b == 0.0f && this.f5963d.getCurrentSize() == 0;
    }

    public final SolverVariable f(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int currentSize = this.f5963d.getCurrentSize();
        SolverVariable solverVariable2 = null;
        float f10 = 0.0f;
        for (int i = 0; i < currentSize; i++) {
            float f11 = this.f5963d.f(i);
            if (f11 < 0.0f) {
                SolverVariable d10 = this.f5963d.d(i);
                if ((zArr == null || !zArr[d10.f5936b]) && d10 != solverVariable && (((type = d10.i) == SolverVariable.Type.f5947b || type == SolverVariable.Type.f5948c) && f11 < f10)) {
                    f10 = f11;
                    solverVariable2 = d10;
                }
            }
        }
        return solverVariable2;
    }

    public final void g(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f5960a;
        if (solverVariable2 != null) {
            this.f5963d.c(solverVariable2, -1.0f);
            this.f5960a.f5937c = -1;
            this.f5960a = null;
        }
        float g10 = this.f5963d.g(solverVariable, true) * (-1.0f);
        this.f5960a = solverVariable;
        if (g10 == 1.0f) {
            return;
        }
        this.f5961b /= g10;
        this.f5963d.i(g10);
    }

    public final void h(c cVar, SolverVariable solverVariable, boolean z10) {
        if (solverVariable == null || !solverVariable.f5940f) {
            return;
        }
        float h9 = this.f5963d.h(solverVariable);
        this.f5961b = (solverVariable.f5939e * h9) + this.f5961b;
        this.f5963d.g(solverVariable, z10);
        if (z10) {
            solverVariable.c(this);
        }
        if (this.f5963d.getCurrentSize() == 0) {
            this.f5964e = true;
            cVar.f5967b = true;
        }
    }

    public void i(c cVar, b bVar, boolean z10) {
        float b9 = this.f5963d.b(bVar, z10);
        this.f5961b = (bVar.f5961b * b9) + this.f5961b;
        if (z10) {
            bVar.f5960a.c(this);
        }
        if (this.f5960a == null || this.f5963d.getCurrentSize() != 0) {
            return;
        }
        this.f5964e = true;
        cVar.f5967b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r10.f5960a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            androidx.constraintlayout.core.SolverVariable r1 = r10.f5960a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = C.v.n(r0, r1)
            float r1 = r10.f5961b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = C.v.s(r0)
            float r1 = r10.f5961b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            androidx.constraintlayout.core.b$a r5 = r10.f5963d
            int r5 = r5.getCurrentSize()
        L3c:
            if (r4 >= r5) goto L9c
            androidx.constraintlayout.core.b$a r6 = r10.f5963d
            androidx.constraintlayout.core.SolverVariable r6 = r6.d(r4)
            if (r6 != 0) goto L47
            goto L99
        L47:
            androidx.constraintlayout.core.b$a r7 = r10.f5963d
            float r7 = r7.f(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = C.v.n(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = C.v.n(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = C.v.n(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = C.v.n(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r3
        L99:
            int r4 = r4 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = C.v.n(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.b.toString():java.lang.String");
    }

    public b(h hVar) {
        this.f5963d = new androidx.constraintlayout.core.a(this, hVar);
    }
}
