package r1;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewPager2.java */
/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1148b implements RecyclerView.p {
    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onChildViewAttachedToWindow(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) oVar).width != -1 || ((ViewGroup.MarginLayoutParams) oVar).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onChildViewDetachedFromWindow(View view) {
    }
}
