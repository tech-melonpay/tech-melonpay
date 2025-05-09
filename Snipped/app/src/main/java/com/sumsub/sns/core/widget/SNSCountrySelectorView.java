package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.theme.SNSMetricElement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSCountrySelectorView;", "Lcom/sumsub/sns/core/widget/SNSStepView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/content/res/ColorStateList;", "tintColor", "LO9/p;", "setIconTintColor", "(Landroid/content/res/ColorStateList;)V", "getIconTintColor", "()Landroid/content/res/ColorStateList;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSCountrySelectorView extends SNSStepView {
    public SNSCountrySelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // com.sumsub.sns.core.widget.SNSStepView
    public ColorStateList getIconTintColor() {
        ImageView iconEndView = getIconEndView();
        if (iconEndView != null) {
            return iconEndView.getImageTintList();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.widget.SNSStepView
    public void setIconTintColor(ColorStateList tintColor) {
        ImageView iconEndView = getIconEndView();
        if (iconEndView != null) {
            iconEndView.setImageTintList(tintColor);
        }
    }

    public /* synthetic */ SNSCountrySelectorView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_CountrySelectorViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSCountrySelectorView : i9);
    }

    public SNSCountrySelectorView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9, SNSMetricElement.SELECTED_COUNTRY_CARD_STYLE);
    }
}
