package androidx.paging;

import androidx.paging.e;
import androidx.recyclerview.widget.C0564b;
import androidx.recyclerview.widget.C0565c;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import n.C1058a;

/* compiled from: AsyncPagedListDiffer.java */
/* loaded from: classes.dex */
public class a<T> {
    final C0565c<T> mConfig;
    private boolean mIsContiguous;
    private int mLastAccessIndex;
    b<T> mListener;
    int mMaxScheduledGeneration;
    private e<T> mPagedList;
    private e<T> mSnapshot;
    final D mUpdateCallback;
    Executor mMainThreadExecutor = C1058a.f24057d;
    private e.a mPagedListCallback = new C0078a();

    /* compiled from: AsyncPagedListDiffer.java */
    /* renamed from: androidx.paging.a$a, reason: collision with other inner class name */
    public class C0078a extends e.a {
        public C0078a() {
        }

        @Override // androidx.paging.e.a
        public final void onChanged(int i, int i9) {
            a.this.mUpdateCallback.onChanged(i, i9, null);
        }

        @Override // androidx.paging.e.a
        public final void onInserted(int i, int i9) {
            a.this.mUpdateCallback.onInserted(i, i9);
        }

        @Override // androidx.paging.e.a
        public final void onRemoved(int i, int i9) {
            a.this.mUpdateCallback.onRemoved(i, i9);
        }
    }

    /* compiled from: AsyncPagedListDiffer.java */
    public interface b<T> {
    }

    public a(RecyclerView.Adapter adapter, q.e<T> eVar) {
        this.mUpdateCallback = new C0564b(adapter);
        synchronized (C0565c.a.f7616a) {
            try {
                if (C0565c.a.f7617b == null) {
                    C0565c.a.f7617b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mConfig = new C0565c<>(null, C0565c.a.f7617b, eVar);
    }

    public e<T> getCurrentList() {
        return this.mPagedList;
    }

    public T getItem(int i) {
        throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
    }

    public int getItemCount() {
        return 0;
    }

    public void latchPagedList(e<T> eVar, e<T> eVar2, q.d dVar, int i) {
        throw new IllegalStateException("must be in snapshot state to apply diff");
    }

    public void submitList(e<T> eVar) {
        this.mMaxScheduledGeneration++;
        if (eVar == this.mPagedList) {
            return;
        }
        this.mUpdateCallback.onRemoved(0, getItemCount());
    }

    public a(D d10, C0565c<T> c0565c) {
        this.mUpdateCallback = d10;
        this.mConfig = c0565c;
    }
}
