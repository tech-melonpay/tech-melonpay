package com.sumsub.sns.videoident.presentation;

import O9.f;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/Q;", "VM", "Landroidx/lifecycle/T;", "invoke", "()Landroidx/lifecycle/T;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LanguageSelectionFragment$special$$inlined$viewModels$default$5 extends Lambda implements InterfaceC0635a<T> {
    final /* synthetic */ f $owner$delegate;
    final /* synthetic */ Fragment $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSelectionFragment$special$$inlined$viewModels$default$5(Fragment fragment, f fVar) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = fVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ca.InterfaceC0635a
    public final T invoke() {
        T defaultViewModelProviderFactory;
        X x9 = (X) this.$owner$delegate.getValue();
        InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
        return (interfaceC0543i == null || (defaultViewModelProviderFactory = interfaceC0543i.getDefaultViewModelProviderFactory()) == null) ? this.$this_viewModels.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
    }
}
