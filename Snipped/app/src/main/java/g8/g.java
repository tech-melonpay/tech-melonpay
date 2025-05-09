package g8;

import O9.p;
import P9.m;
import android.os.Bundle;
import android.os.CountDownTimer;
import androidx.lifecycle.C0559z;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.domain.entity.templates.GetTemplatesDomain;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.CryptoListFragment;
import com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.DepositCryptoFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountFragment;
import com.luminary.business.presentation.ui.fragments.server_error.ServerErrorFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.fragments.statistics.StatisticsFragment;
import com.luminary.business.presentation.ui.fragments.status.StatusFragment;
import com.luminary.business.presentation.ui.fragments.support.SupportFragment;
import com.luminary.business.presentation.ui.views.dialogs.SelectorDialog;
import com.luminary.mobile.R;
import i7.C0829d;
import i7.C0830e;
import java.util.List;
import la.AbstractC0989a;
import o7.C1092b;
import o7.C1093c;
import p8.C1117b;
import p8.C1118c;
import s7.C1239c;
import s7.C1240d;
import t6.AbstractC1334f5;
import t6.AbstractC1350h5;
import t6.AbstractC1366j5;
import t6.AbstractC1367j6;
import t6.AbstractC1382l5;
import t6.M5;
import t7.C1491e;
import u7.C1522a;
import y8.DialogC1623d;
import y8.DialogC1631l;
import z6.C1647b;
import z6.C1648c;
import z7.C1650b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20828b;

    public /* synthetic */ g(Object obj, int i) {
        this.f20827a = i;
        this.f20828b = obj;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        Integer num;
        long read;
        InterfaceC0646l<? super List<String>, p> interfaceC0646l;
        Integer num2;
        switch (this.f20827a) {
            case 0:
                NewPaymentSwiftFragment newPaymentSwiftFragment = (NewPaymentSwiftFragment) this.f20828b;
                if (newPaymentSwiftFragment.X0()) {
                    NavController g10 = U4.b.g(newPaymentSwiftFragment);
                    PaymentUI paymentUI = newPaymentSwiftFragment.f12854q0;
                    if (paymentUI == null) {
                        paymentUI = null;
                    }
                    g10.j(new j(paymentUI, newPaymentSwiftFragment.T0().f20832b, newPaymentSwiftFragment.T0().f20833c));
                }
                return p.f3034a;
            case 1:
                ((AbstractC1334f5) this.f20828b).f29001r.callOnClick();
                return p.f3034a;
            case 2:
                ((AbstractC1350h5) this.f20828b).f29072v.callOnClick();
                return p.f3034a;
            case 3:
                NewPaymentToBankAccountFragment newPaymentToBankAccountFragment = (NewPaymentToBankAccountFragment) this.f20828b;
                if (newPaymentToBankAccountFragment.X0()) {
                    NavController g11 = U4.b.g(newPaymentToBankAccountFragment);
                    PaymentUI paymentUI2 = newPaymentToBankAccountFragment.f12892q0;
                    if (paymentUI2 == null) {
                        paymentUI2 = null;
                    }
                    g11.j(new h8.i(paymentUI2, newPaymentToBankAccountFragment.T0().f21220b, newPaymentToBankAccountFragment.u0().f29149s.isChecked(), newPaymentToBankAccountFragment.T0().f21221c));
                }
                return p.f3034a;
            case 4:
                ((AbstractC1366j5) this.f20828b).f29147q.callOnClick();
                return p.f3034a;
            case 5:
                C0830e c0830e = (C0830e) this.f20828b;
                c0830e.l();
                int h9 = c0830e.f21498T0.h();
                C0559z<CryptoExchangeDomain> c0559z = c0830e.f21501W0;
                CryptoExchangeDomain value = c0559z.getValue();
                int intValue = (value == null || (num = value.f11017a) == null) ? 0 : num.intValue();
                CryptoExchangeDomain value2 = c0559z.getValue();
                c0830e.f21499U0.a(new C0829d(c0830e, 1), new v5.g(intValue, h9, "ASSETS_SENT", value2 != null ? value2.f11022f : null, null));
                return p.f3034a;
            case 6:
                ((AbstractC1382l5) this.f20828b).f29259v.callOnClick();
                return p.f3034a;
            case 7:
                com.luminary.business.presentation.ui.fragments.payments.a aVar = (com.luminary.business.presentation.ui.fragments.payments.a) this.f20828b;
                aVar.l();
                aVar.f12954U0.a(new j8.e(aVar, 1), new GetTemplatesDomain(Long.valueOf(aVar.f12955V0.h()), null, null));
                return p.f3034a;
            case 8:
                return this.f20828b;
            case 9:
                l8.a aVar2 = (l8.a) ((ServerErrorFragment) this.f20828b).f12975o0.getValue();
                g gVar = new g(aVar2, 10);
                aVar2.f418J0 = gVar;
                gVar.invoke();
                return p.f3034a;
            case 10:
                l8.a aVar3 = (l8.a) this.f20828b;
                aVar3.l();
                aVar3.f23582T0.a(new C7.a(aVar3, 28), "");
                return p.f3034a;
            case 11:
                read = ((AbstractC0989a) this.f20828b).read();
                return Long.valueOf(read);
            case 12:
                ((StatementsSelectorDialog) this.f20828b).dismiss();
                return p.f3034a;
            case 13:
                DepositCryptoFragment depositCryptoFragment = (DepositCryptoFragment) this.f20828b;
                NavController g12 = U4.b.g(depositCryptoFragment);
                CryptoListFragment.DIRECTION direction = CryptoListFragment.DIRECTION.f12079a;
                C1092b c1092b = depositCryptoFragment.f12092o0;
                g12.j(new C1093c(c1092b != null ? c1092b.f24390a : null, direction));
                return p.f3034a;
            case 14:
                StatisticsFragment statisticsFragment = (StatisticsFragment) this.f20828b;
                statisticsFragment.H0(statisticsFragment.f13094p0);
                return p.f3034a;
            case 15:
                C1118c c1118c = (C1118c) this.f20828b;
                c1118c.l();
                c1118c.f25715V0.a(new C1117b(c1118c, 1), String.valueOf(c1118c.f25714U0.h()));
                return p.f3034a;
            case 16:
                Bundle a10 = t0.c.a();
                StatusFragment statusFragment = (StatusFragment) this.f20828b;
                statusFragment.getParentFragmentManager().f0("DONE", a10);
                statusFragment.requireActivity().onBackPressed();
                return p.f3034a;
            case 17:
                ((M5) this.f20828b).f28200v.callOnClick();
                return p.f3034a;
            case 18:
                SupportFragment supportFragment = (SupportFragment) this.f20828b;
                G5.a l10 = ((K5.a) supportFragment.f13114p0.getValue()).l();
                String str = l10 != null ? l10.f1320a : null;
                if (str == null || str.length() == 0) {
                    BaseFragment.q0(supportFragment, m.n(supportFragment.getString(R.string.support_email_app_name)));
                } else {
                    G5.a l11 = ((K5.a) supportFragment.f13114p0.getValue()).l();
                    BaseFragment.q0(supportFragment, m.n(l11 != null ? l11.f1320a : null));
                }
                return p.f3034a;
            case 19:
                C1240d c1240d = (C1240d) this.f20828b;
                c1240d.l();
                c1240d.f27052T0.h();
                c1240d.f27053U0.a(new C1239c(c1240d, 2), "");
                return p.f3034a;
            case 20:
                ((AbstractC1367j6) this.f20828b).f29156n.performClick();
                return p.f3034a;
            case 21:
                s8.d dVar = (s8.d) this.f20828b;
                dVar.l();
                dVar.f27063U0.a(new s8.c(dVar, 0), String.valueOf(dVar.f27062T0.h()));
                return p.f3034a;
            case 22:
                t7.f fVar = (t7.f) this.f20828b;
                fVar.l();
                fVar.f29927T0.h();
                fVar.f29928U0.a(new C1491e(fVar, 2), "");
                return p.f3034a;
            case 23:
                ((DialogC1623d) this.f20828b).dismiss();
                return p.f3034a;
            case 24:
                SelectorDialog selectorDialog = (SelectorDialog) this.f20828b;
                if (selectorDialog.f13203s && (interfaceC0646l = selectorDialog.f13207w) != null) {
                    interfaceC0646l.invoke(selectorDialog.f13204t);
                }
                selectorDialog.dismiss();
                return p.f3034a;
            case 25:
                DialogC1631l dialogC1631l = (DialogC1631l) this.f20828b;
                CountDownTimer countDownTimer = dialogC1631l.f31156u;
                if (countDownTimer == null) {
                    countDownTimer = null;
                }
                countDownTimer.cancel();
                dialogC1631l.dismiss();
                InterfaceC0635a<p> interfaceC0635a = dialogC1631l.f31155t;
                if (interfaceC0635a != null) {
                    interfaceC0635a.invoke();
                }
                return p.f3034a;
            case 26:
                InterfaceC0635a interfaceC0635a2 = ((m8.b) this.f20828b).f24015r;
                if (interfaceC0635a2 != null) {
                    interfaceC0635a2.invoke();
                }
                return p.f3034a;
            case 27:
                C1648c c1648c = (C1648c) this.f20828b;
                c1648c.l();
                p pVar = p.f3034a;
                c1648c.f31330T0.a(new C1647b(c1648c, 0), pVar);
                return pVar;
            default:
                C1650b c1650b = (C1650b) this.f20828b;
                c1650b.l();
                u5.d u6 = c1650b.f31337U0.u();
                String num3 = (u6 == null || (num2 = u6.f30237a) == null) ? null : num2.toString();
                c1650b.f31336T0.a(new C1522a(c1650b, 4), Integer.valueOf(num3 != null ? Integer.parseInt(num3) : 0));
                return p.f3034a;
        }
    }
}
