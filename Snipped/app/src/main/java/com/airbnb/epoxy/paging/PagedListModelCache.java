package com.airbnb.epoxy.paging;

import O9.p;
import P9.w;
import android.os.Handler;
import android.util.Log;
import androidx.paging.a;
import androidx.paging.e;
import androidx.recyclerview.widget.C0565c;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.q;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import ha.h;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

/* compiled from: PagedListModelCache.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\t*\u0002&)\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BW\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\b2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u0017R0\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050 j\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0005`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R,\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100¨\u00061"}, d2 = {"Lcom/airbnb/epoxy/paging/PagedListModelCache;", "T", "", "Lkotlin/Function2;", "", "Lcom/airbnb/epoxy/EpoxyModel;", "modelBuilder", "Lkotlin/Function0;", "LO9/p;", "rebuildCallback", "Landroidx/recyclerview/widget/q$e;", "itemDiffCallback", "Ljava/util/concurrent/Executor;", "diffExecutor", "Landroid/os/Handler;", "modelBuildingHandler", "<init>", "(Lca/p;Lca/a;Landroid/support/v7/util/DiffUtil$ItemCallback;Ljava/util/concurrent/Executor;Landroid/os/Handler;)V", "pos", "getOrBuildModel", "(I)Lcom/airbnb/epoxy/EpoxyModel;", "position", "triggerLoadAround", "(I)V", "Landroidx/paging/e;", "pagedList", "submitList", "(Landroidx/paging/e;)V", "", "getModels", "()Ljava/util/List;", "loadAround", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "modelCache", "Ljava/util/ArrayList;", "lastPosition", "Ljava/lang/Integer;", "com/airbnb/epoxy/paging/PagedListModelCache$updateCallback$1", "updateCallback", "Lcom/airbnb/epoxy/paging/PagedListModelCache$updateCallback$1;", "com/airbnb/epoxy/paging/PagedListModelCache$asyncDiffer$1", "asyncDiffer", "Lcom/airbnb/epoxy/paging/PagedListModelCache$asyncDiffer$1;", "Lca/p;", "Lca/a;", "Landroidx/recyclerview/widget/q$e;", "Ljava/util/concurrent/Executor;", "Landroid/os/Handler;", "epoxy-paging_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class PagedListModelCache<T> {
    private final PagedListModelCache$asyncDiffer$1 asyncDiffer;
    private final Executor diffExecutor;
    private final q.e<T> itemDiffCallback;
    private Integer lastPosition;
    private final InterfaceC0650p<Integer, T, EpoxyModel<?>> modelBuilder;
    private final Handler modelBuildingHandler;
    private final ArrayList<EpoxyModel<?>> modelCache;
    private final InterfaceC0635a<p> rebuildCallback;
    private final PagedListModelCache$updateCallback$1 updateCallback;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.recyclerview.widget.D, com.airbnb.epoxy.paging.PagedListModelCache$updateCallback$1] */
    public PagedListModelCache(InterfaceC0650p<? super Integer, ? super T, ? extends EpoxyModel<?>> interfaceC0650p, InterfaceC0635a<p> interfaceC0635a, q.e<T> eVar, Executor executor, Handler handler) {
        this.modelBuilder = interfaceC0650p;
        this.rebuildCallback = interfaceC0635a;
        this.itemDiffCallback = eVar;
        this.diffExecutor = executor;
        this.modelBuildingHandler = handler;
        this.modelCache = new ArrayList<>();
        final ?? r22 = new D() { // from class: com.airbnb.epoxy.paging.PagedListModelCache$updateCallback$1
            @Override // androidx.recyclerview.widget.D
            public void onChanged(int position, int count, Object payload) {
                InterfaceC0635a interfaceC0635a2;
                ArrayList arrayList;
                Iterator<Integer> it = h.V(position, count + position).iterator();
                while (it.hasNext()) {
                    int a10 = ((w) it).a();
                    arrayList = PagedListModelCache.this.modelCache;
                    arrayList.set(a10, null);
                }
                interfaceC0635a2 = PagedListModelCache.this.rebuildCallback;
                interfaceC0635a2.invoke();
            }

            @Override // androidx.recyclerview.widget.D
            public void onInserted(int position, int count) {
                InterfaceC0635a interfaceC0635a2;
                ArrayList arrayList;
                Iterator<Integer> it = h.V(0, count).iterator();
                while (it.hasNext()) {
                    ((w) it).a();
                    arrayList = PagedListModelCache.this.modelCache;
                    arrayList.add(position, null);
                }
                interfaceC0635a2 = PagedListModelCache.this.rebuildCallback;
                interfaceC0635a2.invoke();
            }

            @Override // androidx.recyclerview.widget.D
            public void onMoved(int fromPosition, int toPosition) {
                ArrayList arrayList;
                ArrayList arrayList2;
                InterfaceC0635a interfaceC0635a2;
                arrayList = PagedListModelCache.this.modelCache;
                EpoxyModel epoxyModel = (EpoxyModel) arrayList.remove(fromPosition);
                arrayList2 = PagedListModelCache.this.modelCache;
                arrayList2.add(toPosition, epoxyModel);
                interfaceC0635a2 = PagedListModelCache.this.rebuildCallback;
                interfaceC0635a2.invoke();
            }

            @Override // androidx.recyclerview.widget.D
            public void onRemoved(int position, int count) {
                InterfaceC0635a interfaceC0635a2;
                ArrayList arrayList;
                Iterator<Integer> it = h.V(0, count).iterator();
                while (it.hasNext()) {
                    ((w) it).a();
                    arrayList = PagedListModelCache.this.modelCache;
                    arrayList.remove(position);
                }
                interfaceC0635a2 = PagedListModelCache.this.rebuildCallback;
                interfaceC0635a2.invoke();
            }
        };
        this.updateCallback = r22;
        executor = executor == null ? null : executor;
        Executor executor2 = new Executor() { // from class: com.airbnb.epoxy.paging.PagedListModelCache$$special$$inlined$also$lambda$1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Handler handler2;
                handler2 = PagedListModelCache.this.modelBuildingHandler;
                handler2.post(runnable);
            }
        };
        if (executor == null) {
            synchronized (C0565c.a.f7616a) {
                try {
                    if (C0565c.a.f7617b == null) {
                        C0565c.a.f7617b = Executors.newFixedThreadPool(2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            executor = C0565c.a.f7617b;
        }
        final C0565c c0565c = new C0565c(executor2, executor, eVar);
        this.asyncDiffer = new a<T>(r22, c0565c) { // from class: com.airbnb.epoxy.paging.PagedListModelCache$asyncDiffer$1
            {
                Handler handler2;
                handler2 = PagedListModelCache.this.modelBuildingHandler;
                if (!f.b(handler2, EpoxyController.defaultModelBuildingHandler)) {
                    try {
                        Field declaredField = a.class.getDeclaredField("mMainThreadExecutor");
                        declaredField.setAccessible(true);
                        declaredField.set(this, new Executor() { // from class: com.airbnb.epoxy.paging.PagedListModelCache$asyncDiffer$1.1
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                Handler handler3;
                                handler3 = PagedListModelCache.this.modelBuildingHandler;
                                handler3.post(runnable);
                            }
                        });
                    } catch (Throwable th2) {
                        Log.e("PagedListModelCache", "Failed to hijack update handler in AsyncPagedListDiffer.You can only build models on the main thread", th2);
                        throw new IllegalStateException("Failed to hijack update handler in AsyncPagedListDiffer.You can only build models on the main thread", th2);
                    }
                }
            }
        };
    }

    private final EpoxyModel<?> getOrBuildModel(int pos) {
        EpoxyModel<?> epoxyModel = this.modelCache.get(pos);
        if (epoxyModel != null) {
            return epoxyModel;
        }
        InterfaceC0650p<Integer, T, EpoxyModel<?>> interfaceC0650p = this.modelBuilder;
        Integer valueOf = Integer.valueOf(pos);
        getCurrentList();
        EpoxyModel<?> invoke = interfaceC0650p.invoke(valueOf, null);
        this.modelCache.set(pos, invoke);
        return invoke;
    }

    private final void triggerLoadAround(int position) {
        getCurrentList();
    }

    public final List<EpoxyModel<?>> getModels() {
        Iterator<Integer> it = h.V(0, this.modelCache.size()).iterator();
        while (it.hasNext()) {
            getOrBuildModel(((w) it).a());
        }
        Integer num = this.lastPosition;
        if (num != null) {
            triggerLoadAround(num.intValue());
        }
        ArrayList<EpoxyModel<?>> arrayList = this.modelCache;
        if (arrayList != null) {
            return arrayList;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.airbnb.epoxy.EpoxyModel<*>>");
    }

    public final void loadAround(int position) {
        triggerLoadAround(position);
        this.lastPosition = Integer.valueOf(position);
    }

    public final void submitList(e<T> pagedList) {
        submitList(pagedList);
    }

    public /* synthetic */ PagedListModelCache(InterfaceC0650p interfaceC0650p, InterfaceC0635a interfaceC0635a, q.e eVar, Executor executor, Handler handler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0650p, interfaceC0635a, eVar, (i & 8) != 0 ? null : executor, handler);
    }
}
