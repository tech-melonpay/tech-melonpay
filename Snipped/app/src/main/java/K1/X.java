package k1;

import android.view.ViewGroup;

/* compiled from: VisibilityPropagation.java */
/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f22808a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int b(L l10, int i) {
        int[] iArr;
        if (l10 == null || (iArr = (int[]) l10.f22761a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    public abstract long a(ViewGroup viewGroup, AbstractC0919C abstractC0919C, L l10, L l11);
}
