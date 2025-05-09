package y0;

import android.view.View;

/* compiled from: NestedScrollingParent2.java */
/* loaded from: classes.dex */
public interface m {
    void onNestedPreScroll(View view, int i, int i9, int[] iArr, int i10);

    void onNestedScroll(View view, int i, int i9, int i10, int i11, int i12);

    void onNestedScrollAccepted(View view, View view2, int i, int i9);

    boolean onStartNestedScroll(View view, View view2, int i, int i9);

    void onStopNestedScroll(View view, int i);
}
