package y8;

import F8.o;
import O9.p;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import ca.InterfaceC0635a;
import com.luminary.mobile.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.time.DurationUnit;
import la.c;
import t6.AbstractC1434s2;
import v8.DialogC1549a;

/* compiled from: TimerDialog.kt */
/* renamed from: y8.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogC1631l extends DialogC1549a {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f31151v = 0;

    /* renamed from: q, reason: collision with root package name */
    public final long f31152q;

    /* renamed from: r, reason: collision with root package name */
    public final String f31153r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC1434s2 f31154s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0635a<p> f31155t;

    /* renamed from: u, reason: collision with root package name */
    public CountDownTimer f31156u;

    /* compiled from: TimerDialog.kt */
    /* renamed from: y8.l$a */
    public static final class a extends CountDownTimer {
        public a(long j10) {
            super(j10, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            DialogC1631l dialogC1631l = DialogC1631l.this;
            InterfaceC0635a<p> interfaceC0635a = dialogC1631l.f31155t;
            if (interfaceC0635a != null) {
                interfaceC0635a.invoke();
            }
            CountDownTimer countDownTimer = dialogC1631l.f31156u;
            if (countDownTimer == null) {
                countDownTimer = null;
            }
            countDownTimer.cancel();
            dialogC1631l.dismiss();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
            DialogC1631l dialogC1631l = DialogC1631l.this;
            dialogC1631l.getClass();
            long j11 = j10 / 1000;
            c.a aVar = la.c.f23587b;
            long g10 = la.e.g(j11, DurationUnit.SECONDS);
            long l10 = la.c.l(g10, DurationUnit.HOURS);
            int f10 = la.c.f(g10);
            int h9 = la.c.h(g10);
            la.c.g(g10);
            dialogC1631l.f31154s.f29567q.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(l10), Integer.valueOf(f10), Integer.valueOf(h9)}, 3)));
            dialogC1631l.f31154s.f29566p.setCurrentProgress((dialogC1631l.f31152q * r1) - j11);
        }
    }

    public DialogC1631l(Context context, String str, long j10) {
        super(context);
        this.f31152q = j10;
        this.f31153r = str;
        LayoutInflater from = LayoutInflater.from(context);
        int i = AbstractC1434s2.f29563s;
        DataBinderMapperImpl dataBinderMapperImpl = F0.d.f1140a;
        AbstractC1434s2 abstractC1434s2 = (AbstractC1434s2) F0.f.f(from, R.layout.dialog_timer, null, false, null);
        this.f31154s = abstractC1434s2;
        setCancelable(false);
        setContentView(abstractC1434s2.f1148d);
        setCanceledOnTouchOutside(false);
    }

    @Override // com.google.android.material.bottomsheet.e, h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        j().setState(3);
        super.onCreate(bundle);
        AbstractC1434s2 abstractC1434s2 = this.f31154s;
        o.c(abstractC1434s2.f29564n, 500L, new g8.g(this, 25));
        abstractC1434s2.f29566p.setProgressTextAdapter(new s3.b(25));
        abstractC1434s2.f29565o.setText(this.f31153r);
        this.f31156u = new a(this.f31152q * 1000).start();
    }
}
