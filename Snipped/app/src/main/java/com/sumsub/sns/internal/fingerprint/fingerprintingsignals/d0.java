package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class d0 extends v<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17022b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17023c = new v.a(StabilityLevel.OPTIMAL);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17024a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return d0.f17023c;
        }

        public a() {
        }
    }

    public d0(boolean z10) {
        super(null);
        this.f17024a = z10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v
    public Map<String, String> d() {
        return com.google.android.gms.measurement.internal.a.n("is_pin_security_enabled", String.valueOf(f().booleanValue()));
    }

    public Boolean f() {
        return Boolean.valueOf(this.f17024a);
    }
}
