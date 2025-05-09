package y0;

import ca.InterfaceC0646l;
import da.InterfaceC0701a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewGroup.kt */
/* loaded from: classes.dex */
public final class v<T> implements Iterator<T>, InterfaceC0701a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0646l<T, Iterator<T>> f31095a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f31096b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Iterator<? extends T> f31097c;

    public v(P9.v vVar, InterfaceC0646l interfaceC0646l) {
        this.f31095a = interfaceC0646l;
        this.f31097c = vVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31097c.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        T next = this.f31097c.next();
        Iterator<T> invoke = this.f31095a.invoke(next);
        ArrayList arrayList = this.f31096b;
        if (invoke == null || !invoke.hasNext()) {
            while (!this.f31097c.hasNext() && (!arrayList.isEmpty())) {
                this.f31097c = (Iterator) P9.s.Q(arrayList);
                P9.q.B(arrayList);
            }
        } else {
            arrayList.add(this.f31097c);
            this.f31097c = invoke;
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
