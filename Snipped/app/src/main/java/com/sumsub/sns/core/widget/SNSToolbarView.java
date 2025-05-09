package com.sumsub.sns.core.widget;

import O9.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.theme.ImageElementName;
import com.sumsub.sns.internal.core.theme.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSToolbarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/content/res/ColorStateList;", "colorStateList", "LO9/p;", "setIconTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/drawable/Drawable;", "icon", "setCloseButtonDrawable", "(Landroid/graphics/drawable/Drawable;)V", "setOptionButtonDrawable", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCloseButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "setOnOptionButtonClickListener", "", "visible", "setOptionButtonVisible", "(Z)V", "Landroid/widget/ImageButton;", "getCloseButton", "()Landroid/widget/ImageButton;", "closeButton", "getOptionButton", "optionButton", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class SNSToolbarView extends ConstraintLayout {
    public SNSToolbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final ImageButton getCloseButton() {
        return (ImageButton) findViewById(R$id.sns_button_close);
    }

    private final ImageButton getOptionButton() {
        return (ImageButton) findViewById(R$id.sns_button_option);
    }

    public final void setCloseButtonDrawable(Drawable icon) {
        ImageButton closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setImageDrawable(icon);
        }
    }

    public final void setIconTintList(ColorStateList colorStateList) {
        ImageButton closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setImageTintList(colorStateList);
        }
        ImageButton optionButton = getOptionButton();
        if (optionButton != null) {
            optionButton.setImageTintList(colorStateList);
        }
    }

    public final void setOnCloseButtonClickListener(View.OnClickListener listener) {
        ImageButton closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setOnClickListener(listener);
        }
    }

    public final void setOnOptionButtonClickListener(View.OnClickListener listener) {
        ImageButton optionButton = getOptionButton();
        if (optionButton != null) {
            optionButton.setOnClickListener(listener);
        }
    }

    public final void setOptionButtonDrawable(Drawable icon) {
        ImageButton optionButton = getOptionButton();
        if (optionButton != null) {
            optionButton.setImageDrawable(icon);
        }
    }

    public final void setOptionButtonVisible(boolean visible) {
        ImageButton optionButton = getOptionButton();
        if (optionButton == null) {
            return;
        }
        optionButton.setVisibility(visible ? 0 : 8);
    }

    public /* synthetic */ SNSToolbarView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_ToolbarViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSToolbarView : i9);
    }

    public SNSToolbarView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i);
        Integer a10;
        Bitmap e10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSToolbarView, i, i9);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(R$styleable.SNSToolbarView_sns_toolbarViewLayout, 0), (ViewGroup) this, true);
        int i10 = R$styleable.SNSToolbarView_sns_toolbarIconTint;
        if (obtainStyledAttributes.hasValue(i10)) {
            setIconTintList(i.a(obtainStyledAttributes, context, i10));
        }
        int i11 = R$styleable.SNSToolbarView_sns_iconClose;
        if (obtainStyledAttributes.hasValue(i11)) {
            setCloseButtonDrawable(obtainStyledAttributes.getDrawable(i11));
        }
        p pVar = p.f3034a;
        obtainStyledAttributes.recycle();
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a11 = aVar.a();
        if (a11 != null) {
            Map<String, com.sumsub.sns.internal.core.theme.b> b9 = a11.b();
            Object obj = b9 != null ? (com.sumsub.sns.internal.core.theme.b) b9.get(ImageElementName.ICON_CLOSE.getValue()) : null;
            b.c cVar = obj instanceof b.c ? (b.c) obj : null;
            if (cVar != null && (e10 = cVar.e()) != null) {
                setCloseButtonDrawable(new BitmapDrawable(e10));
            }
            SNSColorElement sNSColorElement = SNSColorElement.NAVIGATION_BAR_ITEM;
            com.sumsub.sns.internal.core.theme.d a12 = aVar.a();
            if (a12 == null || (a10 = aVar.a(a12, sNSColorElement, aVar.a(this))) == null) {
                return;
            }
            setIconTintList(ColorStateList.valueOf(a10.intValue()));
        }
    }
}
