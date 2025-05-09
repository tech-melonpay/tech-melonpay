package ja;

import P9.q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1;

/* compiled from: _Sequences.kt */
/* loaded from: classes2.dex */
public final class m implements h<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h<Object> f22586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator<Object> f22587b;

    public m(P9.k kVar, DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1 debugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1) {
        this.f22586a = kVar;
        this.f22587b = debugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1;
    }

    @Override // ja.h
    public final Iterator<Object> iterator() {
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = this.f22586a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        q.D(arrayList, this.f22587b);
        return arrayList.iterator();
    }
}
