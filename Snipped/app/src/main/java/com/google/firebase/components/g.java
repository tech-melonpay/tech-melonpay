package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10289a;

    public /* synthetic */ g(int i) {
        this.f10289a = i;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        Object lambda$static$1;
        switch (this.f10289a) {
            case 0:
                lambda$static$1 = OptionalProvider.lambda$static$1();
                return lambda$static$1;
            default:
                return Collections.emptySet();
        }
    }
}
