package com.google.android.material.internal;

import J2.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import java.util.WeakHashMap;
import m.c0;
import m0.f;
import y0.C1596C;
import y0.C1597a;
import y0.E;
import z0.C1638d;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends c implements k.a {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f9597G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f9598A;

    /* renamed from: B, reason: collision with root package name */
    public h f9599B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f9600C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f9601D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f9602E;

    /* renamed from: F, reason: collision with root package name */
    public final a f9603F;

    /* renamed from: v, reason: collision with root package name */
    public int f9604v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9605w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9606x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f9607y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f9608z;

    public class a extends C1597a {
        public a() {
        }

        @Override // y0.C1597a
        public final void d(View view, C1638d c1638d) {
            View.AccessibilityDelegate accessibilityDelegate = this.f31046a;
            AccessibilityNodeInfo accessibilityNodeInfo = c1638d.f31219a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.f9606x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f9607y = true;
        a aVar = new a();
        this.f9603F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.luminary.mobile.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.luminary.mobile.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.luminary.mobile.R.id.design_menu_item_text);
        this.f9608z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C1596C.o(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f9598A == null) {
                this.f9598A = (FrameLayout) ((ViewStub) findViewById(com.luminary.mobile.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f9598A.removeAllViews();
            this.f9598A.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void d(h hVar) {
        StateListDrawable stateListDrawable;
        this.f9599B = hVar;
        int i = hVar.f4775a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(hVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.luminary.mobile.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f9597G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            setBackground(stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.f4779e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.f4790q);
        c0.a(this, hVar.f4791r);
        h hVar2 = this.f9599B;
        CharSequence charSequence = hVar2.f4779e;
        CheckedTextView checkedTextView = this.f9608z;
        if (charSequence == null && hVar2.getIcon() == null && this.f9599B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f9598A;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f9598A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f9598A;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f9598A.setLayoutParams(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f9599B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        h hVar = this.f9599B;
        if (hVar != null && hVar.isCheckable() && this.f9599B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f9597G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f9606x != z10) {
            this.f9606x = z10;
            this.f9603F.h(this.f9608z, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f9608z;
        checkedTextView.setChecked(z10);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f9607y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f9601D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f9600C);
            }
            int i = this.f9604v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f9605w) {
            if (this.f9602E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = f.f23858a;
                Drawable drawable2 = resources.getDrawable(com.luminary.mobile.R.drawable.navigation_empty_icon, theme);
                this.f9602E = drawable2;
                if (drawable2 != null) {
                    int i9 = this.f9604v;
                    drawable2.setBounds(0, 0, i9, i9);
                }
            }
            drawable = this.f9602E;
        }
        this.f9608z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f9608z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f9604v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f9600C = colorStateList;
        this.f9601D = colorStateList != null;
        h hVar = this.f9599B;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f9608z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f9605w = z10;
    }

    public void setTextAppearance(int i) {
        this.f9608z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f9608z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f9608z.setText(charSequence);
    }
}
