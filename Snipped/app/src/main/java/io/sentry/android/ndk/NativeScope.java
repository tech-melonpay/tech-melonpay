package io.sentry.android.ndk;

/* loaded from: classes2.dex */
final class NativeScope implements A9.a {
    public static native void nativeAddBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6);

    @Override // A9.a
    public final void a(String str, String str2, String str3, String str4, String str5, String str6) {
        nativeAddBreadcrumb(str, str2, str3, str4, str5, str6);
    }
}
