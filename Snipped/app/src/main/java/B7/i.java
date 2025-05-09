package B7;

import android.view.View;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.fragments.home.newhome.NewHomeFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewHomeFragment f453b;

    public /* synthetic */ i(NewHomeFragment newHomeFragment, int i) {
        this.f452a = i;
        this.f453b = newHomeFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f452a) {
            case 0:
                NewHomeFragment newHomeFragment = this.f453b;
                if (newHomeFragment.isAdded()) {
                    newHomeFragment.U0().f113W0.I(false);
                    newHomeFragment.u0().f28398t.setDisplayedChild(0);
                    newHomeFragment.L0();
                    break;
                }
                break;
            case 1:
                NewHomeFragment newHomeFragment2 = this.f453b;
                if (newHomeFragment2.isAdded()) {
                    newHomeFragment2.U0().f113W0.I(true);
                    newHomeFragment2.u0().f28398t.setDisplayedChild(1);
                    newHomeFragment2.L0();
                    break;
                }
                break;
            case 2:
                NewHomeFragment newHomeFragment3 = this.f453b;
                if (newHomeFragment3.isAdded()) {
                    newHomeFragment3.u0().f28398t.setDisplayedChild(0);
                    newHomeFragment3.U0().f113W0.I(false);
                    newHomeFragment3.W0();
                    newHomeFragment3.L0();
                    ((MainActivity) newHomeFragment3.requireActivity()).A();
                    break;
                }
                break;
            default:
                NewHomeFragment newHomeFragment4 = this.f453b;
                if (newHomeFragment4.isAdded()) {
                    newHomeFragment4.u0().f28398t.setDisplayedChild(1);
                    newHomeFragment4.U0().f113W0.I(true);
                    newHomeFragment4.W0();
                    newHomeFragment4.L0();
                    ((MainActivity) newHomeFragment4.requireActivity()).A();
                    break;
                }
                break;
        }
    }
}
