package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import ca.InterfaceC0635a;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class k0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f17328a;

    public static final class a extends Lambda implements InterfaceC0635a<String> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17330b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f17330b = str;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Settings.Global.getString(k0.this.f17328a, this.f17330b);
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<String> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17332b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f17332b = str;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Settings.Secure.getString(k0.this.f17328a, this.f17332b);
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<String> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17334b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f17334b = str;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Settings.System.getString(k0.this.f17328a, this.f17334b);
        }
    }

    public k0(ContentResolver contentResolver) {
        this.f17328a = contentResolver;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String b() {
        return c("date_format");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String c() {
        return c("alarm_alert");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String d() {
        return a("http_proxy");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String e() {
        return c("font_scale");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String f() {
        return c("end_button_behavior");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String g() {
        return c("screen_off_timeout");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String h() {
        return c("auto_replace");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String i() {
        return b("default_input_method");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String j() {
        return b("accessibility_enabled");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String k() {
        return a("window_animation_scale");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String l() {
        return a("transition_animation_scale");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String m() {
        return Build.VERSION.SDK_INT >= 28 ? b("rtt_calling_mode") : "";
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String n() {
        return a("development_settings_enabled");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String o() {
        return a("data_roaming");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String p() {
        return b("touch_exploration_enabled");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String q() {
        return c("time_12_24");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String r() {
        return c("auto_punctuate");
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j0
    public String a() {
        return a("adb_enabled");
    }

    public final String b(String str) {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new b(str), 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }

    public final String c(String str) {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new c(str), 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }

    public final String a(String str) {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new a(str), 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }
}
