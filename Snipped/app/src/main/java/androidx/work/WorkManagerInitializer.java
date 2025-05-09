package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import s1.AbstractC1197g;
import s1.AbstractC1200j;
import t1.k;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements g1.b<AbstractC1200j> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8109a = AbstractC1197g.e("WrkMgrInitializer");

    @Override // g1.b
    public final List<Class<? extends g1.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // g1.b
    public final AbstractC1200j b(Context context) {
        AbstractC1197g.c().a(f8109a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        k.c(context, new a(new a.C0086a()));
        return k.b(context);
    }
}
