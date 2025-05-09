package com.sumsub.sns.internal.core.data.source.applicant;

import O9.p;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.model.SNSMessage;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.data.model.remote.k;
import com.sumsub.sns.internal.core.data.model.remote.response.d;
import com.sumsub.sns.internal.core.data.source.applicant.remote.a0;
import com.sumsub.sns.internal.core.data.source.applicant.remote.b0;
import com.sumsub.sns.internal.core.data.source.applicant.remote.d0;
import com.sumsub.sns.internal.core.data.source.applicant.remote.e0;
import com.sumsub.sns.internal.core.data.source.applicant.remote.h0;
import com.sumsub.sns.internal.core.data.source.applicant.remote.n;
import com.sumsub.sns.internal.core.data.source.applicant.remote.u;
import com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a;
import com.sumsub.sns.internal.core.data.source.applicant.remote.w;
import com.sumsub.sns.internal.core.data.source.applicant.remote.y;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public interface a {
    Object a(T9.a<? super List<n>> aVar);

    Object a(u uVar, T9.a<? super w> aVar);

    Object a(y yVar, T9.a<? super w> aVar);

    default Object a(String str, int i, T9.a<? super p> aVar) {
        return a(this, str, i, aVar);
    }

    Object a(String str, com.sumsub.sns.internal.core.data.model.b bVar, T9.a<? super g> aVar);

    Object a(String str, a0 a0Var, T9.a<? super b0> aVar);

    Object a(String str, com.sumsub.sns.internal.core.data.source.applicant.remote.b bVar, T9.a<? super e0> aVar);

    Object a(String str, String str2, T9.a<? super p> aVar);

    Object a(String str, String str2, com.sumsub.sns.internal.core.data.source.applicant.remote.a aVar, T9.a<? super e0> aVar2);

    Object a(String str, String str2, File file, String str3, IdentitySide identitySide, Map<String, String> map, DocumentType documentType, a.InterfaceC0229a interfaceC0229a, T9.a<? super k> aVar);

    Object a(String str, String str2, InputStream inputStream, String str3, IdentitySide identitySide, Map<String, String> map, DocumentType documentType, T9.a<? super k> aVar);

    Object a(String str, String str2, String str3, T9.a<? super b0> aVar);

    Object a(String str, String str2, String str3, String str4, List<String> list, T9.a<? super com.sumsub.sns.internal.core.data.source.applicant.remote.g> aVar);

    Object a(String str, byte[] bArr, T9.a<? super Map<String, ? extends Object>> aVar);

    default Object b(String str, int i, T9.a<? super p> aVar) {
        return b(this, str, i, aVar);
    }

    Object b(String str, com.sumsub.sns.internal.core.data.model.b bVar, T9.a<? super g> aVar);

    Object b(String str, a0 a0Var, T9.a<? super b0> aVar);

    Object b(String str, String str2, File file, String str3, IdentitySide identitySide, Map<String, String> map, DocumentType documentType, a.InterfaceC0229a interfaceC0229a, T9.a<? super k> aVar);

    Object b(String str, String str2, String str3, T9.a<? super b0> aVar);

    Object c(String str, T9.a<? super h0> aVar);

    Object d(String str, T9.a<? super d0> aVar);

    Object e(String str, T9.a<? super Map<String, ? extends Object>> aVar);

    default Object f(String str, T9.a<? super d.c.C0219d> aVar) {
        return b(this, str, aVar);
    }

    Object g(String str, T9.a<? super w> aVar);

    static /* synthetic */ Object b(a aVar, String str, int i, T9.a aVar2) {
        throw new UnsupportedOperationException();
    }

    default Object a(String str, String str2, String str3, List<com.sumsub.sns.internal.core.data.model.remote.e> list, List<String> list2, T9.a<? super g> aVar) {
        return a(this, str, str2, str3, list, list2, aVar);
    }

    static /* synthetic */ Object b(a aVar, String str, T9.a aVar2) {
        throw new UnsupportedOperationException();
    }

    default Object a(String str, Map<String, ? extends Object> map, List<String> list, T9.a<? super g.a> aVar) {
        return a(this, str, map, list, aVar);
    }

    default Object a(String str, T9.a<? super Boolean> aVar) {
        return a(this, str, aVar);
    }

    static /* synthetic */ Object a(a aVar, String str, int i, T9.a aVar2) {
        throw new UnsupportedOperationException();
    }

    static /* synthetic */ Object a(a aVar, String str, T9.a aVar2) {
        throw new UnsupportedOperationException();
    }

    default Flow<SNSMessage.ServerMessage> a(String str) {
        throw new UnsupportedOperationException();
    }

    static /* synthetic */ Object a(a aVar, String str, Map map, List list, T9.a aVar2) {
        throw new UnsupportedOperationException();
    }

    static /* synthetic */ Object a(a aVar, String str, String str2, String str3, List list, List list2, T9.a aVar2) {
        throw new UnsupportedOperationException();
    }
}
