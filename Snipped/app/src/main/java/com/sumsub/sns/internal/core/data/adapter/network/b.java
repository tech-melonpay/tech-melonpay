package com.sumsub.sns.internal.core.data.adapter.network;

import com.sumsub.sns.internal.core.common.x0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.f;
import qb.c;
import qb.r;

/* loaded from: classes2.dex */
public final class b extends c.a {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f15231a;

    public b(x0 x0Var) {
        this.f15231a = x0Var;
    }

    @Override // qb.c.a
    public qb.c<?, ?> get(Type type, Annotation[] annotationArr, r rVar) {
        if (!f.b(qb.b.class, c.a.getRawType(type))) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(c.a.getParameterUpperBound(0, (ParameterizedType) type), rVar.d(com.sumsub.sns.internal.core.data.model.remote.response.b.class, annotationArr), this.f15231a);
        }
        throw new IllegalStateException("return type must be parameterized as Call<NetworkResponse<<Foo>> or Call<NetworkResponse<out Foo>>".toString());
    }
}
