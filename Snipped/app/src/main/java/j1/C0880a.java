package j1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace.java */
/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0880a {

    /* renamed from: a, reason: collision with root package name */
    public static long f22407a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f22408b;

    public static void a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C0881b.a();
        }
        try {
            if (f22408b == null) {
                f22407a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f22408b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f22408b.invoke(null, Long.valueOf(f22407a))).booleanValue();
        } catch (Exception e10) {
            if (!(e10 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
                return false;
            }
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
