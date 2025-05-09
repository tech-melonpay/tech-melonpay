package io.sentry;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: SentryEnvelopeItemHeader.java */
/* loaded from: classes2.dex */
public final class h0 implements F {

    /* renamed from: a, reason: collision with root package name */
    public final String f22009a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22010b;

    /* renamed from: c, reason: collision with root package name */
    public final SentryItemType f22011c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22012d;

    /* renamed from: e, reason: collision with root package name */
    public final Callable<Integer> f22013e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22014f;

    /* renamed from: g, reason: collision with root package name */
    public Map<String, Object> f22015g;

    /* compiled from: SentryEnvelopeItemHeader.java */
    public static final class a implements A<h0> {
        @Override // io.sentry.A
        public final h0 a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            SentryItemType sentryItemType = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            HashMap hashMap = null;
            int i = 0;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "length":
                        i = d10.T();
                        break;
                    case "filename":
                        str2 = d10.s0();
                        break;
                    case "attachment_type":
                        str3 = d10.s0();
                        break;
                    case "type":
                        if (d10.v0() != JsonToken.NULL) {
                            sentryItemType = SentryItemType.valueOfLabel(d10.r0().toLowerCase(Locale.ROOT));
                            break;
                        } else {
                            d10.n0();
                            sentryItemType = null;
                            break;
                        }
                    case "content_type":
                        str = d10.s0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        d10.t0(interfaceC0859q, hashMap, g02);
                        break;
                }
            }
            if (sentryItemType == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                interfaceC0859q.f(SentryLevel.ERROR, "Missing required field \"type\"", illegalStateException);
                throw illegalStateException;
            }
            h0 h0Var = new h0(sentryItemType, i, str, str2, str3);
            h0Var.f22015g = hashMap;
            d10.A();
            return h0Var;
        }
    }

    public h0() {
        throw null;
    }

    public h0(SentryItemType sentryItemType, int i, String str, String str2, String str3) {
        this.f22011c = sentryItemType;
        this.f22009a = str;
        this.f22012d = i;
        this.f22010b = str2;
        this.f22013e = null;
        this.f22014f = str3;
    }

    public final int a() {
        Callable<Integer> callable = this.f22013e;
        if (callable == null) {
            return this.f22012d;
        }
        try {
            return callable.call().intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        String str = this.f22009a;
        if (str != null) {
            e10.P(FirebaseAnalytics.Param.CONTENT_TYPE);
            e10.H(str);
        }
        String str2 = this.f22010b;
        if (str2 != null) {
            e10.P("filename");
            e10.H(str2);
        }
        e10.P("type");
        e10.Q(interfaceC0859q, this.f22011c);
        String str3 = this.f22014f;
        if (str3 != null) {
            e10.P("attachment_type");
            e10.H(str3);
        }
        e10.P("length");
        long a10 = a();
        e10.N();
        e10.d();
        e10.f2730a.write(Long.toString(a10));
        Map<String, Object> map = this.f22015g;
        if (map != null) {
            for (String str4 : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f22015g, str4, e10, str4, interfaceC0859q);
            }
        }
        e10.p();
    }

    public h0(SentryItemType sentryItemType, Callable<Integer> callable, String str, String str2, String str3) {
        D9.b.t0(sentryItemType, "type is required");
        this.f22011c = sentryItemType;
        this.f22009a = str;
        this.f22012d = -1;
        this.f22010b = str2;
        this.f22013e = callable;
        this.f22014f = str3;
    }
}
