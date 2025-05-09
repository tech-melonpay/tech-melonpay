package io.michaelrocks.libphonenumber.android.internal;

import io.michaelrocks.libphonenumber.android.internal.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: RegexCache.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0410a<String, Pattern> f21666a;

    /* compiled from: RegexCache.java */
    /* renamed from: io.michaelrocks.libphonenumber.android.internal.a$a, reason: collision with other inner class name */
    public static class C0410a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public LinkedHashMap<K, V> f21667a;

        /* renamed from: b, reason: collision with root package name */
        public int f21668b;
    }

    public a(int i) {
        final C0410a<String, Pattern> c0410a = new C0410a<>();
        c0410a.f21668b = i;
        final int b9 = androidx.camera.core.impl.utils.a.b(i, 4, 3, 1);
        c0410a.f21667a = new LinkedHashMap<Object, Object>(b9) { // from class: io.michaelrocks.libphonenumber.android.internal.RegexCache$LRUCache$1
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<Object, Object> entry) {
                return size() > a.C0410a.this.f21668b;
            }
        };
        this.f21666a = c0410a;
    }

    public final Pattern a(String str) {
        Pattern pattern;
        C0410a<String, Pattern> c0410a = this.f21666a;
        synchronized (c0410a) {
            pattern = c0410a.f21667a.get(str);
        }
        Pattern pattern2 = pattern;
        if (pattern2 == null) {
            pattern2 = Pattern.compile(str);
            C0410a<String, Pattern> c0410a2 = this.f21666a;
            synchronized (c0410a2) {
                c0410a2.f21667a.put(str, pattern2);
            }
        }
        return pattern2;
    }
}
