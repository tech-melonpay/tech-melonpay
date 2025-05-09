package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class l extends v<Integer> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17066b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17067c = new v.a(StabilityLevel.STABLE);

    /* renamed from: a, reason: collision with root package name */
    public final int f17068a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return l.f17067c;
        }

        public a() {
        }
    }

    public l(int i) {
        super(null);
        this.f17068a = i;
    }

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v
    public Map<String, String> d() {
        return com.google.android.gms.measurement.internal.a.n("cores_count", String.valueOf(f().intValue()));
    }

    public Integer f() {
        return Integer.valueOf(this.f17068a);
    }
}
