package m;

import A0.a;
import B0.d;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import m.C1021x;
import v0.c;

/* compiled from: AppCompatTextView.java */
/* renamed from: m.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1023z extends TextView {
    private final C1002d mBackgroundTintHelper;
    private C1011m mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<v0.c> mPrecomputedTextFuture;
    private a mSuperCaller;
    private final C1021x mTextClassifierHelper;
    private final C1022y mTextHelper;

    /* compiled from: AppCompatTextView.java */
    /* renamed from: m.z$a */
    public interface a {
        void a(int i);

        void b(int i);

        void c(int i, float f10);
    }

    /* compiled from: AppCompatTextView.java */
    /* renamed from: m.z$c */
    public class c extends b {
        public c() {
            super();
        }

        @Override // m.C1023z.b, m.C1023z.a
        public final void a(int i) {
            C1023z.super.setLastBaselineToBottomHeight(i);
        }

        @Override // m.C1023z.b, m.C1023z.a
        public final void b(int i) {
            C1023z.super.setFirstBaselineToTopHeight(i);
        }
    }

    /* compiled from: AppCompatTextView.java */
    /* renamed from: m.z$d */
    public class d extends c {
        public d() {
            super();
        }

        @Override // m.C1023z.b, m.C1023z.a
        public final void c(int i, float f10) {
            C1023z.super.setLineHeight(i, f10);
        }
    }

    public C1023z(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<v0.c> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                B0.d.e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private C1011m getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C1011m(this);
        }
        return this.mEmojiTextViewHelper;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.mSuperCaller = new d();
            } else if (i >= 28) {
                this.mSuperCaller = new c();
            } else {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1021x c1021x;
        if (Build.VERSION.SDK_INT >= 28 || (c1021x = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c1021x.f23812b;
        return textClassifier == null ? C1021x.a.a(c1021x.f23811a) : textClassifier;
    }

    public c.a getTextMetricsParamsCompat() {
        return B0.d.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i >= 30) {
                a.C0000a.a(editorInfo, text);
            } else {
                text.getClass();
                if (i >= 30) {
                    a.C0000a.a(editorInfo, text);
                } else {
                    int i9 = editorInfo.initialSelStart;
                    int i10 = editorInfo.initialSelEnd;
                    int i11 = i9 > i10 ? i10 : i9;
                    if (i9 <= i10) {
                        i9 = i10;
                    }
                    int length = text.length();
                    if (i11 < 0 || i9 > length) {
                        A0.a.a(editorInfo, null, 0, 0);
                    } else {
                        int i12 = editorInfo.inputType & 4095;
                        if (i12 == 129 || i12 == 225 || i12 == 18) {
                            A0.a.a(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            A0.a.a(editorInfo, text, i11, i9);
                        } else {
                            int i13 = i9 - i11;
                            int i14 = i13 > 1024 ? 0 : i13;
                            int i15 = 2048 - i14;
                            int min = Math.min(text.length() - i9, i15 - Math.min(i11, (int) (i15 * 0.8d)));
                            int min2 = Math.min(i11, i15 - min);
                            int i16 = i11 - min2;
                            if (Character.isLowSurrogate(text.charAt(i16))) {
                                i16++;
                                min2--;
                            }
                            if (Character.isHighSurrogate(text.charAt((i9 + min) - 1))) {
                                min--;
                            }
                            int i17 = min2 + i14;
                            A0.a.a(editorInfo, i14 != i13 ? TextUtils.concat(text.subSequence(i16, i16 + min2), text.subSequence(i9, min + i9)) : text.subSequence(i16, i17 + min + i16), min2, i17);
                        }
                    }
                }
            }
        }
        j3.e.x(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
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

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i9) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i9);
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i);
        } else {
            B0.d.b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            B0.d.c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        B0.d.d(this, i);
    }

    public void setPrecomputedText(v0.c cVar) {
        B0.d.e(this, cVar);
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
    public void setTextClassifier(TextClassifier textClassifier) {
        C1021x c1021x;
        if (Build.VERSION.SDK_INT >= 28 || (c1021x = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1021x.f23812b = textClassifier;
        }
    }

    public void setTextFuture(Future<v0.c> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f30523b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aVar.f30522a);
        setBreakStrategy(aVar.f30524c);
        setHyphenationFrequency(aVar.f30525d);
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

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            n0.j jVar = n0.e.f24073a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public C1023z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f10) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            getSuperCaller().c(i, f10);
        } else if (i9 >= 34) {
            d.b.a(this, i, f10);
        } else {
            B0.d.d(this, Math.round(TypedValue.applyDimension(i, f10, getResources().getDisplayMetrics())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1023z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        W.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        U.a(this, getContext());
        C1002d c1002d = new C1002d(this);
        this.mBackgroundTintHelper = c1002d;
        c1002d.d(attributeSet, i);
        C1022y c1022y = new C1022y(this);
        this.mTextHelper = c1022y;
        c1022y.f(attributeSet, i);
        c1022y.b();
        C1021x c1021x = new C1021x();
        c1021x.f23811a = this;
        this.mTextClassifierHelper = c1021x;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i9, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? U4.b.j(context, i) : null, i9 != 0 ? U4.b.j(context, i9) : null, i10 != 0 ? U4.b.j(context, i10) : null, i11 != 0 ? U4.b.j(context, i11) : null);
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i9, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? U4.b.j(context, i) : null, i9 != 0 ? U4.b.j(context, i9) : null, i10 != 0 ? U4.b.j(context, i10) : null, i11 != 0 ? U4.b.j(context, i11) : null);
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    /* compiled from: AppCompatTextView.java */
    /* renamed from: m.z$b */
    public class b implements a {
        public b() {
        }

        @Override // m.C1023z.a
        public void a(int i) {
        }

        @Override // m.C1023z.a
        public void b(int i) {
        }

        @Override // m.C1023z.a
        public void c(int i, float f10) {
        }
    }
}
