package Y9;

/* compiled from: JDK7PlatformImplementations.kt */
/* loaded from: classes2.dex */
public class a extends X9.a {

    /* compiled from: JDK7PlatformImplementations.kt */
    /* renamed from: Y9.a$a, reason: collision with other inner class name */
    public static final class C0053a {

        /* renamed from: a, reason: collision with root package name */
        public static final Integer f4155a;

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
                f4155a = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f4155a = num2;
        }
    }

    @Override // X9.a
    public final void a(Throwable th, Throwable th2) {
        Integer num = C0053a.f4155a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
