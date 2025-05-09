package com.sumsub.sns.core.widget;

import O9.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$CardStyle;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.MessageBundle;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B=\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010\u001eJ\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b#\u0010\u001eR\u0018\u0010$\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0016\u00103\u001a\u0004\u0018\u00010&8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b2\u0010(R(\u0010:\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010=\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00107\"\u0004\b<\u00109R(\u0010C\u001a\u0004\u0018\u00010>2\b\u00105\u001a\u0004\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010F\u001a\u0004\u0018\u00010>2\b\u00105\u001a\u0004\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR(\u0010I\u001a\u0004\u0018\u00010>2\b\u00105\u001a\u0004\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010@\"\u0004\bH\u0010B¨\u0006J"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSStepView;", "Lcom/google/android/material/card/MaterialCardView;", "Lcom/sumsub/sns/internal/core/widget/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lcom/sumsub/sns/core/theme/SNSMetricElement;", "cardStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/sumsub/sns/core/theme/SNSMetricElement;)V", "LO9/p;", "applyTheme", "(Lcom/sumsub/sns/core/theme/SNSMetricElement;)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "getSNSStepState", "()Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "state", "setSNSStepState", "(Lcom/sumsub/sns/internal/core/widget/SNSStepState;)V", "Landroid/content/res/ColorStateList;", "tintColor", "setIconTintColor", "(Landroid/content/res/ColorStateList;)V", "getIconTintColor", "()Landroid/content/res/ColorStateList;", "colorStateList", "setTitleTextColor", "setSubtitleTextColor", "stepState", "Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "Landroid/widget/ImageView;", "getIconStartView", "()Landroid/widget/ImageView;", "iconStartView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "getTitlePlaceholderView", "titlePlaceholderView", "getSubtitleView", "subtitleView", "getIconEndView", "iconEndView", "Landroid/graphics/drawable/Drawable;", "value", "getIconStart", "()Landroid/graphics/drawable/Drawable;", "setIconStart", "(Landroid/graphics/drawable/Drawable;)V", "iconStart", "getIconEnd", "setIconEnd", "iconEnd", "", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", MessageBundle.TITLE_ENTRY, "getPlaceholder", "setPlaceholder", "placeholder", "getSubtitle", "setSubtitle", "subtitle", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class SNSStepView extends MaterialCardView implements com.sumsub.sns.internal.core.widget.a {
    private SNSStepState stepState;

    public SNSStepView(Context context) {
        this(context, null, 0, 0, null, 30, null);
    }

    private final void applyTheme(SNSMetricElement cardStyle) {
        com.sumsub.sns.core.presentation.helper.a aVar;
        com.sumsub.sns.internal.core.theme.d a10;
        if (cardStyle == null || (a10 = (aVar = com.sumsub.sns.core.presentation.helper.a.f14273a).a()) == null) {
            return;
        }
        int[][] b9 = aVar.b();
        ColorStateList iconTintColor = getIconTintColor();
        if (iconTintColor == null) {
            iconTintColor = ColorStateList.valueOf(-65281);
        }
        Integer a11 = aVar.a(this, SNSColorElement.CONTENT_WEAK);
        ColorStateList a12 = aVar.a(aVar.a(this), Integer.valueOf(a11 != null ? a11.intValue() : iconTintColor.getColorForState(new int[]{R$attr.sns_stateInit}, -65281)), iconTintColor);
        if (a12 != null) {
            setIconTintColor(a12);
        }
        ColorStateList cardBackgroundColor = getCardBackgroundColor();
        SNSColorElement sNSColorElement = SNSColorElement.BACKGROUND_NEUTRAL;
        Integer a13 = aVar.a(this, sNSColorElement);
        int intValue = a13 != null ? a13.intValue() : cardBackgroundColor.getColorForState(new int[]{R$attr.sns_stateInit}, -65281);
        SNSColorElement sNSColorElement2 = SNSColorElement.BACKGROUND_WARNING;
        Integer a14 = aVar.a(this, sNSColorElement2);
        int intValue2 = a14 != null ? a14.intValue() : cardBackgroundColor.getColorForState(new int[]{R$attr.sns_statePending}, -65281);
        Integer a15 = aVar.a(this, SNSColorElement.BACKGROUND_SUCCESS);
        int intValue3 = a15 != null ? a15.intValue() : cardBackgroundColor.getColorForState(new int[]{R$attr.sns_stateApproved}, -65281);
        Integer a16 = aVar.a(this, SNSColorElement.BACKGROUND_CRITICAL);
        int intValue4 = a16 != null ? a16.intValue() : cardBackgroundColor.getColorForState(new int[]{R$attr.sns_stateRejected}, -65281);
        Integer a17 = aVar.a(this, sNSColorElement2);
        int intValue5 = a17 != null ? a17.intValue() : cardBackgroundColor.getColorForState(new int[]{R$attr.sns_stateProcessing}, -65281);
        Integer a18 = aVar.a(this, sNSColorElement);
        int[] iArr = {intValue, intValue2, intValue3, intValue4, intValue5, a18 != null ? a18.intValue() : cardBackgroundColor.getDefaultColor()};
        Float a19 = aVar.a(a10, SNSMetricElement.CARD_CORNER_RADIUS);
        if (a19 != null) {
            setRadius(a19.floatValue());
        }
        Integer a20 = aVar.a(this, SNSColorElement.CONTENT_STRONG);
        if (a20 != null) {
            int intValue6 = a20.intValue();
            TextView titleView = getTitleView();
            if (titleView != null) {
                titleView.setTextColor(intValue6);
            }
        }
        String c2 = aVar.c(a10, cardStyle);
        p pVar = null;
        if (kotlin.jvm.internal.f.b(c2, SNSThemeMetric$CardStyle.BORDERED.getValue())) {
            Float a21 = aVar.a(a10, SNSMetricElement.CARD_BORDER_WIDTH);
            setStrokeWidth(a21 != null ? (int) a21.floatValue() : i.a(1));
            setStrokeColor(a12);
            Integer a22 = aVar.a(this, SNSColorElement.CARD_BORDERED_BACKGROUND);
            if (a22 != null) {
                int intValue7 = a22.intValue();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(getRadius());
                gradientDrawable.setColor(intValue7);
                setBackground(gradientDrawable);
                pVar = p.f3034a;
            }
            if (pVar == null) {
                setBackgroundColor(0);
            }
            TextView subtitleView = getSubtitleView();
            if (subtitleView != null) {
                com.sumsub.sns.core.presentation.helper.a.a(aVar, subtitleView, null, iconTintColor, 1, null);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.f.b(c2, SNSThemeMetric$CardStyle.PLAIN.getValue())) {
            setStrokeWidth(0);
            setCardBackgroundColor(new ColorStateList(b9, iArr));
            Integer a23 = aVar.a(this, SNSColorElement.CONTENT_NEUTRAL);
            if (a23 != null) {
                int intValue8 = a23.intValue();
                TextView subtitleView2 = getSubtitleView();
                if (subtitleView2 != null) {
                    subtitleView2.setTextColor(intValue8);
                    return;
                }
                return;
            }
            return;
        }
        setStrokeWidth(0);
        Integer a24 = aVar.a(this, SNSColorElement.CARD_PLAIN_BACKGROUND);
        if (a24 != null) {
            int intValue9 = a24.intValue();
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(getRadius());
            gradientDrawable2.setColor(intValue9);
            setBackground(gradientDrawable2);
            pVar = p.f3034a;
        }
        if (pVar == null) {
            setBackgroundColor(0);
        }
        Integer a25 = aVar.a(this, SNSColorElement.CONTENT_NEUTRAL);
        if (a25 != null) {
            int intValue10 = a25.intValue();
            TextView subtitleView3 = getSubtitleView();
            if (subtitleView3 != null) {
                subtitleView3.setTextColor(intValue10);
            }
        }
    }

    private final ImageView getIconStartView() {
        return (ImageView) findViewById(R$id.sns_item_start_icon);
    }

    private final TextView getSubtitleView() {
        return (TextView) findViewById(R$id.sns_item_subtitle);
    }

    private final TextView getTitlePlaceholderView() {
        return (TextView) findViewById(R$id.sns_item_title_placeholder);
    }

    private final TextView getTitleView() {
        return (TextView) findViewById(R$id.sns_item_title);
    }

    public final Drawable getIconEnd() {
        ImageView iconEndView = getIconEndView();
        if (iconEndView != null) {
            return iconEndView.getDrawable();
        }
        return null;
    }

    public final ImageView getIconEndView() {
        return (ImageView) findViewById(R$id.sns_item_end_icon);
    }

    public final Drawable getIconStart() {
        ImageView iconStartView = getIconStartView();
        if (iconStartView != null) {
            return iconStartView.getDrawable();
        }
        return null;
    }

    public ColorStateList getIconTintColor() {
        ImageView iconStartView = getIconStartView();
        if (iconStartView != null) {
            return iconStartView.getImageTintList();
        }
        return null;
    }

    public final CharSequence getPlaceholder() {
        TextView titlePlaceholderView = getTitlePlaceholderView();
        if (titlePlaceholderView != null) {
            return titlePlaceholderView.getText();
        }
        return null;
    }

    @Override // com.sumsub.sns.internal.core.widget.a
    public SNSStepState getSNSStepState() {
        SNSStepState sNSStepState = this.stepState;
        return sNSStepState == null ? SNSStepState.INIT : sNSStepState;
    }

    public final CharSequence getSubtitle() {
        TextView subtitleView = getSubtitleView();
        if (subtitleView != null) {
            return subtitleView.getText();
        }
        return null;
    }

    public final CharSequence getTitle() {
        TextView titleView = getTitleView();
        if (titleView != null) {
            return titleView.getText();
        }
        return null;
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? SNSStepViewExtensionsKt.getSnsStepStateDrawable(this) : new int[]{R$attr.sns_stateInit});
    }

    public final void setIconEnd(Drawable drawable) {
        ImageView iconEndView = getIconEndView();
        if (iconEndView != null) {
            iconEndView.setImageDrawable(drawable);
        }
        ImageView iconEndView2 = getIconEndView();
        if (iconEndView2 == null) {
            return;
        }
        iconEndView2.setVisibility(drawable == null ? 8 : 0);
    }

    public final void setIconStart(Drawable drawable) {
        ImageView iconStartView = getIconStartView();
        if (iconStartView != null) {
            iconStartView.setImageDrawable(drawable);
        }
        ImageView iconStartView2 = getIconStartView();
        if (iconStartView2 == null) {
            return;
        }
        iconStartView2.setVisibility(drawable == null ? 8 : 0);
    }

    public void setIconTintColor(ColorStateList tintColor) {
        ImageView iconStartView = getIconStartView();
        if (iconStartView != null) {
            iconStartView.setImageTintList(tintColor);
        }
        ImageView iconEndView = getIconEndView();
        if (iconEndView != null) {
            iconEndView.setImageTintList(tintColor);
        }
    }

    public final void setPlaceholder(CharSequence charSequence) {
        TextView titlePlaceholderView = getTitlePlaceholderView();
        if (titlePlaceholderView != null) {
            titlePlaceholderView.setText(charSequence);
        }
        TextView titlePlaceholderView2 = getTitlePlaceholderView();
        if (titlePlaceholderView2 != null) {
            CharSequence title = getTitle();
            i.a(titlePlaceholderView2, !(title == null || title.length() == 0));
        }
    }

    @Override // com.sumsub.sns.internal.core.widget.a
    public void setSNSStepState(SNSStepState state) {
        if (state != this.stepState) {
            this.stepState = state;
            refreshDrawableState();
            TextView titleView = getTitleView();
            if (titleView != null) {
                SNSStepViewExtensionsKt.setSnsStepState(titleView, state);
            }
            TextView subtitleView = getSubtitleView();
            if (subtitleView != null) {
                SNSStepViewExtensionsKt.setSnsStepState(subtitleView, state);
            }
            ImageView iconStartView = getIconStartView();
            if (iconStartView != null) {
                SNSStepViewExtensionsKt.setSnsStepState(iconStartView, state);
            }
            ImageView iconEndView = getIconEndView();
            if (iconEndView == null) {
                return;
            }
            SNSStepViewExtensionsKt.setSnsStepState(iconEndView, state);
        }
    }

    public final void setSubtitle(CharSequence charSequence) {
        TextView subtitleView = getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setText(charSequence);
        }
        TextView subtitleView2 = getSubtitleView();
        if (subtitleView2 == null) {
            return;
        }
        subtitleView2.setVisibility(charSequence == null ? 8 : 0);
    }

    public final void setSubtitleTextColor(ColorStateList colorStateList) {
        TextView subtitleView = getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setTextColor(colorStateList);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        TextView titleView = getTitleView();
        if (titleView != null) {
            titleView.setText(charSequence);
        }
        TextView titleView2 = getTitleView();
        if (titleView2 != null) {
            titleView2.setVisibility((charSequence == null || charSequence.length() == 0) ^ true ? 0 : 8);
        }
        TextView titlePlaceholderView = getTitlePlaceholderView();
        if (titlePlaceholderView != null) {
            i.a(titlePlaceholderView, !(charSequence == null || charSequence.length() == 0));
        }
    }

    public final void setTitleTextColor(ColorStateList colorStateList) {
        TextView titleView = getTitleView();
        if (titleView != null) {
            titleView.setTextColor(colorStateList);
        }
    }

    public SNSStepView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, 28, null);
    }

    public SNSStepView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, null, 24, null);
    }

    public SNSStepView(Context context, AttributeSet attributeSet, int i, int i9) {
        this(context, attributeSet, i, i9, null, 16, null);
    }

    public /* synthetic */ SNSStepView(Context context, AttributeSet attributeSet, int i, int i9, SNSMetricElement sNSMetricElement, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_StepViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSStepView : i9, (i10 & 16) != 0 ? SNSMetricElement.VERIFICATION_STEP_CARD_STYLE : sNSMetricElement);
    }

    public SNSStepView(Context context, AttributeSet attributeSet, int i, int i9, SNSMetricElement sNSMetricElement) {
        super(Y2.a.a(context, attributeSet, i, i9), attributeSet, i);
        this.stepState = SNSStepState.INIT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSStepView, i, i9);
        int i10 = R$styleable.SNSStepView_sns_stepBackgroundColor;
        if (obtainStyledAttributes.hasValue(i10)) {
            setCardBackgroundColor(i.a(obtainStyledAttributes, context, i10));
        }
        int i11 = R$styleable.SNSStepView_sns_stepStrokeColor;
        if (obtainStyledAttributes.hasValue(i11)) {
            setStrokeColor(i.a(obtainStyledAttributes, context, i11));
        }
        setStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSStepView_sns_stepStrokeWidth, 0));
        int i12 = R$styleable.SNSStepView_elevation;
        if (obtainStyledAttributes.hasValue(i12)) {
            setCardElevation(obtainStyledAttributes.getDimension(i12, 0.0f));
        }
        setShapeAppearanceModel(T2.i.b(context, attributeSet, i, i9).a());
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(R$styleable.SNSStepView_sns_stepViewLayout, 0), (ViewGroup) this, true);
        int i13 = R$styleable.SNSStepView_sns_stepIconTintColor;
        if (obtainStyledAttributes.hasValue(i13)) {
            setIconTintColor(i.a(obtainStyledAttributes, context, i13));
        }
        int i14 = R$styleable.SNSStepView_sns_stepTitleTextColor;
        if (obtainStyledAttributes.hasValue(i14)) {
            setTitleTextColor(i.a(obtainStyledAttributes, context, i14));
        }
        int i15 = R$styleable.SNSStepView_sns_stepSubtitleTextColor;
        if (obtainStyledAttributes.hasValue(i15)) {
            setSubtitleTextColor(i.a(obtainStyledAttributes, context, i15));
        }
        setIconStart(obtainStyledAttributes.getDrawable(R$styleable.SNSStepView_sns_iconStart));
        setIconEnd(obtainStyledAttributes.getDrawable(R$styleable.SNSStepView_sns_iconEnd));
        setTitle(obtainStyledAttributes.getText(R$styleable.SNSStepView_sns_title));
        setSubtitle(obtainStyledAttributes.getText(R$styleable.SNSStepView_sns_subtitle));
        p pVar = p.f3034a;
        obtainStyledAttributes.recycle();
        applyTheme(sNSMetricElement);
    }
}
