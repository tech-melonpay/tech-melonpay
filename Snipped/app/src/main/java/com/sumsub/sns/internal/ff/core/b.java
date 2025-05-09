package com.sumsub.sns.internal.ff.core;

import androidx.camera.core.n;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, a> f16962a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<String, a> f16963b = new ConcurrentHashMap<>();

    public final Collection<a> a() {
        return this.f16963b.values();
    }

    public final Collection<a> b() {
        return this.f16962a.values();
    }

    public final void c() {
        Iterator<Map.Entry<String, a>> it = this.f16962a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().j();
        }
        Iterator<Map.Entry<String, a>> it2 = this.f16963b.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().j();
        }
    }

    public static /* synthetic */ a b(b bVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return bVar.b(str, str2, str3);
    }

    public final void a(b.C0233b c0233b) {
        for (b.C0233b.a aVar : c0233b.a()) {
            a aVar2 = this.f16962a.get(aVar.d());
            if (aVar2 != null) {
                aVar2.c(aVar.f(), aVar.e());
            }
        }
    }

    public final a b(String str, String str2, String str3) {
        return a(str, str3, str2, true);
    }

    public final a a(String str) {
        a aVar = this.f16962a.get(str);
        return aVar == null ? this.f16963b.get(str) : aVar;
    }

    public static /* synthetic */ a a(b bVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return bVar.a(str, str2, str3);
    }

    public final a a(String str, String str2, String str3) {
        return a(str, str3, str2, false);
    }

    public final a a(String str, String str2, String str3, boolean z10) {
        if (!this.f16963b.contains(str) && !this.f16962a.contains(str)) {
            a aVar = new a(str, str3, z10, str2);
            if (z10) {
                this.f16963b.put(str, aVar);
            } else {
                this.f16962a.put(str, aVar);
            }
            return aVar;
        }
        throw new IllegalArgumentException(n.a("Feature name ", str, " is already used"));
    }
}
