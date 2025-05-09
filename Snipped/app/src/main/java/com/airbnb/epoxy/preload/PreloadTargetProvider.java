package com.airbnb.epoxy.preload;

import P9.n;
import P9.w;
import ca.InterfaceC0635a;
import com.airbnb.epoxy.preload.PreloadRequestHolder;
import ha.C0806e;
import ha.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: PreloadTargetProvider.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/airbnb/epoxy/preload/PreloadTargetProvider;", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "", "", "maxPreload", "Lkotlin/Function0;", "requestHolderFactory", "<init>", "(ILca/a;)V", "next$epoxy_adapter_release", "()Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "next", "LO9/p;", "clearAll", "()V", "Ljava/util/ArrayDeque;", "queue", "Ljava/util/ArrayDeque;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PreloadTargetProvider<P extends PreloadRequestHolder> {
    private final ArrayDeque<P> queue;

    public PreloadTargetProvider(int i, InterfaceC0635a<? extends P> interfaceC0635a) {
        C0806e V = h.V(0, i);
        ArrayList arrayList = new ArrayList(n.u(V, 10));
        Iterator<Integer> it = V.iterator();
        while (it.hasNext()) {
            ((w) it).a();
            arrayList.add(interfaceC0635a.invoke());
        }
        this.queue = new ArrayDeque<>(arrayList);
    }

    public final void clearAll() {
        Iterator<T> it = this.queue.iterator();
        while (it.hasNext()) {
            ((PreloadRequestHolder) it.next()).clear();
        }
    }

    public final P next$epoxy_adapter_release() {
        P poll = this.queue.poll();
        this.queue.offer(poll);
        poll.clear();
        return poll;
    }
}
