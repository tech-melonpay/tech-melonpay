package com.google.android.material.theme;

import O2.a;
import X2.m;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textview.MaterialTextView;
import h.C0785l;
import m.C1001c;
import m.C1003e;
import m.C1004f;
import m.C1016s;
import m.C1023z;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0785l {
    @Override // h.C0785l
    public final C1001c a(Context context, AttributeSet attributeSet) {
        return new m(context, attributeSet);
    }

    @Override // h.C0785l
    public final C1003e b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // h.C0785l
    public final C1004f c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // h.C0785l
    public final C1016s d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // h.C0785l
    public final C1023z e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
