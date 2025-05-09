package Ka;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SegmentPool.kt */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final u f2342a = new u(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f2343b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference<u>[] f2344c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f2343b = highestOneBit;
        AtomicReference<u>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f2344c = atomicReferenceArr;
    }

    public static final void a(u uVar) {
        if (uVar.f2340f != null || uVar.f2341g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (uVar.f2338d) {
            return;
        }
        AtomicReference<u> atomicReference = f2344c[(int) (Thread.currentThread().getId() & (f2343b - 1))];
        u uVar2 = f2342a;
        u andSet = atomicReference.getAndSet(uVar2);
        if (andSet == uVar2) {
            return;
        }
        int i = andSet != null ? andSet.f2337c : 0;
        if (i >= 65536) {
            atomicReference.set(andSet);
            return;
        }
        uVar.f2340f = andSet;
        uVar.f2336b = 0;
        uVar.f2337c = i + 8192;
        atomicReference.set(uVar);
    }

    public static final u b() {
        AtomicReference<u> atomicReference = f2344c[(int) (Thread.currentThread().getId() & (f2343b - 1))];
        u uVar = f2342a;
        u andSet = atomicReference.getAndSet(uVar);
        if (andSet == uVar) {
            return new u();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new u();
        }
        atomicReference.set(andSet.f2340f);
        andSet.f2340f = null;
        andSet.f2337c = 0;
        return andSet;
    }
}
