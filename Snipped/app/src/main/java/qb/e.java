package qb;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import qb.c;
import retrofit2.HttpException;

/* compiled from: CompletableFutureCallAdapterFactory.java */
@IgnoreJRERequirement
/* loaded from: classes3.dex */
public final class e extends c.a {

    /* renamed from: b, reason: collision with root package name */
    public static final e f25937b = new e();

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    public static final class a<R> implements qb.c<R, CompletableFuture<R>> {

        /* renamed from: a, reason: collision with root package name */
        public final Type f25938a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        /* renamed from: qb.e$a$a, reason: collision with other inner class name */
        public class C0460a implements d<R> {

            /* renamed from: a, reason: collision with root package name */
            public final CompletableFuture<R> f25939a;

            public C0460a(b bVar) {
                this.f25939a = bVar;
            }

            @Override // qb.d
            public final void onFailure(qb.b<R> bVar, Throwable th) {
                this.f25939a.completeExceptionally(th);
            }

            @Override // qb.d
            public final void onResponse(qb.b<R> bVar, q<R> qVar) {
                boolean j10 = qVar.f26065a.j();
                CompletableFuture<R> completableFuture = this.f25939a;
                if (j10) {
                    completableFuture.complete(qVar.f26066b);
                } else {
                    completableFuture.completeExceptionally(new HttpException(qVar));
                }
            }
        }

        public a(Type type) {
            this.f25938a = type;
        }

        @Override // qb.c
        public final Object adapt(qb.b bVar) {
            j jVar = (j) bVar;
            b bVar2 = new b(jVar);
            jVar.enqueue(new C0460a(bVar2));
            return bVar2;
        }

        @Override // qb.c
        public final Type responseType() {
            return this.f25938a;
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb.b<?> f25940a;

        public b(j jVar) {
            this.f25940a = jVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            if (z10) {
                this.f25940a.cancel();
            }
            return super.cancel(z10);
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    public static final class c<R> implements qb.c<R, CompletableFuture<q<R>>> {

        /* renamed from: a, reason: collision with root package name */
        public final Type f25941a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        public class a implements d<R> {

            /* renamed from: a, reason: collision with root package name */
            public final CompletableFuture<q<R>> f25942a;

            public a(b bVar) {
                this.f25942a = bVar;
            }

            @Override // qb.d
            public final void onFailure(qb.b<R> bVar, Throwable th) {
                this.f25942a.completeExceptionally(th);
            }

            @Override // qb.d
            public final void onResponse(qb.b<R> bVar, q<R> qVar) {
                this.f25942a.complete(qVar);
            }
        }

        public c(Type type) {
            this.f25941a = type;
        }

        @Override // qb.c
        public final Object adapt(qb.b bVar) {
            j jVar = (j) bVar;
            b bVar2 = new b(jVar);
            jVar.enqueue(new a(bVar2));
            return bVar2;
        }

        @Override // qb.c
        public final Type responseType() {
            return this.f25941a;
        }
    }

    @Override // qb.c.a
    public final qb.c<?, ?> get(Type type, Annotation[] annotationArr, r rVar) {
        if (c.a.getRawType(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type parameterUpperBound = c.a.getParameterUpperBound(0, (ParameterizedType) type);
        if (c.a.getRawType(parameterUpperBound) != q.class) {
            return new a(parameterUpperBound);
        }
        if (parameterUpperBound instanceof ParameterizedType) {
            return new c(c.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
