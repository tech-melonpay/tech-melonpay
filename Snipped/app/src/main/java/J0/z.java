package j0;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.provider.Settings;
import android.util.Log;
import b.InterfaceC0579a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: NotificationManagerCompat.java */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static String f22387c;

    /* renamed from: f, reason: collision with root package name */
    public static c f22390f;

    /* renamed from: a, reason: collision with root package name */
    public final NotificationManager f22391a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f22386b = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static HashSet f22388d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f22389e = new Object();

    /* compiled from: NotificationManagerCompat.java */
    public static class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final String f22392a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22393b = 11;

        /* renamed from: c, reason: collision with root package name */
        public final String f22394c = null;

        /* renamed from: d, reason: collision with root package name */
        public final Notification f22395d;

        public a(String str, Notification notification) {
            this.f22392a = str;
            this.f22395d = notification;
        }

        @Override // j0.z.d
        public final void a(InterfaceC0579a interfaceC0579a) {
            interfaceC0579a.a(this.f22392a, this.f22393b, this.f22394c, this.f22395d);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
            sb2.append(this.f22392a);
            sb2.append(", id:");
            sb2.append(this.f22393b);
            sb2.append(", tag:");
            return androidx.camera.core.impl.utils.a.n(sb2, this.f22394c, "]");
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f22396a;

        /* renamed from: b, reason: collision with root package name */
        public final IBinder f22397b;

        public b(ComponentName componentName, IBinder iBinder) {
            this.f22396a = componentName;
            this.f22397b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    public static class c implements Handler.Callback, ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public final Context f22398a;

        /* renamed from: b, reason: collision with root package name */
        public final Handler f22399b;

        /* renamed from: c, reason: collision with root package name */
        public final HashMap f22400c = new HashMap();

        /* renamed from: d, reason: collision with root package name */
        public HashSet f22401d = new HashSet();

        /* compiled from: NotificationManagerCompat.java */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ComponentName f22402a;

            /* renamed from: c, reason: collision with root package name */
            public InterfaceC0579a f22404c;

            /* renamed from: b, reason: collision with root package name */
            public boolean f22403b = false;

            /* renamed from: d, reason: collision with root package name */
            public final ArrayDeque<d> f22405d = new ArrayDeque<>();

            /* renamed from: e, reason: collision with root package name */
            public int f22406e = 0;

            public a(ComponentName componentName) {
                this.f22402a = componentName;
            }
        }

        public c(Context context) {
            this.f22398a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.f22399b = new Handler(handlerThread.getLooper(), this);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
        
            if (r8.f22403b != false) goto L17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(j0.z.c.a r8) {
            /*
                r7 = this;
                java.lang.String r0 = "NotifManCompat"
                r1 = 3
                boolean r2 = android.util.Log.isLoggable(r0, r1)
                android.content.ComponentName r3 = r8.f22402a
                if (r2 == 0) goto L2f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "Processing component "
                r2.<init>(r4)
                r2.append(r3)
                java.lang.String r4 = ", "
                r2.append(r4)
                java.util.ArrayDeque<j0.z$d> r4 = r8.f22405d
                int r4 = r4.size()
                r2.append(r4)
                java.lang.String r4 = " queued tasks"
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                android.util.Log.d(r0, r2)
            L2f:
                java.util.ArrayDeque<j0.z$d> r2 = r8.f22405d
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L38
                return
            L38:
                boolean r2 = r8.f22403b
                if (r2 == 0) goto L3d
                goto L70
            L3d:
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r4 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
                r2.<init>(r4)
                android.content.Intent r2 = r2.setComponent(r3)
                r4 = 33
                android.content.Context r5 = r7.f22398a
                boolean r2 = r5.bindService(r2, r7, r4)
                r8.f22403b = r2
                if (r2 == 0) goto L58
                r2 = 0
                r8.f22406e = r2
                goto L6c
            L58:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "Unable to bind to listener "
                r2.<init>(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.w(r0, r2)
                r5.unbindService(r7)
            L6c:
                boolean r2 = r8.f22403b
                if (r2 == 0) goto Ld9
            L70:
                b.a r2 = r8.f22404c
                if (r2 != 0) goto L75
                goto Ld9
            L75:
                java.util.ArrayDeque<j0.z$d> r2 = r8.f22405d
                java.lang.Object r4 = r2.peek()
                j0.z$d r4 = (j0.z.d) r4
                if (r4 != 0) goto L80
                goto Lcf
            L80:
                boolean r5 = android.util.Log.isLoggable(r0, r1)     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
                if (r5 == 0) goto L9d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
                r5.<init>()     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
                java.lang.String r6 = "Sending task "
                r5.append(r6)     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
                r5.append(r4)     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
                java.lang.String r5 = r5.toString()     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
                android.util.Log.d(r0, r5)     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
                goto L9d
            L9b:
                r1 = move-exception
                goto La6
            L9d:
                b.a r5 = r8.f22404c     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
                r4.a(r5)     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
                r2.remove()     // Catch: android.os.RemoteException -> L9b android.os.DeadObjectException -> Lb8
                goto L75
            La6:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "RemoteException communicating with "
                r4.<init>(r5)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                android.util.Log.w(r0, r3, r1)
                goto Lcf
            Lb8:
                boolean r1 = android.util.Log.isLoggable(r0, r1)
                if (r1 == 0) goto Lcf
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "Remote service has died: "
                r1.<init>(r4)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
            Lcf:
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto Ld8
                r7.b(r8)
            Ld8:
                return
            Ld9:
                r7.b(r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j0.z.c.a(j0.z$c$a):void");
        }

        public final void b(a aVar) {
            Handler handler = this.f22399b;
            ComponentName componentName = aVar.f22402a;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i = aVar.f22406e;
            int i9 = i + 1;
            aVar.f22406e = i9;
            if (i9 <= 6) {
                int i10 = (1 << i) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i10 + " ms");
                }
                handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i10);
                return;
            }
            StringBuilder sb2 = new StringBuilder("Giving up on delivering ");
            ArrayDeque<d> arrayDeque = aVar.f22405d;
            sb2.append(arrayDeque.size());
            sb2.append(" tasks to ");
            sb2.append(componentName);
            sb2.append(" after ");
            sb2.append(aVar.f22406e);
            sb2.append(" retries");
            Log.w("NotifManCompat", sb2.toString());
            arrayDeque.clear();
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            HashSet hashSet;
            int i = message.what;
            InterfaceC0579a interfaceC0579a = null;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return false;
                        }
                        a aVar = (a) this.f22400c.get((ComponentName) message.obj);
                        if (aVar != null) {
                            a(aVar);
                        }
                        return true;
                    }
                    a aVar2 = (a) this.f22400c.get((ComponentName) message.obj);
                    if (aVar2 != null) {
                        if (aVar2.f22403b) {
                            this.f22398a.unbindService(this);
                            aVar2.f22403b = false;
                        }
                        aVar2.f22404c = null;
                    }
                    return true;
                }
                b bVar = (b) message.obj;
                ComponentName componentName = bVar.f22396a;
                IBinder iBinder = bVar.f22397b;
                a aVar3 = (a) this.f22400c.get(componentName);
                if (aVar3 != null) {
                    int i9 = InterfaceC0579a.AbstractBinderC0090a.f8273c;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0579a.f8272b);
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0579a)) {
                            InterfaceC0579a.AbstractBinderC0090a.C0091a c0091a = new InterfaceC0579a.AbstractBinderC0090a.C0091a();
                            c0091a.f8274c = iBinder;
                            interfaceC0579a = c0091a;
                        } else {
                            interfaceC0579a = (InterfaceC0579a) queryLocalInterface;
                        }
                    }
                    aVar3.f22404c = interfaceC0579a;
                    aVar3.f22406e = 0;
                    a(aVar3);
                }
                return true;
            }
            d dVar = (d) message.obj;
            String string = Settings.Secure.getString(this.f22398a.getContentResolver(), "enabled_notification_listeners");
            synchronized (z.f22386b) {
                if (string != null) {
                    try {
                        if (!string.equals(z.f22387c)) {
                            String[] split = string.split(com.sumsub.sns.internal.core.data.model.p.f15541a, -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            z.f22388d = hashSet2;
                            z.f22387c = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = z.f22388d;
            }
            if (!hashSet.equals(this.f22401d)) {
                this.f22401d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f22398a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.f22400c.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f22400c.put(componentName3, new a(componentName3));
                    }
                }
                Iterator it2 = this.f22400c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        a aVar4 = (a) entry.getValue();
                        if (aVar4.f22403b) {
                            this.f22398a.unbindService(this);
                            aVar4.f22403b = false;
                        }
                        aVar4.f22404c = null;
                        it2.remove();
                    }
                }
            }
            for (a aVar5 : this.f22400c.values()) {
                aVar5.f22405d.add(dVar);
                a(aVar5);
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f22399b.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f22399b.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    public interface d {
        void a(InterfaceC0579a interfaceC0579a);
    }

    public z(Context context) {
        this.f22391a = (NotificationManager) context.getSystemService("notification");
    }
}
