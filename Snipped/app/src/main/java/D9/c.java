package D9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: CompositePropertiesProvider.java */
/* loaded from: classes2.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final List<e> f983a;

    public c(ArrayList arrayList) {
        this.f983a = arrayList;
    }

    @Override // D9.e
    public final Map l() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator<e> it = this.f983a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(it.next().l());
        }
        return concurrentHashMap;
    }

    @Override // D9.e
    public final String m(String str) {
        Iterator<e> it = this.f983a.iterator();
        while (it.hasNext()) {
            String m2 = it.next().m(str);
            if (m2 != null) {
                return m2;
            }
        }
        return null;
    }
}
