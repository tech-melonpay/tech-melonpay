package z1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import s1.AbstractC1197g;

/* compiled from: BroadcastReceiverConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: h, reason: collision with root package name */
    public static final String f31237h = AbstractC1197g.e("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final a f31238g;

    /* compiled from: BroadcastReceiverConstraintTracker.java */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.g(intent);
            }
        }
    }

    public c(Context context, D1.a aVar) {
        super(context, aVar);
        this.f31238g = new a();
    }

    @Override // z1.d
    public final void d() {
        AbstractC1197g.c().a(f31237h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f31242b.registerReceiver(this.f31238g, f());
    }

    @Override // z1.d
    public final void e() {
        AbstractC1197g.c().a(f31237h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f31242b.unregisterReceiver(this.f31238g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
