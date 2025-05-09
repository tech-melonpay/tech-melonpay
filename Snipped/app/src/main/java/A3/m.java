package A3;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class m extends PhantomReference {

    /* renamed from: a, reason: collision with root package name */
    public final Set f75a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f76b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(a aVar, ReferenceQueue referenceQueue, Set set) {
        super(aVar, referenceQueue);
        l lVar = l.f74a;
        this.f75a = set;
        this.f76b = lVar;
    }
}
