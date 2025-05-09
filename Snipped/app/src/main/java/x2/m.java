package X2;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import m.C1001c;
import m.K;
import t2.C1279a;
import y0.C1596C;
import y0.E;

/* compiled from: MaterialAutoCompleteTextView.java */
/* loaded from: classes.dex */
public final class m extends C1001c {
    private final AccessibilityManager accessibilityManager;
    private ColorStateList dropDownBackgroundTint;
    private final K modalListPopup;
    private final float popupElevation;
    private final int simpleItemLayout;
    private int simpleItemSelectedColor;
    private ColorStateList simpleItemSelectedRippleColor;
    private final Rect tempRect;

    /* compiled from: MaterialAutoCompleteTextView.java */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j10) {
            Object item;
            m mVar = m.this;
            if (i < 0) {
                K k3 = mVar.modalListPopup;
                item = !k3.f23666z.isShowing() ? null : k3.f23644c.getSelectedItem();
            } else {
                item = mVar.getAdapter().getItem(i);
            }
            mVar.updateText(item);
            AdapterView.OnItemClickListener onItemClickListener = mVar.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    K k10 = mVar.modalListPopup;
                    view = k10.f23666z.isShowing() ? k10.f23644c.getSelectedView() : null;
                    K k11 = mVar.modalListPopup;
                    i = !k11.f23666z.isShowing() ? -1 : k11.f23644c.getSelectedItemPosition();
                    K k12 = mVar.modalListPopup;
                    j10 = !k12.f23666z.isShowing() ? Long.MIN_VALUE : k12.f23644c.getSelectedItemId();
                }
                onItemClickListener.onItemClick(mVar.modalListPopup.f23644c, view, i, j10);
            }
            mVar.modalListPopup.dismiss();
        }
    }

    /* compiled from: MaterialAutoCompleteTextView.java */
    public class b<T> extends ArrayAdapter<String> {

        /* renamed from: a, reason: collision with root package name */
        public ColorStateList f4017a;

        /* renamed from: b, reason: collision with root package name */
        public ColorStateList f4018b;

        public b(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            b();
        }

        public final void b() {
            ColorStateList colorStateList;
            m mVar = m.this;
            ColorStateList colorStateList2 = null;
            if (mVar.simpleItemSelectedRippleColor != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{mVar.simpleItemSelectedRippleColor.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.f4018b = colorStateList;
            if (mVar.simpleItemSelectedColor != 0 && mVar.simpleItemSelectedRippleColor != null) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                colorStateList2 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{n0.a.f(mVar.simpleItemSelectedRippleColor.getColorForState(iArr3, 0), mVar.simpleItemSelectedColor), n0.a.f(mVar.simpleItemSelectedRippleColor.getColorForState(iArr2, 0), mVar.simpleItemSelectedColor), mVar.simpleItemSelectedColor});
            }
            this.f4017a = colorStateList2;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                m mVar = m.this;
                Drawable drawable = null;
                if (mVar.getText().toString().contentEquals(textView.getText()) && mVar.simpleItemSelectedColor != 0) {
                    ColorDrawable colorDrawable = new ColorDrawable(mVar.simpleItemSelectedColor);
                    if (this.f4018b != null) {
                        colorDrawable.setTintList(this.f4017a);
                        drawable = new RippleDrawable(this.f4018b, colorDrawable, null);
                    } else {
                        drawable = colorDrawable;
                    }
                }
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                textView.setBackground(drawable);
            }
            return view2;
        }
    }

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.luminary.mobile.R.attr.autoCompleteTextViewStyle);
    }

    private TextInputLayout findTextInputLayoutAncestor() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean isPopupRequired() {
        return isTouchExplorationEnabled() || isSwitchAccessEnabled();
    }

    private boolean isSwitchAccessEnabled() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isTouchExplorationEnabled() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int measureContentWidth() {
        ListAdapter adapter = getAdapter();
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        int i = 0;
        if (adapter == null || findTextInputLayoutAncestor == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        K k3 = this.modalListPopup;
        int min = Math.min(adapter.getCount(), Math.max(0, !k3.f23666z.isShowing() ? -1 : k3.f23644c.getSelectedItemPosition()) + 15);
        View view = null;
        int i9 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, findTextInputLayoutAncestor);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i9 = Math.max(i9, view.getMeasuredWidth());
        }
        Drawable background = this.modalListPopup.f23666z.getBackground();
        if (background != null) {
            background.getPadding(this.tempRect);
            Rect rect = this.tempRect;
            i9 += rect.left + rect.right;
        }
        return findTextInputLayoutAncestor.getEndIconView().getMeasuredWidth() + i9;
    }

    private void onInputTypeChanged() {
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (findTextInputLayoutAncestor != null) {
            findTextInputLayoutAncestor.updateEditTextBoxBackgroundIfNeeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void updateText(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (isPopupRequired()) {
            this.modalListPopup.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.dropDownBackgroundTint;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        return (findTextInputLayoutAncestor == null || !findTextInputLayoutAncestor.isProvidingHint()) ? super.getHint() : findTextInputLayoutAncestor.getHint();
    }

    public float getPopupElevation() {
        return this.popupElevation;
    }

    public int getSimpleItemSelectedColor() {
        return this.simpleItemSelectedColor;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.simpleItemSelectedRippleColor;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (findTextInputLayoutAncestor != null && findTextInputLayoutAncestor.isProvidingHint() && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.modalListPopup.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), measureContentWidth()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (isPopupRequired()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t3) {
        super.setAdapter(t3);
        this.modalListPopup.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        K k3 = this.modalListPopup;
        if (k3 != null) {
            k3.k(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.dropDownBackgroundTint = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof T2.f) {
            ((T2.f) dropDownBackground).o(this.dropDownBackgroundTint);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.modalListPopup.f23657q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        onInputTypeChanged();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.simpleItemSelectedColor = i;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).b();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.simpleItemSelectedRippleColor = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).b();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (isPopupRequired()) {
            this.modalListPopup.a();
        } else {
            super.showDropDown();
        }
    }

    public m(Context context, AttributeSet attributeSet, int i) {
        super(Y2.a.a(context, attributeSet, i, 0), attributeSet, i);
        this.tempRect = new Rect();
        Context context2 = getContext();
        TypedArray d10 = J2.i.d(context2, attributeSet, C1279a.f27502t, i, 2132083566, new int[0]);
        if (d10.hasValue(0) && d10.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.simpleItemLayout = d10.getResourceId(3, com.luminary.mobile.R.layout.mtrl_auto_complete_simple_item);
        this.popupElevation = d10.getDimensionPixelOffset(1, com.luminary.mobile.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (d10.hasValue(2)) {
            this.dropDownBackgroundTint = ColorStateList.valueOf(d10.getColor(2, 0));
        }
        this.simpleItemSelectedColor = d10.getColor(4, 0);
        this.simpleItemSelectedRippleColor = P2.c.b(d10, context2, 5);
        this.accessibilityManager = (AccessibilityManager) context2.getSystemService("accessibility");
        K k3 = new K(context2, null, com.luminary.mobile.R.attr.listPopupWindowStyle, 0);
        this.modalListPopup = k3;
        k3.f23665y = true;
        k3.f23666z.setFocusable(true);
        k3.f23655o = this;
        k3.f23666z.setInputMethodMode(2);
        k3.p(getAdapter());
        k3.f23656p = new a();
        if (d10.hasValue(6)) {
            setSimpleItems(d10.getResourceId(6, 0));
        }
        d10.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.simpleItemLayout, strArr));
    }
}
