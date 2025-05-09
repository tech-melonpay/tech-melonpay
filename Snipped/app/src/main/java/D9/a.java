package D9;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* compiled from: AbstractPropertiesProvider.java */
/* loaded from: classes2.dex */
public abstract class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f980a;

    /* renamed from: b, reason: collision with root package name */
    public final Properties f981b;

    public a(String str, Properties properties) {
        this.f980a = str;
        b.t0(properties, "properties are required");
        this.f981b = properties;
    }

    @Override // D9.e
    public final Map l() {
        String n10 = androidx.camera.core.impl.utils.a.n(new StringBuilder(), this.f980a, "tags.");
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f981b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(n10)) {
                    hashMap.put(str.substring(n10.length()), J9.e.b((String) entry.getValue()));
                }
            }
        }
        return hashMap;
    }

    @Override // D9.e
    public final String m(String str) {
        return J9.e.b(this.f981b.getProperty(androidx.camera.core.impl.utils.a.n(new StringBuilder(), this.f980a, str)));
    }
}
