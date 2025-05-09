package com.sumsub.sns.core.widget;

import O9.p;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.textview.MaterialTextView;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import k0.C0913a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002BE\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSTextView;", "Lcom/google/android/material/textview/MaterialTextView;", "Lcom/sumsub/sns/internal/core/widget/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lcom/sumsub/sns/core/theme/SNSTypographyElement;", "typographyElementName", "Lcom/sumsub/sns/core/theme/SNSColorElement;", "colorElementName", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/sumsub/sns/core/theme/SNSTypographyElement;Lcom/sumsub/sns/core/theme/SNSColorElement;)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "getSNSStepState", "()Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "state", "LO9/p;", "setSNSStepState", "(Lcom/sumsub/sns/internal/core/widget/SNSStepState;)V", "stepState", "Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class SNSTextView extends MaterialTextView implements com.sumsub.sns.internal.core.widget.a {
    private SNSStepState stepState;

    public SNSTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, null, 60, null);
    }

    @Override // com.sumsub.sns.internal.core.widget.a
    public SNSStepState getSNSStepState() {
        SNSStepState sNSStepState = this.stepState;
        return sNSStepState == null ? SNSStepState.INIT : sNSStepState;
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? SNSStepViewExtensionsKt.getSnsStepStateDrawable(this) : new int[]{R$attr.sns_stateInit});
    }

    @Override // com.sumsub.sns.internal.core.widget.a
    public void setSNSStepState(SNSStepState state) {
        if (state != this.stepState) {
            this.stepState = state;
            refreshDrawableState();
        }
    }

    public /* synthetic */ SNSTextView(Context context, AttributeSet attributeSet, int i, int i9, SNSTypographyElement sNSTypographyElement, SNSColorElement sNSColorElement, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_BodyTextViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSTextView_Body : i9, (i10 & 16) != 0 ? SNSTypographyElement.BODY : sNSTypographyElement, (i10 & 32) != 0 ? SNSColorElement.CONTENT_NEUTRAL : sNSColorElement);
    }

    public SNSTextView(Context context, AttributeSet attributeSet, int i, int i9, SNSTypographyElement sNSTypographyElement, SNSColorElement sNSColorElement) {
        super(context, attributeSet, i, i9);
        this.stepState = SNSStepState.INIT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSTextView, i, i9);
        int i10 = R$styleable.SNSTextView_android_textAppearance;
        if (obtainStyledAttributes.hasValue(i10)) {
            setTextAppearance(obtainStyledAttributes.getResourceId(i10, 0));
        }
        int i11 = R$styleable.SNSTextView_android_gravity;
        if (obtainStyledAttributes.hasValue(i11)) {
            setGravity(obtainStyledAttributes.getInteger(i11, 8388611));
        }
        int i12 = R$styleable.SNSTextView_android_background;
        if (obtainStyledAttributes.hasValue(i12)) {
            setBackground(obtainStyledAttributes.getDrawable(i12));
        }
        int i13 = R$styleable.SNSTextView_sns_textColor;
        if (obtainStyledAttributes.hasValue(i13)) {
            setTextColor(obtainStyledAttributes.getColor(i13, C0913a.getColor(context, R.color.white)));
        }
        int i14 = R$styleable.SNSTextView_android_drawableStart;
        if (obtainStyledAttributes.hasValue(i14)) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            Drawable drawable = obtainStyledAttributes.getDrawable(i14);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                p pVar = p.f3034a;
            } else {
                drawable = null;
            }
            compoundDrawables[0] = drawable;
            setCompoundDrawables(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        }
        int i15 = R$styleable.SNSTextView_android_drawablePadding;
        if (obtainStyledAttributes.hasValue(i15)) {
            setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(i15, 0));
        }
        p pVar2 = p.f3034a;
        obtainStyledAttributes.recycle();
        com.sumsub.sns.core.presentation.helper.a.f14273a.a(this, sNSTypographyElement, sNSColorElement);
    }
}
