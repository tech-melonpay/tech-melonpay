package com.sumsub.sns.core.data.listener;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "", "onUrl", "", "context", "Landroid/content/Context;", ImagesContract.URL, "", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface SNSUrlHandler {
    boolean onUrl(Context context, String url);
}
