package N2;

/* compiled from: LinearProgressIndicatorSpec.java */
/* loaded from: classes.dex */
public final class s extends c {

    /* renamed from: h, reason: collision with root package name */
    public int f2841h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2842j;

    /* renamed from: k, reason: collision with root package name */
    public int f2843k;

    @Override // N2.c
    public final void a() {
        super.a();
        if (this.f2843k < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f2841h == 0) {
            if (this.f2761b > 0 && this.f2766g == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.f2762c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
