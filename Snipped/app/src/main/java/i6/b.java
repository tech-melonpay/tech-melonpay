package I6;

import C.v;
import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.auth.kyc.KycFragment;
import com.luminary.mobile.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KycFragment f1884b;

    public /* synthetic */ b(KycFragment kycFragment, int i) {
        this.f1883a = i;
        this.f1884b = kycFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f1883a) {
            case 0:
                this.f1884b.T0();
                break;
            case 1:
                v.w(U4.b.g(this.f1884b), R.id.action_kycFragment_to_supportFragment);
                break;
            default:
                this.f1884b.T0();
                break;
        }
        return p.f3034a;
    }
}
