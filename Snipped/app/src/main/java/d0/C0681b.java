package d0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* compiled from: BasicMeasure.java */
/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0681b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f20371a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final a f20372b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final androidx.constraintlayout.core.widgets.d f20373c;

    /* compiled from: BasicMeasure.java */
    /* renamed from: d0.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f20374a;

        /* renamed from: b, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f20375b;

        /* renamed from: c, reason: collision with root package name */
        public int f20376c;

        /* renamed from: d, reason: collision with root package name */
        public int f20377d;

        /* renamed from: e, reason: collision with root package name */
        public int f20378e;

        /* renamed from: f, reason: collision with root package name */
        public int f20379f;

        /* renamed from: g, reason: collision with root package name */
        public int f20380g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f20381h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public int f20382j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: d0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0389b {
    }

    public C0681b(androidx.constraintlayout.core.widgets.d dVar) {
        this.f20373c = dVar;
    }

    public final boolean a(int i, ConstraintWidget constraintWidget, InterfaceC0389b interfaceC0389b) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        a aVar = this.f20372b;
        aVar.f20374a = dimensionBehaviour;
        aVar.f20375b = dimensionBehaviourArr[1];
        aVar.f20376c = constraintWidget.q();
        aVar.f20377d = constraintWidget.k();
        aVar.i = false;
        aVar.f20382j = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.f20374a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f6065c;
        boolean z10 = dimensionBehaviour2 == dimensionBehaviour3;
        boolean z11 = aVar.f20375b == dimensionBehaviour3;
        boolean z12 = z10 && constraintWidget.f6019Z > 0.0f;
        boolean z13 = z11 && constraintWidget.f6019Z > 0.0f;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f6063a;
        int[] iArr = constraintWidget.f6057u;
        if (z12 && iArr[0] == 4) {
            aVar.f20374a = dimensionBehaviour4;
        }
        if (z13 && iArr[1] == 4) {
            aVar.f20375b = dimensionBehaviour4;
        }
        ((ConstraintLayout.b) interfaceC0389b).b(constraintWidget, aVar);
        constraintWidget.O(aVar.f20378e);
        constraintWidget.L(aVar.f20379f);
        constraintWidget.f6007F = aVar.f20381h;
        constraintWidget.I(aVar.f20380g);
        aVar.f20382j = 0;
        return aVar.i;
    }

    public final void b(androidx.constraintlayout.core.widgets.d dVar, int i, int i9, int i10) {
        dVar.getClass();
        int i11 = dVar.f6029e0;
        int i12 = dVar.f6031f0;
        dVar.f6029e0 = 0;
        dVar.f6031f0 = 0;
        dVar.O(i9);
        dVar.L(i10);
        if (i11 < 0) {
            dVar.f6029e0 = 0;
        } else {
            dVar.f6029e0 = i11;
        }
        if (i12 < 0) {
            dVar.f6031f0 = 0;
        } else {
            dVar.f6031f0 = i12;
        }
        androidx.constraintlayout.core.widgets.d dVar2 = this.f20373c;
        dVar2.f6138v0 = i;
        dVar2.R();
    }

    public final void c(androidx.constraintlayout.core.widgets.d dVar) {
        ArrayList<ConstraintWidget> arrayList = this.f20371a;
        arrayList.clear();
        int size = dVar.s0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = dVar.s0.get(i);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f6065c;
            if (dimensionBehaviour == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2) {
                arrayList.add(constraintWidget);
            }
        }
        dVar.f6137u0.f20386b = true;
    }
}
