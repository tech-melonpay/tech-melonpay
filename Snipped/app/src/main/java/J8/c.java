package J8;

import I5.j;
import I5.k;
import J5.a;
import M6.n;
import M6.w;
import O9.p;
import Z6.g;
import android.view.View;
import androidx.lifecycle.A;
import b8.h;
import c.RunnableC0615f;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.domain.entity.payments.PaymentDomain;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.fragments.cardSecurityVerification.CardSecurityVerificationFragment;
import com.luminary.business.presentation.ui.fragments.cardSecurityVerification.editCardSecurityVerification.EditCardSecurityVerificationFragment;
import com.luminary.business.presentation.ui.fragments.createNewCardVault.CreateNewCardVaultFragment;
import com.luminary.business.presentation.ui.fragments.createNewVirtualCard.CreateNewVirtualCardFragment;
import com.luminary.business.presentation.ui.fragments.edit_account.EditAccountFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.fragments.transfer.TransferController;
import com.luminary.business.presentation.ui.fragments.transfer.TransferFragment;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.mobile.R;
import d7.C0695f;
import e7.C0726f;
import h4.i;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.future.FutureKt;
import t6.A3;
import t6.AbstractC1334f5;
import t6.AbstractC1366j5;
import t6.AbstractC1477y3;
import t6.O3;
import t6.W2;
import t6.W4;
import w6.C1573a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2205c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f2203a = i;
        this.f2204b = obj;
        this.f2205c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        Object obj2;
        Integer num;
        Integer num2;
        BankAccountDomain bankAccountDomain;
        String d10;
        Object obj3;
        BankAccountDomain bankAccountDomain2;
        Object obj4;
        p scheduleResumeAfterDelay$lambda$2;
        p asCompletableFuture$lambda$1;
        String str;
        String str2;
        Object obj5;
        String str3;
        Object obj6;
        String str4 = "0";
        Object obj7 = null;
        VaultDomain vaultDomain = null;
        VaultDomain vaultDomain2 = null;
        Object obj8 = null;
        BankAccountDomain bankAccountDomain3 = null;
        Object obj9 = null;
        BankAccountDomain bankAccountDomain4 = null;
        Object obj10 = this.f2205c;
        Object obj11 = this.f2204b;
        switch (this.f2203a) {
            case 0:
                if (((d) obj11).f2206a.compareAndSet(true, false)) {
                    ((A) obj10).onChanged(obj);
                }
                return p.f3034a;
            case 1:
                J5.a aVar = (J5.a) obj;
                w wVar = (w) obj11;
                wVar.k();
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    J5.b bVar = (J5.b) ((a.C0026a) aVar).f2145a;
                    if (!wVar.b(bVar)) {
                        wVar.d(bVar);
                    }
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j jVar = (j) ((a.b) aVar).f2146a;
                    String str5 = jVar.f1787b;
                    Long a10 = str5 != null ? defpackage.c.a(str5) : null;
                    wVar.f2708i1.c(jVar.f1786a, str5, jVar.f1789d, Long.valueOf((a10 != null ? a10.longValue() : 0L) - defpackage.c.b(jVar.f1794j)));
                    K5.a aVar2 = wVar.f2702c1;
                    Long l10 = jVar.f1790e;
                    if (l10 != null) {
                        aVar2.j(l10.longValue());
                    }
                    k kVar = (k) obj10;
                    wVar.f2709j1.postValue(kVar);
                    aVar2.x(kVar);
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
            case 2:
                J5.a aVar3 = (J5.a) obj;
                w wVar2 = (w) obj11;
                wVar2.k();
                n nVar = new n(wVar2, 16);
                if (aVar3 instanceof a.C0026a) {
                    nVar.invoke(((a.C0026a) aVar3).f2145a);
                } else {
                    if (!(aVar3 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC0635a interfaceC0635a = (InterfaceC0635a) obj10;
                    if (interfaceC0635a != null) {
                        interfaceC0635a.invoke();
                    }
                    p pVar3 = p.f3034a;
                }
                return p.f3034a;
            case 3:
                J5.b bVar2 = (J5.b) obj;
                NewCompanyViewModel newCompanyViewModel = (NewCompanyViewModel) obj11;
                if (newCompanyViewModel.a(bVar2)) {
                    newCompanyViewModel.f413E0 = newCompanyViewModel.f424Q0;
                }
                if (!newCompanyViewModel.c(bVar2)) {
                    newCompanyViewModel.d(bVar2);
                }
                InterfaceC0635a interfaceC0635a2 = (InterfaceC0635a) obj10;
                if (interfaceC0635a2 != null) {
                    return interfaceC0635a2.invoke();
                }
                return null;
            case 4:
                CardSecurityVerificationFragment cardSecurityVerificationFragment = (CardSecurityVerificationFragment) obj11;
                W2 w2 = (W2) obj10;
                if (cardSecurityVerificationFragment.f11736t0) {
                    w2.f28626s.setError(null);
                } else {
                    w2.f28626s.setErrorWithoutFocus(cardSecurityVerificationFragment.getString(R.string.invalid_phone));
                }
                return p.f3034a;
            case 5:
                EditCardSecurityVerificationFragment editCardSecurityVerificationFragment = (EditCardSecurityVerificationFragment) obj11;
                W2 w22 = (W2) obj10;
                if (editCardSecurityVerificationFragment.f11750q0) {
                    w22.f28626s.setError(null);
                } else {
                    w22.f28626s.setErrorWithoutFocus(editCardSecurityVerificationFragment.getString(R.string.invalid_phone));
                }
                return p.f3034a;
            case 6:
                J5.a aVar4 = (J5.a) obj;
                aVar4.getClass();
                g gVar = (g) obj11;
                if (aVar4 instanceof a.C0026a) {
                    J5.b bVar3 = (J5.b) ((a.C0026a) aVar4).f2145a;
                    if (gVar.a(bVar3)) {
                        gVar.f413E0 = gVar.f418J0;
                    }
                    if (!gVar.c(bVar3)) {
                        gVar.d(bVar3);
                    }
                    p pVar4 = p.f3034a;
                } else {
                    if (!(aVar4 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Iterator it = ((List) ((a.b) aVar4).f2146a).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            int i = ((i) obj2).f21118a;
                            Integer num3 = (Integer) obj10;
                            if (num3 != null && num3.intValue() == i) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    i iVar = (i) obj2;
                    gVar.f4222Y0.postValue(iVar != null ? iVar.f21123f : null);
                    p pVar5 = p.f3034a;
                }
                return p.f3034a;
            case 7:
                J5.a aVar5 = (J5.a) obj;
                h hVar = (h) obj11;
                hVar.k();
                b8.b bVar4 = new b8.b(hVar, 12);
                aVar5.getClass();
                if (aVar5 instanceof a.C0026a) {
                    bVar4.invoke(((a.C0026a) aVar5).f2145a);
                } else {
                    if (!(aVar5 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar.f8476o1.postValue((PaymentDomain) obj10);
                    p pVar6 = p.f3034a;
                }
                return p.f3034a;
            case 8:
                StatementsSelectorDialog.a aVar6 = (StatementsSelectorDialog.a) obj;
                NewPaymentBankEmailFragment newPaymentBankEmailFragment = (NewPaymentBankEmailFragment) obj11;
                newPaymentBankEmailFragment.u0().f28630A.setText(aVar6.f13052a);
                List<BankAccountDomain> value = newPaymentBankEmailFragment.W0().f8469g1.getValue();
                if (value != null) {
                    Iterator<T> it2 = value.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (f.b(((BankAccountDomain) next).f10694a, aVar6.f13059h)) {
                                obj9 = next;
                            }
                        }
                    }
                    bankAccountDomain4 = (BankAccountDomain) obj9;
                }
                newPaymentBankEmailFragment.f12747v0 = bankAccountDomain4;
                ((W4) obj10).f28635o.c(bankAccountDomain4 != null ? F8.b.e(bankAccountDomain4) : "", "0");
                BankAccountDomain bankAccountDomain5 = newPaymentBankEmailFragment.f12747v0;
                if (bankAccountDomain5 != null && (num = bankAccountDomain5.f10694a) != null) {
                    newPaymentBankEmailFragment.Y0(num.intValue());
                }
                return p.f3034a;
            case 9:
                StatementsSelectorDialog.a aVar7 = (StatementsSelectorDialog.a) obj;
                Integer num4 = aVar7.f13059h;
                CreateNewCardVaultFragment createNewCardVaultFragment = (CreateNewCardVaultFragment) obj10;
                if (num4 != null) {
                    int intValue = num4.intValue();
                    C0695f T02 = createNewCardVaultFragment.T0();
                    List<BankAccountDomain> value2 = T02.f20460Z0.getValue();
                    if (value2 != null) {
                        Iterator<T> it3 = value2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Object next2 = it3.next();
                                Integer num5 = ((BankAccountDomain) next2).f10694a;
                                if (num5 != null && num5.intValue() == intValue) {
                                    obj8 = next2;
                                }
                            }
                        }
                        bankAccountDomain3 = (BankAccountDomain) obj8;
                    }
                    T02.f20457W0 = bankAccountDomain3;
                }
                AbstractC1477y3 abstractC1477y3 = (AbstractC1477y3) obj11;
                abstractC1477y3.f29846p.setText(aVar7.f13052a);
                abstractC1477y3.f29845o.e();
                C0695f T03 = createNewCardVaultFragment.T0();
                A8.b bVar5 = new A8.b(T03, 26);
                T03.f418J0 = bVar5;
                bVar5.invoke();
                createNewCardVaultFragment.U0();
                return p.f3034a;
            case 10:
                StatementsSelectorDialog.a aVar8 = (StatementsSelectorDialog.a) obj;
                ((A3) obj11).f27612u.setText(aVar8.f13052a);
                CreateNewVirtualCardFragment createNewVirtualCardFragment = (CreateNewVirtualCardFragment) obj10;
                Integer num6 = aVar8.f13059h;
                if (num6 != null) {
                    int intValue2 = num6.intValue();
                    C0726f U02 = createNewVirtualCardFragment.U0();
                    List<VaultDomain> value3 = U02.f20553W0.getValue();
                    if (value3 != null) {
                        Iterator<T> it4 = value3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                Object next3 = it4.next();
                                if (((VaultDomain) next3).f10778a == intValue2) {
                                    obj7 = next3;
                                }
                            }
                        }
                        vaultDomain = (VaultDomain) obj7;
                    }
                    U02.f20554X0 = vaultDomain;
                    U02.h0();
                    vaultDomain2 = U02.f20554X0;
                }
                if (vaultDomain2 != null && (num2 = vaultDomain2.f10793q) != null) {
                    createNewVirtualCardFragment.U0().m(num2.intValue());
                }
                return p.f3034a;
            case 11:
                String str6 = (String) obj;
                NewPaymentSwiftFragment newPaymentSwiftFragment = (NewPaymentSwiftFragment) obj11;
                newPaymentSwiftFragment.u0().f29004u.setText(str6);
                List<BankAccountDomain> value4 = newPaymentSwiftFragment.U0().f8469g1.getValue();
                if (value4 != null) {
                    Iterator<T> it5 = value4.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            obj3 = it5.next();
                            if (f.b(((BankAccountDomain) obj3).i, str6)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    bankAccountDomain = (BankAccountDomain) obj3;
                } else {
                    bankAccountDomain = null;
                }
                newPaymentSwiftFragment.f12858v0 = bankAccountDomain;
                CustomTextInputEditText customTextInputEditText = ((AbstractC1334f5) obj10).f28998o;
                d10 = bankAccountDomain != null ? F8.b.d(bankAccountDomain) : "";
                PaymentUI paymentUI = newPaymentSwiftFragment.f12854q0;
                if (paymentUI == null) {
                    paymentUI = null;
                }
                if (!f.b(paymentUI.f11332c, BigDecimal.ZERO)) {
                    PaymentUI paymentUI2 = newPaymentSwiftFragment.f12854q0;
                    str4 = (paymentUI2 != null ? paymentUI2 : null).f11332c.toString();
                }
                customTextInputEditText.c(d10, str4);
                newPaymentSwiftFragment.V0(str6);
                return p.f3034a;
            case 12:
                StatementsSelectorDialog.a aVar9 = (StatementsSelectorDialog.a) obj;
                NewPaymentToBankAccountFragment newPaymentToBankAccountFragment = (NewPaymentToBankAccountFragment) obj11;
                newPaymentToBankAccountFragment.u0().f29152v.setText(aVar9.f13052a);
                List<BankAccountDomain> value5 = newPaymentToBankAccountFragment.U0().f8469g1.getValue();
                Integer num7 = aVar9.f13059h;
                if (value5 != null) {
                    Iterator<T> it6 = value5.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj4 = it6.next();
                            if (f.b(((BankAccountDomain) obj4).f10694a, num7)) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    bankAccountDomain2 = (BankAccountDomain) obj4;
                } else {
                    bankAccountDomain2 = null;
                }
                newPaymentToBankAccountFragment.f12896v0 = bankAccountDomain2;
                CustomTextInputEditText customTextInputEditText2 = ((AbstractC1366j5) obj10).f29145o;
                d10 = bankAccountDomain2 != null ? F8.b.e(bankAccountDomain2) : "";
                PaymentUI paymentUI3 = newPaymentToBankAccountFragment.f12892q0;
                if (paymentUI3 == null) {
                    paymentUI3 = null;
                }
                if (!f.b(paymentUI3.f11332c, BigDecimal.ZERO)) {
                    PaymentUI paymentUI4 = newPaymentToBankAccountFragment.f12892q0;
                    str4 = (paymentUI4 != null ? paymentUI4 : null).f11332c.toString();
                }
                customTextInputEditText2.c(d10, str4);
                if (num7 != null) {
                    newPaymentToBankAccountFragment.V0(num7.intValue());
                }
                return p.f3034a;
            case 13:
                scheduleResumeAfterDelay$lambda$2 = HandlerContext.scheduleResumeAfterDelay$lambda$2((HandlerContext) obj11, (Runnable) obj10, (Throwable) obj);
                return scheduleResumeAfterDelay$lambda$2;
            case 14:
                asCompletableFuture$lambda$1 = FutureKt.asCompletableFuture$lambda$1((CompletableFuture) obj11, (Deferred) obj10, (Throwable) obj);
                return asCompletableFuture$lambda$1;
            case 15:
                List list = (List) obj;
                TransferFragment transferFragment = (TransferFragment) obj11;
                if (transferFragment.f13147u0) {
                    transferFragment.f13147u0 = false;
                    transferFragment.U0();
                } else if (!transferFragment.f13146t0) {
                    transferFragment.f13146t0 = true;
                    com.luminary.business.presentation.ui.fragments.transfer.a aVar10 = transferFragment.s0;
                    C1573a c1573a = transferFragment.f13143p0;
                    if (aVar10 != null && (str3 = aVar10.f13156a) != null) {
                        Iterator it7 = list.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                obj6 = it7.next();
                                if (f.b(((BankAccountDomain) obj6).f10700g, str3)) {
                                }
                            } else {
                                obj6 = null;
                            }
                        }
                        BankAccountDomain bankAccountDomain6 = (BankAccountDomain) obj6;
                        if (bankAccountDomain6 != null) {
                            c1573a.f30838b = bankAccountDomain6;
                            c1573a.f30837a = bankAccountDomain6;
                            if (transferFragment.getView() != null) {
                                TransferController transferController = transferFragment.f13142o0;
                                if (transferController == null) {
                                    transferController = null;
                                }
                                transferController.setData(c1573a);
                                transferFragment.V0();
                            }
                        }
                    }
                    com.luminary.business.presentation.ui.fragments.transfer.a aVar11 = transferFragment.s0;
                    if (aVar11 != null && (str2 = aVar11.f13157b) != null) {
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                obj5 = it8.next();
                                if (f.b(((BankAccountDomain) obj5).f10700g, str2)) {
                                }
                            } else {
                                obj5 = null;
                            }
                        }
                        BankAccountDomain bankAccountDomain7 = (BankAccountDomain) obj5;
                        if (bankAccountDomain7 != null) {
                            c1573a.f30838b = bankAccountDomain7;
                            c1573a.f30837a = bankAccountDomain7;
                            TransferController transferController2 = transferFragment.f13142o0;
                            if (transferController2 == null) {
                                transferController2 = null;
                            }
                            transferController2.setData(c1573a);
                            transferFragment.V0();
                        }
                    }
                    com.luminary.business.presentation.ui.fragments.transfer.a aVar12 = transferFragment.s0;
                    if (aVar12 != null && (str = aVar12.f13158c) != null) {
                        c1573a.f30839c = str;
                        TransferController transferController3 = transferFragment.f13142o0;
                        (transferController3 != null ? transferController3 : null).setData(c1573a);
                        transferFragment.V0();
                    }
                    ((View) obj10).postDelayed(new RunnableC0615f(transferFragment, 25), 400L);
                }
                return p.f3034a;
            default:
                Pair i02 = D9.b.i0((String) obj);
                O3 o32 = (O3) obj11;
                if (((Boolean) i02.f23089a).booleanValue()) {
                    o32.f28275u.setError(null);
                } else {
                    Integer num8 = (Integer) i02.f23090b;
                    if (num8 != null) {
                        o32.f28275u.setErrorWithoutFocus(((EditAccountFragment) obj10).getString(num8.intValue()));
                    }
                }
                return p.f3034a;
        }
    }
}
