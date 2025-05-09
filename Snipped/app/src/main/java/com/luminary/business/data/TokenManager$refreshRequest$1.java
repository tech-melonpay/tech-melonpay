package com.luminary.business.data;

import T9.a;
import V9.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import va.g;

/* compiled from: TokenManager.kt */
@d(c = "com.luminary.business.data.TokenManager", f = "TokenManager.kt", l = {99}, m = "refreshRequest")
/* loaded from: classes.dex */
public final class TokenManager$refreshRequest$1 extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ TokenManager f10657A;

    /* renamed from: B, reason: collision with root package name */
    public int f10658B;

    /* renamed from: u, reason: collision with root package name */
    public TokenManager f10659u;

    /* renamed from: v, reason: collision with root package name */
    public g.a f10660v;

    /* renamed from: w, reason: collision with root package name */
    public String f10661w;

    /* renamed from: x, reason: collision with root package name */
    public String f10662x;

    /* renamed from: y, reason: collision with root package name */
    public Mutex f10663y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f10664z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenManager$refreshRequest$1(TokenManager tokenManager, a<? super TokenManager$refreshRequest$1> aVar) {
        super(aVar);
        this.f10657A = tokenManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10664z = obj;
        this.f10658B |= Integer.MIN_VALUE;
        return this.f10657A.b(null, null, null, this);
    }
}
