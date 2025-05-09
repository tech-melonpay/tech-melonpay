package W1;

import C.N;
import com.futuremind.recyclerviewfastscroll.FastScroller;

/* compiled from: ScrollerViewProvider.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public FastScroller f3795a;

    /* renamed from: b, reason: collision with root package name */
    public N f3796b;

    public final N a() {
        if (this.f3796b == null) {
            this.f3796b = new N(new d(((a) this).f3793c, 1.0f, 1.0f), 8);
        }
        return this.f3796b;
    }

    public final N b() {
        return null;
    }
}
