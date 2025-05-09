package androidx.work.impl.utils;

import C1.j;
import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.a;
import java.util.concurrent.TimeUnit;
import s1.AbstractC1197g;
import t0.C1274a;
import t1.k;

/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f8210d = AbstractC1197g.e("ForceStopRunnable");

    /* renamed from: e, reason: collision with root package name */
    public static final long f8211e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f8212a;

    /* renamed from: b, reason: collision with root package name */
    public final k f8213b;

    /* renamed from: c, reason: collision with root package name */
    public int f8214c = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public static final String f8215a = AbstractC1197g.e("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            if (((AbstractC1197g.a) AbstractC1197g.c()).f26513b <= 2) {
                Log.v(f8215a, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.c(context);
        }
    }

    public ForceStopRunnable(Context context, k kVar) {
        this.f8212a = context.getApplicationContext();
        this.f8213b = kVar;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = C1274a.b() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + f8211e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.a():void");
    }

    public final boolean b() {
        a aVar = this.f8213b.f27439b;
        aVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f8210d;
        if (isEmpty) {
            AbstractC1197g.c().a(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a10 = j.a(this.f8212a, aVar);
        AbstractC1197g.c().a(str, "Is default app process = " + a10, new Throwable[0]);
        return a10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f8210d;
        k kVar = this.f8213b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                t1.j.a(this.f8212a);
                AbstractC1197g.c().a(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                    int i = this.f8214c + 1;
                    this.f8214c = i;
                    if (i >= 3) {
                        AbstractC1197g.c().b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        kVar.f27439b.getClass();
                        throw illegalStateException;
                    }
                    AbstractC1197g.c().a(str, "Retrying after " + (i * 300), e10);
                    try {
                        Thread.sleep(this.f8214c * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            kVar.d();
        }
    }
}
