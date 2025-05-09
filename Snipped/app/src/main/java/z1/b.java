package z1;

import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import s1.AbstractC1197g;

/* compiled from: BatteryNotLowTracker.java */
/* loaded from: classes.dex */
public final class b extends c<Boolean> {
    public static final String i = AbstractC1197g.e("BatteryNotLowTracker");

    @Override // z1.d
    public final Object a() {
        Intent registerReceiver = this.f31242b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        AbstractC1197g.c().b(i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // z1.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // z1.c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        AbstractC1197g.c().a(i, s3.b.j("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            c(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            c(Boolean.FALSE);
        }
    }
}
