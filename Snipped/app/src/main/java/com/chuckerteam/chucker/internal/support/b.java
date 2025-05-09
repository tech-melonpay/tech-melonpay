package com.chuckerteam.chucker.internal.support;

/* compiled from: Sharable.kt */
/* loaded from: classes.dex */
public final class b {
    /* JADX WARN: Removed duplicated region for block: B:6:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.content.Intent a(S1.k r6, T1.a r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.support.b.a(S1.k, T1.a, java.lang.String, java.lang.String, java.lang.String, java.lang.String):android.content.Intent");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(S1.k r5, com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity r6, java.lang.String r7, java.lang.String r8, T9.a r9) {
        /*
            boolean r0 = r9 instanceof com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$1
            if (r0 == 0) goto L13
            r0 = r9
            com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$1 r0 = (com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$1) r0
            int r1 = r0.f8646y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8646y = r1
            goto L18
        L13:
            com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$1 r0 = new com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8645x
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f8646y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.String r8 = r0.f8644w
            java.lang.String r7 = r0.f8643v
            android.app.Activity r6 = r0.f8642u
            kotlin.b.b(r9)
            goto L51
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.b.b(r9)
            kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getDefault()
            com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$content$1 r2 = new com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$content$1
            r2.<init>(r5, r6, r3)
            r0.f8642u = r6
            r0.f8643v = r7
            r0.f8644w = r8
            r0.f8646y = r4
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r2, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            java.lang.String r9 = (java.lang.String) r9
            r6.getClass()
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r5 = r5.setAction(r0)
            java.lang.String r1 = "androidx.core.app.EXTRA_CALLING_PACKAGE"
            java.lang.String r2 = r6.getPackageName()
            r5.putExtra(r1, r2)
            java.lang.String r1 = "android.support.v4.app.EXTRA_CALLING_PACKAGE"
            java.lang.String r2 = r6.getPackageName()
            r5.putExtra(r1, r2)
            r1 = 524288(0x80000, float:7.34684E-40)
            r5.addFlags(r1)
        L78:
            boolean r1 = r6 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L8a
            boolean r1 = r6 instanceof android.app.Activity
            if (r1 == 0) goto L83
            android.app.Activity r6 = (android.app.Activity) r6
            goto L8b
        L83:
            android.content.ContextWrapper r6 = (android.content.ContextWrapper) r6
            android.content.Context r6 = r6.getBaseContext()
            goto L78
        L8a:
            r6 = r3
        L8b:
            if (r6 == 0) goto L9b
            android.content.ComponentName r6 = r6.getComponentName()
            java.lang.String r1 = "androidx.core.app.EXTRA_CALLING_ACTIVITY"
            r5.putExtra(r1, r6)
            java.lang.String r1 = "android.support.v4.app.EXTRA_CALLING_ACTIVITY"
            r5.putExtra(r1, r6)
        L9b:
            java.lang.String r6 = "text/plain"
            r5.setType(r6)
            java.lang.String r6 = "android.intent.extra.SUBJECT"
            r5.putExtra(r6, r8)
            java.lang.String r6 = "android.intent.extra.TEXT"
            r5.putExtra(r6, r9)
            r5.setAction(r0)
            java.lang.String r6 = "android.intent.extra.STREAM"
            r5.removeExtra(r6)
            r5.setClipData(r3)
            int r6 = r5.getFlags()
            r6 = r6 & (-2)
            r5.setFlags(r6)
            android.content.Intent r5 = android.content.Intent.createChooser(r5, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.support.b.b(S1.k, com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity, java.lang.String, java.lang.String, T9.a):java.lang.Object");
    }
}
