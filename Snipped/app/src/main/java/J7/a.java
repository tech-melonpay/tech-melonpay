package J7;

import a3.InterfaceFutureC0509a;
import android.hardware.camera2.TotalCaptureResult;
import android.view.View;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.CryptoAccountDetailsController;
import com.luminary.business.presentation.ui.fragments.crypto.exchange_list.ExchangeListController;
import com.luminary.business.presentation.ui.fragments.loans.history.LoansHistoryController;
import com.luminary.business.presentation.ui.fragments.newcard.NewCardListController;
import com.luminary.business.presentation.ui.fragments.payments.PaymentsController;
import com.luminary.business.presentation.ui.fragments.settings.SettingsController;
import s6.C1223l;
import s6.C1228q;
import s6.C1234x;
import s6.J;
import s6.W;
import s6.g0;
import t.O;
import t.r;
import z0.InterfaceC1640f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements OnModelBoundListener, InterfaceC1640f, AsyncFunction, CallbackToFutureAdapter.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2192b;
    public final /* synthetic */ Object i;

    public /* synthetic */ a(int i, int i9, Object obj) {
        this.f2191a = i9;
        this.i = obj;
        this.f2192b = i;
    }

    @Override // z0.InterfaceC1640f
    public boolean a(View view) {
        ((SideSheetBehavior) this.i).setState(this.f2192b);
        return true;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public InterfaceFutureC0509a apply(Object obj) {
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        r.c cVar = (r.c) this.i;
        cVar.getClass();
        if (r.b(totalCaptureResult, this.f2192b)) {
            cVar.f27358f = r.c.f27352j;
        }
        return cVar.f27360h.a(totalCaptureResult);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        O o10 = (O) this.i;
        o10.getClass();
        int i = this.f2192b;
        o10.f27146c.execute(new Z0.a(o10, aVar, i, 4));
        return "setExposureCompensationIndex[" + i + "]";
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void onModelBound(EpoxyModel epoxyModel, Object obj, int i) {
        switch (this.f2191a) {
            case 0:
                LoansHistoryController.buildModels$lambda$2$lambda$1$lambda$0((LoansHistoryController) this.i, this.f2192b, (J) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 1:
                NewCardListController.buildModels$lambda$2$lambda$1$lambda$0((NewCardListController) this.i, this.f2192b, (C1223l) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 2:
            default:
                ExchangeListController.buildModels$lambda$1$lambda$0((ExchangeListController) this.i, this.f2192b, (C1234x) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 3:
                PaymentsController.buildModels$lambda$2$lambda$1$lambda$0((PaymentsController) this.i, this.f2192b, (W) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 4:
                CryptoAccountDetailsController.buildModels$lambda$2$lambda$1$lambda$0((CryptoAccountDetailsController) this.i, this.f2192b, (C1228q) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 5:
                SettingsController.buildModels$lambda$2$lambda$1$lambda$0((SettingsController) this.i, this.f2192b, (g0) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
        }
    }
}
