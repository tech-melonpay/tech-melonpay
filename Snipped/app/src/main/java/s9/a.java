package S9;

import B6.g;
import O9.p;
import ca.InterfaceC0635a;

/* compiled from: Thread.kt */
/* loaded from: classes2.dex */
public final class a extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0635a<p> f3434a;

    public a(g gVar) {
        this.f3434a = gVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f3434a.invoke();
    }
}
