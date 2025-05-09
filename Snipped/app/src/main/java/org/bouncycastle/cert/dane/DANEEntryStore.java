package org.bouncycastle.cert.dane;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

/* loaded from: classes2.dex */
public class DANEEntryStore implements Store {
    private final Map entries;

    public DANEEntryStore(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DANEEntry dANEEntry = (DANEEntry) it.next();
            hashMap.put(dANEEntry.getDomainName(), dANEEntry);
        }
        this.entries = Collections.unmodifiableMap(hashMap);
    }

    @Override // org.bouncycastle.util.Store
    public Collection getMatches(Selector selector) {
        if (selector == null) {
            return this.entries.values();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.entries.values()) {
            if (selector.match(obj)) {
                arrayList.add(obj);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Store toCertificateStore() {
        Collection matches = getMatches(null);
        ArrayList arrayList = new ArrayList(matches.size());
        Iterator it = matches.iterator();
        while (it.hasNext()) {
            arrayList.add(((DANEEntry) it.next()).getCertificate());
        }
        return new CollectionStore(arrayList);
    }
}
