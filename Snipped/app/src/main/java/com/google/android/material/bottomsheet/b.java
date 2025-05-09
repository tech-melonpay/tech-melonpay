package com.google.android.material.bottomsheet;

import android.R;
import android.content.res.TypedArray;
import android.view.View;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f9172a;

    public b(e eVar) {
        this.f9172a = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e eVar = this.f9172a;
        if (eVar.f9177j && eVar.isShowing()) {
            if (!eVar.f9179l) {
                TypedArray obtainStyledAttributes = eVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                eVar.f9178k = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                eVar.f9179l = true;
            }
            if (eVar.f9178k) {
                eVar.cancel();
            }
        }
    }
}
