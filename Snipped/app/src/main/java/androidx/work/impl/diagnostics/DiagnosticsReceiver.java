package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import s1.AbstractC1197g;
import s1.C1198h;
import t1.k;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8195a = AbstractC1197g.e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f8195a;
        AbstractC1197g.c().a(str, "Requesting diagnostics", new Throwable[0]);
        try {
            k.b(context).a(C1198h.a());
        } catch (IllegalStateException e10) {
            AbstractC1197g.c().b(str, "WorkManager is not initialized", e10);
        }
    }
}
