package F0;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* compiled from: DataBinderMapper.java */
/* loaded from: classes.dex */
public abstract class b {
    public List<b> collectDependencies() {
        return Collections.emptyList();
    }

    public abstract String convertBrIdToString(int i);

    public abstract f getDataBinder(c cVar, View view, int i);

    public abstract f getDataBinder(c cVar, View[] viewArr, int i);

    public abstract int getLayoutId(String str);
}
