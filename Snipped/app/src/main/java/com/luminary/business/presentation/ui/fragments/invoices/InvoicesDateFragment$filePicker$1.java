package com.luminary.business.presentation.ui.fragments.invoices;

import D7.d;
import D7.g;
import F8.e;
import O9.p;
import android.net.Uri;
import ca.InterfaceC0646l;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: InvoicesDateFragment.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class InvoicesDateFragment$filePicker$1 extends FunctionReferenceImpl implements InterfaceC0646l<Uri, p> {
    @Override // ca.InterfaceC0646l
    public final p invoke(Uri uri) {
        String str;
        InvoicesDateFragment invoicesDateFragment = (InvoicesDateFragment) this.receiver;
        String b9 = e.b(invoicesDateFragment.requireActivity(), uri);
        String c2 = e.c(invoicesDateFragment.requireContext(), invoicesDateFragment.f12292w0.f13322b);
        if (c2 != null && (str = invoicesDateFragment.f12291v0) != null) {
            g T02 = invoicesDateFragment.T0();
            T02.getClass();
            d dVar = new d(T02, str, c2, b9, 0);
            T02.f419K0 = dVar;
            dVar.invoke();
        }
        return p.f3034a;
    }
}
