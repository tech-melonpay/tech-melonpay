package i8;

import B5.h;
import F8.j;
import O9.p;
import P9.s;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.fragments.newpayment.unitedkingdom.NewPaymentUnitedKingdomFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.utils.extensions.FeeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* renamed from: i8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0831a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewPaymentUnitedKingdomFragment f21504b;

    public /* synthetic */ C0831a(NewPaymentUnitedKingdomFragment newPaymentUnitedKingdomFragment, int i) {
        this.f21503a = i;
        this.f21504b = newPaymentUnitedKingdomFragment;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        switch (this.f21503a) {
            case 0:
                h hVar = (h) obj;
                NewPaymentUnitedKingdomFragment newPaymentUnitedKingdomFragment = this.f21504b;
                PaymentUI paymentUI = newPaymentUnitedKingdomFragment.f12910q0;
                if (paymentUI == null) {
                    paymentUI = null;
                }
                FeeType feeType = FeeType.f13316a;
                paymentUI.f11345q = j.b(hVar, feeType, "gbp");
                PaymentUI paymentUI2 = newPaymentUnitedKingdomFragment.f12910q0;
                (paymentUI2 != null ? paymentUI2 : null).f11346r = j.a(hVar, feeType, "gbp");
                break;
            case 1:
                NewPaymentUnitedKingdomFragment newPaymentUnitedKingdomFragment2 = this.f21504b;
                newPaymentUnitedKingdomFragment2.f12911r0.clear();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (((BankAccountDomain) obj2).i != null) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    ArrayList arrayList2 = newPaymentUnitedKingdomFragment2.f12911r0;
                    if (!hasNext) {
                        if (arrayList2.size() == 1) {
                            newPaymentUnitedKingdomFragment2.u0().f29262y.setText(((StatementsSelectorDialog.a) s.J(arrayList2)).f13052a);
                            newPaymentUnitedKingdomFragment2.u0().f29261x.e();
                            newPaymentUnitedKingdomFragment2.U0(((StatementsSelectorDialog.a) s.J(arrayList2)).f13052a);
                            newPaymentUnitedKingdomFragment2.u0().f29263z.setVisibility(0);
                            newPaymentUnitedKingdomFragment2.V0();
                        } else {
                            newPaymentUnitedKingdomFragment2.V0();
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
                NewPaymentUnitedKingdomFragment newPaymentUnitedKingdomFragment3 = this.f21504b;
                newPaymentUnitedKingdomFragment3.u0().f29262y.setText(str4);
                newPaymentUnitedKingdomFragment3.u0().f29261x.e();
                newPaymentUnitedKingdomFragment3.U0(str4);
                break;
            default:
                this.f21504b.T0((String) obj, true);
                break;
        }
        return p.f3034a;
    }
}
