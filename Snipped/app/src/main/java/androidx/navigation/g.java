package androidx.navigation;

/* compiled from: NavOptions.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7313a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7314b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7315c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7316d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7317e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7318f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7319g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7320h;
    public final int i;

    /* compiled from: NavOptions.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f7321a;

        /* renamed from: b, reason: collision with root package name */
        public int f7322b;

        /* renamed from: c, reason: collision with root package name */
        public int f7323c;

        /* renamed from: d, reason: collision with root package name */
        public int f7324d;
    }

    public g() {
        throw null;
    }

    public g(boolean z10, boolean z11, int i, boolean z12, boolean z13, int i9, int i10, int i11, int i12) {
        this.f7313a = z10;
        this.f7314b = z11;
        this.f7315c = i;
        this.f7316d = z12;
        this.f7317e = z13;
        this.f7318f = i9;
        this.f7319g = i10;
        this.f7320h = i11;
        this.i = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f7313a == gVar.f7313a && this.f7314b == gVar.f7314b && this.f7315c == gVar.f7315c) {
            gVar.getClass();
            if (kotlin.jvm.internal.f.b(null, null)) {
                gVar.getClass();
                if (kotlin.jvm.internal.f.b(null, null)) {
                    gVar.getClass();
                    if (kotlin.jvm.internal.f.b(null, null) && this.f7316d == gVar.f7316d && this.f7317e == gVar.f7317e && this.f7318f == gVar.f7318f && this.f7319g == gVar.f7319g && this.f7320h == gVar.f7320h && this.i == gVar.i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.f7313a ? 1 : 0) * 31) + (this.f7314b ? 1 : 0)) * 31) + this.f7315c) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.f7316d ? 1 : 0)) * 31) + (this.f7317e ? 1 : 0)) * 31) + this.f7318f) * 31) + this.f7319g) * 31) + this.f7320h) * 31) + this.i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g.class.getSimpleName());
        sb2.append("(");
        if (this.f7313a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f7314b) {
            sb2.append("restoreState ");
        }
        int i = this.i;
        int i9 = this.f7320h;
        int i10 = this.f7319g;
        int i11 = this.f7318f;
        if (i11 != -1 || i10 != -1 || i9 != -1 || i != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i11));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i10));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(i9));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(i));
            sb2.append(")");
        }
        return sb2.toString();
    }
}
