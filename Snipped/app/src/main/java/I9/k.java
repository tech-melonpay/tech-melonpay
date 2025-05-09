package I9;

import io.sentry.DataCategory;
import io.sentry.SentryOptions;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: RateLimiter.java */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final e f1940a;

    /* renamed from: b, reason: collision with root package name */
    public final SentryOptions f1941b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f1942c;

    public k(SentryOptions sentryOptions) {
        c cVar = c.f1929a;
        this.f1942c = new ConcurrentHashMap();
        this.f1940a = cVar;
        this.f1941b = sentryOptions;
    }

    public final void a(DataCategory dataCategory, Date date) {
        ConcurrentHashMap concurrentHashMap = this.f1942c;
        Date date2 = (Date) concurrentHashMap.get(dataCategory);
        if (date2 == null || date.after(date2)) {
            concurrentHashMap.put(dataCategory, date);
        }
    }
}
