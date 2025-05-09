package androidx.collection;

import java.util.Arrays;

/* compiled from: SparseArrayCompat.jvm.kt */
/* loaded from: classes.dex */
public final class h<E> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f5899a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f5900b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f5901c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f5902d;

    public h() {
        this(0);
    }

    public final void a(int i, E e10) {
        int i9 = this.f5902d;
        if (i9 != 0 && i <= this.f5900b[i9 - 1]) {
            e(i, e10);
            return;
        }
        if (this.f5899a && i9 >= this.f5900b.length) {
            e.a(this);
        }
        int i10 = this.f5902d;
        if (i10 >= this.f5900b.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            this.f5900b = Arrays.copyOf(this.f5900b, i14);
            this.f5901c = Arrays.copyOf(this.f5901c, i14);
        }
        this.f5900b[i10] = i;
        this.f5901c[i10] = e10;
        this.f5902d = i10 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h<E> clone() {
        h<E> hVar = (h) super.clone();
        hVar.f5900b = (int[]) this.f5900b.clone();
        hVar.f5901c = (Object[]) this.f5901c.clone();
        return hVar;
    }

    public final E c(int i) {
        E e10;
        int a10 = Q.a.a(this.f5902d, i, this.f5900b);
        if (a10 < 0 || (e10 = (E) this.f5901c[a10]) == e.f5898b) {
            return null;
        }
        return e10;
    }

    public final int d(int i) {
        if (this.f5899a) {
            e.a(this);
        }
        return this.f5900b[i];
    }

    public final void e(int i, E e10) {
        int a10 = Q.a.a(this.f5902d, i, this.f5900b);
        if (a10 >= 0) {
            this.f5901c[a10] = e10;
            return;
        }
        int i9 = ~a10;
        int i10 = this.f5902d;
        if (i9 < i10) {
            Object[] objArr = this.f5901c;
            if (objArr[i9] == e.f5898b) {
                this.f5900b[i9] = i;
                objArr[i9] = e10;
                return;
            }
        }
        if (this.f5899a && i10 >= this.f5900b.length) {
            e.a(this);
            i9 = ~Q.a.a(this.f5902d, i, this.f5900b);
        }
        int i11 = this.f5902d;
        if (i11 >= this.f5900b.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            this.f5900b = Arrays.copyOf(this.f5900b, i15);
            this.f5901c = Arrays.copyOf(this.f5901c, i15);
        }
        int i16 = this.f5902d;
        if (i16 - i9 != 0) {
            int[] iArr = this.f5900b;
            int i17 = i9 + 1;
            P9.i.d(i17, i9, iArr, iArr, i16);
            Object[] objArr2 = this.f5901c;
            P9.i.e(objArr2, objArr2, i17, i9, this.f5902d);
        }
        this.f5900b[i9] = i;
        this.f5901c[i9] = e10;
        this.f5902d++;
    }

    public final int f() {
        if (this.f5899a) {
            e.a(this);
        }
        return this.f5902d;
    }

    public final E g(int i) {
        if (this.f5899a) {
            e.a(this);
        }
        return (E) this.f5901c[i];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f5902d * 28);
        sb2.append('{');
        int i = this.f5902d;
        for (int i9 = 0; i9 < i; i9++) {
            if (i9 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i9));
            sb2.append('=');
            E g10 = g(i9);
            if (g10 != this) {
                sb2.append(g10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public h(int i) {
        int i9;
        int i10 = 4;
        while (true) {
            i9 = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i9 = i11;
                break;
            }
            i10++;
        }
        int i12 = i9 / 4;
        this.f5900b = new int[i12];
        this.f5901c = new Object[i12];
    }
}
