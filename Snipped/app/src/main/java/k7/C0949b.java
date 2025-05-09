package k7;

import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.fragments.crypto.create_new_account.CreateAccountFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.views.dialogs.SelectorDialog;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0969n;
import kotlin.jvm.internal.f;
import w5.C1572a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: k7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0949b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateAccountFragment f23031b;

    public /* synthetic */ C0949b(CreateAccountFragment createAccountFragment, int i) {
        this.f23030a = i;
        this.f23031b = createAccountFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        ArrayList arrayList;
        switch (this.f23030a) {
            case 0:
                CreateAccountFragment createAccountFragment = this.f23031b;
                createAccountFragment.f11992q0.clear();
                List<C1572a> value = createAccountFragment.U0().f23040X0.getValue();
                ArrayList arrayList2 = createAccountFragment.f11992q0;
                if (value != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : value) {
                        if (((C1572a) obj).f30827b != null) {
                            arrayList3.add(obj);
                        }
                    }
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C1572a c1572a = (C1572a) it.next();
                        Iterator<T> it2 = c1572a.f30829d.iterator();
                        boolean z10 = false;
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            String str = c1572a.f30827b;
                            if (hasNext) {
                                String str2 = (String) it2.next();
                                List<CryptoAccountDomain> value2 = createAccountFragment.U0().f23041Y0.getValue();
                                if (value2 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj2 : value2) {
                                        CryptoAccountDomain cryptoAccountDomain = (CryptoAccountDomain) obj2;
                                        if (f.b(cryptoAccountDomain.f10969g, str) && f.b(str2, cryptoAccountDomain.f10968f)) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList == null || arrayList.isEmpty()) {
                                    z10 = true;
                                }
                            } else if (z10) {
                                String str3 = str == null ? "" : str;
                                String str4 = c1572a.f30830e;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                arrayList2.add(new StatementsSelectorDialog.a(str3, str4, str == null ? "" : str, "", "", null, null, null, false, 480));
                            }
                        }
                    }
                }
                StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(createAccountFragment.requireContext(), StatementsSelectorDialog.DialogType.f13046d);
                statementsSelectorDialog.f13040u = new C0948a(createAccountFragment, 3);
                statementsSelectorDialog.show();
                StatementsSelectorDialog.l(statementsSelectorDialog, arrayList2);
                statementsSelectorDialog.m(createAccountFragment.getString(R.string.hub_crypto));
                return p.f3034a;
            case 1:
                CreateAccountFragment createAccountFragment2 = this.f23031b;
                if (createAccountFragment2.f11991p0 != null) {
                    SelectorDialog selectorDialog = new SelectorDialog(createAccountFragment2.requireContext());
                    selectorDialog.f13206v = new C0948a(createAccountFragment2, 2);
                    selectorDialog.show();
                    selectorDialog.l();
                    selectorDialog.m(createAccountFragment2.T0(), false);
                    selectorDialog.n(createAccountFragment2.getString(R.string.network));
                }
                return p.f3034a;
            case 2:
                CreateAccountFragment createAccountFragment3 = this.f23031b;
                e U02 = createAccountFragment3.U0();
                String obj3 = C0969n.u0(String.valueOf(createAccountFragment3.u0().f29511p.getText())).toString();
                String valueOf = String.valueOf(createAccountFragment3.u0().f29513r.getText());
                U02.getClass();
                D7.e eVar = new D7.e(obj3, valueOf, 4, U02);
                U02.f418J0 = eVar;
                eVar.invoke();
                return p.f3034a;
            case 3:
                this.f23031b.u0().f29509n.callOnClick();
                return p.f3034a;
            default:
                return Boolean.valueOf(U4.b.g(this.f23031b).l());
        }
    }
}
