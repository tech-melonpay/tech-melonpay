package ha;

import da.InterfaceC0701a;
import java.util.Iterator;

/* compiled from: Progressions.kt */
/* renamed from: ha.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0804c implements Iterable<Integer>, InterfaceC0701a {

    /* renamed from: a, reason: collision with root package name */
    public final int f21226a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21227b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21228c;

    public C0804c(int i, int i9, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f21226a = i;
        this.f21227b = U4.b.m(i, i9, i10);
        this.f21228c = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0804c) {
            if (!isEmpty() || !((C0804c) obj).isEmpty()) {
                C0804c c0804c = (C0804c) obj;
                if (this.f21226a != c0804c.f21226a || this.f21227b != c0804c.f21227b || this.f21228c != c0804c.f21228c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f21226a * 31) + this.f21227b) * 31) + this.f21228c;
    }

    public boolean isEmpty() {
        int i = this.f21228c;
        int i9 = this.f21227b;
        int i10 = this.f21226a;
        if (i > 0) {
            if (i10 <= i9) {
                return false;
            }
        } else if (i10 >= i9) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new C0805d(this.f21226a, this.f21227b, this.f21228c);
    }

    public String toString() {
        StringBuilder sb2;
        int i = this.f21227b;
        int i9 = this.f21226a;
        int i10 = this.f21228c;
        if (i10 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i9);
            sb2.append("..");
            sb2.append(i);
            sb2.append(" step ");
            sb2.append(i10);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i9);
            sb2.append(" downTo ");
            sb2.append(i);
            sb2.append(" step ");
            sb2.append(-i10);
        }
        return sb2.toString();
    }
}
