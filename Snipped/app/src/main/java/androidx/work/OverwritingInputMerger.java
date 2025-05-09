package androidx.work;

import androidx.work.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import s1.AbstractC1196f;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC1196f {
    @Override // s1.AbstractC1196f
    public final b a(ArrayList arrayList) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((b) it.next()).f8128a));
        }
        aVar.a(hashMap);
        b bVar = new b(aVar.f8129a);
        b.b(bVar);
        return bVar;
    }
}
