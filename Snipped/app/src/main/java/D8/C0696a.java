package d8;

import B5.h;
import F8.j;
import O9.p;
import P9.s;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.fragments.newpayment.european.NewPaymentEuropeanFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.utils.extensions.FeeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* renamed from: d8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0696a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewPaymentEuropeanFragment f20469b;

    public /* synthetic */ C0696a(NewPaymentEuropeanFragment newPaymentEuropeanFragment, int i) {
        this.f20468a = i;
        this.f20469b = newPaymentEuropeanFragment;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        switch (this.f20468a) {
            case 0:
                h hVar = (h) obj;
                NewPaymentEuropeanFragment newPaymentEuropeanFragment = this.f20469b;
                PaymentUI paymentUI = newPaymentEuropeanFragment.f12786q0;
                if (paymentUI == null) {
                    paymentUI = null;
                }
                FeeType feeType = FeeType.f13317b;
                paymentUI.f11345q = j.b(hVar, feeType, "eur");
                PaymentUI paymentUI2 = newPaymentEuropeanFragment.f12786q0;
                (paymentUI2 != null ? paymentUI2 : null).f11346r = j.a(hVar, feeType, "eur");
                break;
            case 1:
                NewPaymentEuropeanFragment newPaymentEuropeanFragment2 = this.f20469b;
                newPaymentEuropeanFragment2.f12787r0.clear();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (((BankAccountDomain) obj2).i != null) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    ArrayList arrayList2 = newPaymentEuropeanFragment2.f12787r0;
                    if (!hasNext) {
                        if (arrayList2.size() == 1) {
                            newPaymentEuropeanFragment2.u0().f28833w.setText(((StatementsSelectorDialog.a) s.J(arrayList2)).f13052a);
                            newPaymentEuropeanFragment2.u0().f28832v.e();
                            newPaymentEuropeanFragment2.U0(((StatementsSelectorDialog.a) s.J(arrayList2)).f13052a);
                            newPaymentEuropeanFragment2.u0().f28835y.setVisibility(0);
                            newPaymentEuropeanFragment2.V0();
                        } else {
                            newPaymentEuropeanFragment2.V0();
                        }
                        break;
                    } else {
                        BankAccountDomain bankAccountDomain = (BankAccountDomain) it.next();
                        String str = bankAccountDomain.i;
                        String str2 = str == null ? "" : str;
                        String str3 = bankAccountDomain.f10701h;
                        arrayList2.add(new StatementsSelectorDialog.a(str2, D9.b.D(str3), str3 == null ? "" : str3, F8.b.b(bankAccountDomain), F8.b.c(bankAccountDomain), null, null, null, false, 480));
                    }
                }
            case 2:
                String str4 = (String) obj;
                NewPaymentEuropeanFragment newPaymentEuropeanFragment3 = this.f20469b;
                newPaymentEuropeanFragment3.u0().f28833w.setText(str4);
                newPaymentEuropeanFragment3.u0().f28832v.e();
                newPaymentEuropeanFragment3.U0(str4);
                break;
            default:
                this.f20469b.T0((String) obj, true);
                break;
        }
        return p.f3034a;
    }
}
