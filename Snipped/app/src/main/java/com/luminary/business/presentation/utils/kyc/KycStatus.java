package com.luminary.business.presentation.utils.kyc;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KycStatus.kt */
/* loaded from: classes2.dex */
public final class KycStatus {

    /* renamed from: a, reason: collision with root package name */
    public static final KycStatus f13329a;

    /* renamed from: b, reason: collision with root package name */
    public static final KycStatus f13330b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KycStatus[] f13331c;

    static {
        KycStatus kycStatus = new KycStatus(FirebaseAnalytics.Param.SUCCESS, 0);
        f13329a = kycStatus;
        KycStatus kycStatus2 = new KycStatus(Constants.IPC_BUNDLE_KEY_SEND_ERROR, 1);
        f13330b = kycStatus2;
        f13331c = new KycStatus[]{kycStatus, kycStatus2, new KycStatus("exist", 2)};
    }

    public KycStatus() {
        throw null;
    }

    public static KycStatus valueOf(String str) {
        return (KycStatus) Enum.valueOf(KycStatus.class, str);
    }

    public static KycStatus[] values() {
        return (KycStatus[]) f13331c.clone();
    }
}
