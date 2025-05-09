package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import java.util.ArrayList;

/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u.f f7818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f7820c;

    public v(u uVar, u.f fVar, int i) {
        this.f7820c = uVar;
        this.f7818a = fVar;
        this.f7819b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar = this.f7820c;
        RecyclerView recyclerView = uVar.f7795w;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        u.f fVar = this.f7818a;
        if (fVar.f7815k) {
            return;
        }
        RecyclerView.C c2 = fVar.f7810e;
        if (c2.getAbsoluteAdapterPosition() != -1) {
            RecyclerView.k itemAnimator = uVar.f7795w.getItemAnimator();
            if (itemAnimator == null || !itemAnimator.f()) {
                ArrayList arrayList = uVar.f7793u;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((u.f) arrayList.get(i)).f7816l) {
                    }
                }
                uVar.f7790r.onSwiped(c2, this.f7819b);
                return;
            }
            uVar.f7795w.post(this);
        }
    }
}
