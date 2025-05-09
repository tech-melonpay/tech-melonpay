package p2;

import l2.InterfaceC0982b;

/* compiled from: EventStoreModule_StoreConfigFactory.java */
/* loaded from: classes.dex */
public final class g implements InterfaceC0982b<AbstractC1103d> {

    /* compiled from: EventStoreModule_StoreConfigFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f25598a = new g();
    }

    @Override // N9.a
    public final Object get() {
        C1100a c1100a = AbstractC1103d.f25595a;
        if (c1100a != null) {
            return c1100a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
