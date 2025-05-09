package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Request.java */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: s, reason: collision with root package name */
    public static final long f13464s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a, reason: collision with root package name */
    public int f13465a;

    /* renamed from: b, reason: collision with root package name */
    public long f13466b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f13467c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13468d;

    /* renamed from: f, reason: collision with root package name */
    public final int f13470f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13471g;

    /* renamed from: q, reason: collision with root package name */
    public final Bitmap.Config f13480q;

    /* renamed from: r, reason: collision with root package name */
    public final Picasso.Priority f13481r;

    /* renamed from: e, reason: collision with root package name */
    public final List<P8.j> f13469e = null;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13472h = false;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f13473j = false;
    public final int i = 0;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f13474k = false;

    /* renamed from: l, reason: collision with root package name */
    public final float f13475l = 0.0f;

    /* renamed from: m, reason: collision with root package name */
    public final float f13476m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public final float f13477n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f13478o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f13479p = false;

    /* compiled from: Request.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Uri f13482a;

        /* renamed from: b, reason: collision with root package name */
        public int f13483b;

        /* renamed from: c, reason: collision with root package name */
        public int f13484c;

        /* renamed from: d, reason: collision with root package name */
        public int f13485d;

        /* renamed from: e, reason: collision with root package name */
        public Bitmap.Config f13486e;

        /* renamed from: f, reason: collision with root package name */
        public Picasso.Priority f13487f;

        public final void a(int i, int i9) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i9 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i9 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.f13484c = i;
            this.f13485d = i9;
        }
    }

    public k(Uri uri, int i, int i9, int i10, Bitmap.Config config, Picasso.Priority priority) {
        this.f13467c = uri;
        this.f13468d = i;
        this.f13470f = i9;
        this.f13471g = i10;
        this.f13480q = config;
        this.f13481r = priority;
    }

    public final boolean a() {
        return (this.f13470f == 0 && this.f13471g == 0) ? false : true;
    }

    public final String b() {
        long nanoTime = System.nanoTime() - this.f13466b;
        if (nanoTime > f13464s) {
            return d() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return d() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    public final boolean c() {
        return a() || this.f13475l != 0.0f;
    }

    public final String d() {
        return androidx.camera.core.impl.utils.a.m(new StringBuilder("[R"), this.f13465a, ']');
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{");
        int i = this.f13468d;
        if (i > 0) {
            sb2.append(i);
        } else {
            sb2.append(this.f13467c);
        }
        List<P8.j> list = this.f13469e;
        if (list != null && !list.isEmpty()) {
            for (P8.j jVar : list) {
                sb2.append(' ');
                sb2.append(jVar.a());
            }
        }
        int i9 = this.f13470f;
        if (i9 > 0) {
            sb2.append(" resize(");
            sb2.append(i9);
            sb2.append(',');
            sb2.append(this.f13471g);
            sb2.append(')');
        }
        if (this.f13472h) {
            sb2.append(" centerCrop");
        }
        if (this.f13473j) {
            sb2.append(" centerInside");
        }
        float f10 = this.f13475l;
        if (f10 != 0.0f) {
            sb2.append(" rotation(");
            sb2.append(f10);
            if (this.f13478o) {
                sb2.append(" @ ");
                sb2.append(this.f13476m);
                sb2.append(',');
                sb2.append(this.f13477n);
            }
            sb2.append(')');
        }
        if (this.f13479p) {
            sb2.append(" purgeable");
        }
        Bitmap.Config config = this.f13480q;
        if (config != null) {
            sb2.append(' ');
            sb2.append(config);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
