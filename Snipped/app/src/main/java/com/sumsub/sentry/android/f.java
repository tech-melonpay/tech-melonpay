package com.sumsub.sentry.android;

import android.os.Looper;
import com.sumsub.sentry.k0;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f13573a = new f();

    public final boolean a(k0 k0Var) {
        Long id = k0Var.getId();
        if (id == null) {
            return false;
        }
        return f13573a.a(id.longValue());
    }

    public final boolean a(long j10) {
        return Looper.getMainLooper().getThread().getId() == j10;
    }
}
