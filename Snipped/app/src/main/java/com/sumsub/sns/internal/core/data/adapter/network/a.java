package com.sumsub.sns.internal.core.data.adapter.network;

import com.sumsub.sns.internal.core.common.x0;
import java.lang.reflect.Type;
import qb.f;
import va.i;

/* loaded from: classes2.dex */
public final class a<S, E> implements qb.c<S, qb.b<S>> {

    /* renamed from: a, reason: collision with root package name */
    public final Type f15228a;

    /* renamed from: b, reason: collision with root package name */
    public final f<i, E> f15229b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f15230c;

    public a(Type type, f<i, E> fVar, x0 x0Var) {
        this.f15228a = type;
        this.f15229b = fVar;
        this.f15230c = x0Var;
    }

    @Override // qb.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb.b<S> adapt(qb.b<S> bVar) {
        return new c(bVar, this.f15229b, this.f15230c);
    }

    @Override // qb.c
    public Type responseType() {
        return this.f15228a;
    }
}
