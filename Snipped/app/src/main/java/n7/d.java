package n7;

import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.CryptoListFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.views.dialogs.SelectorDialog;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import v5.C1545a;
import w5.C1572a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CryptoListFragment f24255b;

    public /* synthetic */ d(CryptoListFragment cryptoListFragment, int i) {
        this.f24254a = i;
        this.f24255b = cryptoListFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        List<C1572a> list;
        ArrayList<String> arrayList;
        List<C1572a> list2;
        final String str;
        CryptoAccountDomain cryptoAccountDomain;
        String str2;
        CryptoAccountDomain cryptoAccountDomain2;
        String str3;
        switch (this.f24254a) {
            case 0:
                CryptoListFragment cryptoListFragment = this.f24255b;
                if (cryptoListFragment.isAdded()) {
                    cryptoListFragment.u0().f28005w.k(cryptoListFragment.u0().f28005w.h(0), true);
                }
                break;
            case 1:
                CryptoListFragment cryptoListFragment2 = this.f24255b;
                cryptoListFragment2.getClass();
                StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(cryptoListFragment2.requireContext(), StatementsSelectorDialog.DialogType.f13046d);
                ArrayList arrayList2 = new ArrayList();
                C1545a value = cryptoListFragment2.U0().f24283a1.getValue();
                if (value != null && (list = value.f30602b) != null) {
                    for (C1572a c1572a : list) {
                        String str4 = c1572a.f30827b;
                        String str5 = str4 == null ? "" : str4;
                        String str6 = c1572a.f30830e;
                        if (str6 == null) {
                            str6 = "";
                        }
                        arrayList2.add(new StatementsSelectorDialog.a(str5, str6, str4 == null ? "" : str4, "", "", null, null, null, true, BERTags.FLAGS));
                    }
                }
                statementsSelectorDialog.f13040u = new b(cryptoListFragment2, 2);
                statementsSelectorDialog.show();
                StatementsSelectorDialog.l(statementsSelectorDialog, arrayList2);
                statementsSelectorDialog.m(cryptoListFragment2.getString(R.string.select_crypto));
                break;
            case 2:
                CryptoListFragment cryptoListFragment3 = this.f24255b;
                cryptoListFragment3.getClass();
                SelectorDialog selectorDialog = new SelectorDialog(cryptoListFragment3.requireContext());
                selectorDialog.f13206v = new b(cryptoListFragment3, 1);
                C1545a value2 = cryptoListFragment3.U0().f24283a1.getValue();
                C1572a c1572a2 = null;
                if (value2 != null && (list2 = value2.f30602b) != null) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (kotlin.jvm.internal.f.b(((C1572a) next).f30827b, cryptoListFragment3.f12072x0)) {
                                c1572a2 = next;
                            }
                        }
                    }
                    c1572a2 = c1572a2;
                }
                selectorDialog.show();
                selectorDialog.l();
                if (c1572a2 == null || (arrayList = c1572a2.f30829d) == null) {
                    arrayList = new ArrayList<>();
                }
                selectorDialog.m(new ArrayList(arrayList), false);
                selectorDialog.n(cryptoListFragment3.getString(R.string.select_network));
                break;
            case 3:
                CryptoListFragment cryptoListFragment4 = this.f24255b;
                final String str7 = cryptoListFragment4.f12072x0;
                if (str7 != null && (str = cryptoListFragment4.f12073y0) != null) {
                    final k U02 = cryptoListFragment4.U0();
                    com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.a aVar = cryptoListFragment4.f12065p0;
                    final String str8 = (aVar == null || (cryptoAccountDomain2 = aVar.f12087a) == null || (str3 = cryptoAccountDomain2.f10969g) == null) ? "" : str3;
                    final String str9 = (aVar == null || (cryptoAccountDomain = aVar.f12087a) == null || (str2 = cryptoAccountDomain.f10968f) == null) ? "" : str2;
                    final String valueOf = String.valueOf(cryptoListFragment4.u0().f27996n.getText());
                    U02.getClass();
                    InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: n7.g
                        @Override // ca.InterfaceC0635a
                        public final Object invoke() {
                            k kVar = k.this;
                            kVar.l();
                            v5.d dVar = new v5.d(kVar.f24276T0.h(), str7, str7, valueOf, str);
                            kVar.f24279W0.a(new h(kVar, str8, str9, 1), dVar);
                            return p.f3034a;
                        }
                    };
                    U02.f420L0 = interfaceC0635a;
                    interfaceC0635a.invoke();
                }
                break;
            default:
                this.f24255b.u0().f27997o.callOnClick();
                break;
        }
        return p.f3034a;
    }
}
