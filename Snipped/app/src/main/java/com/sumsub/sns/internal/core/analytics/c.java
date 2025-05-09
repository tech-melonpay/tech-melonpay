package com.sumsub.sns.internal.core.analytics;

import P9.z;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Screen f14978a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14979b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f14980c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, Object> f14981d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, Object> f14982e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, Object> f14983f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14984g;

    public c(Screen screen, String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        this.f14978a = screen;
        this.f14979b = str;
        this.f14980c = map;
        this.f14981d = map2;
        this.f14982e = map3;
        this.f14983f = map4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(c cVar, Screen screen, String str, Control control, Map map, int i, Object obj) {
        if ((i & 8) != 0) {
            map = kotlin.collections.a.p();
        }
        cVar.b(screen, str, control, map);
    }

    public final void a(boolean z10) {
        this.f14984g = z10;
    }

    public final void c() {
        a(this.f14978a, this.f14979b, this.f14981d);
    }

    public final void d() {
        if (this.f14984g) {
            b(this.f14978a, this.f14979b, this.f14983f);
        } else {
            c(this.f14978a, this.f14979b, this.f14982e);
        }
    }

    public final void e() {
        d(this.f14978a, this.f14979b, this.f14980c);
    }

    public final void a(Screen screen, String str, Control control, Map<String, ? extends Object> map) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a(control).h().a(kotlin.collections.a.t(a(screen, str), map)), false, 1, null);
    }

    public final void c(Screen screen, String str, Map<String, ? extends Object> map) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a().o().a(kotlin.collections.a.t(a(screen, str), map)), false, 1, null);
    }

    public final void b(Screen screen, String str, Control control, Map<String, ? extends Object> map) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a(control).g().a(kotlin.collections.a.t(a(screen, str), map)), false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(c cVar, Screen screen, String str, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = kotlin.collections.a.p();
        }
        cVar.d(screen, str, map);
    }

    public final void d(Screen screen, String str, Map<String, ? extends Object> map) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a().b().a(kotlin.collections.a.t(a(screen, str), map)), false, 1, null);
    }

    public final void a(Screen screen, String str, Map<String, ? extends Object> map) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a().j().a(kotlin.collections.a.t(a(screen, str), map)), false, 1, null);
    }

    public final void b(Screen screen, String str, Map<String, ? extends Object> map) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a().m().a(kotlin.collections.a.t(a(screen, str), map)), false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(c cVar, Screen screen, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = kotlin.collections.a.p();
        }
        cVar.a(screen, (Map<String, ? extends Object>) map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(c cVar, Screen screen, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = kotlin.collections.a.p();
        }
        cVar.b(screen, map);
    }

    public final void a(Screen screen, Map<String, ? extends Object> map) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a(Control.BottomSheet).k().a(kotlin.collections.a.t(a(screen, this.f14979b), map)), false, 1, null);
    }

    public final void b(Screen screen, Map<String, ? extends Object> map) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a(Control.BottomSheet).i().a(kotlin.collections.a.t(a(screen, this.f14979b), map)), false, 1, null);
    }

    public final Map<String, Object> a(Map<GlobalStatePayload, ? extends Object> map) {
        Set<Map.Entry<GlobalStatePayload, ? extends Object>> entrySet = map.entrySet();
        int n10 = z.n(P9.n.u(entrySet, 10));
        if (n10 < 16) {
            n10 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n10);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((GlobalStatePayload) entry.getKey()).getText(), entry.getValue());
        }
        return linkedHashMap;
    }

    public final Map<String, Object> a(Screen screen, String str) {
        Map p10;
        LinkedHashMap t3 = kotlin.collections.a.t(b.f14967a.f(), z.o(new Pair(GlobalStatePayload.Screen, screen.getText())));
        if (!kotlin.jvm.internal.f.b(str, DocumentType.f15253j)) {
            p10 = z.o(new Pair(GlobalStatePayload.IdDocSetType, str));
        } else {
            p10 = kotlin.collections.a.p();
        }
        return a(kotlin.collections.a.t(t3, p10));
    }
}
