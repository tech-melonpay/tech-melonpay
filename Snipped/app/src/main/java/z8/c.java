package Z8;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

/* compiled from: CommonMarkEntities.java */
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, String> f4243a;

    static {
        Map<String, String> map;
        try {
            Field declaredField = Pa.b.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th) {
            Map<String, String> emptyMap = Collections.emptyMap();
            th.printStackTrace();
            map = emptyMap;
        }
        f4243a = map;
    }
}
