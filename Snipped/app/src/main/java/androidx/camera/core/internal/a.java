package androidx.camera.core.internal;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.q;
import com.sumsub.sns.internal.core.domain.camera.CameraX;
import java.io.File;
import x0.InterfaceC1579a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1579a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5372c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f5370a = i;
        this.f5371b = obj;
        this.f5372c = obj2;
    }

    @Override // x0.InterfaceC1579a
    public final void accept(Object obj) {
        switch (this.f5370a) {
            case 0:
                CameraUseCaseAdapter.lambda$createExtraPreview$0((Surface) this.f5371b, (SurfaceTexture) this.f5372c, (SurfaceRequest.Result) obj);
                break;
            default:
                CameraX.a((CameraX) this.f5371b, (File) this.f5372c, (q) obj);
                break;
        }
    }
}
