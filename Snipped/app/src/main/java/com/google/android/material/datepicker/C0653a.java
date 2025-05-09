package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import java.util.WeakHashMap;
import pa.C1124b;
import t2.C1279a;
import y0.C1596C;
import y0.E;

/* compiled from: CalendarItemStyle.java */
/* renamed from: com.google.android.material.datepicker.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653a {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f9414a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f9415b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f9416c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorStateList f9417d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9418e;

    /* renamed from: f, reason: collision with root package name */
    public final T2.i f9419f;

    public C0653a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, T2.i iVar, Rect rect) {
        C1124b.o(rect.left);
        C1124b.o(rect.top);
        C1124b.o(rect.right);
        C1124b.o(rect.bottom);
        this.f9414a = rect;
        this.f9415b = colorStateList2;
        this.f9416c = colorStateList;
        this.f9417d = colorStateList3;
        this.f9418e = i;
        this.f9419f = iVar;
    }

    public static C0653a a(Context context, int i) {
        C1124b.m(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1279a.f27506x);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList b9 = P2.c.b(obtainStyledAttributes, context, 4);
        ColorStateList b10 = P2.c.b(obtainStyledAttributes, context, 9);
        ColorStateList b11 = P2.c.b(obtainStyledAttributes, context, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        T2.i a10 = T2.i.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new T2.a(0)).a();
        obtainStyledAttributes.recycle();
        return new C0653a(b9, b10, b11, dimensionPixelSize, a10, rect);
    }

    public final void b(TextView textView) {
        T2.f fVar = new T2.f();
        T2.f fVar2 = new T2.f();
        T2.i iVar = this.f9419f;
        fVar.setShapeAppearanceModel(iVar);
        fVar2.setShapeAppearanceModel(iVar);
        fVar.o(this.f9416c);
        fVar.s(this.f9418e);
        fVar.r(this.f9417d);
        ColorStateList colorStateList = this.f9415b;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), fVar, fVar2);
        Rect rect = this.f9414a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        textView.setBackground(insetDrawable);
    }
}
