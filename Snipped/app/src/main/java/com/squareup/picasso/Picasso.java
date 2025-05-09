package com.squareup.picasso;

import P8.e;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.a;
import com.squareup.picasso.f;
import com.sumsub.sns.internal.core.a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class Picasso {

    /* renamed from: n, reason: collision with root package name */
    public static final a f13371n = new a(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final c f13372a;

    /* renamed from: b, reason: collision with root package name */
    public final d f13373b;

    /* renamed from: c, reason: collision with root package name */
    public final List<m> f13374c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f13375d;

    /* renamed from: e, reason: collision with root package name */
    public final f f13376e;

    /* renamed from: f, reason: collision with root package name */
    public final P8.a f13377f;

    /* renamed from: g, reason: collision with root package name */
    public final P8.h f13378g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f13379h;
    public final WeakHashMap i;

    /* renamed from: j, reason: collision with root package name */
    public final ReferenceQueue<Object> f13380j;

    /* renamed from: k, reason: collision with root package name */
    public final Bitmap.Config f13381k = null;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f13382l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f13383m;

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);


        /* renamed from: a, reason: collision with root package name */
        public final int f13388a;

        LoadedFrom(int i) {
            this.f13388a = i;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Priority {

        /* renamed from: a, reason: collision with root package name */
        public static final Priority f13389a;

        /* renamed from: b, reason: collision with root package name */
        public static final Priority f13390b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Priority[] f13391c;

        static {
            Priority priority = new Priority("LOW", 0);
            f13389a = priority;
            Priority priority2 = new Priority("NORMAL", 1);
            f13390b = priority2;
            f13391c = new Priority[]{priority, priority2, new Priority("HIGH", 2)};
        }

        public Priority() {
            throw null;
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) f13391c.clone();
        }
    }

    public static class a extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bitmap bitmap;
            int i = message.what;
            if (i == 3) {
                com.squareup.picasso.a aVar = (com.squareup.picasso.a) message.obj;
                if (aVar.f13395a.f13383m) {
                    o.c("Main", "canceled", aVar.f13396b.b(), "target got garbage collected");
                }
                aVar.f13395a.a(aVar.d());
                return;
            }
            if (i == 8) {
                List list = (List) message.obj;
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    com.squareup.picasso.c cVar = (com.squareup.picasso.c) list.get(i9);
                    Picasso picasso = cVar.f13415b;
                    picasso.getClass();
                    com.squareup.picasso.a aVar2 = cVar.f13423k;
                    ArrayList arrayList = cVar.f13424l;
                    boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
                    if (aVar2 != null || z10) {
                        Uri uri = cVar.f13420g.f13467c;
                        Exception exc = cVar.f13428p;
                        Bitmap bitmap2 = cVar.f13425m;
                        LoadedFrom loadedFrom = cVar.f13427o;
                        if (aVar2 != null) {
                            picasso.b(bitmap2, loadedFrom, aVar2, exc);
                        }
                        if (z10) {
                            int size2 = arrayList.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                picasso.b(bitmap2, loadedFrom, (com.squareup.picasso.a) arrayList.get(i10), exc);
                            }
                        }
                        if (picasso.f13372a != null && exc != null) {
                            a.p.a(picasso, uri, exc);
                        }
                    }
                }
                return;
            }
            if (i != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size3 = list2.size();
            for (int i11 = 0; i11 < size3; i11++) {
                com.squareup.picasso.a aVar3 = (com.squareup.picasso.a) list2.get(i11);
                Picasso picasso2 = aVar3.f13395a;
                picasso2.getClass();
                if ((aVar3.f13399e & 1) == 0) {
                    e.a aVar4 = ((P8.e) picasso2.f13377f).f3103a.get(aVar3.i);
                    bitmap = aVar4 != null ? aVar4.f3104a : null;
                    P8.h hVar = picasso2.f13378g;
                    if (bitmap != null) {
                        hVar.f3115b.sendEmptyMessage(0);
                    } else {
                        hVar.f3115b.sendEmptyMessage(1);
                    }
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    LoadedFrom loadedFrom2 = LoadedFrom.MEMORY;
                    picasso2.b(bitmap, loadedFrom2, aVar3, null);
                    if (picasso2.f13383m) {
                        o.c("Main", "completed", aVar3.f13396b.b(), "from " + loadedFrom2);
                    }
                } else {
                    picasso2.c(aVar3);
                    if (picasso2.f13383m) {
                        o.b("Main", "resumed", aVar3.f13396b.b());
                    }
                }
            }
        }
    }

    public static class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final ReferenceQueue<Object> f13392a;

        /* renamed from: b, reason: collision with root package name */
        public final Handler f13393b;

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Exception f13394a;

            public a(Exception exc) {
                this.f13394a = exc;
            }

            @Override // java.lang.Runnable
            public final void run() {
                throw new RuntimeException(this.f13394a);
            }
        }

        public b(ReferenceQueue referenceQueue, a aVar) {
            this.f13392a = referenceQueue;
            this.f13393b = aVar;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Handler handler = this.f13393b;
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0140a c0140a = (a.C0140a) this.f13392a.remove(1000L);
                    Message obtainMessage = handler.obtainMessage();
                    if (c0140a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c0140a.f13406a;
                        handler.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e10) {
                    handler.post(new a(e10));
                    return;
                }
            }
        }
    }

    public interface c {
    }

    public interface d {
        k f(k kVar);
    }

    public Picasso(Context context, f fVar, P8.a aVar, c cVar, d dVar, P8.h hVar) {
        this.f13375d = context;
        this.f13376e = fVar;
        this.f13377f = aVar;
        this.f13372a = cVar;
        this.f13373b = dVar;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new n(context));
        arrayList.add(new com.squareup.picasso.d(context));
        arrayList.add(new MediaStoreRequestHandler(context));
        arrayList.add(new e(context));
        arrayList.add(new com.squareup.picasso.b(context));
        arrayList.add(new g(context));
        arrayList.add(new NetworkRequestHandler(fVar.f13442c, hVar));
        this.f13374c = Collections.unmodifiableList(arrayList);
        this.f13378g = hVar;
        this.f13379h = new WeakHashMap();
        this.i = new WeakHashMap();
        this.f13382l = false;
        this.f13383m = false;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f13380j = referenceQueue;
        new b(referenceQueue, f13371n).start();
    }

    public final void a(Object obj) {
        StringBuilder sb2 = o.f13496a;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
        com.squareup.picasso.a aVar = (com.squareup.picasso.a) this.f13379h.remove(obj);
        if (aVar != null) {
            aVar.a();
            f.a aVar2 = this.f13376e.f13447h;
            aVar2.sendMessage(aVar2.obtainMessage(2, aVar));
        }
        if (obj instanceof ImageView) {
            if (((P8.b) this.i.remove((ImageView) obj)) != null) {
                throw null;
            }
        }
    }

    public final void b(Bitmap bitmap, LoadedFrom loadedFrom, com.squareup.picasso.a aVar, Exception exc) {
        if (aVar.f13405l) {
            return;
        }
        if (!aVar.f13404k) {
            this.f13379h.remove(aVar.d());
        }
        if (bitmap == null) {
            aVar.c();
            if (this.f13383m) {
                o.c("Main", "errored", aVar.f13396b.b(), exc.getMessage());
                return;
            }
            return;
        }
        if (loadedFrom == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        aVar.b(bitmap, loadedFrom);
        if (this.f13383m) {
            o.c("Main", "completed", aVar.f13396b.b(), "from " + loadedFrom);
        }
    }

    public final void c(com.squareup.picasso.a aVar) {
        Object d10 = aVar.d();
        if (d10 != null) {
            WeakHashMap weakHashMap = this.f13379h;
            if (weakHashMap.get(d10) != aVar) {
                a(d10);
                weakHashMap.put(d10, aVar);
            }
        }
        f.a aVar2 = this.f13376e.f13447h;
        aVar2.sendMessage(aVar2.obtainMessage(1, aVar));
    }
}
