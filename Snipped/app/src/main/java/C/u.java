package C;

import android.net.Uri;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoEncoderSession;
import androidx.camera.view.c;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import x0.InterfaceC1579a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements InterfaceC1579a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f579b;

    public /* synthetic */ u(Object obj, int i) {
        this.f578a = i;
        this.f579b = obj;
    }

    @Override // x0.InterfaceC1579a
    public final void accept(Object obj) {
        switch (this.f578a) {
            case 0:
                ((Recorder) this.f579b).f5469H = (Uri) obj;
                break;
            case 1:
                SurfaceRequest.Result result = (SurfaceRequest.Result) obj;
                VideoEncoderSession videoEncoderSession = (VideoEncoderSession) this.f579b;
                videoEncoderSession.getClass();
                Logger.d("VideoEncoderSession", "Surface can be closed: " + result.getSurface().hashCode());
                Surface surface = result.getSurface();
                if (surface != videoEncoderSession.f5553e) {
                    surface.release();
                    break;
                } else {
                    videoEncoderSession.f5553e = null;
                    videoEncoderSession.f5560m.b(videoEncoderSession.f5552d);
                    videoEncoderSession.a();
                    break;
                }
            case 2:
                Logger.d("SurfaceViewImpl", "Safe to release surface.");
                c.a aVar = (c.a) this.f579b;
                if (aVar != null) {
                    ((M.b) aVar).b();
                    break;
                }
                break;
            default:
                ((CallbackToFutureAdapter.a) this.f579b).b((SurfaceRequest.Result) obj);
                break;
        }
    }
}
