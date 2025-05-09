package com.sumsub.sns.internal.presentation.screen.verification;

import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.presentation.base.adapter.f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class d implements a.l {

    /* renamed from: f, reason: collision with root package name */
    public static final a f18970f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f18971a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f18972b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f18973c;

    /* renamed from: d, reason: collision with root package name */
    public List<? extends com.sumsub.sns.internal.core.presentation.base.adapter.a> f18974d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f18975e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return new c();
        }

        public a() {
        }
    }

    public static final class b extends d {
        public b(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, List<? extends com.sumsub.sns.internal.core.presentation.base.adapter.a> list, CharSequence charSequence4) {
            super(charSequence, charSequence2, charSequence3, list, charSequence4, null);
        }
    }

    public static final class c extends d {
        public c() {
            super(null, null, null, EmptyList.f23104a, null, null);
        }
    }

    /* renamed from: com.sumsub.sns.internal.presentation.screen.verification.d$d, reason: collision with other inner class name */
    public static final class C0347d extends d {
        public C0347d(f fVar, CharSequence charSequence) {
            super(null, null, charSequence, Collections.singletonList(fVar), null, null);
        }
    }

    public static final class e extends d {

        /* renamed from: g, reason: collision with root package name */
        public final Map<String, Object> f18976g;

        /* renamed from: h, reason: collision with root package name */
        public final com.sumsub.sns.internal.presentation.screen.verification.a f18977h;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public e(java.util.Map<java.lang.String, ? extends java.lang.Object> r8, java.lang.CharSequence r9, java.lang.CharSequence r10, com.sumsub.sns.internal.presentation.screen.verification.a r11) {
            /*
                r7 = this;
                kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.f23104a
                r2 = 0
                r6 = 0
                r1 = 0
                r0 = r7
                r3 = r9
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r7.f18976g = r8
                r7.f18977h = r11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.verification.d.e.<init>(java.util.Map, java.lang.CharSequence, java.lang.CharSequence, com.sumsub.sns.internal.presentation.screen.verification.a):void");
        }

        public final Map<String, Object> f() {
            return this.f18976g;
        }

        public final com.sumsub.sns.internal.presentation.screen.verification.a g() {
            return this.f18977h;
        }
    }

    public /* synthetic */ d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, List list, CharSequence charSequence4, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, charSequence2, charSequence3, list, charSequence4);
    }

    public final void a(List<? extends com.sumsub.sns.internal.core.presentation.base.adapter.a> list) {
        this.f18974d = list;
    }

    public final List<com.sumsub.sns.internal.core.presentation.base.adapter.a> b() {
        return this.f18974d;
    }

    public final CharSequence c() {
        return this.f18973c;
    }

    public final CharSequence d() {
        return this.f18972b;
    }

    public final CharSequence e() {
        return this.f18971a;
    }

    public d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, List<? extends com.sumsub.sns.internal.core.presentation.base.adapter.a> list, CharSequence charSequence4) {
        this.f18971a = charSequence;
        this.f18972b = charSequence2;
        this.f18973c = charSequence3;
        this.f18974d = list;
        this.f18975e = charSequence4;
    }

    public final CharSequence a() {
        return this.f18975e;
    }
}
