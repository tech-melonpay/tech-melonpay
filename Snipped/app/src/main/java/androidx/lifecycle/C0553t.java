package androidx.lifecycle;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n.C1058a;
import o.C1084a;
import o.b;

/* compiled from: LifecycleRegistry.jvm.kt */
/* renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0553t extends Lifecycle {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7096b = true;

    /* renamed from: c, reason: collision with root package name */
    public C1084a<InterfaceC0551q, a> f7097c = new C1084a<>();

    /* renamed from: d, reason: collision with root package name */
    public Lifecycle.State f7098d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference<r> f7099e;

    /* renamed from: f, reason: collision with root package name */
    public int f7100f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7101g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7102h;
    public final ArrayList<Lifecycle.State> i;

    /* renamed from: j, reason: collision with root package name */
    public final MutableStateFlow<Lifecycle.State> f7103j;

    /* compiled from: LifecycleRegistry.jvm.kt */
    /* renamed from: androidx.lifecycle.t$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Lifecycle.State f7104a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC0550p f7105b;

        public final void a(r rVar, Lifecycle.Event event) {
            Lifecycle.State a10 = event.a();
            Lifecycle.State state = this.f7104a;
            if (a10.compareTo(state) < 0) {
                state = a10;
            }
            this.f7104a = state;
            this.f7105b.d(rVar, event);
            this.f7104a = a10;
        }
    }

    public C0553t(r rVar) {
        Lifecycle.State state = Lifecycle.State.f6976b;
        this.f7098d = state;
        this.i = new ArrayList<>();
        this.f7099e = new WeakReference<>(rVar);
        this.f7103j = StateFlowKt.MutableStateFlow(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void a(InterfaceC0551q interfaceC0551q) {
        InterfaceC0550p e10;
        r rVar;
        ArrayList<Lifecycle.State> arrayList = this.i;
        e("addObserver");
        Lifecycle.State state = this.f7098d;
        Lifecycle.State state2 = Lifecycle.State.f6975a;
        if (state != state2) {
            state2 = Lifecycle.State.f6976b;
        }
        a aVar = new a();
        HashMap hashMap = C0556w.f7106a;
        boolean z10 = interfaceC0551q instanceof InterfaceC0550p;
        boolean z11 = interfaceC0551q instanceof DefaultLifecycleObserver;
        if (z10 && z11) {
            e10 = new C0539e((DefaultLifecycleObserver) interfaceC0551q, (InterfaceC0550p) interfaceC0551q);
        } else if (z11) {
            e10 = new C0539e((DefaultLifecycleObserver) interfaceC0551q, null);
        } else if (z10) {
            e10 = (InterfaceC0550p) interfaceC0551q;
        } else {
            Class<?> cls = interfaceC0551q.getClass();
            if (C0556w.b(cls) == 2) {
                List list = (List) C0556w.f7107b.get(cls);
                if (list.size() == 1) {
                    e10 = new O(C0556w.a((Constructor) list.get(0), interfaceC0551q));
                } else {
                    int size = list.size();
                    InterfaceC0542h[] interfaceC0542hArr = new InterfaceC0542h[size];
                    for (int i = 0; i < size; i++) {
                        interfaceC0542hArr[i] = C0556w.a((Constructor) list.get(i), interfaceC0551q);
                    }
                    e10 = new C0538d(interfaceC0542hArr);
                }
            } else {
                e10 = new E(interfaceC0551q);
            }
        }
        aVar.f7105b = e10;
        aVar.f7104a = state2;
        if (this.f7097c.b(interfaceC0551q, aVar) == null && (rVar = this.f7099e.get()) != null) {
            boolean z12 = this.f7100f != 0 || this.f7101g;
            Lifecycle.State d10 = d(interfaceC0551q);
            this.f7100f++;
            while (aVar.f7104a.compareTo(d10) < 0 && this.f7097c.f24325e.containsKey(interfaceC0551q)) {
                arrayList.add(aVar.f7104a);
                Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                Lifecycle.State state3 = aVar.f7104a;
                companion.getClass();
                int ordinal = state3.ordinal();
                Lifecycle.Event event = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : Lifecycle.Event.ON_RESUME : Lifecycle.Event.ON_START : Lifecycle.Event.ON_CREATE;
                if (event == null) {
                    throw new IllegalStateException("no event up from " + aVar.f7104a);
                }
                aVar.a(rVar, event);
                arrayList.remove(arrayList.size() - 1);
                d10 = d(interfaceC0551q);
            }
            if (!z12) {
                i();
            }
            this.f7100f--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State b() {
        return this.f7098d;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void c(InterfaceC0551q interfaceC0551q) {
        e("removeObserver");
        this.f7097c.c(interfaceC0551q);
    }

    public final Lifecycle.State d(InterfaceC0551q interfaceC0551q) {
        a aVar;
        HashMap<InterfaceC0551q, b.c<InterfaceC0551q, a>> hashMap = this.f7097c.f24325e;
        b.c<InterfaceC0551q, a> cVar = hashMap.containsKey(interfaceC0551q) ? hashMap.get(interfaceC0551q).f24333d : null;
        Lifecycle.State state = (cVar == null || (aVar = cVar.f24331b) == null) ? null : aVar.f7104a;
        ArrayList<Lifecycle.State> arrayList = this.i;
        Lifecycle.State state2 = arrayList.isEmpty() ^ true ? (Lifecycle.State) com.google.android.gms.measurement.internal.a.f(1, arrayList) : null;
        Lifecycle.State state3 = this.f7098d;
        if (state == null || state.compareTo(state3) >= 0) {
            state = state3;
        }
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    public final void e(String str) {
        if (this.f7096b) {
            C1058a.f().f24059b.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(androidx.camera.core.n.a("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void f(Lifecycle.Event event) {
        e("handleLifecycleEvent");
        g(event.a());
    }

    public final void g(Lifecycle.State state) {
        Lifecycle.State state2 = this.f7098d;
        if (state2 == state) {
            return;
        }
        Lifecycle.State state3 = Lifecycle.State.f6976b;
        Lifecycle.State state4 = Lifecycle.State.f6975a;
        if (state2 == state3 && state == state4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + state + ", but was " + this.f7098d + " in component " + this.f7099e.get()).toString());
        }
        this.f7098d = state;
        if (this.f7101g || this.f7100f != 0) {
            this.f7102h = true;
            return;
        }
        this.f7101g = true;
        i();
        this.f7101g = false;
        if (this.f7098d == state4) {
            this.f7097c = new C1084a<>();
        }
    }

    public final void h(Lifecycle.State state) {
        e("setCurrentState");
        g(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r11.f7102h = false;
        r11.f7103j.setValue(r11.f7098d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0553t.i():void");
    }
}
