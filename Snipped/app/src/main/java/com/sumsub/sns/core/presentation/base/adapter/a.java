package com.sumsub.sns.core.presentation.base.adapter;

import androidx.recyclerview.widget.C0564b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.sumsub.sns.core.presentation.base.adapter.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public abstract class a<T, VH extends b<T>> extends RecyclerView.Adapter<VH> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<T> f14145a = new ArrayList<>();

    /* renamed from: com.sumsub.sns.core.presentation.base.adapter.a$a, reason: collision with other inner class name */
    public static final class C0161a<T> extends q.b {

        /* renamed from: a, reason: collision with root package name */
        public final List<T> f14146a;

        /* renamed from: b, reason: collision with root package name */
        public final List<T> f14147b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0161a(List<? extends T> list, List<? extends T> list2) {
            this.f14146a = list;
            this.f14147b = list2;
        }

        @Override // androidx.recyclerview.widget.q.b
        public boolean areContentsTheSame(int i, int i9) {
            return f.b(this.f14146a.get(i), this.f14147b.get(i9));
        }

        @Override // androidx.recyclerview.widget.q.b
        public boolean areItemsTheSame(int i, int i9) {
            return f.b(this.f14146a.get(i), this.f14147b.get(i9));
        }

        @Override // androidx.recyclerview.widget.q.b
        public int getNewListSize() {
            return this.f14147b.size();
        }

        @Override // androidx.recyclerview.widget.q.b
        public int getOldListSize() {
            return this.f14146a.size();
        }
    }

    public q.b a(List<? extends T> list, List<? extends T> list2) {
        return new C0161a(list, list2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f14145a.size();
    }

    public void a(List<? extends T> list) {
        q.d a10 = q.a(a(this.f14145a, list));
        this.f14145a.clear();
        this.f14145a.addAll(list);
        a10.a(new C0564b(this));
    }

    public final T a(int i) {
        return this.f14145a.get(i);
    }
}
