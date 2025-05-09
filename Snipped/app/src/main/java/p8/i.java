package P8;

import java.io.PrintWriter;

/* compiled from: StatsSnapshot.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3129b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3130c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3131d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3132e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3133f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3134g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3135h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3136j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3137k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3138l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3139m;

    /* renamed from: n, reason: collision with root package name */
    public final long f3140n;

    public i(int i, int i9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i10, int i11, int i12, long j18) {
        this.f3128a = i;
        this.f3129b = i9;
        this.f3130c = j10;
        this.f3131d = j11;
        this.f3132e = j12;
        this.f3133f = j13;
        this.f3134g = j14;
        this.f3135h = j15;
        this.i = j16;
        this.f3136j = j17;
        this.f3137k = i10;
        this.f3138l = i11;
        this.f3139m = i12;
        this.f3140n = j18;
    }

    public final void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f3128a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f3129b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((r1 / r0) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f3130c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f3131d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f3137k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f3132e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f3135h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f3138l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f3133f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f3139m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f3134g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f3136j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public final String toString() {
        return "StatsSnapshot{maxSize=" + this.f3128a + ", size=" + this.f3129b + ", cacheHits=" + this.f3130c + ", cacheMisses=" + this.f3131d + ", downloadCount=" + this.f3137k + ", totalDownloadSize=" + this.f3132e + ", averageDownloadSize=" + this.f3135h + ", totalOriginalBitmapSize=" + this.f3133f + ", totalTransformedBitmapSize=" + this.f3134g + ", averageOriginalBitmapSize=" + this.i + ", averageTransformedBitmapSize=" + this.f3136j + ", originalBitmapCount=" + this.f3138l + ", transformedBitmapCount=" + this.f3139m + ", timeStamp=" + this.f3140n + '}';
    }
}
