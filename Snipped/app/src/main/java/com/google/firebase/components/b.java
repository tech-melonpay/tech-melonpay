package com.google.firebase.components;

import android.content.Context;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.google.firebase.inject.Provider;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10281b;

    public /* synthetic */ b(Object obj, int i) {
        this.f10280a = i;
        this.f10281b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        ComponentRegistrar instantiate;
        HeartBeatInfoStorage heartBeatInfoStorage;
        switch (this.f10280a) {
            case 0:
                instantiate = ComponentDiscovery.instantiate((String) this.f10281b);
                return instantiate;
            default:
                heartBeatInfoStorage = HeartBeatInfoStorage.getInstance((Context) this.f10281b);
                return heartBeatInfoStorage;
        }
    }
}
