package com.sumsub.sns.internal.core.data.source.applicant;

import O9.p;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.data.model.remote.k;
import com.sumsub.sns.internal.core.data.source.applicant.remote.d0;
import com.sumsub.sns.internal.core.data.source.applicant.remote.e0;
import com.sumsub.sns.internal.core.data.source.applicant.remote.g;
import com.sumsub.sns.internal.core.data.source.applicant.remote.h0;
import com.sumsub.sns.internal.core.data.source.applicant.remote.n;
import com.sumsub.sns.internal.core.data.source.applicant.remote.w;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface e {
    static /* synthetic */ Object a(e eVar, String str, String str2, InputStream inputStream, String str3, IdentitySide identitySide, Map map, DocumentType documentType, T9.a aVar, int i, Object obj) {
        if (obj == null) {
            return eVar.a(str, str2, inputStream, str3, identitySide, (Map<String, String>) ((i & 32) != 0 ? kotlin.collections.a.p() : map), documentType, (T9.a<? super k>) aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadFile");
    }

    Object a(T9.a<? super List<n>> aVar);

    Object a(String str, int i, T9.a<? super p> aVar);

    Object a(String str, com.sumsub.sns.internal.core.data.source.applicant.remote.b bVar, T9.a<? super e0> aVar);

    Object a(String str, String str2, com.sumsub.sns.internal.core.data.source.applicant.remote.a aVar, T9.a<? super e0> aVar2);

    Object a(String str, String str2, File file, String str3, IdentitySide identitySide, Map<String, String> map, DocumentType documentType, T9.a<? super k> aVar);

    Object a(String str, String str2, InputStream inputStream, String str3, IdentitySide identitySide, Map<String, String> map, DocumentType documentType, T9.a<? super k> aVar);

    Object a(String str, String str2, String str3, String str4, List<String> list, T9.a<? super g> aVar);

    Object a(String str, String str2, String str3, List<com.sumsub.sns.internal.core.data.model.remote.e> list, List<String> list2, T9.a<? super com.sumsub.sns.internal.core.data.model.g> aVar);

    Object a(String str, Map<String, ? extends Object> map, List<String> list, T9.a<? super g.a> aVar);

    Object a(String str, byte[] bArr, T9.a<? super Map<String, ? extends Object>> aVar);

    Object c(String str, T9.a<? super h0> aVar);

    Object d(String str, T9.a<? super d0> aVar);

    Object e(String str, T9.a<? super Map<String, ? extends Object>> aVar);

    Object g(String str, T9.a<? super w> aVar);

    static /* synthetic */ Object a(e eVar, String str, String str2, File file, String str3, IdentitySide identitySide, Map map, DocumentType documentType, T9.a aVar, int i, Object obj) {
        if (obj == null) {
            return eVar.a(str, str2, file, str3, (i & 16) != 0 ? null : identitySide, (Map<String, String>) ((i & 32) != 0 ? kotlin.collections.a.p() : map), (i & 64) != 0 ? null : documentType, (T9.a<? super k>) aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadFile");
    }
}
