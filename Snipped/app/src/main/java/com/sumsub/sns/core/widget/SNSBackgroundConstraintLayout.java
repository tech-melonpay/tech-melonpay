package com.sumsub.sns.core.widget;

import O9.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public class SNSBackgroundConstraintLayout extends ConstraintLayout {
    public SNSBackgroundConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public /* synthetic */ SNSBackgroundConstraintLayout(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_BackgroundConstraintLayoutStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSBackgroundView : i9);
    }

    public SNSBackgroundConstraintLayout(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i);
        Integer a10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSBackgroundConstraintLayout, i, i9);
        int i10 = R$styleable.SNSBackgroundConstraintLayout_android_background;
        if (obtainStyledAttributes.hasValue(i10)) {
            setBackground(obtainStyledAttributes.getDrawable(i10));
        }
        p pVar = p.f3034a;
        obtainStyledAttributes.recycle();
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        SNSColorElement sNSColorElement = SNSColorElement.BACKGROUND_COMMON;
        com.sumsub.sns.internal.core.theme.d a11 = aVar.a();
        if (a11 == null || (a10 = aVar.a(a11, sNSColorElement, aVar.a(this))) == null) {
            return;
        }
        setBackground(new ColorDrawable(a10.intValue()));
    }
}
