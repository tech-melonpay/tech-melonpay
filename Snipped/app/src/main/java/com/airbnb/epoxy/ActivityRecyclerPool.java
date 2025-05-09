package com.airbnb.epoxy;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: ActivityRecyclerPool.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/airbnb/epoxy/ActivityRecyclerPool;", "", "<init>", "()V", "Landroid/content/Context;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "(Landroid/content/Context;)Landroidx/lifecycle/Lifecycle;", "context", "Lkotlin/Function0;", "Landroidx/recyclerview/widget/RecyclerView$t;", "poolFactory", "Lcom/airbnb/epoxy/PoolReference;", "getPool", "(Landroid/content/Context;Lca/a;)Lcom/airbnb/epoxy/PoolReference;", "pool", "LO9/p;", "clearIfDestroyed", "(Lcom/airbnb/epoxy/PoolReference;)V", "Ljava/util/ArrayList;", "pools", "Ljava/util/ArrayList;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ActivityRecyclerPool {
    private final ArrayList<PoolReference> pools = new ArrayList<>(5);

    /* JADX WARN: Multi-variable type inference failed */
    private final Lifecycle lifecycle(Context context) {
        if (context instanceof r) {
            return ((r) context).getLifecycle();
        }
        if (context instanceof ContextWrapper) {
            return lifecycle(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final void clearIfDestroyed(PoolReference pool) {
        if (ActivityRecyclerPoolKt.isActivityDestroyed(pool.getContext())) {
            pool.getViewPool().clear();
            this.pools.remove(pool);
        }
    }

    public final PoolReference getPool(Context context, InterfaceC0635a<? extends RecyclerView.t> poolFactory) {
        Iterator<PoolReference> it = this.pools.iterator();
        PoolReference poolReference = null;
        while (it.hasNext()) {
            PoolReference next = it.next();
            if (next.getContext() == context) {
                if (poolReference != null) {
                    throw new IllegalStateException("A pool was already found");
                }
                poolReference = next;
            } else if (ActivityRecyclerPoolKt.isActivityDestroyed(next.getContext())) {
                next.getViewPool().clear();
                it.remove();
            }
        }
        if (poolReference == null) {
            poolReference = new PoolReference(context, poolFactory.invoke(), this);
            Lifecycle lifecycle = lifecycle(context);
            if (lifecycle != null) {
                lifecycle.a(poolReference);
            }
            this.pools.add(poolReference);
        }
        return poolReference;
    }
}
