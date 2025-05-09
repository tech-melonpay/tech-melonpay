package qb;

import java.lang.annotation.Annotation;

/* compiled from: SkipCallbackExecutorImpl.java */
/* loaded from: classes3.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    public static final u f26083a = new u();

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return t.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof t;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + t.class.getName() + "()";
    }
}
