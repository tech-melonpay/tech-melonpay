package T2;

/* compiled from: CutCornerTreatment.java */
/* loaded from: classes.dex */
public final class d extends Ja.a {

    /* renamed from: b, reason: collision with root package name */
    public final float f3446b = -1.0f;

    @Override // Ja.a
    public final void k(l lVar, float f10, float f11) {
        lVar.e(f11 * f10, 180.0f, 90.0f);
        double d10 = f11;
        double d11 = f10;
        lVar.d((float) (Math.sin(Math.toRadians(90.0f)) * d10 * d11), (float) (Math.sin(Math.toRadians(0.0f)) * d10 * d11));
    }
}
