package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class v0 extends v<Long> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17127b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17128c = new v.a(StabilityLevel.STABLE);

    /* renamed from: a, reason: collision with root package name */
    public final long f17129a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return v0.f17128c;
        }

        public a() {
        }
    }

    public v0(long j10) {
        super(null);
        this.f17129a = j10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v
    public Map<String, String> d() {
        return com.google.android.gms.measurement.internal.a.n("total_internal_storage", String.valueOf(f().longValue()));
    }

    public Long f() {
        return Long.valueOf(this.f17129a);
    }
}
