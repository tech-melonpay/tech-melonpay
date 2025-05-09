package S0;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: ViewModelImpl.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Ja.a f3329a = new Ja.a();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3330b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f3331c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f3332d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}
