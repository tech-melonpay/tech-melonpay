package z1;

import android.content.Intent;
import android.content.IntentFilter;
import s1.AbstractC1197g;

/* compiled from: StorageNotLowTracker.java */
/* loaded from: classes.dex */
public final class f extends c<Boolean> {
    public static final String i = AbstractC1197g.e("StorageNotLowTracker");

    @Override // z1.d
    public final Object a() {
        Intent registerReceiver = this.f31242b.registerReceiver(null, f());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // z1.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
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
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            c(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            c(Boolean.TRUE);
        }
    }
}
