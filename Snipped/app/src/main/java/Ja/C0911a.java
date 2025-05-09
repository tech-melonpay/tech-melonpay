package ja;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequencesJVM.kt */
/* renamed from: ja.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0911a<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<h<T>> f22556a;

    public C0911a(h<? extends T> hVar) {
        this.f22556a = new AtomicReference<>(hVar);
    }

    @Override // ja.h
    public final Iterator<T> iterator() {
        h<T> andSet = this.f22556a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
