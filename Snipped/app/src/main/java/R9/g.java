package r9;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.Executors;

/* compiled from: SingleScheduler.java */
/* loaded from: classes2.dex */
public final class g extends j9.h {

    /* renamed from: a, reason: collision with root package name */
    public static final RxThreadFactory f26345a;

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        f26345a = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }
}
