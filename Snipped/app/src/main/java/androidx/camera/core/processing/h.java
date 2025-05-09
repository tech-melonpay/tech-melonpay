package androidx.camera.core.processing;

import androidx.camera.core.impl.DeferrableSurface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeferrableSurface f5407b;

    public /* synthetic */ h(DeferrableSurface deferrableSurface, int i) {
        this.f5406a = i;
        this.f5407b = deferrableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5406a) {
            case 0:
                this.f5407b.close();
                break;
            default:
                this.f5407b.decrementUseCount();
                break;
        }
    }
}
