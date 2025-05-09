package k1;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import k1.AbstractC0919C;

/* compiled from: TransitionSet.java */
/* loaded from: classes.dex */
public class J extends AbstractC0919C {

    /* renamed from: K, reason: collision with root package name */
    public ArrayList<AbstractC0919C> f22749K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f22750L;

    /* renamed from: M, reason: collision with root package name */
    public int f22751M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f22752N;

    /* renamed from: O, reason: collision with root package name */
    public int f22753O;

    /* compiled from: TransitionSet.java */
    public class a extends G {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0919C f22754a;

        public a(AbstractC0919C abstractC0919C) {
            this.f22754a = abstractC0919C;
        }

        @Override // k1.G, k1.AbstractC0919C.g
        public final void i(AbstractC0919C abstractC0919C) {
            this.f22754a.J();
            abstractC0919C.G(this);
        }
    }

    /* compiled from: TransitionSet.java */
    public class b extends G {
        public b() {
        }

        @Override // k1.G, k1.AbstractC0919C.g
        public final void a(AbstractC0919C abstractC0919C) {
            J j10 = J.this;
            j10.f22749K.remove(abstractC0919C);
            if (j10.z()) {
                return;
            }
            j10.D(j10, AbstractC0919C.h.f22733e, false);
            j10.f22714w = true;
            j10.D(j10, AbstractC0919C.h.f22732d, false);
        }
    }

    /* compiled from: TransitionSet.java */
    public static class c extends G {

        /* renamed from: a, reason: collision with root package name */
        public J f22756a;

        @Override // k1.G, k1.AbstractC0919C.g
        public final void e(AbstractC0919C abstractC0919C) {
            J j10 = this.f22756a;
            if (j10.f22752N) {
                return;
            }
            j10.R();
            j10.f22752N = true;
        }

        @Override // k1.G, k1.AbstractC0919C.g
        public final void i(AbstractC0919C abstractC0919C) {
            J j10 = this.f22756a;
            int i = j10.f22751M - 1;
            j10.f22751M = i;
            if (i == 0) {
                j10.f22752N = false;
                j10.p();
            }
            abstractC0919C.G(this);
        }
    }

    public J() {
        this.f22749K = new ArrayList<>();
        this.f22750L = true;
        this.f22752N = false;
        this.f22753O = 0;
    }

    @Override // k1.AbstractC0919C
    public final boolean A() {
        int size = this.f22749K.size();
        for (int i = 0; i < size; i++) {
            if (!this.f22749K.get(i).A()) {
                return false;
            }
        }
        return true;
    }

    @Override // k1.AbstractC0919C
    public final void E(View view) {
        super.E(view);
        int size = this.f22749K.size();
        for (int i = 0; i < size; i++) {
            this.f22749K.get(i).E(view);
        }
    }

    @Override // k1.AbstractC0919C
    public final void F() {
        this.f22690D = 0L;
        b bVar = new b();
        for (int i = 0; i < this.f22749K.size(); i++) {
            AbstractC0919C abstractC0919C = this.f22749K.get(i);
            abstractC0919C.a(bVar);
            abstractC0919C.F();
            long j10 = abstractC0919C.f22690D;
            if (this.f22750L) {
                this.f22690D = Math.max(this.f22690D, j10);
            } else {
                long j11 = this.f22690D;
                abstractC0919C.f22692F = j11;
                this.f22690D = j11 + j10;
            }
        }
    }

    @Override // k1.AbstractC0919C
    public final AbstractC0919C G(AbstractC0919C.g gVar) {
        super.G(gVar);
        return this;
    }

    @Override // k1.AbstractC0919C
    public final void H(View view) {
        for (int i = 0; i < this.f22749K.size(); i++) {
            this.f22749K.get(i).H(view);
        }
        this.f22698f.remove(view);
    }

    @Override // k1.AbstractC0919C
    public final void I(ViewGroup viewGroup) {
        super.I(viewGroup);
        int size = this.f22749K.size();
        for (int i = 0; i < size; i++) {
            this.f22749K.get(i).I(viewGroup);
        }
    }

    @Override // k1.AbstractC0919C
    public final void J() {
        if (this.f22749K.isEmpty()) {
            R();
            p();
            return;
        }
        c cVar = new c();
        cVar.f22756a = this;
        Iterator<AbstractC0919C> it = this.f22749K.iterator();
        while (it.hasNext()) {
            it.next().a(cVar);
        }
        this.f22751M = this.f22749K.size();
        if (this.f22750L) {
            Iterator<AbstractC0919C> it2 = this.f22749K.iterator();
            while (it2.hasNext()) {
                it2.next().J();
            }
            return;
        }
        for (int i = 1; i < this.f22749K.size(); i++) {
            this.f22749K.get(i - 1).a(new a(this.f22749K.get(i)));
        }
        AbstractC0919C abstractC0919C = this.f22749K.get(0);
        if (abstractC0919C != null) {
            abstractC0919C.J();
        }
    }

