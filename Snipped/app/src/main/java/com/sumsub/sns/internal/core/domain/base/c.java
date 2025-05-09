package com.sumsub.sns.internal.core.domain.base;

import O9.p;
import ca.InterfaceC0650p;
import com.sumsub.sns.internal.core.domain.model.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class c {
    public static final <L, R> Object a(com.sumsub.sns.internal.core.domain.model.a<? extends L, ? extends R> aVar, InterfaceC0650p<? super L, ? super T9.a<? super p>, ? extends Object> interfaceC0650p, InterfaceC0650p<? super R, ? super T9.a<? super p>, ? extends Object> interfaceC0650p2, T9.a<? super p> aVar2) {
        if (aVar.b()) {
            Object invoke = interfaceC0650p2.invoke((Object) ((a.b) aVar).d(), aVar2);
            return invoke == CoroutineSingletons.f23158a ? invoke : p.f3034a;
        }
        if (!aVar.a()) {
            return p.f3034a;
        }
        Object invoke2 = interfaceC0650p.invoke((Object) ((a.C0240a) aVar).d(), aVar2);
        return invoke2 == CoroutineSingletons.f23158a ? invoke2 : p.f3034a;
    }
}
