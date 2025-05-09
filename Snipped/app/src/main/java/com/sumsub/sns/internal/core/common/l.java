package com.sumsub.sns.internal.core.common;

import android.os.SystemClock;
import android.view.View;
import ca.InterfaceC0635a;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static long f15143b;

    public static final void a(View view, InterfaceC0635a<O9.p> interfaceC0635a) {
        view.setOnClickListener(new J7.b(interfaceC0635a, 15));
    }

    public static final void a(InterfaceC0635a interfaceC0635a, View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f15143b >= 400) {
            f15143b = elapsedRealtime;
            interfaceC0635a.invoke();
        }
    }
}
