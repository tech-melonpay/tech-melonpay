package com.google.i18n.phonenumbers.internal;

import com.google.i18n.phonenumbers.internal.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: RegexCache.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0111a<String, Pattern> f10516a;

    /* compiled from: RegexCache.java */
    /* renamed from: com.google.i18n.phonenumbers.internal.a$a, reason: collision with other inner class name */
    public static class C0111a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public LinkedHashMap<K, V> f10517a;

        /* renamed from: b, reason: collision with root package name */
        public int f10518b;
    }

    public a() {
        final C0111a<String, Pattern> c0111a = new C0111a<>();
        c0111a.f10518b = 100;
        final int i = 134;
        c0111a.f10517a = new LinkedHashMap<Object, Object>(i) { // from class: com.google.i18n.phonenumbers.internal.RegexCache$LRUCache$1
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<Object, Object> entry) {
                return size() > a.C0111a.this.f10518b;
            }
        };
        this.f10516a = c0111a;
    }

    public final Pattern a(String str) {
        Pattern pattern;
        C0111a<String, Pattern> c0111a = this.f10516a;
        synchronized (c0111a) {
            pattern = c0111a.f10517a.get(str);
        }
        Pattern pattern2 = pattern;
        if (pattern2 == null) {
            pattern2 = Pattern.compile(str);
            C0111a<String, Pattern> c0111a2 = this.f10516a;
            synchronized (c0111a2) {
                c0111a2.f10517a.put(str, pattern2);
            }
        }
        return pattern2;
    }
}
