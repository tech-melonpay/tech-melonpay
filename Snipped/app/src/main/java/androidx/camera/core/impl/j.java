package androidx.camera.core.impl;

import androidx.camera.core.impl.UseCaseAttachState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements UseCaseAttachState.AttachStateFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5368a;

    public /* synthetic */ j(int i) {
        this.f5368a = i;
    }

    public static String a(String str, long j10) {
        return str + j10;
    }

    @Override // androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter
    public boolean filter(UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
        boolean attached;
        boolean attached2;
        boolean lambda$getActiveAndAttachedSessionConfigs$2;
        switch (this.f5368a) {
            case 0:
                attached = useCaseAttachInfo.getAttached();
                return attached;
            case 1:
                attached2 = useCaseAttachInfo.getAttached();
                return attached2;
            default:
                lambda$getActiveAndAttachedSessionConfigs$2 = UseCaseAttachState.lambda$getActiveAndAttachedSessionConfigs$2(useCaseAttachInfo);
                return lambda$getActiveAndAttachedSessionConfigs$2;
        }
    }
}
