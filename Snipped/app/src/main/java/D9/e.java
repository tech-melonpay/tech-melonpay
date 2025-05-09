package D9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PropertiesProvider.java */
/* loaded from: classes2.dex */
public interface e {
    Map l();

    String m(String str);

    default Boolean n(String str) {
        String m2 = m(str);
        if (m2 != null) {
            return Boolean.valueOf(m2);
        }
        return null;
    }

    default Long o() {
        String m2 = m("idle-timeout");
        if (m2 != null) {
            try {
                return Long.valueOf(m2);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    default List<String> p(String str) {
        String m2 = m(str);
        return m2 != null ? Arrays.asList(m2.split(",")) : Collections.emptyList();
    }

    default String q() {
        String m2 = m("proxy.port");
        return m2 != null ? m2 : "80";
    }
}
