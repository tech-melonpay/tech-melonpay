package Ka;

/* compiled from: Segment.kt */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2335a;

    /* renamed from: b, reason: collision with root package name */
    public int f2336b;

    /* renamed from: c, reason: collision with root package name */
    public int f2337c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2338d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2339e;

    /* renamed from: f, reason: collision with root package name */
    public u f2340f;

    /* renamed from: g, reason: collision with root package name */
    public u f2341g;

    public u() {
        this.f2335a = new byte[8192];
        this.f2339e = true;
        this.f2338d = false;
    }

    public final u a() {
        u uVar = this.f2340f;
        u uVar2 = uVar != this ? uVar : null;
        u uVar3 = this.f2341g;
        uVar3.f2340f = uVar;
        this.f2340f.f2341g = uVar3;
        this.f2340f = null;
        this.f2341g = null;
        return uVar2;
    }

    public final void b(u uVar) {
        uVar.f2341g = this;
        uVar.f2340f = this.f2340f;
        this.f2340f.f2341g = uVar;
        this.f2340f = uVar;
    }

    public final u c() {
        this.f2338d = true;
        return new u(this.f2335a, this.f2336b, this.f2337c, true, false);
    }

    public final void d(u uVar, int i) {
        if (!uVar.f2339e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i9 = uVar.f2337c;
        int i10 = i9 + i;
        byte[] bArr = uVar.f2335a;
        if (i10 > 8192) {
            if (uVar.f2338d) {
                throw new IllegalArgumentException();
            }
            int i11 = uVar.f2336b;
            if (i10 - i11 > 8192) {
                throw new IllegalArgumentException();
            }
            P9.i.g(bArr, bArr, i11, i9);
            uVar.f2337c -= uVar.f2336b;
            uVar.f2336b = 0;
        }
        int i12 = uVar.f2337c;
        int i13 = this.f2336b;
        System.arraycopy(this.f2335a, i13, bArr, i12, (i13 + i) - i13);
        uVar.f2337c += i;
        this.f2336b += i;
    }

    public u(byte[] bArr, int i, int i9, boolean z10, boolean z11) {
        this.f2335a = bArr;
        this.f2336b = i;
        this.f2337c = i9;
        this.f2338d = z10;
        this.f2339e = z11;
    }
}
