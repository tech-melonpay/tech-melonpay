package y8;

import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import java.util.Date;

/* compiled from: R8$$SyntheticClass */
/* renamed from: y8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1620a implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogC1622c f31124b;

    public /* synthetic */ C1620a(DialogC1622c dialogC1622c, int i) {
        this.f31123a = i;
        this.f31124b = dialogC1622c;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f31123a) {
            case 0:
                this.f31124b.l(true);
                break;
            case 1:
                this.f31124b.l(false);
                break;
            case 2:
                DialogC1622c dialogC1622c = this.f31124b;
                InterfaceC0650p<? super Date, ? super Date, p> interfaceC0650p = dialogC1622c.f31130s;
                if (interfaceC0650p != null) {
                    interfaceC0650p.invoke(dialogC1622c.f31131t, dialogC1622c.f31132u);
                }
                dialogC1622c.dismiss();
                break;
            case 3:
                DialogC1622c dialogC1622c2 = this.f31124b;
                InterfaceC0650p<? super Date, ? super Date, p> interfaceC0650p2 = dialogC1622c2.f31130s;
                if (interfaceC0650p2 != null) {
                    interfaceC0650p2.invoke(null, null);
                }
                dialogC1622c2.dismiss();
                break;
            default:
                this.f31124b.dismiss();
                break;
        }
        return p.f3034a;
    }
}
