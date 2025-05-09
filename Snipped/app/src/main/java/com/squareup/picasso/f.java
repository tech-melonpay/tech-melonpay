package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: Dispatcher.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13440a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f13441b;

    /* renamed from: c, reason: collision with root package name */
    public final P8.c f13442c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f13443d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f13444e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakHashMap f13445f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f13446g;

    /* renamed from: h, reason: collision with root package name */
    public final a f13447h;
    public final Handler i;

    /* renamed from: j, reason: collision with root package name */
    public final P8.a f13448j;

    /* renamed from: k, reason: collision with root package name */
    public final P8.h f13449k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f13450l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f13451m;

    /* compiled from: Dispatcher.java */
    public static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final f f13452a;

        /* compiled from: Dispatcher.java */
        /* renamed from: com.squareup.picasso.f$a$a, reason: collision with other inner class name */
        public class RunnableC0142a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Message f13453a;

            public RunnableC0142a(Message message) {
                this.f13453a = message;
            }

            @Override // java.lang.Runnable
            public final void run() {
                throw new AssertionError("Unknown handler message received: " + this.f13453a.what);
            }
        }

        public a(Looper looper, f fVar) {
            super(looper);
            this.f13452a = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:169:0x02c2  */
        /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r17) {
            /*
                Method dump skipped, instructions count: 1058
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.f.a.handleMessage(android.os.Message):void");
        }
    }

    /* compiled from: Dispatcher.java */
    public static class b extends HandlerThread {
    }

    /* compiled from: Dispatcher.java */
    public static class c extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final f f13454a;

        public c(f fVar) {
            this.f13454a = fVar;
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            boolean equals = "android.intent.action.AIRPLANE_MODE".equals(action);
            f fVar = this.f13454a;
            if (equals) {
                if (intent.hasExtra("state")) {
                    boolean booleanExtra = intent.getBooleanExtra("state", false);
                    a aVar = fVar.f13447h;
                    aVar.sendMessage(aVar.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                    return;
                }
                return;
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                StringBuilder sb2 = o.f13496a;
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                a aVar2 = fVar.f13447h;
                aVar2.sendMessage(aVar2.obtainMessage(9, activeNetworkInfo));
            }
        }
    }

    public f(Context context, ExecutorService executorService, Picasso.a aVar, P8.c cVar, P8.a aVar2, P8.h hVar) {
        b bVar = new b("Picasso-Dispatcher", 10);
        bVar.start();
        Looper looper = bVar.getLooper();
        StringBuilder sb2 = o.f13496a;
        P8.k kVar = new P8.k(looper);
        kVar.sendMessageDelayed(kVar.obtainMessage(), 1000L);
        this.f13440a = context;
        this.f13441b = executorService;
        this.f13443d = new LinkedHashMap();
        this.f13444e = new WeakHashMap();
        this.f13445f = new WeakHashMap();
        this.f13446g = new LinkedHashSet();
        this.f13447h = new a(bVar.getLooper(), this);
        this.f13442c = cVar;
        this.i = aVar;
        this.f13448j = aVar2;
        this.f13449k = hVar;
        this.f13450l = new ArrayList(4);
        try {
            Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException | SecurityException unused) {
        }
        this.f13451m = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        c cVar2 = new c(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        f fVar = cVar2.f13454a;
        if (fVar.f13451m) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        fVar.f13440a.registerReceiver(cVar2, intentFilter);
    }

    public final void a(com.squareup.picasso.c cVar) {
        Future<?> future = cVar.f13426n;
        if (future == null || !future.isCancelled()) {
            Bitmap bitmap = cVar.f13425m;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f13450l.add(cVar);
            a aVar = this.f13447h;
            if (aVar.hasMessages(7)) {
                return;
            }
            aVar.sendEmptyMessageDelayed(7, 200L);
        }
    }

    public final void b(com.squareup.picasso.c cVar) {
        a aVar = this.f13447h;
        aVar.sendMessage(aVar.obtainMessage(4, cVar));
    }

    public final void c(com.squareup.picasso.c cVar, boolean z10) {
        if (cVar.f13415b.f13383m) {
            o.c("Dispatcher", "batched", o.a(cVar, ""), "for error".concat(z10 ? " (will replay)" : ""));
        }
        this.f13443d.remove(cVar.f13419f);
        a(cVar);
    }

    public final void d(com.squareup.picasso.a aVar, boolean z10) {
        com.squareup.picasso.c cVar;
        if (this.f13446g.contains(aVar.f13403j)) {
            this.f13445f.put(aVar.d(), aVar);
            if (aVar.f13395a.f13383m) {
                o.c("Dispatcher", "paused", aVar.f13396b.b(), "because tag '" + aVar.f13403j + "' is paused");
                return;
            }
            return;
        }
        com.squareup.picasso.c cVar2 = (com.squareup.picasso.c) this.f13443d.get(aVar.i);
        if (cVar2 != null) {
            boolean z11 = cVar2.f13415b.f13383m;
            k kVar = aVar.f13396b;
            if (cVar2.f13423k == null) {
                cVar2.f13423k = aVar;
                if (z11) {
                    ArrayList arrayList = cVar2.f13424l;
                    if (arrayList == null || arrayList.isEmpty()) {
                        o.c("Hunter", "joined", kVar.b(), "to empty hunter");
                        return;
                    } else {
                        o.c("Hunter", "joined", kVar.b(), o.a(cVar2, "to "));
                        return;
                    }
                }
                return;
            }
            if (cVar2.f13424l == null) {
                cVar2.f13424l = new ArrayList(3);
            }
            cVar2.f13424l.add(aVar);
            if (z11) {
                o.c("Hunter", "joined", kVar.b(), o.a(cVar2, "to "));
            }
            Picasso.Priority priority = aVar.f13396b.f13481r;
            if (priority.ordinal() > cVar2.f13431s.ordinal()) {
                cVar2.f13431s = priority;
                return;
            }
            return;
        }
        if (this.f13441b.isShutdown()) {
            if (aVar.f13395a.f13383m) {
                o.c("Dispatcher", "ignored", aVar.f13396b.b(), "because shut down");
                return;
            }
            return;
        }
        Picasso picasso = aVar.f13395a;
        P8.a aVar2 = this.f13448j;
        P8.h hVar = this.f13449k;
        Object obj = com.squareup.picasso.c.f13410t;
        k kVar2 = aVar.f13396b;
        List<m> list = picasso.f13374c;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                cVar = new com.squareup.picasso.c(picasso, this, aVar2, hVar, aVar, com.squareup.picasso.c.f13413w);
                break;
            }
            m mVar = list.get(i);
            if (mVar.b(kVar2)) {
                cVar = new com.squareup.picasso.c(picasso, this, aVar2, hVar, aVar, mVar);
                break;
            }
            i++;
        }
        cVar.f13426n = this.f13441b.submit(cVar);
        this.f13443d.put(aVar.i, cVar);
        if (z10) {
            this.f13444e.remove(aVar.d());
        }
        if (aVar.f13395a.f13383m) {
            o.b("Dispatcher", "enqueued", aVar.f13396b.b());
        }
    }
}
