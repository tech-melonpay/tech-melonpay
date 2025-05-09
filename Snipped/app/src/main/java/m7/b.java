package M7;

import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.newcard.confirmorder.ConfirmOrderFragment;
import com.luminary.mobile.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConfirmOrderFragment f2728b;

    public /* synthetic */ b(ConfirmOrderFragment confirmOrderFragment, int i) {
        this.f2727a = i;
        this.f2728b = confirmOrderFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f2727a) {
            case 0:
                this.f2728b.u0().f29186o.callOnClick();
                return p.f3034a;
            case 1:
                return Boolean.valueOf(U4.b.g(this.f2728b).m(R.id.newCardListFragment, false));
            default:
                return Boolean.valueOf(U4.b.g(this.f2728b).m(R.id.cardsFragment, false));
        }
    }
}
