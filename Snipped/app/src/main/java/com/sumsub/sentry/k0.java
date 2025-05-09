package com.sumsub.sentry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.sumsub.sentry.i0;
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
import ra.H;
import ra.InterfaceC1162A;
import ra.O;

@InterfaceC1080d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0001\u0018\u0000 =2\u00020\u0001:\u0002\u001b#Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B{\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010\u001d\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b\u001b\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\"\u001a\u0004\b%\u0010&R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\"\u001a\u0004\b*\u0010+R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010)\u0012\u0004\b/\u0010\"\u001a\u0004\b.\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b3\u0010\"\u001a\u0004\b\u001b\u00102R*\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u00101\u0012\u0004\b6\u0010\"\u001a\u0004\b(\u00102\"\u0004\b\u001b\u00105R\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00101\u0012\u0004\b7\u0010\"\u001a\u0004\b0\u00102R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010\"\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/sumsub/sentry/k0;", "", "", "id", "", "priority", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "state", "", "crashed", "current", "daemon", "Lcom/sumsub/sentry/i0;", "stacktrace", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sumsub/sentry/i0;)V", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sumsub/sentry/i0;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/k0;Lqa/c;Lpa/f;)V", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "getId$annotations", "()V", "b", "Ljava/lang/Integer;", "k", "()Ljava/lang/Integer;", "getPriority$annotations", "c", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "getName$annotations", "d", "o", "getState$annotations", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getCrashed$annotations", "f", "(Ljava/lang/Boolean;)V", "getCurrent$annotations", "getDaemon$annotations", "h", "Lcom/sumsub/sentry/i0;", "m", "()Lcom/sumsub/sentry/i0;", "getStacktrace$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Integer priority;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Boolean crashed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Boolean current;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Boolean daemon;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final i0 stacktrace;

    public static final class a implements InterfaceC1162A<k0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13711a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13712b;

        static {
            a aVar = new a();
            f13711a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.SentryThread", aVar, 8);
            pluginGeneratedSerialDescriptor.k("id", true);
            pluginGeneratedSerialDescriptor.k("priority", true);
            pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, true);
            pluginGeneratedSerialDescriptor.k("state", true);
            pluginGeneratedSerialDescriptor.k("crashed", true);
            pluginGeneratedSerialDescriptor.k("current", true);
            pluginGeneratedSerialDescriptor.k("daemon", true);
            pluginGeneratedSerialDescriptor.k("stacktrace", true);
            f13712b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k0 deserialize(InterfaceC1144d interfaceC1144d) {
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
            Object obj8 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                switch (q10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        obj = c2.D(descriptor, 0, O.f26364a, obj);
                        i |= 1;
                        break;
                    case 1:
                        obj2 = c2.D(descriptor, 1, H.f26353a, obj2);
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
                        obj5 = c2.D(descriptor, 4, C1172g.f26395a, obj5);
                        i |= 16;
                        break;
                    case 5:
                        obj6 = c2.D(descriptor, 5, C1172g.f26395a, obj6);
                        i |= 32;
                        break;
                    case 6:
                        obj7 = c2.D(descriptor, 6, C1172g.f26395a, obj7);
                        i |= 64;
                        break;
                    case 7:
                        obj8 = c2.D(descriptor, 7, i0.a.f13675a, obj8);
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            c2.b(descriptor);
            return new k0(i, (Long) obj, (Integer) obj2, (String) obj3, (String) obj4, (Boolean) obj5, (Boolean) obj6, (Boolean) obj7, (i0) obj8, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            InterfaceC1078b<?> a10 = C1095a.a(O.f26364a);
            InterfaceC1078b<?> a11 = C1095a.a(H.f26353a);
            ra.m0 m0Var = ra.m0.f26414a;
            InterfaceC1078b<?> a12 = C1095a.a(m0Var);
            InterfaceC1078b<?> a13 = C1095a.a(m0Var);
            C1172g c1172g = C1172g.f26395a;
            return new InterfaceC1078b[]{a10, a11, a12, a13, C1095a.a(c1172g), C1095a.a(c1172g), C1095a.a(c1172g), C1095a.a(i0.a.f13675a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13712b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, k0 k0Var) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            k0.a(k0Var, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.k0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<k0> serializer() {
            return a.f13711a;
        }

        public Companion() {
        }
    }

    public k0() {
        this((Long) null, (Integer) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (i0) null, 255, (DefaultConstructorMarker) null);
    }

    public static final void a(k0 self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.id != null) {
            output.e(serialDesc, 0, O.f26364a, self.id);
        }
        if (output.D() || self.priority != null) {
            output.e(serialDesc, 1, H.f26353a, self.priority);
        }
        if (output.D() || self.name != null) {
            output.e(serialDesc, 2, ra.m0.f26414a, self.name);
        }
        if (output.D() || self.state != null) {
            output.e(serialDesc, 3, ra.m0.f26414a, self.state);
        }
        if (output.D() || self.crashed != null) {
            output.e(serialDesc, 4, C1172g.f26395a, self.crashed);
        }
        if (output.D() || self.current != null) {
            output.e(serialDesc, 5, C1172g.f26395a, self.current);
        }
        if (output.D() || self.daemon != null) {
            output.e(serialDesc, 6, C1172g.f26395a, self.daemon);
        }
        if (!output.D() && self.stacktrace == null) {
            return;
        }
        output.e(serialDesc, 7, i0.a.f13675a, self.stacktrace);
    }

    /* renamed from: c, reason: from getter */
    public final Boolean getCurrent() {
        return this.current;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getDaemon() {
        return this.daemon;
    }

    /* renamed from: g, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* renamed from: i, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: k, reason: from getter */
    public final Integer getPriority() {
        return this.priority;
    }

    /* renamed from: m, reason: from getter */
    public final i0 getStacktrace() {
        return this.stacktrace;
    }

    /* renamed from: o, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public /* synthetic */ k0(int i, Long l10, Integer num, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, i0 i0Var, ra.i0 i0Var2) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = l10;
        }
        if ((i & 2) == 0) {
            this.priority = null;
        } else {
            this.priority = num;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 8) == 0) {
            this.state = null;
        } else {
            this.state = str2;
        }
        if ((i & 16) == 0) {
            this.crashed = null;
        } else {
            this.crashed = bool;
        }
        if ((i & 32) == 0) {
            this.current = null;
        } else {
            this.current = bool2;
        }
        if ((i & 64) == 0) {
            this.daemon = null;
        } else {
            this.daemon = bool3;
        }
        if ((i & 128) == 0) {
            this.stacktrace = null;
        } else {
            this.stacktrace = i0Var;
        }
    }

    public final void a(Long l10) {
        this.id = l10;
    }

    public k0(Long l10, Integer num, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, i0 i0Var) {
        this.id = l10;
        this.priority = num;
        this.name = str;
        this.state = str2;
        this.crashed = bool;
        this.current = bool2;
        this.daemon = bool3;
        this.stacktrace = i0Var;
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getCrashed() {
        return this.crashed;
    }

    public final void a(Boolean bool) {
        this.current = bool;
    }

    public /* synthetic */ k0(Long l10, Integer num, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, i0 i0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l10, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : bool3, (i & 128) == 0 ? i0Var : null);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
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

    public static /* synthetic */ void p() {
    }
}
