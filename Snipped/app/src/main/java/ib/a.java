package ib;

import Fa.h;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ScopeRegistry.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final hb.a f21519c = new hb.a("_root_");

    /* renamed from: a, reason: collision with root package name */
    public final HashSet<hb.a> f21520a;

    /* renamed from: b, reason: collision with root package name */
    public final org.koin.core.scope.a f21521b;

    public a(h hVar) {
        HashSet<hb.a> hashSet = new HashSet<>();
        this.f21520a = hashSet;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        hb.a aVar = f21519c;
        org.koin.core.scope.a aVar2 = new org.koin.core.scope.a(hVar);
        this.f21521b = aVar2;
        hashSet.add(aVar);
        concurrentHashMap.put("_root_", aVar2);
    }
}
