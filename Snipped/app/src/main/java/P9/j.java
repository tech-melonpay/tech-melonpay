package P9;

import ca.InterfaceC0635a;
import da.InterfaceC0701a;
import java.util.Iterator;

/* compiled from: Iterables.kt */
/* loaded from: classes2.dex */
public final class j implements Iterable, InterfaceC0701a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3158a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3159b;

    public /* synthetic */ j(Object obj, int i) {
        this.f3158a = i;
        this.f3159b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3158a) {
            case 0:
                return new v((Object[]) this.f3159b, 2);
            case 1:
                return new v((Iterator) ((InterfaceC0635a) this.f3159b).invoke(), 0);
            case 2:
                return ((ja.h) this.f3159b).iterator();
            default:
                return new v((pa.f) this.f3159b);
        }
    }
}
