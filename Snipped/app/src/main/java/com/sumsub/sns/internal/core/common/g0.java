package com.sumsub.sns.internal.core.common;

import java.net.URL;

/* loaded from: classes2.dex */
public final class g0 {
    public static final boolean b(String str) {
        return str != null && str.length() >= 5;
    }

    public static final boolean c(String str) {
        try {
            new URL(str).toURI();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
