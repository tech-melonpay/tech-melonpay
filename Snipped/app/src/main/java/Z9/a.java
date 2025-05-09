package Z9;

/* compiled from: JDK8PlatformImplementations.kt */
/* loaded from: classes2.dex */
public final class a extends Y9.a {

    /* compiled from: JDK8PlatformImplementations.kt */
    /* renamed from: Z9.a$a, reason: collision with other inner class name */
    public static final class C0054a {

        /* renamed from: a, reason: collision with root package name */
        public static final Integer f4244a;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f4244a = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f4244a = num2;
        }
    }
}
