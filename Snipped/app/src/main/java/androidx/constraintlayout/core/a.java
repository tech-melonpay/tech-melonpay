package androidx.constraintlayout.core;

import C.v;
import Fa.h;
import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public final class a implements b.a {

    /* renamed from: b, reason: collision with root package name */
    public final b f5952b;

    /* renamed from: c, reason: collision with root package name */
    public final h f5953c;

    /* renamed from: a, reason: collision with root package name */
    public int f5951a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f5954d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f5955e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f5956f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f5957g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f5958h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5959j = false;

    public a(b bVar, h hVar) {
        this.f5952b = bVar;
        this.f5953c = hVar;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final boolean a(SolverVariable solverVariable) {
        int i = this.f5958h;
        if (i == -1) {
            return false;
        }
        for (int i9 = 0; i != -1 && i9 < this.f5951a; i9++) {
            if (this.f5955e[i] == solverVariable.f5936b) {
                return true;
            }
            i = this.f5956f[i];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float b(b bVar, boolean z10) {
        float h9 = h(bVar.f5960a);
        g(bVar.f5960a, z10);
        b.a aVar = bVar.f5963d;
        int currentSize = aVar.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            SolverVariable d10 = aVar.d(i);
            e(d10, aVar.h(d10) * h9, z10);
        }
        return h9;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void c(SolverVariable solverVariable, float f10) {
        if (f10 == 0.0f) {
            g(solverVariable, true);
            return;
        }
        int i = this.f5958h;
        b bVar = this.f5952b;
        if (i == -1) {
            this.f5958h = 0;
            this.f5957g[0] = f10;
            this.f5955e[0] = solverVariable.f5936b;
            this.f5956f[0] = -1;
            solverVariable.f5945l++;
            solverVariable.a(bVar);
            this.f5951a++;
            if (this.f5959j) {
                return;
            }
            int i9 = this.i + 1;
            this.i = i9;
            int[] iArr = this.f5955e;
            if (i9 >= iArr.length) {
                this.f5959j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i != -1 && i11 < this.f5951a; i11++) {
            int i12 = this.f5955e[i];
            int i13 = solverVariable.f5936b;
            if (i12 == i13) {
                this.f5957g[i] = f10;
                return;
            }
            if (i12 < i13) {
                i10 = i;
            }
            i = this.f5956f[i];
        }
        int i14 = this.i;
        int i15 = i14 + 1;
        if (this.f5959j) {
            int[] iArr2 = this.f5955e;
            if (iArr2[i14] != -1) {
                i14 = iArr2.length;
            }
        } else {
            i14 = i15;
        }
        int[] iArr3 = this.f5955e;
        if (i14 >= iArr3.length && this.f5951a < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f5955e;
                if (i16 >= iArr4.length) {
                    break;
                }
                if (iArr4[i16] == -1) {
                    i14 = i16;
                    break;
                }
                i16++;
            }
        }
        int[] iArr5 = this.f5955e;
        if (i14 >= iArr5.length) {
            i14 = iArr5.length;
            int i17 = this.f5954d * 2;
            this.f5954d = i17;
            this.f5959j = false;
            this.i = i14 - 1;
            this.f5957g = Arrays.copyOf(this.f5957g, i17);
            this.f5955e = Arrays.copyOf(this.f5955e, this.f5954d);
            this.f5956f = Arrays.copyOf(this.f5956f, this.f5954d);
        }
        this.f5955e[i14] = solverVariable.f5936b;
        this.f5957g[i14] = f10;
        if (i10 != -1) {
            int[] iArr6 = this.f5956f;
            iArr6[i14] = iArr6[i10];
            iArr6[i10] = i14;
        } else {
            this.f5956f[i14] = this.f5958h;
            this.f5958h = i14;
        }
        solverVariable.f5945l++;
        solverVariable.a(bVar);
        int i18 = this.f5951a + 1;
        this.f5951a = i18;
        if (!this.f5959j) {
            this.i++;
        }
        int[] iArr7 = this.f5955e;
        if (i18 >= iArr7.length) {
            this.f5959j = true;
        }
        if (this.i >= iArr7.length) {
            this.f5959j = true;
            this.i = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void clear() {
        int i = this.f5958h;
        for (int i9 = 0; i != -1 && i9 < this.f5951a; i9++) {
            SolverVariable solverVariable = ((SolverVariable[]) this.f5953c.f1301d)[this.f5955e[i]];
            if (solverVariable != null) {
                solverVariable.c(this.f5952b);
            }
            i = this.f5956f[i];
        }
        this.f5958h = -1;
        this.i = -1;
        this.f5959j = false;
        this.f5951a = 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final SolverVariable d(int i) {
        int i9 = this.f5958h;
        for (int i10 = 0; i9 != -1 && i10 < this.f5951a; i10++) {
            if (i10 == i) {
                return ((SolverVariable[]) this.f5953c.f1301d)[this.f5955e[i9]];
            }
            i9 = this.f5956f[i9];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void e(SolverVariable solverVariable, float f10, boolean z10) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i = this.f5958h;
            b bVar = this.f5952b;
            if (i == -1) {
                this.f5958h = 0;
                this.f5957g[0] = f10;
                this.f5955e[0] = solverVariable.f5936b;
                this.f5956f[0] = -1;
                solverVariable.f5945l++;
                solverVariable.a(bVar);
                this.f5951a++;
                if (this.f5959j) {
                    return;
                }
                int i9 = this.i + 1;
                this.i = i9;
                int[] iArr = this.f5955e;
                if (i9 >= iArr.length) {
                    this.f5959j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i != -1 && i11 < this.f5951a; i11++) {
                int i12 = this.f5955e[i];
                int i13 = solverVariable.f5936b;
                if (i12 == i13) {
                    float[] fArr = this.f5957g;
                    float f11 = fArr[i] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i] = f11;
                    if (f11 == 0.0f) {
                        if (i == this.f5958h) {
                            this.f5958h = this.f5956f[i];
                        } else {
                            int[] iArr2 = this.f5956f;
                            iArr2[i10] = iArr2[i];
                        }
                        if (z10) {
                            solverVariable.c(bVar);
                        }
                        if (this.f5959j) {
                            this.i = i;
                        }
                        solverVariable.f5945l--;
                        this.f5951a--;
                        return;
                    }
                    return;
                }
                if (i12 < i13) {
                    i10 = i;
                }
                i = this.f5956f[i];
            }
            int i14 = this.i;
            int i15 = i14 + 1;
            if (this.f5959j) {
                int[] iArr3 = this.f5955e;
                if (iArr3[i14] != -1) {
                    i14 = iArr3.length;
                }
            } else {
                i14 = i15;
            }
            int[] iArr4 = this.f5955e;
            if (i14 >= iArr4.length && this.f5951a < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.f5955e;
                    if (i16 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i16] == -1) {
                        i14 = i16;
                        break;
                    }
                    i16++;
                }
            }
            int[] iArr6 = this.f5955e;
            if (i14 >= iArr6.length) {
                i14 = iArr6.length;
                int i17 = this.f5954d * 2;
                this.f5954d = i17;
                this.f5959j = false;
                this.i = i14 - 1;
                this.f5957g = Arrays.copyOf(this.f5957g, i17);
                this.f5955e = Arrays.copyOf(this.f5955e, this.f5954d);
                this.f5956f = Arrays.copyOf(this.f5956f, this.f5954d);
            }
            this.f5955e[i14] = solverVariable.f5936b;
            this.f5957g[i14] = f10;
            if (i10 != -1) {
                int[] iArr7 = this.f5956f;
                iArr7[i14] = iArr7[i10];
                iArr7[i10] = i14;
            } else {
                this.f5956f[i14] = this.f5958h;
                this.f5958h = i14;
            }
            solverVariable.f5945l++;
            solverVariable.a(bVar);
            this.f5951a++;
            if (!this.f5959j) {
                this.i++;
            }
            int i18 = this.i;
            int[] iArr8 = this.f5955e;
            if (i18 >= iArr8.length) {
                this.f5959j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float f(int i) {
        int i9 = this.f5958h;
        for (int i10 = 0; i9 != -1 && i10 < this.f5951a; i10++) {
            if (i10 == i) {
                return this.f5957g[i9];
            }
            i9 = this.f5956f[i9];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float g(SolverVariable solverVariable, boolean z10) {
        int i = this.f5958h;
        if (i == -1) {
            return 0.0f;
        }
        int i9 = 0;
        int i10 = -1;
        while (i != -1 && i9 < this.f5951a) {
            if (this.f5955e[i] == solverVariable.f5936b) {
                if (i == this.f5958h) {
                    this.f5958h = this.f5956f[i];
                } else {
                    int[] iArr = this.f5956f;
                    iArr[i10] = iArr[i];
                }
                if (z10) {
                    solverVariable.c(this.f5952b);
                }
                solverVariable.f5945l--;
                this.f5951a--;
                this.f5955e[i] = -1;
                if (this.f5959j) {
                    this.i = i;
                }
                return this.f5957g[i];
            }
            i9++;
            i10 = i;
            i = this.f5956f[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final int getCurrentSize() {
        return this.f5951a;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float h(SolverVariable solverVariable) {
        int i = this.f5958h;
        for (int i9 = 0; i != -1 && i9 < this.f5951a; i9++) {
            if (this.f5955e[i] == solverVariable.f5936b) {
                return this.f5957g[i];
            }
            i = this.f5956f[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void i(float f10) {
        int i = this.f5958h;
        for (int i9 = 0; i != -1 && i9 < this.f5951a; i9++) {
            float[] fArr = this.f5957g;
            fArr[i] = fArr[i] / f10;
            i = this.f5956f[i];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void invert() {
        int i = this.f5958h;
        for (int i9 = 0; i != -1 && i9 < this.f5951a; i9++) {
            float[] fArr = this.f5957g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f5956f[i];
        }
    }

    public final String toString() {
        int i = this.f5958h;
        String str = "";
        for (int i9 = 0; i != -1 && i9 < this.f5951a; i9++) {
            StringBuilder s10 = v.s(v.n(str, " -> "));
            s10.append(this.f5957g[i]);
            s10.append(" : ");
            StringBuilder s11 = v.s(s10.toString());
            s11.append(((SolverVariable[]) this.f5953c.f1301d)[this.f5955e[i]]);
            str = s11.toString();
            i = this.f5956f[i];
        }
        return str;
    }
}
