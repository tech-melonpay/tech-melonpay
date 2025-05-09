package m;

import B0.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.luminary.mobile.R;

/* compiled from: AppCompatButton.java */
/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1003e extends Button {
    private C1011m mAppCompatEmojiTextHelper;
    private final C1002d mBackgroundTintHelper;
    private final C1022y mTextHelper;

    public C1003e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private C1011m getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C1011m(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.a();
        }
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (e0.f23755c) {
            return super.getAutoSizeMaxTextSize();
        }
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            return Math.round(c1022y.i.f23600e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (e0.f23755c) {
            return super.getAutoSizeMinTextSize();
        }
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            return Math.round(c1022y.i.f23599d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (e0.f23755c) {
            return super.getAutoSizeStepGranularity();
        }
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            return Math.round(c1022y.i.f23598c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (e0.f23755c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1022y c1022y = this.mTextHelper;
        return c1022y != null ? c1022y.i.f23601f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (e0.f23755c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            return c1022y.i.f23596a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof d.c ? ((d.c) customSelectionActionModeCallback).f215a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            return c1002d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            return c1002d.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        super.onLayout(z10, i, i9, i10, i11);
        C1022y c1022y = this.mTextHelper;
        if (c1022y == null || e0.f23755c) {
            return;
        }
        c1022y.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        super.onTextChanged(charSequence, i, i9, i10);
        C1022y c1022y = this.mTextHelper;
        if (c1022y == null || e0.f23755c || !c1022y.i.f()) {
            return;
        }
        this.mTextHelper.i.a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i9, int i10, int i11) {
        if (e0.f23755c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i9, i10, i11);
            return;
        }
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.h(i, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (e0.f23755c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (e0.f23755c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(B0.d.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f23789b.f2228a.a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.f23813a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f10) {
        boolean z10 = e0.f23755c;
        if (z10) {
            super.setTextSize(i, f10);
            return;
        }
        C1022y c1022y = this.mTextHelper;
        if (c1022y == null || z10) {
            return;
        }
        C0991A c0991a = c1022y.i;
        if (c0991a.f()) {
            return;
        }
        c0991a.g(i, f10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1003e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        W.a(context);
        U.a(this, getContext());
        C1002d c1002d = new C1002d(this);
        this.mBackgroundTintHelper = c1002d;
        c1002d.d(attributeSet, i);
        C1022y c1022y = new C1022y(this);
        this.mTextHelper = c1022y;
        c1022y.f(attributeSet, i);
        c1022y.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }
}
