package retrofit2;

import ca.InterfaceC0646l;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuationImpl;
import qb.f;
import qb.j;
import qb.p;
import qb.s;
import va.b;
import va.i;

/* compiled from: HttpServiceMethod.java */
/* loaded from: classes3.dex */
public abstract class a<ResponseT, ReturnT> extends s<ReturnT> {

    /* renamed from: a, reason: collision with root package name */
    public final p f26473a;

    /* renamed from: b, reason: collision with root package name */
    public final b.a f26474b;

    /* renamed from: c, reason: collision with root package name */
    public final f<i, ResponseT> f26475c;

    /* compiled from: HttpServiceMethod.java */
    /* renamed from: retrofit2.a$a, reason: collision with other inner class name */
    public static final class C0467a<ResponseT, ReturnT> extends a<ResponseT, ReturnT> {

        /* renamed from: d, reason: collision with root package name */
        public final qb.c<ResponseT, ReturnT> f26476d;

        public C0467a(p pVar, b.a aVar, f<i, ResponseT> fVar, qb.c<ResponseT, ReturnT> cVar) {
            super(pVar, aVar, fVar);
            this.f26476d = cVar;
        }

        @Override // retrofit2.a
        public final Object c(j jVar, Object[] objArr) {
            return this.f26476d.adapt(jVar);
        }
    }

    /* compiled from: HttpServiceMethod.java */
    public static final class b<ResponseT> extends a<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        public final qb.c<ResponseT, qb.b<ResponseT>> f26477d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f26478e;

        public b(p pVar, b.a aVar, f fVar, qb.c cVar) {
            super(pVar, aVar, fVar);
            this.f26477d = cVar;
            this.f26478e = false;
        }

        @Override // retrofit2.a
        public final Object c(j jVar, Object[] objArr) {
            final qb.b<ResponseT> adapt = this.f26477d.adapt(jVar);
            int i = 1;
            T9.a aVar = (T9.a) objArr[objArr.length - 1];
            try {
                if (this.f26478e) {
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(U4.b.p(aVar), 1);
                    cancellableContinuationImpl.invokeOnCancellation(new InterfaceC0646l<Throwable, O9.p>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2
                        {
                            super(1);
                        }

                        @Override // ca.InterfaceC0646l
                        public final O9.p invoke(Throwable th) {
                            qb.b.this.cancel();
                            return O9.p.f3034a;
                        }
                    });
                    adapt.enqueue(new qb.i(cancellableContinuationImpl, i));
                    Object result = cancellableContinuationImpl.getResult();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                    return result;
                }
                CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(U4.b.p(aVar), 1);
                cancellableContinuationImpl2.invokeOnCancellation(new InterfaceC0646l<Throwable, O9.p>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1
                    {
                        super(1);
                    }

                    @Override // ca.InterfaceC0646l
                    public final O9.p invoke(Throwable th) {
                        qb.b.this.cancel();
                        return O9.p.f3034a;
                    }
                });
                adapt.enqueue(new qb.i(cancellableContinuationImpl2, 0));
                Object result2 = cancellableContinuationImpl2.getResult();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f23158a;
                return result2;
            } catch (Exception e10) {
                return KotlinExtensions.a(e10, aVar);
            }
        }
    }

    /* compiled from: HttpServiceMethod.java */
    public static final class c<ResponseT> extends a<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        public final qb.c<ResponseT, qb.b<ResponseT>> f26479d;

        public c(p pVar, b.a aVar, f<i, ResponseT> fVar, qb.c<ResponseT, qb.b<ResponseT>> cVar) {
            super(pVar, aVar, fVar);
            this.f26479d = cVar;
        }

        @Override // retrofit2.a
        public final Object c(j jVar, Object[] objArr) {
            final qb.b<ResponseT> adapt = this.f26479d.adapt(jVar);
            T9.a aVar = (T9.a) objArr[objArr.length - 1];
            try {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(U4.b.p(aVar), 1);
                cancellableContinuationImpl.invokeOnCancellation(new InterfaceC0646l<Throwable, O9.p>() { // from class: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1
                    {
                        super(1);
                    }

                    @Override // ca.InterfaceC0646l
                    public final O9.p invoke(Throwable th) {
                        qb.b.this.cancel();
                        return O9.p.f3034a;
                    }
                });
                adapt.enqueue(new qb.i(cancellableContinuationImpl, 2));
                Object result = cancellableContinuationImpl.getResult();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                return result;
            } catch (Exception e10) {
                return KotlinExtensions.a(e10, aVar);
            }
        }
    }

    public a(p pVar, b.a aVar, f<i, ResponseT> fVar) {
        this.f26473a = pVar;
        this.f26474b = aVar;
        this.f26475c = fVar;
    }

    @Override // qb.s
    public final ReturnT a(Object[] objArr) {
        return (ReturnT) c(new j(this.f26473a, objArr, this.f26474b, this.f26475c), objArr);
    }

    public abstract Object c(j jVar, Object[] objArr);
}
