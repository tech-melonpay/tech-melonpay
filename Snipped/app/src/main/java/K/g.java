package k;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import pa.C1124b;
import y0.E;
import y0.F;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f22659c;

    /* renamed from: d, reason: collision with root package name */
    public F f22660d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22661e;

    /* renamed from: b, reason: collision with root package name */
    public long f22658b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final a f22662f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<E> f22657a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    public class a extends C1124b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f22663a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f22664b = 0;

        public a() {
        }

        @Override // pa.C1124b, y0.F
        public final void b() {
            if (this.f22663a) {
                return;
            }
            this.f22663a = true;
            F f10 = g.this.f22660d;
            if (f10 != null) {
                f10.b();
            }
        }

        @Override // y0.F
        public final void c() {
            int i = this.f22664b + 1;
            this.f22664b = i;
            g gVar = g.this;
            if (i == gVar.f22657a.size()) {
                F f10 = gVar.f22660d;
                if (f10 != null) {
                    f10.c();
                }
                this.f22664b = 0;
                this.f22663a = false;
                gVar.f22661e = false;
            }
        }
    }

    public final void a() {
        if (this.f22661e) {
            Iterator<E> it = this.f22657a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f22661e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f22661e) {
            return;
        }
        Iterator<E> it = this.f22657a.iterator();
        while (it.hasNext()) {
            E next = it.next();
            long j10 = this.f22658b;
            if (j10 >= 0) {
                next.c(j10);
            }
            Interpolator interpolator = this.f22659c;
            if (interpolator != null && (view = next.f30981a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f22660d != null) {
                next.d(this.f22662f);
            }
            View view2 = next.f30981a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f22661e = true;
    }
}
