package com.sumsub.sns.core.data.listener;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__BuildersKt;

@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/sumsub/sns/core/data/listener/CordovaTokenExpirationHandler;", "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "()V", "onTokenExpired", "", "onTokenExpiredMain", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CordovaTokenExpirationHandler implements TokenExpirationHandler {
    @Override // com.sumsub.sns.core.data.listener.TokenExpirationHandler
    public String onTokenExpired() {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new CordovaTokenExpirationHandler$onTokenExpired$1(this, null), 1, null);
        return (String) runBlocking$default;
    }

    public abstract String onTokenExpiredMain();
}
