package s8;

import android.os.CountDownTimer;
import com.luminary.business.presentation.ui.fragments.tfa.TfaFragment;
import com.luminary.mobile.R;
import java.util.Arrays;
import t6.AbstractC1367j6;

/* compiled from: TfaFragment.kt */
/* renamed from: s8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CountDownTimerC1242b extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TfaFragment f27059a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC1242b(TfaFragment tfaFragment) {
        super(120000L, 1000L);
        this.f27059a = tfaFragment;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        TfaFragment tfaFragment = this.f27059a;
        tfaFragment.u0().f29160r.setEnabled(true);
        AbstractC1367j6 u02 = tfaFragment.u0();
        u02.f29160r.setText(tfaFragment.getString(R.string.default_resend_code_tfa));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        long j11 = j10 / 1000;
        long j12 = 60;
        String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j11 / j12), Long.valueOf(j11 % j12)}, 2));
        TfaFragment tfaFragment = this.f27059a;
        tfaFragment.u0().f29160r.setText(tfaFragment.getString(R.string.default_resend_code_tfa) + "    " + format + " ");
    }
}
