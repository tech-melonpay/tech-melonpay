package T6;

import C.v;
import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.cards.CardsFragment;
import com.luminary.mobile.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardsFragment f3561b;

    public /* synthetic */ c(CardsFragment cardsFragment, int i) {
        this.f3560a = i;
        this.f3561b = cardsFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f3560a) {
            case 0:
                U4.b.g(this.f3561b).j(new e(null, null, null, null, null, null));
                break;
            case 1:
                v.w(U4.b.g(this.f3561b), R.id.actionToCreateCardFragment);
                break;
            default:
                v.w(U4.b.g(this.f3561b), R.id.actionToCreateCardFragment);
                break;
        }
        return p.f3034a;
    }
}
