package Y0;

import android.graphics.Color;
import java.util.Arrays;

/* compiled from: Palette.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4079a = new a();

    /* compiled from: Palette.java */
    public static class a implements InterfaceC0050b {
        @Override // Y0.b.InterfaceC0050b
        public final boolean a(float[] fArr, int i) {
            float f10 = fArr[2];
            if (f10 >= 0.95f || f10 <= 0.05f) {
                return false;
            }
            float f11 = fArr[0];
            return f11 < 10.0f || f11 > 37.0f || fArr[1] > 0.82f;
        }
    }

    /* compiled from: Palette.java */
    /* renamed from: Y0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0050b {
        boolean a(float[] fArr, int i);
    }

    /* compiled from: Palette.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f4080a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4081b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4082c;

        /* renamed from: d, reason: collision with root package name */
        public final int f4083d;

        /* renamed from: e, reason: collision with root package name */
        public final int f4084e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f4085f;

        /* renamed from: g, reason: collision with root package name */
        public int f4086g;

        /* renamed from: h, reason: collision with root package name */
        public int f4087h;
        public float[] i;

        public c(int i, int i9) {
            this.f4080a = Color.red(i);
            this.f4081b = Color.green(i);
            this.f4082c = Color.blue(i);
            this.f4083d = i;
            this.f4084e = i9;
        }

        public final void a() {
            if (this.f4085f) {
                return;
            }
            int i = this.f4083d;
            int e10 = n0.a.e(-1, 4.5f, i);
            int e11 = n0.a.e(-1, 3.0f, i);
            if (e10 != -1 && e11 != -1) {
                this.f4087h = n0.a.h(-1, e10);
                this.f4086g = n0.a.h(-1, e11);
                this.f4085f = true;
                return;
            }
            int e12 = n0.a.e(-16777216, 4.5f, i);
            int e13 = n0.a.e(-16777216, 3.0f, i);
            if (e12 == -1 || e13 == -1) {
                this.f4087h = e10 != -1 ? n0.a.h(-1, e10) : n0.a.h(-16777216, e12);
                this.f4086g = e11 != -1 ? n0.a.h(-1, e11) : n0.a.h(-16777216, e13);
                this.f4085f = true;
            } else {
                this.f4087h = n0.a.h(-16777216, e12);
                this.f4086g = n0.a.h(-16777216, e13);
                this.f4085f = true;
            }
        }

        public final float[] b() {
            if (this.i == null) {
                this.i = new float[3];
            }
            n0.a.a(this.f4080a, this.f4081b, this.f4082c, this.i);
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f4084e == cVar.f4084e && this.f4083d == cVar.f4083d;
        }

        public final int hashCode() {
            return (this.f4083d * 31) + this.f4084e;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(c.class.getSimpleName());
            sb2.append(" [RGB: #");
            sb2.append(Integer.toHexString(this.f4083d));
            sb2.append("] [HSL: ");
            sb2.append(Arrays.toString(b()));
            sb2.append("] [Population: ");
            sb2.append(this.f4084e);
            sb2.append("] [Title Text: #");
            a();
            sb2.append(Integer.toHexString(this.f4086g));
            sb2.append("] [Body Text: #");
            a();
            sb2.append(Integer.toHexString(this.f4087h));
            sb2.append(']');
            return sb2.toString();
        }
    }
}