    @Override // k1.AbstractC0919C
    public final void K(long j10, long j11) {
        long j12 = this.f22690D;
        if (this.f22705n != null) {
            if (j10 < 0 && j11 < 0) {
                return;
            }
            if (j10 > j12 && j11 > j12) {
                return;
            }
        }
        boolean z10 = j10 < j11;
        if ((j10 >= 0 && j11 < 0) || (j10 <= j12 && j11 > j12)) {
            this.f22714w = false;
            D(this, AbstractC0919C.h.f22731c, z10);
        }
        if (this.f22750L) {
            for (int i = 0; i < this.f22749K.size(); i++) {
                this.f22749K.get(i).K(j10, j11);
            }
        } else {
            int i9 = 1;
            while (true) {
                if (i9 >= this.f22749K.size()) {
                    i9 = this.f22749K.size();
                    break;
                } else if (this.f22749K.get(i9).f22692F > j11) {
                    break;
                } else {
                    i9++;
                }
            }
            int i10 = i9 - 1;
            if (j10 >= j11) {
                while (i10 < this.f22749K.size()) {
                    AbstractC0919C abstractC0919C = this.f22749K.get(i10);
                    long j13 = abstractC0919C.f22692F;
                    int i11 = i10;
                    long j14 = j10 - j13;
                    if (j14 < 0) {
                        break;
                    }
                    abstractC0919C.K(j14, j11 - j13);
                    i10 = i11 + 1;
                }
            } else {
                while (i10 >= 0) {
                    AbstractC0919C abstractC0919C2 = this.f22749K.get(i10);
                    long j15 = abstractC0919C2.f22692F;
                    long j16 = j10 - j15;
                    abstractC0919C2.K(j16, j11 - j15);
                    if (j16 >= 0) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
        }
        if (this.f22705n != null) {
            if ((j10 <= j12 || j11 > j12) && (j10 >= 0 || j11 < 0)) {
                return;
            }
            if (j10 > j12) {
                this.f22714w = true;
            }
            D(this, AbstractC0919C.h.f22732d, z10);
        }
    }

    @Override // k1.AbstractC0919C
    public final void M(AbstractC0919C.d dVar) {
        this.f22688B = dVar;
        this.f22753O |= 8;
        int size = this.f22749K.size();
        for (int i = 0; i < size; i++) {
            this.f22749K.get(i).M(dVar);
        }
    }

    @Override // k1.AbstractC0919C
    public final void O(AbstractC0940v abstractC0940v) {
        super.O(abstractC0940v);
        this.f22753O |= 4;
        if (this.f22749K != null) {
            for (int i = 0; i < this.f22749K.size(); i++) {
                this.f22749K.get(i).O(abstractC0940v);
            }
        }
    }

    @Override // k1.AbstractC0919C
    public final void P(X x9) {
        this.f22687A = x9;
        this.f22753O |= 2;
        int size = this.f22749K.size();
        for (int i = 0; i < size; i++) {
            this.f22749K.get(i).P(x9);
        }
    }

    @Override // k1.AbstractC0919C
    public final void Q(long j10) {
        this.f22694b = j10;
    }

    @Override // k1.AbstractC0919C
    public final String S(String str) {
        String S = super.S(str);
        for (int i = 0; i < this.f22749K.size(); i++) {
            StringBuilder r8 = androidx.camera.core.impl.utils.a.r(S, "\n");
            r8.append(this.f22749K.get(i).S(str + "  "));
            S = r8.toString();
        }
        return S;
    }

    public final void T(AbstractC0919C abstractC0919C) {
        this.f22749K.add(abstractC0919C);
        abstractC0919C.f22705n = this;
        long j10 = this.f22695c;
        if (j10 >= 0) {
            abstractC0919C.L(j10);
        }
        if ((this.f22753O & 1) != 0) {
            abstractC0919C.N(this.f22696d);
        }
        if ((this.f22753O & 2) != 0) {
            abstractC0919C.P(this.f22687A);
        }
        if ((this.f22753O & 4) != 0) {
            abstractC0919C.O(this.f22689C);
        }
        if ((this.f22753O & 8) != 0) {
            abstractC0919C.M(this.f22688B);
        }
    }

    public final AbstractC0919C U(int i) {
        if (i < 0 || i >= this.f22749K.size()) {
            return null;
        }
        return this.f22749K.get(i);
    }

    @Override // k1.AbstractC0919C
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void L(long j10) {
        ArrayList<AbstractC0919C> arrayList;
        this.f22695c = j10;
        if (j10 < 0 || (arrayList = this.f22749K) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f22749K.get(i).L(j10);
        }
    }

    @Override // k1.AbstractC0919C
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final void N(TimeInterpolator timeInterpolator) {
        this.f22753O |= 1;
        ArrayList<AbstractC0919C> arrayList = this.f22749K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f22749K.get(i).N(timeInterpolator);
            }
        }
        this.f22696d = timeInterpolator;
    }

