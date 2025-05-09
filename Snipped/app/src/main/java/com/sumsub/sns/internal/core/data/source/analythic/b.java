package com.sumsub.sns.internal.core.data.source.analythic;

import com.sumsub.sns.internal.core.data.source.applicant.remote.g;
import kotlin.Metadata;
import sb.i;
import sb.o;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/analythic/b;", "", "", "sessionId", "Lokhttp3/o;", "encryptedEventsList", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/g;", "a", "(Ljava/lang/String;Lokhttp3/o;LT9/a;)Ljava/lang/Object;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface b {
    @o("/resources/tracking/trackEventsComp")
    Object a(@i("X-Session-Id") String str, @sb.a okhttp3.o oVar, T9.a<? super g> aVar);
}
