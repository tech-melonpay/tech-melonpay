package H0;

import H0.b;

/* compiled from: SpringForce.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public double f1408a;

    /* renamed from: b, reason: collision with root package name */
    public double f1409b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1410c;

    /* renamed from: d, reason: collision with root package name */
    public double f1411d;

    /* renamed from: e, reason: collision with root package name */
    public double f1412e;

    /* renamed from: f, reason: collision with root package name */
    public double f1413f;

    /* renamed from: g, reason: collision with root package name */
    public double f1414g;

    /* renamed from: h, reason: collision with root package name */
    public double f1415h;
    public double i;

    /* renamed from: j, reason: collision with root package name */
    public final b.p f1416j;

    public f() {
        this.f1408a = Math.sqrt(1500.0d);
        this.f1409b = 0.5d;
        this.f1410c = false;
        this.i = Double.MAX_VALUE;
        this.f1416j = new b.p();
    }

    public final void a(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f1409b = f10;
        this.f1410c = false;
    }

    public final void b(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f1408a = Math.sqrt(f10);
        this.f1410c = false;
    }

    public final b.p c(double d10, double d11, long j10) {
        double cos;
        double d12;
        if (!this.f1410c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d13 = this.f1409b;
            if (d13 > 1.0d) {
                double d14 = this.f1408a;
                this.f1413f = (Math.sqrt((d13 * d13) - 1.0d) * d14) + ((-d13) * d14);
                double d15 = this.f1409b;
                double d16 = this.f1408a;
                this.f1414g = ((-d15) * d16) - (Math.sqrt((d15 * d15) - 1.0d) * d16);
            } else if (d13 >= 0.0d && d13 < 1.0d) {
                this.f1415h = Math.sqrt(1.0d - (d13 * d13)) * this.f1408a;
            }
            this.f1410c = true;
        }
        double d17 = j10 / 1000.0d;
        double d18 = d10 - this.i;
        double d19 = this.f1409b;
        if (d19 > 1.0d) {
            double d20 = this.f1414g;
            double d21 = this.f1413f;
            double d22 = d18 - (((d20 * d18) - d11) / (d20 - d21));
            double d23 = ((d18 * d20) - d11) / (d20 - d21);
            d12 = (Math.pow(2.718281828459045d, this.f1413f * d17) * d23) + (Math.pow(2.718281828459045d, d20 * d17) * d22);
            double d24 = this.f1414g;
            double pow = Math.pow(2.718281828459045d, d24 * d17) * d22 * d24;
            double d25 = this.f1413f;
            cos = (Math.pow(2.718281828459045d, d25 * d17) * d23 * d25) + pow;
        } else if (d19 == 1.0d) {
            double d26 = this.f1408a;
            double d27 = (d26 * d18) + d11;
            double d28 = (d27 * d17) + d18;
            double pow2 = Math.pow(2.718281828459045d, (-d26) * d17) * d28;
            double pow3 = Math.pow(2.718281828459045d, (-this.f1408a) * d17) * d28;
            double d29 = this.f1408a;
            cos = (Math.pow(2.718281828459045d, (-d29) * d17) * d27) + (pow3 * (-d29));
            d12 = pow2;
        } else {
            double d30 = 1.0d / this.f1415h;
            double d31 = this.f1408a;
            double d32 = ((d19 * d31 * d18) + d11) * d30;
            double sin = ((Math.sin(this.f1415h * d17) * d32) + (Math.cos(this.f1415h * d17) * d18)) * Math.pow(2.718281828459045d, (-d19) * d31 * d17);
            double d33 = this.f1408a;
            double d34 = this.f1409b;
            double d35 = (-d33) * sin * d34;
            double pow4 = Math.pow(2.718281828459045d, (-d34) * d33 * d17);
            double d36 = this.f1415h;
            double sin2 = Math.sin(d36 * d17) * (-d36) * d18;
            double d37 = this.f1415h;
            cos = (((Math.cos(d37 * d17) * d32 * d37) + sin2) * pow4) + d35;
            d12 = sin;
        }
        float f10 = (float) (d12 + this.i);
        b.p pVar = this.f1416j;
        pVar.f1402a = f10;
        pVar.f1403b = (float) cos;
        return pVar;
    }

    public f(float f10) {
        this.f1408a = Math.sqrt(1500.0d);
        this.f1409b = 0.5d;
        this.f1410c = false;
        this.f1416j = new b.p();
        this.i = f10;
    }
}
