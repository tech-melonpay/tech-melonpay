package com.luminary.business.data;

import T9.a;
import V9.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: TokenManager.kt */
@d(c = "com.luminary.business.data.TokenManager", f = "TokenManager.kt", l = {99}, m = "getToken")
/* loaded from: classes.dex */
public final class TokenManager$getToken$1 extends ContinuationImpl {

    /* renamed from: u, reason: collision with root package name */
    public TokenManager f10652u;

    /* renamed from: v, reason: collision with root package name */
    public Mutex f10653v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f10654w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TokenManager f10655x;

    /* renamed from: y, reason: collision with root package name */
    public int f10656y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenManager$getToken$1(TokenManager tokenManager, a<? super TokenManager$getToken$1> aVar) {
        super(aVar);
        this.f10655x = tokenManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10654w = obj;
        this.f10656y |= Integer.MIN_VALUE;
        return this.f10655x.a(this);
    }
}
