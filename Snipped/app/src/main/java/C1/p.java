package C1;

import android.content.Context;
import androidx.work.WorkInfo$State;
import androidx.work.impl.utils.futures.AbstractFuture;
import java.util.UUID;
import s1.C1194d;

/* compiled from: WorkForegroundUpdater.java */
/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.utils.futures.a f643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1194d f645c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f647e;

    public p(q qVar, androidx.work.impl.utils.futures.a aVar, UUID uuid, C1194d c1194d, Context context) {
        this.f647e = qVar;
        this.f643a = aVar;
        this.f644b = uuid;
        this.f645c = c1194d;
        this.f646d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f643a.f8220a instanceof AbstractFuture.b)) {
                String uuid = this.f644b.toString();
                WorkInfo$State f10 = ((B1.r) this.f647e.f650c).f(uuid);
                if (f10 == null || f10.a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((t1.d) this.f647e.f649b).f(uuid, this.f645c);
                this.f646d.startService(androidx.work.impl.foreground.a.a(this.f646d, uuid, this.f645c));
            }
            this.f643a.i(null);
        } catch (Throwable th) {
            this.f643a.j(th);
        }
    }
}
