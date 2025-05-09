package d0;

import C.v;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: WidgetGroup.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: f, reason: collision with root package name */
    public static int f20396f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f20397a;

    /* renamed from: b, reason: collision with root package name */
    public int f20398b;

    /* renamed from: c, reason: collision with root package name */
    public int f20399c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<a> f20400d;

    /* renamed from: e, reason: collision with root package name */
    public int f20401e;

    /* compiled from: WidgetGroup.java */
    public static class a {
    }

    public final void a(ArrayList<j> arrayList) {
        int size = this.f20397a.size();
        if (this.f20401e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                j jVar = arrayList.get(i);
                if (this.f20401e == jVar.f20398b) {
                    c(this.f20399c, jVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(androidx.constraintlayout.core.c cVar, int i) {
        int n10;
        int n11;
        ArrayList<ConstraintWidget> arrayList = this.f20397a;
        if (arrayList.size() == 0) {
            return 0;
        }
        androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) arrayList.get(0).W;
        cVar.t();
        dVar.b(cVar, false);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            arrayList.get(i9).b(cVar, false);
        }
        if (i == 0 && dVar.f6124B0 > 0) {
            androidx.constraintlayout.core.widgets.b.a(dVar, cVar, arrayList, 0);
        }
        if (i == 1 && dVar.f6125C0 > 0) {
            androidx.constraintlayout.core.widgets.b.a(dVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f20400d = new ArrayList<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ConstraintWidget constraintWidget = arrayList.get(i10);
            a aVar = new a();
            new WeakReference(constraintWidget);
            androidx.constraintlayout.core.c.n(constraintWidget.f6012K);
            androidx.constraintlayout.core.c.n(constraintWidget.f6013L);
            androidx.constraintlayout.core.c.n(constraintWidget.f6014M);
            androidx.constraintlayout.core.c.n(constraintWidget.f6015N);
            androidx.constraintlayout.core.c.n(constraintWidget.f6016O);
            this.f20400d.add(aVar);
        }
        if (i == 0) {
            n10 = androidx.constraintlayout.core.c.n(dVar.f6012K);
            n11 = androidx.constraintlayout.core.c.n(dVar.f6014M);
            cVar.t();
        } else {
            n10 = androidx.constraintlayout.core.c.n(dVar.f6013L);
            n11 = androidx.constraintlayout.core.c.n(dVar.f6015N);
            cVar.t();
        }
        return n11 - n10;
    }

    public final void c(int i, j jVar) {
        Iterator<ConstraintWidget> it = this.f20397a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ArrayList<ConstraintWidget> arrayList = jVar.f20397a;
            if (!arrayList.contains(next)) {
                arrayList.add(next);
            }
            int i9 = jVar.f20398b;
            if (i == 0) {
                next.f6052q0 = i9;
            } else {
                next.f6054r0 = i9;
            }
        }
        this.f20401e = jVar.f20398b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i = this.f20399c;
        sb2.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String m2 = s3.b.m(sb2, this.f20398b, "] <");
        Iterator<ConstraintWidget> it = this.f20397a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            StringBuilder r8 = androidx.camera.core.impl.utils.a.r(m2, " ");
            r8.append(next.f6040k0);
            m2 = r8.toString();
        }
        return v.n(m2, " >");
    }
}
