package androidx.paging;

import java.util.AbstractList;

/* compiled from: PagedList.java */
/* loaded from: classes.dex */
public abstract class e<T> extends AbstractList<T> {

    /* compiled from: PagedList.java */
    public static abstract class a {
        public abstract void onChanged(int i, int i9);

        public abstract void onInserted(int i, int i9);

        public abstract void onRemoved(int i, int i9);
    }

    /* compiled from: PagedList.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f7354a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7355b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7356c;

        public b(int i, int i9, int i10) {
            this.f7354a = i;
            this.f7355b = i9;
            this.f7356c = i10;
        }
    }

    public abstract boolean a();

    public abstract boolean b();
}
