package com.sumsub.sns.presentation.screen.verification;

import android.app.Activity;
import android.content.DialogInterface;
import ca.InterfaceC0635a;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20179c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f20177a = i;
        this.f20178b = obj;
        this.f20179c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f20177a) {
            case 0:
                a.a((a) this.f20178b, (Map) this.f20179c, dialogInterface, i);
                break;
            case 1:
                a.b((a) this.f20178b, (Map) this.f20179c, dialogInterface, i);
                break;
            default:
                com.sumsub.sns.internal.core.android.c.a((InterfaceC0635a) this.f20178b, (Activity) this.f20179c, dialogInterface, i);
                break;
        }
    }
}
