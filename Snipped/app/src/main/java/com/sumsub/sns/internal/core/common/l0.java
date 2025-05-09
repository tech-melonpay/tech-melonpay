package com.sumsub.sns.internal.core.common;

import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
public interface l0 {
    static /* synthetic */ void a(l0 l0Var, q qVar, Long l10, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishFragment");
        }
        if ((i & 2) != 0) {
            l10 = null;
        }
        l0Var.a(qVar, l10);
    }

    void a(Fragment fragment, String str);

    void a(q qVar, Long l10);
}
