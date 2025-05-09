package I7;

import com.luminary.business.presentation.ui.fragments.loans.LoansFragment;
import com.luminary.mobile.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoansFragment f1898b;

    public /* synthetic */ a(LoansFragment loansFragment, int i) {
        this.f1897a = i;
        this.f1898b = loansFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1897a) {
            case 0:
                LoansFragment loansFragment = this.f1898b;
                int i = loansFragment.s0;
                if (i <= 1) {
                    loansFragment.u0().f29141x.setX(46.5f);
                } else if (i >= 21) {
                    loansFragment.u0().f29141x.setX(700.0f);
                }
                int i9 = loansFragment.s0;
                loansFragment.u0().f29141x.setText(i9 + (-1) == 0 ? loansFragment.getString(R.string.month, Integer.valueOf(i9)) : loansFragment.getString(R.string.months, Integer.valueOf(i9)));
                loansFragment.u0().f29141x.setVisibility(0);
                break;
            default:
                this.f1898b.T0();
                break;
        }
    }
}
