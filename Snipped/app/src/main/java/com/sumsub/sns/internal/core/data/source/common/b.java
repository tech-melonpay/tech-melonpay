package com.sumsub.sns.internal.core.data.source.common;

import com.sumsub.sns.core.data.model.SNSInitConfig;
import com.sumsub.sns.internal.core.data.model.remote.i;
import com.sumsub.sns.internal.core.data.model.remote.response.d;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonObject;
import sb.f;
import sb.o;
import sb.s;
import sb.t;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\tJ\u001d\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ'\u0010\r\u001a\u00020\u00112\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0012J\u001d\u0010\u0003\u001a\u00020\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\tJ\u001f\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0013H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004J)\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0001\u0010\u0010\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\tJ\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0004J)\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u00132\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u001aø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/common/b;", "", "Lcom/sumsub/sns/internal/core/data/model/remote/response/f;", "b", "(LT9/a;)Ljava/lang/Object;", "", "actionId", "Lkotlinx/serialization/json/JsonObject;", "d", "(Ljava/lang/String;LT9/a;)Ljava/lang/Object;", "applicantId", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$d;", "e", "a", "Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "conf", "language", "Lcom/sumsub/sns/internal/core/data/model/remote/i;", "(Lcom/sumsub/sns/core/data/model/SNSInitConfig;Ljava/lang/String;LT9/a;)Ljava/lang/Object;", "", "c", "", "Lcom/sumsub/sns/internal/core/data/model/d;", "Lcom/sumsub/sns/internal/ff/model/a;", "requestedFlags", "Lcom/sumsub/sns/internal/ff/model/b;", "(Lcom/sumsub/sns/internal/ff/model/a;LT9/a;)Ljava/lang/Object;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface b {
    @f("resources/sdkIntegrations/-/clientIntegrationSettings")
    Object a(T9.a<? super Map<String, ? extends Object>> aVar);

    @o("resources/sdkIntegrations/msdkInit")
    Object a(@sb.a SNSInitConfig sNSInitConfig, @t("lang") String str, T9.a<? super i> aVar);

    @o("/resources/featureFlags/msdk")
    Object a(@sb.a com.sumsub.sns.internal.ff.model.a aVar, T9.a<? super Map<String, com.sumsub.sns.internal.ff.model.b>> aVar2);

    @f("resources/applicantActions/{actionId}/one")
    Object a(@s("actionId") String str, T9.a<? super d.c.C0219d> aVar);

    @f("/resources/sdk/applicant/requiredIdDocsStatus")
    Object b(T9.a<? super com.sumsub.sns.internal.core.data.model.remote.response.f> aVar);

    @o("resources/sdkIntegrations/msdkReinit")
    Object b(@t("lang") String str, T9.a<? super i> aVar);

    @f("/resources/msdk/i18n")
    Object c(@t("lang") String str, T9.a<? super Map<String, ? extends Object>> aVar);

    @f("/resources/sdkIntegrations/agreements")
    Object d(T9.a<? super List<com.sumsub.sns.internal.core.data.model.d>> aVar);

    @f("/resources/applicantActions/{actionId}/requiredIdDocsStatus")
    Object d(@s("actionId") String str, T9.a<? super JsonObject> aVar);

    @f("resources/applicants/{applicantId}/one")
    Object e(@s("applicantId") String str, T9.a<? super d.c.C0219d> aVar);
}
