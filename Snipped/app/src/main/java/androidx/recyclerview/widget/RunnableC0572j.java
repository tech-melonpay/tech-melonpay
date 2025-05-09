package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0572j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0578p f7652b;

    public RunnableC0572j(C0578p c0578p, ArrayList arrayList) {
        this.f7652b = c0578p;
        this.f7651a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f7651a;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C0578p c0578p = this.f7652b;
            if (!hasNext) {
                arrayList.clear();
                c0578p.f7679l.remove(arrayList);
                return;
            }
            RecyclerView.C c2 = (RecyclerView.C) it.next();
            c0578p.getClass();
            View view = c2.itemView;
            ViewPropertyAnimator animate = view.animate();
            c0578p.f7682o.add(c2);
            animate.alpha(1.0f).setDuration(c0578p.f7493c).setListener(new C0574l(view, animate, c0578p, c2)).start();
        }
    }
}
