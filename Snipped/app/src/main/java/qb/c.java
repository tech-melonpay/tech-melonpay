package qb;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: CallAdapter.java */
/* loaded from: classes3.dex */
public interface c<R, T> {

    /* compiled from: CallAdapter.java */
    public static abstract class a {
        public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
            return retrofit2.b.d(i, parameterizedType);
        }

        public static Class<?> getRawType(Type type) {
            return retrofit2.b.e(type);
        }

        public abstract c<?, ?> get(Type type, Annotation[] annotationArr, r rVar);
    }

    T adapt(b<R> bVar);

    Type responseType();
}
