package com.sumsub.sns.internal.core.presentation.form.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f16560a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16561b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16562c;

    /* renamed from: com.sumsub.sns.internal.core.presentation.form.model.a$a, reason: collision with other inner class name */
    public static final class C0243a extends a {

        /* renamed from: d, reason: collision with root package name */
        public final String f16563d;

        /* renamed from: e, reason: collision with root package name */
        public final String f16564e;

        /* renamed from: f, reason: collision with root package name */
        public final String f16565f;

        /* renamed from: g, reason: collision with root package name */
        public final String f16566g;

        public C0243a(String str, String str2, String str3, String str4) {
            super(str, str3, str2, null);
            this.f16563d = str;
            this.f16564e = str2;
            this.f16565f = str3;
            this.f16566g = str4;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.a
        public String a() {
            return this.f16563d;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.a
        public String b() {
            return this.f16565f;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.a
        public String c() {
            return this.f16564e;
        }

        public final String d() {
            return this.f16566g;
        }
    }

    public static final class b extends a {

        /* renamed from: d, reason: collision with root package name */
        public final String f16567d;

        /* renamed from: e, reason: collision with root package name */
        public final String f16568e;

        /* renamed from: f, reason: collision with root package name */
        public final String f16569f;

        public b(String str, String str2, String str3) {
            super(str, str3, str2, null);
            this.f16567d = str;
            this.f16568e = str2;
            this.f16569f = str3;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.a
        public String a() {
            return this.f16567d;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.a
        public String b() {
            return this.f16569f;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.a
        public String c() {
            return this.f16568e;
        }
    }

    public static final class c extends a {

        /* renamed from: d, reason: collision with root package name */
        public final String f16570d;

        /* renamed from: e, reason: collision with root package name */
        public final String f16571e;

        /* renamed from: f, reason: collision with root package name */
        public final String f16572f;

        /* renamed from: g, reason: collision with root package name */
        public final String f16573g;

        public c(String str, String str2, String str3, String str4) {
            super(str, str3, str2, null);
            this.f16570d = str;
            this.f16571e = str2;
            this.f16572f = str3;
            this.f16573g = str4;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.a
        public String a() {
            return this.f16570d;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.a
        public String b() {
            return this.f16572f;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.a
        public String c() {
            return this.f16571e;
        }

        public final String d() {
            return this.f16573g;
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    public String a() {
        return this.f16560a;
    }

    public String b() {
        return this.f16562c;
    }

    public String c() {
        return this.f16561b;
    }

    public a(String str, String str2, String str3) {
        this.f16560a = str;
        this.f16561b = str2;
        this.f16562c = str3;
    }
}
