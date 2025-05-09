package L;

import C.o;
import H.t;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.ResolutionValidatedEncoderProfilesProvider;
import java.util.HashMap;

/* compiled from: QualityValidatedEncoderProfilesProvider.java */
/* loaded from: classes.dex */
public final class b implements EncoderProfilesProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f2351d;

    /* renamed from: a, reason: collision with root package name */
    public final EncoderProfilesProvider f2352a;

    /* renamed from: b, reason: collision with root package name */
    public final CameraInfoInternal f2353b;

    /* renamed from: c, reason: collision with root package name */
    public final Quirks f2354c;

    static {
        HashMap hashMap = new HashMap();
        f2351d = hashMap;
        hashMap.put(1, o.f565f);
        hashMap.put(8, o.f563d);
        hashMap.put(6, o.f562c);
        hashMap.put(5, o.f561b);
        hashMap.put(4, o.f560a);
        hashMap.put(0, o.f564e);
    }

    public b(ResolutionValidatedEncoderProfilesProvider resolutionValidatedEncoderProfilesProvider, CameraInfoInternal cameraInfoInternal, Quirks quirks) {
        this.f2352a = resolutionValidatedEncoderProfilesProvider;
        this.f2353b = cameraInfoInternal;
        this.f2354c = quirks;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final EncoderProfilesProxy getAll(int i) {
        if (hasProfile(i)) {
            return this.f2352a.getAll(i);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean hasProfile(int i) {
        if (this.f2352a.hasProfile(i)) {
            o oVar = (o) f2351d.get(Integer.valueOf(i));
            if (oVar != null) {
                for (t tVar : this.f2354c.getAll(t.class)) {
                    if (tVar == null || !tVar.b(this.f2353b, oVar) || tVar.a()) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
