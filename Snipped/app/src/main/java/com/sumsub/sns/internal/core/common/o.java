package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class o {
    public static final com.sumsub.sns.internal.core.data.model.o a(Throwable th, Object obj) {
        if (th instanceof SNSException.Api) {
            return a((SNSException.Api) th, obj);
        }
        if ((th instanceof IOException) || (th instanceof SNSException.Network)) {
            return new o.e(th, obj, null, 4, null);
        }
        if (th instanceof CancellationException) {
            return null;
        }
        return new o.c(th, obj, null, 4, null);
    }

    public static final com.sumsub.sns.internal.core.data.model.o a(SNSException.Api api, Object obj) {
        Integer errorCode = api.getErrorCode();
        return ((errorCode != null && errorCode.intValue() == 1000) || (errorCode != null && errorCode.intValue() == 1001) || ((errorCode != null && errorCode.intValue() == 1002) || ((errorCode != null && errorCode.intValue() == 1003) || ((errorCode != null && errorCode.intValue() == 1004) || ((errorCode != null && errorCode.intValue() == 1005) || ((errorCode != null && errorCode.intValue() == 1006) || ((errorCode != null && errorCode.intValue() == 1007) || ((errorCode != null && errorCode.intValue() == 2000) || ((errorCode != null && errorCode.intValue() == 2001) || ((errorCode != null && errorCode.intValue() == 2002) || ((errorCode != null && errorCode.intValue() == 2003) || ((errorCode != null && errorCode.intValue() == 2004) || (errorCode != null && errorCode.intValue() == 2005))))))))))))) ? new o.f(api.getDescription(), api, obj, null, 8, null) : new o.c(api, obj, null, 4, null);
    }

    public static final String a(Throwable th, b.c cVar) {
        return th instanceof SNSException.Api ? ((SNSException.Api) th).getDescription() : th instanceof SNSException.Network ? cVar.a("sns_oops_network_html") : th instanceof SNSException.Unknown ? ((SNSException.Unknown) th).getLocalizedMessage() : "Unknown exception";
    }
}
