package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.theme.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSBottomSheetHandleView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "LO9/p;", "onMeasure", "(II)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSBottomSheetHandleView extends AppCompatImageView {
    public SNSBottomSheetHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a10 = aVar.a();
        b.e b9 = a10 != null ? aVar.b(a10, SNSMetricElement.BOTTOM_SHEET_HANDLE_SIZE) : null;
        Float d10 = b9 != null ? b9.d() : null;
        Float c2 = b9 != null ? b9.c() : null;
        if (d10 == null || c2 == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(View.resolveSizeAndState((int) d10.floatValue(), widthMeasureSpec, 0), View.resolveSizeAndState((int) c2.floatValue(), heightMeasureSpec, 0));
        }
    }

    public /* synthetic */ SNSBottomSheetHandleView(Context context, AttributeSet attributeSet, int i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R$attr.sns_BottomSheetHandleStyle : i);
    }

    public SNSBottomSheetHandleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Integer a10;
        Float c2;
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        b.e b9 = aVar.b(SNSMetricElement.BOTTOM_SHEET_HANDLE_SIZE);
        if (b9 != null && (c2 = b9.c()) != null) {
            float floatValue = c2.floatValue();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(floatValue / 2.0f);
            setImageDrawable(gradientDrawable);
        }
        SNSColorElement sNSColorElement = SNSColorElement.BOTTOM_SHEET_HANDLE;
        com.sumsub.sns.internal.core.theme.d a11 = aVar.a();
        if (a11 == null || (a10 = aVar.a(a11, sNSColorElement, aVar.a(this))) == null) {
            return;
        }
        setImageTintList(ColorStateList.valueOf(a10.intValue()));
    }
}
