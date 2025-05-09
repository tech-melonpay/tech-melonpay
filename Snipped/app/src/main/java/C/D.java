package C;

import pa.C1124b;

/* compiled from: RecordingStats.java */
/* loaded from: classes.dex */
public abstract class D {
    public static C0492h d(long j10, long j11, C0486b c0486b) {
        C1124b.m(j10 >= 0, "duration must be positive value.");
        C1124b.m(j11 >= 0, "bytes must be positive value.");
        return new C0492h(j10, j11, c0486b);
    }

    public abstract AbstractC0485a a();

    public abstract long b();

    public abstract long c();
}
