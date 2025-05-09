package com.sumsub.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f13590a;

    public b0(j0 j0Var) {
        Objects.requireNonNull(j0Var, "The SentryStackTraceFactory is required.");
        this.f13590a = j0Var;
    }

    public final List<a0> a(Deque<a0> deque) {
        return new ArrayList(deque);
    }

    public final List<a0> b(Throwable th) {
        return a(a(th));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.sumsub.sentry.a0 a(java.lang.Throwable r14, com.sumsub.sentry.o r15, java.lang.Thread r16, boolean r17) {
        /*
            r13 = this;
            java.lang.Class r0 = r14.getClass()
            java.lang.Package r0 = r0.getPackage()
            java.lang.Class r1 = r14.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r4 = r14.getMessage()
            if (r0 == 0) goto L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.getName()
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.String r5 = ""
            java.lang.String r1 = ka.C0967l.X(r1, r2, r5, r3)
        L32:
            r3 = r1
            r1 = 0
            if (r0 == 0) goto L3d
            java.lang.String r0 = r0.getName()
            r5 = r0
            r0 = r13
            goto L3f
        L3d:
            r0 = r13
            r5 = r1
        L3f:
            com.sumsub.sentry.j0 r2 = r0.f13590a
            java.lang.StackTraceElement[] r6 = r14.getStackTrace()
            java.util.List r8 = r2.a(r6)
            if (r8 == 0) goto L6b
            boolean r2 = r8.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L55
            r2 = r8
            goto L56
        L55:
            r2 = r1
        L56:
            if (r2 == 0) goto L6b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r17)
            if (r17 == 0) goto L60
            r10 = r2
            goto L61
        L60:
            r10 = r1
        L61:
            com.sumsub.sentry.i0 r2 = new com.sumsub.sentry.i0
            r12 = 0
            r9 = 0
            r11 = 2
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            goto L6c
        L6b:
            r7 = r1
        L6c:
            if (r16 == 0) goto L76
            long r1 = r16.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L76:
            r6 = r1
            com.sumsub.sentry.a0 r1 = new com.sumsub.sentry.a0
            r2 = r1
            r8 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sentry.b0.a(java.lang.Throwable, com.sumsub.sentry.o, java.lang.Thread, boolean):com.sumsub.sentry.a0");
    }

    public final Deque<a0> a(Throwable th) {
        Thread currentThread;
        boolean z10;
        o oVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        while (th != null && hashSet.add(th)) {
            if (th instanceof i) {
                i iVar = (i) th;
                o a10 = iVar.a();
                Throwable c2 = iVar.c();
                currentThread = iVar.b();
                z10 = iVar.d();
                th = c2;
                oVar = a10;
            } else {
                currentThread = Thread.currentThread();
                z10 = false;
                oVar = null;
            }
            arrayDeque.addFirst(a(th, oVar, currentThread, z10));
            th = th.getCause();
        }
        return arrayDeque;
    }
}
