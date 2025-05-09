package r9;

import io.reactivex.internal.schedulers.RxThreadFactory;

/* compiled from: NewThreadScheduler.java */
/* loaded from: classes2.dex */
public final class d extends j9.h {
    static {
        new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);
    }
}
