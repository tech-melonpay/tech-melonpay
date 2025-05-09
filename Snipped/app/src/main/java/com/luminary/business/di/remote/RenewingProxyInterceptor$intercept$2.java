package com.luminary.business.di.remote;

import T9.a;
import V9.d;
import ca.InterfaceC0650p;
import com.luminary.business.data.TokenManager;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.k;
import okhttp3.p;
import va.g;

/* compiled from: RenewingProxyInterceptor.kt */
@d(c = "com.luminary.business.di.remote.RenewingProxyInterceptor$intercept$2", f = "RenewingProxyInterceptor.kt", l = {31, 34}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RenewingProxyInterceptor$intercept$2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public k.a f10671u;

    /* renamed from: v, reason: collision with root package name */
    public String f10672v;

    /* renamed from: w, reason: collision with root package name */
    public int f10673w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RenewingProxyInterceptor f10674x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g.a f10675y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k f10676z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenewingProxyInterceptor$intercept$2(RenewingProxyInterceptor renewingProxyInterceptor, g.a aVar, k kVar, a<? super RenewingProxyInterceptor$intercept$2> aVar2) {
        super(2, aVar2);
        this.f10674x = renewingProxyInterceptor;
        this.f10675y = aVar;
        this.f10676z = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<O9.p> create(Object obj, a<?> aVar) {
        return new RenewingProxyInterceptor$intercept$2(this.f10674x, this.f10675y, this.f10676z, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, a<? super p> aVar) {
        return ((RenewingProxyInterceptor$intercept$2) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        k.a a10;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f10673w;
        g.a aVar = this.f10675y;
        RenewingProxyInterceptor renewingProxyInterceptor = this.f10674x;
        if (i == 0) {
            b.b(obj);
            TokenManager tokenManager = renewingProxyInterceptor.f10670c;
            this.f10673w = 1;
            if (tokenManager.b(aVar, renewingProxyInterceptor.f10668a, renewingProxyInterceptor.f10669b, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = this.f10672v;
                a10 = this.f10671u;
                b.b(obj);
                a10.f24652c.a(str, androidx.camera.core.impl.utils.a.j(obj, "Bearer "));
                return aVar.a(a10.b());
            }
            b.b(obj);
        }
        a10 = this.f10676z.a();
        a10.f24652c.f("Authorization");
        TokenManager tokenManager2 = renewingProxyInterceptor.f10670c;
        this.f10671u = a10;
        this.f10672v = "Authorization";
        this.f10673w = 2;
        obj = tokenManager2.a(this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        str = "Authorization";
        a10.f24652c.a(str, androidx.camera.core.impl.utils.a.j(obj, "Bearer "));
        return aVar.a(a10.b());
    }
}
