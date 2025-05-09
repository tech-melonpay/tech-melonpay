package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0578p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0570h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0578p f7648b;

    public RunnableC0570h(C0578p c0578p, ArrayList arrayList) {
        this.f7648b = c0578p;
        this.f7647a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f7647a;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C0578p c0578p = this.f7648b;
            if (!hasNext) {
                arrayList.clear();
                c0578p.f7680m.remove(arrayList);
                return;
            }
            C0578p.b bVar = (C0578p.b) it.next();
            RecyclerView.C c2 = bVar.f7692a;
            c0578p.getClass();
            View view = c2.itemView;
            int i = bVar.f7695d - bVar.f7693b;
            int i9 = bVar.f7696e - bVar.f7694c;
            if (i != 0) {
                view.animate().translationX(0.0f);
            }
            if (i9 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            c0578p.f7683p.add(c2);
            animate.setDuration(c0578p.f7495e).setListener(new C0575m(c0578p, c2, i, view, i9, animate)).start();
        }
    }
}
