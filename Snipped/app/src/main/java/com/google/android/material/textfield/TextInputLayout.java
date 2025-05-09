package com.google.android.material.textfield;

import C.v;
import T2.f;
import T2.h;
import T2.i;
import X2.f;
import X2.j;
import X2.k;
import X2.l;
import X2.m;
import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k0.C0913a;
import k1.C0930k;
import k1.H;
import m.C0996F;
import m.C1008j;
import m.C1023z;
import u2.C1512a;
import v0.C1538a;
import y0.C1596C;
import y0.C1597a;
import y0.E;
import z0.C1638d;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final int DEF_STYLE_RES = 2132083641;
    private static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE = {new int[]{R.attr.state_pressed}, new int[0]};
    private ValueAnimator animator;
    private boolean areCornerRadiiRtl;
    private T2.f boxBackground;
    private boolean boxBackgroundApplied;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private T2.f boxUnderlineDefault;
    private T2.f boxUnderlineFocused;
    final com.google.android.material.internal.b collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private ColorStateList counterTextColor;
    private TextView counterView;
    private ColorStateList cursorColor;
    private ColorStateList cursorErrorColor;
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet<f> editTextAttachedListeners;
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    private final com.google.android.material.textfield.a endLayout;
    private boolean expandedHintEnabled;
    private StateListDrawable filledDropDownMenuBackground;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private boolean globalLayoutListenerAdded;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final k indicatorViewController;
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private e lengthCounter;
    private int maxEms;
    private int maxWidth;
    private int minEms;
    private int minWidth;
    private Drawable originalEditTextEndDrawable;
    int originalEditTextMinimumHeight;
    private CharSequence originalHint;
    private T2.f outlinedDropDownMenuBackground;
    private boolean placeholderEnabled;
    private C0930k placeholderFadeIn;
    private C0930k placeholderFadeOut;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private boolean restoringSavedState;
    private i shapeAppearanceModel;
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    private final com.google.android.material.textfield.b startLayout;
    private ColorStateList strokeErrorColor;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f9880c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9881d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9880c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f9881d = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f9880c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f9880c, parcel, i);
            parcel.writeInt(this.f9881d ? 1 : 0);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.endLayout.f9894g;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.collapsingTextHelper.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends C1597a {

        /* renamed from: d, reason: collision with root package name */
        public final TextInputLayout f9887d;

        public d(TextInputLayout textInputLayout) {
            this.f9887d = textInputLayout;
        }

        @Override // y0.C1597a
        public final void d(View view, C1638d c1638d) {
            View.AccessibilityDelegate accessibilityDelegate = this.f31046a;
            AccessibilityNodeInfo accessibilityNodeInfo = c1638d.f31219a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.f9887d;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean z10 = !isEmpty;
            boolean z11 = true;
            boolean z12 = !TextUtils.isEmpty(hint);
            boolean z13 = !textInputLayout.isHintExpanded();
            boolean z14 = !TextUtils.isEmpty(error);
            if (!z14 && TextUtils.isEmpty(counterOverflowDescription)) {
                z11 = false;
            }
            String charSequence = z12 ? hint.toString() : "";
            com.google.android.material.textfield.b bVar = textInputLayout.startLayout;
            C1023z c1023z = bVar.f9917b;
            if (c1023z.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(c1023z);
                accessibilityNodeInfo.setTraversalAfter(c1023z);
            } else {
                accessibilityNodeInfo.setTraversalAfter(bVar.f9919d);
            }
            if (z10) {
                c1638d.m(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                c1638d.m(charSequence);
                if (z13 && placeholderText != null) {
                    c1638d.m(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c1638d.m(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                accessibilityNodeInfo.setHintText(charSequence);
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z11) {
                if (!z14) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            C1023z c1023z2 = textInputLayout.indicatorViewController.f4008y;
            if (c1023z2 != null) {
                accessibilityNodeInfo.setLabelFor(c1023z2);
            }
            textInputLayout.endLayout.b().n(c1638d);
        }

        @Override // y0.C1597a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.f9887d.endLayout.b().o(accessibilityEvent);
        }
    }

    public interface e {
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.luminary.mobile.R.attr.textInputStyle);
    }

    private void addPlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView(textView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        if (this.editText == null || this.boxBackgroundMode != 1) {
            return;
        }
        if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText = this.editText;
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.luminary.mobile.R.dimen.material_filled_edittext_font_2_0_padding_top), this.editText.getPaddingEnd(), getResources().getDimensionPixelSize(com.luminary.mobile.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (P2.c.e(getContext())) {
            EditText editText2 = this.editText;
            WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.luminary.mobile.R.dimen.material_filled_edittext_font_1_3_padding_top), this.editText.getPaddingEnd(), getResources().getDimensionPixelSize(com.luminary.mobile.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private void applyBoxAttributes() {
        T2.f fVar = this.boxBackground;
        if (fVar == null) {
            return;
        }
        i iVar = fVar.f3448a.f3471a;
        i iVar2 = this.shapeAppearanceModel;
        if (iVar != iVar2) {
            fVar.setShapeAppearanceModel(iVar2);
        }
        if (canDrawOutlineStroke()) {
            T2.f fVar2 = this.boxBackground;
            float f10 = this.boxStrokeWidthPx;
            int i = this.boxStrokeColor;
            fVar2.s(f10);
            fVar2.r(ColorStateList.valueOf(i));
        }
        int calculateBoxBackgroundColor = calculateBoxBackgroundColor();
        this.boxBackgroundColor = calculateBoxBackgroundColor;
        this.boxBackground.o(ColorStateList.valueOf(calculateBoxBackgroundColor));
        applyBoxUnderlineAttributes();
        updateEditTextBoxBackgroundIfNeeded();
    }

    private void applyBoxUnderlineAttributes() {
        if (this.boxUnderlineDefault == null || this.boxUnderlineFocused == null) {
            return;
        }
        if (canDrawStroke()) {
            this.boxUnderlineDefault.o(this.editText.isFocused() ? ColorStateList.valueOf(this.defaultStrokeColor) : ColorStateList.valueOf(this.boxStrokeColor));
            this.boxUnderlineFocused.o(ColorStateList.valueOf(this.boxStrokeColor));
        }
        invalidate();
    }

    private void applyCutoutPadding(RectF rectF) {
        float f10 = rectF.left;
        int i = this.boxLabelCutoutPaddingPx;
        rectF.left = f10 - i;
        rectF.right += i;
    }

    private void assignBoxBackgroundByMode() {
        int i = this.boxBackgroundMode;
        if (i == 0) {
            this.boxBackground = null;
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
            return;
        }
        if (i == 1) {
            this.boxBackground = new T2.f(this.shapeAppearanceModel);
            this.boxUnderlineDefault = new T2.f();
            this.boxUnderlineFocused = new T2.f();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(s3.b.m(new StringBuilder(), this.boxBackgroundMode, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.hintEnabled || (this.boxBackground instanceof X2.f)) {
                this.boxBackground = new T2.f(this.shapeAppearanceModel);
            } else {
                i iVar = this.shapeAppearanceModel;
                int i9 = X2.f.f3962z;
                if (iVar == null) {
                    iVar = new i();
                }
                this.boxBackground = new f.b(new f.a(iVar, new RectF()));
            }
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
        }
    }

    private int calculateBoxBackgroundColor() {
        int i = this.boxBackgroundColor;
        if (this.boxBackgroundMode != 1) {
            return i;
        }
        return n0.a.f(this.boxBackgroundColor, D9.b.y(getContext(), com.luminary.mobile.R.attr.colorSurface, 0));
    }

    private Rect calculateCollapsedTextBounds(Rect rect) {
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        boolean c2 = J2.k.c(this);
        rect2.bottom = rect.bottom;
        int i = this.boxBackgroundMode;
        if (i == 1) {
            rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, c2);
            rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
            rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, c2);
            return rect2;
        }
        if (i != 2) {
            rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, c2);
            rect2.top = getPaddingTop();
            rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, c2);
            return rect2;
        }
        rect2.left = this.editText.getPaddingLeft() + rect.left;
        rect2.top = rect.top - calculateLabelMarginTop();
        rect2.right = rect.right - this.editText.getPaddingRight();
        return rect2;
    }

    private int calculateExpandedLabelBottom(Rect rect, Rect rect2, float f10) {
        return isSingleLineFilledTextField() ? (int) (rect2.top + f10) : rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private int calculateExpandedLabelTop(Rect rect, float f10) {
        if (isSingleLineFilledTextField()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return this.editText.getCompoundPaddingTop() + rect.top;
    }

    private Rect calculateExpandedTextBounds(Rect rect) {
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        com.google.android.material.internal.b bVar = this.collapsingTextHelper;
        TextPaint textPaint = bVar.U;
        textPaint.setTextSize(bVar.f9662l);
        textPaint.setTypeface(bVar.f9682z);
        textPaint.setLetterSpacing(bVar.f9654g0);
        float f10 = -textPaint.ascent();
        rect2.left = this.editText.getCompoundPaddingLeft() + rect.left;
        rect2.top = calculateExpandedLabelTop(rect, f10);
        rect2.right = rect.right - this.editText.getCompoundPaddingRight();
        rect2.bottom = calculateExpandedLabelBottom(rect, rect2, f10);
        return rect2;
    }

    private int calculateLabelMarginTop() {
        float e10;
        if (!this.hintEnabled) {
            return 0;
        }
        int i = this.boxBackgroundMode;
        if (i == 0) {
            e10 = this.collapsingTextHelper.e();
        } else {
            if (i != 2) {
                return 0;
            }
            e10 = this.collapsingTextHelper.e() / 2.0f;
        }
        return (int) e10;
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((X2.f) this.boxBackground).w(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void collapseHint(boolean z10) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z10 && this.hintAnimationEnabled) {
            animateToExpansionFraction(1.0f);
        } else {
            this.collapsingTextHelper.p(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        updatePlaceholderText();
        com.google.android.material.textfield.b bVar = this.startLayout;
        bVar.f9924j = false;
        bVar.e();
        com.google.android.material.textfield.a aVar = this.endLayout;
        aVar.f9904r = false;
        aVar.n();
    }

    private C0930k createPlaceholderFadeTransition() {
        C0930k c0930k = new C0930k();
        c0930k.f22695c = L2.k.c(getContext(), com.luminary.mobile.R.attr.motionDurationShort2, 87);
        c0930k.f22696d = L2.k.d(getContext(), com.luminary.mobile.R.attr.motionEasingLinearInterpolator, C1512a.f30141a);
        return c0930k;
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof X2.f);
    }

    private void dispatchOnEditTextAttached() {
        Iterator<f> it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        T2.f fVar;
        if (this.boxUnderlineFocused == null || (fVar = this.boxUnderlineDefault) == null) {
            return;
        }
        fVar.draw(canvas);
        if (this.editText.isFocused()) {
            Rect bounds = this.boxUnderlineFocused.getBounds();
            Rect bounds2 = this.boxUnderlineDefault.getBounds();
            float f10 = this.collapsingTextHelper.f9643b;
            int centerX = bounds2.centerX();
            bounds.left = C1512a.c(centerX, f10, bounds2.left);
            bounds.right = C1512a.c(centerX, f10, bounds2.right);
            this.boxUnderlineFocused.draw(canvas);
        }
    }

    private void drawHint(Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.d(canvas);
        }
    }

    private void expandHint(boolean z10) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z10 && this.hintAnimationEnabled) {
            animateToExpansionFraction(0.0f);
        } else {
            this.collapsingTextHelper.p(0.0f);
        }
        if (cutoutEnabled() && (!((X2.f) this.boxBackground).f3963y.f3964v.isEmpty())) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        com.google.android.material.textfield.b bVar = this.startLayout;
        bVar.f9924j = true;
        bVar.e();
        com.google.android.material.textfield.a aVar = this.endLayout;
        aVar.f9904r = true;
        aVar.n();
    }

    private T2.f getDropDownMaterialShapeDrawable(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.luminary.mobile.R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.editText;
        float popupElevation = editText instanceof m ? ((m) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.luminary.mobile.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.luminary.mobile.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        h hVar = new h();
        h hVar2 = new h();
        h hVar3 = new h();
        h hVar4 = new h();
        T2.e eVar = new T2.e();
        T2.e eVar2 = new T2.e();
        T2.e eVar3 = new T2.e();
        T2.e eVar4 = new T2.e();
        T2.a aVar = new T2.a(f10);
        T2.a aVar2 = new T2.a(f10);
        T2.a aVar3 = new T2.a(dimensionPixelOffset);
        T2.a aVar4 = new T2.a(dimensionPixelOffset);
        i iVar = new i();
        iVar.f3493a = hVar;
        iVar.f3494b = hVar2;
        iVar.f3495c = hVar3;
        iVar.f3496d = hVar4;
        iVar.f3497e = aVar;
        iVar.f3498f = aVar2;
        iVar.f3499g = aVar4;
        iVar.f3500h = aVar3;
        iVar.i = eVar;
        iVar.f3501j = eVar2;
        iVar.f3502k = eVar3;
        iVar.f3503l = eVar4;
        EditText editText2 = this.editText;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof m ? ((m) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = T2.f.f3447x;
            TypedValue c2 = P2.b.c(context, com.luminary.mobile.R.attr.colorSurface, T2.f.class.getSimpleName());
            int i = c2.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i != 0 ? C0913a.getColor(context, i) : c2.data);
        }
        T2.f fVar = new T2.f();
        fVar.k(context);
        fVar.o(dropDownBackgroundTintList);
        fVar.n(popupElevation);
        fVar.setShapeAppearanceModel(iVar);
        f.b bVar = fVar.f3448a;
        if (bVar.f3478h == null) {
            bVar.f3478h = new Rect();
        }
        fVar.f3448a.f3478h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        fVar.invalidateSelf();
        return fVar;
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.editText;
        if (!(editText instanceof AutoCompleteTextView) || U4.b.q(editText)) {
            return this.boxBackground;
        }
        int x9 = D9.b.x(com.luminary.mobile.R.attr.colorControlHighlight, this.editText);
        int i = this.boxBackgroundMode;
        if (i == 2) {
            return getOutlinedBoxBackgroundWithRipple(getContext(), this.boxBackground, x9, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        if (i == 1) {
            return getFilledBoxBackgroundWithRipple(this.boxBackground, this.boxBackgroundColor, x9, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        return null;
    }

    private static Drawable getFilledBoxBackgroundWithRipple(T2.f fVar, int i, int i9, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{D9.b.n0(i9, 0.1f, i), i}), fVar, fVar);
    }

    private int getLabelLeftBoundAlignedWithPrefixAndSuffix(int i, boolean z10) {
        return ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.editText.getCompoundPaddingLeft() : this.endLayout.c() : this.startLayout.a()) + i;
    }

    private int getLabelRightBoundAlignedWithPrefixAndSuffix(int i, boolean z10) {
        return i - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.editText.getCompoundPaddingRight() : this.startLayout.a() : this.endLayout.c());
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.filledDropDownMenuBackground == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.filledDropDownMenuBackground = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.filledDropDownMenuBackground.addState(new int[0], getDropDownMaterialShapeDrawable(false));
        }
        return this.filledDropDownMenuBackground;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.outlinedDropDownMenuBackground == null) {
            this.outlinedDropDownMenuBackground = getDropDownMaterialShapeDrawable(true);
        }
        return this.outlinedDropDownMenuBackground;
    }

    private static Drawable getOutlinedBoxBackgroundWithRipple(Context context, T2.f fVar, int i, int[][] iArr) {
        TypedValue c2 = P2.b.c(context, com.luminary.mobile.R.attr.colorSurface, "TextInputLayout");
        int i9 = c2.resourceId;
        int color = i9 != 0 ? C0913a.getColor(context, i9) : c2.data;
        T2.f fVar2 = new T2.f(fVar.f3448a.f3471a);
        int n02 = D9.b.n0(i, 0.1f, color);
        fVar2.o(new ColorStateList(iArr, new int[]{n02, 0}));
        fVar2.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{n02, color});
        T2.f fVar3 = new T2.f(fVar.f3448a.f3471a);
        fVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fVar2, fVar3), fVar});
    }

    private void hidePlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView == null || !this.placeholderEnabled) {
            return;
        }
        textView.setText((CharSequence) null);
        H.a(this.inputFrame, this.placeholderFadeOut);
        this.placeholderTextView.setVisibility(4);
    }

    private boolean isOnError() {
        return shouldShowError() || (this.counterView != null && this.counterOverflowed);
    }

    private boolean isSingleLineFilledTextField() {
        return this.boxBackgroundMode == 1 && this.editText.getMinLines() <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGlobalLayout$1() {
        this.editText.requestLayout();
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        updateEditTextBoxBackgroundIfNeeded();
        updateTextInputBoxState();
        updateBoxCollapsedPaddingTop();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
        setDropDownMenuBackgroundIfNeeded();
    }

    private void openCutout() {
        float f10;
        float f11;
        float f12;
        float f13;
        int i;
        int i9;
        if (cutoutEnabled()) {
            RectF rectF = this.tmpRectF;
            com.google.android.material.internal.b bVar = this.collapsingTextHelper;
            int width = this.editText.getWidth();
            int gravity = this.editText.getGravity();
            boolean b9 = bVar.b(bVar.f9629G);
            bVar.f9631I = b9;
            Rect rect = bVar.f9655h;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b9) {
                        i9 = rect.left;
                        f12 = i9;
                    } else {
                        f10 = rect.right;
                        f11 = bVar.f9659j0;
                    }
                } else if (b9) {
                    f10 = rect.right;
                    f11 = bVar.f9659j0;
                } else {
                    i9 = rect.left;
                    f12 = i9;
                }
                float max = Math.max(f12, rect.left);
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f13 = (width / 2.0f) + (bVar.f9659j0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.f9631I) {
                        f13 = max + bVar.f9659j0;
                    } else {
                        i = rect.right;
                        f13 = i;
                    }
                } else if (bVar.f9631I) {
                    i = rect.right;
                    f13 = i;
                } else {
                    f13 = bVar.f9659j0 + max;
                }
                rectF.right = Math.min(f13, rect.right);
                rectF.bottom = bVar.e() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                applyCutoutPadding(rectF);
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.boxStrokeWidthPx);
                X2.f fVar = (X2.f) this.boxBackground;
                fVar.getClass();
                fVar.w(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f10 = width / 2.0f;
            f11 = bVar.f9659j0 / 2.0f;
            f12 = f10 - f11;
            float max2 = Math.max(f12, rect.left);
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f13 = (width / 2.0f) + (bVar.f9659j0 / 2.0f);
            rectF.right = Math.min(f13, rect.right);
            rectF.bottom = bVar.e() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    private void recalculateCutout() {
        if (!cutoutEnabled() || this.hintExpanded) {
            return;
        }
        closeCutout();
        openCutout();
    }

    private static void recursiveSetEnabled(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z10);
            }
        }
    }

    private void removePlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void setDropDownMenuBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i = this.boxBackgroundMode;
                if (i == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.editText != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.editText = editText;
        int i = this.minEms;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.minWidth);
        }
        int i9 = this.maxEms;
        if (i9 != -1) {
            setMaxEms(i9);
        } else {
            setMaxWidth(this.maxWidth);
        }
        this.boxBackgroundApplied = false;
        onApplyBoxBackgroundMode();
        setTextInputAccessibilityDelegate(new d(this));
        com.google.android.material.internal.b bVar = this.collapsingTextHelper;
        Typeface typeface = this.editText.getTypeface();
        boolean m2 = bVar.m(typeface);
        boolean o10 = bVar.o(typeface);
        if (m2 || o10) {
            bVar.i(false);
        }
        com.google.android.material.internal.b bVar2 = this.collapsingTextHelper;
        float textSize = this.editText.getTextSize();
        if (bVar2.f9662l != textSize) {
            bVar2.f9662l = textSize;
            bVar2.i(false);
        }
        int i10 = Build.VERSION.SDK_INT;
        com.google.android.material.internal.b bVar3 = this.collapsingTextHelper;
        float letterSpacing = this.editText.getLetterSpacing();
        if (bVar3.f9654g0 != letterSpacing) {
            bVar3.f9654g0 = letterSpacing;
            bVar3.i(false);
        }
        int gravity = this.editText.getGravity();
        this.collapsingTextHelper.l((gravity & (-113)) | 48);
        com.google.android.material.internal.b bVar4 = this.collapsingTextHelper;
        if (bVar4.f9658j != gravity) {
            bVar4.f9658j = gravity;
            bVar4.i(false);
        }
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        this.originalEditTextMinimumHeight = editText.getMinimumHeight();
        this.editText.addTextChangedListener(new a(editText));
        if (this.defaultHintTextColor == null) {
            this.defaultHintTextColor = this.editText.getHintTextColors();
        }
        if (this.hintEnabled) {
            if (TextUtils.isEmpty(this.hint)) {
                CharSequence hint = this.editText.getHint();
                this.originalHint = hint;
                setHint(hint);
                this.editText.setHint((CharSequence) null);
            }
            this.isProvidingHint = true;
        }
        if (i10 >= 29) {
            updateCursorColor();
        }
        if (this.counterView != null) {
            updateCounter(this.editText.getText());
        }
        updateEditTextBackground();
        this.indicatorViewController.b();
        this.startLayout.bringToFront();
        this.endLayout.bringToFront();
        dispatchOnEditTextAttached();
        this.endLayout.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        updateLabelState(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.hint)) {
            return;
        }
        this.hint = charSequence;
        com.google.android.material.internal.b bVar = this.collapsingTextHelper;
        if (charSequence == null || !TextUtils.equals(bVar.f9629G, charSequence)) {
            bVar.f9629G = charSequence;
            bVar.f9630H = null;
            Bitmap bitmap = bVar.f9633K;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f9633K = null;
            }
            bVar.i(false);
        }
        if (this.hintExpanded) {
            return;
        }
        openCutout();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.placeholderEnabled == z10) {
            return;
        }
        if (z10) {
            addPlaceholderTextView();
        } else {
            removePlaceholderTextView();
            this.placeholderTextView = null;
        }
        this.placeholderEnabled = z10;
    }

    private boolean shouldUpdateEndDummyDrawable() {
        return (this.endLayout.e() || ((this.endLayout.i != 0 && isEndIconVisible()) || this.endLayout.f9902p != null)) && this.endLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.startLayout.getMeasuredWidth() > 0;
    }

    private void showPlaceholderText() {
        if (this.placeholderTextView == null || !this.placeholderEnabled || TextUtils.isEmpty(this.placeholderText)) {
            return;
        }
        this.placeholderTextView.setText(this.placeholderText);
        H.a(this.inputFrame, this.placeholderFadeIn);
        this.placeholderTextView.setVisibility(0);
        this.placeholderTextView.bringToFront();
        announceForAccessibility(this.placeholderText);
    }

    private void updateBoxCollapsedPaddingTop() {
        if (this.boxBackgroundMode == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(com.luminary.mobile.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (P2.c.e(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(com.luminary.mobile.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void updateBoxUnderlineBounds(Rect rect) {
        T2.f fVar = this.boxUnderlineDefault;
        if (fVar != null) {
            int i = rect.bottom;
            fVar.setBounds(rect.left, i - this.boxStrokeWidthDefaultPx, rect.right, i);
        }
        T2.f fVar2 = this.boxUnderlineFocused;
        if (fVar2 != null) {
            int i9 = rect.bottom;
            fVar2.setBounds(rect.left, i9 - this.boxStrokeWidthFocusedPx, rect.right, i9);
        }
    }

    private void updateCounter() {
        if (this.counterView != null) {
            EditText editText = this.editText;
            updateCounter(editText == null ? null : editText.getText());
        }
    }

    private static void updateCounterContentDescription(Context context, TextView textView, int i, int i9, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? com.luminary.mobile.R.string.character_counter_overflowed_content_description : com.luminary.mobile.R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i9)));
    }

    private void updateCounterTextAppearanceAndColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.counterView;
        if (textView != null) {
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (!this.counterOverflowed || (colorStateList = this.counterOverflowTextColor) == null) {
                return;
            }
            this.counterView.setTextColor(colorStateList);
        }
    }

    private void updateCursorColor() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.cursorColor;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue a10 = P2.b.a(context, com.luminary.mobile.R.attr.colorControlActivated);
            if (a10 != null) {
                int i = a10.resourceId;
                if (i != 0) {
                    colorStateList2 = C0913a.getColorStateList(context, i);
                } else {
                    int i9 = a10.data;
                    if (i9 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i9);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.editText;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.editText.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if (isOnError() && (colorStateList = this.cursorErrorColor) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    private void updateEditTextBoxBackground() {
        Drawable editTextBoxBackground = getEditTextBoxBackground();
        EditText editText = this.editText;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        editText.setBackground(editTextBoxBackground);
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int max;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (max = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(max);
        return true;
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int calculateLabelMarginTop = calculateLabelMarginTop();
            if (calculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = calculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        EditText editText;
        if (this.placeholderTextView == null || (editText = this.editText) == null) {
            return;
        }
        this.placeholderTextView.setGravity(editText.getGravity());
        this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
    }

    private void updatePlaceholderText() {
        EditText editText = this.editText;
        updatePlaceholderText(editText == null ? null : editText.getText());
    }

    private void updateStrokeErrorColor(boolean z10, boolean z11) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.boxStrokeColor = colorForState2;
        } else if (z11) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    public void addOnEditTextAttachedListener(f fVar) {
        this.editTextAttachedListeners.add(fVar);
        if (this.editText != null) {
            fVar.a(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.inputFrame.addView(view, layoutParams2);
        this.inputFrame.setLayoutParams(layoutParams);
        updateInputLayoutMargins();
        setEditText((EditText) view);
    }

    public void animateToExpansionFraction(float f10) {
        if (this.collapsingTextHelper.f9643b == f10) {
            return;
        }
        if (this.animator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(L2.k.d(getContext(), com.luminary.mobile.R.attr.motionEasingEmphasizedInterpolator, C1512a.f30142b));
            this.animator.setDuration(L2.k.c(getContext(), com.luminary.mobile.R.attr.motionDurationMedium4, 167));
            this.animator.addUpdateListener(new c());
        }
        this.animator.setFloatValues(this.collapsingTextHelper.f9643b, f10);
        this.animator.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.editText;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.originalHint != null) {
            boolean z10 = this.isProvidingHint;
            this.isProvidingHint = false;
            CharSequence hint = editText.getHint();
            this.editText.setHint(this.originalHint);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.editText.setHint(hint);
                this.isProvidingHint = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.inputFrame.getChildCount());
        for (int i9 = 0; i9 < this.inputFrame.getChildCount(); i9++) {
            View childAt = this.inputFrame.getChildAt(i9);
            ViewStructure newChild = viewStructure.newChild(i9);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.editText) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.inDrawableStateChanged
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.inDrawableStateChanged = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            com.google.android.material.internal.b r2 = r4.collapsingTextHelper
            r3 = 0
            if (r2 == 0) goto L2f
            r2.R = r1
            android.content.res.ColorStateList r1 = r2.f9668o
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r2.f9666n
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r2.i(r3)
            r1 = r0
            goto L30
        L2f:
            r1 = r3
        L30:
            android.widget.EditText r2 = r4.editText
            if (r2 == 0) goto L47
            java.util.WeakHashMap<android.view.View, y0.E> r2 = y0.C1596C.f30963a
            boolean r2 = r4.isLaidOut()
            if (r2 == 0) goto L43
            boolean r2 = r4.isEnabled()
            if (r2 == 0) goto L43
            goto L44
        L43:
            r0 = r3
        L44:
            r4.updateLabelState(r0)
        L47:
            r4.updateEditTextBackground()
            r4.updateTextInputBoxState()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.inDrawableStateChanged = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.editText;
        if (editText == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + editText.getBaseline() + calculateLabelMarginTop();
    }

    public T2.f getBoxBackground() {
        int i = this.boxBackgroundMode;
        if (i == 1 || i == 2) {
            return this.boxBackground;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.boxCollapsedPaddingTopPx;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return J2.k.c(this) ? this.shapeAppearanceModel.f3500h.a(this.tmpRectF) : this.shapeAppearanceModel.f3499g.a(this.tmpRectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        return J2.k.c(this) ? this.shapeAppearanceModel.f3499g.a(this.tmpRectF) : this.shapeAppearanceModel.f3500h.a(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        return J2.k.c(this) ? this.shapeAppearanceModel.f3497e.a(this.tmpRectF) : this.shapeAppearanceModel.f3498f.a(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopStart() {
        return J2.k.c(this) ? this.shapeAppearanceModel.f3498f.a(this.tmpRectF) : this.shapeAppearanceModel.f3497e.a(this.tmpRectF);
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.counterEnabled && this.counterOverflowed && (textView = this.counterView) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.counterOverflowTextColor;
    }

    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getCursorColor() {
        return this.cursorColor;
    }

    public ColorStateList getCursorErrorColor() {
        return this.cursorErrorColor;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public CharSequence getEndIconContentDescription() {
        return this.endLayout.f9894g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.endLayout.f9894g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.endLayout.f9899m;
    }

    public int getEndIconMode() {
        return this.endLayout.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.endLayout.f9900n;
    }

    public CheckableImageButton getEndIconView() {
        return this.endLayout.f9894g;
    }

    public CharSequence getError() {
        k kVar = this.indicatorViewController;
        if (kVar.f4000q) {
            return kVar.f3999p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.indicatorViewController.f4003t;
    }

    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.f4002s;
    }

    public int getErrorCurrentTextColors() {
        C1023z c1023z = this.indicatorViewController.f4001r;
        if (c1023z != null) {
            return c1023z.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.endLayout.f9890c.getDrawable();
    }

    public CharSequence getHelperText() {
        k kVar = this.indicatorViewController;
        if (kVar.f4007x) {
            return kVar.f4006w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C1023z c1023z = this.indicatorViewController.f4008y;
        if (c1023z != null) {
            return c1023z.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        com.google.android.material.internal.b bVar = this.collapsingTextHelper;
        return bVar.f(bVar.f9668o);
    }

    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    public e getLengthCounter() {
        return this.lengthCounter;
    }

    public int getMaxEms() {
        return this.maxEms;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getMinEms() {
        return this.minEms;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endLayout.f9894g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endLayout.f9894g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    public CharSequence getPrefixText() {
        return this.startLayout.f9918c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.startLayout.f9917b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.startLayout.f9917b;
    }

    public i getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public CharSequence getStartIconContentDescription() {
        return this.startLayout.f9919d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.startLayout.f9919d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.startLayout.f9922g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.startLayout.f9923h;
    }

    public CharSequence getSuffixText() {
        return this.endLayout.f9902p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.endLayout.f9903q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.endLayout.f9903q;
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isEndIconVisible() {
        return this.endLayout.d();
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.f4000q;
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.f4007x;
    }

    public final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.h(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.endLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.globalLayoutListenerAdded = false;
        boolean updateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean updateDummyDrawables = updateDummyDrawables();
        if (updateEditTextHeightBasedOnIcon || updateDummyDrawables) {
            this.editText.post(new B2.d(this, 16));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        super.onLayout(z10, i, i9, i10, i11);
        EditText editText = this.editText;
        if (editText != null) {
            Rect rect = this.tmpRect;
            J2.a.a(this, editText, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                com.google.android.material.internal.b bVar = this.collapsingTextHelper;
                float textSize = this.editText.getTextSize();
                if (bVar.f9662l != textSize) {
                    bVar.f9662l = textSize;
                    bVar.i(false);
                }
                int gravity = this.editText.getGravity();
                this.collapsingTextHelper.l((gravity & (-113)) | 48);
                com.google.android.material.internal.b bVar2 = this.collapsingTextHelper;
                if (bVar2.f9658j != gravity) {
                    bVar2.f9658j = gravity;
                    bVar2.i(false);
                }
                com.google.android.material.internal.b bVar3 = this.collapsingTextHelper;
                Rect calculateCollapsedTextBounds = calculateCollapsedTextBounds(rect);
                bVar3.getClass();
                int i12 = calculateCollapsedTextBounds.left;
                int i13 = calculateCollapsedTextBounds.top;
                int i14 = calculateCollapsedTextBounds.right;
                int i15 = calculateCollapsedTextBounds.bottom;
                Rect rect2 = bVar3.f9655h;
                if (rect2.left != i12 || rect2.top != i13 || rect2.right != i14 || rect2.bottom != i15) {
                    rect2.set(i12, i13, i14, i15);
                    bVar3.S = true;
                }
                com.google.android.material.internal.b bVar4 = this.collapsingTextHelper;
                Rect calculateExpandedTextBounds = calculateExpandedTextBounds(rect);
                bVar4.getClass();
                int i16 = calculateExpandedTextBounds.left;
                int i17 = calculateExpandedTextBounds.top;
                int i18 = calculateExpandedTextBounds.right;
                int i19 = calculateExpandedTextBounds.bottom;
                Rect rect3 = bVar4.f9653g;
                if (rect3.left != i16 || rect3.top != i17 || rect3.right != i18 || rect3.bottom != i19) {
                    rect3.set(i16, i17, i18, i19);
                    bVar4.S = true;
                }
                this.collapsingTextHelper.i(false);
                if (!cutoutEnabled() || this.hintExpanded) {
                    return;
                }
                openCutout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        if (!this.globalLayoutListenerAdded) {
            this.endLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.globalLayoutListenerAdded = true;
        }
        updatePlaceholderMeasurementsBasedOnEditText();
        this.endLayout.m();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6536a);
        setError(savedState.f9880c);
        if (savedState.f9881d) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z10 = i == 1;
        if (z10 != this.areCornerRadiiRtl) {
            float a10 = this.shapeAppearanceModel.f3497e.a(this.tmpRectF);
            float a11 = this.shapeAppearanceModel.f3498f.a(this.tmpRectF);
            float a12 = this.shapeAppearanceModel.f3500h.a(this.tmpRectF);
            float a13 = this.shapeAppearanceModel.f3499g.a(this.tmpRectF);
            i iVar = this.shapeAppearanceModel;
            Ja.a aVar = iVar.f3493a;
            Ja.a aVar2 = iVar.f3494b;
            Ja.a aVar3 = iVar.f3496d;
            Ja.a aVar4 = iVar.f3495c;
            i.a aVar5 = new i.a();
            aVar5.f3504a = aVar2;
            float b9 = i.a.b(aVar2);
            if (b9 != -1.0f) {
                aVar5.f(b9);
            }
            aVar5.f3505b = aVar;
            float b10 = i.a.b(aVar);
            if (b10 != -1.0f) {
                aVar5.g(b10);
            }
            aVar5.f3507d = aVar4;
            float b11 = i.a.b(aVar4);
            if (b11 != -1.0f) {
                aVar5.d(b11);
            }
            aVar5.f3506c = aVar3;
            float b12 = i.a.b(aVar3);
            if (b12 != -1.0f) {
                aVar5.e(b12);
            }
            aVar5.f(a11);
            aVar5.g(a10);
            aVar5.d(a13);
            aVar5.e(a12);
            i a14 = aVar5.a();
            this.areCornerRadiiRtl = z10;
            setShapeAppearanceModel(a14);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (shouldShowError()) {
            savedState.f9880c = getError();
        }
        com.google.android.material.textfield.a aVar = this.endLayout;
        savedState.f9881d = aVar.i != 0 && aVar.f9894g.f9593a;
        return savedState;
    }

    public void refreshStartIconDrawableState() {
        com.google.android.material.textfield.b bVar = this.startLayout;
        j.c(bVar.f9916a, bVar.f9919d, bVar.f9920e);
    }

    public void setBoxBackgroundColor(int i) {
        if (this.boxBackgroundColor != i) {
            this.boxBackgroundColor = i;
            this.defaultFilledBackgroundColor = i;
            this.focusedFilledBackgroundColor = i;
            this.hoveredFilledBackgroundColor = i;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0913a.getColor(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        applyBoxAttributes();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.boxBackgroundMode) {
            return;
        }
        this.boxBackgroundMode = i;
        if (this.editText != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.boxCollapsedPaddingTopPx = i;
    }

    public void setBoxCornerFamily(int i) {
        i.a e10 = this.shapeAppearanceModel.e();
        T2.c cVar = this.shapeAppearanceModel.f3497e;
        Ja.a e11 = Ja.a.e(i);
        e10.f3504a = e11;
        float b9 = i.a.b(e11);
        if (b9 != -1.0f) {
            e10.f(b9);
        }
        e10.f3508e = cVar;
        T2.c cVar2 = this.shapeAppearanceModel.f3498f;
        Ja.a e12 = Ja.a.e(i);
        e10.f3505b = e12;
        float b10 = i.a.b(e12);
        if (b10 != -1.0f) {
            e10.g(b10);
        }
        e10.f3509f = cVar2;
        T2.c cVar3 = this.shapeAppearanceModel.f3500h;
        Ja.a e13 = Ja.a.e(i);
        e10.f3507d = e13;
        float b11 = i.a.b(e13);
        if (b11 != -1.0f) {
            e10.d(b11);
        }
        e10.f3511h = cVar3;
        T2.c cVar4 = this.shapeAppearanceModel.f3499g;
        Ja.a e14 = Ja.a.e(i);
        e10.f3506c = e14;
        float b12 = i.a.b(e14);
        if (b12 != -1.0f) {
            e10.e(b12);
        }
        e10.f3510g = cVar4;
        this.shapeAppearanceModel = e10.a();
        applyBoxAttributes();
    }

    public void setBoxCornerRadii(float f10, float f11, float f12, float f13) {
        boolean c2 = J2.k.c(this);
        this.areCornerRadiiRtl = c2;
        float f14 = c2 ? f11 : f10;
        if (!c2) {
            f10 = f11;
        }
        float f15 = c2 ? f13 : f12;
        if (!c2) {
            f12 = f13;
        }
        T2.f fVar = this.boxBackground;
        if (fVar != null && fVar.i() == f14) {
            T2.f fVar2 = this.boxBackground;
            if (fVar2.f3448a.f3471a.f3498f.a(fVar2.h()) == f10) {
                T2.f fVar3 = this.boxBackground;
                if (fVar3.f3448a.f3471a.f3500h.a(fVar3.h()) == f15) {
                    T2.f fVar4 = this.boxBackground;
                    if (fVar4.f3448a.f3471a.f3499g.a(fVar4.h()) == f12) {
                        return;
                    }
                }
            }
        }
        i.a e10 = this.shapeAppearanceModel.e();
        e10.f(f14);
        e10.g(f10);
        e10.d(f15);
        e10.e(f12);
        this.shapeAppearanceModel = e10.a();
        applyBoxAttributes();
    }

    public void setBoxStrokeColor(int i) {
        if (this.focusedStrokeColor != i) {
            this.focusedStrokeColor = i;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.focusedStrokeColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
            this.focusedStrokeColor = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.boxStrokeWidthDefaultPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.boxStrokeWidthFocusedPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.counterEnabled != z10) {
            if (z10) {
                C1023z c1023z = new C1023z(getContext());
                this.counterView = c1023z;
                c1023z.setId(com.luminary.mobile.R.id.textinput_counter);
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.a(this.counterView, 2);
                ((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.luminary.mobile.R.dimen.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.g(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z10;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.counterMaxLength != i) {
            if (i > 0) {
                this.counterMaxLength = i;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.counterOverflowTextAppearance != i) {
            this.counterOverflowTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.counterTextAppearance != i) {
            this.counterTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.cursorColor != colorStateList) {
            this.cursorColor = colorStateList;
            updateCursorColor();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.cursorErrorColor != colorStateList) {
            this.cursorErrorColor = colorStateList;
            if (isOnError()) {
                updateCursorColor();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        recursiveSetEnabled(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.endLayout.f9894g.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.endLayout.f9894g.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        CharSequence text = i != 0 ? aVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = aVar.f9894g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        Drawable j10 = i != 0 ? U4.b.j(aVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = aVar.f9894g;
        checkableImageButton.setImageDrawable(j10);
        if (j10 != null) {
            ColorStateList colorStateList = aVar.f9897k;
            PorterDuff.Mode mode = aVar.f9898l;
            TextInputLayout textInputLayout = aVar.f9888a;
            j.a(textInputLayout, checkableImageButton, colorStateList, mode);
            j.c(textInputLayout, checkableImageButton, aVar.f9897k);
        }
    }

    public void setEndIconMinSize(int i) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        if (i < 0) {
            aVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != aVar.f9899m) {
            aVar.f9899m = i;
            CheckableImageButton checkableImageButton = aVar.f9894g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = aVar.f9890c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.endLayout.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        View.OnLongClickListener onLongClickListener = aVar.f9901o;
        CheckableImageButton checkableImageButton = aVar.f9894g;
        checkableImageButton.setOnClickListener(onClickListener);
        j.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        aVar.f9901o = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f9894g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        j.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        aVar.f9900n = scaleType;
        aVar.f9894g.setScaleType(scaleType);
        aVar.f9890c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        if (aVar.f9897k != colorStateList) {
            aVar.f9897k = colorStateList;
            j.a(aVar.f9888a, aVar.f9894g, colorStateList, aVar.f9898l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        if (aVar.f9898l != mode) {
            aVar.f9898l = mode;
            j.a(aVar.f9888a, aVar.f9894g, aVar.f9897k, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.endLayout.h(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.indicatorViewController.f4000q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.indicatorViewController.f();
            return;
        }
        k kVar = this.indicatorViewController;
        kVar.c();
        kVar.f3999p = charSequence;
        kVar.f4001r.setText(charSequence);
        int i = kVar.f3997n;
        if (i != 1) {
            kVar.f3998o = 1;
        }
        kVar.i(i, kVar.f3998o, kVar.h(kVar.f4001r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        k kVar = this.indicatorViewController;
        kVar.f4003t = i;
        C1023z c1023z = kVar.f4001r;
        if (c1023z != null) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            c1023z.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        k kVar = this.indicatorViewController;
        kVar.f4002s = charSequence;
        C1023z c1023z = kVar.f4001r;
        if (c1023z != null) {
            c1023z.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        k kVar = this.indicatorViewController;
        if (kVar.f4000q == z10) {
            return;
        }
        kVar.c();
        TextInputLayout textInputLayout = kVar.f3992h;
        if (z10) {
            C1023z c1023z = new C1023z(kVar.f3991g);
            kVar.f4001r = c1023z;
            c1023z.setId(com.luminary.mobile.R.id.textinput_error);
            kVar.f4001r.setTextAlignment(5);
            Typeface typeface = kVar.f3984B;
            if (typeface != null) {
                kVar.f4001r.setTypeface(typeface);
            }
            int i = kVar.f4004u;
            kVar.f4004u = i;
            C1023z c1023z2 = kVar.f4001r;
            if (c1023z2 != null) {
                textInputLayout.setTextAppearanceCompatWithErrorFallback(c1023z2, i);
            }
            ColorStateList colorStateList = kVar.f4005v;
            kVar.f4005v = colorStateList;
            C1023z c1023z3 = kVar.f4001r;
            if (c1023z3 != null && colorStateList != null) {
                c1023z3.setTextColor(colorStateList);
            }
            CharSequence charSequence = kVar.f4002s;
            kVar.f4002s = charSequence;
            C1023z c1023z4 = kVar.f4001r;
            if (c1023z4 != null) {
                c1023z4.setContentDescription(charSequence);
            }
            int i9 = kVar.f4003t;
            kVar.f4003t = i9;
            C1023z c1023z5 = kVar.f4001r;
            if (c1023z5 != null) {
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                c1023z5.setAccessibilityLiveRegion(i9);
            }
            kVar.f4001r.setVisibility(4);
            kVar.a(kVar.f4001r, 0);
        } else {
            kVar.f();
            kVar.g(kVar.f4001r, 0);
            kVar.f4001r = null;
            textInputLayout.updateEditTextBackground();
            textInputLayout.updateTextInputBoxState();
        }
        kVar.f4000q = z10;
    }

    public void setErrorIconDrawable(int i) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        aVar.i(i != 0 ? U4.b.j(aVar.getContext(), i) : null);
        j.c(aVar.f9888a, aVar.f9890c, aVar.f9891d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        CheckableImageButton checkableImageButton = aVar.f9890c;
        View.OnLongClickListener onLongClickListener = aVar.f9893f;
        checkableImageButton.setOnClickListener(onClickListener);
        j.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        aVar.f9893f = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f9890c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        j.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        if (aVar.f9891d != colorStateList) {
            aVar.f9891d = colorStateList;
            j.a(aVar.f9888a, aVar.f9890c, colorStateList, aVar.f9892e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        if (aVar.f9892e != mode) {
            aVar.f9892e = mode;
            j.a(aVar.f9888a, aVar.f9890c, aVar.f9891d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        k kVar = this.indicatorViewController;
        kVar.f4004u = i;
        C1023z c1023z = kVar.f4001r;
        if (c1023z != null) {
            kVar.f3992h.setTextAppearanceCompatWithErrorFallback(c1023z, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        k kVar = this.indicatorViewController;
        kVar.f4005v = colorStateList;
        C1023z c1023z = kVar.f4001r;
        if (c1023z == null || colorStateList == null) {
            return;
        }
        c1023z.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.expandedHintEnabled != z10) {
            this.expandedHintEnabled = z10;
            updateLabelState(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!isHelperTextEnabled()) {
            setHelperTextEnabled(true);
        }
        k kVar = this.indicatorViewController;
        kVar.c();
        kVar.f4006w = charSequence;
        kVar.f4008y.setText(charSequence);
        int i = kVar.f3997n;
        if (i != 2) {
            kVar.f3998o = 2;
        }
        kVar.i(i, kVar.f3998o, kVar.h(kVar.f4008y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        k kVar = this.indicatorViewController;
        kVar.f3983A = colorStateList;
        C1023z c1023z = kVar.f4008y;
        if (c1023z == null || colorStateList == null) {
            return;
        }
        c1023z.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        k kVar = this.indicatorViewController;
        if (kVar.f4007x == z10) {
            return;
        }
        kVar.c();
        if (z10) {
            C1023z c1023z = new C1023z(kVar.f3991g);
            kVar.f4008y = c1023z;
            c1023z.setId(com.luminary.mobile.R.id.textinput_helper_text);
            kVar.f4008y.setTextAlignment(5);
            Typeface typeface = kVar.f3984B;
            if (typeface != null) {
                kVar.f4008y.setTypeface(typeface);
            }
            kVar.f4008y.setVisibility(4);
            C1023z c1023z2 = kVar.f4008y;
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            c1023z2.setAccessibilityLiveRegion(1);
            int i = kVar.f4009z;
            kVar.f4009z = i;
            C1023z c1023z3 = kVar.f4008y;
            if (c1023z3 != null) {
                c1023z3.setTextAppearance(i);
            }
            ColorStateList colorStateList = kVar.f3983A;
            kVar.f3983A = colorStateList;
            C1023z c1023z4 = kVar.f4008y;
            if (c1023z4 != null && colorStateList != null) {
                c1023z4.setTextColor(colorStateList);
            }
            kVar.a(kVar.f4008y, 1);
            kVar.f4008y.setAccessibilityDelegate(new l(kVar));
        } else {
            kVar.c();
            int i9 = kVar.f3997n;
            if (i9 == 2) {
                kVar.f3998o = 0;
            }
            kVar.i(i9, kVar.f3998o, kVar.h(kVar.f4008y, ""));
            kVar.g(kVar.f4008y, 1);
            kVar.f4008y = null;
            TextInputLayout textInputLayout = kVar.f3992h;
            textInputLayout.updateEditTextBackground();
            textInputLayout.updateTextInputBoxState();
        }
        kVar.f4007x = z10;
    }

    public void setHelperTextTextAppearance(int i) {
        k kVar = this.indicatorViewController;
        kVar.f4009z = i;
        C1023z c1023z = kVar.f4008y;
        if (c1023z != null) {
            c1023z.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.hintAnimationEnabled = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.hintEnabled) {
            this.hintEnabled = z10;
            if (z10) {
                CharSequence hint = this.editText.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            } else {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal(null);
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.collapsingTextHelper.k(i);
        this.focusedTextColor = this.collapsingTextHelper.f9668o;
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                com.google.android.material.internal.b bVar = this.collapsingTextHelper;
                if (bVar.f9668o != colorStateList) {
                    bVar.f9668o = colorStateList;
                    bVar.i(false);
                }
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.lengthCounter = eVar;
    }

    public void setMaxEms(int i) {
        this.maxEms = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.minEms = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.minWidth = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        aVar.f9894g.setContentDescription(i != 0 ? aVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        aVar.f9894g.setImageDrawable(i != 0 ? U4.b.j(aVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        if (z10 && aVar.i != 1) {
            aVar.g(1);
        } else if (z10) {
            aVar.getClass();
        } else {
            aVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        aVar.f9897k = colorStateList;
        j.a(aVar.f9888a, aVar.f9894g, colorStateList, aVar.f9898l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        aVar.f9898l = mode;
        j.a(aVar.f9888a, aVar.f9894g, aVar.f9897k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.placeholderTextView == null) {
            C1023z c1023z = new C1023z(getContext());
            this.placeholderTextView = c1023z;
            c1023z.setId(com.luminary.mobile.R.id.textinput_placeholder);
            TextView textView = this.placeholderTextView;
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            textView.setImportantForAccessibility(2);
            C0930k createPlaceholderFadeTransition = createPlaceholderFadeTransition();
            this.placeholderFadeIn = createPlaceholderFadeTransition;
            createPlaceholderFadeTransition.f22694b = 67L;
            this.placeholderFadeOut = createPlaceholderFadeTransition();
            setPlaceholderTextAppearance(this.placeholderTextAppearance);
            setPlaceholderTextColor(this.placeholderTextColor);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        }
        updatePlaceholderText();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.placeholderTextAppearance = i;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            TextView textView = this.placeholderTextView;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        com.google.android.material.textfield.b bVar = this.startLayout;
        bVar.getClass();
        bVar.f9918c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        bVar.f9917b.setText(charSequence);
        bVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.startLayout.f9917b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.startLayout.f9917b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(i iVar) {
        T2.f fVar = this.boxBackground;
        if (fVar == null || fVar.f3448a.f3471a == iVar) {
            return;
        }
        this.shapeAppearanceModel = iVar;
        applyBoxAttributes();
    }

    public void setStartIconCheckable(boolean z10) {
        this.startLayout.f9919d.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? U4.b.j(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        com.google.android.material.textfield.b bVar = this.startLayout;
        if (i < 0) {
            bVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != bVar.f9922g) {
            bVar.f9922g = i;
            CheckableImageButton checkableImageButton = bVar.f9919d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.b bVar = this.startLayout;
        View.OnLongClickListener onLongClickListener = bVar.i;
        CheckableImageButton checkableImageButton = bVar.f9919d;
        checkableImageButton.setOnClickListener(onClickListener);
        j.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.b bVar = this.startLayout;
        bVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = bVar.f9919d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        j.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        com.google.android.material.textfield.b bVar = this.startLayout;
        bVar.f9923h = scaleType;
        bVar.f9919d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.b bVar = this.startLayout;
        if (bVar.f9920e != colorStateList) {
            bVar.f9920e = colorStateList;
            j.a(bVar.f9916a, bVar.f9919d, colorStateList, bVar.f9921f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.b bVar = this.startLayout;
        if (bVar.f9921f != mode) {
            bVar.f9921f = mode;
            j.a(bVar.f9916a, bVar.f9919d, bVar.f9920e, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.startLayout.c(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        aVar.getClass();
        aVar.f9902p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        aVar.f9903q.setText(charSequence);
        aVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.endLayout.f9903q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.endLayout.f9903q.setTextColor(colorStateList);
    }

    public void setTextAppearanceCompatWithErrorFallback(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(2132083188);
        textView.setTextColor(C0913a.getColor(getContext(), com.luminary.mobile.R.color.design_error));
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.editText;
        if (editText != null) {
            C1596C.o(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            com.google.android.material.internal.b bVar = this.collapsingTextHelper;
            boolean m2 = bVar.m(typeface);
            boolean o10 = bVar.o(typeface);
            if (m2 || o10) {
                bVar.i(false);
            }
            k kVar = this.indicatorViewController;
            if (typeface != kVar.f3984B) {
                kVar.f3984B = typeface;
                C1023z c1023z = kVar.f4001r;
                if (c1023z != null) {
                    c1023z.setTypeface(typeface);
                }
                C1023z c1023z2 = kVar.f4008y;
                if (c1023z2 != null) {
                    c1023z2.setTypeface(typeface);
                }
            }
            TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public boolean shouldShowError() {
        k kVar = this.indicatorViewController;
        return (kVar.f3998o != 1 || kVar.f4001r == null || TextUtils.isEmpty(kVar.f3999p)) ? false : true;
    }

    public boolean updateDummyDrawables() {
        boolean z10;
        if (this.editText == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z11 = true;
        if (shouldUpdateStartDummyDrawable()) {
            int measuredWidth = this.startLayout.getMeasuredWidth() - this.editText.getPaddingLeft();
            if (this.startDummyDrawable == null || this.startDummyDrawableWidth != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.startDummyDrawable = colorDrawable;
                this.startDummyDrawableWidth = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.editText.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.startDummyDrawable;
            if (drawable != drawable2) {
                this.editText.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.startDummyDrawable != null) {
                Drawable[] compoundDrawablesRelative2 = this.editText.getCompoundDrawablesRelative();
                this.editText.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.startDummyDrawable = null;
                z10 = true;
            }
            z10 = false;
        }
        if (shouldUpdateEndDummyDrawable()) {
            int measuredWidth2 = this.endLayout.f9903q.getMeasuredWidth() - this.editText.getPaddingRight();
            com.google.android.material.textfield.a aVar = this.endLayout;
            if (aVar.e()) {
                checkableImageButton = aVar.f9890c;
            } else if (aVar.i != 0 && aVar.d()) {
                checkableImageButton = aVar.f9894g;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.editText.getCompoundDrawablesRelative();
            Drawable drawable3 = this.endDummyDrawable;
            if (drawable3 == null || this.endDummyDrawableWidth == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.endDummyDrawable = colorDrawable2;
                    this.endDummyDrawableWidth = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.endDummyDrawable;
                if (drawable4 != drawable5) {
                    this.originalEditTextEndDrawable = drawable4;
                    this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z11 = z10;
                }
            } else {
                this.endDummyDrawableWidth = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.endDummyDrawable, compoundDrawablesRelative3[3]);
            }
        } else {
            if (this.endDummyDrawable == null) {
                return z10;
            }
            Drawable[] compoundDrawablesRelative4 = this.editText.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.endDummyDrawable) {
                this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.originalEditTextEndDrawable, compoundDrawablesRelative4[3]);
            } else {
                z11 = z10;
            }
            this.endDummyDrawable = null;
        }
        return z11;
    }

    public void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = C0996F.f23609a;
        Drawable mutate = background.mutate();
        if (shouldShowError()) {
            mutate.setColorFilter(C1008j.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            mutate.setColorFilter(C1008j.c(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.editText.refreshDrawableState();
        }
    }

    public void updateEditTextBoxBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (editText == null || this.boxBackground == null) {
            return;
        }
        if ((this.boxBackgroundApplied || editText.getBackground() == null) && this.boxBackgroundMode != 0) {
            updateEditTextBoxBackground();
            this.boxBackgroundApplied = true;
        }
    }

    public void updateLabelState(boolean z10) {
        updateLabelState(z10, false);
    }

    public void updateTextInputBoxState() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.boxBackground == null || this.boxBackgroundMode == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.editText) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.editText) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.boxStrokeColor = this.disabledColor;
        } else if (shouldShowError()) {
            if (this.strokeErrorColor != null) {
                updateStrokeErrorColor(z11, z10);
            } else {
                this.boxStrokeColor = getErrorCurrentTextColors();
            }
        } else if (!this.counterOverflowed || (textView = this.counterView) == null) {
            if (z11) {
                this.boxStrokeColor = this.focusedStrokeColor;
            } else if (z10) {
                this.boxStrokeColor = this.hoveredStrokeColor;
            } else {
                this.boxStrokeColor = this.defaultStrokeColor;
            }
        } else if (this.strokeErrorColor != null) {
            updateStrokeErrorColor(z11, z10);
        } else {
            this.boxStrokeColor = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            updateCursorColor();
        }
        com.google.android.material.textfield.a aVar = this.endLayout;
        aVar.l();
        CheckableImageButton checkableImageButton = aVar.f9890c;
        ColorStateList colorStateList = aVar.f9891d;
        TextInputLayout textInputLayout = aVar.f9888a;
        j.c(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = aVar.f9897k;
        CheckableImageButton checkableImageButton2 = aVar.f9894g;
        j.c(textInputLayout, checkableImageButton2, colorStateList2);
        if (aVar.b() instanceof X2.h) {
            if (!textInputLayout.shouldShowError() || checkableImageButton2.getDrawable() == null) {
                j.a(textInputLayout, checkableImageButton2, aVar.f9897k, aVar.f9898l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        refreshStartIconDrawableState();
        if (this.boxBackgroundMode == 2) {
            int i = this.boxStrokeWidthPx;
            if (z11 && isEnabled()) {
                this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
            } else {
                this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
            }
            if (this.boxStrokeWidthPx != i) {
                recalculateCutout();
            }
        }
        if (this.boxBackgroundMode == 1) {
            if (!isEnabled()) {
                this.boxBackgroundColor = this.disabledFilledBackgroundColor;
            } else if (z10 && !z11) {
                this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
            } else if (z11) {
                this.boxBackgroundColor = this.focusedFilledBackgroundColor;
            } else {
                this.boxBackgroundColor = this.defaultFilledBackgroundColor;
            }
        }
        applyBoxAttributes();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void updateLabelState(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.editText;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.editText;
        boolean z13 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.j(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.defaultHintTextColor;
            this.collapsingTextHelper.j(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.disabledColor) : this.disabledColor));
        } else if (shouldShowError()) {
            com.google.android.material.internal.b bVar = this.collapsingTextHelper;
            C1023z c1023z = this.indicatorViewController.f4001r;
            bVar.j(c1023z != null ? c1023z.getTextColors() : null);
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.j(textView.getTextColors());
        } else if (z13 && (colorStateList = this.focusedTextColor) != null) {
            com.google.android.material.internal.b bVar2 = this.collapsingTextHelper;
            if (bVar2.f9668o != colorStateList) {
                bVar2.f9668o = colorStateList;
                bVar2.i(false);
            }
        }
        if (z12 || !this.expandedHintEnabled || (isEnabled() && z13)) {
            if (z11 || this.hintExpanded) {
                collapseHint(z10);
                return;
            }
            return;
        }
        if (z11 || !this.hintExpanded) {
            expandHint(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaceholderText(Editable editable) {
        ((v) this.lengthCounter).getClass();
        if (lambda$new$0(editable) != 0 || this.hintExpanded) {
            hidePlaceholderText();
        } else {
            showPlaceholderText();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.startLayout.f9919d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startLayout.b(drawable);
    }

    public void updateCounter(Editable editable) {
        ((v) this.lengthCounter).getClass();
        int lambda$new$0 = lambda$new$0(editable);
        boolean z10 = this.counterOverflowed;
        int i = this.counterMaxLength;
        String str = null;
        if (i == -1) {
            this.counterView.setText(String.valueOf(lambda$new$0));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = lambda$new$0 > i;
            updateCounterContentDescription(getContext(), this.counterView, lambda$new$0, this.counterMaxLength, this.counterOverflowed);
            if (z10 != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            C1538a c2 = C1538a.c();
            TextView textView = this.counterView;
            String string = getContext().getString(com.luminary.mobile.R.string.character_counter_pattern, Integer.valueOf(lambda$new$0), Integer.valueOf(this.counterMaxLength));
            if (string == null) {
                c2.getClass();
            } else {
                str = c2.d(string, c2.f30516c).toString();
            }
            textView.setText(str);
        }
        if (this.editText == null || z10 == this.counterOverflowed) {
            return;
        }
        updateLabelState(false);
        updateTextInputBoxState();
        updateEditTextBackground();
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endLayout.f9894g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.endLayout.f9894g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.endLayout.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.endLayout.f9894g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        com.google.android.material.textfield.a aVar = this.endLayout;
        CheckableImageButton checkableImageButton = aVar.f9894g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = aVar.f9897k;
            PorterDuff.Mode mode = aVar.f9898l;
            TextInputLayout textInputLayout = aVar.f9888a;
            j.a(textInputLayout, checkableImageButton, colorStateList, mode);
            j.c(textInputLayout, checkableImageButton, aVar.f9897k);
        }
    }

    public class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public int f9882a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EditText f9883b;

        public a(EditText editText) {
            this.f9883b = editText;
            this.f9882a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.updateLabelState(!textInputLayout.restoringSavedState);
            if (textInputLayout.counterEnabled) {
                textInputLayout.updateCounter(editable);
            }
            if (textInputLayout.placeholderEnabled) {
                textInputLayout.updatePlaceholderText(editable);
            }
            EditText editText = this.f9883b;
            int lineCount = editText.getLineCount();
            int i = this.f9882a;
            if (lineCount != i) {
                if (lineCount < i) {
                    WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                    int minimumHeight = editText.getMinimumHeight();
                    int i9 = textInputLayout.originalEditTextMinimumHeight;
                    if (minimumHeight != i9) {
                        editText.setMinimumHeight(i9);
                    }
                }
                this.f9882a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
