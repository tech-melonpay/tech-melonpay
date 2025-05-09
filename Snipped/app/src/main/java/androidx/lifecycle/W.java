package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: ViewModelStore.kt */
/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7060a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f7060a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((Q) it.next()).clear$lifecycle_viewmodel_release();
        }
        linkedHashMap.clear();
    }
}
