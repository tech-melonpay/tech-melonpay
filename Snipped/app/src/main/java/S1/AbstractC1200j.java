package s1;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.camera.core.n;
import java.util.Collections;
import java.util.List;

/* compiled from: WorkManager.java */
@SuppressLint({"AddedAbstractMethod"})
/* renamed from: s1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1200j {
    public final void a(C1198h c1198h) {
        List singletonList = Collections.singletonList(c1198h);
        t1.k kVar = (t1.k) this;
        if (singletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        t1.g gVar = new t1.g(kVar, singletonList);
        if (gVar.i) {
            AbstractC1197g.c().f(t1.g.f27424j, n.a("Already enqueued work ids (", TextUtils.join(", ", gVar.f27429f), ")"), new Throwable[0]);
        } else {
            ((D1.b) kVar.f27441d).a(new C1.d(gVar));
        }
    }
}
