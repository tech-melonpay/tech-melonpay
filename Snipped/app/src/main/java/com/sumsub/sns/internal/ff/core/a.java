package com.sumsub.sns.internal.ff.core;

import com.sumsub.sns.internal.core.common.e0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f16955a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16956b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16957c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<c> f16958d = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference<c> f16959e = new AtomicReference<>();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference<c> f16960f = new AtomicReference<>();

    /* renamed from: g, reason: collision with root package name */
    public final c f16961g;

    public a(String str, String str2, boolean z10, String str3) {
        this.f16955a = str;
        this.f16956b = str2;
        this.f16957c = z10;
        this.f16961g = new c(str, false, str3, FeatureFlagValueType.DEFAULT);
    }

    public final void a() {
        this.f16960f.set(null);
    }

    public final c b() {
        return this.f16961g;
    }

    public final String c() {
        return this.f16956b;
    }

    public final boolean d() {
        return this.f16957c;
    }

    public final String e() {
        return this.f16955a;
    }

    public final String f() {
        return i().c();
    }

    public final boolean g() {
        return h() || i().d();
    }

    public final boolean h() {
        e0.f15081a.isDebug();
        return false;
    }

    public final c i() {
        c cVar;
        c cVar2 = this.f16960f.get();
        if (cVar2 != null) {
            return cVar2;
        }
        c cVar3 = this.f16959e.get();
        return cVar3 != null ? cVar3 : (this.f16957c || (cVar = this.f16958d.get()) == null) ? this.f16961g : cVar;
    }

    public final void j() {
        this.f16958d.set(null);
        this.f16960f.set(null);
        this.f16959e.set(null);
    }

    public static /* synthetic */ void a(a aVar, boolean z10, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        aVar.a(z10, str);
    }

    public final void b(boolean z10, String str) {
        this.f16960f.set(new c(this.f16955a, z10, str, FeatureFlagValueType.LOCAL_OVERRIDE));
    }

    public final void c(boolean z10, String str) {
        this.f16958d.set(new c(this.f16955a, z10, str, FeatureFlagValueType.REMOTE));
    }

    public final void a(boolean z10, String str) {
        this.f16959e.set(new c(this.f16955a, z10, str, FeatureFlagValueType.CLIENT_OVERRIDE));
    }
}
