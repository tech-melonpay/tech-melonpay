package O9;

/* compiled from: ULong.kt */
/* loaded from: classes2.dex */
public final class k implements Comparable<k> {

    /* renamed from: a, reason: collision with root package name */
    public final long f3025a;

    @Override // java.lang.Comparable
    public final int compareTo(k kVar) {
        long j10 = kVar.f3025a;
        long j11 = this.f3025a ^ Long.MIN_VALUE;
        long j12 = j10 ^ Long.MIN_VALUE;
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f3025a == ((k) obj).f3025a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3025a);
    }

    public final String toString() {
        long j10 = this.f3025a;
        if (j10 >= 0) {
            j3.e.e(10);
            return Long.toString(j10, 10);
        }
        long j11 = 10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        j3.e.e(10);
        String l10 = Long.toString(j12, 10);
        j3.e.e(10);
        return l10.concat(Long.toString(j13, 10));
    }
}
