package v1;

import B1.g;
import B1.i;
import C1.f;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import s1.AbstractC1197g;
import t1.k;

/* compiled from: Alarms.java */
/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1539a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f30533a = AbstractC1197g.e("Alarms");

    public static void a(Context context, int i, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.a.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        AbstractC1197g.c().a(f30533a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, k kVar, String str, long j10) {
        int a10;
        WorkDatabase workDatabase = kVar.f27440c;
        i iVar = (i) workDatabase.c();
        g a11 = iVar.a(str);
        if (a11 != null) {
            a(context, a11.f232b, str);
            int i = a11.f232b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.a.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j10, service);
                return;
            }
            return;
        }
        f fVar = new f(workDatabase);
        synchronized (f.class) {
            a10 = fVar.a("next_alarm_manager_id");
        }
        iVar.b(new g(str, a10));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, a10, androidx.work.impl.background.systemalarm.a.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j10, service2);
        }
    }
}
