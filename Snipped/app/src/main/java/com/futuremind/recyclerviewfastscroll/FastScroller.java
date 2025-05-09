package com.futuremind.recyclerviewfastscroll;

import H3.h;
import W1.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.luminary.mobile.R;
import k0.C0913a;

/* loaded from: classes.dex */
public class FastScroller extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f8786o = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.futuremind.recyclerviewfastscroll.a f8787a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f8788b;

    /* renamed from: c, reason: collision with root package name */
    public View f8789c;

    /* renamed from: d, reason: collision with root package name */
    public View f8790d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f8791e;

    /* renamed from: f, reason: collision with root package name */
    public int f8792f;

    /* renamed from: g, reason: collision with root package name */
    public int f8793g;

    /* renamed from: h, reason: collision with root package name */
    public int f8794h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f8795j;

    /* renamed from: k, reason: collision with root package name */
    public int f8796k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8797l;

    /* renamed from: m, reason: collision with root package name */
    public b f8798m;

    /* renamed from: n, reason: collision with root package name */
    public V1.b f8799n;

    public class a implements ViewGroup.OnHierarchyChangeListener {
        public a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            int i = FastScroller.f8786o;
            FastScroller.this.b();
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            int i = FastScroller.f8786o;
            FastScroller.this.b();
        }
    }

    public FastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f8787a = new com.futuremind.recyclerviewfastscroll.a(this);
        setClipChildren(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f1484b, R.attr.fastscroll__style, 0);
        try {
            this.f8794h = obtainStyledAttributes.getColor(0, -1);
            this.f8793g = obtainStyledAttributes.getColor(2, -1);
            this.i = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            this.f8796k = getVisibility();
            setViewProvider(new W1.a());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecyclerViewPosition(float f10) {
        TextView textView;
        RecyclerView recyclerView = this.f8788b;
        if (recyclerView == null) {
            return;
        }
        int itemCount = recyclerView.getAdapter().getItemCount();
        int min = (int) Math.min(Math.max(0.0f, (int) (f10 * itemCount)), itemCount - 1);
        this.f8788b.scrollToPosition(min);
        V1.b bVar = this.f8799n;
        if (bVar == null || (textView = this.f8791e) == null) {
            return;
        }
        textView.setText(bVar.c(min));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if ((r3.f8788b.getAdapter().getItemCount() * r3.f8788b.getChildAt(0).getHeight()) <= r3.f8788b.getHeight()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        if (r3.f8796k == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        super.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if ((r3.f8788b.getAdapter().getItemCount() * r3.f8788b.getChildAt(0).getWidth()) <= r3.f8788b.getWidth()) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.f8788b
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            if (r0 == 0) goto L68
            androidx.recyclerview.widget.RecyclerView r0 = r3.f8788b
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            int r0 = r0.getItemCount()
            if (r0 == 0) goto L68
            androidx.recyclerview.widget.RecyclerView r0 = r3.f8788b
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L68
            boolean r0 = r3.c()
            if (r0 == 0) goto L41
            androidx.recyclerview.widget.RecyclerView r0 = r3.f8788b
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getHeight()
            androidx.recyclerview.widget.RecyclerView r2 = r3.f8788b
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r2.getAdapter()
            int r2 = r2.getItemCount()
            int r2 = r2 * r0
            androidx.recyclerview.widget.RecyclerView r0 = r3.f8788b
            int r0 = r0.getHeight()
            if (r2 > r0) goto L5f
            goto L68
        L41:
            androidx.recyclerview.widget.RecyclerView r0 = r3.f8788b
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getWidth()
            androidx.recyclerview.widget.RecyclerView r2 = r3.f8788b
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r2.getAdapter()
            int r2 = r2.getItemCount()
            int r2 = r2 * r0
            androidx.recyclerview.widget.RecyclerView r0 = r3.f8788b
            int r0 = r0.getWidth()
            if (r2 > r0) goto L5f
            goto L68
        L5f:
            int r0 = r3.f8796k
            if (r0 == 0) goto L64
            goto L68
        L64:
            super.setVisibility(r1)
            goto L6c
        L68:
            r0 = 4
            super.setVisibility(r0)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.futuremind.recyclerviewfastscroll.FastScroller.b():void");
    }

    public final boolean c() {
        return this.f8795j == 1;
    }

    public b getViewProvider() {
        return this.f8798m;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        float width;
        int width2;
        View view;
        Drawable background;
        TextView textView;
        Drawable background2;
        super.onLayout(z10, i, i9, i10, i11);
        this.f8790d.setOnTouchListener(new V1.a(this));
        W1.a aVar = (W1.a) this.f8798m;
        if (aVar.f3795a.c()) {
            width = aVar.f3794d.getHeight() / 2.0f;
            width2 = aVar.f3793c.getHeight();
        } else {
            width = aVar.f3794d.getWidth() / 2.0f;
            width2 = aVar.f3793c.getWidth();
        }
        this.f8792f = (int) (width - width2);
        int i12 = this.f8794h;
        if (i12 != -1 && (background2 = (textView = this.f8791e).getBackground()) != null) {
            background2.mutate().setTint(i12);
            textView.setBackground(background2);
        }
        int i13 = this.f8793g;
        if (i13 != -1 && (background = (view = this.f8790d).getBackground()) != null) {
            background.mutate().setTint(i13);
            view.setBackground(background);
        }
        int i14 = this.i;
        if (i14 != -1) {
            this.f8791e.setTextAppearance(i14);
        }
        if (isInEditMode()) {
            return;
        }
        this.f8787a.a(this.f8788b);
    }

    public void setBubbleColor(int i) {
        this.f8794h = i;
        invalidate();
    }

    public void setBubbleTextAppearance(int i) {
        this.i = i;
        invalidate();
    }

    public void setHandleColor(int i) {
        this.f8793g = i;
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        this.f8795j = i;
        super.setOrientation(i == 0 ? 1 : 0);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f8788b = recyclerView;
        if (recyclerView.getAdapter() instanceof V1.b) {
            this.f8799n = (V1.b) recyclerView.getAdapter();
        }
        recyclerView.addOnScrollListener(this.f8787a);
        b();
        recyclerView.setOnHierarchyChangeListener(new a());
    }

    public void setScrollerPosition(float f10) {
        if (c()) {
            this.f8789c.setY(Math.min(Math.max(0.0f, ((getHeight() - this.f8790d.getHeight()) * f10) + this.f8792f), getHeight() - this.f8789c.getHeight()));
            this.f8790d.setY(Math.min(Math.max(0.0f, f10 * (getHeight() - this.f8790d.getHeight())), getHeight() - this.f8790d.getHeight()));
            return;
        }
        this.f8789c.setX(Math.min(Math.max(0.0f, ((getWidth() - this.f8790d.getWidth()) * f10) + this.f8792f), getWidth() - this.f8789c.getWidth()));
        this.f8790d.setX(Math.min(Math.max(0.0f, f10 * (getWidth() - this.f8790d.getWidth())), getWidth() - this.f8790d.getWidth()));
    }

    public void setViewProvider(b bVar) {
        removeAllViews();
        this.f8798m = bVar;
        bVar.f3795a = this;
        W1.a aVar = (W1.a) bVar;
        View inflate = LayoutInflater.from(aVar.f3795a.getContext()).inflate(R.layout.fastscroll__default_bubble, (ViewGroup) this, false);
        aVar.f3793c = inflate;
        this.f8789c = inflate;
        aVar.f3794d = new View(aVar.f3795a.getContext());
        int dimensionPixelSize = aVar.f3795a.c() ? 0 : aVar.f3795a.getContext().getResources().getDimensionPixelSize(R.dimen.fastscroll__handle_inset);
        int dimensionPixelSize2 = aVar.f3795a.c() ? aVar.f3795a.getContext().getResources().getDimensionPixelSize(R.dimen.fastscroll__handle_inset) : 0;
        aVar.f3794d.setBackground(new InsetDrawable(C0913a.getDrawable(aVar.f3795a.getContext(), R.drawable.fastscroll__default_handle), dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize));
        Resources resources = aVar.f3795a.getContext().getResources();
        boolean c2 = aVar.f3795a.c();
        int i = R.dimen.fastscroll__handle_height;
        int dimensionPixelSize3 = resources.getDimensionPixelSize(c2 ? R.dimen.fastscroll__handle_clickable_width : R.dimen.fastscroll__handle_height);
        Resources resources2 = aVar.f3795a.getContext().getResources();
        if (!aVar.f3795a.c()) {
            i = R.dimen.fastscroll__handle_clickable_width;
        }
        aVar.f3794d.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize3, resources2.getDimensionPixelSize(i)));
        this.f8790d = aVar.f3794d;
        this.f8791e = (TextView) aVar.f3793c;
        addView(this.f8789c);
        addView(this.f8790d);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.f8796k = i;
        b();
    }
}
