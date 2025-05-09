package com.sumsub.sns.internal.core.data.source.applicant.remote;

import java.util.Map;
import kotlin.Metadata;
import okhttp3.j;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J[\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ[\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ'\u0010\r\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0015J'\u0010\u0011\u001a\u00020\u00142\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0015ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/c;", "", "", "applicantId", "Lokhttp3/j$c;", "image", "Lokhttp3/o;", "meta", "", "headers", "idDocSetType", "Lqb/q;", "Lcom/sumsub/sns/internal/core/data/model/remote/k;", "a", "(Ljava/lang/String;Lokhttp3/j$c;Lokhttp3/o;Ljava/util/Map;Ljava/lang/String;LT9/a;)Ljava/lang/Object;", "actionId", "Lcom/sumsub/sns/internal/core/data/model/remote/l;", "b", "", "imageId", "LO9/p;", "(Ljava/lang/String;ILT9/a;)Ljava/lang/Object;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface c {
    @sb.b("/resources/applicants/{applicantId}/resources/{imageId}")
    Object a(@sb.s("applicantId") String str, @sb.s("imageId") int i, T9.a<? super O9.p> aVar);

    @sb.l
    @sb.o("/resources/applicants/{applicantId}/info/idDoc")
    Object a(@sb.s("applicantId") String str, @sb.q j.c cVar, @sb.q("metadata") okhttp3.o oVar, @sb.j Map<String, String> map, @sb.t("idDocSetType") String str2, T9.a<? super qb.q<com.sumsub.sns.internal.core.data.model.remote.k>> aVar);

    @sb.b("/resources/applicantActions/{actionId}/images/{imageId}")
    Object b(@sb.s("actionId") String str, @sb.s("imageId") int i, T9.a<? super O9.p> aVar);

    @sb.l
    @sb.o("/resources/applicantActions/{actionId}/images")
    Object b(@sb.s("actionId") String str, @sb.q j.c cVar, @sb.q("metadata") okhttp3.o oVar, @sb.j Map<String, String> map, @sb.t("idDocSetType") String str2, T9.a<? super qb.q<com.sumsub.sns.internal.core.data.model.remote.l>> aVar);
}
