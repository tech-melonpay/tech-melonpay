package I7;

import android.widget.SeekBar;
import com.luminary.business.presentation.ui.fragments.loans.LoansFragment;
import com.luminary.mobile.R;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: LoansFragment.kt */
/* loaded from: classes2.dex */
public final class e implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoansFragment f1905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$FloatRef f1906b;

    public e(LoansFragment loansFragment, Ref$FloatRef ref$FloatRef) {
        this.f1905a = loansFragment;
        this.f1906b = ref$FloatRef;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z10) {
        LoansFragment loansFragment = this.f1905a;
        loansFragment.u0().f29141x.setText(i == 0 ? loansFragment.getString(R.string.month, Integer.valueOf(i + 1)) : loansFragment.getString(R.string.months, Integer.valueOf(i + 1)));
        if (1 <= i && i < 22) {
            float T = seekBar.getThumb().getBounds().left - D9.b.T(10);
            Ref$FloatRef ref$FloatRef = this.f1906b;
            ref$FloatRef.f23176a = T;
            loansFragment.u0().f29141x.setX(ref$FloatRef.f23176a);
        }
        loansFragment.s0 = i + 1;
        loansFragment.T0();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
