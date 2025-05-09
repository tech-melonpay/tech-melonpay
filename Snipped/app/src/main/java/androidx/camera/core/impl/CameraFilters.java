package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class CameraFilters {
    public static final CameraFilter ANY;
    public static final CameraFilter NONE;

    static {
        final int i = 0;
        ANY = new CameraFilter() { // from class: androidx.camera.core.impl.b
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                List lambda$static$0;
                List lambda$static$1;
                switch (i) {
                    case 0:
                        lambda$static$0 = CameraFilters.lambda$static$0(list);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = CameraFilters.lambda$static$1(list);
                        return lambda$static$1;
                }
            }
        };
        final int i9 = 1;
        NONE = new CameraFilter() { // from class: androidx.camera.core.impl.b
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                List lambda$static$0;
                List lambda$static$1;
                switch (i9) {
                    case 0:
                        lambda$static$0 = CameraFilters.lambda$static$0(list);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = CameraFilters.lambda$static$1(list);
                        return lambda$static$1;
                }
            }
        };
    }

    private CameraFilters() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$static$1(List list) {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$static$0(List list) {
        return list;
    }
}
