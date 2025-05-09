package D9;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: EnvironmentVariablePropertiesProvider.java */
/* loaded from: classes2.dex */
public final class d implements e {
    public static String a(String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // D9.e
    public final Map l() {
        String b9;
        String str = a("tags") + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str) && (b9 = J9.e.b(entry.getValue())) != null) {
                concurrentHashMap.put(key.substring(str.length()).toLowerCase(Locale.ROOT), b9);
            }
        }
        return concurrentHashMap;
    }

    @Override // D9.e
    public final String m(String str) {
        return J9.e.b(System.getenv(a(str)));
    }
}
