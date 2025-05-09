package com.sumsub.sentry;

import ka.C0956a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sa.AbstractC1244a;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final a f13805c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final y f13806a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f13807b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a(z zVar) {
            AbstractC1244a a10 = com.sumsub.sns.internal.core.common.x.a(false, 1, null);
            byte[] bytes = a10.b(j3.e.B(a10.f27066b, kotlin.jvm.internal.h.d(z.class)), zVar).getBytes(C0956a.f23054b);
            return new x(new y("application/json", null, SentryItemType.Event, null, bytes.length), bytes);
        }

        public a() {
        }
    }

    public x(y yVar, byte[] bArr) {
        this.f13806a = yVar;
        this.f13807b = bArr;
    }

    public final byte[] a() {
        return this.f13807b;
    }

    public final y b() {
        return this.f13806a;
    }
}
