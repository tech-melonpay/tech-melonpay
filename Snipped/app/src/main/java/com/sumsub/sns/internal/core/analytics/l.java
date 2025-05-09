package com.sumsub.sns.internal.core.analytics;

/* loaded from: classes2.dex */
public interface l {
    static /* synthetic */ void a(l lVar, boolean z10, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: send");
        }
        if ((i & 1) != 0) {
            z10 = false;
        }
        lVar.a(z10);
    }

    void a(boolean z10);
}
