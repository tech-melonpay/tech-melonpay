package Fa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

/* compiled from: AndroidLog.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet<Logger> f1287a = new CopyOnWriteArraySet<>();

    /* renamed from: b, reason: collision with root package name */
    public static final Map<String, String> f1288b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = va.h.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(va.h.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Ca.c.class.getName(), "okhttp.Http2");
        linkedHashMap.put(ya.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f1288b = kotlin.collections.a.w(linkedHashMap);
    }
}
