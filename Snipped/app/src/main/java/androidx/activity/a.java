package androidx.activity;

import O9.p;
import P9.h;
import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.InterfaceC0550p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import c.AbstractC0618i;
import c.C0611b;
import c.InterfaceC0612c;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.f;
import x0.InterfaceC1579a;

/* compiled from: OnBackPressedDispatcher.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f4555a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1579a<Boolean> f4556b;

    /* renamed from: c, reason: collision with root package name */
    public final h<AbstractC0618i> f4557c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0618i f4558d;

    /* renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f4559e;

    /* renamed from: f, reason: collision with root package name */
    public OnBackInvokedDispatcher f4560f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4561g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4562h;

    /* compiled from: OnBackPressedDispatcher.kt */
    /* renamed from: androidx.activity.a$a, reason: collision with other inner class name */
    public static final class C0058a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0058a f4563a = new C0058a();

        public final OnBackInvokedCallback a(InterfaceC0635a<p> interfaceC0635a) {
            return new L2.d(interfaceC0635a, 1);
        }

        public final void b(Object obj, int i, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        public final void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4564a = new b();

        /* compiled from: OnBackPressedDispatcher.kt */
        /* renamed from: androidx.activity.a$b$a, reason: collision with other inner class name */
        public static final class C0059a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC0646l<C0611b, p> f4565a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC0646l<C0611b, p> f4566b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC0635a<p> f4567c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC0635a<p> f4568d;

            /* JADX WARN: Multi-variable type inference failed */
            public C0059a(InterfaceC0646l<? super C0611b, p> interfaceC0646l, InterfaceC0646l<? super C0611b, p> interfaceC0646l2, InterfaceC0635a<p> interfaceC0635a, InterfaceC0635a<p> interfaceC0635a2) {
                this.f4565a = interfaceC0646l;
                this.f4566b = interfaceC0646l2;
                this.f4567c = interfaceC0635a;
                this.f4568d = interfaceC0635a2;
            }

            public final void onBackCancelled() {
                this.f4568d.invoke();
            }

            public final void onBackInvoked() {
                this.f4567c.invoke();
            }

            public final void onBackProgressed(BackEvent backEvent) {
                this.f4566b.invoke(new C0611b(backEvent));
            }

            public final void onBackStarted(BackEvent backEvent) {
                this.f4565a.invoke(new C0611b(backEvent));
            }
        }

        public final OnBackInvokedCallback a(InterfaceC0646l<? super C0611b, p> interfaceC0646l, InterfaceC0646l<? super C0611b, p> interfaceC0646l2, InterfaceC0635a<p> interfaceC0635a, InterfaceC0635a<p> interfaceC0635a2) {
            return new C0059a(interfaceC0646l, interfaceC0646l2, interfaceC0635a, interfaceC0635a2);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    public final class c implements InterfaceC0550p, InterfaceC0612c {

        /* renamed from: a, reason: collision with root package name */
        public final Lifecycle f4569a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC0618i f4570b;

        /* renamed from: c, reason: collision with root package name */
        public d f4571c;

        public c(Lifecycle lifecycle, FragmentManager.b bVar) {
            this.f4569a = lifecycle;
            this.f4570b = bVar;
            lifecycle.a(this);
        }

        @Override // c.InterfaceC0612c
        public final void cancel() {
            this.f4569a.c(this);
            this.f4570b.f8506b.remove(this);
            d dVar = this.f4571c;
            if (dVar != null) {
                dVar.cancel();
            }
            this.f4571c = null;
        }

        @Override // androidx.lifecycle.InterfaceC0550p
        public final void d(r rVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.f4571c = a.this.b(this.f4570b);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                d dVar = this.f4571c;
                if (dVar != null) {
                    dVar.cancel();
                }
            }
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    public final class d implements InterfaceC0612c {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC0618i f4573a;

        public d(AbstractC0618i abstractC0618i) {
            this.f4573a = abstractC0618i;
        }

        @Override // c.InterfaceC0612c
        public final void cancel() {
            a aVar = a.this;
            h<AbstractC0618i> hVar = aVar.f4557c;
            AbstractC0618i abstractC0618i = this.f4573a;
            hVar.remove(abstractC0618i);
            if (f.b(aVar.f4558d, abstractC0618i)) {
                abstractC0618i.a();
                aVar.f4558d = null;
            }
            abstractC0618i.f8506b.remove(this);
            InterfaceC0635a<p> interfaceC0635a = abstractC0618i.f8507c;
            if (interfaceC0635a != null) {
                interfaceC0635a.invoke();
            }
            abstractC0618i.f8507c = null;
        }
    }

    public a(Runnable runnable) {
        this.f4555a = runnable;
        this.f4556b = null;
        this.f4557c = new h<>();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f4559e = i >= 34 ? b.f4564a.a(new InterfaceC0646l<C0611b, p>() { // from class: androidx.activity.OnBackPressedDispatcher$1
                {
                    super(1);
                }

                @Override // ca.InterfaceC0646l
                public final p invoke(C0611b c0611b) {
                    AbstractC0618i abstractC0618i;
                    a aVar = a.this;
                    h<AbstractC0618i> hVar = aVar.f4557c;
                    ListIterator<AbstractC0618i> listIterator = hVar.listIterator(hVar.a());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            abstractC0618i = null;
                            break;
                        }
                        abstractC0618i = listIterator.previous();
                        if (abstractC0618i.f8505a) {
                            break;
                        }
                    }
                    AbstractC0618i abstractC0618i2 = abstractC0618i;
                    if (aVar.f4558d != null) {
                        aVar.c();
                    }
                    aVar.f4558d = abstractC0618i2;
                    if (abstractC0618i2 != null) {
                        abstractC0618i2.d();
                    }
                    return p.f3034a;
                }
            }, new InterfaceC0646l<C0611b, p>() { // from class: androidx.activity.OnBackPressedDispatcher$2
                {
                    super(1);
                }

                @Override // ca.InterfaceC0646l
                public final p invoke(C0611b c0611b) {
                    AbstractC0618i abstractC0618i;
                    C0611b c0611b2 = c0611b;
                    a aVar = a.this;
                    AbstractC0618i abstractC0618i2 = aVar.f4558d;
                    if (abstractC0618i2 == null) {
                        h<AbstractC0618i> hVar = aVar.f4557c;
                        ListIterator<AbstractC0618i> listIterator = hVar.listIterator(hVar.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                abstractC0618i = null;
                                break;
                            }
                            abstractC0618i = listIterator.previous();
                            if (abstractC0618i.f8505a) {
                                break;
                            }
                        }
                        abstractC0618i2 = abstractC0618i;
                    }
                    if (abstractC0618i2 != null) {
                        abstractC0618i2.c(c0611b2);
                    }
                    return p.f3034a;
                }
            }, new InterfaceC0635a<p>() { // from class: androidx.activity.OnBackPressedDispatcher$3
                {
                    super(0);
                }

                @Override // ca.InterfaceC0635a
                public final p invoke() {
                    a.this.d();
                    return p.f3034a;
                }
            }, new InterfaceC0635a<p>() { // from class: androidx.activity.OnBackPressedDispatcher$4
                {
                    super(0);
                }

                @Override // ca.InterfaceC0635a
                public final p invoke() {
                    a.this.c();
                    return p.f3034a;
                }
            }) : C0058a.f4563a.a(new InterfaceC0635a<p>() { // from class: androidx.activity.OnBackPressedDispatcher$5
                {
                    super(0);
                }

                @Override // ca.InterfaceC0635a
                public final p invoke() {
                    a.this.d();
                    return p.f3034a;
                }
            });
        }
    }

    public final void a(r rVar, FragmentManager.b bVar) {
        Lifecycle lifecycle = rVar.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.f6975a) {
            return;
        }
        bVar.f8506b.add(new c(lifecycle, bVar));
        f();
        bVar.f8507c = new OnBackPressedDispatcher$addCallback$1(0, this, a.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    public final d b(AbstractC0618i abstractC0618i) {
        this.f4557c.addLast(abstractC0618i);
        d dVar = new d(abstractC0618i);
        abstractC0618i.f8506b.add(dVar);
        f();
        abstractC0618i.f8507c = new OnBackPressedDispatcher$addCancellableCallback$1(0, this, a.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        return dVar;
    }

    public final void c() {
        AbstractC0618i abstractC0618i;
        AbstractC0618i abstractC0618i2 = this.f4558d;
        if (abstractC0618i2 == null) {
            h<AbstractC0618i> hVar = this.f4557c;
            ListIterator<AbstractC0618i> listIterator = hVar.listIterator(hVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC0618i = null;
                    break;
                } else {
                    abstractC0618i = listIterator.previous();
                    if (abstractC0618i.f8505a) {
                        break;
                    }
                }
            }
            abstractC0618i2 = abstractC0618i;
        }
        this.f4558d = null;
        if (abstractC0618i2 != null) {
            abstractC0618i2.a();
        }
    }

    public final void d() {
        AbstractC0618i abstractC0618i;
        AbstractC0618i abstractC0618i2 = this.f4558d;
        if (abstractC0618i2 == null) {
            h<AbstractC0618i> hVar = this.f4557c;
            ListIterator<AbstractC0618i> listIterator = hVar.listIterator(hVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC0618i = null;
                    break;
                } else {
                    abstractC0618i = listIterator.previous();
                    if (abstractC0618i.f8505a) {
                        break;
                    }
                }
            }
            abstractC0618i2 = abstractC0618i;
        }
        this.f4558d = null;
        if (abstractC0618i2 != null) {
            abstractC0618i2.b();
            return;
        }
        Runnable runnable = this.f4555a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f4560f;
        OnBackInvokedCallback onBackInvokedCallback = this.f4559e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0058a c0058a = C0058a.f4563a;
        if (z10 && !this.f4561g) {
            c0058a.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f4561g = true;
        } else {
            if (z10 || !this.f4561g) {
                return;
            }
            c0058a.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f4561g = false;
        }
    }

    public final void f() {
        boolean z10 = this.f4562h;
        h<AbstractC0618i> hVar = this.f4557c;
        boolean z11 = false;
        if (!(hVar instanceof Collection) || !hVar.isEmpty()) {
            Iterator<AbstractC0618i> it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f8505a) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f4562h = z11;
        if (z11 != z10) {
            InterfaceC1579a<Boolean> interfaceC1579a = this.f4556b;
            if (interfaceC1579a != null) {
                interfaceC1579a.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                e(z11);
            }
        }
    }

    public a() {
        this(null);
    }
}
