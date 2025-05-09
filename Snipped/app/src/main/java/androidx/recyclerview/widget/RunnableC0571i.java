package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0578p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0571i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0578p f7650b;

    public RunnableC0571i(C0578p c0578p, ArrayList arrayList) {
        this.f7650b = c0578p;
        this.f7649a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f7649a;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C0578p c0578p = this.f7650b;
            if (!hasNext) {
                arrayList.clear();
                c0578p.f7681n.remove(arrayList);
                return;
            }
            C0578p.a aVar = (C0578p.a) it.next();
            c0578p.getClass();
            RecyclerView.C c2 = aVar.f7686a;
            View view = c2 == null ? null : c2.itemView;
            RecyclerView.C c10 = aVar.f7687b;
            View view2 = c10 != null ? c10.itemView : null;
            ArrayList<RecyclerView.C> arrayList2 = c0578p.f7685r;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(c0578p.f7496f);
                arrayList2.add(aVar.f7686a);
                duration.translationX(aVar.f7690e - aVar.f7688c);
                duration.translationY(aVar.f7691f - aVar.f7689d);
                duration.alpha(0.0f).setListener(new C0576n(c0578p, aVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(aVar.f7687b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(c0578p.f7496f).alpha(1.0f).setListener(new C0577o(c0578p, aVar, animate, view2)).start();
            }
        }
    }
}
