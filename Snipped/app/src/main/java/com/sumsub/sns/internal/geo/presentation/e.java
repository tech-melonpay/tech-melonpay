package com.sumsub.sns.internal.geo.presentation;

import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class e implements a.l {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f17520a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f17521b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f17522c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f17523d;

    public static final class a extends e {

        /* renamed from: e, reason: collision with root package name */
        public final g.a f17524e;

        public a(CharSequence charSequence, CharSequence charSequence2, g.a aVar, CharSequence charSequence3, CharSequence charSequence4) {
            super(charSequence, charSequence2, charSequence3, charSequence4, null);
            this.f17524e = aVar;
        }
    }

    public static final class b extends e {

        /* renamed from: e, reason: collision with root package name */
        public final String f17525e;

        /* renamed from: f, reason: collision with root package name */
        public final CharSequence f17526f;

        public b(CharSequence charSequence, CharSequence charSequence2, String str, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
            super(charSequence, charSequence2, charSequence4, charSequence5, null);
            this.f17525e = str;
            this.f17526f = charSequence3;
        }

        public final CharSequence e() {
            return this.f17526f;
        }

        public final String f() {
            return this.f17525e;
        }
    }

    public static final class c extends e {

        /* renamed from: e, reason: collision with root package name */
        public static final c f17527e = new c();

        public c() {
            super(null, null, null, null, 15, null);
        }
    }

    public static final class d extends e {

        /* renamed from: e, reason: collision with root package name */
        public final List<FormItem> f17528e;

        /* renamed from: f, reason: collision with root package name */
        public final String f17529f;

        /* renamed from: g, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.model.e f17530g;

        /* JADX WARN: Multi-variable type inference failed */
        public d(CharSequence charSequence, CharSequence charSequence2, List<? extends FormItem> list, String str, com.sumsub.sns.internal.core.data.model.e eVar, CharSequence charSequence3, CharSequence charSequence4) {
            super(charSequence, charSequence2, charSequence3, charSequence4, null);
            this.f17528e = list;
            this.f17529f = str;
            this.f17530g = eVar;
        }

        public final List<FormItem> g() {
            return this.f17528e;
        }
    }

    /* renamed from: com.sumsub.sns.internal.geo.presentation.e$e, reason: collision with other inner class name */
    public static final class C0265e extends e {

        /* renamed from: e, reason: collision with root package name */
        public static final C0265e f17531e = new C0265e();

        public C0265e() {
            super(null, null, null, null, null);
        }
    }

    public static final class f extends e {

        /* renamed from: e, reason: collision with root package name */
        public final String f17532e;

        /* renamed from: f, reason: collision with root package name */
        public final CharSequence f17533f;

        public f(CharSequence charSequence, CharSequence charSequence2, String str, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
            super(charSequence, charSequence2, charSequence4, charSequence5, null);
            this.f17532e = str;
            this.f17533f = charSequence3;
        }

        public final CharSequence e() {
            return this.f17533f;
        }

        public final String f() {
            return this.f17532e;
        }
    }

    public static final class g extends e {

        /* renamed from: e, reason: collision with root package name */
        public final String f17534e;

        public g(CharSequence charSequence, CharSequence charSequence2, String str, CharSequence charSequence3, CharSequence charSequence4) {
            super(charSequence, charSequence2, charSequence3, charSequence4, null);
            this.f17534e = str;
        }

        public final String e() {
            return this.f17534e;
        }
    }

    public /* synthetic */ e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, charSequence2, charSequence3, charSequence4);
    }

    public final CharSequence a() {
        return this.f17522c;
    }

    public final CharSequence b() {
        return this.f17523d;
    }

    public final CharSequence c() {
        return this.f17521b;
    }

    public final CharSequence d() {
        return this.f17520a;
    }

    public e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        this.f17520a = charSequence;
        this.f17521b = charSequence2;
        this.f17522c = charSequence3;
        this.f17523d = charSequence4;
    }

    public /* synthetic */ e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? null : charSequence4, null);
    }
}
