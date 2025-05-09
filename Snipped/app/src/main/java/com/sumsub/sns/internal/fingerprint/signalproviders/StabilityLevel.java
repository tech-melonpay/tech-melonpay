package com.sumsub.sns.internal.fingerprint.signalproviders;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;", "", "(Ljava/lang/String;I)V", "atLeastAsStableAs", "", "other", "atLeastAsStableAs$idensic_mobile_sdk_aar_release", "STABLE", "OPTIMAL", "UNIQUE", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public enum StabilityLevel {
    STABLE,
    OPTIMAL,
    UNIQUE;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17358a;

        static {
            int[] iArr = new int[StabilityLevel.values().length];
            iArr[StabilityLevel.STABLE.ordinal()] = 1;
            iArr[StabilityLevel.OPTIMAL.ordinal()] = 2;
            iArr[StabilityLevel.UNIQUE.ordinal()] = 3;
            f17358a = iArr;
        }
    }

    public final boolean atLeastAsStableAs$idensic_mobile_sdk_aar_release(StabilityLevel other) {
        int[] iArr = a.f17358a;
        int i = iArr[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            int i9 = iArr[other.ordinal()];
            if (i9 != 1) {
                if (i9 == 2 || i9 == 3) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i10 = iArr[other.ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }
}
