package com.google.android.material.navigation;

import J2.i;
import M2.c;
import M2.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.luminary.mobile.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.f;
import m.Z;
import t2.C1279a;
import y0.C1596C;
import y0.E;

/* loaded from: classes.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final c f9690a;

    /* renamed from: b, reason: collision with root package name */
    public final d f9691b;

    /* renamed from: c, reason: collision with root package name */
    public final NavigationBarPresenter f9692c;

    /* renamed from: d, reason: collision with root package name */
    public f f9693d;

    /* renamed from: e, reason: collision with root package name */
    public b f9694e;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public Bundle f9695c;

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
            this.f9695c = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f9695c);
        }
    }

    public interface a {
    }

    public interface b {
    }

    public NavigationBarView(Context context, AttributeSet attributeSet) {
        super(Y2.a.a(context, attributeSet, R.attr.bottomNavigationStyle, 2132083632), attributeSet, R.attr.bottomNavigationStyle);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        navigationBarPresenter.f9686b = false;
        this.f9692c = navigationBarPresenter;
        Context context2 = getContext();
        Z e10 = i.e(context2, attributeSet, C1279a.f27474H, R.attr.bottomNavigationStyle, 2132083632, 12, 10);
        c cVar = new c(context2, getClass(), getMaxItemCount());
        this.f9690a = cVar;
        y2.b bVar = new y2.b(context2);
        this.f9691b = bVar;
        navigationBarPresenter.f9685a = bVar;
        navigationBarPresenter.f9687c = 1;
        bVar.setPresenter(navigationBarPresenter);
        cVar.b(navigationBarPresenter, cVar.f4746a);
        getContext();
        navigationBarPresenter.f9685a.f2574E = cVar;
        TypedArray typedArray = e10.f23728b;
        if (typedArray.hasValue(6)) {
            bVar.setIconTintList(e10.a(6));
        } else {
            bVar.setIconTintList(bVar.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(12)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(12, 0));
        }
        if (typedArray.hasValue(10)) {
            setItemTextAppearanceActive(typedArray.getResourceId(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(11, true));
        if (typedArray.hasValue(13)) {
            setItemTextColor(e10.a(13));
        }
        Drawable background = getBackground();
        ColorStateList a10 = F2.a.a(background);
        if (background == null || a10 != null) {
            T2.f fVar = new T2.f(T2.i.b(context2, attributeSet, R.attr.bottomNavigationStyle, 2132083632).a());
            if (a10 != null) {
                fVar.o(a10);
            }
            fVar.k(context2);
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            setBackground(fVar);
        }
        if (typedArray.hasValue(8)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(8, 0));
        }
        if (typedArray.hasValue(7)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(7, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(P2.c.a(context2, e10, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            bVar.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(P2.c.a(context2, e10, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, C1279a.f27473G);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(P2.c.b(obtainStyledAttributes, context2, 2));
            setItemActiveIndicatorShapeAppearance(T2.i.a(context2, obtainStyledAttributes.getResourceId(4, 0), 0, new T2.a(0)).a());
            obtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            int resourceId3 = typedArray.getResourceId(15, 0);
            navigationBarPresenter.f9686b = true;
            getMenuInflater().inflate(resourceId3, cVar);
            navigationBarPresenter.f9686b = false;
            navigationBarPresenter.d(true);
        }
        e10.g();
        addView(bVar);
        cVar.f4750e = new com.google.android.material.navigation.a((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f9693d == null) {
            this.f9693d = new f(getContext());
        }
        return this.f9693d;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f9691b.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f9691b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f9691b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f9691b.getItemActiveIndicatorMarginHorizontal();
    }

    public T2.i getItemActiveIndicatorShapeAppearance() {
        return this.f9691b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f9691b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f9691b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f9691b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f9691b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f9691b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f9691b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f9691b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f9691b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f9691b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f9691b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f9691b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f9691b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f9690a;
    }

    public k getMenuView() {
        return this.f9691b;
    }

    public NavigationBarPresenter getPresenter() {
        return this.f9692c;
    }

    public int getSelectedItemId() {
        return this.f9691b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Ja.a.x(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6536a);
        Bundle bundle = savedState.f9695c;
        c cVar = this.f9690a;
        cVar.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = cVar.f4765u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        jVar.i(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable l10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f9695c = bundle;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f9690a.f4765u;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (l10 = jVar.l()) != null) {
                        sparseArray.put(id, l10);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return savedState;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f9691b.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Ja.a.w(this, f10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f9691b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f9691b.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f9691b.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f9691b.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(T2.i iVar) {
        this.f9691b.setItemActiveIndicatorShapeAppearance(iVar);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f9691b.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f9691b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f9691b.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.f9691b.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f9691b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.f9691b.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f9691b.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f9691b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f9691b.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f9691b.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f9691b.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f9691b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        d dVar = this.f9691b;
        if (dVar.getLabelVisibilityMode() != i) {
            dVar.setLabelVisibilityMode(i);
            this.f9692c.d(false);
        }
    }

    public void setOnItemSelectedListener(b bVar) {
        this.f9694e = bVar;
    }

    public void setSelectedItemId(int i) {
        c cVar = this.f9690a;
        MenuItem findItem = cVar.findItem(i);
        if (findItem == null || cVar.q(findItem, this.f9692c, 0)) {
            return;
        }
        findItem.setChecked(true);
    }

    public void setOnItemReselectedListener(a aVar) {
    }
}
