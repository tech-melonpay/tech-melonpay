package X9;

import java.lang.reflect.Method;
import kotlin.jvm.internal.f;

/* compiled from: PlatformImplementations.kt */
/* loaded from: classes2.dex */
public class a {

    /* compiled from: PlatformImplementations.kt */
    /* renamed from: X9.a$a, reason: collision with other inner class name */
    public static final class C0048a {

        /* renamed from: a, reason: collision with root package name */
        public static final Method f4062a;

        static {
            Method method;
            Method[] methods = Throwable.class.getMethods();
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                if (f.b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    if (f.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        method = method2;
                        break;
                    }
                }
                i++;
            }
            f4062a = method;
            int length2 = methods.length;
            for (int i9 = 0; i9 < length2 && !f.b(methods[i9].getName(), "getSuppressed"); i9++) {
            }
        }
    }

    public void a(Throwable th, Throwable th2) {
        Method method = C0048a.f4062a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
