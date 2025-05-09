package com.google.firebase.components;

import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentRegistrar f10283b;

    public /* synthetic */ c(ComponentRegistrar componentRegistrar, int i) {
        this.f10282a = i;
        this.f10283b = componentRegistrar;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        ComponentRegistrar lambda$toProviders$1;
        ComponentRegistrar lambda$addComponentRegistrar$0;
        switch (this.f10282a) {
            case 0:
                lambda$toProviders$1 = ComponentRuntime.lambda$toProviders$1(this.f10283b);
                return lambda$toProviders$1;
            default:
                lambda$addComponentRegistrar$0 = ComponentRuntime.Builder.lambda$addComponentRegistrar$0(this.f10283b);
                return lambda$addComponentRegistrar$0;
        }
    }
}
