package com.luminary.business.presentation.ui.fragments.home.newhome;

import C.v;
import O9.p;
import P9.z;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.navigation.NavController;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.presentation.entity.account.AccountDetailsUI;
import com.luminary.mobile.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f;

/* compiled from: NewHomeFragment.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class NewHomeFragment$onViewCreated$2 extends FunctionReferenceImpl implements InterfaceC0646l<String, p> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final p invoke(String str) {
        BankAccountDomain bankAccountDomain;
        Object obj;
        String str2 = str;
        NewHomeFragment newHomeFragment = (NewHomeFragment) this.receiver;
        Log.e("TAG", "openAccount:  " + newHomeFragment.isAdded() + " ");
        List<BankAccountDomain> value = newHomeFragment.U0().f118b1.getValue();
        LinkedHashMap linkedHashMap = null;
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (f.b(((BankAccountDomain) obj).f10700g, str2)) {
                    break;
                }
            }
            bankAccountDomain = (BankAccountDomain) obj;
        } else {
            bankAccountDomain = null;
        }
        if (newHomeFragment.isAdded() && bankAccountDomain != null) {
            NavController g10 = U4.b.g(newHomeFragment);
            Map<String, BankAccountDomain.ProviderRequisiteDomain> map = bankAccountDomain.f10699f;
            if (map != null) {
                linkedHashMap = new LinkedHashMap(z.n(map.size()));
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object key = entry.getKey();
                    BankAccountDomain.ProviderRequisiteDomain providerRequisiteDomain = (BankAccountDomain.ProviderRequisiteDomain) entry.getValue();
                    linkedHashMap.put(key, new AccountDetailsUI.ProviderRequisiteUI(providerRequisiteDomain.f10712a, providerRequisiteDomain.f10713b, providerRequisiteDomain.f10714c, providerRequisiteDomain.f10715d, providerRequisiteDomain.f10716e, providerRequisiteDomain.f10717f, providerRequisiteDomain.f10718g, providerRequisiteDomain.f10719h, providerRequisiteDomain.i, providerRequisiteDomain.f10720j, providerRequisiteDomain.f10721k, providerRequisiteDomain.f10722l, providerRequisiteDomain.f10723m));
                    it2 = it2;
                    g10 = g10;
                    bankAccountDomain = bankAccountDomain;
                }
            }
            NavController navController = g10;
            BankAccountDomain bankAccountDomain2 = bankAccountDomain;
            AccountDetailsUI accountDetailsUI = new AccountDetailsUI(bankAccountDomain2.f10694a, bankAccountDomain2.f10695b, bankAccountDomain2.f10696c, bankAccountDomain2.f10697d, bankAccountDomain2.f10698e, linkedHashMap, bankAccountDomain2.f10700g, bankAccountDomain2.f10701h, bankAccountDomain2.i, bankAccountDomain2.f10702j, bankAccountDomain2.f10703k, bankAccountDomain2.f10704l);
            accountDetailsUI.f11175m = bankAccountDomain2.f10711s;
            Bundle g11 = v.g(navController);
            if (Parcelable.class.isAssignableFrom(AccountDetailsUI.class)) {
                g11.putParcelable("accountUI", accountDetailsUI);
            } else {
                if (!Serializable.class.isAssignableFrom(AccountDetailsUI.class)) {
                    throw new UnsupportedOperationException(AccountDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                g11.putSerializable("accountUI", (Serializable) accountDetailsUI);
            }
            navController.i(R.id.action_homeFragment_to_accountDetailsFragment, g11);
        }
        return p.f3034a;
    }
}
