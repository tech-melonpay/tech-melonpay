package androidx.paging;

import java.util.Collections;
import java.util.List;

/* compiled from: PageResult.java */
/* loaded from: classes.dex */
public final class d<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final d f7349e;

    /* renamed from: a, reason: collision with root package name */
    public final List<T> f7350a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7351b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7352c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7353d;

    /* compiled from: PageResult.java */
    public static abstract class a<T> {
    }

    static {
        Collections.emptyList();
        f7349e = new d(Collections.emptyList(), 0);
    }

    public d(List<T> list, int i, int i9, int i10) {
        this.f7350a = list;
        this.f7351b = i;
        this.f7352c = i9;
        this.f7353d = i10;
    }

    public final String toString() {
        return "Result " + this.f7351b + ", " + this.f7350a + ", " + this.f7352c + ", offset " + this.f7353d;
    }

    public d(List<T> list, int i) {
        this.f7350a = list;
        this.f7351b = 0;
        this.f7352c = 0;
        this.f7353d = i;
    }
}
