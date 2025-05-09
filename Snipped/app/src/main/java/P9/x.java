package P9;

import da.InterfaceC0701a;
import java.util.Iterator;

/* compiled from: PrimitiveIterators.kt */
/* loaded from: classes2.dex */
public abstract class x implements Iterator<Long>, InterfaceC0701a {
    public abstract long a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
