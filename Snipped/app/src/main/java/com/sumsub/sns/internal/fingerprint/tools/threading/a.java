package com.sumsub.sns.internal.fingerprint.tools.threading;

import H6.c;
import O9.p;
import ca.InterfaceC0635a;
import kotlin.Result;

/* loaded from: classes2.dex */
public final class a {
    public static final Object a(InterfaceC0635a<p> interfaceC0635a) {
        try {
            b.b().submit(new c(5, interfaceC0635a));
            return p.f3034a;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public static final void b(InterfaceC0635a interfaceC0635a) {
        interfaceC0635a.invoke();
    }
}
