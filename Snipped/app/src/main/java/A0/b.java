package A0;

import C.v;
import D6.i;
import F8.o;
import I7.g;
import O9.f;
import O9.p;
import a3.InterfaceFutureC0509a;
import a7.C0517b;
import a7.C0519d;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.camera.core.CameraX;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.view.e;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.fragment.app.s;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.ui.MainActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.luminary.business.AndroidApplication;
import com.luminary.business.presentation.entity.account.AccountDetailsUI;
import com.luminary.business.presentation.ui.fragments.accountdetails.AccountDetailsFragment;
import com.luminary.business.presentation.ui.fragments.all_transactions.AllTransactionsFragment;
import com.luminary.business.presentation.ui.fragments.auth.accountinformation.AccountInformationFragment;
import com.luminary.business.presentation.ui.fragments.cards.CardsFragment;
import com.luminary.business.presentation.ui.fragments.cards.transactions.CardTransactionsFragment;
import com.luminary.business.presentation.ui.fragments.company.list.CompaniesListFragment;
import com.luminary.business.presentation.ui.fragments.home.newhome.NewHomeFragment;
import com.luminary.business.presentation.ui.fragments.invoices.InvoicesDateFragment;
import com.luminary.business.presentation.ui.fragments.invoices.invoices_new.InvoicesNewFragment;
import com.luminary.business.presentation.ui.fragments.loans.LoansFragment;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;
import com.luminary.business.presentation.ui.views.tagview.TagView;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionCountryFieldView;
import e.InterfaceC0702a;
import io.sentry.SentryOptions;
import io.sentry.Y;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements AsyncFunction, SwipeRefreshLayout.f, CallbackToFutureAdapter.b, TagView.e, InterfaceC0702a, OnCompleteListener, Y.a, s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14b;

    public /* synthetic */ b(Object obj, int i) {
        this.f13a = i;
        this.f14b = obj;
    }

    @Override // e.InterfaceC0702a
    public void a(Object obj) {
        Object obj2 = this.f14b;
        switch (this.f13a) {
            case 9:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    FilePickerContractor filePickerContractor = (FilePickerContractor) obj2;
                    filePickerContractor.f13322b = uri;
                    InterfaceC0646l<? super Uri, p> interfaceC0646l = filePickerContractor.f13324d;
                    if (interfaceC0646l != null) {
                        interfaceC0646l.invoke(uri);
                        break;
                    }
                }
                break;
            case 16:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i = MainActivity.f8665o;
                if (!booleanValue) {
                    MainActivity mainActivity = (MainActivity) obj2;
                    Toast.makeText(mainActivity.getApplicationContext(), mainActivity.getApplicationContext().getString(R.string.chucker_notifications_permission_not_granted), 1).show();
                    Log.e("Chucker", "Notification permission denied. Can't show transactions info", null);
                    break;
                }
                break;
            case 25:
                com.sumsub.sns.camera.a.a((com.sumsub.sns.camera.a) obj2, (Map) obj);
                break;
            case 26:
                com.sumsub.sns.camera.b.a((com.sumsub.sns.camera.b) obj2, (Map) obj);
                break;
            default:
                com.sumsub.sns.camera.video.presentation.a.a((com.sumsub.sns.camera.video.presentation.a) obj2, (Map) obj);
                break;
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public InterfaceFutureC0509a apply(Object obj) {
        switch (this.f13a) {
            case 1:
                return ((CameraX) this.f14b).getInitializeFuture();
            default:
                return ((androidx.camera.view.a) this.f14b).f5836d.g();
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public Object attachCompleter(final CallbackToFutureAdapter.a aVar) {
        Object lambda$deinit$0;
        Object lambda$fetchData$1;
        Object lambda$nonCancellationPropagating$0;
        switch (this.f13a) {
            case 6:
                final AudioSource audioSource = (AudioSource) this.f14b;
                audioSource.getClass();
                audioSource.f5616a.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        CallbackToFutureAdapter.a aVar2 = aVar;
                        AudioSource audioSource2 = AudioSource.this;
                        audioSource2.getClass();
                        try {
                            int ordinal = audioSource2.f5622g.ordinal();
                            if (ordinal == 0 || ordinal == 1) {
                                audioSource2.b(null);
                                audioSource2.f5620e.release();
                                audioSource2.f5619d.release();
                                audioSource2.d();
                                audioSource2.c(AudioSource.InternalState.f5639c);
                            }
                            aVar2.b(null);
                        } catch (Throwable th) {
                            aVar2.c(th);
                        }
                    }
                });
                return "AudioSource-release";
            case 14:
                ((e) this.f14b).f5866k.set(aVar);
                return "textureViewImpl_waitForNextFrame";
            case 20:
                lambda$deinit$0 = ((CameraRepository) this.f14b).lambda$deinit$0(aVar);
                return lambda$deinit$0;
            case 21:
                lambda$fetchData$1 = ((LiveDataObservable) this.f14b).lambda$fetchData$1(aVar);
                return lambda$fetchData$1;
            default:
                lambda$nonCancellationPropagating$0 = Futures.lambda$nonCancellationPropagating$0((InterfaceFutureC0509a) this.f14b, aVar);
                return lambda$nonCancellationPropagating$0;
        }
    }

    @Override // androidx.fragment.app.s
    public void b(String str, Bundle bundle) {
        switch (this.f13a) {
            case 23:
                ((InterfaceC0650p) this.f14b).invoke(str, bundle);
                break;
            case 27:
                com.sumsub.sns.camera.photo.presentation.a.a((com.sumsub.sns.camera.photo.presentation.a) this.f14b, str, bundle);
                break;
            default:
                SNSApplicantDataSelectionCountryFieldView.m66setFragmentResultListener$lambda9$lambda8((SNSApplicantDataSelectionCountryFieldView) this.f14b, str, bundle);
                break;
        }
    }

    @Override // io.sentry.Y.a
    public void c(SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) sentryOptions;
        sentryAndroidOptions.setBeforeSend(new v());
        sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration((Application) this.f14b, true, true));
    }

    @Override // com.luminary.business.presentation.ui.views.tagview.TagView.e
    public void d(int i) {
        AccountInformationFragment accountInformationFragment = (AccountInformationFragment) this.f14b;
        accountInformationFragment.f11530t0.remove(i);
        accountInformationFragment.u0().f27668p.c(i);
        if (accountInformationFragment.f11530t0.isEmpty()) {
            o.b(accountInformationFragment.u0().f27668p);
        }
        accountInformationFragment.T0();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void e() {
        AccountDetailsUI accountDetailsUI;
        String str;
        int i = 4;
        int i9 = 0;
        int i10 = 1;
        Object obj = this.f14b;
        switch (this.f13a) {
            case 2:
                NewHomeFragment newHomeFragment = (NewHomeFragment) obj;
                A7.e U02 = newHomeFragment.U0();
                A7.a aVar = new A7.a(U02, i9);
                U02.f419K0 = aVar;
                aVar.invoke();
                A7.e U03 = newHomeFragment.U0();
                A7.a aVar2 = new A7.a(U03, i10);
                U03.f421M0 = aVar2;
                aVar2.invoke();
                A7.e U04 = newHomeFragment.U0();
                U04.f126j1 = 1;
                U04.f120d1.clear();
                A7.e U05 = newHomeFragment.U0();
                U05.f127k1 = 1;
                U05.f128l1 = false;
                U05.f121e1.clear();
                A7.e U06 = newHomeFragment.U0();
                if (U06.f126j1 == 1) {
                    A7.a aVar3 = new A7.a(U06, 2);
                    U06.f422O0 = aVar3;
                    aVar3.invoke();
                }
                A7.a aVar4 = new A7.a(U06, i);
                U06.f420L0 = aVar4;
                aVar4.invoke();
                A7.e U07 = newHomeFragment.U0();
                A7.a aVar5 = new A7.a(U07, 3);
                U07.N0 = aVar5;
                aVar5.invoke();
                break;
            case 3:
                AccountDetailsFragment accountDetailsFragment = (AccountDetailsFragment) obj;
                if (accountDetailsFragment.f11484r0 == 0) {
                    accountDetailsFragment.u0().f27603q.setRefreshing(false);
                }
                accountDetailsFragment.U0();
                com.luminary.business.presentation.ui.fragments.accountdetails.a aVar6 = accountDetailsFragment.f11483q0;
                if (aVar6 != null && (accountDetailsUI = aVar6.f11500a) != null && (str = accountDetailsUI.f11170g) != null) {
                    i T02 = accountDetailsFragment.T0();
                    T02.f952Y0 = 1;
                    T02.f950W0.clear();
                    accountDetailsFragment.T0().m(str, accountDetailsFragment.f11487v0, accountDetailsFragment.f11488w0, accountDetailsFragment.f11486u0, accountDetailsFragment.f11485t0);
                    break;
                }
                break;
            case 4:
                InvoicesDateFragment invoicesDateFragment = (InvoicesDateFragment) obj;
                invoicesDateFragment.f12286p0 = "";
                invoicesDateFragment.f12287q0 = SortDialog.Status.f13217a;
                invoicesDateFragment.f12288r0 = null;
                invoicesDateFragment.s0 = null;
                invoicesDateFragment.L0();
                invoicesDateFragment.o0();
                invoicesDateFragment.T0().h0();
                break;
            case 5:
                AllTransactionsFragment allTransactionsFragment = (AllTransactionsFragment) obj;
                allTransactionsFragment.f11508v0 = null;
                allTransactionsFragment.f11507u0 = null;
                allTransactionsFragment.s0 = SortDialog.Status.f13217a;
                allTransactionsFragment.f11504q0 = "";
                allTransactionsFragment.f11505r0 = "";
                allTransactionsFragment.L0();
                allTransactionsFragment.o0();
                E6.d T03 = allTransactionsFragment.T0();
                T03.f1068X0 = 1;
                T03.f1067W0.clear();
                E6.d T04 = allTransactionsFragment.T0();
                E6.c cVar = new E6.c(T04, allTransactionsFragment.s0, allTransactionsFragment.f11507u0, allTransactionsFragment.f11508v0, allTransactionsFragment.f11506t0, 0);
                T04.f418J0 = cVar;
                cVar.invoke();
                break;
            case 7:
                InvoicesNewFragment invoicesNewFragment = (InvoicesNewFragment) obj;
                invoicesNewFragment.f12327q0 = "";
                invoicesNewFragment.f12328r0 = SortDialog.Status.f13217a;
                LinkedHashMap linkedHashMap = invoicesNewFragment.f12329t0;
                linkedHashMap.put(Integer.valueOf(invoicesNewFragment.f12326p0), null);
                invoicesNewFragment.L0();
                invoicesNewFragment.o0();
                invoicesNewFragment.T0().m(invoicesNewFragment.f12326p0 == 0);
                F7.e T05 = invoicesNewFragment.T0();
                boolean z10 = invoicesNewFragment.f12326p0 == 0;
                InvoicesNewFragment.a aVar7 = (InvoicesNewFragment.a) linkedHashMap.get(0);
                Date date = aVar7 != null ? aVar7.f12337a : null;
                InvoicesNewFragment.a aVar8 = (InvoicesNewFragment.a) linkedHashMap.get(0);
                T05.n(z10, date, aVar8 != null ? aVar8.f12338b : null, invoicesNewFragment.s0, invoicesNewFragment.f12328r0);
                break;
            case 10:
                LoansFragment loansFragment = (LoansFragment) obj;
                if (loansFragment.f12360q0 != LoansFragment.LoanTab.f12367b) {
                    loansFragment.u0().f29142y.setRefreshing(false);
                    break;
                } else {
                    g U08 = loansFragment.U0();
                    A8.b bVar = new A8.b(U08, i);
                    U08.f418J0 = bVar;
                    bVar.invoke();
                    break;
                }
            case 17:
                T6.g T06 = ((CardsFragment) obj).T0();
                A8.b bVar2 = new A8.b(T06, 12);
                T06.f418J0 = bVar2;
                bVar2.invoke();
                break;
            case 19:
                CardTransactionsFragment cardTransactionsFragment = (CardTransactionsFragment) obj;
                cardTransactionsFragment.getClass();
                SortDialog.Status status = SortDialog.Status.f13217a;
                cardTransactionsFragment.f11852r0 = "";
                cardTransactionsFragment.s0 = "";
                cardTransactionsFragment.L0();
                cardTransactionsFragment.o0();
                C0519d T07 = cardTransactionsFragment.T0();
                T07.f4470X0 = 1;
                T07.f4469W0.clear();
                C0519d T08 = cardTransactionsFragment.T0();
                Z6.e eVar = new Z6.e(T08, ((C0517b) cardTransactionsFragment.f11849o0.getValue()).f4463a.f10778a, i10);
                T08.f418J0 = eVar;
                eVar.invoke();
                break;
            default:
                CompaniesListFragment companiesListFragment = (CompaniesListFragment) obj;
                companiesListFragment.T0().m(companiesListFragment.f11870q0);
                companiesListFragment.u0().f28957r.setRefreshing(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        String str;
        int i = AndroidApplication.f10636a;
        if (task.isSuccessful() && (str = (String) task.getResult()) != null) {
            ((K5.a) ((f) this.f14b).getValue()).c(str);
        }
    }
}
