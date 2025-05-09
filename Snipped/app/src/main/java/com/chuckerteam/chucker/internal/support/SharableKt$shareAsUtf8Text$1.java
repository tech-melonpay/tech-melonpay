package com.chuckerteam.chucker.internal.support;

import V9.d;
import android.app.Activity;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Sharable.kt */
@d(c = "com.chuckerteam.chucker.internal.support.SharableKt", f = "Sharable.kt", l = {31}, m = "shareAsUtf8Text")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SharableKt$shareAsUtf8Text$1 extends ContinuationImpl {

    /* renamed from: u, reason: collision with root package name */
    public Activity f8642u;

    /* renamed from: v, reason: collision with root package name */
    public String f8643v;

    /* renamed from: w, reason: collision with root package name */
    public String f8644w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f8645x;

    /* renamed from: y, reason: collision with root package name */
    public int f8646y;

    public SharableKt$shareAsUtf8Text$1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8645x = obj;
        this.f8646y |= Integer.MIN_VALUE;
        return b.b(null, null, null, null, this);
    }
}
