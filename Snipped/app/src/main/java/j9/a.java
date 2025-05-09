package J9;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: CollectionUtils.java */
/* loaded from: classes2.dex */
public final class a {
    public static ConcurrentHashMap a(Map map) {
        if (map != null) {
            return new ConcurrentHashMap(map);
        }
        return null;
    }
}
