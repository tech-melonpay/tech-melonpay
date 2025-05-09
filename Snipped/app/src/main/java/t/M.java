package t;

import android.hardware.camera2.CameraCharacteristics;
import android.text.TextUtils;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import pa.C1124b;

/* compiled from: DynamicRangeResolver.java */
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final u.n f27139a;

    /* renamed from: b, reason: collision with root package name */
    public final v.b f27140b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27141c;

    /* compiled from: DynamicRangeResolver.java */
    public static final class a {
        public static DynamicRange a(u.n nVar) {
            Long l10 = (Long) nVar.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l10 != null) {
                return v.a.b(l10.longValue());
            }
            return null;
        }
    }

    public M(u.n nVar) {
        this.f27139a = nVar;
        this.f27140b = v.b.a(nVar);
        int[] iArr = (int[]) nVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z10 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 18) {
                    z10 = true;
                    break;
                }
                i++;
            }
        }
        this.f27141c = z10;
    }

    public static boolean a(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        C1124b.q(dynamicRange2.isFullySpecified(), "Fully specified range is not actually fully specified.");
        if (dynamicRange.getEncoding() == 2 && dynamicRange2.getEncoding() == 1) {
            return false;
        }
        if (dynamicRange.getEncoding() == 2 || dynamicRange.getEncoding() == 0 || dynamicRange.getEncoding() == dynamicRange2.getEncoding()) {
            return dynamicRange.getBitDepth() == 0 || dynamicRange.getBitDepth() == dynamicRange2.getBitDepth();
        }
        return false;
    }

    public static boolean b(DynamicRange dynamicRange, DynamicRange dynamicRange2, HashSet hashSet) {
        if (hashSet.contains(dynamicRange2)) {
            return a(dynamicRange, dynamicRange2);
        }
        Logger.d("DynamicRangeResolver", "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + dynamicRange + "\nCandidate dynamic range:\n  " + dynamicRange2);
        return false;
    }

    public static DynamicRange c(DynamicRange dynamicRange, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (dynamicRange.getEncoding() == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            DynamicRange dynamicRange2 = (DynamicRange) it.next();
            C1124b.p(dynamicRange2, "Fully specified DynamicRange cannot be null.");
            int encoding = dynamicRange2.getEncoding();
            C1124b.q(dynamicRange2.isFullySpecified(), "Fully specified DynamicRange must have fully defined encoding.");
            if (encoding != 1 && b(dynamicRange, dynamicRange2, hashSet)) {
                return dynamicRange2;
            }
        }
        return null;
    }

    public static void d(HashSet hashSet, DynamicRange dynamicRange, v.b bVar) {
        C1124b.q(!hashSet.isEmpty(), "Cannot update already-empty constraints.");
        Set<DynamicRange> a10 = bVar.f30487a.a(dynamicRange);
        if (a10.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(a10);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + dynamicRange + "\nConstraints:\n  " + TextUtils.join("\n  ", a10) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }
}
