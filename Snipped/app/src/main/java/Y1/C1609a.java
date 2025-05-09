package y1;

import B1.p;

/* compiled from: BatteryChargingController.java */
/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1609a extends AbstractC1610b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f31104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1609a(z1.d dVar, int i) {
        super(dVar);
        this.f31104e = i;
    }

    @Override // y1.AbstractC1610b
    public final boolean b(p pVar) {
        switch (this.f31104e) {
            case 0:
                return pVar.f251j.f26498b;
            case 1:
                return pVar.f251j.f26500d;
            default:
                return pVar.f251j.f26501e;
        }
    }

    @Override // y1.AbstractC1610b
    public final boolean c(Object obj) {
        switch (this.f31104e) {
        }
        return !((Boolean) obj).booleanValue();
    }
}
