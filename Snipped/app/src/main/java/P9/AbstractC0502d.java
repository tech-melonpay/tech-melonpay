package P9;

import java.util.AbstractList;
import java.util.List;

/* compiled from: AbstractMutableList.kt */
/* renamed from: P9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0502d<E> extends AbstractList<E> implements List<E>, da.b {
    public abstract int a();

    public abstract E c(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return c(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
