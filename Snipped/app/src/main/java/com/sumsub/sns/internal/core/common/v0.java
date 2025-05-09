package com.sumsub.sns.internal.core.common;

import androidx.lifecycle.G;

/* loaded from: classes2.dex */
public final class v0 {
    public static final <T> com.sumsub.sns.internal.core.presentation.screen.base.a<T> a(G g10, String str) {
        Object b9 = g10.b(str);
        if (b9 != null) {
            return new com.sumsub.sns.internal.core.presentation.screen.base.a<>(g10, str, b9);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
