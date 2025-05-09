package o2;

import android.content.Context;
import java.util.concurrent.Executor;
import l2.InterfaceC0982b;
import n2.C1062c;
import p2.InterfaceC1102c;
import q2.InterfaceC1129a;
import r2.b;

/* compiled from: Uploader_Factory.java */
/* loaded from: classes.dex */
public final class d implements InterfaceC0982b<c> {

    /* renamed from: a, reason: collision with root package name */
    public final N9.a<Context> f24354a;

    /* renamed from: b, reason: collision with root package name */
    public final N9.a<k2.d> f24355b;

    /* renamed from: c, reason: collision with root package name */
    public final N9.a<InterfaceC1102c> f24356c;

    /* renamed from: d, reason: collision with root package name */
    public final N9.a<f> f24357d;

    /* renamed from: e, reason: collision with root package name */
    public final N9.a<Executor> f24358e;

    /* renamed from: f, reason: collision with root package name */
    public final N9.a<InterfaceC1129a> f24359f;

    /* renamed from: g, reason: collision with root package name */
    public final N9.a<r2.a> f24360g;

    public d(N9.a aVar, N9.a aVar2, N9.a aVar3, C1062c c1062c, N9.a aVar4, N9.a aVar5) {
        r2.b bVar = b.a.f26146a;
        this.f24354a = aVar;
        this.f24355b = aVar2;
        this.f24356c = aVar3;
        this.f24357d = c1062c;
        this.f24358e = aVar4;
        this.f24359f = aVar5;
        this.f24360g = bVar;
    }

    @Override // N9.a
    public final Object get() {
        return new c(this.f24354a.get(), this.f24355b.get(), this.f24356c.get(), this.f24357d.get(), this.f24358e.get(), this.f24359f.get(), this.f24360g.get());
    }
}
