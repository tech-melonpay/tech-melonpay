package I3;

import Fa.h;
import I3.b;
import j3.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.i;
import qb.f;
import qb.r;

/* compiled from: Factory.kt */
/* loaded from: classes.dex */
public final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public final i f1730a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1731b;

    public a(i iVar, b.a aVar) {
        this.f1730a = iVar;
        this.f1731b = aVar;
    }

    @Override // qb.f.a
    public final f a(Type type) {
        b bVar = this.f1731b;
        return new h(this.f1730a, e.C(bVar.b().a(), type), bVar, 1);
    }

    @Override // qb.f.a
    public final f<va.i, ?> b(Type type, Annotation[] annotationArr, r rVar) {
        b bVar = this.f1731b;
        return new B1.f(5, e.C(bVar.b().a(), type), bVar);
    }
}
