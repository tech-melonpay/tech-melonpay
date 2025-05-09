package u9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import io.sentry.C0844b;
import io.sentry.C0852j;
import io.sentry.C0855m;
import io.sentry.InterfaceC0858p;
import io.sentry.InterfaceC0859q;
import io.sentry.InterfaceC0867z;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: SystemEventsBreadcrumbsIntegration.java */
/* loaded from: classes2.dex */
public final class F implements InterfaceC0867z, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30370a;

    /* renamed from: b, reason: collision with root package name */
    public a f30371b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f30372c;

    /* renamed from: d, reason: collision with root package name */
    public final List<String> f30373d;

    /* compiled from: SystemEventsBreadcrumbsIntegration.java */
    public static final class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0858p f30374a = C0855m.f22069a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC0859q f30375b;

        public a(InterfaceC0859q interfaceC0859q) {
            this.f30375b = interfaceC0859q;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String str;
            int i;
            C0844b c0844b = new C0844b();
            c0844b.f21964c = "system";
            c0844b.f21966e = "device.event";
            String action = intent.getAction();
            Charset charset = J9.e.f2209a;
            if (action != null) {
                int lastIndexOf = action.lastIndexOf(".");
                str = (lastIndexOf < 0 || action.length() <= (i = lastIndexOf + 1)) ? action : action.substring(i);
            } else {
                str = null;
            }
            if (str != null) {
                c0844b.a(str, "action");
            }
            Bundle extras = intent.getExtras();
            HashMap hashMap = new HashMap();
            if (extras != null && !extras.isEmpty()) {
                for (String str2 : extras.keySet()) {
                    try {
                        Object obj = extras.get(str2);
                        if (obj != null) {
                            hashMap.put(str2, obj.toString());
                        }
                    } catch (Throwable th) {
                        this.f30375b.d(SentryLevel.ERROR, th, "%s key of the %s action threw an error.", str2, action);
                    }
                }
                c0844b.a(hashMap, "extras");
            }
            c0844b.f21967f = SentryLevel.INFO;
            C0852j c0852j = new C0852j();
            c0852j.a(intent, "android:intent");
            this.f30374a.e(c0844b, c0852j);
        }
    }

    public F(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.appwidget.action.APPWIDGET_DELETED");
        arrayList.add("android.appwidget.action.APPWIDGET_DISABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_ENABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_HOST_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_RESTORED");
        org.bouncycastle.asn1.a.y(arrayList, "android.appwidget.action.APPWIDGET_UPDATE", "android.appwidget.action.APPWIDGET_UPDATE_OPTIONS", "android.intent.action.ACTION_POWER_CONNECTED", "android.intent.action.ACTION_POWER_DISCONNECTED");
        org.bouncycastle.asn1.a.y(arrayList, "android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_LOW", "android.intent.action.BATTERY_OKAY");
        org.bouncycastle.asn1.a.y(arrayList, "android.intent.action.BOOT_COMPLETED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.CONTENT_CHANGED");
        org.bouncycastle.asn1.a.y(arrayList, "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT");
        org.bouncycastle.asn1.a.y(arrayList, "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED");
        org.bouncycastle.asn1.a.y(arrayList, "android.intent.action.REBOOT", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED");
        org.bouncycastle.asn1.a.y(arrayList, "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED", "android.intent.action.APP_ERROR");
        org.bouncycastle.asn1.a.y(arrayList, "android.intent.action.BUG_REPORT", "android.intent.action.MEDIA_BAD_REMOVAL", "android.intent.action.MEDIA_MOUNTED", "android.intent.action.MEDIA_UNMOUNTABLE");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTED");
        this.f30370a = context;
        this.f30373d = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.f30371b;
        if (aVar != null) {
            this.f30370a.unregisterReceiver(aVar);
            this.f30371b = null;
            SentryAndroidOptions sentryAndroidOptions = this.f30372c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration remove.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC0867z
    public final void d(SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        D9.b.t0(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f30372c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f30372c.isEnableSystemEventBreadcrumbs()));
        if (this.f30372c.isEnableSystemEventBreadcrumbs()) {
            this.f30371b = new a(this.f30372c.getLogger());
            IntentFilter intentFilter = new IntentFilter();
            Iterator<String> it = this.f30373d.iterator();
            while (it.hasNext()) {
                intentFilter.addAction(it.next());
            }
            try {
                this.f30370a.registerReceiver(this.f30371b, intentFilter);
                this.f30372c.getLogger().h(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
            } catch (Throwable th) {
                this.f30372c.setEnableSystemEventBreadcrumbs(false);
                this.f30372c.getLogger().f(SentryLevel.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th);
            }
        }
    }
}
