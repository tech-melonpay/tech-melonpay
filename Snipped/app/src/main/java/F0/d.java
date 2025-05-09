package F0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;

/* compiled from: DataBindingUtil.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final DataBinderMapperImpl f1140a = new DataBinderMapperImpl();

    public static <T extends f> T a(c cVar, ViewGroup viewGroup, int i, int i9) {
        int childCount = viewGroup.getChildCount();
        int i10 = childCount - i;
        DataBinderMapperImpl dataBinderMapperImpl = f1140a;
        if (i10 == 1) {
            return (T) dataBinderMapperImpl.getDataBinder(cVar, viewGroup.getChildAt(childCount - 1), i9);
        }
        View[] viewArr = new View[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            viewArr[i11] = viewGroup.getChildAt(i11 + i);
        }
        return (T) dataBinderMapperImpl.getDataBinder(cVar, viewArr, i9);
    }

    public static <T extends f> T b(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z10, c cVar) {
        boolean z11 = viewGroup != null && z10;
        return z11 ? (T) a(cVar, viewGroup, z11 ? viewGroup.getChildCount() : 0, i) : (T) f1140a.getDataBinder(cVar, layoutInflater.inflate(i, viewGroup, z10), i);
    }
}
