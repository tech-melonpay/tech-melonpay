package com.sumsub.sns.core.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.internal.core.common.i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;", "LE2/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/appcompat/app/b;", "create", "()Landroidx/appcompat/app/b;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSAlertDialogBuilder extends E2.b {
    public SNSAlertDialogBuilder(Context context) {
        super(context);
    }

    @Override // E2.b, androidx.appcompat.app.b.a
    public androidx.appcompat.app.b create() {
        Integer a10;
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a11 = aVar.a();
        if (a11 != null && (a10 = aVar.a(a11, SNSColorElement.ALERT_TINT, i.a(getContext().getResources().getConfiguration()))) != null) {
            int intValue = a10.intValue();
            Drawable background = getBackground();
            if (background != null) {
                background.setTintMode(PorterDuff.Mode.SRC_ATOP);
            }
            Drawable background2 = getBackground();
            if (background2 != null) {
                background2.setTint(intValue);
            }
        }
        return super.create();
    }
}
