package androidx.constraintlayout.core;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class SolverVariable implements Comparable<SolverVariable> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5935a;

    /* renamed from: e, reason: collision with root package name */
    public float f5939e;
    public Type i;

    /* renamed from: b, reason: collision with root package name */
    public int f5936b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f5937c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f5938d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5940f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f5941g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f5942h = new float[9];

    /* renamed from: j, reason: collision with root package name */
    public b[] f5943j = new b[16];

    /* renamed from: k, reason: collision with root package name */
    public int f5944k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f5945l = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* renamed from: a, reason: collision with root package name */
        public static final Type f5946a;

        /* renamed from: b, reason: collision with root package name */
        public static final Type f5947b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f5948c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f5949d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Type[] f5950e;

        static {
            Type type = new Type("UNRESTRICTED", 0);
            f5946a = type;
            Type type2 = new Type("CONSTANT", 1);
            Type type3 = new Type("SLACK", 2);
            f5947b = type3;
            Type type4 = new Type("ERROR", 3);
            f5948c = type4;
            Type type5 = new Type("UNKNOWN", 4);
            f5949d = type5;
            f5950e = new Type[]{type, type2, type3, type4, type5};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f5950e.clone();
        }
    }

    public SolverVariable(Type type) {
        this.i = type;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i9 = this.f5944k;
            if (i >= i9) {
                b[] bVarArr = this.f5943j;
                if (i9 >= bVarArr.length) {
                    this.f5943j = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f5943j;
                int i10 = this.f5944k;
                bVarArr2[i10] = bVar;
                this.f5944k = i10 + 1;
                return;
            }
            if (this.f5943j[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void c(b bVar) {
        int i = this.f5944k;
        int i9 = 0;
        while (i9 < i) {
            if (this.f5943j[i9] == bVar) {
                while (i9 < i - 1) {
                    b[] bVarArr = this.f5943j;
                    int i10 = i9 + 1;
                    bVarArr[i9] = bVarArr[i10];
                    i9 = i10;
                }
                this.f5944k--;
                return;
            }
            i9++;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(SolverVariable solverVariable) {
        return this.f5936b - solverVariable.f5936b;
    }

    public final void d() {
        this.i = Type.f5949d;
        this.f5938d = 0;
        this.f5936b = -1;
        this.f5937c = -1;
        this.f5939e = 0.0f;
        this.f5940f = false;
        int i = this.f5944k;
        for (int i9 = 0; i9 < i; i9++) {
            this.f5943j[i9] = null;
        }
        this.f5944k = 0;
        this.f5945l = 0;
        this.f5935a = false;
        Arrays.fill(this.f5942h, 0.0f);
    }

    public final void e(c cVar, float f10) {
        this.f5939e = f10;
        this.f5940f = true;
        int i = this.f5944k;
        this.f5937c = -1;
        for (int i9 = 0; i9 < i; i9++) {
            this.f5943j[i9].h(cVar, this, false);
        }
        this.f5944k = 0;
    }

    public final void f(c cVar, b bVar) {
        int i = this.f5944k;
        for (int i9 = 0; i9 < i; i9++) {
            this.f5943j[i9].i(cVar, bVar, false);
        }
        this.f5944k = 0;
    }

    public final String toString() {
        return "" + this.f5936b;
    }
}
