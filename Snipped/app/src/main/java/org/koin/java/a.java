package org.koin.java;

import O9.f;
import ca.InterfaceC0635a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.b;
import kotlin.jvm.internal.h;

/* compiled from: KoinJavaComponent.kt */
/* loaded from: classes3.dex */
public final class a {
    public static f a(final Class cls) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f23085a;
        final hb.a aVar = null;
        final byte b9 = 0 == true ? 1 : 0;
        return kotlin.a.b(lazyThreadSafetyMode, new InterfaceC0635a<Object>() { // from class: org.koin.java.KoinJavaComponent$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                b a10 = h.a(cls);
                Fa.h hVar = bb.a.f8486b;
                if (hVar == null) {
                    throw new IllegalStateException("KoinApplication has not been started".toString());
                }
                return ((ib.a) hVar.f1299b).f21521b.a(b9, aVar, a10);
            }
        });
    }
}
