package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import pa.C1124b;
import t.C1262n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements CameraFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5352b;

    public /* synthetic */ c(Object obj, int i) {
        this.f5351a = i;
        this.f5352b = obj;
    }

    @Override // androidx.camera.core.CameraFilter
    public final List filter(List list) {
        List lambda$getCameraSelector$0;
        String str;
        CameraInfo cameraInfo;
        CameraInfoInternal implementation;
        switch (this.f5351a) {
            case 0:
                lambda$getCameraSelector$0 = ((CameraInfoInternal) this.f5352b).lambda$getCameraSelector$0(list);
                return lambda$getCameraSelector$0;
            default:
                Iterator it = list.iterator();
                do {
                    boolean hasNext = it.hasNext();
                    str = (String) this.f5352b;
                    if (!hasNext) {
                        throw new IllegalArgumentException(s3.b.j("No camera can be find for id: ", str));
                    }
                    cameraInfo = (CameraInfo) it.next();
                    implementation = ((CameraInfoInternal) cameraInfo).getImplementation();
                    C1124b.m(implementation instanceof C1262n, "CameraInfo doesn't contain Camera2 implementation.");
                } while (!str.equals(((C1262n) implementation).f27306c.f31212a.f27304a));
                return Collections.singletonList(cameraInfo);
        }
    }
}
