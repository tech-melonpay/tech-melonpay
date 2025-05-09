package C1;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;
import s1.AbstractC1197g;
import s1.C1194d;
import s1.InterfaceC1195e;
import t0.C1274a;

/* compiled from: WorkForegroundRunnable.java */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final String f632g = AbstractC1197g.e("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<Void> f633a = new androidx.work.impl.utils.futures.a<>();

    /* renamed from: b, reason: collision with root package name */
    public final Context f634b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.p f635c;

    /* renamed from: d, reason: collision with root package name */
    public final ListenableWorker f636d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1195e f637e;

    /* renamed from: f, reason: collision with root package name */
    public final D1.a f638f;

    /* compiled from: WorkForegroundRunnable.java */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.utils.futures.a f639a;

        public a(androidx.work.impl.utils.futures.a aVar) {
            this.f639a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f639a.k(o.this.f636d.a());
        }
    }

    /* compiled from: WorkForegroundRunnable.java */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.utils.futures.a f641a;

        public b(androidx.work.impl.utils.futures.a aVar) {
            this.f641a = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            o oVar = o.this;
            try {
                C1194d c1194d = (C1194d) this.f641a.get();
                if (c1194d == null) {
                    throw new IllegalStateException("Worker was marked important (" + oVar.f635c.f245c + ") but did not provide ForegroundInfo");
                }
                AbstractC1197g.c().a(o.f632g, "Updating notification for " + oVar.f635c.f245c, new Throwable[0]);
                ListenableWorker listenableWorker = oVar.f636d;
                listenableWorker.f8089e = true;
                androidx.work.impl.utils.futures.a<Void> aVar = oVar.f633a;
                InterfaceC1195e interfaceC1195e = oVar.f637e;
                Context context = oVar.f634b;
                UUID uuid = listenableWorker.f8086b.f8111a;
                q qVar = (q) interfaceC1195e;
                qVar.getClass();
                androidx.work.impl.utils.futures.a aVar2 = new androidx.work.impl.utils.futures.a();
                ((D1.b) qVar.f648a).a(new p(qVar, aVar2, uuid, c1194d, context));
                aVar.k(aVar2);
            } catch (Throwable th) {
                oVar.f633a.j(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public o(Context context, B1.p pVar, ListenableWorker listenableWorker, q qVar, D1.a aVar) {
        this.f634b = context;
        this.f635c = pVar;
        this.f636d = listenableWorker;
        this.f637e = qVar;
        this.f638f = aVar;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (!this.f635c.f258q || C1274a.b()) {
            this.f633a.i(null);
            return;
        }
        androidx.work.impl.utils.futures.a aVar = new androidx.work.impl.utils.futures.a();
        D1.b bVar = (D1.b) this.f638f;
        bVar.f860c.execute(new a(aVar));
        aVar.addListener(new b(aVar), bVar.f860c);
    }
}
