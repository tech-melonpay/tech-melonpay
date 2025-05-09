package com.sumsub.sns.internal.core.data.source.applicant;

import O9.p;
import ca.InterfaceC0646l;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.data.model.remote.k;
import com.sumsub.sns.internal.core.data.source.applicant.remote.a0;
import com.sumsub.sns.internal.core.data.source.applicant.remote.b0;
import com.sumsub.sns.internal.core.data.source.applicant.remote.u;
import com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a;
import com.sumsub.sns.internal.core.data.source.applicant.remote.w;
import java.io.File;
import java.util.Map;

/* loaded from: classes2.dex */
public interface b {
    static /* synthetic */ Object a(b bVar, String str, File file, String str2, IdentitySide identitySide, Map map, DocumentType documentType, a.InterfaceC0229a interfaceC0229a, T9.a aVar, int i, Object obj) {
        if (obj == null) {
            return bVar.a(str, file, str2, (i & 8) != 0 ? null : identitySide, (i & 16) != 0 ? kotlin.collections.a.p() : map, (i & 32) != 0 ? null : documentType, interfaceC0229a, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadFile");
    }

    Object a(int i, T9.a<? super p> aVar);

    Object a(T9.a<? super InterfaceC0646l<? super String, String>> aVar);

    Object a(com.sumsub.sns.internal.core.data.model.b bVar, T9.a<? super g> aVar);

    Object a(a0 a0Var, T9.a<? super b0> aVar);

    Object a(u uVar, T9.a<? super w> aVar);

    Object a(String str, T9.a<? super p> aVar);

    Object a(String str, File file, String str2, IdentitySide identitySide, Map<String, String> map, DocumentType documentType, a.InterfaceC0229a interfaceC0229a, T9.a<? super k> aVar);

    Object a(String str, String str2, T9.a<? super b0> aVar);

    Object b(T9.a<? super Boolean> aVar);

    Object c(T9.a<? super String> aVar);
}
