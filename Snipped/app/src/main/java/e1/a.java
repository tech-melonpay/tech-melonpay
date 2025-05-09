package E1;

import B1.p;
import B1.r;
import android.content.Context;
import android.text.TextUtils;
import androidx.camera.core.n;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.Collections;
import s1.AbstractC1197g;
import s3.b;
import t1.k;
import x1.C1583d;

/* compiled from: ConstraintTrackingWorker.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1039b;

    public /* synthetic */ a(Object obj, int i) {
        this.f1038a = i;
        this.f1039b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1038a) {
            case 0:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f1039b;
                Object obj = constraintTrackingWorker.f8086b.f8112b.f8128a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                String str = obj instanceof String ? (String) obj : null;
                if (TextUtils.isEmpty(str)) {
                    AbstractC1197g.c().b(ConstraintTrackingWorker.f8245k, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.i.i(new ListenableWorker.a.C0085a());
                    return;
                }
                ListenableWorker a10 = constraintTrackingWorker.f8086b.f8115e.a(constraintTrackingWorker.f8085a, str, constraintTrackingWorker.f8246f);
                constraintTrackingWorker.f8249j = a10;
                if (a10 == null) {
                    AbstractC1197g.c().a(ConstraintTrackingWorker.f8245k, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.i.i(new ListenableWorker.a.C0085a());
                    return;
                }
                p h9 = ((r) k.b(constraintTrackingWorker.f8085a).f27440c.f()).h(constraintTrackingWorker.f8086b.f8111a.toString());
                if (h9 == null) {
                    constraintTrackingWorker.i.i(new ListenableWorker.a.C0085a());
                    return;
                }
                Context context = constraintTrackingWorker.f8085a;
                C1583d c1583d = new C1583d(context, k.b(context).f27441d, constraintTrackingWorker);
                c1583d.b(Collections.singletonList(h9));
                if (!c1583d.a(constraintTrackingWorker.f8086b.f8111a.toString())) {
                    AbstractC1197g.c().a(ConstraintTrackingWorker.f8245k, n.a("Constraints not met for delegate ", str, ". Requesting retry."), new Throwable[0]);
                    constraintTrackingWorker.i.i(new ListenableWorker.a.b());
                    return;
                }
                AbstractC1197g.c().a(ConstraintTrackingWorker.f8245k, b.j("Constraints met for delegate ", str), new Throwable[0]);
                try {
                    androidx.work.impl.utils.futures.a f10 = constraintTrackingWorker.f8249j.f();
                    f10.addListener(new A3.k(2, constraintTrackingWorker, f10, false), constraintTrackingWorker.f8086b.f8113c);
                    return;
                } catch (Throwable th) {
                    AbstractC1197g c2 = AbstractC1197g.c();
                    String str2 = ConstraintTrackingWorker.f8245k;
                    c2.a(str2, n.a("Delegated worker ", str, " threw exception in startWork."), th);
                    synchronized (constraintTrackingWorker.f8247g) {
                        try {
                            if (constraintTrackingWorker.f8248h) {
                                AbstractC1197g.c().a(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                                constraintTrackingWorker.i.i(new ListenableWorker.a.b());
                            } else {
                                constraintTrackingWorker.i.i(new ListenableWorker.a.C0085a());
                            }
                            return;
                        } finally {
                        }
                    }
                }
            case 1:
                ((BaseTransientBottomBar) this.f1039b).c();
                return;
            default:
                q1.a aVar = (q1.a) this.f1039b;
                aVar.f25834k = false;
                aVar.f();
                return;
        }
    }
}
