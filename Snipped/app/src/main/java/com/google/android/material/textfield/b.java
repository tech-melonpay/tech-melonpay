package com.google.android.material.textfield;

import J2.k;
import P2.c;
import X2.j;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.luminary.mobile.R;
import java.util.WeakHashMap;
import m.C1023z;
import m.Z;
import y0.C1596C;
import y0.E;

/* compiled from: StartCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class b extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f9916a;

    /* renamed from: b, reason: collision with root package name */
    public final C1023z f9917b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f9918c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f9919d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f9920e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f9921f;

    /* renamed from: g, reason: collision with root package name */
    public int f9922g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView.ScaleType f9923h;
    public View.OnLongClickListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9924j;

    public b(TextInputLayout textInputLayout, Z z10) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f9916a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f9919d = checkableImageButton;
        C1023z c1023z = new C1023z(getContext());
        this.f9917b = c1023z;
        if (c.e(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        j.d(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        j.d(checkableImageButton, null);
        TypedArray typedArray = z10.f23728b;
        if (typedArray.hasValue(69)) {
            this.f9920e = c.a(getContext(), z10, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f9921f = k.d(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(z10.b(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f9922g) {
            this.f9922g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType b9 = j.b(typedArray.getInt(68, -1));
            this.f9923h = b9;
            checkableImageButton.setScaleType(b9);
        }
        c1023z.setVisibility(8);
        c1023z.setId(R.id.textinput_prefix_text);
        c1023z.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        c1023z.setAccessibilityLiveRegion(1);
        c1023z.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c1023z.setTextColor(z10.a(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f9918c = TextUtils.isEmpty(text2) ? null : text2;
        c1023z.setText(text2);
        e();
        addView(checkableImageButton);
        addView(c1023z);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.f9919d;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        return this.f9917b.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f9919d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f9920e;
            PorterDuff.Mode mode = this.f9921f;
            TextInputLayout textInputLayout = this.f9916a;
            j.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            j.c(textInputLayout, checkableImageButton, this.f9920e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        j.d(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        j.d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z10) {
        CheckableImageButton checkableImageButton = this.f9919d;
        if ((checkableImageButton.getVisibility() == 0) != z10) {
            checkableImageButton.setVisibility(z10 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f9916a.editText;
        if (editText == null) {
            return;
        }
        if (this.f9919d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
        this.f9917b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f9918c == null || this.f9924j) ? 8 : 0;
        setVisibility((this.f9919d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f9917b.setVisibility(i);
        this.f9916a.updateDummyDrawables();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        d();
    }
}
