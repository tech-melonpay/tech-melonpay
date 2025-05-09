package z;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;
import s.a;
import t.C1257i;
import t.RunnableC1255g;
import t.l0;

/* compiled from: Camera2CameraControl.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public final C1257i f31206c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f31207d;

    /* renamed from: g, reason: collision with root package name */
    public CallbackToFutureAdapter.a<Void> f31210g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f31204a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31205b = false;

    /* renamed from: e, reason: collision with root package name */
    public final Object f31208e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public a.C0469a f31209f = new a.C0469a();

    /* renamed from: h, reason: collision with root package name */
    public final l0 f31211h = new l0(this, 1);

    public c(C1257i c1257i, Executor executor) {
        this.f31206c = c1257i;
        this.f31207d = executor;
    }

    public final s.a a() {
        s.a build;
        synchronized (this.f31208e) {
            try {
                CallbackToFutureAdapter.a<Void> aVar = this.f31210g;
                if (aVar != null) {
                    this.f31209f.f26494a.insertOption(s.a.f26493h, Integer.valueOf(aVar.hashCode()));
                }
                build = this.f31209f.build();
            } catch (Throwable th) {
                throw th;
            }
        }
        return build;
    }

    public final void b(CallbackToFutureAdapter.a<Void> aVar) {
        this.f31205b = true;
        CallbackToFutureAdapter.a<Void> aVar2 = this.f31210g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f31210g = aVar;
        if (this.f31204a) {
            C1257i c1257i = this.f31206c;
            c1257i.getClass();
            c1257i.f27245b.execute(new RunnableC1255g(c1257i, 1));
            this.f31205b = false;
        }
        if (aVar2 != null) {
            s3.b.v("Camera2CameraControl was updated with new options.", aVar2);
        }
    }
}
