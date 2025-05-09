package w;

import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.quirk.ProfileResolutionQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: CamcorderProfileResolutionQuirk.java */
/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1557e implements ProfileResolutionQuirk {

    /* renamed from: a, reason: collision with root package name */
    public final u.A f30771a;

    /* renamed from: b, reason: collision with root package name */
    public List<Size> f30772b = null;

    public C1557e(u.n nVar) {
        this.f30771a = nVar.b();
    }

    @Override // androidx.camera.core.impl.quirk.ProfileResolutionQuirk
    public final List<Size> getSupportedResolutions() {
        if (this.f30772b == null) {
            Size[] a10 = this.f30771a.a(34);
            this.f30772b = a10 != null ? Arrays.asList((Size[]) a10.clone()) : Collections.emptyList();
            Logger.d("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.f30772b);
        }
        return new ArrayList(this.f30772b);
    }
}
