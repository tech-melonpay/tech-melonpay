package G7;

import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.limits.CardLimitsFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountFragment;
import t6.U2;

/* compiled from: FragmentExt.kt */
/* loaded from: classes2.dex */
public final class c implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f1342b;

    public /* synthetic */ c(BaseFragment baseFragment, int i) {
        this.f1341a = i;
        this.f1342b = baseFragment;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        z5.b bVar;
        String d10;
        String d11;
        String d12;
        String d13;
        z5.b bVar2;
        String d14;
        String d15;
        String d16;
        String d17;
        String r02;
        String r03;
        switch (this.f1341a) {
            case 0:
                z5.c cVar = (z5.c) obj;
                if (cVar != null) {
                    String str = null;
                    CardLimitsFragment cardLimitsFragment = (CardLimitsFragment) this.f1342b;
                    String str2 = cVar.f31286a;
                    z5.b bVar3 = cVar.f31289d;
                    if (bVar3 != null && (bVar2 = cVar.f31298n) != null) {
                        String str3 = str2 == null ? "" : str2;
                        U2 u02 = cardLimitsFragment.u0();
                        Double d18 = bVar3.f31284b;
                        Double d19 = bVar3.f31283a;
                        u02.f28550E.setProgress(CardLimitsFragment.T0(d19, d18));
                        Double d20 = bVar3.f31285c;
                        u02.f28557q.setText((d20 == null || (d17 = d20.toString()) == null) ? null : D9.b.J(d17, str3));
                        u02.f28558r.setText((d19 == null || (d16 = d19.toString()) == null) ? null : D9.b.J(d16, str3));
                        Double d21 = bVar2.f31284b;
                        Double d22 = bVar2.f31283a;
                        u02.f28551F.setProgress(CardLimitsFragment.T0(d22, d21));
                        Double d23 = bVar2.f31285c;
                        u02.f28560t.setText((d23 == null || (d15 = d23.toString()) == null) ? null : D9.b.J(d15, str3));
                        u02.f28561u.setText((d22 == null || (d14 = d22.toString()) == null) ? null : D9.b.J(d14, str3));
                    }
                    z5.b bVar4 = cVar.f31290e;
                    if (bVar4 != null && (bVar = cVar.f31299o) != null) {
                        String str4 = str2 != null ? str2 : "";
                        U2 u03 = cardLimitsFragment.u0();
                        Double d24 = bVar4.f31284b;
                        Double d25 = bVar4.f31283a;
                        int T02 = CardLimitsFragment.T0(d25, d24);
                        Double d26 = bVar.f31284b;
                        Double d27 = bVar.f31283a;
                        int T03 = CardLimitsFragment.T0(d27, d26);
                        u03.f28552G.setProgress(T02);
                        u03.f28553H.setProgress(T03);
                        Double d28 = bVar4.f31285c;
                        u03.f28565y.setText((d28 == null || (d13 = d28.toString()) == null) ? null : D9.b.J(d13, str4));
                        u03.f28566z.setText((d25 == null || (d12 = d25.toString()) == null) ? null : D9.b.J(d12, str4));
                        Double d29 = bVar.f31285c;
                        u03.f28547B.setText((d29 == null || (d11 = d29.toString()) == null) ? null : D9.b.J(d11, str4));
                        if (d27 != null && (d10 = d27.toString()) != null) {
                            str = D9.b.J(d10, str4);
                        }
                        u03.f28548C.setText(str);
                    }
                }
                break;
            case 1:
                B5.a aVar = (B5.a) obj;
                NewPaymentBankEmailFragment newPaymentBankEmailFragment = (NewPaymentBankEmailFragment) this.f1342b;
                PaymentUI paymentUI = newPaymentBankEmailFragment.f12743q0;
                if (paymentUI == null) {
                    paymentUI = null;
                }
                String o10 = D9.b.o(paymentUI.f11337h, aVar.f295b);
                PaymentUI paymentUI2 = newPaymentBankEmailFragment.f12743q0;
                PaymentUI paymentUI3 = paymentUI2 != null ? paymentUI2 : null;
                String str5 = aVar.f295b;
                paymentUI3.f11345q = (str5 == null || (r02 = D9.b.r0(str5)) == null) ? 0.0f : Float.parseFloat(r02);
                newPaymentBankEmailFragment.u0().f28645y.setText(o10);
                break;
            default:
                B5.a aVar2 = (B5.a) obj;
                NewPaymentToBankAccountFragment newPaymentToBankAccountFragment = (NewPaymentToBankAccountFragment) this.f1342b;
                PaymentUI paymentUI4 = newPaymentToBankAccountFragment.f12892q0;
                if (paymentUI4 == null) {
                    paymentUI4 = null;
                }
                String o11 = D9.b.o(paymentUI4.f11337h, aVar2.f295b);
                PaymentUI paymentUI5 = newPaymentToBankAccountFragment.f12892q0;
                PaymentUI paymentUI6 = paymentUI5 != null ? paymentUI5 : null;
                String str6 = aVar2.f295b;
                paymentUI6.f11345q = (str6 == null || (r03 = D9.b.r0(str6)) == null) ? 0.0f : Float.parseFloat(r03);
                newPaymentToBankAccountFragment.u0().f29150t.setText(o11);
                break;
        }
        return p.f3034a;
    }
}
