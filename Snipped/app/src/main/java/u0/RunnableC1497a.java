package u0;

import m0.f;
import n0.e;
import pa.C1124b;

/* compiled from: CallbackWrapper.java */
/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1497a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1124b f30084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30085b;

    public RunnableC1497a(C1124b c1124b, int i) {
        this.f30084a = c1124b;
        this.f30085b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.c cVar = ((e.a) this.f30084a).f24075a;
        if (cVar != null) {
            cVar.b(this.f30085b);
        }
    }
}
