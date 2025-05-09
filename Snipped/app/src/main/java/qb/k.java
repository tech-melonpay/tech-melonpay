package qb;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import qb.f;

/* compiled from: OptionalConverterFactory.java */
@IgnoreJRERequirement
/* loaded from: classes3.dex */
public final class k extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k f25970a = new k();

    /* compiled from: OptionalConverterFactory.java */
    @IgnoreJRERequirement
    public static final class a<T> implements f<va.i, Optional<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final f<va.i, T> f25971a;

        public a(f<va.i, T> fVar) {
            this.f25971a = fVar;
        }

        @Override // qb.f
        public final Object b(va.i iVar) {
            return Optional.ofNullable(this.f25971a.b(iVar));
        }
    }

    @Override // qb.f.a
    public final f<va.i, ?> b(Type type, Annotation[] annotationArr, r rVar) {
        if (retrofit2.b.e(type) != Optional.class) {
            return null;
        }
        return new a(rVar.d(retrofit2.b.d(0, (ParameterizedType) type), annotationArr));
    }
}
