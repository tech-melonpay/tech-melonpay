package h;

/* compiled from: TwilightCalculator.java */
/* renamed from: h.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788o {

    /* renamed from: d, reason: collision with root package name */
    public static C0788o f20974d;

    /* renamed from: a, reason: collision with root package name */
    public long f20975a;

    /* renamed from: b, reason: collision with root package name */
    public long f20976b;

    /* renamed from: c, reason: collision with root package name */
    public int f20977c;

    public final void a(double d10, double d11, long j10) {
        double d12 = (0.01720197f * ((j10 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d11) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d13 = 0.01745329238474369d * d10;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d13))) / (Math.cos(asin) * Math.cos(d13));
        if (sin3 >= 1.0d) {
            this.f20977c = 1;
            this.f20975a = -1L;
            this.f20976b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f20977c = 0;
                this.f20975a = -1L;
                this.f20976b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f20975a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f20976b = round;
            if (round >= j10 || this.f20975a <= j10) {
                this.f20977c = 1;
            } else {
                this.f20977c = 0;
            }
        }
    }
}
