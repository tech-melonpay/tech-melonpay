package x;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Iterator;
import w.D;

/* compiled from: StillCaptureFlow.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30890a;

    public l() {
        this.f30890a = ((D) w.k.f30775a.get(D.class)) != null;
    }

    public final boolean a(ArrayList arrayList, boolean z10) {
        if (this.f30890a && z10) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (intValue == 2 || intValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
