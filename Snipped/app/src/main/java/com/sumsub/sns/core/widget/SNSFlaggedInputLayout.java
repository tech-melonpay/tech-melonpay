package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", "Lcom/sumsub/sns/core/widget/SNSTextInputLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/widget/EditText;", "editText", "LO9/p;", "updateEditTextPadding", "(Landroid/widget/EditText;)V", "Landroid/view/View;", "child", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "Landroid/widget/FrameLayout;", "flagTouchInterceptor", "Landroid/widget/FrameLayout;", "getFlagTouchInterceptor", "()Landroid/widget/FrameLayout;", "Lcom/sumsub/sns/core/widget/SNSFlagView;", "flagView", "Lcom/sumsub/sns/core/widget/SNSFlagView;", "getFlagView", "()Lcom/sumsub/sns/core/widget/SNSFlagView;", "flagMarginStart", "I", "flagMarginEnd", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSFlaggedInputLayout extends SNSTextInputLayout {
    private final int flagMarginEnd;
    private final int flagMarginStart;
    private final FrameLayout flagTouchInterceptor;
    private final SNSFlagView flagView;

    public SNSFlaggedInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addView$lambda-2$lambda-1, reason: not valid java name */
    public static final void m52addView$lambda2$lambda1(SNSFlaggedInputLayout sNSFlaggedInputLayout, View view, int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        EditText editText = sNSFlaggedInputLayout.getEditText();
        if (editText != null) {
            sNSFlaggedInputLayout.updateEditTextPadding(editText);
        }
    }

    private final void updateEditTextPadding(EditText editText) {
        ViewGroup.LayoutParams layoutParams = this.flagView.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
        ViewGroup.LayoutParams layoutParams2 = this.flagView.getLayoutParams();
        int marginEnd = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0;
        int abs = Math.abs(this.flagView.getRight() - this.flagView.getLeft());
        editText.setPaddingRelative(this.flagView.getDrawable() != null ? marginStart + this.flagMarginEnd + abs : this.flagMarginStart, editText.getPaddingTop(), this.flagView.getDrawable() != null ? marginEnd + this.flagMarginStart + abs : editText.getPaddingEnd(), editText.getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        super.addView(child, params);
        if (child instanceof EditText) {
            EditText editText = getEditText();
            ViewParent parent = editText != null ? editText.getParent() : null;
            FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
            if (frameLayout != null) {
                this.flagTouchInterceptor.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                frameLayout.addView(this.flagTouchInterceptor);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 8388627;
                this.flagTouchInterceptor.addView(this.flagView, layoutParams);
                SNSFlagView sNSFlagView = this.flagView;
                sNSFlagView.setPadding(this.flagMarginStart, sNSFlagView.getPaddingTop(), sNSFlagView.getPaddingRight(), sNSFlagView.getPaddingBottom());
                this.flagView.addOnLayoutChangeListener(new B2.c(this, 2));
            }
        }
    }

    public final FrameLayout getFlagTouchInterceptor() {
        return this.flagTouchInterceptor;
    }

    public final SNSFlagView getFlagView() {
        return this.flagView;
    }

    public /* synthetic */ SNSFlaggedInputLayout(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_FlaggedInputLayoutStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSFlaggedInputLayout : i9);
    }

    public SNSFlaggedInputLayout(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        this.flagTouchInterceptor = new FrameLayout(context);
        this.flagView = new SNSFlagView(context, null, 0, 0, 14, null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSFlaggedInputLayout, i, i9);
        this.flagMarginStart = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSFlaggedInputLayout_sns_flagMarginStart, 0);
        this.flagMarginEnd = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSFlaggedInputLayout_sns_flagMarginEnd, 0);
        obtainStyledAttributes.recycle();
    }
}
