package A3;

import a3.InterfaceFutureC0509a;
import android.graphics.Typeface;
import android.util.Log;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import j0.C0876e;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.Callable;
import m0.f;
import n0.e;
import pa.C1124b;
import s1.AbstractC1197g;
import u1.C1510a;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f72b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f73c;

    public /* synthetic */ k(int i, Object obj, Object obj2) {
        this.f71a = i;
        this.f72b = obj;
        this.f73c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f71a) {
            case 0:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f72b;
                while (!((Set) this.f73c).isEmpty()) {
                    try {
                        m mVar = (m) referenceQueue.remove();
                        if (mVar.f75a.remove(mVar)) {
                            mVar.clear();
                            mVar.f76b.run();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 1:
                Callable callable = (Callable) this.f72b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f73c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (MlKitException e10) {
                    taskCompletionSource.setException(e10);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(new MlKitException(Preconditions.checkNotEmpty("Internal error has occurred when executing ML Kit tasks", "Provided message must not be empty."), e11));
                    return;
                }
            case 2:
                synchronized (((ConstraintTrackingWorker) this.f73c).f8247g) {
                    if (((ConstraintTrackingWorker) this.f73c).f8248h) {
                        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f73c;
                        constraintTrackingWorker.getClass();
                        constraintTrackingWorker.i.i(new ListenableWorker.a.b());
                    } else {
                        ((ConstraintTrackingWorker) this.f73c).i.k((InterfaceFutureC0509a) this.f72b);
                    }
                }
                return;
            case 3:
                try {
                    Method method = C0876e.f22252d;
                    Object obj = this.f73c;
                    Object obj2 = this.f72b;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        C0876e.f22253e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e12) {
                    if (e12.getClass() == RuntimeException.class && e12.getMessage() != null && e12.getMessage().startsWith("Unable to stop")) {
                        throw e12;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                f.c cVar = ((e.a) ((C1124b) this.f72b)).f24075a;
                if (cVar != null) {
                    cVar.c((Typeface) this.f73c);
                    return;
                }
                return;
            default:
                AbstractC1197g c2 = AbstractC1197g.c();
                String str = C1510a.f30129d;
                B1.p pVar = (B1.p) this.f72b;
                c2.a(str, s3.b.j("Scheduling work ", pVar.f243a), new Throwable[0]);
                ((C1510a) this.f73c).f30130a.f(pVar);
                return;
        }
    }

    public /* synthetic */ k(int i, Object obj, Object obj2, boolean z10) {
        this.f71a = i;
        this.f73c = obj;
        this.f72b = obj2;
    }
}
