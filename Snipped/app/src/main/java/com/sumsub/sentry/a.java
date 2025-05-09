package com.sumsub.sentry;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import oa.C1095a;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.InterfaceC1162A;
import ra.K;

@InterfaceC1080d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0001\u0018\u0000 32\u00020\u0001:\u0002\u001a\u001fBg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u000eB{\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000b\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001c\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001c\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u0012\u0004\b&\u0010\"\u001a\u0004\b%\u0010\u001eR*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b'\u0010\u001c\u0012\u0004\b)\u0010\"\u001a\u0004\b(\u0010\u001e\"\u0004\b\u001d\u0010 R*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010\u001c\u0012\u0004\b+\u0010\"\u001a\u0004\b*\u0010\u001e\"\u0004\b'\u0010 R*\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b,\u0010\u001c\u0012\u0004\b-\u0010\"\u001a\u0004\b\u001a\u0010\u001e\"\u0004\b\u001a\u0010 R6\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b*\u0010.\u0012\u0004\b2\u0010\"\u001a\u0004\b/\u00100\"\u0004\b\u001a\u00101¨\u00064"}, d2 = {"Lcom/sumsub/sentry/a;", "", "", "appIdentifier", "deviceAppHash", "buildType", "appName", "appVersion", "appBuild", "", "permissions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", a.f13540h, "(Lcom/sumsub/sentry/a;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/a;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "getAppIdentifier$annotations", "()V", "k", "getDeviceAppHash$annotations", "i", "getBuildType$annotations", "d", "e", "getAppName$annotations", "g", "getAppVersion$annotations", "f", "getAppBuild$annotations", "Ljava/util/Map;", "m", "()Ljava/util/Map;", "(Ljava/util/Map;)V", "getPermissions$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    public static final String f13540h = "app";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String appIdentifier;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String deviceAppHash;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String buildType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String appName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public String appVersion;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public String appBuild;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Map<String, String> permissions;

    /* renamed from: com.sumsub.sentry.a$a, reason: collision with other inner class name */
    public static final class C0143a implements InterfaceC1162A<a> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0143a f13548a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13549b;

        static {
            C0143a c0143a = new C0143a();
            f13548a = c0143a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.App", c0143a, 7);
            pluginGeneratedSerialDescriptor.k("app_identifier", true);
            pluginGeneratedSerialDescriptor.k("device_app_hash", true);
            pluginGeneratedSerialDescriptor.k("build_type", true);
            pluginGeneratedSerialDescriptor.k("app_name", true);
            pluginGeneratedSerialDescriptor.k("app_version", true);
            pluginGeneratedSerialDescriptor.k("app_build", true);
            pluginGeneratedSerialDescriptor.k("permissions", true);
            f13549b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                switch (q10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        obj = c2.D(descriptor, 0, ra.m0.f26414a, obj);
                        i |= 1;
                        break;
                    case 1:
                        obj2 = c2.D(descriptor, 1, ra.m0.f26414a, obj2);
                        i |= 2;
                        break;
                    case 2:
                        obj3 = c2.D(descriptor, 2, ra.m0.f26414a, obj3);
                        i |= 4;
                        break;
                    case 3:
                        obj4 = c2.D(descriptor, 3, ra.m0.f26414a, obj4);
                        i |= 8;
                        break;
                    case 4:
                        obj5 = c2.D(descriptor, 4, ra.m0.f26414a, obj5);
                        i |= 16;
                        break;
                    case 5:
                        obj6 = c2.D(descriptor, 5, ra.m0.f26414a, obj6);
                        i |= 32;
                        break;
                    case 6:
                        ra.m0 m0Var = ra.m0.f26414a;
                        obj7 = c2.D(descriptor, 6, new K(m0Var, m0Var), obj7);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            c2.b(descriptor);
            return new a(i, (String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (Map) obj7, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            ra.m0 m0Var = ra.m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(new K(m0Var, m0Var))};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13549b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, a aVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            a.a(aVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<a> serializer() {
            return C0143a.f13548a;
        }

        public Companion() {
        }
    }

    public a() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 127, (DefaultConstructorMarker) null);
    }

    public static final void a(a self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.appIdentifier != null) {
            output.e(serialDesc, 0, ra.m0.f26414a, self.appIdentifier);
        }
        if (output.D() || self.deviceAppHash != null) {
            output.e(serialDesc, 1, ra.m0.f26414a, self.deviceAppHash);
        }
        if (output.D() || self.buildType != null) {
            output.e(serialDesc, 2, ra.m0.f26414a, self.buildType);
        }
        if (output.D() || self.appName != null) {
            output.e(serialDesc, 3, ra.m0.f26414a, self.appName);
        }
        if (output.D() || self.appVersion != null) {
            output.e(serialDesc, 4, ra.m0.f26414a, self.appVersion);
        }
        if (output.D() || self.appBuild != null) {
            output.e(serialDesc, 5, ra.m0.f26414a, self.appBuild);
        }
        if (!output.D() && self.permissions == null) {
            return;
        }
        ra.m0 m0Var = ra.m0.f26414a;
        output.e(serialDesc, 6, new K(m0Var, m0Var), self.permissions);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    /* renamed from: c, reason: from getter */
    public final String getAppIdentifier() {
        return this.appIdentifier;
    }

    /* renamed from: e, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: g, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: i, reason: from getter */
    public final String getBuildType() {
        return this.buildType;
    }

    /* renamed from: k, reason: from getter */
    public final String getDeviceAppHash() {
        return this.deviceAppHash;
    }

    public final Map<String, String> m() {
        return this.permissions;
    }

    public /* synthetic */ a(int i, String str, String str2, String str3, String str4, String str5, String str6, Map map, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.appIdentifier = null;
        } else {
            this.appIdentifier = str;
        }
        if ((i & 2) == 0) {
            this.deviceAppHash = null;
        } else {
            this.deviceAppHash = str2;
        }
        if ((i & 4) == 0) {
            this.buildType = null;
        } else {
            this.buildType = str3;
        }
        if ((i & 8) == 0) {
            this.appName = null;
        } else {
            this.appName = str4;
        }
        if ((i & 16) == 0) {
            this.appVersion = null;
        } else {
            this.appVersion = str5;
        }
        if ((i & 32) == 0) {
            this.appBuild = null;
        } else {
            this.appBuild = str6;
        }
        if ((i & 64) == 0) {
            this.permissions = null;
        } else {
            this.permissions = map;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getAppBuild() {
        return this.appBuild;
    }

    public final void b(String str) {
        this.appIdentifier = str;
    }

    public final void c(String str) {
        this.appName = str;
    }

    public final void d(String str) {
        this.appVersion = str;
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.appIdentifier = str;
        this.deviceAppHash = str2;
        this.buildType = str3;
        this.appName = str4;
        this.appVersion = str5;
        this.appBuild = str6;
        this.permissions = map;
    }

    public final void a(String str) {
        this.appBuild = str;
    }

    public final void a(Map<String, String> map) {
        this.permissions = map;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(com.sumsub.sentry.a r9) {
        /*
            r8 = this;
            java.lang.String r6 = r9.appBuild
            java.lang.String r1 = r9.appIdentifier
            java.lang.String r4 = r9.appName
            java.lang.String r5 = r9.appVersion
            java.lang.String r3 = r9.buildType
            java.lang.String r2 = r9.deviceAppHash
            java.util.Map<java.lang.String, java.lang.String> r9 = r9.permissions
            if (r9 == 0) goto L17
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r9)
            r7 = r0
            goto L19
        L17:
            r9 = 0
            r7 = r9
        L19:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sentry.a.<init>(com.sumsub.sentry.a):void");
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void n() {
    }
}
