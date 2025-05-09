package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class e extends v<String> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17025b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17026c = new v.a(StabilityLevel.OPTIMAL);

    /* renamed from: a, reason: collision with root package name */
    public final String f17027a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return e.f17026c;
        }

        public a() {
        }
    }

    public e(String str) {
        super(null);
        this.f17027a = str;
    }

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v
    public Map<String, String> d() {
        return com.google.android.gms.measurement.internal.a.n("android_version", f());
    }

    public String f() {
        return this.f17027a;
    }
}
