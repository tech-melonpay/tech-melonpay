package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.luminary.mobile.R;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.internal.core.theme.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSSecondaryButton;", "Lcom/google/android/material/button/MaterialButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "LO9/p;", "onMeasure", "(II)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSSecondaryButton extends MaterialButton {
    public SNSSecondaryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a10 = aVar.a();
        Float a11 = a10 != null ? aVar.a(a10, SNSMetricElement.BUTTON_HEIGHT) : null;
        if (a11 != null) {
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) a11.floatValue(), 1073741824));
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public /* synthetic */ SNSSecondaryButton(Context context, AttributeSet attributeSet, int i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.materialButtonOutlinedStyle : i);
    }

    public SNSSecondaryButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b.g gVar;
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a10 = aVar.a();
        if (a10 != null) {
            Map<String, b.g> d10 = a10.d();
            if (d10 != null && (gVar = d10.get(SNSTypographyElement.SUBTITLE1.getValue())) != null) {
                Typeface h9 = gVar.h();
                if (h9 != null) {
                    setTypeface(h9);
                }
                setTextSize(gVar.g());
            }
            int[][] iArr = {new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[0]};
            Integer a11 = aVar.a(this, SNSColorElement.SECONDARY_BUTTON_CONTENT);
            Integer a12 = aVar.a(this, SNSColorElement.SECONDARY_BUTTON_CONTENT_DISABLED);
            Integer a13 = aVar.a(this, SNSColorElement.SECONDARY_BUTTON_CONTENT_HIGHLIGHTED);
            if (a11 != null || a12 != null || a13 != null) {
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{a12 != null ? a12.intValue() : 0, a13 != null ? a13.intValue() : 0, a11 != null ? a11.intValue() : 0});
                setTextColor(colorStateList);
                setStrokeColor(colorStateList);
            }
            Integer a14 = aVar.a(this, SNSColorElement.SECONDARY_BUTTON_BACKGROUND);
            Integer a15 = aVar.a(this, SNSColorElement.SECONDARY_BUTTON_BACKGROUND_DISABLED);
            Integer a16 = aVar.a(this, SNSColorElement.SECONDARY_BUTTON_BACKGROUND_HIGHLIGHTED);
            if (a14 != null || a15 != null || a16 != null) {
                setElevation(0.0f);
                setStateListAnimator(null);
                setBackgroundTintList(new ColorStateList(iArr, new int[]{a15 != null ? a15.intValue() : 0, a16 != null ? a16.intValue() : 0, a14 != null ? a14.intValue() : 0}));
            }
            Float a17 = aVar.a(a10, SNSMetricElement.BUTTON_CORNER_RADIUS);
            if (a17 != null) {
                setCornerRadius((int) a17.floatValue());
            }
            Float a18 = aVar.a(a10, SNSMetricElement.BUTTON_BORDER_WIDTH);
            if (a18 != null) {
                setStrokeWidth((int) a18.floatValue());
            }
        }
    }
}
