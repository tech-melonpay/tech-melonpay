package com.sumsub.sentry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import ra.C1172g;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0001\u0018\u0000 02\u00020\u0001:\u0002\u0019\"BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\rBc\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\n\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u001b\u0012\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\"\u0010\u001b\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001d\"\u0004\b\u001c\u0010\u001fR*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010\u001b\u0012\u0004\b'\u0010!\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b&\u0010\u001b\u0012\u0004\b(\u0010!\u001a\u0004\b\u0019\u0010\u001d\"\u0004\b\u0019\u0010\u001fR*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001b\u0012\u0004\b)\u0010!\u001a\u0004\b\u001e\u0010\u001d\"\u0004\b\"\u0010\u001fR*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b/\u0010!\u001a\u0004\b,\u0010-\"\u0004\b\u0019\u0010.¨\u00061"}, d2 = {"Lcom/sumsub/sentry/q;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "version", "rawDescription", "build", "kernelVersion", "", "isRooted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "operatingSystem", "(Lcom/sumsub/sentry/q;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/q;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "getName$annotations", "()V", "b", "i", "getVersion$annotations", "g", "d", "getRawDescription$annotations", "getBuild$annotations", "getKernelVersion$annotations", "f", "Ljava/lang/Boolean;", "k", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)V", "isRooted$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public static final String f13755g = "os";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public String version;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String rawDescription;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String build;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public String kernelVersion;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Boolean isRooted;

    public static final class a implements InterfaceC1162A<q> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13762a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13763b;

        static {
            a aVar = new a();
            f13762a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.OperatingSystem", aVar, 6);
            pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, true);
            pluginGeneratedSerialDescriptor.k("version", true);
            pluginGeneratedSerialDescriptor.k("raw_description", true);
            pluginGeneratedSerialDescriptor.k("build", true);
            pluginGeneratedSerialDescriptor.k("kernel_version", true);
            pluginGeneratedSerialDescriptor.k("rooted", true);
            f13763b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q deserialize(InterfaceC1144d interfaceC1144d) {
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
                        obj6 = c2.D(descriptor, 5, C1172g.f26395a, obj6);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            c2.b(descriptor);
            return new q(i, (String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (Boolean) obj6, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            ra.m0 m0Var = ra.m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(C1172g.f26395a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13763b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, q qVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            q.a(qVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.q$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<q> serializer() {
            return a.f13762a;
        }

        public Companion() {
        }
    }

    public q() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 63, (DefaultConstructorMarker) null);
    }

    public static final void a(q self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.name != null) {
            output.e(serialDesc, 0, ra.m0.f26414a, self.name);
        }
        if (output.D() || self.version != null) {
            output.e(serialDesc, 1, ra.m0.f26414a, self.version);
        }
        if (output.D() || self.rawDescription != null) {
            output.e(serialDesc, 2, ra.m0.f26414a, self.rawDescription);
        }
        if (output.D() || self.build != null) {
            output.e(serialDesc, 3, ra.m0.f26414a, self.build);
        }
        if (output.D() || self.kernelVersion != null) {
            output.e(serialDesc, 4, ra.m0.f26414a, self.kernelVersion);
        }
        if (!output.D() && self.isRooted == null) {
            return;
        }
        output.e(serialDesc, 5, C1172g.f26395a, self.isRooted);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    public final void c(String str) {
        this.name = str;
    }

    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: g, reason: from getter */
    public final String getRawDescription() {
        return this.rawDescription;
    }

    /* renamed from: i, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: k, reason: from getter */
    public final Boolean getIsRooted() {
        return this.isRooted;
    }

    public /* synthetic */ q(int i, String str, String str2, String str3, String str4, String str5, Boolean bool, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.version = null;
        } else {
            this.version = str2;
        }
        if ((i & 4) == 0) {
            this.rawDescription = null;
        } else {
            this.rawDescription = str3;
        }
        if ((i & 8) == 0) {
            this.build = null;
        } else {
            this.build = str4;
        }
        if ((i & 16) == 0) {
            this.kernelVersion = null;
        } else {
            this.kernelVersion = str5;
        }
        if ((i & 32) == 0) {
            this.isRooted = null;
        } else {
            this.isRooted = bool;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getBuild() {
        return this.build;
    }

    public final void b(String str) {
        this.kernelVersion = str;
    }

    /* renamed from: c, reason: from getter */
    public final String getKernelVersion() {
        return this.kernelVersion;
    }

    public final void d(String str) {
        this.rawDescription = str;
    }

    public final void e(String str) {
        this.version = str;
    }

    public q(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        this.name = str;
        this.version = str2;
        this.rawDescription = str3;
        this.build = str4;
        this.kernelVersion = str5;
        this.isRooted = bool;
    }

    public final void a(String str) {
        this.build = str;
    }

    public final void a(Boolean bool) {
        this.isRooted = bool;
    }

    public /* synthetic */ q(String str, String str2, String str3, String str4, String str5, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool);
    }

    public q(q qVar) {
        this(qVar.name, qVar.version, qVar.rawDescription, qVar.build, qVar.kernelVersion, qVar.isRooted);
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void l() {
    }
}
