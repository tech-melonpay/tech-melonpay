package com.google.android.material.textfield;

import J2.h;
import J2.k;
import X2.e;
import X2.i;
import X2.j;
import X2.n;
import X2.o;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.luminary.mobile.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.C1023z;
import m.Z;
import y0.C1596C;
import y0.E;
import z0.AccessibilityManagerTouchExplorationStateChangeListenerC1636b;

/* compiled from: EndCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class a extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f9888a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f9889b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f9890c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f9891d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f9892e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f9893f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f9894g;

    /* renamed from: h, reason: collision with root package name */
    public final d f9895h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.g> f9896j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f9897k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f9898l;

    /* renamed from: m, reason: collision with root package name */
    public int f9899m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f9900n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f9901o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f9902p;

    /* renamed from: q, reason: collision with root package name */
    public final C1023z f9903q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9904r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f9905s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f9906t;

    /* renamed from: u, reason: collision with root package name */
    public A0.b f9907u;

    /* renamed from: v, reason: collision with root package name */
    public final C0106a f9908v;

    /* compiled from: EndCompoundLayout.java */
    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0106a extends h {
        public C0106a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a.this.b().a();
        }

        @Override // J2.h, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            a.this.b().b();
        }
    }

    /* compiled from: EndCompoundLayout.java */
    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(TextInputLayout textInputLayout) {
            a aVar = a.this;
            if (aVar.f9905s == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = aVar.f9905s;
            C0106a c0106a = aVar.f9908v;
            if (editText != null) {
                editText.removeTextChangedListener(c0106a);
                if (aVar.f9905s.getOnFocusChangeListener() == aVar.b().e()) {
                    aVar.f9905s.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            aVar.f9905s = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(c0106a);
            }
            aVar.b().m(aVar.f9905s);
            aVar.j(aVar.b());
        }
    }

    /* compiled from: EndCompoundLayout.java */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            if (aVar.f9907u == null || (accessibilityManager = aVar.f9906t) == null) {
                return;
            }
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            if (aVar.isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1636b(aVar.f9907u));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            A0.b bVar = aVar.f9907u;
            if (bVar == null || (accessibilityManager = aVar.f9906t) == null) {
                return;
            }
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1636b(bVar));
        }
    }

    /* compiled from: EndCompoundLayout.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<i> f9912a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        public final a f9913b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9914c;

        /* renamed from: d, reason: collision with root package name */
        public final int f9915d;

        public d(a aVar, Z z10) {
            this.f9913b = aVar;
            TypedArray typedArray = z10.f23728b;
            this.f9914c = typedArray.getResourceId(28, 0);
            this.f9915d = typedArray.getResourceId(52, 0);
        }
    }

    public a(TextInputLayout textInputLayout, Z z10) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.i = 0;
        this.f9896j = new LinkedHashSet<>();
        this.f9908v = new C0106a();
        b bVar = new b();
        this.f9906t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f9888a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f9889b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a10 = a(this, from, R.id.text_input_error_icon);
        this.f9890c = a10;
        CheckableImageButton a11 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f9894g = a11;
        this.f9895h = new d(this, z10);
        C1023z c1023z = new C1023z(getContext());
        this.f9903q = c1023z;
        TypedArray typedArray = z10.f23728b;
        if (typedArray.hasValue(38)) {
            this.f9891d = P2.c.a(getContext(), z10, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f9892e = k.d(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(z10.b(37));
        }
        a10.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        a10.setImportantForAccessibility(2);
        a10.setClickable(false);
        a10.setPressable(false);
        a10.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f9897k = P2.c.a(getContext(), z10, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f9898l = k.d(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a11.getContentDescription() != (text = typedArray.getText(27))) {
                a11.setContentDescription(text);
            }
            a11.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f9897k = P2.c.a(getContext(), z10, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f9898l = k.d(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (a11.getContentDescription() != text2) {
                a11.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f9899m) {
            this.f9899m = dimensionPixelSize;
            a11.setMinimumWidth(dimensionPixelSize);
            a11.setMinimumHeight(dimensionPixelSize);
            a10.setMinimumWidth(dimensionPixelSize);
            a10.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType b9 = j.b(typedArray.getInt(31, -1));
            this.f9900n = b9;
            a11.setScaleType(b9);
            a10.setScaleType(b9);
        }
        c1023z.setVisibility(8);
        c1023z.setId(R.id.textinput_suffix_text);
        c1023z.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c1023z.setAccessibilityLiveRegion(1);
        c1023z.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c1023z.setTextColor(z10.a(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f9902p = TextUtils.isEmpty(text3) ? null : text3;
        c1023z.setText(text3);
        n();
        frameLayout.addView(a11);
        addView(c1023z);
        addView(frameLayout);
        addView(a10);
        textInputLayout.addOnEditTextAttachedListener(bVar);
        addOnAttachStateChangeListener(new c());
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (P2.c.e(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final i b() {
        i eVar;
        int i = this.i;
        d dVar = this.f9895h;
        SparseArray<i> sparseArray = dVar.f9912a;
        i iVar = sparseArray.get(i);
        if (iVar == null) {
            a aVar = dVar.f9913b;
            if (i == -1) {
                eVar = new e(aVar);
            } else if (i == 0) {
                eVar = new n(aVar);
            } else if (i == 1) {
                iVar = new o(aVar, dVar.f9915d);
                sparseArray.append(i, iVar);
            } else if (i == 2) {
                eVar = new X2.d(aVar);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "Invalid end icon mode: "));
                }
                eVar = new X2.h(aVar);
            }
            iVar = eVar;
            sparseArray.append(i, iVar);
        }
        return iVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f9894g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        return this.f9903q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f9889b.getVisibility() == 0 && this.f9894g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f9890c.getVisibility() == 0;
    }

    public final void f(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean z12;
        i b9 = b();
        boolean k3 = b9.k();
        CheckableImageButton checkableImageButton = this.f9894g;
        boolean z13 = true;
        if (!k3 || (z12 = checkableImageButton.f9593a) == b9.l()) {
            z11 = false;
        } else {
            checkableImageButton.setChecked(!z12);
            z11 = true;
        }
        if (!(b9 instanceof X2.h) || (isActivated = checkableImageButton.isActivated()) == b9.j()) {
            z13 = z11;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z10 || z13) {
            j.c(this.f9888a, checkableImageButton, this.f9897k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        i b9 = b();
        A0.b bVar = this.f9907u;
        AccessibilityManager accessibilityManager = this.f9906t;
        if (bVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1636b(bVar));
        }
        this.f9907u = null;
        b9.s();
        this.i = i;
        Iterator<TextInputLayout.g> it = this.f9896j.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        h(i != 0);
        i b10 = b();
        int i9 = this.f9895h.f9914c;
        if (i9 == 0) {
            i9 = b10.d();
        }
        Drawable j10 = i9 != 0 ? U4.b.j(getContext(), i9) : null;
        CheckableImageButton checkableImageButton = this.f9894g;
        checkableImageButton.setImageDrawable(j10);
        TextInputLayout textInputLayout = this.f9888a;
        if (j10 != null) {
            j.a(textInputLayout, checkableImageButton, this.f9897k, this.f9898l);
            j.c(textInputLayout, checkableImageButton, this.f9897k);
        }
        int c2 = b10.c();
        CharSequence text = c2 != 0 ? getResources().getText(c2) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b10.k());
        if (!b10.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b10.r();
        A0.b h9 = b10.h();
        this.f9907u = h9;
        if (h9 != null && accessibilityManager != null) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1636b(this.f9907u));
            }
        }
        View.OnClickListener f10 = b10.f();
        View.OnLongClickListener onLongClickListener = this.f9901o;
        checkableImageButton.setOnClickListener(f10);
        j.d(checkableImageButton, onLongClickListener);
        EditText editText = this.f9905s;
        if (editText != null) {
            b10.m(editText);
            j(b10);
        }
        j.a(textInputLayout, checkableImageButton, this.f9897k, this.f9898l);
        f(true);
    }

    public final void h(boolean z10) {
        if (d() != z10) {
            this.f9894g.setVisibility(z10 ? 0 : 8);
            k();
            m();
            this.f9888a.updateDummyDrawables();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f9890c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        j.a(this.f9888a, checkableImageButton, this.f9891d, this.f9892e);
    }

    public final void j(i iVar) {
        if (this.f9905s == null) {
            return;
        }
        if (iVar.e() != null) {
            this.f9905s.setOnFocusChangeListener(iVar.e());
        }
        if (iVar.g() != null) {
            this.f9894g.setOnFocusChangeListener(iVar.g());
        }
    }

    public final void k() {
        this.f9889b.setVisibility((this.f9894g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f9902p == null || this.f9904r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f9890c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f9888a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.isErrorEnabled() && textInputLayout.shouldShowError()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.updateDummyDrawables();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f9888a;
        if (textInputLayout.editText == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.editText;
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.editText.getPaddingTop();
        int paddingBottom = textInputLayout.editText.getPaddingBottom();
        WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
        this.f9903q.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        C1023z c1023z = this.f9903q;
        int visibility = c1023z.getVisibility();
        int i = (this.f9902p == null || this.f9904r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c1023z.setVisibility(i);
        this.f9888a.updateDummyDrawables();
    }
}
