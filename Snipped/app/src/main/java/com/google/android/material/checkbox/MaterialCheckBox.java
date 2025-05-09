package com.google.android.material.checkbox;

import J2.i;
import J2.k;
import N2.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l1.AbstractC0978c;
import l1.C0977b;
import l1.C0979d;
import m.C1004f;
import m.Z;
import m0.f;
import t2.C1279a;

/* loaded from: classes.dex */
public final class MaterialCheckBox extends C1004f {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet<c> f9266e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet<b> f9267f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f9268g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9269h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9270j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f9271k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f9272l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f9273m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9274n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f9275o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f9276p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f9277q;

    /* renamed from: r, reason: collision with root package name */
    public int f9278r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f9279s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9280t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f9281u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f9282v;

    /* renamed from: w, reason: collision with root package name */
    public final C0979d f9283w;

    /* renamed from: x, reason: collision with root package name */
    public final a f9284x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f9264y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f9265z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f9262A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    @SuppressLint({"DiscouragedApi"})
    public static final int f9263B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f9285a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f9285a = ((Integer) parcel.readValue(SavedState.class.getClassLoader())).intValue();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" CheckedState=");
            int i = this.f9285a;
            return androidx.camera.core.impl.utils.a.n(sb2, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.f9285a));
        }
    }

    public class a extends AbstractC0978c {
        public a() {
        }

        @Override // l1.AbstractC0978c
        public final void a(Drawable drawable) {
            ColorStateList colorStateList = MaterialCheckBox.this.f9275o;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // l1.AbstractC0978c
        public final void b(Drawable drawable) {
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f9275o;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(materialCheckBox.f9279s, colorStateList.getDefaultColor()));
            }
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        super(Y2.a.a(context, attributeSet, R.attr.checkboxStyle, 2132083869), attributeSet, R.attr.checkboxStyle);
        this.f9266e = new LinkedHashSet<>();
        this.f9267f = new LinkedHashSet<>();
        Context context2 = getContext();
        C0979d c0979d = new C0979d(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal<TypedValue> threadLocal = f.f23858a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0979d.f23479a = drawable;
        drawable.setCallback(c0979d.f23472f);
        new C0979d.c(c0979d.f23479a.getConstantState());
        this.f9283w = c0979d;
        this.f9284x = new a();
        Context context3 = getContext();
        this.f9272l = getButtonDrawable();
        this.f9275o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        Z e10 = i.e(context3, attributeSet, C1279a.f27508z, R.attr.checkboxStyle, 2132083869, new int[0]);
        this.f9273m = e10.b(2);
        Drawable drawable2 = this.f9272l;
        TypedArray typedArray = e10.f23728b;
        if (drawable2 != null && P2.b.b(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == f9263B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f9272l = U4.b.j(context3, R.drawable.mtrl_checkbox_button);
                this.f9274n = true;
                if (this.f9273m == null) {
                    this.f9273m = U4.b.j(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f9276p = P2.c.a(context3, e10, 3);
        this.f9277q = k.d(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f9269h = typedArray.getBoolean(10, false);
        this.i = typedArray.getBoolean(6, true);
        this.f9270j = typedArray.getBoolean(9, false);
        this.f9271k = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        e10.g();
        b();
    }

    private String getButtonStateDescription() {
        int i = this.f9278r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9268g == null) {
            int x9 = D9.b.x(R.attr.colorControlActivated, this);
            int x10 = D9.b.x(R.attr.colorError, this);
            int x11 = D9.b.x(R.attr.colorSurface, this);
            int x12 = D9.b.x(R.attr.colorOnSurface, this);
            this.f9268g = new ColorStateList(f9262A, new int[]{D9.b.n0(x11, 1.0f, x10), D9.b.n0(x11, 1.0f, x9), D9.b.n0(x11, 0.54f, x12), D9.b.n0(x11, 0.38f, x12), D9.b.n0(x11, 0.38f, x12)});
        }
        return this.f9268g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f9275o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        o oVar;
        Drawable drawable = this.f9272l;
        ColorStateList colorStateList3 = this.f9275o;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.f9272l = drawable;
        Drawable drawable2 = this.f9273m;
        ColorStateList colorStateList4 = this.f9276p;
        PorterDuff.Mode mode = this.f9277q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.f9273m = drawable2;
        if (this.f9274n) {
            C0979d c0979d = this.f9283w;
            if (c0979d != null) {
                Drawable drawable3 = c0979d.f23479a;
                a aVar = this.f9284x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f23467a == null) {
                        aVar.f23467a = new C0977b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f23467a);
                }
                ArrayList<AbstractC0978c> arrayList = c0979d.f23471e;
                C0979d.b bVar = c0979d.f23468b;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (c0979d.f23471e.size() == 0 && (oVar = c0979d.f23470d) != null) {
                        bVar.f23475b.removeListener(oVar);
                        c0979d.f23470d = null;
                    }
                }
                Drawable drawable4 = c0979d.f23479a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f23467a == null) {
                        aVar.f23467a = new C0977b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f23467a);
                } else if (aVar != null) {
                    if (c0979d.f23471e == null) {
                        c0979d.f23471e = new ArrayList<>();
                    }
                    if (!c0979d.f23471e.contains(aVar)) {
                        c0979d.f23471e.add(aVar);
                        if (c0979d.f23470d == null) {
                            c0979d.f23470d = new o(c0979d, 2);
                        }
                        bVar.f23475b.addListener(c0979d.f23470d);
                    }
                }
            }
            Drawable drawable5 = this.f9272l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && c0979d != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c0979d, false);
                ((AnimatedStateListDrawable) this.f9272l).addTransition(R.id.indeterminate, R.id.unchecked, c0979d, false);
            }
        }
        Drawable drawable6 = this.f9272l;
        if (drawable6 != null && (colorStateList2 = this.f9275o) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.f9273m;
        if (drawable7 != null && (colorStateList = this.f9276p) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.f9272l;
        Drawable drawable9 = this.f9273m;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f10 = intrinsicWidth / intrinsicHeight;
                if (f10 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f10);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f10 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f9272l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f9273m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f9276p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f9277q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f9275o;
    }

    public int getCheckedState() {
        return this.f9278r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f9271k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f9278r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9269h && this.f9275o == null && this.f9276p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f9264y);
        }
        if (this.f9270j) {
            View.mergeDrawableStates(onCreateDrawableState, f9265z);
        }
        int i9 = 0;
        while (true) {
            if (i9 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i10 = onCreateDrawableState[i9];
            if (i10 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i10 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i9] = 16842912;
                break;
            }
            i9++;
        }
        this.f9279s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.i || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (k.c(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f9270j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f9271k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f9285a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9285a = getCheckedState();
        return savedState;
    }

    @Override // m.C1004f, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(U4.b.j(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f9273m = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(U4.b.j(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f9276p == colorStateList) {
            return;
        }
        this.f9276p = colorStateList;
        b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f9277q == mode) {
            return;
        }
        this.f9277q = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f9275o == colorStateList) {
            return;
        }
        this.f9275o = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.i = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f9278r != i) {
            this.f9278r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f9281u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f9280t) {
                return;
            }
            this.f9280t = true;
            LinkedHashSet<b> linkedHashSet = this.f9267f;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            if (this.f9278r != 2 && (onCheckedChangeListener = this.f9282v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f9280t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f9271k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f9270j == z10) {
            return;
        }
        this.f9270j = z10;
        refreshDrawableState();
        Iterator<c> it = this.f9266e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f9282v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f9281u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f9269h = z10;
        if (z10) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // m.C1004f, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f9272l = drawable;
        this.f9274n = false;
        b();
    }
}
