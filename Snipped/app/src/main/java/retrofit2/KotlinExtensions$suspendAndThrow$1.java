package retrofit2;

import V9.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: KotlinExtensions.kt */
@d(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "LT9/a;", "", "continuation", "", "suspendAndThrow", "(Ljava/lang/Exception;LT9/a;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f26471u;

    /* renamed from: v, reason: collision with root package name */
    public int f26472v;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26471u = obj;
        this.f26472v |= Integer.MIN_VALUE;
        return KotlinExtensions.a(null, this);
    }
}
