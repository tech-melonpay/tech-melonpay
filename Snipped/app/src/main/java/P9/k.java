package P9;

import ca.InterfaceC0650p;
import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public final class k implements ja.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3161b;

    public /* synthetic */ k(Object obj, int i) {
        this.f3160a = i;
        this.f3161b = obj;
    }

    @Override // ja.h
    public final Iterator iterator() {
        switch (this.f3160a) {
            case 0:
                return new v((Object[]) this.f3161b, 2);
            case 1:
                return ((Iterable) this.f3161b).iterator();
            default:
                return ja.k.a((InterfaceC0650p) this.f3161b);
        }
    }
}
