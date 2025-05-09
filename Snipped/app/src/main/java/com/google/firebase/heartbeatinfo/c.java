package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.UserAgentPublisher;
import g2.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ComponentFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10295a;

    public /* synthetic */ c(int i) {
        this.f10295a = i;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        HeartBeatInfo lambda$component$4;
        FirebaseInstallationsApi lambda$getComponents$0;
        UserAgentPublisher lambda$component$0;
        f lambda$getComponents$02;
        switch (this.f10295a) {
            case 0:
                lambda$component$4 = DefaultHeartBeatInfo.lambda$component$4(componentContainer);
                return lambda$component$4;
            case 1:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
                return lambda$getComponents$0;
            case 2:
                lambda$component$0 = DefaultUserAgentPublisher.lambda$component$0(componentContainer);
                return lambda$component$0;
            default:
                lambda$getComponents$02 = TransportRegistrar.lambda$getComponents$0(componentContainer);
                return lambda$getComponents$02;
        }
    }
}
