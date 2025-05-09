package T2;

import T2.l;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public final class k extends l.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f3527c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f3528d;

    public k(ArrayList arrayList, Matrix matrix) {
        this.f3527c = arrayList;
        this.f3528d = matrix;
    }

    @Override // T2.l.f
    public final void a(Matrix matrix, S2.a aVar, int i, Canvas canvas) {
        Iterator it = this.f3527c.iterator();
        while (it.hasNext()) {
            ((l.f) it.next()).a(this.f3528d, aVar, i, canvas);
        }
    }
}
