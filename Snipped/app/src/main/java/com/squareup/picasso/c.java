package com.squareup.picasso;

import C.v;
import Ka.t;
import Ka.t.a;
import Ka.y;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.squareup.picasso.NetworkRequestHandler;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f;
import com.squareup.picasso.m;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BitmapHunter.java */
/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    public static final Object f13410t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static final a f13411u = new a();

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicInteger f13412v = new AtomicInteger();

    /* renamed from: w, reason: collision with root package name */
    public static final b f13413w = new b();

    /* renamed from: a, reason: collision with root package name */
    public final int f13414a = f13412v.incrementAndGet();

    /* renamed from: b, reason: collision with root package name */
    public final Picasso f13415b;

    /* renamed from: c, reason: collision with root package name */
    public final com.squareup.picasso.f f13416c;

    /* renamed from: d, reason: collision with root package name */
    public final P8.a f13417d;

    /* renamed from: e, reason: collision with root package name */
    public final P8.h f13418e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13419f;

    /* renamed from: g, reason: collision with root package name */
    public final k f13420g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13421h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final m f13422j;

    /* renamed from: k, reason: collision with root package name */
    public com.squareup.picasso.a f13423k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f13424l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f13425m;

    /* renamed from: n, reason: collision with root package name */
    public Future<?> f13426n;

    /* renamed from: o, reason: collision with root package name */
    public Picasso.LoadedFrom f13427o;

    /* renamed from: p, reason: collision with root package name */
    public Exception f13428p;

    /* renamed from: q, reason: collision with root package name */
    public int f13429q;

    /* renamed from: r, reason: collision with root package name */
    public int f13430r;

    /* renamed from: s, reason: collision with root package name */
    public Picasso.Priority f13431s;

    /* compiled from: BitmapHunter.java */
    public static class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        public final StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* compiled from: BitmapHunter.java */
    public static class b extends m {
        @Override // com.squareup.picasso.m
        public final boolean b(k kVar) {
            return true;
        }

        @Override // com.squareup.picasso.m
        public final m.a e(k kVar, int i) {
            throw new IllegalStateException("Unrecognized type of request: " + kVar);
        }
    }

    /* compiled from: BitmapHunter.java */
    /* renamed from: com.squareup.picasso.c$c, reason: collision with other inner class name */
    public static class RunnableC0141c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ P8.j f13432a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RuntimeException f13433b;

        public RunnableC0141c(P8.j jVar, RuntimeException runtimeException) {
            this.f13432a = jVar;
            this.f13433b = runtimeException;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw new RuntimeException("Transformation " + this.f13432a.a() + " crashed with exception.", this.f13433b);
        }
    }

    /* compiled from: BitmapHunter.java */
    public static class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f13434a;

        public d(StringBuilder sb2) {
            this.f13434a = sb2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw new NullPointerException(this.f13434a.toString());
        }
    }

    /* compiled from: BitmapHunter.java */
    public static class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ P8.j f13435a;

        public e(P8.j jVar) {
            this.f13435a = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw new IllegalStateException("Transformation " + this.f13435a.a() + " returned input Bitmap but recycled it.");
        }
    }

    /* compiled from: BitmapHunter.java */
    public static class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ P8.j f13436a;

        public f(P8.j jVar) {
            this.f13436a = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw new IllegalStateException("Transformation " + this.f13436a.a() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    public c(Picasso picasso, com.squareup.picasso.f fVar, P8.a aVar, P8.h hVar, com.squareup.picasso.a aVar2, m mVar) {
        this.f13415b = picasso;
        this.f13416c = fVar;
        this.f13417d = aVar;
        this.f13418e = hVar;
        this.f13423k = aVar2;
        this.f13419f = aVar2.i;
        k kVar = aVar2.f13396b;
        this.f13420g = kVar;
        this.f13431s = kVar.f13481r;
        this.f13421h = aVar2.f13399e;
        this.i = aVar2.f13400f;
        this.f13422j = mVar;
        this.f13430r = mVar.d();
    }

    public static Bitmap a(List<P8.j> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            P8.j jVar = list.get(i);
            try {
                Bitmap b9 = jVar.b();
                if (b9 == null) {
                    StringBuilder s10 = v.s("Transformation ");
                    s10.append(jVar.a());
                    s10.append(" returned null after ");
                    s10.append(i);
                    s10.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<P8.j> it = list.iterator();
                    while (it.hasNext()) {
                        s10.append(it.next().a());
                        s10.append('\n');
                    }
                    Picasso.f13371n.post(new d(s10));
                    return null;
                }
                if (b9 == bitmap && bitmap.isRecycled()) {
                    Picasso.f13371n.post(new e(jVar));
                    return null;
                }
                if (b9 != bitmap && !bitmap.isRecycled()) {
                    Picasso.f13371n.post(new f(jVar));
                    return null;
                }
                i++;
                bitmap = b9;
            } catch (RuntimeException e10) {
                Picasso.f13371n.post(new RunnableC0141c(jVar, e10));
                return null;
            }
        }
        return bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap c(y yVar, k kVar) {
        t tVar = new t(yVar);
        boolean z10 = tVar.i(0L, o.f13497b) && tVar.i(8L, o.f13498c);
        boolean z11 = kVar.f13479p;
        BitmapFactory.Options c2 = m.c(kVar);
        boolean z12 = c2 != null && c2.inJustDecodeBounds;
        int i = kVar.f13471g;
        int i9 = kVar.f13470f;
        if (z10) {
            byte[] q10 = tVar.q();
            if (z12) {
                BitmapFactory.decodeByteArray(q10, 0, q10.length, c2);
                m.a(i9, i, c2.outWidth, c2.outHeight, c2, kVar);
            }
            return BitmapFactory.decodeByteArray(q10, 0, q10.length, c2);
        }
        t.a aVar = tVar.new a();
        if (z12) {
            P8.f fVar = new P8.f(aVar);
            fVar.f3111f = false;
            long j10 = fVar.f3107b + 1024;
            if (fVar.f3109d < j10) {
                fVar.i(j10);
            }
            long j11 = fVar.f3107b;
            BitmapFactory.decodeStream(fVar, null, c2);
            m.a(i9, i, c2.outWidth, c2.outHeight, c2, kVar);
            fVar.d(j11);
            fVar.f3111f = true;
            aVar = fVar;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(aVar, null, c2);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    public static boolean f(int i, int i9, int i10, int i11, boolean z10) {
        return !z10 || (i10 != 0 && i > i10) || (i11 != 0 && i9 > i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0139, code lost:
    
        if (r5 != 270) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap g(com.squareup.picasso.k r26, android.graphics.Bitmap r27, int r28) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.g(com.squareup.picasso.k, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static void h(k kVar) {
        Uri uri = kVar.f13467c;
        String valueOf = uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(kVar.f13468d);
        StringBuilder sb2 = f13411u.get();
        sb2.ensureCapacity(valueOf.length() + 8);
        sb2.replace(8, sb2.length(), valueOf);
        Thread.currentThread().setName(sb2.toString());
    }

    public final boolean b() {
        Future<?> future;
        if (this.f13423k != null) {
            return false;
        }
        ArrayList arrayList = this.f13424l;
        return (arrayList == null || arrayList.isEmpty()) && (future = this.f13426n) != null && future.cancel(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0010, code lost:
    
        if (r0.remove(r7) != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.squareup.picasso.a r7) {
        /*
            r6 = this;
            com.squareup.picasso.a r0 = r6.f13423k
            if (r0 != r7) goto L8
            r0 = 0
            r6.f13423k = r0
            goto L12
        L8:
            java.util.ArrayList r0 = r6.f13424l
            if (r0 == 0) goto L5c
            boolean r0 = r0.remove(r7)
            if (r0 == 0) goto L5c
        L12:
            com.squareup.picasso.k r0 = r7.f13396b
            com.squareup.picasso.Picasso$Priority r0 = r0.f13481r
            com.squareup.picasso.Picasso$Priority r1 = r6.f13431s
            if (r0 != r1) goto L5c
            com.squareup.picasso.Picasso$Priority r0 = com.squareup.picasso.Picasso.Priority.f13389a
            java.util.ArrayList r1 = r6.f13424l
            r2 = 0
            if (r1 == 0) goto L29
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L29
            r1 = 1
            goto L2a
        L29:
            r1 = r2
        L2a:
            com.squareup.picasso.a r3 = r6.f13423k
            if (r3 != 0) goto L30
            if (r1 == 0) goto L5a
        L30:
            if (r3 == 0) goto L36
            com.squareup.picasso.k r0 = r3.f13396b
            com.squareup.picasso.Picasso$Priority r0 = r0.f13481r
        L36:
            if (r1 == 0) goto L5a
            java.util.ArrayList r1 = r6.f13424l
            int r1 = r1.size()
        L3e:
            if (r2 >= r1) goto L5a
            java.util.ArrayList r3 = r6.f13424l
            java.lang.Object r3 = r3.get(r2)
            com.squareup.picasso.a r3 = (com.squareup.picasso.a) r3
            com.squareup.picasso.k r3 = r3.f13396b
            com.squareup.picasso.Picasso$Priority r3 = r3.f13481r
            int r4 = r3.ordinal()
            int r5 = r0.ordinal()
            if (r4 <= r5) goto L57
            r0 = r3
        L57:
            int r2 = r2 + 1
            goto L3e
        L5a:
            r6.f13431s = r0
        L5c:
            com.squareup.picasso.Picasso r0 = r6.f13415b
            boolean r0 = r0.f13383m
            if (r0 == 0) goto L75
            com.squareup.picasso.k r7 = r7.f13396b
            java.lang.String r7 = r7.b()
            java.lang.String r0 = "from "
            java.lang.String r0 = com.squareup.picasso.o.a(r6, r0)
            java.lang.String r1 = "Hunter"
            java.lang.String r2 = "removed"
            com.squareup.picasso.o.c(r1, r2, r7, r0)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.d(com.squareup.picasso.a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00de A[Catch: all -> 0x00bb, TryCatch #1 {all -> 0x00bb, blocks: (B:48:0x00ae, B:50:0x00b6, B:53:0x00d8, B:55:0x00de, B:57:0x00e8, B:58:0x00f7, B:66:0x00bd, B:68:0x00cb), top: B:47:0x00ae }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap e() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.e():android.graphics.Bitmap");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                try {
                    try {
                        h(this.f13420g);
                        if (this.f13415b.f13383m) {
                            o.b("Hunter", "executing", o.a(this, ""));
                        }
                        Bitmap e10 = e();
                        this.f13425m = e10;
                        if (e10 == null) {
                            f.a aVar = this.f13416c.f13447h;
                            aVar.sendMessage(aVar.obtainMessage(6, this));
                        } else {
                            this.f13416c.b(this);
                        }
                    } catch (IOException e11) {
                        this.f13428p = e11;
                        f.a aVar2 = this.f13416c.f13447h;
                        aVar2.sendMessageDelayed(aVar2.obtainMessage(5, this), 500L);
                    } catch (Exception e12) {
                        this.f13428p = e12;
                        f.a aVar3 = this.f13416c.f13447h;
                        aVar3.sendMessage(aVar3.obtainMessage(6, this));
                    }
                } catch (NetworkRequestHandler.ResponseException e13) {
                    if ((e13.f13370b & 4) == 0 || e13.f13369a != 504) {
                        this.f13428p = e13;
                    }
                    f.a aVar4 = this.f13416c.f13447h;
                    aVar4.sendMessage(aVar4.obtainMessage(6, this));
                }
            } catch (OutOfMemoryError e14) {
                StringWriter stringWriter = new StringWriter();
                this.f13418e.a().a(new PrintWriter(stringWriter));
                this.f13428p = new RuntimeException(stringWriter.toString(), e14);
                f.a aVar5 = this.f13416c.f13447h;
                aVar5.sendMessage(aVar5.obtainMessage(6, this));
            }
            Thread.currentThread().setName("Picasso-Idle");
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }
}
