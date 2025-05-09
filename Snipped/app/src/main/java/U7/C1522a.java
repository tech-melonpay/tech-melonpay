package u7;

import C.v;
import D8.a;
import J5.a;
import O9.p;
import P9.s;
import ca.InterfaceC0646l;
import ca.InterfaceC0651q;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.WithdrawCryptoFragment;
import com.luminary.business.presentation.ui.fragments.edit_account.EditAccountFragment;
import com.luminary.business.presentation.ui.views.dialogs.SelectorDialog;
import com.luminary.business.presentation.ui.views.dialogs.SortStatisticsDialog;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import java.util.List;
import ka.C0969n;
import kotlin.NoWhenBranchMatchedException;
import v7.C1548b;
import z7.C1650b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: u7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1522a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30326b;

    public /* synthetic */ C1522a(Object obj, int i) {
        this.f30325a = i;
        this.f30326b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        String plainString;
        Object obj2 = this.f30326b;
        switch (this.f30325a) {
            case 0:
                CryptoExchangeDomain cryptoExchangeDomain = (CryptoExchangeDomain) obj;
                String str = null;
                Double d10 = cryptoExchangeDomain != null ? cryptoExchangeDomain.f11029n : null;
                String str2 = cryptoExchangeDomain != null ? cryptoExchangeDomain.f11027l : null;
                WithdrawCryptoFragment withdrawCryptoFragment = (WithdrawCryptoFragment) obj2;
                withdrawCryptoFragment.getClass();
                BottomDialogType.f13289k.getClass();
                BottomDialogType a10 = BottomDialogType.a.a();
                if (d10 != null && (plainString = new BigDecimal(String.valueOf(d10.doubleValue())).toPlainString()) != null) {
                    str = D9.b.I(plainString, str2);
                }
                a10.f13295a = withdrawCryptoFragment.getString(R.string.withdrawn, v.p(str, " ", str2));
                a10.f13301g = BottomDialogType.Type.OK;
                a10.f13297c = withdrawCryptoFragment.getString(R.string.done);
                a.C0010a.a(withdrawCryptoFragment.w0(), a10, new C1523b(withdrawCryptoFragment, 3), 4);
                return p.f3034a;
            case 1:
                EditAccountFragment editAccountFragment = (EditAccountFragment) obj2;
                ((C1548b) editAccountFragment.f12202o0.getValue()).f30661a.i = C0969n.u0(String.valueOf(editAccountFragment.u0().f28276v.getText())).toString();
                U4.b.g(editAccountFragment).l();
                return p.f3034a;
            case 2:
                String str3 = (String) obj;
                SelectorDialog selectorDialog = (SelectorDialog) obj2;
                if (selectorDialog.f13203s) {
                    if (selectorDialog.f13204t.contains(str3)) {
                        selectorDialog.f13204t.remove(str3);
                    } else {
                        selectorDialog.f13204t.add(str3);
                    }
                    SelectorDialog.SelectorController selectorController = selectorDialog.f13202r;
                    if (selectorController != null) {
                        selectorController.setData(selectorDialog.f13205u, selectorDialog.f13204t);
                    }
                    selectorDialog.f13201q.f28091n.setEnabled((selectorDialog.f13204t.isEmpty() ^ true) && selectorDialog.f13203s);
                } else {
                    InterfaceC0646l<? super String, p> interfaceC0646l = selectorDialog.f13206v;
                    if (interfaceC0646l != null) {
                        interfaceC0646l.invoke(str3);
                    }
                    selectorDialog.dismiss();
                }
                return p.f3034a;
            case 3:
                x0.b bVar = (x0.b) obj;
                SortStatisticsDialog sortStatisticsDialog = (SortStatisticsDialog) obj2;
                InterfaceC0651q<? super SortStatisticsDialog.StatisticType, ? super Long, ? super Long, p> interfaceC0651q = sortStatisticsDialog.f13229r;
                if (interfaceC0651q != null) {
                    interfaceC0651q.invoke(SortStatisticsDialog.StatisticType.f13231a, bVar.f30903a, bVar.f30904b);
                }
                sortStatisticsDialog.dismiss();
                return p.f3034a;
            default:
                J5.a aVar = (J5.a) obj;
                aVar.getClass();
                C1650b c1650b = (C1650b) obj2;
                if (aVar instanceof a.C0026a) {
                    J5.b bVar2 = (J5.b) ((a.C0026a) aVar).f2145a;
                    c1650b.k();
                    if (c1650b.a(bVar2)) {
                        c1650b.f413E0 = c1650b.f418J0;
                    }
                    if (!c1650b.c(bVar2)) {
                        c1650b.d(bVar2);
                    }
                    p pVar = p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list = (List) ((a.b) aVar).f2146a;
                    c1650b.k();
                    c1650b.f31338V0.postValue(s.X(list, new A7.d(15)));
                    p pVar2 = p.f3034a;
                }
                return p.f3034a;
        }
    }
}
