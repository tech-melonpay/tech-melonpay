package com.sumsub.sns.internal.domain;

import java.util.Map;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.model.g f16782a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.model.e f16783b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f16784c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, String> f16785d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, Map<String, String>> f16786e;

    public c() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.f16782a, cVar.f16782a) && f.b(this.f16783b, cVar.f16783b) && f.b(this.f16784c, cVar.f16784c) && f.b(this.f16785d, cVar.f16785d) && f.b(this.f16786e, cVar.f16786e);
    }

    public final com.sumsub.sns.internal.core.data.model.e f() {
        return this.f16783b;
    }

    public final com.sumsub.sns.internal.core.data.model.g g() {
        return this.f16782a;
    }

    public final Map<String, String> h() {
        return this.f16785d;
    }

    public int hashCode() {
        com.sumsub.sns.internal.core.data.model.g gVar = this.f16782a;
        int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        com.sumsub.sns.internal.core.data.model.e eVar = this.f16783b;
        return this.f16786e.hashCode() + ((this.f16785d.hashCode() + ((this.f16784c.hashCode() + ((hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final Map<String, Map<String, String>> i() {
        return this.f16786e;
    }

    public final Map<String, String> j() {
        return this.f16784c;
    }

    public String toString() {
        return "ApplicantDataResources(applicant=" + this.f16782a + ", appConfig=" + this.f16783b + ", genders=" + this.f16784c + ", countries=" + this.f16785d + ", countryStates=" + this.f16786e + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(com.sumsub.sns.internal.core.data.model.g gVar, com.sumsub.sns.internal.core.data.model.e eVar, Map<String, String> map, Map<String, String> map2, Map<String, ? extends Map<String, String>> map3) {
        this.f16782a = gVar;
        this.f16783b = eVar;
        this.f16784c = map;
        this.f16785d = map2;
        this.f16786e = map3;
    }

    public /* synthetic */ c(com.sumsub.sns.internal.core.data.model.g gVar, com.sumsub.sns.internal.core.data.model.e eVar, Map map, Map map2, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : gVar, (i & 2) == 0 ? eVar : null, (i & 4) != 0 ? a.p() : map, (i & 8) != 0 ? a.p() : map2, (i & 16) != 0 ? a.p() : map3);
    }
}
