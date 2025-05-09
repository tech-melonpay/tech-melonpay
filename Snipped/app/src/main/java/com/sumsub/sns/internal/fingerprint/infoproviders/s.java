package com.sumsub.sns.internal.fingerprint.infoproviders;

import ca.InterfaceC0635a;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.c;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import p0.C1098b;

/* loaded from: classes2.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    public final C1098b f17348a;

    public static final class a extends Lambda implements InterfaceC0635a<FingerprintSensorStatus> {
        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FingerprintSensorStatus invoke() {
            return !s.this.f17348a.d() ? FingerprintSensorStatus.NOT_SUPPORTED : !s.this.f17348a.c() ? FingerprintSensorStatus.SUPPORTED : FingerprintSensorStatus.ENABLED;
        }
    }

    public s(C1098b c1098b) {
        this.f17348a = c1098b;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.r
    public FingerprintSensorStatus a() {
        Object a10 = c.a(0L, new a(), 1, null);
        FingerprintSensorStatus fingerprintSensorStatus = FingerprintSensorStatus.UNKNOWN;
        if (a10 instanceof Result.Failure) {
            a10 = fingerprintSensorStatus;
        }
        return (FingerprintSensorStatus) a10;
    }
}
