package com.sumsub.sns.internal.core.data.source.applicant.remote;

import com.google.firebase.messaging.Constants;
import com.sumsub.sns.internal.core.data.model.remote.response.d;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0005\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0012J3\u0010\u0005\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\n2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0014J'\u0010\u0005\u001a\u00020\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0015H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0017J'\u0010\r\u001a\u00020\u00162\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0015H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0017J1\u0010\u0005\u001a\u00020\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u001bJ1\u0010\r\u001a\u00020\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u001c\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0006J\u001d\u0010\u0005\u001a\u00020\u001d2\b\b\u0001\u0010\u0010\u001a\u00020\u001fH§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010 J\u001d\u0010\u0005\u001a\u00020\u001d2\b\b\u0001\u0010\u0010\u001a\u00020!H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\"J'\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020#H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010$J\u001d\u0010&\u001a\u00020%2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0006J3\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010'2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010(J\u001d\u0010)\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b)\u0010\u0006J'\u0010\u0005\u001a\u00020+2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020*H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010,J1\u0010\u0005\u001a\u00020+2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020.H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010/J\u001d\u00101\u001a\u0002002\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0006J\u0013\u0010\u0005\u001a\u000202H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u00103J'\u0010\u0005\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00105\u001a\u000204H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u00106J'\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u00105\u001a\u000204H§@ø\u0001\u0000¢\u0006\u0004\b\r\u00106ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u00067À\u0006\u0001"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/e;", "", "", "applicantId", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/g;", "a", "(Ljava/lang/String;LT9/a;)Ljava/lang/Object;", "actionId", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$d;", "f", "Lokhttp3/o;", "applicantAndLanguage", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d;", "b", "(Lokhttp3/o;LT9/a;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/core/data/model/remote/d;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "unsetFields", "(Lcom/sumsub/sns/internal/core/data/model/remote/d;Ljava/lang/String;LT9/a;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$c;", "(Ljava/lang/String;Lokhttp3/o;Ljava/lang/String;LT9/a;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/a0;", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/b0;", "(Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/a0;LT9/a;)Ljava/lang/Object;", "requestCode", "verificationId", "code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LT9/a;)Ljava/lang/Object;", "questionnaireId", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/w;", "g", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/y;", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/y;LT9/a;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/u;", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/u;LT9/a;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/core/data/model/remote/b;", "(Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/b;LT9/a;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/h0;", "c", "", "(Ljava/lang/String;Lokhttp3/o;LT9/a;)Ljava/lang/Object;", "e", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/b;", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/e0;", "(Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/b;LT9/a;)Ljava/lang/Object;", "confirmationId", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/a;", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/a;LT9/a;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/d0;", "d", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/f;", "(LT9/a;)Ljava/lang/Object;", "Lcom/sumsub/sns/internal/core/data/model/b;", "agreement", "(Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/b;LT9/a;)Ljava/lang/Object;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface e {
    @sb.f("resources/videoIdent/-/availableLanguages")
    Object a(T9.a<? super f> aVar);

    @sb.n("/resources/applicants")
    Object a(@sb.a com.sumsub.sns.internal.core.data.model.remote.d dVar, @sb.t("unsetFields") String str, T9.a<? super d.c.C0219d> aVar);

    @sb.o("/resources/sdk/applicant/questionnaires")
    Object a(@sb.a u uVar, T9.a<? super w> aVar);

    @sb.n("/resources/applicantActions")
    Object a(@sb.a y yVar, T9.a<? super w> aVar);

    @sb.o("/resources/applicants/{applicantId}/status/pending")
    Object a(@sb.s("applicantId") String str, T9.a<? super g> aVar);

    @sb.o("resources/applicants/{applicantId}/agreement")
    Object a(@sb.s("applicantId") String str, @sb.a com.sumsub.sns.internal.core.data.model.b bVar, T9.a<? super d.c.C0219d> aVar);

    @sb.o("/resources/applicants/{applicantId}/info/mrtd")
    Object a(@sb.s("applicantId") String str, @sb.a com.sumsub.sns.internal.core.data.model.remote.b bVar, T9.a<? super g> aVar);

    @sb.o("resources/applicants/{applicantId}/identifierConfirmation/-/request")
    Object a(@sb.s("applicantId") String str, @sb.a a0 a0Var, T9.a<? super b0> aVar);

    @sb.o("resources/applicants/{applicantId}/ekyc/submit")
    Object a(@sb.s("applicantId") String str, @sb.a b bVar, T9.a<? super e0> aVar);

    @sb.o("resources/applicants/{applicantId}/ekyc/confirm/{confirmationId}")
    Object a(@sb.s("applicantId") String str, @sb.s("confirmationId") String str2, @sb.a a aVar, T9.a<? super e0> aVar2);

    @sb.o("resources/applicants/{applicantId}/identifierConfirmation/{verificationId}/verify")
    Object a(@sb.s("applicantId") String str, @sb.s("verificationId") String str2, @sb.t("code") String str3, T9.a<? super b0> aVar);

    @sb.o("/resources/applicants/{applicantId}/info/location")
    Object a(@sb.s("applicantId") String str, @sb.a okhttp3.o oVar, T9.a<? super Map<String, ? extends Object>> aVar);

    @sb.n("/resources/applicants/{applicantId}/fixedInfo")
    Object a(@sb.s("applicantId") String str, @sb.a okhttp3.o oVar, @sb.t("unsetFields") String str2, T9.a<? super d.c.C0218c> aVar);

    @sb.o("resources/applicantActions/{actionId}/agreement")
    Object b(@sb.s("actionId") String str, @sb.a com.sumsub.sns.internal.core.data.model.b bVar, T9.a<? super d.c.C0219d> aVar);

    @sb.o("resources/applicantActions/{actionId}/identifierConfirmation/-/request")
    Object b(@sb.s("actionId") String str, @sb.a a0 a0Var, T9.a<? super b0> aVar);

    @sb.o("resources/applicantActions/{actionId}/identifierConfirmation/{verificationId}/verify")
    Object b(@sb.s("actionId") String str, @sb.s("verificationId") String str2, @sb.t("code") String str3, T9.a<? super b0> aVar);

    @sb.n("resources/applicants")
    Object b(@sb.a okhttp3.o oVar, T9.a<? super com.sumsub.sns.internal.core.data.model.remote.response.d> aVar);

    @sb.o("/resources/videoIdent/applicant/{applicantId}/apply")
    Object c(@sb.s("applicantId") String str, T9.a<? super h0> aVar);

    @sb.o("resources/applicants/{applicantId}/ekyc/skip")
    Object d(@sb.s("applicantId") String str, T9.a<? super d0> aVar);

    @sb.f("resources/applicants/{applicantId}/one")
    Object e(@sb.s("applicantId") String str, T9.a<? super d.c.C0219d> aVar);

    @sb.o("/resources/applicantActions/{actionId}/review/status/pending")
    Object f(@sb.s("actionId") String str, T9.a<? super d.c.C0219d> aVar);

    @sb.f("/resources/questionnaires/-;id={questionnaireId}/one")
    Object g(@sb.s("questionnaireId") String str, T9.a<? super w> aVar);
}
