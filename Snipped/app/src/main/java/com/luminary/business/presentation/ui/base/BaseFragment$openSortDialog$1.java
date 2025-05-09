package com.luminary.business.presentation.ui.base;

import O9.p;
import ca.InterfaceC0650p;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BaseFragment.kt */
/* loaded from: classes2.dex */
final /* synthetic */ class BaseFragment$openSortDialog$1 extends FunctionReferenceImpl implements InterfaceC0650p<SortDialog.Status, SortDialog.Direction, p> {
    @Override // ca.InterfaceC0650p
    public final p invoke(SortDialog.Status status, SortDialog.Direction direction) {
        ((BaseFragment) this.receiver).E0(status, direction);
        return p.f3034a;
    }
}
