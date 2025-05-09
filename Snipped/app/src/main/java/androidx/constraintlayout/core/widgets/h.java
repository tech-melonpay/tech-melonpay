package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import c0.C0620a;
import d0.C0681b;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public class h extends C0620a {

    /* renamed from: u0, reason: collision with root package name */
    public int f6195u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public int f6196v0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    public int f6197w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public int f6198x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public int f6199y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    public int f6200z0 = 0;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f6190A0 = false;

    /* renamed from: B0, reason: collision with root package name */
    public int f6191B0 = 0;

    /* renamed from: C0, reason: collision with root package name */
    public int f6192C0 = 0;

    /* renamed from: D0, reason: collision with root package name */
    public final C0681b.a f6193D0 = new C0681b.a();

    /* renamed from: E0, reason: collision with root package name */
    public C0681b.InterfaceC0389b f6194E0 = null;

    @Override // c0.C0620a
    public final void S() {
        for (int i = 0; i < this.f8508t0; i++) {
            ConstraintWidget constraintWidget = this.s0[i];
            if (constraintWidget != null) {
                constraintWidget.f6009H = true;
            }
        }
    }

    public final void U(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i9) {
        C0681b.InterfaceC0389b interfaceC0389b;
        ConstraintWidget constraintWidget2;
        while (true) {
            interfaceC0389b = this.f6194E0;
            if (interfaceC0389b != null || (constraintWidget2 = this.W) == null) {
                break;
            } else {
                this.f6194E0 = ((d) constraintWidget2).f6139w0;
            }
        }
        C0681b.a aVar = this.f6193D0;
        aVar.f20374a = dimensionBehaviour;
        aVar.f20375b = dimensionBehaviour2;
        aVar.f20376c = i;
        aVar.f20377d = i9;
        ((ConstraintLayout.b) interfaceC0389b).b(constraintWidget, aVar);
        constraintWidget.O(aVar.f20378e);
        constraintWidget.L(aVar.f20379f);
        constraintWidget.f6007F = aVar.f20381h;
        constraintWidget.I(aVar.f20380g);
    }

    public void T(int i, int i9, int i10, int i11) {
    }
}
