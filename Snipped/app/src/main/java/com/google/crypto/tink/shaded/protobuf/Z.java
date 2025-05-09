package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0670q;
import java.util.Iterator;
import java.util.Map;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes.dex */
public final class Z extends a0<Object, Object> {
    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void g() {
        if (!this.f10190d) {
            for (int i = 0; i < this.f10188b.size(); i++) {
                ((C0670q.a) d(i).getKey()).getClass();
            }
            Iterator<Map.Entry<Object, Object>> it = e().iterator();
            while (it.hasNext()) {
                ((C0670q.a) it.next().getKey()).getClass();
            }
        }
        super.g();
    }
}
