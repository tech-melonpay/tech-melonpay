package qb;

import C.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import qb.c;

/* compiled from: DefaultCallAdapterFactory.java */
/* loaded from: classes3.dex */
public final class g extends c.a {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f25943b;

    /* compiled from: DefaultCallAdapterFactory.java */
    public class a implements c<Object, qb.b<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f25944a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Executor f25945b;

        public a(Type type, Executor executor) {
            this.f25944a = type;
            this.f25945b = executor;
        }

        @Override // qb.c
        public final qb.b<?> adapt(qb.b<Object> bVar) {
            Executor executor = this.f25945b;
            return executor == null ? bVar : new b(executor, bVar);
        }

        @Override // qb.c
        public final Type responseType() {
            return this.f25944a;
        }
    }

    /* compiled from: DefaultCallAdapterFactory.java */
    public static final class b<T> implements qb.b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f25946a;

        /* renamed from: b, reason: collision with root package name */
        public final qb.b<T> f25947b;

        /* compiled from: DefaultCallAdapterFactory.java */
        public class a implements d<T> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f25948a;

            public a(d dVar) {
                this.f25948a = dVar;
            }

            @Override // qb.d
            public final void onFailure(qb.b<T> bVar, Throwable th) {
                b.this.f25946a.execute(new y(this, this.f25948a, th, 18));
            }

            @Override // qb.d
            public final void onResponse(qb.b<T> bVar, q<T> qVar) {
                b.this.f25946a.execute(new y(this, this.f25948a, qVar, 17));
            }
        }

        public b(Executor executor, qb.b<T> bVar) {
            this.f25946a = executor;
            this.f25947b = bVar;
        }

        @Override // qb.b
        public final void cancel() {
            this.f25947b.cancel();
        }

        @Override // qb.b
        public final void enqueue(d<T> dVar) {
            this.f25947b.enqueue(new a(dVar));
        }

        @Override // qb.b
        public final q<T> execute() {
            return this.f25947b.execute();
        }

        @Override // qb.b
        public final boolean isCanceled() {
            return this.f25947b.isCanceled();
        }

        @Override // qb.b
        public final okhttp3.k request() {
            return this.f25947b.request();
        }

        @Override // qb.b
        public final qb.b<T> clone() {
            return new b(this.f25946a, this.f25947b.clone());
        }
    }

    public g(Executor executor) {
        this.f25943b = executor;
    }

    @Override // qb.c.a
    public final c<?, ?> get(Type type, Annotation[] annotationArr, r rVar) {
        if (c.a.getRawType(type) != qb.b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(retrofit2.b.d(0, (ParameterizedType) type), retrofit2.b.h(annotationArr, t.class) ? null : this.f25943b);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
