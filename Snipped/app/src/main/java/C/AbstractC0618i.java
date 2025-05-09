package c;

import O9.p;
import ca.InterfaceC0635a;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: OnBackPressedCallback.kt */
/* renamed from: c.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0618i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8505a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<InterfaceC0612c> f8506b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0635a<p> f8507c;

    public AbstractC0618i(boolean z10) {
        this.f8505a = z10;
    }

    public abstract void b();

    public final void e(boolean z10) {
        this.f8505a = z10;
        InterfaceC0635a<p> interfaceC0635a = this.f8507c;
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
    }

    public void a() {
    }

    public void d() {
    }

    public void c(C0611b c0611b) {
    }
}
