package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import s1.AbstractC1197g;
import t1.k;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8156a = AbstractC1197g.e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AbstractC1197g.c().a(f8156a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            k b9 = k.b(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            b9.getClass();
            synchronized (k.f27437l) {
                try {
                    b9.i = goAsync;
                    if (b9.f27445h) {
                        goAsync.finish();
                        b9.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e10) {
            AbstractC1197g.c().b(f8156a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
