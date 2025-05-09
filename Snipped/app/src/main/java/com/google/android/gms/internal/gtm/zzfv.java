package com.google.android.gms.internal.gtm;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
@TargetApi(24)
/* loaded from: classes.dex */
public final class zzfv {
    private static final Method zza;
    private static final Method zzb;

    static {
        Method method;
        Method method2 = null;
        try {
            method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            method = null;
        }
        zza = method;
        try {
            method2 = UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        zzb = method2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(android.content.Context r3, android.app.job.JobInfo r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r5 = "jobscheduler"
            java.lang.Object r5 = r3.getSystemService(r5)
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            r5.getClass()
            java.lang.reflect.Method r6 = com.google.android.gms.internal.gtm.zzfv.zza
            if (r6 == 0) goto L6c
            java.lang.String r6 = "android.permission.UPDATE_DEVICE_STATS"
            int r3 = r3.checkSelfPermission(r6)
            if (r3 == 0) goto L18
            goto L6c
        L18:
            java.lang.reflect.Method r3 = com.google.android.gms.internal.gtm.zzfv.zzb
            r6 = 0
            if (r3 == 0) goto L31
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            r1 = 0
            java.lang.Object r3 = r3.invoke(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            if (r3 == 0) goto L31
            int r3 = r3.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            goto L42
        L2d:
            r3 = move-exception
            goto L33
        L2f:
            r3 = move-exception
            goto L33
        L31:
            r3 = r6
            goto L42
        L33:
            r0 = 6
            java.lang.String r1 = "JobSchedulerCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L31
            java.lang.String r0 = "myUserId invocation illegal"
            android.util.Log.e(r1, r0, r3)
            goto L31
        L42:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r1 = "DispatchAlarm"
            java.lang.reflect.Method r2 = com.google.android.gms.internal.gtm.zzfv.zza
            if (r2 == 0) goto L67
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.IllegalAccessException -> L61
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r0, r3, r1}     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.IllegalAccessException -> L61
            java.lang.Object r3 = r2.invoke(r5, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.IllegalAccessException -> L61
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.IllegalAccessException -> L61
            if (r3 == 0) goto L6b
            int r6 = r3.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.IllegalAccessException -> L61
            goto L6b
        L5f:
            r3 = move-exception
            goto L62
        L61:
            r3 = move-exception
        L62:
            java.lang.String r6 = "error calling scheduleAsPackage"
            android.util.Log.e(r1, r6, r3)
        L67:
            int r6 = r5.schedule(r4)
        L6b:
            return r6
        L6c:
            int r3 = r5.schedule(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfv.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
