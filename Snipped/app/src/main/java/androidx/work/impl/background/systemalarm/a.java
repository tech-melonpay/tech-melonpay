package androidx.work.impl.background.systemalarm;

import B1.g;
import B1.i;
import B1.p;
import B1.r;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.camera.core.n;
import androidx.work.NetworkType;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import s1.AbstractC1197g;
import s1.C1192b;
import t1.InterfaceC1277b;
import t1.k;
import v1.C1539a;
import x1.C1583d;

/* compiled from: CommandHandler.java */
/* loaded from: classes.dex */
public final class a implements InterfaceC1277b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f8160d = AbstractC1197g.e("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f8161a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8162b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f8163c = new Object();

    public a(Context context) {
        this.f8161a = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // t1.InterfaceC1277b
    public final void b(String str, boolean z10) {
        synchronized (this.f8163c) {
            try {
                InterfaceC1277b interfaceC1277b = (InterfaceC1277b) this.f8162b.remove(str);
                if (interfaceC1277b != null) {
                    interfaceC1277b.b(str, z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(int i, Intent intent, d dVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            AbstractC1197g.c().a(f8160d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            b bVar = new b(this.f8161a, i, dVar);
            ArrayList e10 = ((r) dVar.f8182e.f27440c.f()).e();
            String str = ConstraintProxy.f8151a;
            Iterator it = e10.iterator();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            while (it.hasNext()) {
                C1192b c1192b = ((p) it.next()).f251j;
                z10 |= c1192b.f26500d;
                z11 |= c1192b.f26498b;
                z12 |= c1192b.f26501e;
                z13 |= c1192b.f26497a != NetworkType.f8092a;
                if (z10 && z11 && z12 && z13) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f8152a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = bVar.f8165a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
            context.sendBroadcast(intent2);
            C1583d c1583d = bVar.f8167c;
            c1583d.b(e10);
            ArrayList arrayList = new ArrayList(e10.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = e10.iterator();
            while (it2.hasNext()) {
                p pVar = (p) it2.next();
                String str3 = pVar.f243a;
                if (currentTimeMillis >= pVar.a() && (!pVar.b() || c1583d.a(str3))) {
                    arrayList.add(pVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str4 = ((p) it3.next()).f243a;
                Intent a10 = a(context, str4);
                AbstractC1197g.c().a(b.f8164d, n.a("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                dVar.e(new d.b(bVar.f8166b, a10, dVar));
            }
            c1583d.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            AbstractC1197g.c().a(f8160d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            dVar.f8182e.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            AbstractC1197g.c().b(f8160d, n.a("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if (!"ACTION_SCHEDULE_WORK".equals(action)) {
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f8163c) {
                    try {
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        AbstractC1197g c2 = AbstractC1197g.c();
                        String str5 = f8160d;
                        c2.a(str5, "Handing delay met for " + string, new Throwable[0]);
                        if (this.f8162b.containsKey(string)) {
                            AbstractC1197g.c().a(str5, "WorkSpec " + string + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        } else {
                            c cVar = new c(this.f8161a, i, string, dVar);
                            this.f8162b.put(string, cVar);
                            cVar.f();
                        }
                    } finally {
                    }
                }
                return;
            }
            if (!"ACTION_STOP_WORK".equals(action)) {
                if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                    AbstractC1197g.c().f(f8160d, String.format("Ignoring intent %s", intent), new Throwable[0]);
                    return;
                }
                Bundle extras3 = intent.getExtras();
                String string2 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z14 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                AbstractC1197g.c().a(f8160d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
                b(string2, z14);
                return;
            }
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            AbstractC1197g.c().a(f8160d, s3.b.j("Handing stopWork work for ", string3), new Throwable[0]);
            dVar.f8182e.g(string3);
            String str6 = C1539a.f30533a;
            i iVar = (i) dVar.f8182e.f27440c.c();
            g a11 = iVar.a(string3);
            if (a11 != null) {
                C1539a.a(this.f8161a, a11.f232b, string3);
                AbstractC1197g.c().a(C1539a.f30533a, n.a("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                iVar.c(string3);
            }
            dVar.b(string3, false);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        String str7 = f8160d;
        AbstractC1197g.c().a(str7, s3.b.j("Handling schedule work for ", string4), new Throwable[0]);
        WorkDatabase workDatabase = dVar.f8182e.f27440c;
        workDatabase.beginTransaction();
        try {
            p h9 = ((r) workDatabase.f()).h(string4);
            if (h9 == null) {
                AbstractC1197g.c().f(str7, "Skipping scheduling " + string4 + " because it's no longer in the DB", new Throwable[0]);
            } else if (h9.f244b.a()) {
                AbstractC1197g.c().f(str7, "Skipping scheduling " + string4 + "because it is finished.", new Throwable[0]);
            } else {
                long a12 = h9.a();
                boolean b9 = h9.b();
                Context context2 = this.f8161a;
                k kVar = dVar.f8182e;
                if (b9) {
                    AbstractC1197g.c().a(str7, "Opportunistically setting an alarm for " + string4 + " at " + a12, new Throwable[0]);
                    C1539a.b(context2, kVar, string4, a12);
                    Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                    dVar.e(new d.b(i, intent3, dVar));
                } else {
                    AbstractC1197g.c().a(str7, "Setting up Alarms for " + string4 + " at " + a12, new Throwable[0]);
                    C1539a.b(context2, kVar, string4, a12);
                }
                workDatabase.setTransactionSuccessful();
            }
            workDatabase.endTransaction();
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
