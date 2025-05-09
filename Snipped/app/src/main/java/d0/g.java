package d0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import c0.C0620a;
import java.util.ArrayList;

/* compiled from: Grouping.java */
/* loaded from: classes.dex */
public final class g {
    public static j a(ConstraintWidget constraintWidget, int i, ArrayList<j> arrayList, j jVar) {
        int i9;
        int i10 = i == 0 ? constraintWidget.f6052q0 : constraintWidget.f6054r0;
        if (i10 != -1 && (jVar == null || i10 != jVar.f20398b)) {
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                j jVar2 = arrayList.get(i11);
                if (jVar2.f20398b == i10) {
                    if (jVar != null) {
                        jVar.c(i, jVar2);
                        arrayList.remove(jVar);
                    }
                    jVar = jVar2;
                } else {
                    i11++;
                }
            }
        } else if (i10 != -1) {
            return jVar;
        }
        if (jVar == null) {
            if (constraintWidget instanceof C0620a) {
                C0620a c0620a = (C0620a) constraintWidget;
                int i12 = 0;
                while (true) {
                    if (i12 >= c0620a.f8508t0) {
                        i9 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = c0620a.s0[i12];
                    if ((i == 0 && (i9 = constraintWidget2.f6052q0) != -1) || (i == 1 && (i9 = constraintWidget2.f6054r0) != -1)) {
                        break;
                    }
                    i12++;
                }
                if (i9 != -1) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList.size()) {
                            break;
                        }
                        j jVar3 = arrayList.get(i13);
                        if (jVar3.f20398b == i9) {
                            jVar = jVar3;
                            break;
                        }
                        i13++;
                    }
                }
            }
            if (jVar == null) {
                jVar = new j();
                jVar.f20397a = new ArrayList<>();
                jVar.f20400d = null;
                jVar.f20401e = -1;
                int i14 = j.f20396f;
                j.f20396f = i14 + 1;
                jVar.f20398b = i14;
                jVar.f20399c = i;
            }
            arrayList.add(jVar);
        }
        ArrayList<ConstraintWidget> arrayList2 = jVar.f20397a;
        if (!arrayList2.contains(constraintWidget)) {
            arrayList2.add(constraintWidget);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                fVar.f6186v0.c(fVar.f6187w0 == 0 ? 1 : 0, jVar, arrayList);
            }
            int i15 = jVar.f20398b;
            if (i == 0) {
                constraintWidget.f6052q0 = i15;
                constraintWidget.f6012K.c(i, jVar, arrayList);
                constraintWidget.f6014M.c(i, jVar, arrayList);
            } else {
                constraintWidget.f6054r0 = i15;
                constraintWidget.f6013L.c(i, jVar, arrayList);
                constraintWidget.f6016O.c(i, jVar, arrayList);
                constraintWidget.f6015N.c(i, jVar, arrayList);
            }
            constraintWidget.R.c(i, jVar, arrayList);
        }
        return jVar;
    }

    public static boolean b(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f6063a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.f6066d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.f6064b;
        return (dimensionBehaviour3 == dimensionBehaviour5 || dimensionBehaviour3 == dimensionBehaviour7 || (dimensionBehaviour3 == dimensionBehaviour6 && dimensionBehaviour != dimensionBehaviour7)) || (dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviour4 == dimensionBehaviour7 || (dimensionBehaviour4 == dimensionBehaviour6 && dimensionBehaviour2 != dimensionBehaviour7));
    }
}
