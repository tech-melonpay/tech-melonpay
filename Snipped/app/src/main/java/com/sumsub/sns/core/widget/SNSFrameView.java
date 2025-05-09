package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSFrameView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "width", "color", "LO9/p;", "setStroke", "(II)V", "setFillColor", "(I)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class SNSFrameView extends FrameLayout {
    public SNSFrameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void setFillColor(int color) {
        Drawable foreground = getForeground();
        SNSFrameDrawable sNSFrameDrawable = foreground instanceof SNSFrameDrawable ? (SNSFrameDrawable) foreground : null;
        if (sNSFrameDrawable != null) {
            sNSFrameDrawable.setFillColor(color);
        }
    }

    public final void setStroke(int width, int color) {
        Drawable foreground = getForeground();
        SNSFrameDrawable sNSFrameDrawable = foreground instanceof SNSFrameDrawable ? (SNSFrameDrawable) foreground : null;
        if (sNSFrameDrawable != null) {
            sNSFrameDrawable.setStroke(width, color);
        }
    }

    public /* synthetic */ SNSFrameView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_FrameViewStyle : i, (i10 & 8) != 0 ? R$style.SNSFrameViewStyle : i9);
    }

    public SNSFrameView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSFrameView, i, i9);
        setForeground(new SNSFrameDrawable(U4.b.j(context, obtainStyledAttributes.getResourceId(R$styleable.SNSFrameView_sns_FrameDrawable, -1)), com.sumsub.sns.core.common.b.a(obtainStyledAttributes, R$styleable.SNSFrameView_sns_FrameFillColor, -16777216), obtainStyledAttributes.getDimension(R$styleable.SNSFrameView_sns_FramePaddingLeft, 0.0f), obtainStyledAttributes.getDimension(R$styleable.SNSFrameView_sns_FramePaddingTop, 0.0f), obtainStyledAttributes.getDimension(R$styleable.SNSFrameView_sns_FramePaddingRight, 0.0f), obtainStyledAttributes.getDimension(R$styleable.SNSFrameView_sns_FramePaddingBottom, 0.0f)));
        obtainStyledAttributes.recycle();
    }
}
