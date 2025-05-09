package n0;

import android.graphics.Insets;

/* compiled from: Insets.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f24065e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f24066a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24067b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24068c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24069d;

    /* compiled from: Insets.java */
    public static class a {
        public static Insets a(int i, int i9, int i10, int i11) {
            return Insets.of(i, i9, i10, i11);
        }
    }

    public b(int i, int i9, int i10, int i11) {
        this.f24066a = i;
        this.f24067b = i9;
        this.f24068c = i10;
        this.f24069d = i11;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f24066a, bVar2.f24066a), Math.max(bVar.f24067b, bVar2.f24067b), Math.max(bVar.f24068c, bVar2.f24068c), Math.max(bVar.f24069d, bVar2.f24069d));
    }

    public static b b(int i, int i9, int i10, int i11) {
        return (i == 0 && i9 == 0 && i10 == 0 && i11 == 0) ? f24065e : new b(i, i9, i10, i11);
    }

    public static b c(Insets insets) {
        int i;
        int i9;
        int i10;
        int i11;
        i = insets.left;
        i9 = insets.top;
        i10 = insets.right;
        i11 = insets.bottom;
        return b(i, i9, i10, i11);
    }

    public final Insets d() {
        return a.a(this.f24066a, this.f24067b, this.f24068c, this.f24069d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f24069d == bVar.f24069d && this.f24066a == bVar.f24066a && this.f24068c == bVar.f24068c && this.f24067b == bVar.f24067b;
    }

    public final int hashCode() {
        return (((((this.f24066a * 31) + this.f24067b) * 31) + this.f24068c) * 31) + this.f24069d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f24066a);
        sb2.append(", top=");
        sb2.append(this.f24067b);
        sb2.append(", right=");
        sb2.append(this.f24068c);
        sb2.append(", bottom=");
        return androidx.camera.core.impl.utils.a.m(sb2, this.f24069d, '}');
    }
}
