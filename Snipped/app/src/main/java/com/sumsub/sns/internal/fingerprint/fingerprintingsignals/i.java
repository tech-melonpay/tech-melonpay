package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class i extends v<String> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17050b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17051c = new v.a(StabilityLevel.OPTIMAL);

    /* renamed from: a, reason: collision with root package name */
    public final String f17052a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return i.f17051c;
        }

        public a() {
        }
    }

    public i(String str) {
        super(null);
        this.f17052a = str;
    }

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v
    public Map<String, String> d() {
        return com.google.android.gms.measurement.internal.a.n("battery_health", f());
    }

    public String f() {
        return this.f17052a;
    }
}
