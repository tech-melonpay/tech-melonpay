package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.inject.Provider;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10288c;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f10286a = i;
        this.f10288c = obj;
        this.f10287b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10286a) {
            case 0:
                ((OptionalProvider) this.f10288c).set((Provider) this.f10287b);
                break;
            case 1:
                ((LazySet) this.f10288c).add((Provider) this.f10287b);
                break;
            default:
                EventBus.lambda$publish$0((Map.Entry) this.f10288c, (Event) this.f10287b);
                break;
        }
    }
}
