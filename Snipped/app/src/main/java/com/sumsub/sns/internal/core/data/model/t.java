package com.sumsub.sns.internal.core.data.model;

import java.util.List;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.model.remote.response.c f15792a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Document> f15793b;

    /* renamed from: c, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.model.remote.response.h f15794c;

    public t(com.sumsub.sns.internal.core.data.model.remote.response.c cVar, List<Document> list, com.sumsub.sns.internal.core.data.model.remote.response.h hVar) {
        this.f15792a = cVar;
        this.f15793b = list;
        this.f15794c = hVar;
    }

    public final List<Document> d() {
        return this.f15793b;
    }

    public final com.sumsub.sns.internal.core.data.model.remote.response.c e() {
        return this.f15792a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.f.b(this.f15792a, tVar.f15792a) && kotlin.jvm.internal.f.b(this.f15793b, tVar.f15793b) && kotlin.jvm.internal.f.b(this.f15794c, tVar.f15794c);
    }

    public final com.sumsub.sns.internal.core.data.model.remote.response.h f() {
        return this.f15794c;
    }

    public int hashCode() {
        com.sumsub.sns.internal.core.data.model.remote.response.c cVar = this.f15792a;
        int f10 = C.v.f(this.f15793b, (cVar == null ? 0 : cVar.hashCode()) * 31, 31);
        com.sumsub.sns.internal.core.data.model.remote.response.h hVar = this.f15794c;
        return f10 + (hVar != null ? hVar.hashCode() : 0);
    }

    public String toString() {
        return "RequiredIdDocStatus(review=" + this.f15792a + ", documents=" + this.f15793b + ", workflowStatus=" + this.f15794c + ')';
    }
}
