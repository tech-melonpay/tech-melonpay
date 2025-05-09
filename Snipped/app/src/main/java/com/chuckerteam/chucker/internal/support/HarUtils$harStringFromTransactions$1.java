package com.chuckerteam.chucker.internal.support;

import V9.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: HarUtils.kt */
@d(c = "com.chuckerteam.chucker.internal.support.HarUtils", f = "HarUtils.kt", l = {17}, m = "harStringFromTransactions")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HarUtils$harStringFromTransactions$1 extends ContinuationImpl {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f8636u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ HarUtils f8637v;

    /* renamed from: w, reason: collision with root package name */
    public int f8638w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HarUtils$harStringFromTransactions$1(HarUtils harUtils, T9.a<? super HarUtils$harStringFromTransactions$1> aVar) {
        super(aVar);
        this.f8637v = harUtils;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8636u = obj;
        this.f8638w |= Integer.MIN_VALUE;
        return this.f8637v.a(null, null, null, this);
    }
}
