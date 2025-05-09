package P8;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.o;

/* compiled from: Stats.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final P8.a f3114a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3115b;

    /* renamed from: c, reason: collision with root package name */
    public long f3116c;

    /* renamed from: d, reason: collision with root package name */
    public long f3117d;

    /* renamed from: e, reason: collision with root package name */
    public long f3118e;

    /* renamed from: f, reason: collision with root package name */
    public long f3119f;

    /* renamed from: g, reason: collision with root package name */
    public long f3120g;

    /* renamed from: h, reason: collision with root package name */
    public long f3121h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public long f3122j;

    /* renamed from: k, reason: collision with root package name */
    public int f3123k;

    /* renamed from: l, reason: collision with root package name */
    public int f3124l;

    /* renamed from: m, reason: collision with root package name */
    public int f3125m;

    /* compiled from: Stats.java */
    public static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final h f3126a;

        /* compiled from: Stats.java */
        /* renamed from: P8.h$a$a, reason: collision with other inner class name */
        public class RunnableC0037a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Message f3127a;

            public RunnableC0037a(Message message) {
                this.f3127a = message;
            }

            @Override // java.lang.Runnable
            public final void run() {
                throw new AssertionError("Unhandled stats message." + this.f3127a.what);
            }
        }

        public a(Looper looper, h hVar) {
            super(looper);
            this.f3126a = hVar;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            h hVar = this.f3126a;
            if (i == 0) {
                hVar.f3116c++;
                return;
            }
            if (i == 1) {
                hVar.f3117d++;
                return;
            }
            if (i == 2) {
                long j10 = message.arg1;
                int i9 = hVar.f3124l + 1;
                hVar.f3124l = i9;
                long j11 = hVar.f3119f + j10;
                hVar.f3119f = j11;
                hVar.i = j11 / i9;
                return;
            }
            if (i == 3) {
                long j12 = message.arg1;
                hVar.f3125m++;
                long j13 = hVar.f3120g + j12;
                hVar.f3120g = j13;
                hVar.f3122j = j13 / hVar.f3124l;
                return;
            }
            if (i != 4) {
                Picasso.f13371n.post(new RunnableC0037a(message));
                return;
            }
            Long l10 = (Long) message.obj;
            hVar.f3123k++;
            long longValue = l10.longValue() + hVar.f3118e;
            hVar.f3118e = longValue;
            hVar.f3121h = longValue / hVar.f3123k;
        }
    }

    public h(P8.a aVar) {
        this.f3114a = aVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb2 = o.f13496a;
        k kVar = new k(looper);
        kVar.sendMessageDelayed(kVar.obtainMessage(), 1000L);
        this.f3115b = new a(handlerThread.getLooper(), this);
    }

    public final i a() {
        e eVar = (e) this.f3114a;
        return new i(eVar.f3103a.maxSize(), eVar.f3103a.size(), this.f3116c, this.f3117d, this.f3118e, this.f3119f, this.f3120g, this.f3121h, this.i, this.f3122j, this.f3123k, this.f3124l, this.f3125m, System.currentTimeMillis());
    }
}
