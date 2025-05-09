package m;

/* compiled from: RtlSpacingHelper.java */
/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public int f23686a;

    /* renamed from: b, reason: collision with root package name */
    public int f23687b;

    /* renamed from: c, reason: collision with root package name */
    public int f23688c;

    /* renamed from: d, reason: collision with root package name */
    public int f23689d;

    /* renamed from: e, reason: collision with root package name */
    public int f23690e;

    /* renamed from: f, reason: collision with root package name */
    public int f23691f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23692g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23693h;

    public final void a(int i, int i9) {
        this.f23688c = i;
        this.f23689d = i9;
        this.f23693h = true;
        if (this.f23692g) {
            if (i9 != Integer.MIN_VALUE) {
                this.f23686a = i9;
            }
            if (i != Integer.MIN_VALUE) {
                this.f23687b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f23686a = i;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f23687b = i9;
        }
    }
}
