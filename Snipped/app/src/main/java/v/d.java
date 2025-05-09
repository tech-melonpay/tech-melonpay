package v;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.camera.core.DynamicRange;
import java.util.Collections;
import java.util.Set;
import pa.C1124b;
import v.b;

/* compiled from: DynamicRangesCompatBaseImpl.java */
/* loaded from: classes.dex */
public final class d implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f30489a = new b(new d());

    /* renamed from: b, reason: collision with root package name */
    public static final Set<DynamicRange> f30490b = Collections.singleton(DynamicRange.SDR);

    @Override // v.b.a
    public final Set<DynamicRange> a(DynamicRange dynamicRange) {
        C1124b.m(DynamicRange.SDR.equals(dynamicRange), "DynamicRange is not supported: " + dynamicRange);
        return f30490b;
    }

    @Override // v.b.a
    public final Set<DynamicRange> getSupportedDynamicRanges() {
        return f30490b;
    }

    @Override // v.b.a
    public final DynamicRangeProfiles unwrap() {
        return null;
    }
}
