package com.sumsub.sns.core.widget;

import T2.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/sumsub/sns/core/widget/SNSRadioGroup;", "Landroid/widget/RadioGroup;", "Lcom/sumsub/sns/internal/core/widget/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "getSNSStepState", "()Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "state", "LO9/p;", "setSNSStepState", "(Lcom/sumsub/sns/internal/core/widget/SNSStepState;)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Landroid/view/View;", "child", FirebaseAnalytics.Param.INDEX, "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "LT2/i;", "shapeAppearanceModel", "LT2/i;", "stepState", "Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "LT2/f;", "boxBackground", "LT2/f;", "getBoxBackground$idensic_mobile_sdk_aar_release", "()LT2/f;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSRadioGroup extends RadioGroup implements com.sumsub.sns.internal.core.widget.a {
    private final T2.f boxBackground;
    private final i shapeAppearanceModel;
    private SNSStepState stepState;

    public SNSRadioGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // android.widget.RadioGroup, android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        Integer a10;
        super.addView(child, index, params);
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a11 = aVar.a();
        if (!(child instanceof RadioButton) || a11 == null) {
            return;
        }
        SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
        com.sumsub.sns.internal.core.theme.d a12 = aVar.a();
        if (a12 == null || (a10 = aVar.a(a12, sNSColorElement, aVar.a(this))) == null) {
            return;
        }
        int intValue = a10.intValue();
        int[][] iArr = {new int[]{-16842912}, new int[]{R.attr.state_checked}};
        Integer a13 = aVar.a(this, SNSColorElement.FIELD_TINT);
        ((RadioButton) child).setButtonTintList(new ColorStateList(iArr, new int[]{intValue, a13 != null ? a13.intValue() : intValue}));
    }

    /* renamed from: getBoxBackground$idensic_mobile_sdk_aar_release, reason: from getter */
    public final T2.f getBoxBackground() {
        return this.boxBackground;
    }

    @Override // com.sumsub.sns.internal.core.widget.a
    public SNSStepState getSNSStepState() {
        SNSStepState sNSStepState = this.stepState;
        return sNSStepState == null ? SNSStepState.INIT : sNSStepState;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? SNSStepViewExtensionsKt.getSnsStepStateDrawable(this) : new int[]{R$attr.sns_stateInit});
    }

    @Override // com.sumsub.sns.internal.core.widget.a
    public void setSNSStepState(SNSStepState state) {
        if (state != this.stepState) {
            this.stepState = state;
            this.boxBackground.setState(SNSStepViewExtensionsKt.getSnsStepStateDrawable(this));
            refreshDrawableState();
        }
    }

    public /* synthetic */ SNSRadioGroup(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_RadioGroupStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSRadioGroup : i9);
    }

    public SNSRadioGroup(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet);
        Float a10;
        Integer a11;
        i a12 = i.b(context, attributeSet, i, i9).a();
        this.shapeAppearanceModel = a12;
        T2.f fVar = new T2.f(a12);
        this.boxBackground = fVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSRadioGroup, i, i9);
        fVar.o(com.sumsub.sns.internal.core.common.i.a(obtainStyledAttributes, context, R$styleable.SNSRadioGroup_sns_radioBackgroundColor));
        setBackground(fVar);
        setShowDividers(obtainStyledAttributes.getInt(R$styleable.SNSRadioGroup_android_showDividers, 0));
        setDividerDrawable(obtainStyledAttributes.getDrawable(R$styleable.SNSRadioGroup_android_divider));
        obtainStyledAttributes.recycle();
        int[][] iArr = {new int[]{R$attr.sns_stateInit}, new int[]{R$attr.sns_stateRejected}, new int[0]};
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        Integer a13 = aVar.a(this, SNSColorElement.FIELD_BACKGROUND_INVALID);
        a13 = a13 == null ? aVar.a(this, SNSColorElement.BACKGROUND_CRITICAL) : a13;
        if (a13 != null) {
            fVar.o(new ColorStateList(iArr, new int[]{0, a13.intValue(), 0}));
        }
        SNSColorElement sNSColorElement = SNSColorElement.LIST_SEPARATOR;
        com.sumsub.sns.internal.core.theme.d a14 = aVar.a();
        if (a14 != null && (a11 = aVar.a(a14, sNSColorElement, aVar.a(this))) != null) {
            getDividerDrawable().setColorFilter(new PorterDuffColorFilter(a11.intValue(), PorterDuff.Mode.SRC));
        }
        SNSMetricElement sNSMetricElement = SNSMetricElement.FIELD_CORNER_RADIUS;
        com.sumsub.sns.internal.core.theme.d a15 = aVar.a();
        if (a15 == null || (a10 = aVar.a(a15, sNSMetricElement)) == null) {
            return;
        }
        fVar.m(a10.floatValue());
    }
}
