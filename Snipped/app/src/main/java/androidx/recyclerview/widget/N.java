package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper.java */
/* loaded from: classes.dex */
public final class N extends A {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ M f7462q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(M m2, Context context) {
        super(context);
        this.f7462q = m2;
    }

    @Override // androidx.recyclerview.widget.A, androidx.recyclerview.widget.RecyclerView.x
    public final void c(View view, RecyclerView.x.a aVar) {
        M m2 = this.f7462q;
        RecyclerView recyclerView = m2.f7457a;
        if (recyclerView == null) {
            return;
        }
        int[] b9 = m2.b(recyclerView.getLayoutManager(), view);
        int i = b9[0];
        int i9 = b9[1];
        int ceil = (int) Math.ceil(i(Math.max(Math.abs(i), Math.abs(i9))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f7401j;
            aVar.f7531a = i;
            aVar.f7532b = i9;
            aVar.f7533c = ceil;
            aVar.f7535e = decelerateInterpolator;
            aVar.f7536f = true;
        }
    }

    @Override // androidx.recyclerview.widget.A
    public final float h(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
