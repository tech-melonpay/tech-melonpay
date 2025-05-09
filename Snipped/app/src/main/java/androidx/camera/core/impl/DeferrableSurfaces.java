package androidx.camera.core.impl;

import a3.InterfaceFutureC0509a;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class DeferrableSurfaces {
    private DeferrableSurfaces() {
    }

    public static void decrementAll(List<DeferrableSurface> list) {
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().decrementUseCount();
        }
    }

    public static void incrementAll(List<DeferrableSurface> list) {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                list.get(i).incrementUseCount();
                i++;
            } catch (DeferrableSurface.SurfaceClosedException e10) {
                for (int i9 = i - 1; i9 >= 0; i9--) {
                    list.get(i9).decrementUseCount();
                }
                throw e10;
            }
        } while (i < list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$surfaceListWithTimeout$0(InterfaceFutureC0509a interfaceFutureC0509a, CallbackToFutureAdapter.a aVar, long j10) {
        if (interfaceFutureC0509a.isDone()) {
            return;
        }
        aVar.c(new TimeoutException(j.a("Cannot complete surfaceList within ", j10)));
        interfaceFutureC0509a.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$surfaceListWithTimeout$1(Executor executor, final InterfaceFutureC0509a interfaceFutureC0509a, final CallbackToFutureAdapter.a aVar, final long j10) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.impl.f
            @Override // java.lang.Runnable
            public final void run() {
                DeferrableSurfaces.lambda$surfaceListWithTimeout$0(InterfaceFutureC0509a.this, aVar, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$surfaceListWithTimeout$3(List list, ScheduledExecutorService scheduledExecutorService, Executor executor, long j10, final boolean z10, final CallbackToFutureAdapter.a aVar) {
        InterfaceFutureC0509a successfulAsList = Futures.successfulAsList(list);
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new androidx.camera.core.f(executor, successfulAsList, aVar, j10), j10, TimeUnit.MILLISECONDS);
        aVar.a(new B2.d(successfulAsList, 21), executor);
        Futures.addCallback(successfulAsList, new FutureCallback<List<Surface>>() { // from class: androidx.camera.core.impl.DeferrableSurfaces.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                aVar.b(Collections.unmodifiableList(Collections.emptyList()));
                schedule.cancel(true);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(List<Surface> list2) {
                ArrayList arrayList = new ArrayList(list2);
                if (z10) {
                    arrayList.removeAll(Collections.singleton(null));
                }
                aVar.b(arrayList);
                schedule.cancel(true);
            }
        }, executor);
        return "surfaceList";
    }

    public static InterfaceFutureC0509a<List<Surface>> surfaceListWithTimeout(Collection<DeferrableSurface> collection, final boolean z10, final long j10, final Executor executor, final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Futures.nonCancellationPropagating(it.next().getSurface()));
        }
        return CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: androidx.camera.core.impl.e
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
                Object lambda$surfaceListWithTimeout$3;
                lambda$surfaceListWithTimeout$3 = DeferrableSurfaces.lambda$surfaceListWithTimeout$3(arrayList, scheduledExecutorService, executor, j10, z10, aVar);
                return lambda$surfaceListWithTimeout$3;
            }
        });
    }

    public static boolean tryIncrementAll(List<DeferrableSurface> list) {
        try {
            incrementAll(list);
            return true;
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            return false;
        }
    }
}
