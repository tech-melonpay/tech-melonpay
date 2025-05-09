package A7;

import F0.f;
import F8.o;
import G7.g;
import I5.k;
import O9.p;
import P9.m;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.navigation.NavController;
import b8.h;
import ca.InterfaceC0635a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.domain.entity.templates.GetTemplatesDomain;
import com.luminary.business.presentation.entity.company.UploadFileUI;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.base.BaseActivity;
import com.luminary.business.presentation.ui.fragments.auth.login.inreview.InReviewFragment;
import com.luminary.business.presentation.ui.fragments.createNewCardVault.CreateNewCardVaultFragment;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$CurrencyType;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.business.presentation.ui.fragments.crypto.exchange_details.ExchangeDetailsFragment;
import com.luminary.business.presentation.ui.fragments.newcard.cardtype.SelectCardTypeFragment;
import com.luminary.business.presentation.ui.fragments.newcard.confirmorder.ConfirmOrderFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadAdditionalDocumentsFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadDocumentsFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountBankInfoFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountFragment;
import com.luminary.business.presentation.ui.fragments.plans.SelectPlansFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.views.toolbar.CustomToolbarView;
import com.luminary.mobile.R;
import h7.C0800b;
import i7.C0829d;
import i7.C0830e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import k8.C0952a;
import k8.C0953b;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import p7.C1113d;
import q7.n;
import r7.C1158f;
import r7.C1159g;
import t5.e;
import t6.AbstractC1334f5;
import t6.AbstractC1350h5;
import t6.AbstractC1366j5;
import t6.AbstractC1477y3;
import t6.M4;
import t6.P6;
import t6.W4;
import t8.j;
import z6.C1648c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f108c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f106a = i;
        this.f107b = obj;
        this.f108c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        Integer num;
        Integer num2;
        String num3;
        String str;
        Double d10;
        String str2;
        Integer num4;
        String num5;
        int i = 2;
        int i9 = 5;
        int i10 = 8;
        int i11 = 1;
        e.a aVar = null;
        byte b9 = 0;
        byte b10 = 0;
        Object obj = this.f108c;
        Object obj2 = this.f107b;
        switch (this.f106a) {
            case 0:
                e eVar = (e) obj2;
                eVar.l();
                Log.e("TAG", "accounts:   ");
                eVar.f112V0.a(new b(eVar, b9 == true ? 1 : 0), new s5.b(String.valueOf(eVar.f113W0.h()), (String) obj));
                break;
            case 1:
                int i12 = CustomToolbarView.f13254b0;
                CustomToolbarView customToolbarView = (CustomToolbarView) obj;
                ((P6) obj2).f28337w.setText(customToolbarView.getContext().getString(R.string.empty));
                customToolbarView.w();
                ((InputMethodManager) customToolbarView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(customToolbarView.getWindowToken(), 0);
                break;
            case 2:
                f fVar = ((BaseActivity) obj2).f11453m;
                ((FrameLayout) (fVar != null ? fVar : null).f1148d).removeView((View) ((Ref$ObjectRef) obj).f23179a);
                break;
            case 3:
                g gVar = (g) obj2;
                String valueOf = String.valueOf(gVar.f1355U0.h());
                Integer num6 = (Integer) obj;
                if (num6 != null) {
                    gVar.l();
                    gVar.f1354T0.a(new G7.e(gVar, 0), new Pair(valueOf, num6));
                }
                break;
            case 4:
                InReviewFragment inReviewFragment = (InReviewFragment) obj;
                ((View) obj2).removeCallbacks(inReviewFragment.f11617r0);
                ((C1648c) inReviewFragment.f11615p0.getValue()).f31331U0.p();
                break;
            case 5:
                NavController g10 = U4.b.g((SelectCardTypeFragment) obj2);
                com.luminary.business.presentation.ui.fragments.newcard.cardtype.a aVar2 = (com.luminary.business.presentation.ui.fragments.newcard.cardtype.a) obj;
                String str3 = aVar2.f12404a;
                g10.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("accountNumber", str3);
                bundle.putInt("cardType", 1);
                bundle.putString("accountName", aVar2.f12405b);
                bundle.putString(FirebaseAnalytics.Param.CURRENCY, "GBP");
                g10.i(R.id.action_selectCardTypeFragment_to_confirmOrderFragment, bundle);
                break;
            case 6:
                K7.d dVar = (K7.d) ((ConfirmOrderFragment) obj2).f12408p0.getValue();
                com.luminary.business.presentation.ui.fragments.newcard.confirmorder.a aVar3 = (com.luminary.business.presentation.ui.fragments.newcard.confirmorder.a) obj;
                int i13 = aVar3.f12416b;
                k value = dVar.f2272b1.getValue();
                if (value != null) {
                    int h9 = dVar.f2267W0.h();
                    if (i13 != 0) {
                        String str4 = value.f1839p;
                        aVar = new e.a(str4 != null ? str4.toLowerCase(Locale.ROOT) : null, value.f1837n, value.f1840q, value.f1836m + " " + value.f1834l, value.f1838o);
                    }
                    t5.e eVar2 = new t5.e(D9.b.K(value), aVar3.f12418d, Boolean.valueOf(i13 == 0), aVar);
                    dVar.l();
                    dVar.f2265U0.a(new K7.c(dVar, i11), new Pair(String.valueOf(h9), eVar2));
                }
                break;
            case 7:
                List list = (List) obj2;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((UploadFileUI) it.next()).f11321g == null) {
                            break;
                        }
                    }
                }
                ((NewCompanyViewModel) obj).f12450p1.setValue(null);
                break;
            case 8:
                Z6.g gVar2 = (Z6.g) obj2;
                gVar2.f4219V0.a(new J8.c(6, gVar2, (Integer) obj), Integer.valueOf(gVar2.f4217T0.h()));
                break;
            case 9:
                final Calendar calendar = Calendar.getInstance();
                final UploadAdditionalDocumentsFragment uploadAdditionalDocumentsFragment = (UploadAdditionalDocumentsFragment) obj2;
                final M4 m42 = (M4) obj;
                new DatePickerDialog(uploadAdditionalDocumentsFragment.requireContext(), R.style.my_dialog_theme, new DatePickerDialog.OnDateSetListener() { // from class: a8.c
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i14, int i15, int i16) {
                        Calendar calendar2 = calendar;
                        calendar2.set(1, i14);
                        calendar2.set(2, i15);
                        calendar2.set(5, i16);
                        calendar2.setTimeZone(TimeZone.getTimeZone("UTC"));
                        calendar2.set(11, 12);
                        calendar2.set(12, 0);
                        uploadAdditionalDocumentsFragment.s0 = calendar2.getTime();
                        m42.f28182q.setText(D9.b.F0(calendar2.getTime(), "dd MMM yyyy"));
                    }
                }, calendar.get(1), calendar.get(2), calendar.get(5)).show();
                break;
            case 10:
                UploadDocumentsFragment uploadDocumentsFragment = (UploadDocumentsFragment) obj2;
                uploadDocumentsFragment.f12732y0.remove((UploadFileUI) obj);
                uploadDocumentsFragment.U0();
                break;
            case 11:
                h hVar = (h) obj2;
                hVar.f8463a1.a(new b8.b(hVar, i), (String) obj);
                break;
            case 12:
                NewPaymentBankEmailFragment newPaymentBankEmailFragment = (NewPaymentBankEmailFragment) obj2;
                StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(newPaymentBankEmailFragment.requireContext(), StatementsSelectorDialog.DialogType.f13044b);
                statementsSelectorDialog.f13042w = new J8.c(i10, newPaymentBankEmailFragment, (W4) obj);
                statementsSelectorDialog.show();
                StatementsSelectorDialog.l(statementsSelectorDialog, newPaymentBankEmailFragment.f12745t0);
                statementsSelectorDialog.m(newPaymentBankEmailFragment.getString(R.string.from_account));
                break;
            case 13:
                CreateNewCardVaultFragment createNewCardVaultFragment = (CreateNewCardVaultFragment) obj2;
                StatementsSelectorDialog statementsSelectorDialog2 = new StatementsSelectorDialog(createNewCardVaultFragment.requireContext(), StatementsSelectorDialog.DialogType.f13044b);
                statementsSelectorDialog2.f13042w = new J8.c(9, (AbstractC1477y3) obj, createNewCardVaultFragment);
                ArrayList arrayList = createNewCardVaultFragment.T0().f20463c1;
                if (arrayList != null) {
                    statementsSelectorDialog2.show();
                    String string = createNewCardVaultFragment.getString(R.string.no_matching_accounts_found);
                    StatementsSelectorDialog.SelectorController selectorController = statementsSelectorDialog2.f13038s;
                    if (selectorController != null) {
                        selectorController.setData(arrayList, string);
                    }
                    statementsSelectorDialog2.m(createNewCardVaultFragment.getString(R.string.new_card_select_account));
                }
                break;
            case 14:
                NewPaymentSwiftFragment newPaymentSwiftFragment = (NewPaymentSwiftFragment) obj2;
                StatementsSelectorDialog statementsSelectorDialog3 = new StatementsSelectorDialog(newPaymentSwiftFragment.requireContext(), StatementsSelectorDialog.DialogType.f13044b);
                statementsSelectorDialog3.f13040u = new J8.c(11, newPaymentSwiftFragment, (AbstractC1334f5) obj);
                statementsSelectorDialog3.show();
                StatementsSelectorDialog.l(statementsSelectorDialog3, newPaymentSwiftFragment.s0);
                statementsSelectorDialog3.m(newPaymentSwiftFragment.getString(R.string.from_account));
                break;
            case 15:
                C0800b c0800b = (C0800b) obj2;
                if (!c0800b.f21197X0) {
                    c0800b.l();
                    c0800b.f21194U0.a(new C7.a(c0800b, 21), new v5.e(c0800b.f21193T0.h(), null, (String) obj, c0800b.f21196W0, m.n("FIAT-CRYPTO", "CRYPTO-CRYPTO", "CRYPTO-FIAT"), null));
                }
                break;
            case 16:
                NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = (NewPaymentToBankAccountBankInfoFragment) obj2;
                PaymentUI paymentUI = newPaymentToBankAccountBankInfoFragment.f12871q0;
                AbstractC1350h5 abstractC1350h5 = (AbstractC1350h5) obj;
                (paymentUI != null ? paymentUI : null).f11353y = Boolean.valueOf(abstractC1350h5.f29074x.isChecked());
                o.i(abstractC1350h5.f29058A, abstractC1350h5.f29074x.isChecked());
                NestedScrollView nestedScrollView = abstractC1350h5.f29060C;
                nestedScrollView.post(new B2.d(nestedScrollView, 7));
                newPaymentToBankAccountBankInfoFragment.W0();
                break;
            case 17:
                NewPaymentToBankAccountFragment newPaymentToBankAccountFragment = (NewPaymentToBankAccountFragment) obj2;
                StatementsSelectorDialog statementsSelectorDialog4 = new StatementsSelectorDialog(newPaymentToBankAccountFragment.requireContext(), StatementsSelectorDialog.DialogType.f13044b);
                statementsSelectorDialog4.f13042w = new J8.c(12, newPaymentToBankAccountFragment, (AbstractC1366j5) obj);
                statementsSelectorDialog4.show();
                StatementsSelectorDialog.l(statementsSelectorDialog4, newPaymentToBankAccountFragment.s0);
                statementsSelectorDialog4.m(newPaymentToBankAccountFragment.getString(R.string.from_account));
                break;
            case 18:
                C0830e c0830e = (C0830e) obj2;
                c0830e.l();
                int h10 = c0830e.f21498T0.h();
                CryptoExchangeDomain value2 = c0830e.f21501W0.getValue();
                c0830e.f21499U0.a(new C0829d(c0830e, b10 == true ? 1 : 0), new v5.g((value2 == null || (num = value2.f11017a) == null) ? 0 : num.intValue(), h10, null, null, (String) obj));
                break;
            case 19:
                Integer num7 = ((C5.a) obj2).f664a;
                if (num7 != null) {
                    int intValue = num7.intValue();
                    C0953b c0953b = (C0953b) ((SelectPlansFragment) obj).f12965p0.getValue();
                    String valueOf2 = String.valueOf(intValue);
                    u5.d u6 = c0953b.f23047V0.u();
                    if (u6 != null && (num2 = u6.f30237a) != null && (num3 = num2.toString()) != null) {
                        c0953b.l();
                        c0953b.f23046U0.a(new C0952a(c0953b, 0), new Pair(num3, valueOf2));
                    }
                    break;
                }
                break;
            case 20:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                CryptoExchangeDomain cryptoExchangeDomain = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
                CryptoExchangeFragment$Companion$CurrencyType cryptoExchangeFragment$Companion$CurrencyType = K3.a.c(cryptoExchangeDomain != null ? cryptoExchangeDomain.f11027l : null) ? CryptoExchangeFragment$Companion$CurrencyType.f12047a : CryptoExchangeFragment$Companion$CurrencyType.f12048b;
                CryptoExchangeDomain cryptoExchangeDomain2 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
                K3.a.c(cryptoExchangeDomain2 != null ? cryptoExchangeDomain2.f11028m : null);
                NavController g11 = U4.b.g((ExchangeDetailsFragment) obj);
                CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = cryptoExchangeFragment$Companion$CurrencyType == CryptoExchangeFragment$Companion$CurrencyType.f12047a ? CryptoExchangeFragment$Companion$DirectionType.f12051b : CryptoExchangeFragment$Companion$DirectionType.f12050a;
                CryptoExchangeDomain cryptoExchangeDomain3 = (CryptoExchangeDomain) ref$ObjectRef.f23179a;
                String str5 = "";
                if (cryptoExchangeDomain3 == null || (str = cryptoExchangeDomain3.f11027l) == null) {
                    str = "";
                }
                if (cryptoExchangeDomain3 != null && (str2 = cryptoExchangeDomain3.f11028m) != null) {
                    str5 = str2;
                }
                g11.j(new C1113d(cryptoExchangeFragment$Companion$DirectionType, str, str5, (cryptoExchangeDomain3 == null || (d10 = cryptoExchangeDomain3.f11029n) == null) ? 0.0f : (float) d10.doubleValue()));
                break;
            case 21:
                n nVar = (n) obj2;
                nVar.l();
                nVar.f25920V0.a(new q7.k(nVar, i9), new v5.e(nVar.f25918T0.h(), null, (String) obj, nVar.f25927c1, m.n("FIAT-CRYPTO", "CRYPTO-CRYPTO", "CRYPTO-FIAT"), "EXCHANGE"));
                break;
            case 22:
                C1159g c1159g = (C1159g) obj2;
                c1159g.l();
                c1159g.f26321U0.a(new C1158f(c1159g, 0), new GetTemplatesDomain(Long.valueOf(c1159g.f26320T0.h()), (String) obj, GetTemplatesDomain.PaymentMethod.f11145a));
                break;
            default:
                j jVar = (j) obj2;
                u5.d u10 = jVar.f29957T0.u();
                if (u10 != null && (num4 = u10.f30237a) != null && (num5 = num4.toString()) != null) {
                    jVar.l();
                    jVar.f29960W0.a(new t8.h(jVar, i10), new Pair(num5, (String) obj));
                }
                break;
        }
        return p.f3034a;
    }
}
