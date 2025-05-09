package com.luminary.business.presentation.ui.fragments.home.newhome;

import C.v;
import O9.p;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.C0559z;
import androidx.navigation.NavController;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.mobile.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f;

/* compiled from: NewHomeFragment.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class NewHomeFragment$onViewCreated$10 extends FunctionReferenceImpl implements InterfaceC0646l<String, p> {
    @Override // ca.InterfaceC0646l
    public final p invoke(String str) {
        List<CryptoExchangeDomain> value;
        Object obj;
        String str2 = str;
        NewHomeFragment newHomeFragment = (NewHomeFragment) this.receiver;
        C0559z<List<CryptoExchangeDomain>> c0559z = newHomeFragment.U0().f123g1;
        if (c0559z != null && (value = c0559z.getValue()) != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = ((CryptoExchangeDomain) next).f11017a;
                if (f.b(num != null ? num.toString() : null, str2)) {
                    obj = next;
                    break;
                }
            }
            Serializable serializable = (CryptoExchangeDomain) obj;
            if (serializable != null) {
                NavController g10 = U4.b.g(newHomeFragment);
                Bundle g11 = v.g(g10);
                if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                    g11.putParcelable("exchange", (Parcelable) serializable);
                } else {
                    if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                        throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    g11.putSerializable("exchange", serializable);
                }
                g10.i(R.id.action_homeFragment_to_exchangeDetailsFragment, g11);
            }
        }
        return p.f3034a;
    }
}
