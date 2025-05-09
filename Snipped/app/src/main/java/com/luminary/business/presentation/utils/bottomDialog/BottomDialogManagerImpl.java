package com.luminary.business.presentation.utils.bottomDialog;

import android.content.Context;
import ca.InterfaceC0635a;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: BottomDialogManagerImpl.kt */
/* loaded from: classes2.dex */
public final class BottomDialogManagerImpl implements D8.a {

    /* renamed from: a, reason: collision with root package name */
    public a f13283a;

    @Override // D8.a
    public final boolean a() {
        a aVar = this.f13283a;
        if (aVar == null) {
            aVar = null;
        }
        return aVar.isShowing();
    }

    @Override // D8.a
    public final void b(Context context) {
        this.f13283a = new a(context);
    }

    @Override // D8.a
    public final void c(BottomDialogType bottomDialogType, InterfaceC0635a<? extends Object> interfaceC0635a, InterfaceC0635a<? extends Object> interfaceC0635a2) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new BottomDialogManagerImpl$show$1(this, interfaceC0635a, interfaceC0635a2, bottomDialogType, null), 2, null);
    }

    @Override // D8.a
    public final void dismiss() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new BottomDialogManagerImpl$dismiss$1(this, null), 2, null);
    }
}
