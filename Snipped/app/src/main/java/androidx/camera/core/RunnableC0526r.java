package androidx.camera.core;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageSaver;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.camera.core.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0526r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5427c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5429e;

    public /* synthetic */ RunnableC0526r(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f5425a = i;
        this.f5426b = obj;
        this.f5427c = obj2;
        this.f5428d = obj3;
        this.f5429e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5425a) {
            case 0:
                ((ImageSaver) this.f5426b).lambda$postError$2((ImageSaver.SaveError) this.f5427c, (String) this.f5428d, (Throwable) this.f5429e);
                break;
            default:
                ((ImageCapture) this.f5426b).lambda$takePicture$2((ImageCapture.OutputFileOptions) this.f5427c, (Executor) this.f5428d, (ImageCapture.OnImageSavedCallback) this.f5429e);
                break;
        }
    }
}
