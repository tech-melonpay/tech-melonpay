package P9;

import java.util.AbstractCollection;
import java.util.Collection;

/* compiled from: AbstractMutableCollection.kt */
/* renamed from: P9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0501c<E> extends AbstractCollection<E> implements Collection<E>, da.b {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
