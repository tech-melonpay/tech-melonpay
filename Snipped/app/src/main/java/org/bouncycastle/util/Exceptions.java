package org.bouncycastle.util;

/* loaded from: classes3.dex */
public class Exceptions {
    public static IllegalArgumentException illegalArgumentException(String str, Throwable th) {
        return new IllegalArgumentException(str, th);
    }

    public static IllegalStateException illegalStateException(String str, Throwable th) {
        return new IllegalStateException(str, th);
    }
}
