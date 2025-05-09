package androidx.room;

import android.annotation.SuppressLint;
import androidx.room.InvalidationTracker;
import j9.AbstractC0907b;
import j9.AbstractC0909d;
import j9.InterfaceC0908c;
import j9.InterfaceC0910e;
import j9.i;
import j9.j;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import l9.InterfaceC0988a;
import o9.CallableC1094a;
import p9.C1120b;
import p9.C1121c;
import p9.C1122d;
import q9.C1140a;
import r9.C1161b;
import t9.C1492a;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class RxRoom {
    public static final Object NOTHING = new Object();

    @Deprecated
    public RxRoom() {
    }

    public static AbstractC0907b<Object> createFlowable(final RoomDatabase roomDatabase, final String... strArr) {
        new Object() { // from class: androidx.room.RxRoom.1
            public void subscribe(InterfaceC0908c<Object> interfaceC0908c) {
                final InvalidationTracker.Observer observer = new InvalidationTracker.Observer(strArr, interfaceC0908c) { // from class: androidx.room.RxRoom.1.1
                    final /* synthetic */ InterfaceC0908c val$emitter;

                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(Set<String> set) {
                        throw null;
                    }
                };
                if (!interfaceC0908c.isCancelled()) {
                    roomDatabase.getInvalidationTracker().addObserver(observer);
                    io.reactivex.disposables.a.a(new InterfaceC0988a() { // from class: androidx.room.RxRoom.1.2
                        public void run() {
                            roomDatabase.getInvalidationTracker().removeObserver(observer);
                        }
                    });
                    interfaceC0908c.a();
                }
                if (interfaceC0908c.isCancelled()) {
                    return;
                }
                interfaceC0908c.b();
            }
        };
        int i = AbstractC0907b.f22555a;
        return new n9.b();
    }

    public static j9.f<Object> createObservable(final RoomDatabase roomDatabase, final String... strArr) {
        new Object() { // from class: androidx.room.RxRoom.3
            public void subscribe(j9.g<Object> gVar) {
                final InvalidationTracker.Observer observer = new InvalidationTracker.Observer(strArr, gVar) { // from class: androidx.room.RxRoom.3.1
                    final /* synthetic */ j9.g val$emitter;

                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(Set<String> set) {
                        throw null;
                    }
                };
                roomDatabase.getInvalidationTracker().addObserver(observer);
                io.reactivex.disposables.a.a(new InterfaceC0988a() { // from class: androidx.room.RxRoom.3.2
                    public void run() {
                        roomDatabase.getInvalidationTracker().removeObserver(observer);
                    }
                });
                gVar.a();
                gVar.b();
            }
        };
        return new C1120b();
    }

    public static <T> i<T> createSingle(final Callable<? extends T> callable) {
        new Object() { // from class: androidx.room.RxRoom.5
            public void subscribe(j<T> jVar) {
                try {
                    callable.call();
                    jVar.a();
                } catch (EmptyResultSetException unused) {
                    jVar.b();
                }
            }
        };
        return new C1140a();
    }

    private static Executor getExecutor(RoomDatabase roomDatabase, boolean z10) {
        return z10 ? roomDatabase.getTransactionExecutor() : roomDatabase.getQueryExecutor();
    }

    @Deprecated
    public static <T> AbstractC0907b<T> createFlowable(RoomDatabase roomDatabase, String[] strArr, Callable<T> callable) {
        return createFlowable(roomDatabase, false, strArr, callable);
    }

    @Deprecated
    public static <T> j9.f<T> createObservable(RoomDatabase roomDatabase, String[] strArr, Callable<T> callable) {
        return createObservable(roomDatabase, false, strArr, callable);
    }

    public static <T> AbstractC0907b<T> createFlowable(RoomDatabase roomDatabase, boolean z10, String[] strArr, Callable<T> callable) {
        Executor executor = getExecutor(roomDatabase, z10);
        int i = C1492a.f29969a;
        new C1161b(executor);
        if (callable != null) {
            final CallableC1094a callableC1094a = new CallableC1094a(callable);
            AbstractC0907b<Object> createFlowable = createFlowable(roomDatabase, strArr);
            createFlowable.getClass();
            boolean z11 = createFlowable instanceof n9.b;
            n9.c cVar = new n9.c(new n9.e(createFlowable));
            j3.e.J(AbstractC0907b.f22555a, "bufferSize");
            n9.d dVar = new n9.d(cVar);
            new Object() { // from class: androidx.room.RxRoom.2
                /* renamed from: apply, reason: merged with bridge method [inline-methods] */
                public InterfaceC0910e<T> m2apply(Object obj) {
                    return AbstractC0909d.this;
                }
            };
            j3.e.J(Integer.MAX_VALUE, "maxConcurrency");
            return new n9.c(dVar);
        }
        throw new NullPointerException("callable is null");
    }

    public static <T> j9.f<T> createObservable(RoomDatabase roomDatabase, boolean z10, String[] strArr, Callable<T> callable) {
        Executor executor = getExecutor(roomDatabase, z10);
        int i = C1492a.f29969a;
        new C1161b(executor);
        if (callable != null) {
            final CallableC1094a callableC1094a = new CallableC1094a(callable);
            createObservable(roomDatabase, strArr).getClass();
            new C1121c();
            new C1121c();
            j3.e.J(AbstractC0907b.f22555a, "bufferSize");
            new C1122d();
            new Object() { // from class: androidx.room.RxRoom.4
                /* renamed from: apply, reason: merged with bridge method [inline-methods] */
                public InterfaceC0910e<T> m3apply(Object obj) {
                    return AbstractC0909d.this;
                }
            };
            return new C1121c();
        }
        throw new NullPointerException("callable is null");
    }
}
