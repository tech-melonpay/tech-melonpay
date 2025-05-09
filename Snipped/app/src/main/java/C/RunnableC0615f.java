package c;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.view.Window;
import androidx.camera.camera2.internal.ProcessingCaptureSession;
import androidx.camera.camera2.internal.o;
import androidx.camera.camera2.internal.p;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.ActivityC0533g;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.firebase.installations.FirebaseInstallations;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.CryptoAccountDetailsController;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.CryptoAccountDetailsFragment;
import com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.SellExternalAccountSelectFragment;
import com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.WithdrawCryptoFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment;
import com.luminary.business.presentation.ui.fragments.server_error.ServerErrorFragment;
import com.luminary.business.presentation.ui.fragments.settings.SettingsController;
import com.luminary.business.presentation.ui.fragments.settings.SettingsFragment;
import com.luminary.business.presentation.ui.fragments.transfer.TransferController;
import com.luminary.business.presentation.ui.fragments.transfer.TransferFragment;
import com.luminary.mobile.R;
import com.sumsub.sns.core.widget.SNSCommonBottomSheetView;
import com.sumsub.sns.core.widget.SNSErrorBottomSheetView;
import j0.C0876e;
import j0.RunnableC0874c;
import j0.RunnableC0875d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import k0.C0913a;
import t.i0;
import t.r;
import u.v;
import u9.C1531b;
import u9.m;
import w6.C1573a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: c.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0615f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8497b;

    public /* synthetic */ RunnableC0615f(Object obj, int i) {
        this.f8496a = i;
        this.f8497b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [androidx.camera.camera2.internal.o, androidx.camera.camera2.internal.p] */
    @Override // java.lang.Runnable
    public final void run() {
        String U02;
        Integer num;
        Object obj;
        Handler handler;
        C0876e.a aVar;
        Application application;
        String str;
        boolean z10 = true;
        Object obj2 = this.f8497b;
        switch (this.f8496a) {
            case 0:
                DialogC0616g.c((DialogC0616g) obj2);
                return;
            case 1:
                NewPaymentBankEmailFragment newPaymentBankEmailFragment = (NewPaymentBankEmailFragment) obj2;
                if (!newPaymentBankEmailFragment.isAdded() || (U02 = newPaymentBankEmailFragment.U0()) == null || (num = newPaymentBankEmailFragment.f12746u0) == null) {
                    return;
                }
                int intValue = num.intValue();
                b8.h W02 = newPaymentBankEmailFragment.W0();
                H7.c cVar = new H7.c(W02, U02, newPaymentBankEmailFragment.s0, intValue);
                W02.f423P0 = cVar;
                cVar.invoke();
                return;
            case 2:
                EpoxyRecyclerView.removeAdapterRunnable$lambda$0((EpoxyRecyclerView) obj2);
                return;
            case 3:
                ((FirebaseInstallations) obj2).lambda$getId$0();
                return;
            case 4:
                com.sumsub.sns.camera.photo.presentation.document.a.o((com.sumsub.sns.camera.photo.presentation.document.a) obj2);
                return;
            case 5:
                SNSCommonBottomSheetView.m40showCallback$lambda1((SNSCommonBottomSheetView) obj2);
                return;
            case 6:
                SNSErrorBottomSheetView.m51showCallback$lambda1((SNSErrorBottomSheetView) obj2);
                return;
            case 7:
                com.sumsub.sns.presentation.screen.preview.photo.mrtd.a.c((com.sumsub.sns.presentation.screen.preview.photo.mrtd.a) obj2);
                return;
            case 8:
                com.sumsub.sns.presentation.screen.preview.selfie.a.b((com.sumsub.sns.presentation.screen.preview.selfie.a) obj2);
                return;
            case 9:
                File[] fileArr = (File[]) obj2;
                if (fileArr == null) {
                    return;
                }
                for (File file : fileArr) {
                    D9.b.n(file);
                }
                return;
            case 10:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    Class<?> cls = C0876e.f22249a;
                    activity.recreate();
                    return;
                }
                Class<?> cls2 = C0876e.f22249a;
                if (i != 26 && i != 27) {
                    z10 = false;
                }
                Method method = C0876e.f22254f;
                if ((!z10 || method != null) && (C0876e.f22253e != null || C0876e.f22252d != null)) {
                    try {
                        Object obj3 = C0876e.f22251c.get(activity);
                        if (obj3 != null && (obj = C0876e.f22250b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            C0876e.a aVar2 = new C0876e.a(activity);
                            application2.registerActivityLifecycleCallbacks(aVar2);
                            Handler handler2 = C0876e.f22255g;
                            handler2.post(new RunnableC0874c(aVar2, obj3));
                            try {
                                if (i == 26 || i == 27) {
                                    ?? r16 = Boolean.FALSE;
                                    handler = handler2;
                                    handler2 = null;
                                    aVar = aVar2;
                                    aVar2 = null;
                                    application = application2;
                                    application2 = r16;
                                    try {
                                        method.invoke(obj, obj3, null, null, 0, r16, null, null, application2, r16);
                                    } catch (Throwable th) {
                                        th = th;
                                        handler.post(new RunnableC0875d(application, aVar));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                    handler = handler2;
                                    aVar = aVar2;
                                    application = application2;
                                }
                                handler.post(new RunnableC0875d(application, aVar));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                handler = handler2;
                                aVar = aVar2;
                                application = application2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 11:
                CryptoAccountDetailsFragment cryptoAccountDetailsFragment = (CryptoAccountDetailsFragment) obj2;
                CryptoAccountDetailsController cryptoAccountDetailsController = cryptoAccountDetailsFragment.f12000p0;
                cryptoAccountDetailsFragment.V0((cryptoAccountDetailsController != null ? cryptoAccountDetailsController : null).getSummaryTab());
                return;
            case 12:
                ServerErrorFragment serverErrorFragment = (ServerErrorFragment) obj2;
                ActivityC0533g requireActivity = serverErrorFragment.requireActivity();
                MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
                if (mainActivity != null) {
                    mainActivity.D();
                }
                Window window = serverErrorFragment.requireActivity().getWindow();
                if (window != null) {
                    window.setStatusBarColor(C0913a.getColor(serverErrorFragment.requireContext(), R.color.server_error_background));
                    return;
                }
                return;
            case 13:
                SettingsFragment settingsFragment = (SettingsFragment) obj2;
                SettingsController settingsController = settingsFragment.f12985r0;
                if (settingsController == null) {
                    settingsController = null;
                }
                settingsController.setData(null, null, settingsFragment.T0().j0(), Integer.valueOf(settingsFragment.f12984q0));
                return;
            case 14:
                o2.e eVar = (o2.e) obj2;
                eVar.getClass();
                eVar.f24364d.d(new com.sumsub.sns.geo.presentation.d(eVar, 15));
                return;
            case 15:
                ((SellExternalAccountSelectFragment) obj2).getClass();
                return;
            case 16:
                ((CameraCaptureCallback) obj2).onCaptureCancelled();
                return;
            case 17:
                ((r.d) obj2).c();
                return;
            case 18:
                for (o oVar : (LinkedHashSet) obj2) {
                    oVar.b().l(oVar);
                }
                return;
            case 19:
                ProcessingCaptureSession.f5204p.remove((DeferrableSurface) obj2);
                return;
            case 20:
                ?? r42 = (p) obj2;
                r42.p(r42);
                return;
            case 21:
                i0.t((i0) obj2);
                return;
            case 22:
                ((SafeCloseImageReaderProxy) obj2).safeClose();
                return;
            case 23:
                u.e.a(((v.a) obj2).f30077b);
                return;
            case 24:
                WithdrawCryptoFragment withdrawCryptoFragment = (WithdrawCryptoFragment) obj2;
                withdrawCryptoFragment.u0().f27752p.c("", new BigDecimal(String.valueOf(withdrawCryptoFragment.f12189r0)).toPlainString());
                return;
            case 25:
                TransferFragment transferFragment = (TransferFragment) obj2;
                com.luminary.business.presentation.ui.fragments.transfer.a aVar3 = transferFragment.s0;
                if (aVar3 == null || (str = aVar3.f13159d) == null) {
                    return;
                }
                C1573a c1573a = transferFragment.f13143p0;
                c1573a.f30840d = str;
                TransferController transferController = transferFragment.f13142o0;
                (transferController != null ? transferController : null).setData(c1573a);
                transferFragment.V0();
                return;
            case 26:
                io.sentry.android.core.a aVar4 = (io.sentry.android.core.a) obj2;
                aVar4.f21948f.set(0L);
                aVar4.f21949g.set(false);
                return;
            case 27:
                FrameMetricsAggregator.a aVar5 = ((C1531b) obj2).f30388a.f6473a;
                ArrayList<WeakReference<Activity>> arrayList = aVar5.f6478c;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<Activity> weakReference = arrayList.get(size);
                    Activity activity2 = weakReference.get();
                    if (weakReference.get() != null) {
                        activity2.getWindow().removeOnFrameMetricsAvailableListener(aVar5.f6479d);
                        arrayList.remove(size);
                    }
                }
                return;
            case 28:
                m mVar = (m) obj2;
                mVar.getClass();
                ProcessLifecycleOwner.i.f7012f.c(mVar.f30443a);
                return;
            default:
                int i9 = MainActivity.f11402F;
                MainActivity mainActivity2 = (MainActivity) obj2;
                if (mainActivity2.B().C() && mainActivity2.B().B()) {
                    mainActivity2.E(false);
                    return;
                }
                return;
        }
    }
}
