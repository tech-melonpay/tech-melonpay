package androidx.work.impl.background.systemalarm;

import B1.p;
import B1.r;
import C1.n;
import C1.s;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s1.AbstractC1197g;
import t1.InterfaceC1277b;
import x1.C1583d;
import x1.InterfaceC1582c;

/* compiled from: DelayMetCommandHandler.java */
/* loaded from: classes.dex */
public final class c implements InterfaceC1582c, InterfaceC1277b, s.b {

    /* renamed from: j, reason: collision with root package name */
    public static final String f8168j = AbstractC1197g.e("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f8169a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8170b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8171c;

    /* renamed from: d, reason: collision with root package name */
    public final d f8172d;

    /* renamed from: e, reason: collision with root package name */
    public final C1583d f8173e;

    /* renamed from: h, reason: collision with root package name */
    public PowerManager.WakeLock f8176h;
    public boolean i = false;

    /* renamed from: g, reason: collision with root package name */
    public int f8175g = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8174f = new Object();

    public c(Context context, int i, String str, d dVar) {
        this.f8169a = context;
        this.f8170b = i;
        this.f8172d = dVar;
        this.f8171c = str;
        this.f8173e = new C1583d(context, dVar.f8179b, this);
    }

    @Override // C1.s.b
    public final void a(String str) {
        AbstractC1197g.c().a(f8168j, s3.b.j("Exceeded time limits on execution for ", str), new Throwable[0]);
        g();
    }

    @Override // t1.InterfaceC1277b
    public final void b(String str, boolean z10) {
        AbstractC1197g.c().a(f8168j, "onExecuted " + str + ", " + z10, new Throwable[0]);
        c();
        int i = this.f8170b;
        d dVar = this.f8172d;
        Context context = this.f8169a;
        if (z10) {
            dVar.e(new d.b(i, a.c(context, this.f8171c), dVar));
        }
        if (this.i) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            dVar.e(new d.b(i, intent, dVar));
        }
    }

    public final void c() {
        synchronized (this.f8174f) {
            try {
                this.f8173e.c();
                this.f8172d.f8180c.b(this.f8171c);
                PowerManager.WakeLock wakeLock = this.f8176h;
                if (wakeLock != null && wakeLock.isHeld()) {
                    AbstractC1197g.c().a(f8168j, "Releasing wakelock " + this.f8176h + " for WorkSpec " + this.f8171c, new Throwable[0]);
                    this.f8176h.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // x1.InterfaceC1582c
    public final void d(ArrayList arrayList) {
        g();
    }

    @Override // x1.InterfaceC1582c
    public final void e(List<String> list) {
        if (list.contains(this.f8171c)) {
            synchronized (this.f8174f) {
                try {
                    if (this.f8175g == 0) {
                        this.f8175g = 1;
                        AbstractC1197g.c().a(f8168j, "onAllConstraintsMet for " + this.f8171c, new Throwable[0]);
                        if (this.f8172d.f8181d.g(this.f8171c, null)) {
                            this.f8172d.f8180c.a(this.f8171c, this);
                        } else {
                            c();
                        }
                    } else {
                        AbstractC1197g.c().a(f8168j, "Already started work for " + this.f8171c, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void f() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f8171c;
        sb2.append(str);
        sb2.append(" (");
        this.f8176h = n.a(this.f8169a, s3.b.m(sb2, this.f8170b, ")"));
        AbstractC1197g c2 = AbstractC1197g.c();
        PowerManager.WakeLock wakeLock = this.f8176h;
        String str2 = f8168j;
        c2.a(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.f8176h.acquire();
        p h9 = ((r) this.f8172d.f8182e.f27440c.f()).h(str);
        if (h9 == null) {
            g();
            return;
        }
        boolean b9 = h9.b();
        this.i = b9;
        if (b9) {
            this.f8173e.b(Collections.singletonList(h9));
        } else {
            AbstractC1197g.c().a(str2, s3.b.j("No constraints for ", str), new Throwable[0]);
            e(Collections.singletonList(str));
        }
    }

    public final void g() {
        synchronized (this.f8174f) {
            try {
                if (this.f8175g < 2) {
                    this.f8175g = 2;
                    AbstractC1197g c2 = AbstractC1197g.c();
                    String str = f8168j;
                    c2.a(str, "Stopping work for WorkSpec " + this.f8171c, new Throwable[0]);
                    Context context = this.f8169a;
                    String str2 = this.f8171c;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    d dVar = this.f8172d;
                    dVar.e(new d.b(this.f8170b, intent, dVar));
                    if (this.f8172d.f8181d.d(this.f8171c)) {
                        AbstractC1197g.c().a(str, "WorkSpec " + this.f8171c + " needs to be rescheduled", new Throwable[0]);
                        Intent c10 = a.c(this.f8169a, this.f8171c);
                        d dVar2 = this.f8172d;
                        dVar2.e(new d.b(this.f8170b, c10, dVar2));
                    } else {
                        AbstractC1197g.c().a(str, "Processor does not have WorkSpec " + this.f8171c + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    AbstractC1197g.c().a(f8168j, "Already stopped work for " + this.f8171c, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
