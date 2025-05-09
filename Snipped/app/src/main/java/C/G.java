package C;

import androidx.camera.core.UseCase;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.streamsharing.StreamSharing;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class G implements SessionConfig.ErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f511b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StreamSpec f512c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UseCase f513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UseCaseConfig f514e;

    public /* synthetic */ G(UseCase useCase, String str, UseCaseConfig useCaseConfig, StreamSpec streamSpec, int i) {
        this.f510a = i;
        this.f513d = useCase;
        this.f511b = str;
        this.f514e = useCaseConfig;
        this.f512c = streamSpec;
    }

    @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
    public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        switch (this.f510a) {
            case 0:
                ((androidx.camera.video.n) this.f513d).g(this.f511b, (D.a) this.f514e, this.f512c);
                break;
            default:
                ((StreamSharing) this.f513d).lambda$addCameraErrorListener$1(this.f511b, this.f514e, this.f512c, sessionConfig, sessionError);
                break;
        }
    }
}
