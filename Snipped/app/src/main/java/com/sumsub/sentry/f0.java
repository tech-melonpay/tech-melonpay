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
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000  2\u00020\u0001:\u0002\u0015\u001bB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\tB?\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001e\u0010\u0018¨\u0006!"}, d2 = {"Lcom/sumsub/sentry/f0;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "version", "rawDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sentryRuntime", "(Lcom/sumsub/sentry/f0;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/f0;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "()Ljava/lang/String;", "getName$annotations", "()V", "b", "e", "getVersion$annotations", "c", "getRawDescription$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f13630d = "runtime";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String version;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String rawDescription;

    public static final class a implements InterfaceC1162A<f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13634a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13635b;

        static {
            a aVar = new a();
            f13634a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.SentryRuntime", aVar, 3);
            pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, true);
            pluginGeneratedSerialDescriptor.k("version", true);
            pluginGeneratedSerialDescriptor.k("raw_description", true);
            f13635b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f0 deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj = c2.D(descriptor, 0, ra.m0.f26414a, obj);
                    i |= 1;
                } else if (q10 == 1) {
                    obj2 = c2.D(descriptor, 1, ra.m0.f26414a, obj2);
                    i |= 2;
                } else {
                    if (q10 != 2) {
                        throw new UnknownFieldException(q10);
                    }
                    obj3 = c2.D(descriptor, 2, ra.m0.f26414a, obj3);
                    i |= 4;
                }
            }
            c2.b(descriptor);
            return new f0(i, (String) obj, (String) obj2, (String) obj3, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            ra.m0 m0Var = ra.m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13635b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, f0 f0Var) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            f0.a(f0Var, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.f0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<f0> serializer() {
            return a.f13634a;
        }

        public Companion() {
        }
    }

    public f0() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static final void a(f0 self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.name != null) {
            output.e(serialDesc, 0, ra.m0.f26414a, self.name);
        }
        if (output.D() || self.version != null) {
            output.e(serialDesc, 1, ra.m0.f26414a, self.version);
        }
        if (!output.D() && self.rawDescription == null) {
            return;
        }
        output.e(serialDesc, 2, ra.m0.f26414a, self.rawDescription);
    }

    /* renamed from: c, reason: from getter */
    public final String getRawDescription() {
        return this.rawDescription;
    }

    /* renamed from: e, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public /* synthetic */ f0(int i, String str, String str2, String str3, ra.i0 i0Var) {
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
    }

    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public f0(String str, String str2, String str3) {
        this.name = str;
        this.version = str2;
        this.rawDescription = str3;
    }

    public /* synthetic */ f0(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public f0(f0 f0Var) {
        this(f0Var.name, f0Var.version, f0Var.rawDescription);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }
}
