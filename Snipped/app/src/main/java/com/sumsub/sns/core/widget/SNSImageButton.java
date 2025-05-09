package com.sumsub.sns.core.widget;

import O9.p;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.internal.core.common.i;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m.C1012n;
import y0.C1596C;
import y0.E;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSImageButton;", "Lm/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSImageButton extends C1012n {
    public SNSImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public /* synthetic */ SNSImageButton(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_ImageButtonStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSImageButton : i9);
    }

    public SNSImageButton(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSImageButton, i, i9);
        int i10 = R$styleable.SNSImageButton_android_tint;
        if (obtainStyledAttributes.hasValue(i10)) {
            setImageTintList(i.a(obtainStyledAttributes, context, i10));
        }
        int i11 = R$styleable.SNSImageButton_android_backgroundTint;
        if (obtainStyledAttributes.hasValue(i11)) {
            ColorStateList a10 = i.a(obtainStyledAttributes, context, i11);
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            C1596C.d.j(this, a10);
        }
        int i12 = R$styleable.SNSImageButton_android_background;
        if (obtainStyledAttributes.hasValue(i12)) {
            setBackground(obtainStyledAttributes.getDrawable(i12));
        }
        p pVar = p.f3034a;
        obtainStyledAttributes.recycle();
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        if (aVar.a() != null) {
            Integer a11 = aVar.a(this, SNSColorElement.SECONDARY_BUTTON_CONTENT);
            int intValue = a11 != null ? a11.intValue() : 0;
            Integer a12 = aVar.a(this, SNSColorElement.SECONDARY_BUTTON_CONTENT_DISABLED);
            int intValue2 = a12 != null ? a12.intValue() : 0;
            Integer a13 = aVar.a(this, SNSColorElement.SECONDARY_BUTTON_CONTENT_HIGHLIGHTED);
            setImageTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{R.attr.state_pressed}, new int[0]}, new int[]{intValue2, a13 != null ? a13.intValue() : 0, intValue}));
        }
    }
}
