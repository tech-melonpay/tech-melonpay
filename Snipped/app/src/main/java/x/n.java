package x;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import java.util.ArrayList;
import java.util.Iterator;
import w.F;

/* compiled from: TorchStateReset.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30894a;

    public n() {
        this.f30894a = w.k.f30775a.get(F.class) != null;
    }

    public static CaptureConfig a(CaptureConfig captureConfig) {
        CaptureConfig.Builder builder = new CaptureConfig.Builder();
        builder.setTemplateType(captureConfig.getTemplateType());
        Iterator<DeferrableSurface> it = captureConfig.getSurfaces().iterator();
        while (it.hasNext()) {
            builder.addSurface(it.next());
        }
        builder.addImplementationOptions(captureConfig.getImplementationOptions());
        MutableOptionsBundle create = MutableOptionsBundle.create();
        create.insertOption(s.a.a(CaptureRequest.FLASH_MODE), 0);
        builder.addImplementationOptions(new s.a(OptionsBundle.from(create)));
        return builder.build();
    }

    public final boolean b(ArrayList arrayList, boolean z10) {
        if (!this.f30894a || !z10) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
