package com.chuckerteam.chucker.internal.support;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import j0.i;
import java.util.HashMap;
import kotlin.Metadata;

/* compiled from: ClearDatabaseJobIntentServiceReceiver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/chuckerteam/chucker/internal/support/ClearDatabaseJobIntentServiceReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class ClearDatabaseJobIntentServiceReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = ClearDatabaseService.f8627f;
        ComponentName componentName = new ComponentName(context, (Class<?>) ClearDatabaseService.class);
        synchronized (i.f22263c) {
            HashMap<ComponentName, i.d> hashMap = i.f22264d;
            i.d dVar = hashMap.get(componentName);
            if (dVar == null) {
                dVar = new i.c(context, componentName);
                hashMap.put(componentName, dVar);
            }
            dVar.b();
            dVar.a(intent);
        }
    }
}
