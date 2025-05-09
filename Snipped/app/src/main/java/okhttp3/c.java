package okhttp3;

import java.util.concurrent.TimeUnit;

/* compiled from: CacheControl.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final c f24467n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f24468o;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24469a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24470b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24471c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24472d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24473e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24474f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24475g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24476h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f24477j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f24478k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f24479l;

    /* renamed from: m, reason: collision with root package name */
    public String f24480m;

    /* compiled from: CacheControl.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f24481a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f24482b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24483c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f24484d = -1;

        /* renamed from: e, reason: collision with root package name */
        public final int f24485e = -1;

        /* renamed from: f, reason: collision with root package name */
        public boolean f24486f;

        public final c a() {
            return new c(this.f24481a, this.f24482b, this.f24483c, -1, false, false, false, this.f24484d, this.f24485e, this.f24486f, false, false, null);
        }
    }

    /* compiled from: CacheControl.kt */
    public static final class b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v44 */
        /* JADX WARN: Type inference failed for: r4v45 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static okhttp3.c a(okhttp3.g r24) {
            /*
                Method dump skipped, instructions count: 454
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.c.b.a(okhttp3.g):okhttp3.c");
        }
    }

    static {
        a aVar = new a();
        aVar.f24481a = true;
        f24467n = aVar.a();
        a aVar2 = new a();
        aVar2.f24486f = true;
        long seconds = TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        aVar2.f24484d = seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE;
        f24468o = aVar2.a();
    }

    public c(boolean z10, boolean z11, int i, int i9, boolean z12, boolean z13, boolean z14, int i10, int i11, boolean z15, boolean z16, boolean z17, String str) {
        this.f24469a = z10;
        this.f24470b = z11;
        this.f24471c = i;
        this.f24472d = i9;
        this.f24473e = z12;
        this.f24474f = z13;
        this.f24475g = z14;
        this.f24476h = i10;
        this.i = i11;
        this.f24477j = z15;
        this.f24478k = z16;
        this.f24479l = z17;
        this.f24480m = str;
    }

    public final String toString() {
        String str = this.f24480m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f24469a) {
            sb2.append("no-cache, ");
        }
        if (this.f24470b) {
            sb2.append("no-store, ");
        }
        int i = this.f24471c;
        if (i != -1) {
            sb2.append("max-age=");
            sb2.append(i);
            sb2.append(", ");
        }
        int i9 = this.f24472d;
        if (i9 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i9);
            sb2.append(", ");
        }
        if (this.f24473e) {
            sb2.append("private, ");
        }
        if (this.f24474f) {
            sb2.append("public, ");
        }
        if (this.f24475g) {
            sb2.append("must-revalidate, ");
        }
        int i10 = this.f24476h;
        if (i10 != -1) {
            sb2.append("max-stale=");
            sb2.append(i10);
            sb2.append(", ");
        }
        int i11 = this.i;
        if (i11 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i11);
            sb2.append(", ");
        }
        if (this.f24477j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f24478k) {
            sb2.append("no-transform, ");
        }
        if (this.f24479l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String sb3 = sb2.toString();
        this.f24480m = sb3;
        return sb3;
    }
}
