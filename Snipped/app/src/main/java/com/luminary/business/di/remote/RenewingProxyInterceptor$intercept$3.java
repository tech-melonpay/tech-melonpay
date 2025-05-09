package com.luminary.business.di.remote;

import T9.a;
import V9.d;
import ca.InterfaceC0650p;
import com.luminary.business.data.TokenManager;
import java.util.ArrayList;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.k;
import okhttp3.p;
import va.g;

/* compiled from: RenewingProxyInterceptor.kt */
@d(c = "com.luminary.business.di.remote.RenewingProxyInterceptor$intercept$3", f = "RenewingProxyInterceptor.kt", l = {56, 60}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RenewingProxyInterceptor$intercept$3 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public k.a f10677u;

    /* renamed from: v, reason: collision with root package name */
    public String f10678v;

    /* renamed from: w, reason: collision with root package name */
    public int f10679w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RenewingProxyInterceptor f10680x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g.a f10681y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k f10682z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenewingProxyInterceptor$intercept$3(RenewingProxyInterceptor renewingProxyInterceptor, g.a aVar, k kVar, a<? super RenewingProxyInterceptor$intercept$3> aVar2) {
        super(2, aVar2);
        this.f10680x = renewingProxyInterceptor;
        this.f10681y = aVar;
        this.f10682z = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<O9.p> create(Object obj, a<?> aVar) {
        return new RenewingProxyInterceptor$intercept$3(this.f10680x, this.f10681y, this.f10682z, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, a<? super p> aVar) {
        return ((RenewingProxyInterceptor$intercept$3) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        k.a a10;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f10679w;
        g.a aVar = this.f10681y;
        RenewingProxyInterceptor renewingProxyInterceptor = this.f10680x;
        if (i == 0) {
            b.b(obj);
            TokenManager tokenManager = renewingProxyInterceptor.f10670c;
            this.f10679w = 1;
            obj = tokenManager.b(aVar, renewingProxyInterceptor.f10668a, renewingProxyInterceptor.f10669b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = this.f10678v;
                a10 = this.f10677u;
                b.b(obj);
                a10.f24652c.a(str, androidx.camera.core.impl.utils.a.j(obj, "Bearer "));
                return aVar.a(a10.b());
            }
            b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        k kVar = this.f10682z;
        if (!booleanValue) {
            ArrayList<String> arrayList = RenewingProxyInterceptor.f10667d;
            renewingProxyInterceptor.getClass();
            return RenewingProxyInterceptor.a(kVar);
        }
        a10 = kVar.a();
        a10.f24652c.f("Authorization");
        TokenManager tokenManager2 = renewingProxyInterceptor.f10670c;
        this.f10677u = a10;
        this.f10678v = "Authorization";
        this.f10679w = 2;
        obj = tokenManager2.a(this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        str = "Authorization";
        a10.f24652c.a(str, androidx.camera.core.impl.utils.a.j(obj, "Bearer "));
        return aVar.a(a10.b());
    }
}
