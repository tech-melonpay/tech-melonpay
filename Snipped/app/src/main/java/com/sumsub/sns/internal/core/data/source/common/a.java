package com.sumsub.sns.internal.core.data.source.common;

import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.data.model.g;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public interface a {
    static /* synthetic */ Object a(a aVar, String str, boolean z10, T9.a aVar2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getActionById");
        }
        if ((i & 2) != 0) {
            z10 = false;
        }
        return aVar.a(str, z10, aVar2);
    }

    Object a(T9.a<? super Map<String, ? extends Object>> aVar);

    Object a(String str, boolean z10, T9.a<? super g> aVar);

    String a();

    void a(SNSSDKState sNSSDKState);

    void a(String str);

    Flow<SNSSDKState> b();

    default Object c(T9.a<? super Locale> aVar) {
        return a(this, aVar);
    }

    static /* synthetic */ Object a(a aVar, T9.a aVar2) {
        return e0.f15081a.getLocale();
    }
}
