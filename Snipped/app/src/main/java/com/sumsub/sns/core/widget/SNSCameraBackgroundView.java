package com.sumsub.sns.core.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.theme.SNSColorElement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSCameraBackgroundView;", "Lcom/sumsub/sns/core/widget/SNSBackgroundView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SNSCameraBackgroundView extends SNSBackgroundView {
    public SNSCameraBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public /* synthetic */ SNSCameraBackgroundView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_CameraBackgroundViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSCameraBackgroundView : i9);
    }

    public SNSCameraBackgroundView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        Integer a10;
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        SNSColorElement sNSColorElement = SNSColorElement.CAMERA_BACKGROUND;
        com.sumsub.sns.internal.core.theme.d a11 = aVar.a();
        if (a11 == null || (a10 = aVar.a(a11, sNSColorElement, aVar.a(this))) == null) {
            return;
        }
        setBackground(new ColorDrawable(a10.intValue()));
    }
}
