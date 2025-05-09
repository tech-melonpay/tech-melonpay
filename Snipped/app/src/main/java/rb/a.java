package rb;

import com.google.gson.g;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import qb.f;
import qb.r;
import va.i;

/* compiled from: GsonConverterFactory.java */
/* loaded from: classes3.dex */
public final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public final g f26461a;

    public a(g gVar) {
        this.f26461a = gVar;
    }

    @Override // qb.f.a
    public final f a(Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        g gVar = this.f26461a;
        return new b(gVar, gVar.d(typeToken));
    }

    @Override // qb.f.a
    public final f<i, ?> b(Type type, Annotation[] annotationArr, r rVar) {
        TypeToken<?> typeToken = TypeToken.get(type);
        g gVar = this.f26461a;
        return new B1.f(19, gVar, gVar.d(typeToken));
    }
}
