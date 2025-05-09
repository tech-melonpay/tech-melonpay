package u9;

import C.N;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Looper;
import io.sentry.C0852j;
import io.sentry.InterfaceC0850h;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import io.sentry.Z;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.ConnectivityChecker;
import io.sentry.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: DefaultAndroidEventProcessor.java */
/* loaded from: classes2.dex */
public final class q implements InterfaceC0850h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30452a;

    /* renamed from: b, reason: collision with root package name */
    public final Future<Map<String, Object>> f30453b;

    /* renamed from: c, reason: collision with root package name */
    public final o f30454c;

    /* renamed from: d, reason: collision with root package name */
    public final y9.c f30455d;

    /* renamed from: e, reason: collision with root package name */
    public final SentryAndroidOptions f30456e;

    /* compiled from: DefaultAndroidEventProcessor.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30457a;

        static {
            int[] iArr = new int[ConnectivityChecker.Status.values().length];
            f30457a = iArr;
            try {
                iArr[ConnectivityChecker.Status.NOT_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30457a[ConnectivityChecker.Status.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public q(Context context, o oVar, SentryAndroidOptions sentryAndroidOptions) {
        y9.c cVar = new y9.c(context, sentryAndroidOptions.getLogger(), oVar);
        this.f30452a = context;
        this.f30454c = oVar;
        this.f30455d = cVar;
        this.f30456e = sentryAndroidOptions;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f30453b = newSingleThreadExecutor.submit(new com.google.firebase.heartbeatinfo.a(this, 6));
        newSingleThreadExecutor.shutdown();
    }

    public final String a() {
        try {
            return u.a(this.f30452a);
        } catch (Throwable th) {
            this.f30456e.getLogger().f(SentryLevel.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    public final void b(Z z10) {
        String str;
        SentryAndroidOptions sentryAndroidOptions = this.f30456e;
        Context context = this.f30452a;
        io.sentry.protocol.a aVar = (io.sentry.protocol.a) z10.f21918b.d(io.sentry.protocol.a.class, com.sumsub.sentry.a.f13540h);
        if (aVar == null) {
            aVar = new io.sentry.protocol.a();
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                str = charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
            } else {
                str = context.getString(i);
            }
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Error getting application name.", th);
            str = null;
        }
        aVar.f22145e = str;
        aVar.f22142b = n.f30446e.f30450d;
        InterfaceC0859q logger = sentryAndroidOptions.getLogger();
        o oVar = this.f30454c;
        PackageInfo a10 = p.a(context, 4096, logger, oVar);
        if (a10 != null) {
            String b9 = p.b(a10, oVar);
            if (z10.f21927l == null) {
                z10.f21927l = b9;
            }
            aVar.f22141a = a10.packageName;
            aVar.f22146f = a10.versionName;
            aVar.f22147g = p.b(a10, oVar);
            HashMap hashMap = new HashMap();
            String[] strArr = a10.requestedPermissions;
            int[] iArr = a10.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i9 = 0; i9 < strArr.length; i9++) {
                    String str2 = strArr[i9];
                    hashMap.put(str2.substring(str2.lastIndexOf(46) + 1), (iArr[i9] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            aVar.f22148h = hashMap;
        }
        z10.f21918b.put(com.sumsub.sentry.a.f13540h, aVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(2:126|127)|(13:131|132|133|134|(8:138|139|140|141|142|(2:144|145)|147|145)|151|139|140|141|142|(0)|147|145)|155|132|133|134|(8:138|139|140|141|142|(0)|147|145)|151|139|140|141|142|(0)|147|145) */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00f4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00f5, code lost:
    
        r6.getLogger().f(io.sentry.SentryLevel.ERROR, "Error getting battery temperature.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00d4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00d5, code lost:
    
        r6.getLogger().f(io.sentry.SentryLevel.ERROR, "Error getting device charging state.", r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00eb A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #10 {all -> 0x00f4, blocks: (B:142:0x00e3, B:144:0x00eb), top: B:141:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0339 A[Catch: all -> 0x033e, TRY_LEAVE, TryCatch #15 {all -> 0x033e, blocks: (B:166:0x032b, B:168:0x0339), top: B:165:0x032b }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0424 A[Catch: all -> 0x0429, TryCatch #3 {all -> 0x0429, blocks: (B:214:0x0416, B:216:0x0424, B:217:0x042b, B:219:0x0439), top: B:213:0x0416 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0439 A[Catch: all -> 0x0429, TRY_LEAVE, TryCatch #3 {all -> 0x0429, blocks: (B:214:0x0416, B:216:0x0424, B:217:0x042b, B:219:0x0439), top: B:213:0x0416 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0486 A[Catch: all -> 0x04ac, TryCatch #5 {all -> 0x04ac, blocks: (B:231:0x0476, B:233:0x0486, B:234:0x0490, B:236:0x0496), top: B:230:0x0476 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0241 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(io.sentry.Z r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.q.c(io.sentry.Z, boolean, boolean):void");
    }

    @Override // io.sentry.InterfaceC0850h
    public final i0 d(i0 i0Var, C0852j c0852j) {
        boolean z10;
        boolean z11;
        if (J9.b.d(c0852j)) {
            z10 = true;
        } else {
            this.f30456e.getLogger().h(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", i0Var.f21917a);
            z10 = false;
        }
        if (z10) {
            b(i0Var);
            N n10 = i0Var.f22039r;
            if ((n10 != null ? (ArrayList) n10.f535b : null) != null) {
                Iterator it = (n10 != null ? (ArrayList) n10.f535b : null).iterator();
                while (it.hasNext()) {
                    H9.l lVar = (H9.l) it.next();
                    if (lVar.f1643f == null) {
                        Long l10 = lVar.f1638a;
                        if (l10 != null) {
                            if (Looper.getMainLooper().getThread().getId() == l10.longValue()) {
                                z11 = true;
                                lVar.f1643f = Boolean.valueOf(z11);
                            }
                        }
                        z11 = false;
                        lVar.f1643f = Boolean.valueOf(z11);
                    }
                }
            }
        }
        c(i0Var, true, z10);
        return i0Var;
    }

    @Override // io.sentry.InterfaceC0850h
    public final H9.m i(H9.m mVar, C0852j c0852j) {
        boolean z10;
        if (J9.b.d(c0852j)) {
            z10 = true;
        } else {
            this.f30456e.getLogger().h(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", mVar.f21917a);
            z10 = false;
        }
        if (z10) {
            b(mVar);
        }
        c(mVar, false, z10);
        return mVar;
    }
}
