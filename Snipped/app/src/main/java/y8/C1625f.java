package y8;

import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;

/* compiled from: R8$$SyntheticClass */
/* renamed from: y8.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1625f implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SortDialog f31140b;

    public /* synthetic */ C1625f(SortDialog sortDialog, int i) {
        this.f31139a = i;
        this.f31140b = sortDialog;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f31139a) {
            case 0:
                this.f31140b.dismiss();
                break;
            case 1:
                SortDialog sortDialog = this.f31140b;
                InterfaceC0650p<? super SortDialog.Status, ? super SortDialog.Direction, p> interfaceC0650p = sortDialog.f13210q;
                if (interfaceC0650p != null) {
                    interfaceC0650p.invoke(SortDialog.Status.f13217a, sortDialog.f13212s);
                }
                sortDialog.dismiss();
                break;
            case 2:
                SortDialog sortDialog2 = this.f31140b;
                InterfaceC0650p<? super SortDialog.Status, ? super SortDialog.Direction, p> interfaceC0650p2 = sortDialog2.f13210q;
                if (interfaceC0650p2 != null) {
                    interfaceC0650p2.invoke(SortDialog.Status.f13218b, sortDialog2.f13212s);
                }
                sortDialog2.dismiss();
                break;
            case 3:
                SortDialog sortDialog3 = this.f31140b;
                InterfaceC0650p<? super SortDialog.Status, ? super SortDialog.Direction, p> interfaceC0650p3 = sortDialog3.f13210q;
                if (interfaceC0650p3 != null) {
                    interfaceC0650p3.invoke(SortDialog.Status.f13219c, sortDialog3.f13212s);
                }
                sortDialog3.dismiss();
                break;
            default:
                SortDialog sortDialog4 = this.f31140b;
                InterfaceC0650p<? super SortDialog.Status, ? super SortDialog.Direction, p> interfaceC0650p4 = sortDialog4.f13210q;
                if (interfaceC0650p4 != null) {
                    interfaceC0650p4.invoke(SortDialog.Status.f13220d, sortDialog4.f13212s);
                }
                sortDialog4.dismiss();
                break;
        }
        return p.f3034a;
    }
}
