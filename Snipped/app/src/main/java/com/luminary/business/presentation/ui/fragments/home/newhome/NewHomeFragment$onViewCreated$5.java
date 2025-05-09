package com.luminary.business.presentation.ui.fragments.home.newhome;

import O9.p;
import android.os.Bundle;
import ca.InterfaceC0635a;
import com.luminary.mobile.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: NewHomeFragment.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class NewHomeFragment$onViewCreated$5 extends FunctionReferenceImpl implements InterfaceC0635a<p> {
    @Override // ca.InterfaceC0635a
    public final p invoke() {
        NewHomeFragment newHomeFragment = (NewHomeFragment) this.receiver;
        newHomeFragment.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isSend", false);
        bundle.putBoolean("isAll", true);
        U4.b.g(newHomeFragment).i(R.id.action_homeFragment_to_allTransactionFragment, bundle);
        return p.f3034a;
    }
}
