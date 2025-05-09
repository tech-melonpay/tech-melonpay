package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class f extends v<List<? extends com.sumsub.sns.internal.fingerprint.infoproviders.d0>> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17031b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17032c = new v.a(StabilityLevel.UNIQUE);

    /* renamed from: a, reason: collision with root package name */
    public final List<com.sumsub.sns.internal.fingerprint.infoproviders.d0> f17033a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return f.f17032c;
        }

        public a() {
        }
    }

    public f(List<com.sumsub.sns.internal.fingerprint.infoproviders.d0> list) {
        super(null);
        this.f17033a = list;
    }

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v
    public Map<String, String> d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : f()) {
            int i9 = i + 1;
            if (i < 0) {
                P9.m.t();
                throw null;
            }
            linkedHashMap.put(com.google.android.gms.measurement.internal.a.g(i, "application."), ((com.sumsub.sns.internal.fingerprint.infoproviders.d0) obj).b());
            i = i9;
        }
        return linkedHashMap;
    }

    public List<com.sumsub.sns.internal.fingerprint.infoproviders.d0> f() {
        return this.f17033a;
    }
}
