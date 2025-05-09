package com.sumsub.sns.internal.fingerprint.tools.threading.safe;

import P9.l;
import ca.InterfaceC0635a;
import com.google.firebase.heartbeatinfo.d;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;

/* loaded from: classes2.dex */
public final class c {
    public static /* synthetic */ Object a(long j10, InterfaceC0635a interfaceC0635a, int i, Object obj) {
        if ((i & 1) != 0) {
            j10 = 1000;
        }
        return a(j10, interfaceC0635a);
    }

    public static final <T> Object a(long j10, InterfaceC0635a<? extends T> interfaceC0635a) {
        Object failure;
        Object failure2;
        StackTraceElement[] stackTrace;
        ArrayList arrayList = null;
        AtomicReference atomicReference = new AtomicReference(null);
        b bVar = b.f17363a;
        if (bVar.b()) {
            bVar.c();
        }
        try {
            failure = com.sumsub.sns.internal.fingerprint.tools.threading.b.b().submit(new d(1, atomicReference, interfaceC0635a));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a10 = Result.a(failure);
        if (a10 != null) {
            return new Result.Failure(a10);
        }
        Future future = (Future) failure;
        try {
            failure2 = future.get(j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        Throwable a11 = Result.a(failure2);
        if (a11 != null) {
            try {
                if (!(a11 instanceof TimeoutException)) {
                    throw a11;
                }
                TimeoutException timeoutException = (TimeoutException) a11;
                Thread thread = (Thread) atomicReference.get();
                if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
                    arrayList = l.o(stackTrace);
                }
                throw new a(timeoutException, arrayList);
            } catch (Throwable th3) {
                failure2 = new Result.Failure(th3);
            }
        }
        if (Result.a(failure2) != null) {
            try {
                future.cancel(true);
            } catch (Throwable unused) {
            }
        }
        return failure2;
    }

    public static final Object a(AtomicReference atomicReference, InterfaceC0635a interfaceC0635a) {
        b bVar = b.f17363a;
        bVar.d();
        atomicReference.set(Thread.currentThread());
        try {
            Object invoke = interfaceC0635a.invoke();
            bVar.a();
            return invoke;
        } catch (Throwable th) {
            b.f17363a.a();
            throw th;
        }
    }
}
