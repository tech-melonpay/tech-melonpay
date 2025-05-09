package C7;

import B6.g;
import C.v;
import D6.i;
import D8.a;
import E6.d;
import F8.k;
import F8.o;
import H6.j;
import J5.a;
import Ka.t;
import O9.p;
import P9.AbstractC0499a;
import P9.n;
import P9.s;
import S1.m;
import a7.C0519d;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.widget.EditText;
import androidx.lifecycle.C0559z;
import androidx.navigation.NavController;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cards.CardTransactionDomain;
import com.luminary.business.domain.entity.cards.TopUpCommissionDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ForgotPasswordFragment;
import com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ResetPasswordFragment;
import com.luminary.business.presentation.ui.fragments.cardSecurityVerification.CardSecurityVerificationFragment;
import com.luminary.business.presentation.ui.fragments.cardSecurityVerification.editCardSecurityVerification.EditCardSecurityVerificationFragment;
import com.luminary.business.presentation.ui.fragments.cards.confirm_topup.ConfirmTopUpFragment;
import com.luminary.business.presentation.ui.fragments.cards.details.card.CardFragment;
import com.luminary.business.presentation.ui.fragments.cards.rename_card.RenameCardFragment;
import com.luminary.business.presentation.ui.fragments.company.list.SignerCheckFragment;
import com.luminary.business.presentation.ui.fragments.createNewCardVault.CreateNewCardVaultFragment;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.business.presentation.ui.fragments.crypto.exchange_details.ExchangeDetailsFragment;
import com.luminary.business.presentation.ui.fragments.hub.HubController;
import com.luminary.business.presentation.ui.fragments.hub.HubFragment;
import com.luminary.business.presentation.ui.fragments.newcard.cardtype.SelectCardTypeFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.submit.SubmitCompanyFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadAdditionalDocumentsFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.signer.SignerFragment;
import com.luminary.business.presentation.ui.fragments.server_error.ServerErrorFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import d7.C0695f;
import h7.C0800b;
import ha.C0806e;
import ha.h;
import ia.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import ka.C0959d;
import ka.C0961f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import kotlin.reflect.KVariance;
import kotlinx.coroutines.future.FutureKt;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;
import t6.AbstractC1477y3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f682b;

    public /* synthetic */ a(Object obj, int i) {
        this.f681a = i;
        this.f682b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        NavController g10;
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<BankAccountDomain> arrayList2;
        ArrayList arrayList3;
        StatementsSelectorDialog.a aVar;
        String valueOf;
        p asCompletableFuture$lambda$2;
        Throwable safeCtor$lambda$9;
        int i9 = 3;
        int i10 = 2;
        Object obj2 = this.f682b;
        switch (this.f681a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                HubFragment hubFragment = (HubFragment) obj2;
                if (intValue == R.string.transfer) {
                    NavController g11 = U4.b.g(hubFragment);
                    g11.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("fromAc", null);
                    bundle.putString("toAc", null);
                    bundle.putString("reference", null);
                    bundle.putString("amount", null);
                    g11.i(R.id.action_hubFragment_to_transferFragment, bundle);
                } else if (intValue == R.string.hub_exchange) {
                    NavController g12 = U4.b.g(hubFragment);
                    CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                    g12.j(c.a(false));
                } else {
                    if (intValue == R.string.hub_settings) {
                        g10 = U4.b.g(hubFragment);
                        i = R.id.action_hubFragment_to_settingsFragment;
                    } else if (intValue == R.string.hub_loans) {
                        g10 = U4.b.g(hubFragment);
                        i = R.id.action_hubFragment_to_loansFragment;
                    } else if (intValue == R.string.hub_invoices) {
                        g10 = U4.b.g(hubFragment);
                        i = R.id.action_hubFragment_to_invoicesNewFragment;
                    } else if (intValue == R.string.hub_statements) {
                        g10 = U4.b.g(hubFragment);
                        i = R.id.action_hubFragment_to_statementsDateFragment;
                    } else if (intValue == R.string.my_plan) {
                        g10 = U4.b.g(hubFragment);
                        i = R.id.action_hubFragment_to_selectPlansFragment;
                    } else if (intValue == R.string.hub_support) {
                        g10 = U4.b.g(hubFragment);
                        i = R.id.action_hubFragment_to_SupportFragment;
                    } else {
                        if (intValue == R.string.accept_payments) {
                            return p.f3034a;
                        }
                        if (intValue == R.string.hub_statistics) {
                            g10 = U4.b.g(hubFragment);
                            i = R.id.action_hubFragment_to_statisticsFragment;
                        } else if (intValue == R.string.hub_rates) {
                            NavController g13 = U4.b.g(hubFragment);
                            CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                            g13.j(c.a(true));
                        } else if (intValue == R.string.hub_fiat) {
                            ((K5.a) hubFragment.f12271q0.getValue()).I(false);
                            List<HubFragment.Apps> T02 = hubFragment.T0();
                            HubController hubController = hubFragment.f12270p0;
                            (hubController != null ? hubController : null).setData(T02, Integer.valueOf(hubFragment.f12272r0));
                            hubFragment.L0();
                            ((MainActivity) hubFragment.requireActivity()).A();
                        } else if (intValue == R.string.hub_crypto) {
                            ((K5.a) hubFragment.f12271q0.getValue()).I(true);
                            List<HubFragment.Apps> T03 = hubFragment.T0();
                            HubController hubController2 = hubFragment.f12270p0;
                            (hubController2 != null ? hubController2 : null).setData(T03, Integer.valueOf(hubFragment.f12272r0));
                            hubFragment.L0();
                            ((MainActivity) hubFragment.requireActivity()).A();
                        }
                    }
                    v.w(g10, i);
                }
                return p.f3034a;
            case 1:
                J5.a aVar2 = (J5.a) obj;
                i iVar = (i) obj2;
                iVar.k();
                aVar2.getClass();
                if (aVar2 instanceof a.C0026a) {
                    J5.b bVar = (J5.b) ((a.C0026a) aVar2).f2145a;
                    if (iVar.a(bVar)) {
                        iVar.f413E0 = iVar.f418J0;
                    }
                    if (!iVar.c(bVar)) {
                        iVar.d(bVar);
                    }
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list = (List) ((a.b) aVar2).f2146a;
                    ArrayList b9 = k.b(list);
                    if (list.isEmpty() && iVar.f952Y0 == 1) {
                        ArrayList<TransactionUI> arrayList4 = iVar.f950W0;
                        arrayList4.addAll(b9);
                        iVar.f949V0.postValue(s.F(arrayList4));
                    } else if (!b9.isEmpty()) {
                        iVar.f952Y0++;
                        ArrayList<TransactionUI> arrayList5 = iVar.f950W0;
                        arrayList5.addAll(b9);
                        iVar.f949V0.postValue(s.F(arrayList5));
                    }
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 2:
                J5.a aVar3 = (J5.a) obj;
                aVar3.getClass();
                d dVar = (d) obj2;
                if (aVar3 instanceof a.C0026a) {
                    J5.b bVar2 = (J5.b) ((a.C0026a) aVar3).f2145a;
                    dVar.k();
                    if (dVar.a(bVar2)) {
                        dVar.f413E0 = dVar.f418J0;
                    }
                    if (!dVar.c(bVar2)) {
                        dVar.d(bVar2);
                    }
                    p pVar3 = p.f3034a;
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list2 = (List) ((a.b) aVar3).f2146a;
                    dVar.k();
                    ArrayList b10 = k.b(list2);
                    boolean isEmpty = list2.isEmpty();
                    C0559z<List<TransactionUI>> c0559z = dVar.f1066V0;
                    ArrayList<TransactionUI> arrayList6 = dVar.f1067W0;
                    if (isEmpty && dVar.f1068X0 == 1) {
                        arrayList6.addAll(b10);
                        c0559z.postValue(s.F(arrayList6));
                    } else if (!b10.isEmpty()) {
                        dVar.f1068X0++;
                        arrayList6.addAll(b10);
                        c0559z.postValue(s.F(arrayList6));
                    }
                    p pVar4 = p.f3034a;
                }
                return p.f3034a;
            case 3:
                ForgotPasswordFragment forgotPasswordFragment = (ForgotPasswordFragment) obj2;
                forgotPasswordFragment.getClass();
                BottomDialogType.a aVar4 = BottomDialogType.f13289k;
                forgotPasswordFragment.requireContext();
                aVar4.getClass();
                BottomDialogType d10 = BottomDialogType.a.d();
                d10.f13295a = forgotPasswordFragment.getString(R.string.password_for_changed_successfully);
                d10.f13297c = forgotPasswordFragment.getString(R.string.done);
                a.C0010a.a(forgotPasswordFragment.w0(), d10, new H6.d(forgotPasswordFragment, i10), 4);
                return p.f3034a;
            case 4:
                ResetPasswordFragment resetPasswordFragment = (ResetPasswordFragment) obj2;
                resetPasswordFragment.getClass();
                BottomDialogType.a aVar5 = BottomDialogType.f13289k;
                resetPasswordFragment.requireContext();
                aVar5.getClass();
                BottomDialogType d11 = BottomDialogType.a.d();
                d11.f13295a = resetPasswordFragment.getString(R.string.password_for_changed_successfully);
                d11.f13297c = resetPasswordFragment.getString(R.string.done);
                resetPasswordFragment.w0().c(d11, new j(resetPasswordFragment, i10), null);
                return p.f3034a;
            case 5:
                ((SelectCardTypeFragment) obj2).f12400p0 = ((Integer) obj).intValue();
                return p.f3034a;
            case 6:
                return obj == ((AbstractC0499a) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 7:
                J5.a aVar6 = (J5.a) obj;
                Q6.c cVar = (Q6.c) obj2;
                cVar.k();
                aVar6.getClass();
                if (aVar6 instanceof a.C0026a) {
                    cVar.d((J5.b) ((a.C0026a) aVar6).f2145a);
                    p pVar5 = p.f3034a;
                } else {
                    if (!(aVar6 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    E5.b bVar3 = (E5.b) ((a.b) aVar6).f2146a;
                    C0559z<String> c0559z2 = cVar.f3193U0;
                    String str2 = bVar3.f1053a;
                    c0559z2.postValue(str2 != null ? str2 : "");
                    p pVar6 = p.f3034a;
                }
                return p.f3034a;
            case 8:
                ((CardSecurityVerificationFragment) obj2).W0((String) obj, true);
                return p.f3034a;
            case 9:
                t tVar = new t(((m) obj).a((Context) obj2));
                try {
                    String y10 = tVar.y();
                    U4.b.d(tVar, null);
                    return y10;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        U4.b.d(tVar, th);
                        throw th2;
                    }
                }
            case 10:
                ((EditCardSecurityVerificationFragment) obj2).U0((String) obj, true);
                return p.f3034a;
            case 11:
                ((Menu) obj2).findItem(R.id.encode_url).setVisible(((Boolean) obj).booleanValue());
                return p.f3034a;
            case 12:
                ConfirmTopUpFragment confirmTopUpFragment = (ConfirmTopUpFragment) obj2;
                TopUpCommissionDomain topUpCommissionDomain = confirmTopUpFragment.T0().f3733e;
                if (f.b((topUpCommissionDomain == null || (str = topUpCommissionDomain.f10777c) == null) ? null : str.toLowerCase(Locale.ROOT), "bank")) {
                    BottomDialogType.a aVar7 = BottomDialogType.f13289k;
                    confirmTopUpFragment.requireContext();
                    aVar7.getClass();
                    BottomDialogType d12 = BottomDialogType.a.d();
                    VaultDomain vaultDomain = confirmTopUpFragment.T0().f3730b;
                    String str3 = vaultDomain != null ? vaultDomain.f10782e : null;
                    String str4 = confirmTopUpFragment.T0().f3734f;
                    VaultDomain vaultDomain2 = confirmTopUpFragment.T0().f3730b;
                    String o10 = D9.b.o(str3, D9.b.I(str4, vaultDomain2 != null ? vaultDomain2.f10782e : null));
                    d12.f13295a = confirmTopUpFragment.T0().f3735g ? confirmTopUpFragment.getString(R.string.top_up_of_within_working_day, o10) : confirmTopUpFragment.getString(R.string.top_up_of, o10);
                    d12.f13297c = confirmTopUpFragment.getString(R.string.done);
                    d12.f13301g = BottomDialogType.Type.CLOCK;
                    d12.f13298d = Integer.valueOf(R.drawable.bg_button_black);
                    d12.f13303j = Boolean.TRUE;
                    confirmTopUpFragment.w0().c(d12, new V6.a(confirmTopUpFragment, i10), new g(7));
                } else {
                    BottomDialogType.a aVar8 = BottomDialogType.f13289k;
                    confirmTopUpFragment.requireContext();
                    aVar8.getClass();
                    BottomDialogType d13 = BottomDialogType.a.d();
                    VaultDomain vaultDomain3 = confirmTopUpFragment.T0().f3730b;
                    String str5 = vaultDomain3 != null ? vaultDomain3.f10782e : null;
                    String str6 = confirmTopUpFragment.T0().f3734f;
                    VaultDomain vaultDomain4 = confirmTopUpFragment.T0().f3730b;
                    d13.f13295a = confirmTopUpFragment.getString(R.string.top_up_of, D9.b.o(str5, D9.b.I(str6, vaultDomain4 != null ? vaultDomain4.f10782e : null)));
                    d13.f13297c = confirmTopUpFragment.getString(R.string.done);
                    d13.f13298d = Integer.valueOf(R.drawable.bg_button_black);
                    d13.f13303j = Boolean.TRUE;
                    confirmTopUpFragment.w0().c(d13, new V6.a(confirmTopUpFragment, i9), new g(8));
                }
                return p.f3034a;
            case 13:
                ((CardFragment) obj2).r0();
                return p.f3034a;
            case 14:
                ((RenameCardFragment) obj2).getClass();
                return p.f3034a;
            case 15:
                SubmitCompanyFragment submitCompanyFragment = (SubmitCompanyFragment) obj2;
                submitCompanyFragment.f12673q0 = SubmitCompanyFragment.SubmitStatus.f12680b;
                submitCompanyFragment.T0();
                return p.f3034a;
            case 16:
                J5.a aVar9 = (J5.a) obj;
                aVar9.getClass();
                C0519d c0519d = (C0519d) obj2;
                if (aVar9 instanceof a.C0026a) {
                    J5.b bVar4 = (J5.b) ((a.C0026a) aVar9).f2145a;
                    c0519d.k();
                    if (c0519d.a(bVar4)) {
                        c0519d.f413E0 = c0519d.f418J0;
                    }
                    if (!c0519d.c(bVar4)) {
                        c0519d.d(bVar4);
                    }
                    p pVar7 = p.f3034a;
                } else {
                    if (!(aVar9 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list3 = (List) ((a.b) aVar9).f2146a;
                    c0519d.k();
                    boolean isEmpty2 = list3.isEmpty();
                    C0559z<List<CardTransactionDomain>> c0559z3 = c0519d.f4468V0;
                    ArrayList<CardTransactionDomain> arrayList7 = c0519d.f4469W0;
                    if (isEmpty2 && c0519d.f4470X0 == 1) {
                        arrayList7.addAll(list3);
                        c0559z3.postValue(s.F(arrayList7));
                    } else if (!list3.isEmpty()) {
                        c0519d.f4470X0++;
                        arrayList7.addAll(list3);
                        c0559z3.postValue(s.F(arrayList7));
                    }
                    p pVar8 = p.f3034a;
                }
                return p.f3034a;
            case 17:
                U4.b.g((UploadAdditionalDocumentsFragment) obj2).l();
                return p.f3034a;
            case 18:
                U4.b.g((SignerCheckFragment) obj2).i(R.id.action_global_homeFragment, null);
                return p.f3034a;
            case 19:
                Integer num = ((StatementsSelectorDialog.a) obj).f13059h;
                CreateNewCardVaultFragment createNewCardVaultFragment = (CreateNewCardVaultFragment) obj2;
                if (num != null) {
                    int intValue2 = num.intValue();
                    C0695f T04 = createNewCardVaultFragment.T0();
                    C0559z<List<h4.i>> c0559z4 = T04.f20461a1;
                    List<h4.i> value = c0559z4.getValue();
                    if (value != null) {
                        for (h4.i iVar2 : value) {
                            if (iVar2.f21118a == intValue2) {
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    iVar2 = null;
                    T04.f20456V0 = iVar2;
                    T04.f20467g1 = iVar2 != null ? iVar2.f21120c : null;
                    List<h4.i> value2 = c0559z4.getValue();
                    if (value2 != null) {
                        arrayList = new ArrayList();
                        for (Object obj3 : value2) {
                            String str7 = ((h4.i) obj3).f21120c;
                            h4.i iVar3 = T04.f20456V0;
                            if (f.b(str7, iVar3 != null ? iVar3.f21120c : null)) {
                                arrayList.add(obj3);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            List<BankAccountDomain> list4 = ((h4.i) it.next()).f21123f;
                            if (list4 != null) {
                                arrayList8.add(list4);
                            }
                        }
                        arrayList2 = n.v(arrayList8);
                    } else {
                        arrayList2 = null;
                    }
                    T04.f20460Z0.setValue(arrayList2);
                    if (arrayList2 != null) {
                        arrayList3 = new ArrayList();
                        for (BankAccountDomain bankAccountDomain : arrayList2) {
                            String str8 = bankAccountDomain.i;
                            if (str8 != null) {
                                String str9 = bankAccountDomain.f10701h;
                                aVar = new StatementsSelectorDialog.a(str8, D9.b.D(str9), str9 == null ? "" : str9, F8.b.b(bankAccountDomain), F8.b.c(bankAccountDomain), null, bankAccountDomain.f10701h, bankAccountDomain.f10694a, false, 288);
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                arrayList3.add(aVar);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                    T04.f20463c1 = arrayList3;
                    T04.h0();
                }
                createNewCardVaultFragment.V0();
                AbstractC1477y3 u02 = createNewCardVaultFragment.u0();
                u02.f29846p.setText("");
                CustomTextInputLayout customTextInputLayout = u02.f29845o;
                EditText editText = customTextInputLayout.getEditText();
                if (editText != null) {
                    EditText editText2 = customTextInputLayout.getEditText();
                    editText.setText(String.valueOf(editText2 != null ? editText2.getText() : null));
                }
                o.b(u02.f29844n);
                u02.f29847q.setEnabled(false);
                u02.f29848r.setEnabled(false);
                customTextInputLayout.setError(null);
                o.b(u02.f29851u);
                createNewCardVaultFragment.T0().f20457W0 = null;
                return p.f3034a;
            case 20:
                F5.b bVar5 = (F5.b) obj;
                if (f.b(bVar5 != null ? bVar5.f1176F : null, "PSI_COMPLETED")) {
                    SignerFragment signerFragment = (SignerFragment) obj2;
                    CountDownTimer countDownTimer = signerFragment.f12821r0;
                    (countDownTimer != null ? countDownTimer : null).cancel();
                    signerFragment.f12822t0.cancel();
                    signerFragment.getParentFragmentManager().f0("signer", t0.c.b(new Pair("signer_status", bVar5.f1176F)));
                    signerFragment.requireActivity().getOnBackPressedDispatcher().d();
                }
                return p.f3034a;
            case 21:
                J5.a aVar10 = (J5.a) obj;
                C0800b c0800b = (C0800b) obj2;
                c0800b.k();
                aVar10.getClass();
                if (aVar10 instanceof a.C0026a) {
                    J5.b bVar6 = (J5.b) ((a.C0026a) aVar10).f2145a;
                    if (c0800b.a(bVar6)) {
                        c0800b.f413E0 = c0800b.f418J0;
                    }
                    if (!c0800b.c(bVar6)) {
                        c0800b.d(bVar6);
                    }
                    p pVar9 = p.f3034a;
                } else {
                    if (!(aVar10 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list5 = (List) ((a.b) aVar10).f2146a;
                    c0800b.k();
                    if (list5.isEmpty()) {
                        c0800b.f21197X0 = true;
                    }
                    boolean isEmpty3 = list5.isEmpty();
                    C0559z<List<CryptoExchangeDomain>> c0559z5 = c0800b.f21195V0;
                    ArrayList<CryptoExchangeDomain> arrayList9 = c0800b.f21198Y0;
                    if (isEmpty3 && c0800b.f21196W0 == 1) {
                        arrayList9.addAll(list5);
                        c0559z5.postValue(s.F(arrayList9));
                    } else if (!list5.isEmpty()) {
                        c0800b.f21196W0++;
                        arrayList9.addAll(list5);
                        c0559z5.postValue(s.F(arrayList9));
                    }
                    p pVar10 = p.f3034a;
                }
                return p.f3034a;
            case 22:
                int intValue3 = ((Integer) obj).intValue();
                C0961f c0961f = C0961f.this;
                Matcher matcher = c0961f.f23074a;
                C0806e V = h.V(matcher.start(intValue3), matcher.end(intValue3));
                if (V.f21226a >= 0) {
                    return new C0959d(c0961f.f23074a.group(intValue3), V);
                }
                return null;
            case 23:
                l lVar = (l) obj;
                ((kotlin.jvm.internal.k) obj2).getClass();
                KVariance kVariance = lVar.f21516a;
                if (kVariance == null) {
                    return "*";
                }
                ia.k kVar = lVar.f21517b;
                kotlin.jvm.internal.k kVar2 = kVar instanceof kotlin.jvm.internal.k ? (kotlin.jvm.internal.k) kVar : null;
                if (kVar2 == null || (valueOf = kVar2.g(true)) == null) {
                    valueOf = String.valueOf(kVar);
                }
                int i11 = k.a.f23192a[kVariance.ordinal()];
                if (i11 == 1) {
                    return valueOf;
                }
                if (i11 == 2) {
                    return "in ".concat(valueOf);
                }
                if (i11 == 3) {
                    return "out ".concat(valueOf);
                }
                throw new NoWhenBranchMatchedException();
            case 24:
                asCompletableFuture$lambda$2 = FutureKt.asCompletableFuture$lambda$2((CompletableFuture) obj2, (Throwable) obj);
                return asCompletableFuture$lambda$2;
            case 25:
                safeCtor$lambda$9 = ExceptionsConstructorKt.safeCtor$lambda$9((InterfaceC0646l) obj2, (Throwable) obj);
                return safeCtor$lambda$9;
            case 26:
                J5.a aVar11 = (J5.a) obj;
                l7.h hVar = (l7.h) obj2;
                hVar.k();
                aVar11.getClass();
                if (aVar11 instanceof a.C0026a) {
                    J5.b bVar7 = (J5.b) ((a.C0026a) aVar11).f2145a;
                    if (hVar.a(bVar7)) {
                        hVar.f413E0 = hVar.f418J0;
                    }
                    if (!hVar.c(bVar7)) {
                        hVar.d(bVar7);
                    }
                    p pVar11 = p.f3034a;
                } else {
                    if (!(aVar11 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list6 = (List) ((a.b) aVar11).f2146a;
                    hVar.k();
                    if (list6.isEmpty()) {
                        hVar.f23580X0 = true;
                    }
                    boolean isEmpty4 = list6.isEmpty();
                    C0559z<List<CryptoExchangeDomain>> c0559z6 = hVar.f23578V0;
                    ArrayList<CryptoExchangeDomain> arrayList10 = hVar.f23581Y0;
                    if (isEmpty4 && hVar.f23579W0 == 1) {
                        arrayList10.addAll(list6);
                        c0559z6.postValue(arrayList10);
                    } else if (!list6.isEmpty()) {
                        hVar.f23579W0++;
                        arrayList10.addAll(list6);
                        c0559z6.postValue(arrayList10);
                    }
                    p pVar12 = p.f3034a;
                }
                return p.f3034a;
            case 27:
                ServerErrorFragment serverErrorFragment = (ServerErrorFragment) obj2;
                try {
                    U4.b.g(serverErrorFragment).l();
                } catch (Exception unused) {
                    serverErrorFragment.requireActivity().finish();
                }
                return p.f3034a;
            case 28:
                J5.a aVar12 = (J5.a) obj;
                l8.a aVar13 = (l8.a) obj2;
                aVar13.k();
                if (aVar12 instanceof a.C0026a) {
                    p pVar13 = p.f3034a;
                } else {
                    if (!(aVar12 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (f.b(((I5.f) ((a.b) aVar12).f2146a).f1751a, Boolean.TRUE)) {
                        aVar13.f23583U0.setValue(null);
                    }
                    p pVar14 = p.f3034a;
                }
                return p.f3034a;
            default:
                String str10 = (String) obj;
                if (str10 == null) {
                    return p.f3034a;
                }
                ExchangeDetailsFragment exchangeDetailsFragment = (ExchangeDetailsFragment) obj2;
                exchangeDetailsFragment.N0(str10, new g(0));
                ((p7.g) exchangeDetailsFragment.f12097p0.getValue()).f25708V0.postValue(null);
                return p.f3034a;
        }
    }
}
