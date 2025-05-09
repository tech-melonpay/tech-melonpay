package kotlin.coroutines;

import kotlin.coroutines.d;

/* compiled from: ContinuationInterceptor.kt */
/* loaded from: classes2.dex */
public interface c extends d.b {

    /* renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f23156e0 = 0;

    /* compiled from: ContinuationInterceptor.kt */
    public static final class a implements d.c<c> {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f23157a = new a();
    }

    <T> T9.a<T> interceptContinuation(T9.a<? super T> aVar);

    void releaseInterceptedContinuation(T9.a<?> aVar);
}
