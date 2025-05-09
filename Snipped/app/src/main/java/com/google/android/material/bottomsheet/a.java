package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.e;
import y0.J;
import y0.p;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f9171a;

    public a(e eVar) {
        this.f9171a = eVar;
    }

    @Override // y0.p
    public final J c(View view, J j10) {
        e eVar = this.f9171a;
        e.b bVar = eVar.f9180m;
        if (bVar != null) {
            eVar.f9174f.removeBottomSheetCallback(bVar);
        }
        e.b bVar2 = new e.b(eVar.i, j10);
        eVar.f9180m = bVar2;
        bVar2.b(eVar.getWindow());
        eVar.f9174f.addBottomSheetCallback(eVar.f9180m);
        return j10;
    }
}
