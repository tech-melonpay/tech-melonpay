package com.sumsub.sns.internal.videoident.presentation;

import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.videoident.presentation.SNSViewState;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class j {
    public static final SNSViewState.e b(SNSViewState.e eVar, b.c cVar, Exception exc) {
        k G8 = eVar.G();
        if (G8 != null) {
            G8.a(exc instanceof SNSException.Network ? cVar.a("sns_videoident_error_connectionFailedNetwork") : cVar.a("sns_videoident_error_connectionFailedFatal"));
        }
        return eVar;
    }

    public static final SNSViewState.e b(SNSViewState.e eVar, b.c cVar, long j10) {
        String a10 = cVar.a("sns_videoident_warning_waitForConnect_adaptive");
        eVar.e(a10 != null ? new Regex("\\{timeInMinutes\\}").c(a10, String.valueOf(ha.h.P(j10 / 60, 1L))) : null);
        return eVar;
    }
}
