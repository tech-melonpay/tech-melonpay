package c0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import d0.g;
import d0.j;
import java.util.ArrayList;

/* compiled from: HelperWidget.java */
/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0620a extends ConstraintWidget {
    public ConstraintWidget[] s0 = new ConstraintWidget[4];

    /* renamed from: t0, reason: collision with root package name */
    public int f8508t0 = 0;

    public final void R(int i, j jVar, ArrayList arrayList) {
        for (int i9 = 0; i9 < this.f8508t0; i9++) {
            ConstraintWidget constraintWidget = this.s0[i9];
            ArrayList<ConstraintWidget> arrayList2 = jVar.f20397a;
            if (!arrayList2.contains(constraintWidget)) {
                arrayList2.add(constraintWidget);
            }
        }
        for (int i10 = 0; i10 < this.f8508t0; i10++) {
            g.a(this.s0[i10], i, arrayList, jVar);
        }
    }

    public void S() {
    }
}
