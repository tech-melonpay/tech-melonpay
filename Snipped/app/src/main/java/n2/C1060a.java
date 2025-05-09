package n2;

import C.v;
import M.g;
import j2.C0882a;
import j2.C0884c;
import j2.o;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import k2.d;
import o2.f;
import p2.InterfaceC1102c;
import q2.InterfaceC1129a;

/* compiled from: DefaultScheduler.java */
/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1060a implements InterfaceC1061b {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f24087f = Logger.getLogger(o.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final f f24088a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f24089b;

    /* renamed from: c, reason: collision with root package name */
    public final d f24090c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1102c f24091d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1129a f24092e;

    public C1060a(Executor executor, d dVar, f fVar, InterfaceC1102c interfaceC1102c, InterfaceC1129a interfaceC1129a) {
        this.f24089b = executor;
        this.f24090c = dVar;
        this.f24088a = fVar;
        this.f24091d = interfaceC1102c;
        this.f24092e = interfaceC1129a;
    }

    @Override // n2.InterfaceC1061b
    public final void a(C0884c c0884c, C0882a c0882a, v vVar) {
        this.f24089b.execute(new g(this, c0884c, vVar, c0882a, 3));
    }
}
