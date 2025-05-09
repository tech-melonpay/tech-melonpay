package com.google.android.material.button;

import J2.i;
import J2.k;
import T2.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.button.MaterialButton;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import t2.C1279a;
import y0.C1596C;
import y0.C1597a;
import y0.E;
import z0.C1638d;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9195k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9196a;

    /* renamed from: b, reason: collision with root package name */
    public final e f9197b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet<d> f9198c;

    /* renamed from: d, reason: collision with root package name */
    public final a f9199d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f9200e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9201f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9202g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9203h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public HashSet f9204j;

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
        }
    }

    public class b extends C1597a {
        public b() {
        }

        @Override // y0.C1597a
        public final void d(View view, C1638d c1638d) {
            this.f31046a.onInitializeAccessibilityNodeInfo(view, c1638d.f31219a);
            int i = MaterialButtonToggleGroup.f9195k;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            int i9 = -1;
            if (view instanceof MaterialButton) {
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i10 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    }
                    if (materialButtonToggleGroup.getChildAt(i10) == view) {
                        i9 = i11;
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i10) instanceof MaterialButton) && materialButtonToggleGroup.c(i10)) {
                        i11++;
                    }
                    i10++;
                }
            }
            c1638d.j(C1638d.f.a(0, 1, i9, 1, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {

        /* renamed from: e, reason: collision with root package name */
        public static final T2.a f9207e = new T2.a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        public final T2.c f9208a;

        /* renamed from: b, reason: collision with root package name */
        public final T2.c f9209b;

        /* renamed from: c, reason: collision with root package name */
        public final T2.c f9210c;

        /* renamed from: d, reason: collision with root package name */
        public final T2.c f9211d;

        public c(T2.c cVar, T2.c cVar2, T2.c cVar3, T2.c cVar4) {
            this.f9208a = cVar;
            this.f9209b = cVar3;
            this.f9210c = cVar4;
            this.f9211d = cVar2;
        }
    }

    public interface d {
        void a(int i, boolean z10);
    }

    public class e implements MaterialButton.b {
        public e() {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(Y2.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2132083877), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f9196a = new ArrayList();
        this.f9197b = new e();
        this.f9198c = new LinkedHashSet<>();
        this.f9199d = new a();
        this.f9201f = false;
        this.f9204j = new HashSet();
        TypedArray d10 = i.d(getContext(), attributeSet, C1279a.f27504v, R.attr.materialButtonToggleGroupStyle, 2132083877, new int[0]);
        setSingleSelection(d10.getBoolean(3, false));
        this.i = d10.getResourceId(1, -1);
        this.f9203h = d10.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(d10.getBoolean(0, true));
        d10.recycle();
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if ((getChildAt(i9) instanceof MaterialButton) && c(i9)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f9197b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        T2.i shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f9196a.add(new c(shapeAppearanceModel.f3497e, shapeAppearanceModel.f3500h, shapeAppearanceModel.f3498f, shapeAppearanceModel.f3499g));
        materialButton.setEnabled(isEnabled());
        C1596C.o(materialButton, new b());
    }

    public final void b(int i, boolean z10) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f9204j);
        if (z10 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f9202g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f9203h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d(Set<Integer> set) {
        HashSet hashSet = this.f9204j;
        this.f9204j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f9201f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f9201f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean contains2 = set.contains(Integer.valueOf(id));
                Iterator<d> it = this.f9198c.iterator();
                while (it.hasNext()) {
                    it.next().a(id, contains2);
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f9199d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f9200e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                i.a e10 = materialButton.getShapeAppearanceModel().e();
                c cVar2 = (c) this.f9196a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z10 = getOrientation() == 0;
                    T2.a aVar = c.f9207e;
                    if (i == firstVisibleChildIndex) {
                        cVar = z10 ? k.c(this) ? new c(aVar, aVar, cVar2.f9209b, cVar2.f9210c) : new c(cVar2.f9208a, cVar2.f9211d, aVar, aVar) : new c(cVar2.f9208a, aVar, cVar2.f9209b, aVar);
                    } else if (i == lastVisibleChildIndex) {
                        cVar = z10 ? k.c(this) ? new c(cVar2.f9208a, cVar2.f9211d, aVar, aVar) : new c(aVar, aVar, cVar2.f9209b, cVar2.f9210c) : new c(aVar, cVar2.f9211d, aVar, cVar2.f9210c);
                    } else {
                        cVar2 = null;
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    e10.c(0.0f);
                } else {
                    e10.f3508e = cVar2.f9208a;
                    e10.f3511h = cVar2.f9211d;
                    e10.f3509f = cVar2.f9209b;
                    e10.f3510g = cVar2.f9210c;
                }
                materialButton.setShapeAppearanceModel(e10.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f9202g || this.f9204j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f9204j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f9204j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i9) {
        Integer[] numArr = this.f9200e;
        if (numArr != null && i9 < numArr.length) {
            return numArr[i9].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i9;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C1638d.e.a(1, getVisibleButtonCount(), this.f9202g ? 1 : 2, false).f31233a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i9) {
        e();
        a();
        super.onMeasure(i, i9);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f9196a.remove(indexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f9203h = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f9202g != z10) {
            this.f9202g = z10;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f9202g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
