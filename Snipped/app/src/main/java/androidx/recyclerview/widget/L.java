package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.C0578p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes.dex */
public abstract class L extends RecyclerView.k {

    /* renamed from: g, reason: collision with root package name */
    public boolean f7433g;

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final boolean a(RecyclerView.C c2, RecyclerView.C c10, RecyclerView.k.c cVar, RecyclerView.k.c cVar2) {
        int i;
        int i9;
        int i10 = cVar.f7497a;
        int i11 = cVar.f7498b;
        if (c10.shouldIgnore()) {
            int i12 = cVar.f7497a;
            i9 = cVar.f7498b;
            i = i12;
        } else {
            i = cVar2.f7497a;
            i9 = cVar2.f7498b;
        }
        C0578p c0578p = (C0578p) this;
        if (c2 == c10) {
            return c0578p.g(c2, i10, i11, i, i9);
        }
        float translationX = c2.itemView.getTranslationX();
        float translationY = c2.itemView.getTranslationY();
        float alpha = c2.itemView.getAlpha();
        c0578p.l(c2);
        c2.itemView.setTranslationX(translationX);
        c2.itemView.setTranslationY(translationY);
        c2.itemView.setAlpha(alpha);
        c0578p.l(c10);
        c10.itemView.setTranslationX(-((int) ((i - i10) - translationX)));
        c10.itemView.setTranslationY(-((int) ((i9 - i11) - translationY)));
        c10.itemView.setAlpha(0.0f);
        ArrayList<C0578p.a> arrayList = c0578p.f7678k;
        C0578p.a aVar = new C0578p.a();
        aVar.f7686a = c2;
        aVar.f7687b = c10;
        aVar.f7688c = i10;
        aVar.f7689d = i11;
        aVar.f7690e = i;
        aVar.f7691f = i9;
        arrayList.add(aVar);
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean g(RecyclerView.C c2, int i, int i9, int i10, int i11);
}
