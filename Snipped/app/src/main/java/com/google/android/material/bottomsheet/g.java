package com.google.android.material.bottomsheet;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import u2.C1512a;
import y0.I;
import y0.J;

/* compiled from: InsetsAnimationCallback.java */
/* loaded from: classes.dex */
public final class g extends I.b {

    /* renamed from: c, reason: collision with root package name */
    public final View f9190c;

    /* renamed from: d, reason: collision with root package name */
    public int f9191d;

    /* renamed from: e, reason: collision with root package name */
    public int f9192e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f9193f = new int[2];

    public g(View view) {
        this.f9190c = view;
    }

    @Override // y0.I.b
    public final J a(J j10, List<I> list) {
        Iterator<I> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().f30982a.c() & 8) != 0) {
                this.f9190c.setTranslationY(C1512a.c(this.f9192e, r0.f30982a.b(), 0));
                break;
            }
        }
        return j10;
    }
}
