package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.app.ActivityManager;
import android.content.pm.ConfigurationInfo;
import ca.InterfaceC0635a;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.c;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityManager f17350a;

    public static final class a extends Lambda implements InterfaceC0635a<String> {
        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            ConfigurationInfo deviceConfigurationInfo;
            ActivityManager activityManager = u.this.f17350a;
            String glEsVersion = (activityManager == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null) ? null : deviceConfigurationInfo.getGlEsVersion();
            return glEsVersion == null ? "" : glEsVersion;
        }
    }

    public u(ActivityManager activityManager) {
        this.f17350a = activityManager;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.t
    public String a() {
        Object a10 = c.a(0L, new a(), 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }
}
