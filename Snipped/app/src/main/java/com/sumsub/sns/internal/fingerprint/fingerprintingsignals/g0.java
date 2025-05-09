package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class g0 extends v<String> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17041b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17042c = new v.a(StabilityLevel.STABLE);

    /* renamed from: a, reason: collision with root package name */
    public final String f17043a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return g0.f17042c;
        }

        public a() {
        }
    }

    public g0(String str) {
        super(null);
        this.f17043a = str;
    }

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v
    public Map<String, String> d() {
        return com.google.android.gms.measurement.internal.a.n("model_name", f());
    }

    public String f() {
        return this.f17043a;
    }
}
