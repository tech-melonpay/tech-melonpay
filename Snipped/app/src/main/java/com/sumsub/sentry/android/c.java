package com.sumsub.sentry.android;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.DisplayMetrics;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.log.logger.Logger;
import com.sumsub.sentry.Device;
import com.sumsub.sentry.android.ConnectivityChecker;
import com.sumsub.sentry.k0;
import com.sumsub.sentry.m0;
import com.sumsub.sentry.q;
import com.sumsub.sentry.q0;
import com.sumsub.sentry.u;
import com.sumsub.sentry.z;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import ka.C0969n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final a f13560h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f13561a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sentry.android.a f13562b;

    /* renamed from: c, reason: collision with root package name */
    public final h f13563c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13564d;

    /* renamed from: e, reason: collision with root package name */
    public final Future<Map<String, Object>> f13565e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13566f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13567g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13568a;

        static {
            int[] iArr = new int[ConnectivityChecker.Status.values().length];
            iArr[ConnectivityChecker.Status.NOT_CONNECTED.ordinal()] = 1;
            iArr[ConnectivityChecker.Status.CONNECTED.ordinal()] = 2;
            f13568a = iArr;
        }
    }

    public c(Context context, com.sumsub.sentry.android.a aVar, h hVar, String str) {
        this.f13561a = context;
        this.f13562b = aVar;
        this.f13563c = hVar;
        this.f13564d = str;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f13565e = newSingleThreadExecutor.submit(new com.google.firebase.heartbeatinfo.a(this, 2));
        newSingleThreadExecutor.shutdown();
        this.f13566f = Build.CPU_ABI;
        this.f13567g = Build.CPU_ABI2;
    }

    public static final Map a(c cVar) {
        return cVar.u();
    }

    public final void b(u uVar) {
        q0 user = uVar.getUser();
        if (user == null) {
            uVar.a(f());
        } else if (user.getId() == null) {
            String str = this.f13564d;
            if (str == null) {
                str = h();
            }
            user.a(str);
        }
    }

    public final void c(u uVar) {
        com.sumsub.sentry.a a10 = uVar.getContexts().a();
        if (a10 == null) {
            a10 = new com.sumsub.sentry.a((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 127, (DefaultConstructorMarker) null);
        }
        a(a10);
        a(uVar, a10);
        uVar.getContexts().a(a10);
    }

    public final void d(u uVar) {
        b(uVar);
        e(uVar);
        a(uVar);
        f(uVar);
    }

    public final void e(u uVar) {
        if (uVar.getContexts().c() == null) {
            uVar.getContexts().a(g());
        }
    }

    public final Long f(StatFs statFs) {
        try {
            return Long.valueOf(a(statFs) * c(statFs));
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting unused external storage amount.", th);
            return null;
        }
    }

    public final Device g() {
        Device device = new Device(i(), Build.MANUFACTURER, Build.BRAND, l(), Build.MODEL, Build.ID, (String[]) null, (Float) null, (Boolean) null, (Boolean) null, q(), (Boolean) null, (Long) null, (Long) null, (Long) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Float) null, (Integer) null, (Date) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Float) null, 2147482560, (DefaultConstructorMarker) null);
        a(device);
        b(device);
        try {
            Object obj = this.f13565e.get().get("emulator");
            if (obj != null) {
                device.d((Boolean) obj);
            }
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting emulator.", th);
        }
        DisplayMetrics j10 = j();
        if (j10 != null) {
            device.c(Integer.valueOf(j10.widthPixels));
            device.b(Integer.valueOf(j10.heightPixels));
            device.c(Float.valueOf(j10.density));
            device.a(Integer.valueOf(j10.densityDpi));
        }
        device.a(c());
        device.e(s().getID());
        if (device.getId() == null) {
            device.b(h());
        }
        Locale locale = Locale.getDefault();
        if (device.getLanguage() == null) {
            device.c(locale.getLanguage());
        }
        if (device.getLocale() == null) {
            device.d(locale.toString());
        }
        return device;
    }

    public final String h() {
        try {
            return e.f13570a.a(this.f13561a);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String i() {
        String string = Settings.Global.getString(this.f13561a.getContentResolver(), "device_name");
        return string == null ? "Unknown" : string;
    }

    public final DisplayMetrics j() {
        try {
            return this.f13561a.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting DisplayMetrics.", th);
            return null;
        }
    }

    public final File[] k() {
        return this.f13561a.getExternalFilesDirs(null);
    }

    public final String l() {
        try {
            return ((String[]) new Regex(" ").d(Build.MODEL).toArray(new String[0]))[0];
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting device family.", th);
            return null;
        }
    }

    public final String m() {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String readLine = bufferedReader.readLine();
                U4.b.d(bufferedReader, null);
                return readLine;
            } finally {
            }
        } catch (IOException e10) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Exception while attempting to read kernel information", e10);
            return property;
        }
    }

    public final ActivityManager.MemoryInfo n() {
        ActivityManager activityManager;
        ActivityManager.MemoryInfo memoryInfo;
        try {
            Object systemService = this.f13561a.getSystemService("activity");
            activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            memoryInfo = new ActivityManager.MemoryInfo();
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting MemoryInfo.", th);
        }
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        }
        Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Error getting MemoryInfo.", null, 4, null);
        return null;
    }

    public final long o() {
        return Runtime.getRuntime().totalMemory();
    }

    public final q p() {
        q qVar = new q((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 63, (DefaultConstructorMarker) null);
        qVar.c("Android");
        qVar.e(Build.VERSION.RELEASE);
        qVar.a(Build.DISPLAY);
        try {
            Object obj = this.f13565e.get().get("kernelVersion");
            if (obj != null) {
                qVar.b(obj instanceof String ? (String) obj : null);
            }
            Object obj2 = this.f13565e.get().get("rooted");
            if (obj2 != null) {
                qVar.a(obj2 instanceof Boolean ? (Boolean) obj2 : null);
            }
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting OperatingSystem.", th);
        }
        return qVar;
    }

    public final Device.DeviceOrientation q() {
        Device.DeviceOrientation deviceOrientation;
        Throwable th;
        try {
            deviceOrientation = d.f13569a.a(this.f13561a.getResources().getConfiguration().orientation);
            if (deviceOrientation == null) {
                try {
                    Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", null, 4, null);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting device orientation.", th);
                    return deviceOrientation;
                }
            }
        } catch (Throwable th3) {
            deviceOrientation = null;
            th = th3;
        }
        return deviceOrientation;
    }

    public final Map<String, String> r() {
        try {
            PackageInfo a10 = com.sumsub.sentry.android.b.f13559a.a(this.f13561a);
            PackageManager packageManager = this.f13561a.getPackageManager();
            if (a10 == null || packageManager == null) {
                return null;
            }
            String installerPackageName = packageManager.getInstallerPackageName(a10.packageName);
            HashMap hashMap = new HashMap();
            if (installerPackageName != null) {
                hashMap.put("isSideLoaded", "false");
                hashMap.put("installerStore", installerPackageName);
            } else {
                hashMap.put("isSideLoaded", "true");
            }
            return hashMap;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final TimeZone s() {
        LocaleList locales = this.f13561a.getResources().getConfiguration().getLocales();
        return !locales.isEmpty() ? Calendar.getInstance(locales.get(0)).getTimeZone() : Calendar.getInstance().getTimeZone();
    }

    public final boolean t() {
        String externalStorageState = Environment.getExternalStorageState();
        return (kotlin.jvm.internal.f.b("mounted", externalStorageState) || kotlin.jvm.internal.f.b("mounted_ro", externalStorageState)) && !Environment.isExternalStorageEmulated();
    }

    public final Map<String, Object> u() {
        HashMap hashMap = new HashMap();
        hashMap.put("rooted", Boolean.valueOf(this.f13563c.e()));
        String m2 = m();
        if (m2 != null) {
            hashMap.put("kernelVersion", m2);
        }
        hashMap.put("emulator", Boolean.valueOf(this.f13562b.f()));
        Map<String, String> r8 = r();
        if (r8 != null) {
            hashMap.put("sideLoaded", r8);
        }
        return hashMap;
    }

    public z a(z zVar) {
        c(zVar);
        b(zVar);
        d(zVar);
        return zVar;
    }

    public final Long e(StatFs statFs) {
        try {
            return Long.valueOf(b(statFs) * c(statFs));
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting total internal storage amount.", th);
            return null;
        }
    }

    public final void a(u uVar) {
        String str;
        q g10 = uVar.getContexts().g();
        uVar.getContexts().a(p());
        if (g10 != null) {
            String str2 = g10.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String();
            if (str2 != null && str2.length() != 0) {
                StringBuilder sb2 = new StringBuilder("os_");
                int length = str2.length() - 1;
                int i = 0;
                boolean z10 = false;
                while (i <= length) {
                    boolean z11 = kotlin.jvm.internal.f.c(str2.charAt(!z10 ? i : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i++;
                    } else {
                        z10 = true;
                    }
                }
                sb2.append(str2.subSequence(i, length + 1).toString().toLowerCase(Locale.ROOT));
                str = sb2.toString();
            } else {
                str = "os_1";
            }
            uVar.getContexts().put(str, g10);
        }
    }

    public final void b(z zVar) {
        m0<k0> Q4 = zVar.Q();
        if (Q4 != null) {
            for (k0 k0Var : Q4.a()) {
                if (k0Var.getCurrent() == null) {
                    k0Var.a(Boolean.valueOf(f.f13573a.a(k0Var)));
                }
            }
        }
    }

    public final Long d(StatFs statFs) {
        try {
            return Long.valueOf(b(statFs) * c(statFs));
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting total external storage amount.", th);
            return null;
        }
    }

    public final q0 f() {
        String str = this.f13564d;
        if (str == null) {
            str = h();
        }
        return new q0(str, (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null);
    }

    public final Date c() {
        try {
            return com.sumsub.sentry.e.f13611a.a(Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        } catch (IllegalArgumentException e10) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting the device's boot time.", e10);
            return null;
        }
    }

    public final void f(u uVar) {
        try {
            Object obj = this.f13565e.get().get("sideLoaded");
            Map map = obj instanceof Map ? (Map) obj : null;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    Map<String, String> u6 = uVar.u();
                    if (u6 != null) {
                        u6.put(str, str2);
                    }
                }
            }
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting side loaded info.", th);
        }
    }

    public final Boolean c(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z10 = true;
            if (intExtra != 1 && intExtra != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting device charging state.", th);
            return null;
        }
    }

    public final void b(Device device) {
        Boolean bool;
        Intent b9 = b();
        if (b9 != null) {
            device.a(a(b9));
            device.a(c(b9));
            device.b(b(b9));
        }
        ConnectivityChecker connectivityChecker = ConnectivityChecker.f13558a;
        int i = b.f13568a[connectivityChecker.a(this.f13561a).ordinal()];
        if (i != 1) {
            bool = i != 2 ? null : Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        device.c(bool);
        ActivityManager.MemoryInfo n10 = n();
        if (n10 != null) {
            device.e(Long.valueOf(o()));
            device.c(Long.valueOf(n10.availMem));
            device.b(Boolean.valueOf(n10.lowMemory));
        }
        File externalFilesDir = this.f13561a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs = new StatFs(externalFilesDir.getPath());
            device.f(e(statFs));
            device.d(g(statFs));
        }
        StatFs b10 = b(externalFilesDir);
        if (b10 != null) {
            device.b(d(b10));
            device.a(f(b10));
        }
        if (device.getConnectionType() == null) {
            device.a(connectivityChecker.a(this.f13561a, this.f13562b));
        }
    }

    public final long c(StatFs statFs) {
        return statFs.getBlockSizeLong();
    }

    public final void a(u uVar, com.sumsub.sentry.a aVar) {
        com.sumsub.sentry.android.b bVar = com.sumsub.sentry.android.b.f13559a;
        PackageInfo a10 = bVar.a(this.f13561a, 4096);
        if (a10 != null) {
            a(uVar, bVar.a(a10));
            a(aVar, a10);
        }
    }

    public final void a(u uVar, String str) {
        if (uVar.getDist() == null) {
            uVar.b(str);
        }
    }

    public final void a(com.sumsub.sentry.a aVar) {
        aVar.c(a());
    }

    public final void a(Device device) {
        device.a(new String[]{this.f13566f, this.f13567g});
    }

    public final Float a(Intent intent) {
        try {
            int intExtra = intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting device battery level.", th);
            return null;
        }
    }

    public final Long g(StatFs statFs) {
        try {
            return Long.valueOf(a(statFs) * c(statFs));
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting unused internal storage amount.", th);
            return null;
        }
    }

    public final Intent b() {
        return this.f13561a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    public final Float b(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10);
            }
            return null;
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting battery temperature.", th);
            return null;
        }
    }

    public final long a(StatFs statFs) {
        return statFs.getAvailableBlocksLong();
    }

    public final File a(File file) {
        File[] k3 = k();
        if (k3 != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            int i = 0;
            while (i < k3.length) {
                int i9 = i + 1;
                try {
                    File file2 = k3[i];
                    if (file2 != null && (absolutePath == null || absolutePath.length() == 0 || !C0969n.Y(file2.getAbsolutePath(), absolutePath, false))) {
                        return file2;
                    }
                    i = i9;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new NoSuchElementException(e10.getMessage());
                }
            }
        } else {
            Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Not possible to read getExternalFilesDirs", null, 4, null);
        }
        return null;
    }

    public final long b(StatFs statFs) {
        return statFs.getBlockCountLong();
    }

    public final StatFs b(File file) {
        if (!t()) {
            File a10 = a(file);
            if (a10 != null) {
                return new StatFs(a10.getPath());
            }
            Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Not possible to read external files directory", null, 4, null);
            return null;
        }
        Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "External storage is not mounted or emulated.", null, 4, null);
        return null;
    }

    @SuppressLint({"NewApi"})
    public final void a(com.sumsub.sentry.a aVar, PackageInfo packageInfo) {
        aVar.b(packageInfo.packageName);
        aVar.d(packageInfo.versionName);
        aVar.a(com.sumsub.sentry.android.b.f13559a.a(packageInfo));
        if (this.f13562b.d() >= 16) {
            HashMap hashMap = new HashMap();
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null) {
                if ((!(strArr.length == 0)) && iArr != null && iArr.length > 0) {
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        String str = strArr[i];
                        hashMap.put(str.substring(C0969n.j0('.', 0, 6, str) + 1), (iArr[i] & 2) == 2 ? "granted" : "not_granted");
                    }
                }
            }
            aVar.a(hashMap);
        }
    }

    public final String a() {
        try {
            ApplicationInfo applicationInfo = this.f13561a.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                if (charSequence != null) {
                    return charSequence.toString();
                }
                return this.f13561a.getPackageManager().getApplicationLabel(applicationInfo).toString();
            }
            return this.f13561a.getString(i);
        } catch (Throwable unused) {
            return null;
        }
    }
}
