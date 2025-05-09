package androidx.constraintlayout.core;

import C.v;
import androidx.constraintlayout.core.b;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public final class d extends androidx.constraintlayout.core.b {

    /* renamed from: f, reason: collision with root package name */
    public SolverVariable[] f5981f;

    /* renamed from: g, reason: collision with root package name */
    public SolverVariable[] f5982g;

    /* renamed from: h, reason: collision with root package name */
    public int f5983h;
    public b i;

    /* compiled from: PriorityGoalRow.java */
    public class a implements Comparator<SolverVariable> {
        @Override // java.util.Comparator
        public final int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f5936b - solverVariable2.f5936b;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public SolverVariable f5984a;

        public b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.f5984a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder s10 = v.s(str);
                    s10.append(this.f5984a.f5942h[i]);
                    s10.append(" ");
                    str = s10.toString();
                }
            }
            StringBuilder r8 = androidx.camera.core.impl.utils.a.r(str, "] ");
            r8.append(this.f5984a);
            return r8.toString();
        }
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.c.a
    public final SolverVariable a(boolean[] zArr) {
        int i = -1;
        for (int i9 = 0; i9 < this.f5983h; i9++) {
            SolverVariable[] solverVariableArr = this.f5981f;
            SolverVariable solverVariable = solverVariableArr[i9];
            if (!zArr[solverVariable.f5936b]) {
                b bVar = this.i;
                bVar.f5984a = solverVariable;
                int i10 = 8;
                if (i == -1) {
                    while (i10 >= 0) {
                        float f10 = bVar.f5984a.f5942h[i10];
                        if (f10 <= 0.0f) {
                            if (f10 < 0.0f) {
                                i = i9;
                                break;
                            }
                            i10--;
                        }
                    }
                } else {
                    SolverVariable solverVariable2 = solverVariableArr[i];
                    while (true) {
                        if (i10 >= 0) {
                            float f11 = solverVariable2.f5942h[i10];
                            float f12 = bVar.f5984a.f5942h[i10];
                            if (f12 == f11) {
                                i10--;
                            } else if (f12 >= f11) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f5981f[i];
    }

    @Override // androidx.constraintlayout.core.b
    public final boolean e() {
        return this.f5983h == 0;
    }

    @Override // androidx.constraintlayout.core.b
    public final void i(c cVar, androidx.constraintlayout.core.b bVar, boolean z10) {
        SolverVariable solverVariable = bVar.f5960a;
        if (solverVariable == null) {
            return;
        }
        b.a aVar = bVar.f5963d;
        int currentSize = aVar.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            SolverVariable d10 = aVar.d(i);
            float f10 = aVar.f(i);
            b bVar2 = this.i;
            bVar2.f5984a = d10;
            boolean z11 = d10.f5935a;
            float[] fArr = solverVariable.f5942h;
            if (z11) {
                boolean z12 = true;
                for (int i9 = 0; i9 < 9; i9++) {
                    float[] fArr2 = bVar2.f5984a.f5942h;
                    float f11 = (fArr[i9] * f10) + fArr2[i9];
                    fArr2[i9] = f11;
                    if (Math.abs(f11) < 1.0E-4f) {
                        bVar2.f5984a.f5942h[i9] = 0.0f;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    d.this.k(bVar2.f5984a);
                }
            } else {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f12 = fArr[i10];
                    if (f12 != 0.0f) {
                        float f13 = f12 * f10;
                        if (Math.abs(f13) < 1.0E-4f) {
                            f13 = 0.0f;
                        }
                        bVar2.f5984a.f5942h[i10] = f13;
                    } else {
                        bVar2.f5984a.f5942h[i10] = 0.0f;
                    }
                }
                j(d10);
            }
            this.f5961b = (bVar.f5961b * f10) + this.f5961b;
        }
        k(solverVariable);
    }

    public final void j(SolverVariable solverVariable) {
        int i;
        int i9 = this.f5983h + 1;
        SolverVariable[] solverVariableArr = this.f5981f;
        if (i9 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f5981f = solverVariableArr2;
            this.f5982g = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f5981f;
        int i10 = this.f5983h;
        solverVariableArr3[i10] = solverVariable;
        int i11 = i10 + 1;
        this.f5983h = i11;
        if (i11 > 1 && solverVariableArr3[i10].f5936b > solverVariable.f5936b) {
            int i12 = 0;
            while (true) {
                i = this.f5983h;
                if (i12 >= i) {
                    break;
                }
                this.f5982g[i12] = this.f5981f[i12];
                i12++;
            }
            Arrays.sort(this.f5982g, 0, i, new a());
            for (int i13 = 0; i13 < this.f5983h; i13++) {
                this.f5981f[i13] = this.f5982g[i13];
            }
        }
        solverVariable.f5935a = true;
        solverVariable.a(this);
    }

    public final void k(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.f5983h) {
            if (this.f5981f[i] == solverVariable) {
                while (true) {
                    int i9 = this.f5983h;
                    if (i >= i9 - 1) {
                        this.f5983h = i9 - 1;
                        solverVariable.f5935a = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f5981f;
                        int i10 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i10];
                        i = i10;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b
    public final String toString() {
        String str = " goal -> (" + this.f5961b + ") : ";
        for (int i = 0; i < this.f5983h; i++) {
            SolverVariable solverVariable = this.f5981f[i];
            b bVar = this.i;
            bVar.f5984a = solverVariable;
            str = str + bVar + " ";
        }
        return str;
    }
}
