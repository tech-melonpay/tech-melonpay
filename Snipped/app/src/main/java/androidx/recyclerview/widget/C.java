package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0565c;
import androidx.recyclerview.widget.C0567e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C;
import java.util.concurrent.Executors;

/* compiled from: ListAdapter.java */
/* loaded from: classes.dex */
public abstract class C<T, VH extends RecyclerView.C> extends RecyclerView.Adapter<VH> {

    /* renamed from: d, reason: collision with root package name */
    public final C0567e<T> f7410d;

    /* compiled from: ListAdapter.java */
    public class a implements C0567e.a<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.C0567e.a
        public final void a() {
            C.this.getClass();
        }
    }

    public C(S1.n nVar) {
        a aVar = new a();
        C0564b c0564b = new C0564b(this);
        synchronized (C0565c.a.f7616a) {
            try {
                if (C0565c.a.f7617b == null) {
                    C0565c.a.f7617b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0567e<T> c0567e = new C0567e<>(c0564b, new C0565c(null, C0565c.a.f7617b, nVar));
        this.f7410d = c0567e;
        c0567e.f7630d.add(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f7410d.f7632f.size();
    }
}
