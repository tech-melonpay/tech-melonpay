package com.sumsub.sns.internal.core.domain.base;

import com.sumsub.sns.core.data.listener.SNSErrorHandler;
import com.sumsub.sns.core.data.model.SNSApplicantNotFoundException;
import com.sumsub.sns.core.data.model.SNSConfigNotFoundException;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.internal.core.common.e0;

/* loaded from: classes2.dex */
public final class d {
    public static final Exception a(com.sumsub.sns.internal.core.data.source.common.a aVar, Exception exc) {
        if (exc instanceof SNSException) {
            SNSException sNSException = (SNSException) exc;
            if (sNSException instanceof SNSException.Api) {
                Integer code = ((SNSException.Api) exc).getCode();
                aVar.a((code != null && code.intValue() == 401) ? SNSSDKState.Failed.Unauthorized.INSTANCE : new SNSSDKState.Failed.Unknown(exc));
            } else if (sNSException instanceof SNSException.Unknown) {
                aVar.a(new SNSSDKState.Failed.Unknown(exc));
            } else if (sNSException instanceof SNSException.Network) {
                aVar.a(new SNSSDKState.Failed.NetworkError(exc));
            }
            try {
                SNSErrorHandler errorHandler = e0.f15081a.getErrorHandler();
                if (errorHandler != null) {
                    errorHandler.onError((SNSException) exc);
                }
            } catch (Exception e10) {
                com.sumsub.sns.internal.log.a aVar2 = com.sumsub.sns.internal.log.a.f17535a;
                String a10 = com.sumsub.sns.internal.log.c.a(aVar);
                String message = e10.getMessage();
                if (message == null) {
                    message = "";
                }
                aVar2.e(a10, message, e10);
            }
        } else if (exc instanceof SNSApplicantNotFoundException) {
            aVar.a(new SNSSDKState.Failed.ApplicantNotFound(exc));
        } else if (exc instanceof SNSConfigNotFoundException) {
            aVar.a(new SNSSDKState.Failed.InitialLoadingFailed(exc));
        }
        return exc;
    }
}
