package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class t extends v<String> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17114b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17115c = new v.a(StabilityLevel.OPTIMAL);

    /* renamed from: a, reason: collision with root package name */
    public final String f17116a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return t.f17115c;
        }

        public a() {
        }
    }

    public t(String str) {
        super(null);
        this.f17116a = str;
    }

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v
    public Map<String, String> d() {
        return com.google.android.gms.measurement.internal.a.n("fingerprint_sensor_status", f());
    }

    public String f() {
        return this.f17116a;
    }
}
