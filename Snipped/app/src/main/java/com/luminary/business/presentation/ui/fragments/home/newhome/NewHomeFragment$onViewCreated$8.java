package com.luminary.business.presentation.ui.fragments.home.newhome;

import C.v;
import O9.p;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavController;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.mobile.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: NewHomeFragment.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class NewHomeFragment$onViewCreated$8 extends FunctionReferenceImpl implements InterfaceC0646l<Long, p> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final p invoke(Long l10) {
        long longValue = l10.longValue();
        NewHomeFragment newHomeFragment = (NewHomeFragment) this.receiver;
        List<CryptoAccountDomain> value = newHomeFragment.U0().f122f1.getValue();
        Serializable serializable = null;
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Long l11 = ((CryptoAccountDomain) next).f10963a;
                if (l11 != null && l11.longValue() == longValue) {
                    serializable = next;
                    break;
                }
            }
            serializable = (CryptoAccountDomain) serializable;
        }
        if (serializable != null) {
            NavController g10 = U4.b.g(newHomeFragment);
            Bundle g11 = v.g(g10);
            if (Parcelable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                g11.putParcelable("account", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                    throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                g11.putSerializable("account", serializable);
            }
            g10.i(R.id.action_homeFragment_to_cryptoAccountDetailsFragment, g11);
        }
        return p.f3034a;
    }
}
