package com.sumsub.sns.geo.presentation;

import a3.InterfaceFutureC0509a;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import androidx.camera.camera2.internal.CaptureSession;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.fragment.app.s;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.fragments.crypto.all_exchanges.AllExchangesFragment;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.CryptoAccountDetailsController;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.CryptoAccountDetailsFragment;
import com.luminary.business.presentation.ui.fragments.crypto.exchange_list.ExchangeListFragment;
import com.luminary.business.presentation.ui.fragments.invoices.invoice_details.StickyHeaderLinearLayoutManager;
import com.luminary.business.presentation.ui.fragments.payments.PaymentsFragment;
import com.luminary.business.presentation.ui.fragments.statistics.StatisticsFragment;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.k;
import com.sumsub.sns.internal.core.a;
import com.sumsub.sns.internal.core.android.a;
import com.sumsub.sns.internal.core.domain.camera.CameraX;
import com.sumsub.sns.presentation.screen.h;
import com.sumsub.sns.prooface.presentation.SNSLiveness3dFaceFragment;
import e.InterfaceC0702a;
import h7.C0800b;
import io.sentry.U;
import io.sentry.V;
import j2.AbstractC0892k;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import o2.e;
import p2.InterfaceC1102c;
import p8.C1118c;
import pa.C1124b;
import q2.InterfaceC1129a;
import q7.j;
import s6.C1214c;
import t.C1257i;
import t.W;
import t.X;
import t.r;
import t.s0;
import u.n;
import va.f;
import x.p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC0702a, Picasso.d, ImageAnalysis.Analyzer, s, SwipeRefreshLayout.f, OnModelBoundListener, InterfaceC1129a.InterfaceC0457a, CallbackToFutureAdapter.b, x.c, AsyncFunction, p.b, ImageReaderProxy.OnImageAvailableListener, V, f.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14425b;

    public /* synthetic */ d(Object obj, int i) {
        this.f14424a = i;
        this.f14425b = obj;
    }

    @Override // e.InterfaceC0702a
    public void a(Object obj) {
        switch (this.f14424a) {
            case 0:
                a.a((a) this.f14425b, (Map) obj);
                break;
            case 1:
            default:
                SNSLiveness3dFaceFragment.a((SNSLiveness3dFaceFragment) this.f14425b, (Map) obj);
                break;
            case 2:
                a.b.a((a.b) this.f14425b, obj);
                break;
        }
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(ImageProxy imageProxy) {
        CameraX.a((CameraX) this.f14425b, imageProxy);
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public InterfaceFutureC0509a apply(Object obj) {
        r.c cVar = (r.c) this.f14425b;
        cVar.getClass();
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            return Futures.immediateFuture(null);
        }
        long j10 = cVar.f27358f;
        s3.b bVar = new s3.b(8);
        Set<CameraCaptureMetaData.AfState> set = r.f27336h;
        r.e eVar = new r.e(j10, bVar);
        cVar.f27355c.a(eVar);
        return eVar.f27363b;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        String str;
        switch (this.f14424a) {
            case 18:
                C1257i c1257i = (C1257i) this.f14425b;
                c1257i.getClass();
                c1257i.f27245b.execute(new com.sumsub.sns.camera.photo.presentation.document.c(7, c1257i, aVar));
                return "updateSessionConfigAsync";
            case 19:
            case 21:
            default:
                p pVar = (p) this.f14425b;
                pVar.f30899d = aVar;
                return "WaitForRepeatingRequestStart[" + pVar + "]";
            case 20:
                r.a aVar2 = (r.a) this.f14425b;
                X x9 = aVar2.f27346a.f27250g;
                if (x9.f27170d) {
                    CaptureConfig.Builder builder = new CaptureConfig.Builder();
                    builder.setTemplateType(x9.f27179n);
                    builder.setUseRepeatingSurface(true);
                    MutableOptionsBundle create = MutableOptionsBundle.create();
                    create.insertOption(s.a.a(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
                    builder.addImplementationOptions(new s.a(OptionsBundle.from(create)));
                    builder.addCameraCaptureCallback(new W(aVar));
                    x9.f27167a.f27248e.onCameraControlCaptureRequests(Collections.singletonList(builder.build()));
                } else {
                    s3.b.v("Camera is not active.", aVar);
                }
                aVar2.f27347b.f30881b = true;
                return "AePreCapture";
            case 22:
                ((r.e) this.f14425b).f27362a = aVar;
                return "waitFor3AResult";
            case 23:
                CaptureSession captureSession = (CaptureSession) this.f14425b;
                synchronized (captureSession.f5177a) {
                    C1124b.q(captureSession.f5189n == null, "Release completer expected to be null");
                    captureSession.f5189n = aVar;
                    str = "Release[session=" + captureSession + "]";
                }
                return str;
            case 24:
                X x10 = (X) this.f14425b;
                x10.getClass();
                x10.f27168b.execute(new com.sumsub.sns.camera.photo.presentation.document.c(16, x10, aVar));
                return "cancelFocusAndMetering";
        }
    }

    @Override // androidx.fragment.app.s
    public void b(String str, Bundle bundle) {
        switch (this.f14424a) {
            case 4:
                h.a((h) this.f14425b, str, bundle);
                break;
            case 5:
                com.sumsub.sns.presentation.screen.preview.ekyc.a.a((com.sumsub.sns.presentation.screen.preview.ekyc.a) this.f14425b, str, bundle);
                break;
            case 6:
                com.sumsub.sns.presentation.screen.preview.ekyc.eid.a.a((com.sumsub.sns.presentation.screen.preview.ekyc.eid.a) this.f14425b, str, bundle);
                break;
            case 7:
                com.sumsub.sns.presentation.screen.preview.photo.identity.a.a((com.sumsub.sns.presentation.screen.preview.photo.identity.a) this.f14425b, str, bundle);
                break;
            default:
                com.sumsub.sns.presentation.screen.preview.selfie.a.a((com.sumsub.sns.presentation.screen.preview.selfie.a) this.f14425b, str, bundle);
                break;
        }
    }

    @Override // io.sentry.V
    public void c(U u6) {
        w9.b bVar = (w9.b) this.f14425b;
        bVar.getClass();
        synchronized (u6.f21907n) {
            if (u6.f21896b == bVar.f30856f) {
                u6.a();
            }
        }
    }

    @Override // x.c
    public Object d(CameraCharacteristics.Key key) {
        return ((n) this.f14425b).a(key);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void e() {
        CryptoAccountDomain cryptoAccountDomain;
        Long l10;
        int i = 1;
        Object obj = this.f14425b;
        switch (this.f14424a) {
            case 10:
                AllExchangesFragment allExchangesFragment = (AllExchangesFragment) obj;
                allExchangesFragment.getClass();
                SortDialog.Status status = SortDialog.Status.f13217a;
                allExchangesFragment.f11942q0 = "";
                allExchangesFragment.f11943r0 = "";
                allExchangesFragment.L0();
                allExchangesFragment.o0();
                C0800b T02 = allExchangesFragment.T0();
                T02.f21196W0 = 1;
                T02.f21197X0 = false;
                T02.f21198Y0.clear();
                C0800b T03 = allExchangesFragment.T0();
                A7.c cVar = new A7.c(15, T03, allExchangesFragment.f11942q0);
                T03.f418J0 = cVar;
                cVar.invoke();
                return;
            case 11:
                PaymentsFragment paymentsFragment = (PaymentsFragment) obj;
                paymentsFragment.U0();
                if (paymentsFragment.s0 == PaymentsFragment.PaymentsTab.f12945c) {
                    paymentsFragment.u0().f29590p.setLayoutManager(new StickyHeaderLinearLayoutManager(paymentsFragment.requireContext()));
                    com.luminary.business.presentation.ui.fragments.payments.a T04 = paymentsFragment.T0();
                    T04.f12962c1 = 1;
                    T04.f12957X0.clear();
                }
                com.luminary.business.presentation.ui.fragments.payments.a T05 = paymentsFragment.T0();
                int ordinal = paymentsFragment.s0.ordinal();
                if (ordinal == 0) {
                    T05.h0();
                    return;
                }
                if (ordinal == 1) {
                    T05.i0();
                    return;
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Serializable serializable = null;
                    E6.c cVar2 = new E6.c(T05, SortDialog.Status.f13217a, serializable, serializable, SortDialog.Direction.f13213a, 5);
                    T05.f419K0 = cVar2;
                    cVar2.invoke();
                    return;
                }
            case 12:
            case 14:
            case 15:
            default:
                ExchangeListFragment exchangeListFragment = (ExchangeListFragment) obj;
                int ordinal2 = exchangeListFragment.f12113v0.ordinal();
                if (ordinal2 == 0) {
                    q7.n T06 = exchangeListFragment.T0();
                    j jVar = new j(T06, i);
                    T06.f419K0 = jVar;
                    jVar.invoke();
                    return;
                }
                HashMap<ExchangeListFragment.ExchangesTab, String> hashMap = exchangeListFragment.f12110r0;
                if (ordinal2 != 1) {
                    exchangeListFragment.T0().i0(hashMap.get(ExchangeListFragment.ExchangesTab.f12124c));
                    return;
                } else {
                    exchangeListFragment.T0().i0(hashMap.get(ExchangeListFragment.ExchangesTab.f12123b));
                    return;
                }
            case 13:
                CryptoAccountDetailsFragment cryptoAccountDetailsFragment = (CryptoAccountDetailsFragment) obj;
                if (cryptoAccountDetailsFragment.f12002r0 == 0) {
                    cryptoAccountDetailsFragment.u0().f27682q.setRefreshing(false);
                } else {
                    cryptoAccountDetailsFragment.u0().f27682q.setRefreshing(false);
                    com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar = cryptoAccountDetailsFragment.f12001q0;
                    if (aVar != null && (cryptoAccountDomain = aVar.f12016a) != null && (l10 = cryptoAccountDomain.f10963a) != null) {
                        long longValue = l10.longValue();
                        l7.h T07 = cryptoAccountDetailsFragment.T0();
                        G7.f fVar = new G7.f(T07, (int) longValue, cryptoAccountDetailsFragment.s0, 3);
                        T07.f418J0 = fVar;
                        fVar.invoke();
                    }
                }
                SortDialog.Status status2 = SortDialog.Status.f13217a;
                cryptoAccountDetailsFragment.s0 = "";
                cryptoAccountDetailsFragment.L0();
                cryptoAccountDetailsFragment.o0();
                return;
            case 16:
                StatisticsFragment statisticsFragment = (StatisticsFragment) obj;
                statisticsFragment.L0();
                statisticsFragment.o0();
                Integer num = statisticsFragment.f13095q0;
                if (num != null) {
                    int intValue = num.intValue();
                    C1118c T08 = statisticsFragment.T0();
                    String str = null;
                    S6.d dVar = new S6.d(T08, intValue, statisticsFragment.f13094p0.toString(), str, str);
                    T08.f418J0 = dVar;
                    dVar.invoke();
                    return;
                }
                return;
        }
    }

    @Override // q2.InterfaceC1129a.InterfaceC0457a
    public Object execute() {
        switch (this.f14424a) {
            case 14:
                return Integer.valueOf(((InterfaceC1102c) this.f14425b).e());
            default:
                e eVar = (e) this.f14425b;
                Iterator<AbstractC0892k> it = eVar.f24362b.t().iterator();
                while (it.hasNext()) {
                    eVar.f24363c.b(it.next(), 1);
                }
                return null;
        }
    }

    @Override // com.squareup.picasso.Picasso.d
    public k f(k kVar) {
        return a.p.a((com.sumsub.sns.internal.core.a) this.f14425b, kVar);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        s0 s0Var = (s0) this.f14425b;
        s0Var.getClass();
        try {
            ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage != null) {
                s0Var.f27376b.enqueue(acquireLatestImage);
            }
        } catch (IllegalStateException e10) {
            Logger.e("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e10.getMessage());
        }
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void onModelBound(EpoxyModel epoxyModel, Object obj, int i) {
        CryptoAccountDetailsController.buildModels$lambda$10$lambda$9$lambda$3((CryptoAccountDomain) this.f14425b, (C1214c) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
    }
}
