package com.luminary.business.domain.functional;

import J5.b;
import ca.InterfaceC0646l;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: UseCase.kt */
/* loaded from: classes.dex */
public abstract class a<Type, Params> {
    public final void a(InterfaceC0646l interfaceC0646l, Object obj) {
        Deferred async$default;
        GlobalScope globalScope = GlobalScope.INSTANCE;
        async$default = BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new UseCase$invoke$job$1(this, obj, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(globalScope, Dispatchers.getMain(), null, new UseCase$invoke$2(interfaceC0646l, async$default, null), 2, null);
    }

    public abstract Object b(Params params, T9.a<? super J5.a<? extends b, ? extends Type>> aVar);
}
