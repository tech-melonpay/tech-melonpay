package j2;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import l2.InterfaceC0982b;

/* compiled from: ExecutionModule_ExecutorFactory.java */
/* renamed from: j2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0889h implements InterfaceC0982b<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    /* renamed from: j2.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0889h f22440a = new C0889h();
    }

    @Override // N9.a
    public final Object get() {
        return new ExecutorC0890i(Executors.newSingleThreadExecutor());
    }
}
