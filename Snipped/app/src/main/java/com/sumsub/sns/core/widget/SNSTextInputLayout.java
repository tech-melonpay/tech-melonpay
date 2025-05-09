package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.luminary.mobile.R;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import ka.C0969n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014¢\u0006\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102¨\u00065"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/sumsub/sns/internal/core/widget/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/drawable/Drawable;", "icon", "LO9/p;", "setStartIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "setEndIconDrawable", "Landroid/view/View;", "child", FirebaseAnalytics.Param.INDEX, "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "", "errorText", "setError", "(Ljava/lang/CharSequence;)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "getSNSStepState", "()Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "state", "setSNSStepState", "(Lcom/sumsub/sns/internal/core/widget/SNSStepState;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "stepState", "Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "Landroid/content/res/ColorStateList;", "editorBackgroundColor", "Landroid/content/res/ColorStateList;", "errorColor", "backgroundColorNormal", "Ljava/lang/Integer;", "backgroundColorError", "hintColor", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class SNSTextInputLayout extends TextInputLayout implements com.sumsub.sns.internal.core.widget.a {
    private Integer backgroundColorError;
    private Integer backgroundColorNormal;
    private final ColorStateList editorBackgroundColor;
    private final ColorStateList errorColor;
    private Integer hintColor;
    private SNSStepState stepState;

    public SNSTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r3 = r3.getTextCursorDrawable();
     */
    @Override // com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
        /*
            r1 = this;
            super.addView(r2, r3, r4)
            boolean r2 = r2 instanceof android.widget.EditText
            if (r2 == 0) goto L4d
            android.widget.EditText r2 = r1.getEditText()
            if (r2 == 0) goto L16
            com.sumsub.sns.core.presentation.helper.a r3 = com.sumsub.sns.core.presentation.helper.a.f14273a
            com.sumsub.sns.core.theme.SNSTypographyElement r4 = com.sumsub.sns.core.theme.SNSTypographyElement.SUBTITLE2
            com.sumsub.sns.core.theme.SNSColorElement r0 = com.sumsub.sns.core.theme.SNSColorElement.FIELD_CONTENT
            r3.a(r2, r4, r0)
        L16:
            com.sumsub.sns.core.presentation.helper.a r2 = com.sumsub.sns.core.presentation.helper.a.f14273a
            com.sumsub.sns.core.theme.SNSColorElement r3 = com.sumsub.sns.core.theme.SNSColorElement.FIELD_TINT
            com.sumsub.sns.internal.core.theme.d r4 = r2.a()
            if (r4 == 0) goto L4d
            boolean r0 = r2.a(r1)
            java.lang.Integer r2 = r2.a(r4, r3, r0)
            if (r2 == 0) goto L4d
            int r2 = r2.intValue()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L43
            android.widget.EditText r3 = r1.getEditText()
            if (r3 == 0) goto L43
            android.graphics.drawable.Drawable r3 = A1.c.g(r3)
            if (r3 == 0) goto L43
            r3.setTint(r2)
        L43:
            android.widget.EditText r3 = r1.getEditText()
            if (r3 != 0) goto L4a
            goto L4d
        L4a:
            r3.setHighlightColor(r2)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.widget.SNSTextInputLayout.addView(android.view.View, int, android.view.ViewGroup$LayoutParams):void");
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

    @Override // com.google.android.material.textfield.TextInputLayout, android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a10 = aVar.a();
        Float a11 = a10 != null ? aVar.a(a10, SNSMetricElement.FIELD_HEIGHT) : null;
        if (a11 == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        EditText editText = getEditText();
        if (editText != null) {
            editText.setHeight((int) a11.floatValue());
        }
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) a11.floatValue(), 0));
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setEndIconDrawable(Drawable icon) {
        Integer a10;
        super.setEndIconDrawable(icon);
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
        com.sumsub.sns.internal.core.theme.d a11 = aVar.a();
        if (a11 == null || (a10 = aVar.a(a11, sNSColorElement, aVar.a(this))) == null) {
            return;
        }
        int intValue = a10.intValue();
        setEndIconTintList(null);
        setEndIconTintList(ColorStateList.valueOf(intValue));
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setError(CharSequence errorText) {
        super.setError(errorText);
        setSNSStepState((errorText == null || C0969n.i0(errorText)) ? SNSStepState.INIT : SNSStepState.REJECTED);
        Integer num = (errorText == null || errorText.length() <= 0) ? this.backgroundColorNormal : this.backgroundColorError;
        if (num != null) {
            setBoxBackgroundColor(num.intValue());
        }
        setErrorTextColor(this.errorColor);
        Integer num2 = this.hintColor;
        if (num2 != null) {
            int intValue = num2.intValue();
            EditText editText = getEditText();
            if (editText != null) {
                editText.setHintTextColor(intValue);
            }
        }
    }

    @Override // com.sumsub.sns.internal.core.widget.a
    public void setSNSStepState(SNSStepState state) {
        if (state != this.stepState) {
            this.stepState = state;
            setBoxBackgroundColor(this.editorBackgroundColor.getColorForState(SNSStepViewExtensionsKt.getSnsStepStateDrawable(this), getBoxBackgroundColor()));
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setStartIconDrawable(Drawable icon) {
        Integer a10;
        super.setStartIconDrawable(icon);
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
        com.sumsub.sns.internal.core.theme.d a11 = aVar.a();
        if (a11 == null || (a10 = aVar.a(a11, sNSColorElement, aVar.a(this))) == null) {
            return;
        }
        int intValue = a10.intValue();
        setStartIconTintList(null);
        setStartIconTintList(ColorStateList.valueOf(intValue));
    }

    public /* synthetic */ SNSTextInputLayout(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_TextInputLayoutStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSTextInputLayout : i9);
    }

    public SNSTextInputLayout(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i);
        ColorStateList valueOf;
        Float a10;
        Integer a11;
        Integer a12;
        Integer a13;
        this.stepState = SNSStepState.INIT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSTextInputLayout, i, i9);
        int i10 = R$styleable.SNSTextInputLayout_sns_editorBackgroundColor;
        if (obtainStyledAttributes.hasValue(i10)) {
            valueOf = i.a(obtainStyledAttributes, context, i10);
        } else {
            valueOf = ColorStateList.valueOf(getBoxBackgroundColor());
        }
        this.editorBackgroundColor = valueOf;
        obtainStyledAttributes.recycle();
        this.errorColor = ColorStateList.valueOf(i.a(context, R.attr.colorOnError));
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
        com.sumsub.sns.internal.core.theme.d a14 = aVar.a();
        if (a14 != null && (a13 = aVar.a(a14, sNSColorElement, aVar.a(this))) != null) {
            int intValue = a13.intValue();
            setEndIconTintList(ColorStateList.valueOf(intValue));
            setStartIconTintList(ColorStateList.valueOf(intValue));
        }
        SNSColorElement sNSColorElement2 = SNSColorElement.FIELD_BACKGROUND;
        com.sumsub.sns.internal.core.theme.d a15 = aVar.a();
        if (a15 != null && (a12 = aVar.a(a15, sNSColorElement2, aVar.a(this))) != null) {
            int intValue2 = a12.intValue();
            this.backgroundColorNormal = Integer.valueOf(intValue2);
            setBoxBackgroundColor(intValue2);
        }
        Integer a16 = aVar.a(this, SNSColorElement.FIELD_BACKGROUND_INVALID);
        a16 = a16 == null ? aVar.a(this, SNSColorElement.BACKGROUND_CRITICAL) : a16;
        if (a16 != null) {
            this.backgroundColorError = Integer.valueOf(a16.intValue());
        }
        Integer a17 = aVar.a(this, SNSColorElement.FIELD_BORDER);
        Float a18 = aVar.a(SNSMetricElement.FIELD_BORDER_WIDTH);
        int floatValue = a18 != null ? (int) a18.floatValue() : 0;
        if (a17 != null && floatValue > 0) {
            Integer a19 = aVar.a(this, SNSColorElement.FIELD_BORDER_FOCUSED);
            int intValue3 = a19 != null ? a19.intValue() : a17.intValue();
            Integer a20 = aVar.a(this, SNSColorElement.FIELD_BORDER_DISABLED);
            setBoxStrokeColorStateList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_focused}, new int[0]}, new int[]{a20 != null ? a20.intValue() : a17.intValue(), intValue3, a17.intValue()}));
            setBoxStrokeWidth(floatValue);
            setBoxStrokeWidthFocused(floatValue);
        }
        SNSColorElement sNSColorElement3 = SNSColorElement.FIELD_PLACEHOLDER;
        com.sumsub.sns.internal.core.theme.d a21 = aVar.a();
        if (a21 != null && (a11 = aVar.a(a21, sNSColorElement3, aVar.a(this))) != null) {
            this.hintColor = Integer.valueOf(a11.intValue());
        }
        SNSMetricElement sNSMetricElement = SNSMetricElement.FIELD_CORNER_RADIUS;
        com.sumsub.sns.internal.core.theme.d a22 = aVar.a();
        if (a22 == null || (a10 = aVar.a(a22, sNSMetricElement)) == null) {
            return;
        }
        float floatValue2 = a10.floatValue();
        setBoxCornerRadii(floatValue2, floatValue2, floatValue2, floatValue2);
    }
}
