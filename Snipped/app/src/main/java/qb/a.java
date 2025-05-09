package qb;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import qb.f;
import sb.w;

/* compiled from: BuiltInConverters.java */
/* loaded from: classes3.dex */
public final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25930a;

    /* compiled from: BuiltInConverters.java */
    /* renamed from: qb.a$a, reason: collision with other inner class name */
    public static final class C0459a implements qb.f<va.i, va.i> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0459a f25931a = new C0459a();

        @Override // qb.f
        public final va.i b(va.i iVar) {
            va.i iVar2 = iVar;
            try {
                Ka.f fVar = new Ka.f();
                iVar2.p().n(fVar);
                return new va.j(iVar2.j(), iVar2.i(), fVar);
            } finally {
                iVar2.close();
            }
        }
    }

    /* compiled from: BuiltInConverters.java */
    public static final class b implements qb.f<okhttp3.o, okhttp3.o> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f25932a = new b();

        @Override // qb.f
        public final okhttp3.o b(okhttp3.o oVar) {
            return oVar;
        }
    }

    /* compiled from: BuiltInConverters.java */
    public static final class c implements qb.f<va.i, va.i> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f25933a = new c();

        @Override // qb.f
        public final va.i b(va.i iVar) {
            return iVar;
        }
    }

    /* compiled from: BuiltInConverters.java */
    public static final class d implements qb.f<Object, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f25934a = new d();

        @Override // qb.f
        public final String b(Object obj) {
            return obj.toString();
        }
    }

    /* compiled from: BuiltInConverters.java */
    public static final class e implements qb.f<va.i, O9.p> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f25935a = new e();

        @Override // qb.f
        public final O9.p b(va.i iVar) {
            iVar.close();
            return O9.p.f3034a;
        }
    }

    /* compiled from: BuiltInConverters.java */
    public static final class f implements qb.f<va.i, Void> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f25936a = new f();

        @Override // qb.f
        public final Void b(va.i iVar) {
            iVar.close();
            return null;
        }
    }

    @Override // qb.f.a
    public final qb.f a(Type type) {
        if (okhttp3.o.class.isAssignableFrom(retrofit2.b.e(type))) {
            return b.f25932a;
        }
        return null;
    }

    @Override // qb.f.a
    public final qb.f<va.i, ?> b(Type type, Annotation[] annotationArr, r rVar) {
        if (type == va.i.class) {
            return retrofit2.b.h(annotationArr, w.class) ? c.f25933a : C0459a.f25931a;
        }
        if (type == Void.class) {
            return f.f25936a;
        }
        if (!this.f25930a || type != O9.p.class) {
            return null;
        }
        try {
            return e.f25935a;
        } catch (NoClassDefFoundError unused) {
            this.f25930a = false;
            return null;
        }
    }
}
