package com.sumsub.sns.core.widget;

import O9.p;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.theme.b;
import java.util.Map;
import k0.C0913a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSTextButton;", "Lcom/google/android/material/button/MaterialButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "widthMeasureSpec", "heightMeasureSpec", "LO9/p;", "onMeasure", "(II)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSTextButton extends MaterialButton {
    public SNSTextButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
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

    public /* synthetic */ SNSTextButton(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_TextButtonStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSTextView_TextButton : i9);
    }

    public SNSTextButton(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i);
        b.g gVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSTextButton, i, i9);
        int i10 = R$styleable.SNSTextButton_android_textAppearance;
        if (obtainStyledAttributes.hasValue(i10)) {
            setTextAppearance(obtainStyledAttributes.getResourceId(i10, 0));
        }
        int i11 = R$styleable.SNSTextButton_android_gravity;
        if (obtainStyledAttributes.hasValue(i11)) {
            setGravity(obtainStyledAttributes.getInteger(i11, 17));
        }
        int i12 = R$styleable.SNSTextButton_android_minHeight;
        if (obtainStyledAttributes.hasValue(i12)) {
            setMinHeight(obtainStyledAttributes.getDimensionPixelSize(i12, 0));
        }
        int i13 = R$styleable.SNSTextButton_backgroundTint;
        if (obtainStyledAttributes.hasValue(i13)) {
            setBackgroundTintList(i.a(obtainStyledAttributes, context, i13));
        }
        int i14 = R$styleable.SNSTextButton_rippleColor;
        if (obtainStyledAttributes.hasValue(i14)) {
            setRippleColor(i.a(obtainStyledAttributes, context, i14));
        }
        int i15 = R$styleable.SNSTextButton_android_paddingLeft;
        if (obtainStyledAttributes.hasValue(i15)) {
            setPadding(obtainStyledAttributes.getDimensionPixelSize(i15, getPaddingLeft()), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        int i16 = R$styleable.SNSTextButton_android_paddingRight;
        if (obtainStyledAttributes.hasValue(i16)) {
            setPadding(getPaddingLeft(), getPaddingTop(), obtainStyledAttributes.getDimensionPixelSize(i16, getPaddingRight()), getPaddingBottom());
        }
        int i17 = R$styleable.SNSTextButton_android_textColor;
        if (obtainStyledAttributes.hasValue(i17)) {
            setTextColor(obtainStyledAttributes.getColor(i17, C0913a.getColor(context, R.color.white)));
        }
        p pVar = p.f3034a;
        obtainStyledAttributes.recycle();
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a10 = aVar.a();
        if (a10 != null) {
            Map<String, b.g> d10 = a10.d();
            if (d10 != null && (gVar = d10.get(SNSTypographyElement.SUBTITLE2.getValue())) != null) {
                Typeface h9 = gVar.h();
                if (h9 != null) {
                    setTypeface(h9);
                }
                setTextSize(gVar.g());
            }
            int[][] iArr = {new int[]{-16842910}, new int[]{R.attr.state_pressed}, new int[0]};
            Integer a11 = aVar.a(this, SNSColorElement.SECONDARY_BUTTON_CONTENT);
            Integer a12 = aVar.a(this, SNSColorElement.SECONDARY_BUTTON_CONTENT_DISABLED);
            Integer a13 = aVar.a(this, SNSColorElement.SECONDARY_BUTTON_CONTENT_HIGHLIGHTED);
            if (a11 != null || a12 != null || a13 != null) {
                setTextColor(new ColorStateList(iArr, new int[]{a12 != null ? a12.intValue() : 0, a13 != null ? a13.intValue() : 0, a11 != null ? a11.intValue() : 0}));
            }
            setElevation(0.0f);
            setStateListAnimator(null);
            Integer a14 = aVar.a(this, SNSColorElement.SECONDARY_BUTTON_BACKGROUND);
            Integer a15 = aVar.a(this, SNSColorElement.SECONDARY_BUTTON_BACKGROUND_DISABLED);
            Integer a16 = aVar.a(this, SNSColorElement.SECONDARY_BUTTON_BACKGROUND_HIGHLIGHTED);
            if (a14 != null || a15 != null || a16 != null) {
                setBackgroundTintList(new ColorStateList(iArr, new int[]{a15 != null ? a15.intValue() : 0, a16 != null ? a16.intValue() : 0, a14 != null ? a14.intValue() : 0}));
            }
            Float a17 = aVar.a(a10, SNSMetricElement.BUTTON_CORNER_RADIUS);
            if (a17 != null) {
                setCornerRadius((int) a17.floatValue());
            }
        }
    }
}
