package e7;

import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CreateNewVirtualCardFragment.kt */
/* renamed from: e7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0724d {
    public static final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VaultDomain vaultDomain = (VaultDomain) it.next();
            String str = vaultDomain.f10781d;
            StatementsSelectorDialog.a aVar = str != null ? new StatementsSelectorDialog.a(str, "", "", "", "", null, "", Integer.valueOf(vaultDomain.f10778a), false, 288) : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
