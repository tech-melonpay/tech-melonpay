package org.koin.core.instance;

import Fa.h;
import O9.p;
import ca.InterfaceC0635a;
import db.b;

/* compiled from: SingleInstanceFactory.kt */
/* loaded from: classes3.dex */
public final class SingleInstanceFactory<T> extends b<T> {

    /* renamed from: b, reason: collision with root package name */
    public T f25551b;

    public SingleInstanceFactory() {
        throw null;
    }

    @Override // db.b
    public final T a(h hVar) {
        T t3 = this.f25551b;
        if (t3 == null) {
            return (T) super.a(hVar);
        }
        if (t3 != null) {
            return t3;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }

    @Override // db.b
    public final T b(final h hVar) {
        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a<p>(this) { // from class: org.koin.core.instance.SingleInstanceFactory$get$1

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ SingleInstanceFactory<Object> f25552l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f25552l = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
            @Override // ca.InterfaceC0635a
            public final p invoke() {
                SingleInstanceFactory<Object> singleInstanceFactory = this.f25552l;
                if (singleInstanceFactory.f25551b == null) {
                    singleInstanceFactory.f25551b = singleInstanceFactory.a(hVar);
                }
                return p.f3034a;
            }
        };
        synchronized (this) {
            interfaceC0635a.invoke();
        }
        T t3 = this.f25551b;
        if (t3 != null) {
            return t3;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }
}
