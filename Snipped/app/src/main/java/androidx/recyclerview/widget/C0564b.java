package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdapterListUpdateCallback.java */
/* renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564b implements D {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.Adapter f7612a;

    public C0564b(RecyclerView.Adapter adapter) {
        this.f7612a = adapter;
    }

    @Override // androidx.recyclerview.widget.D
    @SuppressLint({"UnknownNullness"})
    public final void onChanged(int i, int i9, Object obj) {
        this.f7612a.notifyItemRangeChanged(i, i9, obj);
    }

    @Override // androidx.recyclerview.widget.D
    public final void onInserted(int i, int i9) {
        this.f7612a.notifyItemRangeInserted(i, i9);
    }

    @Override // androidx.recyclerview.widget.D
    public final void onMoved(int i, int i9) {
        this.f7612a.notifyItemMoved(i, i9);
    }

    @Override // androidx.recyclerview.widget.D
    public final void onRemoved(int i, int i9) {
        this.f7612a.notifyItemRangeRemoved(i, i9);
    }
}
