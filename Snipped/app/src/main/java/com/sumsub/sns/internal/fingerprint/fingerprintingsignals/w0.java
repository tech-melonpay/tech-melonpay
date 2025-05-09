package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class w0 extends v<Long> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17130b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17131c = new v.a(StabilityLevel.STABLE);

    /* renamed from: a, reason: collision with root package name */
    public final long f17132a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return w0.f17131c;
        }

        public a() {
        }
    }

    public w0(long j10) {
        super(null);
        this.f17132a = j10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v
    public Map<String, String> d() {
        return com.google.android.gms.measurement.internal.a.n("total_ram", String.valueOf(f().longValue()));
    }

    public Long f() {
        return Long.valueOf(this.f17132a);
    }
}
