package com.luminary.business.presentation.ui.fragments.home.newhome;

import B7.k;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f;

/* compiled from: NewHomeFragment.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class NewHomeFragment$onViewCreated$4 extends FunctionReferenceImpl implements InterfaceC0646l<String, p> {
    @Override // ca.InterfaceC0646l
    public final p invoke(String str) {
        Object obj;
        String str2 = str;
        NewHomeFragment newHomeFragment = (NewHomeFragment) this.receiver;
        List<TransactionUI> value = newHomeFragment.U0().f119c1.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (f.b(((TransactionUI) obj).f11371a, str2)) {
                    break;
                }
            }
            TransactionUI transactionUI = (TransactionUI) obj;
            if (transactionUI != null) {
                U4.b.g(newHomeFragment).j(new k(str2, transactionUI));
            }
        }
        return p.f3034a;
    }
}
