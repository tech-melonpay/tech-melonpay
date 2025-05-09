package com.tbuonomo.viewpagerdotsindicator;

import Q8.c;
import Q8.d;
import R8.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: BaseDotsIndicator.kt */
/* loaded from: classes2.dex */
public abstract class BaseDotsIndicator extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<ImageView> f20345a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20346b;

    /* renamed from: c, reason: collision with root package name */
    public int f20347c;

    /* renamed from: d, reason: collision with root package name */
    public float f20348d;

    /* renamed from: e, reason: collision with root package name */
    public float f20349e;

    /* renamed from: f, reason: collision with root package name */
    public float f20350f;

    /* renamed from: g, reason: collision with root package name */
    public a f20351g;

    /* compiled from: BaseDotsIndicator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 9, 0})
    public enum Type {
        DEFAULT(8.0f, d.f3206a, 1, 4, 5, 2, 0),
        /* JADX INFO: Fake field, exist only in values array */
        SPRING(4.0f, d.f3207b, 2, 4, 5, 3, 1),
        /* JADX INFO: Fake field, exist only in values array */
        WORM(4.0f, d.f3208c, 1, 3, 4, 2, 0);


        /* renamed from: a, reason: collision with root package name */
        public final float f20353a = 16.0f;

        /* renamed from: b, reason: collision with root package name */
        public final float f20354b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f20355c;

        /* renamed from: d, reason: collision with root package name */
        public final int f20356d;

        /* renamed from: e, reason: collision with root package name */
        public final int f20357e;

        /* renamed from: f, reason: collision with root package name */
        public final int f20358f;

        /* renamed from: g, reason: collision with root package name */
        public final int f20359g;

        /* renamed from: h, reason: collision with root package name */
        public final int f20360h;

        Type(float f10, int[] iArr, int i, int i9, int i10, int i11, int i12) {
            this.f20354b = f10;
            this.f20355c = iArr;
            this.f20356d = i;
            this.f20357e = i9;
            this.f20358f = i10;
            this.f20359g = i11;
            this.f20360h = i12;
        }
    }

    /* compiled from: BaseDotsIndicator.kt */
    public interface a {
        void a(c cVar);

        int b();

        void c(int i);

        void d();

        boolean e();

        int getCount();
    }

    public BaseDotsIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public abstract void a(int i);

    public abstract com.tbuonomo.viewpagerdotsindicator.a b();

    public abstract void c(int i);

    public final void d() {
        if (this.f20351g == null) {
            return;
        }
        post(new Q8.a(this, 1));
    }

    public final void e() {
        int size = this.f20345a.size();
        for (int i = 0; i < size; i++) {
            c(i);
        }
    }

    public abstract void f();

    public final boolean getDotsClickable() {
        return this.f20346b;
    }

    public final int getDotsColor() {
        return this.f20347c;
    }

    public final float getDotsCornerRadius() {
        return this.f20349e;
    }

    public final float getDotsSize() {
        return this.f20348d;
    }

    public final float getDotsSpacing() {
        return this.f20350f;
    }

    public final a getPager() {
        return this.f20351g;
    }

    public abstract Type getType();

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new Q8.a(this, 0));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        super.onLayout(z10, i, i9, i10, i11);
        if (getLayoutDirection() == 1) {
            setLayoutDirection(0);
            setRotation(180.0f);
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        post(new Q8.a(this, 2));
    }

    public final void setDotsClickable(boolean z10) {
        this.f20346b = z10;
    }

    public final void setDotsColor(int i) {
        this.f20347c = i;
        e();
    }

    public final void setDotsCornerRadius(float f10) {
        this.f20349e = f10;
    }

    public final void setDotsSize(float f10) {
        this.f20348d = f10;
    }

    public final void setDotsSpacing(float f10) {
        this.f20350f = f10;
    }

    public final void setPager(a aVar) {
        this.f20351g = aVar;
    }

    public final void setPointsColor(int i) {
        setDotsColor(i);
        e();
    }

    public final void setViewPager(ViewPager viewPager) {
        new f().d(this, viewPager);
    }

    public final void setViewPager2(ViewPager2 viewPager2) {
        new R8.c().d(this, viewPager2);
    }

    public BaseDotsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20345a = new ArrayList<>();
        this.f20346b = true;
        this.f20347c = -16711681;
        float f10 = getContext().getResources().getDisplayMetrics().density * getType().f20353a;
        this.f20348d = f10;
        this.f20349e = f10 / 2.0f;
        this.f20350f = getContext().getResources().getDisplayMetrics().density * getType().f20354b;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getType().f20355c);
            setDotsColor(obtainStyledAttributes.getColor(getType().f20356d, -16711681));
            this.f20348d = obtainStyledAttributes.getDimension(getType().f20357e, this.f20348d);
            this.f20349e = obtainStyledAttributes.getDimension(getType().f20359g, this.f20349e);
            this.f20350f = obtainStyledAttributes.getDimension(getType().f20358f, this.f20350f);
            this.f20346b = obtainStyledAttributes.getBoolean(getType().f20360h, true);
            obtainStyledAttributes.recycle();
        }
    }
}
