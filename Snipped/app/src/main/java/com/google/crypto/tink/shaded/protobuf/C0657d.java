package com.google.crypto.tink.shaded.protobuf;

/* compiled from: Android.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f10204a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f10205b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f10204a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f10205b = cls2 != null;
    }

    public static boolean a() {
        return (f10204a == null || f10205b) ? false : true;
    }
}
