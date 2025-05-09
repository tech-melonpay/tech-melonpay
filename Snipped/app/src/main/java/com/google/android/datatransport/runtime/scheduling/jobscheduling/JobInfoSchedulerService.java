package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import J.m;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import j2.AbstractC0892k;
import j2.C0884c;
import j2.o;
import o2.c;
import s2.C1203a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8961a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i9 = jobParameters.getExtras().getInt("attemptNumber");
        o.b(getApplicationContext());
        C0884c.a a10 = AbstractC0892k.a();
        a10.b(string);
        a10.c(C1203a.b(i));
        if (string2 != null) {
            a10.f22430b = Base64.decode(string2, 0);
        }
        c cVar = o.a().f22455d;
        C0884c a11 = a10.a();
        com.sumsub.sns.camera.photo.presentation.document.c cVar2 = new com.sumsub.sns.camera.photo.presentation.document.c(5, this, jobParameters);
        cVar.getClass();
        cVar.f24351e.execute(new m(cVar, a11, i9, cVar2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
