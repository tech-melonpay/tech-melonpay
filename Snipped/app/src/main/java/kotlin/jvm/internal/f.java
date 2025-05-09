package kotlin.jvm.internal;

import java.util.Arrays;

/* compiled from: Intrinsics.java */
/* loaded from: classes2.dex */
public final class f {

    /* compiled from: Intrinsics.java */
    public static class a {
    }

    public static boolean a(Double d10) {
        return d10 != null && d10.doubleValue() == 0.0d;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int c(int i, int i9) {
        if (i < i9) {
            return -1;
        }
        return i == i9 ? 0 : 1;
    }

    public static void d(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i9 = 0; i9 < length; i9++) {
            if (str.equals(stackTrace[i9].getClassName())) {
                i = i9;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void e() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
