package com.bumptech.glide.util;

import android.text.TextUtils;
import java.util.Collection;

/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z10) {
        checkArgument(z10, "");
    }

    public static String checkNotEmpty(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    public static <T> T checkNotNull(T t3) {
        return (T) checkNotNull(t3, "Argument must not be null");
    }

    public static void checkArgument(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T checkNotNull(T t3, String str) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(str);
    }

    public static <T extends Collection<Y>, Y> T checkNotEmpty(T t3) {
        if (t3.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t3;
    }
}
