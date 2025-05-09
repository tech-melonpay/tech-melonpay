package R8;

import O9.p;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;

/* compiled from: ViewPager2Attacher.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0635a<p> f3312a;

    public b(InterfaceC0635a<p> interfaceC0635a) {
        this.f3312a = interfaceC0635a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onChanged() {
        super.onChanged();
        this.f3312a.invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onItemRangeChanged(int i, int i9) {
        super.onItemRangeChanged(i, i9);
        this.f3312a.invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onItemRangeInserted(int i, int i9) {
        super.onItemRangeInserted(i, i9);
        this.f3312a.invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onItemRangeMoved(int i, int i9, int i10) {
        super.onItemRangeMoved(i, i9, i10);
        this.f3312a.invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onItemRangeRemoved(int i, int i9) {
        super.onItemRangeRemoved(i, i9);
        this.f3312a.invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onItemRangeChanged(int i, int i9, Object obj) {
        super.onItemRangeChanged(i, i9, obj);
        this.f3312a.invoke();
    }
}
