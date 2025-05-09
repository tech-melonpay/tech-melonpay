package com.sumsub.sns.core.widget;

import O9.p;
import T2.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSBottomSheetView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "LT2/i;", "shapeAppearanceModel", "LT2/i;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class SNSBottomSheetView extends FrameLayout {
    private final i shapeAppearanceModel;

    public SNSBottomSheetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public /* synthetic */ SNSBottomSheetView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_BottomSheetViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSBottomSheetView : i9);
    }

    public SNSBottomSheetView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i);
        Integer a10;
        i a11 = i.b(context, attributeSet, i, i9).a();
        this.shapeAppearanceModel = a11;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSBottomSheetView, i, i9);
        int i10 = R$styleable.SNSBottomSheetView_android_background;
        if (obtainStyledAttributes.hasValue(i10)) {
            setBackground(obtainStyledAttributes.getDrawable(i10));
        }
        int i11 = R$styleable.SNSBottomSheetView_backgroundColor;
        if (obtainStyledAttributes.hasValue(i11)) {
            i.a e10 = a11.e();
            Ja.a e11 = Ja.a.e(0);
            e10.f3507d = e11;
            float b9 = i.a.b(e11);
            if (b9 != -1.0f) {
                e10.d(b9);
            }
            e10.d(0.0f);
            Ja.a e12 = Ja.a.e(0);
            e10.f3506c = e12;
            float b10 = i.a.b(e12);
            if (b10 != -1.0f) {
                e10.e(b10);
            }
            e10.e(0.0f);
            T2.f fVar = new T2.f(e10.a());
            fVar.o(obtainStyledAttributes.getColorStateList(i11));
            setBackground(fVar);
        }
        p pVar = p.f3034a;
        obtainStyledAttributes.recycle();
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        Float a12 = aVar.a(SNSMetricElement.BOTTOM_SHEET_CORNER_RADIUS);
        float floatValue = a12 != null ? a12.floatValue() : 0.0f;
        SNSColorElement sNSColorElement = SNSColorElement.BOTTOM_SHEET_BACKGROUND;
        com.sumsub.sns.internal.core.theme.d a13 = aVar.a();
        if (a13 == null || (a10 = aVar.a(a13, sNSColorElement, aVar.a(this))) == null) {
            return;
        }
        int intValue = a10.intValue();
        i.a e13 = a11.e();
        Ja.a e14 = Ja.a.e(0);
        e13.f3504a = e14;
        float b11 = i.a.b(e14);
        if (b11 != -1.0f) {
            e13.f(b11);
        }
        e13.f(floatValue);
        Ja.a e15 = Ja.a.e(0);
        e13.f3505b = e15;
        float b12 = i.a.b(e15);
        if (b12 != -1.0f) {
            e13.g(b12);
        }
        e13.g(floatValue);
        T2.f fVar2 = new T2.f(e13.a());
        fVar2.o(ColorStateList.valueOf(intValue));
        setBackground(fVar2);
    }
}
