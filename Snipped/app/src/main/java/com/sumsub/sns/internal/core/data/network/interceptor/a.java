package com.sumsub.sns.internal.core.data.network.interceptor;

import O9.f;
import android.os.Build;
import ca.InterfaceC0635a;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.i;
import java.util.Map;
import ka.C0969n;
import kotlin.jvm.internal.Lambda;
import okhttp3.k;
import okhttp3.p;
import va.g;

/* loaded from: classes2.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.settings.b f15808a;

    /* renamed from: b, reason: collision with root package name */
    public final f f15809b = kotlin.a.a(new C0222a());

    /* renamed from: com.sumsub.sns.internal.core.data.network.interceptor.a$a, reason: collision with other inner class name */
    public static final class C0222a extends Lambda implements InterfaceC0635a<String> {
        public C0222a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return a.this.f15808a.f();
        }
    }

    public a(com.sumsub.sns.internal.core.data.source.settings.b bVar) {
        this.f15808a = bVar;
    }

    @Override // va.g
    public synchronized p intercept(g.a aVar) {
        k.a a10;
        String f10;
        String str;
        String str2;
        try {
            a10 = aVar.request().a();
            a10.f24652c.a("X-Network-Type", this.f15808a.h());
            String a11 = this.f15808a.a();
            if (!(!C0969n.i0(a11))) {
                a11 = null;
            }
            if (a11 != null) {
                a10.a("X-Applicant-Id", a11);
            }
            e0 e0Var = e0.f15081a;
            a10.f24652c.a("X-Mob-App", e0Var.getPackageName());
            a10.f24652c.a("X-Mob-App-Ver", e0Var.getVersionName() + '/' + e0Var.getVersionCode());
            a10.f24652c.a("X-Mob-Dev", i.b());
            a10.f24652c.a("X-Mob-Dev-Id", a());
            a10.f24652c.a("X-Mob-Sdk-Ver", "1.32.0");
            a10.f24652c.a("X-Mob-Sdk-Locale", e0Var.getLocale().toString());
            a10.f24652c.a("X-Mob-OS", "Android");
            a10.f24652c.a("X-Mob-OS-Ver", Build.VERSION.RELEASE);
            a10.f24652c.a("X-Client-Id", "msdk2");
            a10.f24652c.a("X-Debug", String.valueOf(e0Var.isDebug()));
            a10.f24652c.a("X-Device-Fingerprint", a());
            if (aVar.request().f24646c.a("X-Session-Id") == null) {
                a10.a("X-Session-Id", String.valueOf(this.f15808a.g()));
            }
            Map<String, String> settings = e0Var.getSettings();
            if (settings != null && (str2 = settings.get("appFrameworkName")) != null) {
                a10.a("X-Mob-App-Framework", str2);
            }
            Map<String, String> settings2 = e0Var.getSettings();
            if (settings2 != null && (str = settings2.get("appFrameworkVersion")) != null) {
                a10.a("X-Mob-App-Framework-Ver", str);
            }
            com.sumsub.sns.internal.ff.a aVar2 = com.sumsub.sns.internal.ff.a.f16930a;
            if (aVar2.z().g() && (f10 = aVar2.z().f()) != null) {
                a10.a("X-Test-Ip", f10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar.a(a10.b());
    }

    public final String a() {
        return (String) this.f15809b.getValue();
    }
}
