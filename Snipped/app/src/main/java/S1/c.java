package S1;

import android.content.DialogInterface;
import ca.InterfaceC0635a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0635a f3338b;

    public /* synthetic */ c() {
        this.f3337a = 1;
        this.f3338b = null;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f3337a) {
            case 0:
                InterfaceC0635a interfaceC0635a = this.f3338b;
                if (interfaceC0635a != null) {
                    interfaceC0635a.invoke();
                    break;
                }
                break;
            case 1:
                InterfaceC0635a interfaceC0635a2 = this.f3338b;
                if (interfaceC0635a2 != null) {
                    interfaceC0635a2.invoke();
                    break;
                }
                break;
            default:
                com.sumsub.sns.internal.core.android.c.a(this.f3338b, dialogInterface, i);
                break;
        }
    }

    public /* synthetic */ c(int i, InterfaceC0635a interfaceC0635a) {
        this.f3337a = i;
        this.f3338b = interfaceC0635a;
    }
}
