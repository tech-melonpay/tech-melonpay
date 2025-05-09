package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import f0.C0736d;
import java.util.HashMap;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public final class c extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public b f6436a;

    /* compiled from: Constraints.java */
    public static class a extends ConstraintLayout.a {

        /* renamed from: A0, reason: collision with root package name */
        public float f6437A0;

        /* renamed from: B0, reason: collision with root package name */
        public float f6438B0;

        /* renamed from: C0, reason: collision with root package name */
        public float f6439C0;

        /* renamed from: D0, reason: collision with root package name */
        public float f6440D0;

        /* renamed from: r0, reason: collision with root package name */
        public float f6441r0;
        public boolean s0;

        /* renamed from: t0, reason: collision with root package name */
        public float f6442t0;

        /* renamed from: u0, reason: collision with root package name */
        public float f6443u0;

        /* renamed from: v0, reason: collision with root package name */
        public float f6444v0;

        /* renamed from: w0, reason: collision with root package name */
        public float f6445w0;

        /* renamed from: x0, reason: collision with root package name */
        public float f6446x0;

        /* renamed from: y0, reason: collision with root package name */
        public float f6447y0;

        /* renamed from: z0, reason: collision with root package name */
        public float f6448z0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a(-2);
        aVar.f6441r0 = 1.0f;
        aVar.s0 = false;
        aVar.f6442t0 = 0.0f;
        aVar.f6443u0 = 0.0f;
        aVar.f6444v0 = 0.0f;
        aVar.f6445w0 = 0.0f;
        aVar.f6446x0 = 1.0f;
        aVar.f6447y0 = 1.0f;
        aVar.f6448z0 = 0.0f;
        aVar.f6437A0 = 0.0f;
        aVar.f6438B0 = 0.0f;
        aVar.f6439C0 = 0.0f;
        aVar.f6440D0 = 0.0f;
        return aVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.f6441r0 = 1.0f;
        aVar.s0 = false;
        aVar.f6442t0 = 0.0f;
        aVar.f6443u0 = 0.0f;
        aVar.f6444v0 = 0.0f;
        aVar.f6445w0 = 0.0f;
        aVar.f6446x0 = 1.0f;
        aVar.f6447y0 = 1.0f;
        aVar.f6448z0 = 0.0f;
        aVar.f6437A0 = 0.0f;
        aVar.f6438B0 = 0.0f;
        aVar.f6439C0 = 0.0f;
        aVar.f6440D0 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0736d.f20593d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 15) {
                aVar.f6441r0 = obtainStyledAttributes.getFloat(index, aVar.f6441r0);
            } else if (index == 28) {
                aVar.f6442t0 = obtainStyledAttributes.getFloat(index, aVar.f6442t0);
                aVar.s0 = true;
            } else if (index == 23) {
                aVar.f6444v0 = obtainStyledAttributes.getFloat(index, aVar.f6444v0);
            } else if (index == 24) {
                aVar.f6445w0 = obtainStyledAttributes.getFloat(index, aVar.f6445w0);
            } else if (index == 22) {
                aVar.f6443u0 = obtainStyledAttributes.getFloat(index, aVar.f6443u0);
            } else if (index == 20) {
                aVar.f6446x0 = obtainStyledAttributes.getFloat(index, aVar.f6446x0);
            } else if (index == 21) {
                aVar.f6447y0 = obtainStyledAttributes.getFloat(index, aVar.f6447y0);
            } else if (index == 16) {
                aVar.f6448z0 = obtainStyledAttributes.getFloat(index, aVar.f6448z0);
            } else if (index == 17) {
                aVar.f6437A0 = obtainStyledAttributes.getFloat(index, aVar.f6437A0);
            } else if (index == 18) {
                aVar.f6438B0 = obtainStyledAttributes.getFloat(index, aVar.f6438B0);
            } else if (index == 19) {
                aVar.f6439C0 = obtainStyledAttributes.getFloat(index, aVar.f6439C0);
            } else if (index == 27) {
                aVar.f6440D0 = obtainStyledAttributes.getFloat(index, aVar.f6440D0);
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public b getConstraintSet() {
        if (this.f6436a == null) {
            this.f6436a = new b();
        }
        b bVar = this.f6436a;
        bVar.getClass();
        int childCount = getChildCount();
        HashMap<Integer, b.a> hashMap = bVar.f6333c;
        hashMap.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (bVar.f6332b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new b.a());
            }
            b.a aVar2 = hashMap.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar3 = (androidx.constraintlayout.widget.a) childAt;
                    aVar2.c(id, aVar);
                    if (aVar3 instanceof Barrier) {
                        b.C0071b c0071b = aVar2.f6337d;
                        c0071b.f6385h0 = 1;
                        Barrier barrier = (Barrier) aVar3;
                        c0071b.f6381f0 = barrier.getType();
                        c0071b.f6386i0 = barrier.getReferencedIds();
                        c0071b.f6383g0 = barrier.getMargin();
                    }
                }
                aVar2.c(id, aVar);
            }
        }
        return this.f6436a;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
    }
}
