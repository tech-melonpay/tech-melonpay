package kotlinx.coroutines.test;

import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.d;

/* compiled from: TestCoroutineScheduler.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/test/BackgroundWork;", "Lkotlin/coroutines/d$c;", "Lkotlin/coroutines/d$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "getKey", "()Lkotlin/coroutines/d$c;", "key", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class BackgroundWork implements d.c<BackgroundWork>, d.b {
    public static final BackgroundWork INSTANCE = new BackgroundWork();

    private BackgroundWork() {
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r8, InterfaceC0650p<? super R, ? super d.b, ? extends R> interfaceC0650p) {
        return interfaceC0650p.invoke(r8, this);
    }

    @Override // kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d minusKey(d.c<?> cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return d.a.a(this, dVar);
    }

    public String toString() {
        return "BackgroundWork";
    }

    @Override // kotlin.coroutines.d.b
    public d.c<?> getKey() {
        return this;
    }
}
