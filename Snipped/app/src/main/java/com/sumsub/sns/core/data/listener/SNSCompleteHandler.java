package com.sumsub.sns.core.data.listener;

import androidx.annotation.Keep;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.data.model.SNSSDKState;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "", "Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "result", "Lcom/sumsub/sns/core/data/model/SNSSDKState;", "state", "LO9/p;", "onComplete", "(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Lcom/sumsub/sns/core/data/model/SNSSDKState;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface SNSCompleteHandler {
    void onComplete(SNSCompletionResult result, SNSSDKState state);
}
