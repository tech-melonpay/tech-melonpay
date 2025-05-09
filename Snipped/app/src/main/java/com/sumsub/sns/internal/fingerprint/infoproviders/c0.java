package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.os.Build;
import ca.InterfaceC0635a;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class c0 implements b0 {

    public static final class a extends Lambda implements InterfaceC0635a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f17305a = new a();

        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Build.VERSION.RELEASE;
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17306a = new b();

        public b() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Build.FINGERPRINT;
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f17307a = new c();

        public c() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return System.getProperty("os.version");
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f17308a = new d();

        public d() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Build.MANUFACTURER;
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f17309a = new e();

        public e() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Build.MODEL;
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f17310a = new f();

        public f() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return String.valueOf(Build.VERSION.SDK_INT);
        }
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.b0
    public String a() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, f.f17310a, 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.b0
    public String b() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, b.f17306a, 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.b0
    public String c() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, a.f17305a, 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.b0
    public String d() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, c.f17307a, 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.b0
    public String e() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, d.f17308a, 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.b0
    public String f() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, e.f17309a, 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }
}
