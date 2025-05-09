package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578p extends L {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f7675s;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<RecyclerView.C> f7676h;
    public ArrayList<RecyclerView.C> i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<b> f7677j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList<a> f7678k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.C>> f7679l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<ArrayList<b>> f7680m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<ArrayList<a>> f7681n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<RecyclerView.C> f7682o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList<RecyclerView.C> f7683p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList<RecyclerView.C> f7684q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList<RecyclerView.C> f7685r;

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.p$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.C f7686a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.C f7687b;

        /* renamed from: c, reason: collision with root package name */
        public int f7688c;

        /* renamed from: d, reason: collision with root package name */
        public int f7689d;

        /* renamed from: e, reason: collision with root package name */
        public int f7690e;

        /* renamed from: f, reason: collision with root package name */
        public int f7691f;

        @SuppressLint({"UnknownNullness"})
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeInfo{oldHolder=");
            sb2.append(this.f7686a);
            sb2.append(", newHolder=");
            sb2.append(this.f7687b);
            sb2.append(", fromX=");
            sb2.append(this.f7688c);
            sb2.append(", fromY=");
            sb2.append(this.f7689d);
            sb2.append(", toX=");
            sb2.append(this.f7690e);
            sb2.append(", toY=");
            return androidx.camera.core.impl.utils.a.m(sb2, this.f7691f, '}');
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.p$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.C f7692a;

        /* renamed from: b, reason: collision with root package name */
        public int f7693b;

        /* renamed from: c, reason: collision with root package name */
        public int f7694c;

        /* renamed from: d, reason: collision with root package name */
        public int f7695d;

        /* renamed from: e, reason: collision with root package name */
        public int f7696e;
    }

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.C) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    @SuppressLint({"UnknownNullness"})
    public final void d(RecyclerView.C c2) {
        View view = c2.itemView;
        view.animate().cancel();
        ArrayList<b> arrayList = this.f7677j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).f7692a == c2) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(c2);
                arrayList.remove(size);
            }
        }
        j(this.f7678k, c2);
        if (this.f7676h.remove(c2)) {
            view.setAlpha(1.0f);
            c(c2);
        }
        if (this.i.remove(c2)) {
            view.setAlpha(1.0f);
            c(c2);
        }
        ArrayList<ArrayList<a>> arrayList2 = this.f7681n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList<a> arrayList3 = arrayList2.get(size2);
            j(arrayList3, c2);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<b>> arrayList4 = this.f7680m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList<b> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList5.get(size4).f7692a == c2) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(c2);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.C>> arrayList6 = this.f7679l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.C> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(c2)) {
                view.setAlpha(1.0f);
                c(c2);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f7684q.remove(c2);
        this.f7682o.remove(c2);
        this.f7685r.remove(c2);
        this.f7683p.remove(c2);
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void e() {
        ArrayList<b> arrayList = this.f7677j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = arrayList.get(size);
            View view = bVar.f7692a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.f7692a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.C> arrayList2 = this.f7676h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.C> arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C c2 = arrayList3.get(size3);
            c2.itemView.setAlpha(1.0f);
            c(c2);
            arrayList3.remove(size3);
        }
        ArrayList<a> arrayList4 = this.f7678k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            a aVar = arrayList4.get(size4);
            RecyclerView.C c10 = aVar.f7686a;
            if (c10 != null) {
                k(aVar, c10);
            }
            RecyclerView.C c11 = aVar.f7687b;
            if (c11 != null) {
                k(aVar, c11);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList<ArrayList<b>> arrayList5 = this.f7680m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList<b> arrayList6 = arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = arrayList6.get(size6);
                    View view2 = bVar2.f7692a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(bVar2.f7692a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.C>> arrayList7 = this.f7679l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.C> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C c12 = arrayList8.get(size8);
                    c12.itemView.setAlpha(1.0f);
                    c(c12);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<a>> arrayList9 = this.f7681n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList<a> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    a aVar2 = arrayList10.get(size10);
                    RecyclerView.C c13 = aVar2.f7686a;
                    if (c13 != null) {
                        k(aVar2, c13);
                    }
                    RecyclerView.C c14 = aVar2.f7687b;
                    if (c14 != null) {
                        k(aVar2, c14);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f7684q);
            h(this.f7683p);
            h(this.f7682o);
            h(this.f7685r);
            ArrayList<RecyclerView.k.a> arrayList11 = this.f7492b;
            int size11 = arrayList11.size();
            for (int i = 0; i < size11; i++) {
                arrayList11.get(i).a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final boolean f() {
        return (this.i.isEmpty() && this.f7678k.isEmpty() && this.f7677j.isEmpty() && this.f7676h.isEmpty() && this.f7683p.isEmpty() && this.f7684q.isEmpty() && this.f7682o.isEmpty() && this.f7685r.isEmpty() && this.f7680m.isEmpty() && this.f7679l.isEmpty() && this.f7681n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.L
    @SuppressLint({"UnknownNullness"})
    public final boolean g(RecyclerView.C c2, int i, int i9, int i10, int i11) {
        View view = c2.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i9 + ((int) c2.itemView.getTranslationY());
        l(c2);
        int i12 = i10 - translationX;
        int i13 = i11 - translationY;
        if (i12 == 0 && i13 == 0) {
            c(c2);
            return false;
        }
        if (i12 != 0) {
            view.setTranslationX(-i12);
        }
        if (i13 != 0) {
            view.setTranslationY(-i13);
        }
        ArrayList<b> arrayList = this.f7677j;
        b bVar = new b();
        bVar.f7692a = c2;
        bVar.f7693b = translationX;
        bVar.f7694c = translationY;
        bVar.f7695d = i10;
        bVar.f7696e = i11;
        arrayList.add(bVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList<RecyclerView.k.a> arrayList = this.f7492b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
        arrayList.clear();
    }

    public final void j(ArrayList arrayList, RecyclerView.C c2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (k(aVar, c2) && aVar.f7686a == null && aVar.f7687b == null) {
                arrayList.remove(aVar);
            }
        }
    }

    public final boolean k(a aVar, RecyclerView.C c2) {
        if (aVar.f7687b == c2) {
            aVar.f7687b = null;
        } else {
            if (aVar.f7686a != c2) {
                return false;
            }
            aVar.f7686a = null;
        }
        c2.itemView.setAlpha(1.0f);
        c2.itemView.setTranslationX(0.0f);
        c2.itemView.setTranslationY(0.0f);
        c(c2);
        return true;
    }

    public final void l(RecyclerView.C c2) {
        if (f7675s == null) {
            f7675s = new ValueAnimator().getInterpolator();
        }
        c2.itemView.animate().setInterpolator(f7675s);
        d(c2);
    }
}
