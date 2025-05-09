package com.bumptech.glide.util.pool;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class GlideTrace {
    private static final AtomicInteger COOKIE_CREATOR = null;
    private static final int MAX_LENGTH = 127;
    private static final boolean TRACING_ENABLED = false;

    private GlideTrace() {
    }

    public static int beginSectionAsync(String str) {
        return -1;
    }

    public static void beginSectionFormat(String str, Object obj) {
    }

    private static String truncateTag(String str) {
        return str.length() > 127 ? str.substring(0, 126) : str;
    }

    public static void beginSectionFormat(String str, Object obj, Object obj2) {
    }

    public static void beginSectionFormat(String str, Object obj, Object obj2, Object obj3) {
    }

    public static void endSection() {
    }

    public static void beginSection(String str) {
    }

    public static void endSectionAsync(String str, int i) {
    }
}
