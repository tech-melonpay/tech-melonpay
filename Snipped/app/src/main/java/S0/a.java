package S0;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: CloseableCoroutineScope.kt */
/* loaded from: classes.dex */
public final class a implements AutoCloseable, CoroutineScope {

    /* renamed from: a, reason: collision with root package name */
    public final d f3328a;

    public a(d dVar) {
        this.f3328a = dVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        JobKt__JobKt.cancel$default(this.f3328a, (CancellationException) null, 1, (Object) null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final d getCoroutineContext() {
        return this.f3328a;
    }
}
