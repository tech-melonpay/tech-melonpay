package org.koin.core;

import C.N;
import Fa.h;
import O9.p;
import P9.l;
import ca.InterfaceC0635a;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.koin.core.logger.Level;

/* compiled from: KoinApplication.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final h f25539a = new h(5);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25540b = true;

    public final void a() {
        final h hVar = this.f25539a;
        N n10 = (N) hVar.f1301d;
        ((Level) n10.f535b).compareTo(Level.f25555b);
        if (!n10.j(Level.f25554a)) {
            ((h) hVar.f1300c).d();
            return;
        }
        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a<p>() { // from class: org.koin.core.Koin$createEagerInstances$duration$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final p invoke() {
                ((h) h.this.f1300c).d();
                return p.f3034a;
            }
        };
        long nanoTime = System.nanoTime();
        interfaceC0635a.invoke();
        n10.f("eager instances created in " + Double.valueOf((System.nanoTime() - nanoTime) / 1000000.0d).doubleValue() + " ms");
    }

    public final void b(fb.a... aVarArr) {
        final List u6 = l.u(aVarArr);
        h hVar = this.f25539a;
        N n10 = (N) hVar.f1301d;
        Level level = Level.f25555b;
        if (!n10.j(level)) {
            hVar.e(u6, this.f25540b);
            return;
        }
        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a<p>() { // from class: org.koin.core.KoinApplication$modules$duration$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final p invoke() {
                a aVar = a.this;
                aVar.f25539a.e(u6, aVar.f25540b);
                return p.f3034a;
            }
        };
        System.nanoTime();
        interfaceC0635a.invoke();
        System.nanoTime();
        ((ConcurrentHashMap) ((h) hVar.f1300c).f1300c).size();
        ((Level) ((N) hVar.f1301d).f535b).compareTo(level);
    }
}
