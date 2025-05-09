package androidx.databinding.library.baseAdapters;

import F0.c;
import F0.f;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends F0.b {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f6540a = new SparseIntArray(0);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f6541a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f6541a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f6542a = new HashMap<>(0);
    }

    @Override // F0.b
    public final List<F0.b> collectDependencies() {
        return new ArrayList(0);
    }

    @Override // F0.b
    public final String convertBrIdToString(int i) {
        return a.f6541a.get(i);
    }

    @Override // F0.b
    public final f getDataBinder(c cVar, View view, int i) {
        if (f6540a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // F0.b
    public final int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f6542a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // F0.b
    public final f getDataBinder(c cVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f6540a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
