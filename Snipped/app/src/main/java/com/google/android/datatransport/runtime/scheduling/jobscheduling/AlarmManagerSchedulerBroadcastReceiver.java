package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import J.m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.camera.core.processing.d;
import j2.AbstractC0892k;
import j2.C0884c;
import j2.o;
import o2.c;
import s2.C1203a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8960a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        o.b(context);
        C0884c.a a10 = AbstractC0892k.a();
        a10.b(queryParameter);
        a10.c(C1203a.b(intValue));
        if (queryParameter2 != null) {
            a10.f22430b = Base64.decode(queryParameter2, 0);
        }
        c cVar = o.a().f22455d;
        C0884c a11 = a10.a();
        d dVar = new d(1);
        cVar.getClass();
        cVar.f24351e.execute(new m(cVar, a11, i, dVar));
    }
}
