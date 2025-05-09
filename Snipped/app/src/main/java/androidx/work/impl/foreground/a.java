package androidx.work.impl.foreground;

import A1.d;
import A1.e;
import A1.f;
import B1.p;
import C1.m;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import s1.AbstractC1197g;
import s1.C1194d;
import s3.b;
import t1.InterfaceC1277b;
import t1.k;
import x1.C1583d;
import x1.InterfaceC1582c;

/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public final class a implements InterfaceC1582c, InterfaceC1277b {

    /* renamed from: j, reason: collision with root package name */
    public static final String f8201j = AbstractC1197g.e("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final k f8202a;

    /* renamed from: b, reason: collision with root package name */
    public final D1.a f8203b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8204c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public String f8205d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f8206e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f8207f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f8208g;

    /* renamed from: h, reason: collision with root package name */
    public final C1583d f8209h;
    public InterfaceC0089a i;

    /* compiled from: SystemForegroundDispatcher.java */
    /* renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    public interface InterfaceC0089a {
    }

    public a(Context context) {
        k b9 = k.b(context);
        this.f8202a = b9;
        D1.a aVar = b9.f27441d;
        this.f8203b = aVar;
        this.f8205d = null;
        this.f8206e = new LinkedHashMap();
        this.f8208g = new HashSet();
        this.f8207f = new HashMap();
        this.f8209h = new C1583d(context, aVar, this);
        b9.f27443f.a(this);
    }

    public static Intent a(Context context, String str, C1194d c1194d) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c1194d.f26508a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c1194d.f26509b);
        intent.putExtra("KEY_NOTIFICATION", c1194d.f26510c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, C1194d c1194d) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", c1194d.f26508a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c1194d.f26509b);
        intent.putExtra("KEY_NOTIFICATION", c1194d.f26510c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // t1.InterfaceC1277b
    public final void b(String str, boolean z10) {
        Map.Entry entry;
        synchronized (this.f8204c) {
            try {
                p pVar = (p) this.f8207f.remove(str);
                if (pVar != null && this.f8208g.remove(pVar)) {
                    this.f8209h.b(this.f8208g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1194d c1194d = (C1194d) this.f8206e.remove(str);
        if (str.equals(this.f8205d) && this.f8206e.size() > 0) {
            Iterator it = this.f8206e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f8205d = (String) entry.getKey();
            if (this.i != null) {
                C1194d c1194d2 = (C1194d) entry.getValue();
                InterfaceC0089a interfaceC0089a = this.i;
                int i = c1194d2.f26508a;
                int i9 = c1194d2.f26509b;
                SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0089a;
                systemForegroundService.f8197a.post(new d(systemForegroundService, i, c1194d2.f26510c, i9));
                InterfaceC0089a interfaceC0089a2 = this.i;
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) interfaceC0089a2;
                systemForegroundService2.f8197a.post(new f(c1194d2.f26508a, 0, systemForegroundService2));
            }
        }
        InterfaceC0089a interfaceC0089a3 = this.i;
        if (c1194d == null || interfaceC0089a3 == null) {
            return;
        }
        AbstractC1197g c2 = AbstractC1197g.c();
        String str2 = f8201j;
        int i10 = c1194d.f26508a;
        int i11 = c1194d.f26509b;
        StringBuilder sb2 = new StringBuilder("Removing Notification (id: ");
        sb2.append(i10);
        sb2.append(", workSpecId: ");
        sb2.append(str);
        sb2.append(" ,notificationType: ");
        c2.a(str2, b.m(sb2, i11, ")"), new Throwable[0]);
        SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC0089a3;
        systemForegroundService3.f8197a.post(new f(c1194d.f26508a, 0, systemForegroundService3));
    }

    @Override // x1.InterfaceC1582c
    public final void d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC1197g.c().a(f8201j, b.j("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            k kVar = this.f8202a;
            ((D1.b) kVar.f27441d).a(new m(kVar, str, true));
        }
    }

    public final void f(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC1197g c2 = AbstractC1197g.c();
        StringBuilder sb2 = new StringBuilder("Notifying with (id: ");
        sb2.append(intExtra);
        sb2.append(", workSpecId: ");
        sb2.append(stringExtra);
        sb2.append(", notificationType: ");
        c2.a(f8201j, b.m(sb2, intExtra2, ")"), new Throwable[0]);
        if (notification == null || this.i == null) {
            return;
        }
        C1194d c1194d = new C1194d(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f8206e;
        linkedHashMap.put(stringExtra, c1194d);
        if (TextUtils.isEmpty(this.f8205d)) {
            this.f8205d = stringExtra;
            SystemForegroundService systemForegroundService = (SystemForegroundService) this.i;
            systemForegroundService.f8197a.post(new d(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.i;
        systemForegroundService2.f8197a.post(new e(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((C1194d) ((Map.Entry) it.next()).getValue()).f26509b;
        }
        C1194d c1194d2 = (C1194d) linkedHashMap.get(this.f8205d);
        if (c1194d2 != null) {
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.i;
            systemForegroundService3.f8197a.post(new d(systemForegroundService3, c1194d2.f26508a, c1194d2.f26510c, i));
        }
    }

    public final void g() {
        this.i = null;
        synchronized (this.f8204c) {
            this.f8209h.c();
        }
        this.f8202a.f27443f.e(this);
    }

    @Override // x1.InterfaceC1582c
    public final void e(List<String> list) {
    }
}
