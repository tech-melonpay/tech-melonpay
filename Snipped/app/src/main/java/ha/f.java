package ha;

import P9.x;
import java.util.NoSuchElementException;

/* compiled from: ProgressionIterators.kt */
/* loaded from: classes2.dex */
public final class f extends x {

    /* renamed from: a, reason: collision with root package name */
    public final long f21234a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21235b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21236c;

    /* renamed from: d, reason: collision with root package name */
    public long f21237d;

    public f(long j10, long j11, long j12) {
        this.f21234a = j12;
        this.f21235b = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f21236c = z10;
        this.f21237d = z10 ? j10 : j11;
    }

    @Override // P9.x
    public final long a() {
        long j10 = this.f21237d;
        if (j10 != this.f21235b) {
            this.f21237d = this.f21234a + j10;
        } else {
            if (!this.f21236c) {
                throw new NoSuchElementException();
            }
            this.f21236c = false;
        }
        return j10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21236c;
    }
}
