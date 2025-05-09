package com.sumsub.sns.internal.core.data.source.applicant;

import O9.p;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.data.model.remote.k;
import com.sumsub.sns.internal.core.data.source.applicant.remote.d0;
import com.sumsub.sns.internal.core.data.source.applicant.remote.e0;
import com.sumsub.sns.internal.core.data.source.applicant.remote.h0;
import com.sumsub.sns.internal.core.data.source.applicant.remote.n;
import com.sumsub.sns.internal.core.data.source.applicant.remote.w;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final a f15895a;

    public f(a aVar) {
        this.f15895a = aVar;
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.e
    public Object a(String str, String str2, File file, String str3, IdentitySide identitySide, Map<String, String> map, DocumentType documentType, T9.a<? super k> aVar) {
        return this.f15895a.a(str, str2, file, str3, identitySide, map, documentType, null, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.e
    public Object c(String str, T9.a<? super h0> aVar) {
        return this.f15895a.c(str, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.e
    public Object d(String str, T9.a<? super d0> aVar) {
        return this.f15895a.d(str, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.e
    public Object e(String str, T9.a<? super Map<String, ? extends Object>> aVar) {
        return this.f15895a.e(str, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.e
    public Object g(String str, T9.a<? super w> aVar) {
        return this.f15895a.g(str, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.e
    public Object a(String str, String str2, InputStream inputStream, String str3, IdentitySide identitySide, Map<String, String> map, DocumentType documentType, T9.a<? super k> aVar) {
        return this.f15895a.a(str, str2, inputStream, str3, identitySide, map, documentType, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.e
    public Object a(String str, int i, T9.a<? super p> aVar) {
        Object a10 = this.f15895a.a(str, i, aVar);
        return a10 == CoroutineSingletons.f23158a ? a10 : p.f3034a;
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.e
    public Object a(String str, Map<String, ? extends Object> map, List<String> list, T9.a<? super g.a> aVar) {
        return this.f15895a.a(str, map, list, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.e
    public Object a(String str, String str2, String str3, List<com.sumsub.sns.internal.core.data.model.remote.e> list, List<String> list2, T9.a<? super g> aVar) {
        return this.f15895a.a(str, str2, str3, list, list2, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.e
    public Object a(String str, String str2, String str3, String str4, List<String> list, T9.a<? super com.sumsub.sns.internal.core.data.source.applicant.remote.g> aVar) {
        return this.f15895a.a(str, str2, str3, str4, list, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.e
    public Object a(T9.a<? super List<n>> aVar) {
        return this.f15895a.a(aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.e
    public Object a(String str, byte[] bArr, T9.a<? super Map<String, ? extends Object>> aVar) {
        return this.f15895a.a(str, bArr, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.e
    public Object a(String str, com.sumsub.sns.internal.core.data.source.applicant.remote.b bVar, T9.a<? super e0> aVar) {
        return this.f15895a.a(str, bVar, aVar);
    }

    @Override // com.sumsub.sns.internal.core.data.source.applicant.e
    public Object a(String str, String str2, com.sumsub.sns.internal.core.data.source.applicant.remote.a aVar, T9.a<? super e0> aVar2) {
        return this.f15895a.a(str, str2, aVar, aVar2);
    }
}
