package com.google.android.material.behavior;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.e;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.E;
import z0.InterfaceC1640f;

/* compiled from: SwipeDismissBehavior.java */
/* loaded from: classes.dex */
public final class a implements InterfaceC1640f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f9128a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f9128a = swipeDismissBehavior;
    }

    @Override // z0.InterfaceC1640f
    public final boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.f9128a;
        if (!swipeDismissBehavior.a(view)) {
            return false;
        }
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        boolean z10 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f9118f;
        view.offsetLeftAndRight((!(i == 0 && z10) && (i != 1 || z10)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        SwipeDismissBehavior.b bVar = swipeDismissBehavior.f9115c;
        if (bVar != null) {
            ((e) bVar).a(view);
        }
        return true;
    }
}
