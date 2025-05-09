package androidx.work.impl.background.systemalarm;

import C1.g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import s1.AbstractC1197g;
import t1.k;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8152a = AbstractC1197g.e("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f8153a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f8154b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f8155c;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f8153a = intent;
            this.f8154b = context;
            this.f8155c = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f8155c;
            Context context = this.f8154b;
            Intent intent = this.f8153a;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                AbstractC1197g.c().a(ConstraintProxyUpdateReceiver.f8152a, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
                g.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                g.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                g.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                g.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            AbstractC1197g.c().a(f8152a, s3.b.j("Ignoring unknown action ", action), new Throwable[0]);
        } else {
            ((D1.b) k.b(context).f27441d).a(new a(intent, context, goAsync()));
        }
    }
}
