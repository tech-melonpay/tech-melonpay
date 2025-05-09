package com.sumsub.sentry;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class i extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final o f13668a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f13669b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread f13670c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13671d;

    public /* synthetic */ i(o oVar, Throwable th, Thread thread, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, th, thread, (i & 8) != 0 ? false : z10);
    }

    public final o a() {
        return this.f13668a;
    }

    public final Thread b() {
        return this.f13670c;
    }

    public final Throwable c() {
        return this.f13669b;
    }

    public final boolean d() {
        return this.f13671d;
    }

    public i(o oVar, Throwable th, Thread thread, boolean z10) {
        this.f13668a = oVar;
        this.f13669b = th;
        this.f13670c = thread;
        this.f13671d = z10;
    }
}
