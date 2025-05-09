package com.sumsub.sns.core.widget;

import O9.p;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.RadioButton;
import ca.InterfaceC0635a;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$CardStyle;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.internal.core.common.i;
import k0.C0913a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSCardRadioButton;", "Landroid/widget/RadioButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "cardStyle", "LO9/p;", "setBackground", "(Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setStartDrawable", "(Landroid/graphics/drawable/Drawable;)V", "radioDrawable$delegate", "LO9/f;", "getRadioDrawable", "()Landroid/graphics/drawable/Drawable;", "radioDrawable", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public final class SNSCardRadioButton extends RadioButton {
    private final GradientDrawable backgroundDrawable;

    /* renamed from: radioDrawable$delegate, reason: from kotlin metadata */
    private final O9.f radioDrawable;

    public /* synthetic */ SNSCardRadioButton(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_cardRadioButtonViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSCardRadioButton : i9);
    }

    private final Drawable getRadioDrawable() {
        return (Drawable) this.radioDrawable.getValue();
    }

    private final void setBackground(String cardStyle) {
        Float a10;
        Float a11;
        Float a12;
        if (!kotlin.jvm.internal.f.b(cardStyle, SNSThemeMetric$CardStyle.BORDERED.getValue())) {
            if (!kotlin.jvm.internal.f.b(cardStyle, SNSThemeMetric$CardStyle.PLAIN.getValue())) {
                setBackground((Drawable) null);
                return;
            }
            GradientDrawable gradientDrawable = this.backgroundDrawable;
            com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
            Integer a13 = aVar.a(this, SNSColorElement.CARD_PLAIN_BACKGROUND);
            gradientDrawable.setColor(a13 != null ? a13.intValue() : 0);
            com.sumsub.sns.internal.core.theme.d a14 = aVar.a();
            gradientDrawable.setCornerRadius((a14 == null || (a10 = aVar.a(a14, SNSMetricElement.CARD_CORNER_RADIUS)) == null) ? getResources().getDimension(R$dimen.sns_agreement_card_corner_radius) : a10.floatValue());
            setBackground(this.backgroundDrawable);
            return;
        }
        GradientDrawable gradientDrawable2 = this.backgroundDrawable;
        com.sumsub.sns.core.presentation.helper.a aVar2 = com.sumsub.sns.core.presentation.helper.a.f14273a;
        Integer a15 = aVar2.a(this, SNSColorElement.CARD_BORDERED_BACKGROUND);
        gradientDrawable2.setColor(a15 != null ? a15.intValue() : 0);
        com.sumsub.sns.internal.core.theme.d a16 = aVar2.a();
        int dimension = (int) ((a16 == null || (a12 = aVar2.a(a16, SNSMetricElement.CARD_BORDER_WIDTH)) == null) ? getResources().getDimension(R$dimen.sns_agreement_card_stroke_width) : a12.floatValue());
        Integer a17 = aVar2.a(this, SNSColorElement.CONTENT_WEAK);
        gradientDrawable2.setStroke(dimension, a17 != null ? a17.intValue() : getResources().getColor(R$color.sns_color_neutral_20));
        com.sumsub.sns.internal.core.theme.d a18 = aVar2.a();
        gradientDrawable2.setCornerRadius((a18 == null || (a11 = aVar2.a(a18, SNSMetricElement.CARD_CORNER_RADIUS)) == null) ? getResources().getDimension(R$dimen.sns_agreement_card_corner_radius) : a11.floatValue());
        setBackground(this.backgroundDrawable);
    }

    public final void setStartDrawable(Drawable drawable) {
        setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, getRadioDrawable(), (Drawable) null);
    }

    public SNSCardRadioButton(final Context context, AttributeSet attributeSet, int i, int i9) {
        super(Y2.a.a(context, attributeSet, i, i9), attributeSet, i, i9);
        Integer a10;
        this.radioDrawable = kotlin.a.a(new InterfaceC0635a<Drawable>() { // from class: com.sumsub.sns.core.widget.SNSCardRadioButton$radioDrawable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final Drawable invoke() {
                Resources resources = SNSCardRadioButton.this.getResources();
                int b9 = i.b(context, R.attr.listChoiceIndicatorSingle);
                Resources.Theme theme = context.getTheme();
                ThreadLocal<TypedValue> threadLocal = m0.f.f23858a;
                return resources.getDrawable(b9, theme);
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        setButtonDrawable((Drawable) null);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setStartDrawable(null);
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(R$dimen.sns_margin_small));
        setBackground(gradientDrawable);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSCardRadioButton, i, i9);
        int i10 = R$styleable.SNSCardRadioButton_sns_cardRadioButtonBackgroundColor;
        if (obtainStyledAttributes.hasValue(i10)) {
            gradientDrawable.setColor(obtainStyledAttributes.getColor(i10, C0913a.getColor(context, R.color.transparent)));
        }
        int i11 = R$styleable.SNSCardRadioButton_sns_cardRadioButtonStrokeColor;
        Integer valueOf = obtainStyledAttributes.hasValue(i11) ? Integer.valueOf(obtainStyledAttributes.getColor(i11, C0913a.getColor(context, R.color.transparent))) : null;
        int i12 = R$styleable.SNSCardRadioButton_sns_cardRadioButtonStrokeWidth;
        Integer valueOf2 = obtainStyledAttributes.hasValue(i12) ? Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(i12, 0)) : null;
        if (valueOf != null && valueOf2 != null) {
            gradientDrawable.setStroke(valueOf2.intValue(), valueOf.intValue());
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SNSCardRadioButton_sns_cardRadioButtonCornerRadius)) {
            gradientDrawable.setCornerRadius(obtainStyledAttributes.getDimensionPixelSize(r5, 0));
        }
        p pVar = p.f3034a;
        obtainStyledAttributes.recycle();
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a11 = aVar.a();
        if (a11 != null) {
            aVar.a(this, SNSTypographyElement.SUBTITLE2, SNSColorElement.CONTENT_STRONG);
            String c2 = aVar.c(a11, SNSMetricElement.AGREEMENT_CARD_STYLE);
            if (c2 != null) {
                setBackground(c2);
            }
            SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
            com.sumsub.sns.internal.core.theme.d a12 = aVar.a();
            if (a12 == null || (a10 = aVar.a(a12, sNSColorElement, aVar.a(this))) == null) {
                return;
            }
            int intValue = a10.intValue();
            int[][] iArr = {new int[]{-16842912}, new int[]{R.attr.state_checked}};
            Integer a13 = aVar.a(this, SNSColorElement.FIELD_TINT);
            int[] iArr2 = {intValue, a13 != null ? a13.intValue() : intValue};
            Drawable radioDrawable = getRadioDrawable();
            if (radioDrawable != null) {
                radioDrawable.setTintList(new ColorStateList(iArr, iArr2));
            }
        }
    }
}
