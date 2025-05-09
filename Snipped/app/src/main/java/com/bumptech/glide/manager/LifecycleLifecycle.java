package com.bumptech.glide.manager;

import androidx.lifecycle.B;
import androidx.lifecycle.InterfaceC0551q;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import com.bumptech.glide.util.Util;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class LifecycleLifecycle implements Lifecycle, InterfaceC0551q {
    private final androidx.lifecycle.Lifecycle lifecycle;
    private final Set<LifecycleListener> lifecycleListeners = new HashSet();

    public LifecycleLifecycle(androidx.lifecycle.Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        lifecycle.a(this);
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void addListener(LifecycleListener lifecycleListener) {
        this.lifecycleListeners.add(lifecycleListener);
        if (this.lifecycle.b() == Lifecycle.State.f6975a) {
            lifecycleListener.onDestroy();
        } else if (this.lifecycle.b().a(Lifecycle.State.f6978d)) {
            lifecycleListener.onStart();
        } else {
            lifecycleListener.onStop();
        }
    }

    @B(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(r rVar) {
        Iterator it = Util.getSnapshot(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onDestroy();
        }
        rVar.getLifecycle().c(this);
    }

    @B(Lifecycle.Event.ON_START)
    public void onStart(r rVar) {
        Iterator it = Util.getSnapshot(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStart();
        }
    }

    @B(Lifecycle.Event.ON_STOP)
    public void onStop(r rVar) {
        Iterator it = Util.getSnapshot(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStop();
        }
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void removeListener(LifecycleListener lifecycleListener) {
        this.lifecycleListeners.remove(lifecycleListener);
    }
}
