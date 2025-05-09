package v;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.camera.core.DynamicRange;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import pa.C1124b;
import v.b;

/* compiled from: DynamicRangesCompatApi33Impl.java */
/* loaded from: classes.dex */
public final class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final DynamicRangeProfiles f30488a;

    public c(Object obj) {
        this.f30488a = (DynamicRangeProfiles) obj;
    }

    public static Set<DynamicRange> b(Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator<Long> it = set.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            DynamicRange b9 = a.b(longValue);
            C1124b.p(b9, "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue);
            hashSet.add(b9);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // v.b.a
    public final Set<DynamicRange> a(DynamicRange dynamicRange) {
        Long a10 = a.a(dynamicRange, this.f30488a);
        C1124b.m(a10 != null, "DynamicRange is not supported: " + dynamicRange);
        return b(this.f30488a.getProfileCaptureRequestConstraints(a10.longValue()));
    }

    @Override // v.b.a
    public final Set<DynamicRange> getSupportedDynamicRanges() {
        return b(this.f30488a.getSupportedProfiles());
    }

    @Override // v.b.a
    public final DynamicRangeProfiles unwrap() {
        return this.f30488a;
    }
}
