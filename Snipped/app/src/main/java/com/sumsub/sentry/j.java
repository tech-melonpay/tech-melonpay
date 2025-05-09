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
import ra.H;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0001\u0018\u0000 :2\u00020\u0001:\u0002\u001c#Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0011B\u0087\u0001\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0015J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\"\u001a\u0004\b%\u0010&R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010$\u0012\u0004\b)\u0010\"\u001a\u0004\b(\u0010&R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u001e\u0012\u0004\b,\u0010\"\u001a\u0004\b+\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010$\u0012\u0004\b.\u0010\"\u001a\u0004\b-\u0010&R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010\u001e\u0012\u0004\b0\u0010\"\u001a\u0004\b\u001c\u0010 R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00101\u0012\u0004\b4\u0010\"\u001a\u0004\b2\u00103R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010\u001e\u0012\u0004\b7\u0010\"\u001a\u0004\b6\u0010 R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010\u001e\u0012\u0004\b9\u0010\"\u001a\u0004\b8\u0010 ¨\u0006;"}, d2 = {"Lcom/sumsub/sentry/j;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "id", "vendorId", "vendorName", "memorySize", "apiType", "", "isMultiThreadedRendering", "version", "npotSupport", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", j.f13677j, "(Lcom/sumsub/sentry/j;)V", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/j;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "getName$annotations", "()V", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "getId$annotations", "k", "getVendorId$annotations", "d", "m", "getVendorName$annotations", "e", "getMemorySize$annotations", "f", "getApiType$annotations", "Ljava/lang/Boolean;", "q", "()Ljava/lang/Boolean;", "isMultiThreadedRendering$annotations", "h", "o", "getVersion$annotations", "i", "getNpotSupport$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    public static final String f13677j = "gpu";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Integer id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Integer vendorId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String vendorName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Integer memorySize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String apiType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Boolean isMultiThreadedRendering;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final String version;

    /* renamed from: i, reason: from kotlin metadata */
    public final String npotSupport;

    public static final class a implements InterfaceC1162A<j> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13686a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13687b;

        static {
            a aVar = new a();
            f13686a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.Gpu", aVar, 9);
            pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, true);
            pluginGeneratedSerialDescriptor.k("id", true);
            pluginGeneratedSerialDescriptor.k("vendor_id", true);
            pluginGeneratedSerialDescriptor.k("vendor_name", true);
            pluginGeneratedSerialDescriptor.k("memory_size", true);
            pluginGeneratedSerialDescriptor.k("api_type", true);
            pluginGeneratedSerialDescriptor.k("multi_threaded_rendering", true);
            pluginGeneratedSerialDescriptor.k("version", true);
            pluginGeneratedSerialDescriptor.k("npot_support", true);
            f13687b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            int i = 0;
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
                        obj2 = c2.D(descriptor, 1, H.f26353a, obj2);
                        i |= 2;
                        break;
                    case 2:
                        obj3 = c2.D(descriptor, 2, H.f26353a, obj3);
                        i |= 4;
                        break;
                    case 3:
                        obj4 = c2.D(descriptor, 3, ra.m0.f26414a, obj4);
                        i |= 8;
                        break;
                    case 4:
                        obj5 = c2.D(descriptor, 4, H.f26353a, obj5);
                        i |= 16;
                        break;
                    case 5:
                        obj6 = c2.D(descriptor, 5, ra.m0.f26414a, obj6);
                        i |= 32;
                        break;
                    case 6:
                        obj7 = c2.D(descriptor, 6, C1172g.f26395a, obj7);
                        i |= 64;
                        break;
                    case 7:
                        obj8 = c2.D(descriptor, 7, ra.m0.f26414a, obj8);
                        i |= 128;
                        break;
                    case 8:
                        obj9 = c2.D(descriptor, 8, ra.m0.f26414a, obj9);
                        i |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            c2.b(descriptor);
            return new j(i, (String) obj, (Integer) obj2, (Integer) obj3, (String) obj4, (Integer) obj5, (String) obj6, (Boolean) obj7, (String) obj8, (String) obj9, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            ra.m0 m0Var = ra.m0.f26414a;
            InterfaceC1078b<?> a10 = C1095a.a(m0Var);
            H h9 = H.f26353a;
            return new InterfaceC1078b[]{a10, C1095a.a(h9), C1095a.a(h9), C1095a.a(m0Var), C1095a.a(h9), C1095a.a(m0Var), C1095a.a(C1172g.f26395a), C1095a.a(m0Var), C1095a.a(m0Var)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13687b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, j jVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            j.a(jVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.j$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<j> serializer() {
            return a.f13686a;
        }

        public Companion() {
        }
    }

    public j() {
        this((String) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (String) null, (Boolean) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
    }

    public static final void a(j self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.name != null) {
            output.e(serialDesc, 0, ra.m0.f26414a, self.name);
        }
        if (output.D() || self.id != null) {
            output.e(serialDesc, 1, H.f26353a, self.id);
        }
        if (output.D() || self.vendorId != null) {
            output.e(serialDesc, 2, H.f26353a, self.vendorId);
        }
        if (output.D() || self.vendorName != null) {
            output.e(serialDesc, 3, ra.m0.f26414a, self.vendorName);
        }
        if (output.D() || self.memorySize != null) {
            output.e(serialDesc, 4, H.f26353a, self.memorySize);
        }
        if (output.D() || self.apiType != null) {
            output.e(serialDesc, 5, ra.m0.f26414a, self.apiType);
        }
        if (output.D() || self.isMultiThreadedRendering != null) {
            output.e(serialDesc, 6, C1172g.f26395a, self.isMultiThreadedRendering);
        }
        if (output.D() || self.version != null) {
            output.e(serialDesc, 7, ra.m0.f26414a, self.version);
        }
        if (!output.D() && self.npotSupport == null) {
            return;
        }
        output.e(serialDesc, 8, ra.m0.f26414a, self.npotSupport);
    }

    /* renamed from: c, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getMemorySize() {
        return this.memorySize;
    }

    /* renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: i, reason: from getter */
    public final String getNpotSupport() {
        return this.npotSupport;
    }

    /* renamed from: k, reason: from getter */
    public final Integer getVendorId() {
        return this.vendorId;
    }

    /* renamed from: m, reason: from getter */
    public final String getVendorName() {
        return this.vendorName;
    }

    /* renamed from: o, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: q, reason: from getter */
    public final Boolean getIsMultiThreadedRendering() {
        return this.isMultiThreadedRendering;
    }

    public /* synthetic */ j(int i, String str, Integer num, Integer num2, String str2, Integer num3, String str3, Boolean bool, String str4, String str5, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.id = null;
        } else {
            this.id = num;
        }
        if ((i & 4) == 0) {
            this.vendorId = null;
        } else {
            this.vendorId = num2;
        }
        if ((i & 8) == 0) {
            this.vendorName = null;
        } else {
            this.vendorName = str2;
        }
        if ((i & 16) == 0) {
            this.memorySize = null;
        } else {
            this.memorySize = num3;
        }
        if ((i & 32) == 0) {
            this.apiType = null;
        } else {
            this.apiType = str3;
        }
        if ((i & 64) == 0) {
            this.isMultiThreadedRendering = null;
        } else {
            this.isMultiThreadedRendering = bool;
        }
        if ((i & 128) == 0) {
            this.version = null;
        } else {
            this.version = str4;
        }
        if ((i & 256) == 0) {
            this.npotSupport = null;
        } else {
            this.npotSupport = str5;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getApiType() {
        return this.apiType;
    }

    public j(String str, Integer num, Integer num2, String str2, Integer num3, String str3, Boolean bool, String str4, String str5) {
        this.name = str;
        this.id = num;
        this.vendorId = num2;
        this.vendorName = str2;
        this.memorySize = num3;
        this.apiType = str3;
        this.isMultiThreadedRendering = bool;
        this.version = str4;
        this.npotSupport = str5;
    }

    public /* synthetic */ j(String str, Integer num, Integer num2, String str2, Integer num3, String str3, Boolean bool, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? str5 : null);
    }

    public j(j jVar) {
        this(jVar.name, jVar.id, jVar.vendorId, jVar.vendorName, jVar.memorySize, jVar.apiType, jVar.isMultiThreadedRendering, jVar.version, jVar.npotSupport);
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

    public static /* synthetic */ void r() {
    }
}
