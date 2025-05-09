package C9;

import io.sentry.DataCategory;
import io.sentry.clientreport.DiscardReason;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AtomicClientReportStorage.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Map<c, AtomicLong> f688a;

    public a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (DiscardReason discardReason : DiscardReason.values()) {
            for (DataCategory dataCategory : DataCategory.values()) {
                concurrentHashMap.put(new c(discardReason.getReason(), dataCategory.getCategory()), new AtomicLong(0L));
            }
        }
        this.f688a = Collections.unmodifiableMap(concurrentHashMap);
    }
}
