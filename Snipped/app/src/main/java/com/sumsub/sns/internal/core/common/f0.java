package com.sumsub.sns.internal.core.common;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15115a;

    public static final class a extends f0 {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15116b = new a();

        public a() {
            super("NFC disabled", null);
        }
    }

    public static final class b extends f0 {

        /* renamed from: b, reason: collision with root package name */
        public static final b f15117b = new b();

        public b() {
            super("NFC enabled", null);
        }
    }

    public static final class c extends f0 {

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f15118b;

        public c(Throwable th) {
            super("NFC Error", null);
            this.f15118b = th;
        }

        public final Throwable b() {
            return this.f15118b;
        }
    }

    public static final class d extends f0 {

        /* renamed from: b, reason: collision with root package name */
        public static final d f15119b = new d();

        public d() {
            super("Device has no NFC onboard", null);
        }
    }

    public /* synthetic */ f0(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f15115a;
    }

    public f0(String str) {
        this.f15115a = str;
    }
}
