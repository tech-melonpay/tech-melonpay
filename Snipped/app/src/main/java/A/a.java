package A;

/* compiled from: AutoValue_Version.java */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: c, reason: collision with root package name */
    public final int f2c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5f;

    public a(int i, int i9, int i10, String str) {
        this.f2c = i;
        this.f3d = i9;
        this.f4e = i10;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.f5f = str;
    }

    @Override // A.d
    public final String c() {
        return this.f5f;
    }

    @Override // A.d
    public final int d() {
        return this.f2c;
    }

    @Override // A.d
    public final int e() {
        return this.f3d;
    }

    @Override // A.d
    public final int f() {
        return this.f4e;
    }
}
