package com.google.firebase.platforminfo;

import O9.e;

/* loaded from: classes.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static String detectVersion() {
        try {
            return e.f3012e.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
