package D6;

import a3.InterfaceFutureC0509a;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageWriter;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.compat.ImageWriterCompat;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.luminary.business.presentation.entity.account.AccountDetailsUI;
import com.luminary.business.presentation.ui.fragments.accountdetails.AccountDetailsController;
import j2.AbstractC0892k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import q2.InterfaceC1129a;
import s6.C1217f;
import t.C1257i;
import t.r;
import t.s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements OnModelBoundListener, InterfaceC1129a.InterfaceC0457a, AsyncFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f924b;
    public final /* synthetic */ Object i;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f924b = obj;
        this.i = obj2;
        this.f923a = i;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public InterfaceFutureC0509a apply(Object obj) {
        ImageProxy imageProxy;
        r.c cVar = (r.c) this.f924b;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((List) this.i).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C1257i c1257i = cVar.f27355c;
            if (!hasNext) {
                c1257i.f27248e.onCameraControlCaptureRequests(arrayList2);
                return Futures.allAsList(arrayList);
            }
            CaptureConfig captureConfig = (CaptureConfig) it.next();
            CaptureConfig.Builder from = CaptureConfig.Builder.from(captureConfig);
            CameraCaptureResult cameraCaptureResult = null;
            if (captureConfig.getTemplateType() == 5) {
                s0 s0Var = c1257i.f27253k;
                if (!s0Var.f27378d && !s0Var.f27377c) {
                    try {
                        imageProxy = s0Var.f27376b.dequeue();
                    } catch (NoSuchElementException unused) {
                        Logger.e("ZslControlImpl", "dequeueImageFromBuffer no such element");
                        imageProxy = null;
                    }
                    if (imageProxy != null) {
                        s0 s0Var2 = c1257i.f27253k;
                        s0Var2.getClass();
                        Image image = imageProxy.getImage();
                        ImageWriter imageWriter = s0Var2.f27383j;
                        if (imageWriter != null && image != null) {
                            try {
                                ImageWriterCompat.queueInputImage(imageWriter, image);
                                cameraCaptureResult = CameraCaptureResults.retrieveCameraCaptureResult(imageProxy.getImageInfo());
                            } catch (IllegalStateException e10) {
                                Logger.e("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e10.getMessage());
                            }
                        }
                    }
                }
            }
            if (cameraCaptureResult != null) {
                from.setCameraCaptureResult(cameraCaptureResult);
            } else {
                int i = (cVar.f27353a != 3 || cVar.f27357e) ? (captureConfig.getTemplateType() == -1 || captureConfig.getTemplateType() == 5) ? 2 : -1 : 4;
                if (i != -1) {
                    from.setTemplateType(i);
                }
            }
            x.b bVar = cVar.f27356d;
            if (bVar.f30881b && this.f923a == 0 && bVar.f30880a) {
                MutableOptionsBundle create = MutableOptionsBundle.create();
                create.insertOption(s.a.a(CaptureRequest.CONTROL_AE_MODE), 3);
                from.addImplementationOptions(new s.a(OptionsBundle.from(create)));
            }
            arrayList.add(CallbackToFutureAdapter.a(new B.e(8, cVar, from)));
            arrayList2.add(from.build());
        }
    }

    @Override // q2.InterfaceC1129a.InterfaceC0457a
    public Object execute() {
        ((o2.c) this.f924b).f24350d.b((AbstractC0892k) this.i, this.f923a + 1);
        return null;
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void onModelBound(EpoxyModel epoxyModel, Object obj, int i) {
        AccountDetailsController.buildModels$lambda$2$lambda$1$lambda$0((AccountDetailsController) this.f924b, this.f923a, (AccountDetailsUI) this.i, (C1217f) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
    }

    public /* synthetic */ a(AccountDetailsController accountDetailsController, int i, AccountDetailsUI accountDetailsUI) {
        this.f924b = accountDetailsController;
        this.f923a = i;
        this.i = accountDetailsUI;
    }
}
