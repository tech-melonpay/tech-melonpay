package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import y0.C1596C;

/* compiled from: FragmentTransitionImpl.java */
/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6604b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6605c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6607e;

    public B(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f6603a = i;
        this.f6604b = arrayList;
        this.f6605c = arrayList2;
        this.f6606d = arrayList3;
        this.f6607e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f6603a; i++) {
            View view = (View) this.f6604b.get(i);
            String str = (String) this.f6605c.get(i);
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            C1596C.d.n(view, str);
            C1596C.d.n((View) this.f6606d.get(i), (String) this.f6607e.get(i));
        }
    }
}
