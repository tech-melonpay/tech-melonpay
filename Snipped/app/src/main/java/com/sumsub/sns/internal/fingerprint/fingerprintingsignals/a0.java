package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a0 extends v<String> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17004b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17005c = new v.a(StabilityLevel.UNIQUE);

    /* renamed from: a, reason: collision with root package name */
    public final String f17006a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return a0.f17005c;
        }

        public a() {
        }
    }

    public a0(String str) {
        super(null);
        this.f17006a = str;
    }

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v
    public Map<String, String> d() {
        return com.google.android.gms.measurement.internal.a.n("http_proxy", f());
    }

    public String f() {
        return this.f17006a;
    }
}
