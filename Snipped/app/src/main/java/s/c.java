package s;

import androidx.camera.core.impl.MultiValueSet;
import java.util.Arrays;

/* compiled from: CameraEventCallbacks.java */
/* loaded from: classes.dex */
public final class c extends MultiValueSet<b> {
    public static c a() {
        c cVar = new c();
        cVar.addAll(Arrays.asList(new b[0]));
        return cVar;
    }

    @Override // androidx.camera.core.impl.MultiValueSet
    /* renamed from: clone */
    public final MultiValueSet<b> mo0clone() {
        c a10 = a();
        a10.addAll(getAllItems());
        return a10;
    }
}
