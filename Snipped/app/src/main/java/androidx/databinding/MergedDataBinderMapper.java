package androidx.databinding;

import F0.b;
import F0.c;
import F0.f;
import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends b {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f6537a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f6538b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f6539c = new CopyOnWriteArrayList();

    public final void a(b bVar) {
        if (this.f6537a.add(bVar.getClass())) {
            this.f6538b.add(bVar);
            Iterator<b> it = bVar.collectDependencies().iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }

    public final boolean b() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6539c;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (b.class.isAssignableFrom(cls)) {
                    a((b) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z10 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e10) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e10);
            } catch (InstantiationException e11) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e11);
            }
        }
        return z10;
    }

    @Override // F0.b
    public final String convertBrIdToString(int i) {
        Iterator it = this.f6538b.iterator();
        while (it.hasNext()) {
            String convertBrIdToString = ((b) it.next()).convertBrIdToString(i);
            if (convertBrIdToString != null) {
                return convertBrIdToString;
            }
        }
        if (b()) {
            return convertBrIdToString(i);
        }
        return null;
    }

    @Override // F0.b
    public final f getDataBinder(c cVar, View view, int i) {
        Iterator it = this.f6538b.iterator();
        while (it.hasNext()) {
            f dataBinder = ((b) it.next()).getDataBinder(cVar, view, i);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (b()) {
            return getDataBinder(cVar, view, i);
        }
        return null;
    }

    @Override // F0.b
    public final int getLayoutId(String str) {
        Iterator it = this.f6538b.iterator();
        while (it.hasNext()) {
            int layoutId = ((b) it.next()).getLayoutId(str);
            if (layoutId != 0) {
                return layoutId;
            }
        }
        if (b()) {
            return getLayoutId(str);
        }
        return 0;
    }

    @Override // F0.b
    public final f getDataBinder(c cVar, View[] viewArr, int i) {
        Iterator it = this.f6538b.iterator();
        while (it.hasNext()) {
            f dataBinder = ((b) it.next()).getDataBinder(cVar, viewArr, i);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (b()) {
            return getDataBinder(cVar, viewArr, i);
        }
        return null;
    }
}
