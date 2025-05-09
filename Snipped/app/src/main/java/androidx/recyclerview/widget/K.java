package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper.java */
/* loaded from: classes.dex */
public final class K {
    public static int a(RecyclerView.y yVar, H h9, View view, View view2, RecyclerView.n nVar, boolean z10) {
        if (nVar.getChildCount() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(nVar.getPosition(view) - nVar.getPosition(view2)) + 1;
        }
        return Math.min(h9.l(), h9.b(view2) - h9.e(view));
    }

    public static int b(RecyclerView.y yVar, H h9, View view, View view2, RecyclerView.n nVar, boolean z10, boolean z11) {
        if (nVar.getChildCount() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z11 ? Math.max(0, (yVar.b() - Math.max(nVar.getPosition(view), nVar.getPosition(view2))) - 1) : Math.max(0, Math.min(nVar.getPosition(view), nVar.getPosition(view2)));
        if (z10) {
            return Math.round((max * (Math.abs(h9.b(view2) - h9.e(view)) / (Math.abs(nVar.getPosition(view) - nVar.getPosition(view2)) + 1))) + (h9.k() - h9.e(view)));
        }
        return max;
    }

    public static int c(RecyclerView.y yVar, H h9, View view, View view2, RecyclerView.n nVar, boolean z10) {
        if (nVar.getChildCount() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return yVar.b();
        }
        return (int) (((h9.b(view2) - h9.e(view)) / (Math.abs(nVar.getPosition(view) - nVar.getPosition(view2)) + 1)) * yVar.b());
    }
}
