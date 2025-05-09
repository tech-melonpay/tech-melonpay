package com.sumsub.sns.internal.core.data.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class r {
    public static final Map<String, String> a(LogParams logParams) {
        return com.sumsub.sns.internal.core.common.i.a(a.s(new Pair("errorType", logParams.getErrorType()), new Pair(FirebaseAnalytics.Param.LOCATION, logParams.getLocation()), new Pair("externalUserId", logParams.getExternalUserId()), new Pair("fileName", logParams.getFileName()), new Pair("applicantId", logParams.getApplicantId()), new Pair("message", logParams.getMessage()), new Pair("kind", logParams.getKind()), new Pair("stacktrace", logParams.getStacktrace())));
    }
}
