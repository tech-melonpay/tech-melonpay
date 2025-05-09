package com.sumsub.sns.core.theme;

import android.content.Context;
import com.sumsub.sns.internal.core.theme.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sumsub/sns/core/theme/SNSJsonCustomizationImpl;", "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "<init>", "()V", "Landroid/content/Context;", "context", "LO9/p;", "loadResources", "(Landroid/content/Context;)V", "Lcom/sumsub/sns/internal/core/theme/d;", "getTheme", "()Lcom/sumsub/sns/internal/core/theme/d;", "theme", "Lcom/sumsub/sns/internal/core/theme/d;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSJsonCustomizationImpl implements SNSJsonCustomization {
    private d theme;

    @Override // com.sumsub.sns.core.theme.SNSJsonCustomization
    public void loadResources(Context context) {
        d dVar = this.theme;
        if (dVar != null) {
            dVar.a(context);
        }
    }

    @Override // com.sumsub.sns.core.theme.SNSJsonCustomization
    public d getTheme() {
        return this.theme;
    }
}
