package j0;

import j0.C0876e;

/* compiled from: ActivityRecreator.java */
/* renamed from: j0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0874c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0876e.a f22245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22246b;

    public RunnableC0874c(C0876e.a aVar, Object obj) {
        this.f22245a = aVar;
        this.f22246b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22245a.f22256a = this.f22246b;
    }
}
