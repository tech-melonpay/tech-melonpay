package com.sumsub.sentry;

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
import ra.O;

@InterfaceC1080d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0001\u0018\u0000 72\u00020\u0001:\u0002\u001a\u001fBs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB\u0087\u0001\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001c\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010\u001c\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u001e\"\u0004\b\u001a\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001c\u0012\u0004\b'\u0010\"\u001a\u0004\b&\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010\u001c\u0012\u0004\b*\u0010\"\u001a\u0004\b)\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010\u001c\u0012\u0004\b,\u0010\"\u001a\u0004\b+\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\u001c\u0012\u0004\b.\u0010\"\u001a\u0004\b%\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u001c\u0012\u0004\b0\u0010\"\u001a\u0004\b/\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010\"\u001a\u0004\b3\u00104R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001c\u0012\u0004\b6\u0010\"\u001a\u0004\b\u001a\u0010\u001e¨\u00068"}, d2 = {"Lcom/sumsub/sentry/f;", "", "", "uuid", "type", "debugId", "debugFile", "codeId", "codeFile", "imageAddr", "", "imageSize", "arch", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/f;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "getUuid$annotations", "()V", "o", "getType$annotations", "c", "i", "getDebugId$annotations", "d", "g", "getDebugFile$annotations", "e", "getCodeId$annotations", "f", "getCodeFile$annotations", "k", "getImageAddr$annotations", "h", "Ljava/lang/Long;", "m", "()Ljava/lang/Long;", "getImageSize$annotations", "getArch$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    public static final String f13619j = "proguard";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String uuid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String debugId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String debugFile;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String codeId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String codeFile;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final String imageAddr;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final Long imageSize;

    /* renamed from: i, reason: from kotlin metadata */
    public final String arch;

    public static final class a implements InterfaceC1162A<f> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13628a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13629b;

        static {
            a aVar = new a();
            f13628a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.DebugImage", aVar, 9);
            pluginGeneratedSerialDescriptor.k("uuid", true);
            pluginGeneratedSerialDescriptor.k("type", true);
            pluginGeneratedSerialDescriptor.k("debug_id", true);
            pluginGeneratedSerialDescriptor.k("debug_file", true);
            pluginGeneratedSerialDescriptor.k("code_id", true);
            pluginGeneratedSerialDescriptor.k("code_file", true);
            pluginGeneratedSerialDescriptor.k("image_addr", true);
            pluginGeneratedSerialDescriptor.k("image_size", true);
            pluginGeneratedSerialDescriptor.k("arch", true);
            f13629b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f deserialize(InterfaceC1144d interfaceC1144d) {
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
                        obj7 = c2.D(descriptor, 6, ra.m0.f26414a, obj7);
                        i |= 64;
                        break;
                    case 7:
                        obj8 = c2.D(descriptor, 7, O.f26364a, obj8);
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
            return new f(i, (String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (Long) obj8, (String) obj9, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            ra.m0 m0Var = ra.m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(O.f26364a), C1095a.a(m0Var)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13629b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, f fVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            f.a(fVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.f$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<f> serializer() {
            return a.f13628a;
        }

        public Companion() {
        }
    }

    public f() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, 511, (DefaultConstructorMarker) null);
    }

    public static final void a(f self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.uuid != null) {
            output.e(serialDesc, 0, ra.m0.f26414a, self.uuid);
        }
        if (output.D() || self.type != null) {
            output.e(serialDesc, 1, ra.m0.f26414a, self.type);
        }
        if (output.D() || self.debugId != null) {
            output.e(serialDesc, 2, ra.m0.f26414a, self.debugId);
        }
        if (output.D() || self.debugFile != null) {
            output.e(serialDesc, 3, ra.m0.f26414a, self.debugFile);
        }
        if (output.D() || self.codeId != null) {
            output.e(serialDesc, 4, ra.m0.f26414a, self.codeId);
        }
        if (output.D() || self.codeFile != null) {
            output.e(serialDesc, 5, ra.m0.f26414a, self.codeFile);
        }
        if (output.D() || self.imageAddr != null) {
            output.e(serialDesc, 6, ra.m0.f26414a, self.imageAddr);
        }
        if (output.D() || self.imageSize != null) {
            output.e(serialDesc, 7, O.f26364a, self.imageSize);
        }
        if (!output.D() && self.arch == null) {
            return;
        }
        output.e(serialDesc, 8, ra.m0.f26414a, self.arch);
    }

    public static /* synthetic */ void b() {
    }

    /* renamed from: c, reason: from getter */
    public final String getCodeFile() {
        return this.codeFile;
    }

    /* renamed from: e, reason: from getter */
    public final String getCodeId() {
        return this.codeId;
    }

    /* renamed from: g, reason: from getter */
    public final String getDebugFile() {
        return this.debugFile;
    }

    /* renamed from: i, reason: from getter */
    public final String getDebugId() {
        return this.debugId;
    }

    /* renamed from: k, reason: from getter */
    public final String getImageAddr() {
        return this.imageAddr;
    }

    /* renamed from: m, reason: from getter */
    public final Long getImageSize() {
        return this.imageSize;
    }

    /* renamed from: o, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: q, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public /* synthetic */ f(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l10, String str8, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str;
        }
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.debugId = null;
        } else {
            this.debugId = str3;
        }
        if ((i & 8) == 0) {
            this.debugFile = null;
        } else {
            this.debugFile = str4;
        }
        if ((i & 16) == 0) {
            this.codeId = null;
        } else {
            this.codeId = str5;
        }
        if ((i & 32) == 0) {
            this.codeFile = null;
        } else {
            this.codeFile = str6;
        }
        if ((i & 64) == 0) {
            this.imageAddr = null;
        } else {
            this.imageAddr = str7;
        }
        if ((i & 128) == 0) {
            this.imageSize = null;
        } else {
            this.imageSize = l10;
        }
        if ((i & 256) == 0) {
            this.arch = null;
        } else {
            this.arch = str8;
        }
    }

    public final void a(String str) {
        this.type = str;
    }

    public final void b(String str) {
        this.uuid = str;
    }

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l10, String str8) {
        this.uuid = str;
        this.type = str2;
        this.debugId = str3;
        this.debugFile = str4;
        this.codeId = str5;
        this.codeFile = str6;
        this.imageAddr = str7;
        this.imageSize = l10;
        this.arch = str8;
    }

    /* renamed from: a, reason: from getter */
    public final String getArch() {
        return this.arch;
    }

    public /* synthetic */ f(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l10, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : l10, (i & 256) == 0 ? str8 : null);
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
