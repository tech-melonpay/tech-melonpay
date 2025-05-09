package c0;

import Fa.h;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0621b extends ConstraintWidget {
    public ArrayList<ConstraintWidget> s0 = new ArrayList<>();

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void C() {
        this.s0.clear();
        super.C();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void F(h hVar) {
        super.F(hVar);
        int size = this.s0.size();
        for (int i = 0; i < size; i++) {
            this.s0.get(i).F(hVar);
        }
    }

    public void R() {
        ArrayList<ConstraintWidget> arrayList = this.s0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.s0.get(i);
            if (constraintWidget instanceof C0621b) {
                ((C0621b) constraintWidget).R();
            }
        }
    }
}
