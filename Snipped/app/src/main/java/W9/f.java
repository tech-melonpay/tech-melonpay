package w9;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;

/* compiled from: ViewUtils.java */
/* loaded from: classes2.dex */
public final class f {
    public static View a(View view, float f10, float f11, e eVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(view);
        int[] iArr = new int[2];
        View view2 = null;
        while (arrayDeque.size() > 0) {
            View view3 = (View) arrayDeque.poll();
            D9.b.t0(view3, "view is required");
            if (eVar.e(view3)) {
                if (eVar.b()) {
                    return view3;
                }
                view2 = view3;
            }
            if (view3 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view3;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    childAt.getLocationOnScreen(iArr);
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    int width = childAt.getWidth();
                    int height = childAt.getHeight();
                    if (f10 >= i9 && f10 <= i9 + width && f11 >= i10 && f11 <= i10 + height) {
                        arrayDeque.add(childAt);
                    }
                }
            }
        }
        return view2;
    }
}