    public final void X(int i) {
        if (i == 0) {
            this.f22750L = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(com.google.android.gms.measurement.internal.a.g(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f22750L = false;
        }
    }

    @Override // k1.AbstractC0919C
    public final void a(AbstractC0919C.g gVar) {
        super.a(gVar);
    }

    @Override // k1.AbstractC0919C
    public final void b(int i) {
        for (int i9 = 0; i9 < this.f22749K.size(); i9++) {
            this.f22749K.get(i9).b(i);
        }
        super.b(i);
    }

    @Override // k1.AbstractC0919C
    public final void c(View view) {
        for (int i = 0; i < this.f22749K.size(); i++) {
            this.f22749K.get(i).c(view);
        }
        this.f22698f.add(view);
    }

    @Override // k1.AbstractC0919C
    public final void cancel() {
        super.cancel();
        int size = this.f22749K.size();
        for (int i = 0; i < size; i++) {
            this.f22749K.get(i).cancel();
        }
    }

    @Override // k1.AbstractC0919C
    public final void d(Class cls) {
        for (int i = 0; i < this.f22749K.size(); i++) {
            this.f22749K.get(i).d(cls);
        }
        super.d(cls);
    }

    @Override // k1.AbstractC0919C
    public final void e(String str) {
        for (int i = 0; i < this.f22749K.size(); i++) {
            this.f22749K.get(i).e(str);
        }
        super.e(str);
    }

    @Override // k1.AbstractC0919C
    public final void g(L l10) {
        if (C(l10.f22762b)) {
            Iterator<AbstractC0919C> it = this.f22749K.iterator();
            while (it.hasNext()) {
                AbstractC0919C next = it.next();
                if (next.C(l10.f22762b)) {
                    next.g(l10);
                    l10.f22763c.add(next);
                }
            }
        }
    }

    @Override // k1.AbstractC0919C
    public final void i(L l10) {
        super.i(l10);
        int size = this.f22749K.size();
        for (int i = 0; i < size; i++) {
            this.f22749K.get(i).i(l10);
        }
    }

    @Override // k1.AbstractC0919C
    public final void j(L l10) {
        if (C(l10.f22762b)) {
            Iterator<AbstractC0919C> it = this.f22749K.iterator();
            while (it.hasNext()) {
                AbstractC0919C next = it.next();
                if (next.C(l10.f22762b)) {
                    next.j(l10);
                    l10.f22763c.add(next);
                }
            }
        }
    }

    @Override // k1.AbstractC0919C
    /* renamed from: m */
    public final AbstractC0919C clone() {
        J j10 = (J) super.clone();
        j10.f22749K = new ArrayList<>();
        int size = this.f22749K.size();
        for (int i = 0; i < size; i++) {
            AbstractC0919C clone = this.f22749K.get(i).clone();
            j10.f22749K.add(clone);
            clone.f22705n = j10;
        }
        return j10;
    }

    @Override // k1.AbstractC0919C
    public final void o(ViewGroup viewGroup, z1.g gVar, z1.g gVar2, ArrayList<L> arrayList, ArrayList<L> arrayList2) {
        long j10 = this.f22694b;
        int size = this.f22749K.size();
        for (int i = 0; i < size; i++) {
            AbstractC0919C abstractC0919C = this.f22749K.get(i);
            if (j10 > 0 && (this.f22750L || i == 0)) {
                long j11 = abstractC0919C.f22694b;
                if (j11 > 0) {
                    abstractC0919C.Q(j11 + j10);
                } else {
                    abstractC0919C.Q(j10);
                }
            }
            abstractC0919C.o(viewGroup, gVar, gVar2, arrayList, arrayList2);
        }
    }

    @Override // k1.AbstractC0919C
    public final void q(int i) {
        for (int i9 = 0; i9 < this.f22749K.size(); i9++) {
            this.f22749K.get(i9).q(i);
        }
        super.q(i);
    }

    @Override // k1.AbstractC0919C
    public final void r(Class cls) {
        for (int i = 0; i < this.f22749K.size(); i++) {
            this.f22749K.get(i).r(cls);
        }
        super.r(cls);
    }

    @Override // k1.AbstractC0919C
    public final void s(String str) {
        for (int i = 0; i < this.f22749K.size(); i++) {
            this.f22749K.get(i).s(str);
        }
        super.s(str);
    }

    @Override // k1.AbstractC0919C
    public final boolean z() {
        for (int i = 0; i < this.f22749K.size(); i++) {
            if (this.f22749K.get(i).z()) {
                return true;
            }
        }
        return false;
    }

    public J(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22749K = new ArrayList<>();
        this.f22750L = true;
        this.f22752N = false;
        this.f22753O = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0918B.f22681h);
        X(m0.i.b(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
