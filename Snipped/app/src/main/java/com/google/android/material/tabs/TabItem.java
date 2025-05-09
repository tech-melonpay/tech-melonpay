package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import m.Z;
import t2.C1279a;

/* loaded from: classes.dex */
public class TabItem extends View {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f9800a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f9801b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9802c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Z e10 = Z.e(context, attributeSet, C1279a.f27481O);
        TypedArray typedArray = e10.f23728b;
        this.f9800a = typedArray.getText(2);
        this.f9801b = e10.b(0);
        this.f9802c = typedArray.getResourceId(1, 0);
        e10.g();
    }
}
