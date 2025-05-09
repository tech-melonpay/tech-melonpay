package com.airbnb.epoxy;

import android.content.Context;
import androidx.lifecycle.B;
import androidx.lifecycle.InterfaceC0551q;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: ActivityRecyclerPool.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/airbnb/epoxy/PoolReference;", "Landroidx/lifecycle/q;", "Landroid/content/Context;", "context", "Landroidx/recyclerview/widget/RecyclerView$t;", "viewPool", "Lcom/airbnb/epoxy/ActivityRecyclerPool;", "parent", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$t;Lcom/airbnb/epoxy/ActivityRecyclerPool;)V", "LO9/p;", "clearIfDestroyed", "()V", "onContextDestroyed", "Landroidx/recyclerview/widget/RecyclerView$t;", "getViewPool", "()Landroidx/recyclerview/widget/RecyclerView$t;", "Lcom/airbnb/epoxy/ActivityRecyclerPool;", "Ljava/lang/ref/WeakReference;", "contextReference", "Ljava/lang/ref/WeakReference;", "getContext", "()Landroid/content/Context;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PoolReference implements InterfaceC0551q {
    private final WeakReference<Context> contextReference;
    private final ActivityRecyclerPool parent;
    private final RecyclerView.t viewPool;

    public PoolReference(Context context, RecyclerView.t tVar, ActivityRecyclerPool activityRecyclerPool) {
        this.viewPool = tVar;
        this.parent = activityRecyclerPool;
        this.contextReference = new WeakReference<>(context);
    }

    public final void clearIfDestroyed() {
        this.parent.clearIfDestroyed(this);
    }

    public final Context getContext() {
        return this.contextReference.get();
    }

    public final RecyclerView.t getViewPool() {
        return this.viewPool;
    }

    @B(Lifecycle.Event.ON_DESTROY)
    public final void onContextDestroyed() {
        clearIfDestroyed();
    }
}
