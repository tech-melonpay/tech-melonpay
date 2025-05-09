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
import ra.H;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 $2\u00020\u0001:\u0002\u0014\u001aB7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBK\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u0012\u0004\b \u0010\u0019\u001a\u0004\b\u001f\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001b\u0012\u0004\b#\u0010\u0019\u001a\u0004\b\"\u0010\u001d¨\u0006%"}, d2 = {"Lcom/sumsub/sentry/r;", "", "", "sdkName", "", "versionMajor", "versionMinor", "versionPatchlevel", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/r;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "()Ljava/lang/String;", "getSdkName$annotations", "()V", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "getVersionMajor$annotations", "e", "getVersionMinor$annotations", "d", "g", "getVersionPatchlevel$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String sdkName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Integer versionMajor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Integer versionMinor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Integer versionPatchlevel;

    public static final class a implements InterfaceC1162A<r> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13774a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13775b;

        static {
            a aVar = new a();
            f13774a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.SdkInfo", aVar, 4);
            pluginGeneratedSerialDescriptor.k("sdk_name", true);
            pluginGeneratedSerialDescriptor.k("version_major", true);
            pluginGeneratedSerialDescriptor.k("version_minor", true);
            pluginGeneratedSerialDescriptor.k("version_patchlevel", true);
            f13775b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj = c2.D(descriptor, 0, ra.m0.f26414a, obj);
                    i |= 1;
                } else if (q10 == 1) {
                    obj2 = c2.D(descriptor, 1, H.f26353a, obj2);
                    i |= 2;
                } else if (q10 == 2) {
                    obj3 = c2.D(descriptor, 2, H.f26353a, obj3);
                    i |= 4;
                } else {
                    if (q10 != 3) {
                        throw new UnknownFieldException(q10);
                    }
                    obj4 = c2.D(descriptor, 3, H.f26353a, obj4);
                    i |= 8;
                }
            }
            c2.b(descriptor);
            return new r(i, (String) obj, (Integer) obj2, (Integer) obj3, (Integer) obj4, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            InterfaceC1078b<?> a10 = C1095a.a(ra.m0.f26414a);
            H h9 = H.f26353a;
            return new InterfaceC1078b[]{a10, C1095a.a(h9), C1095a.a(h9), C1095a.a(h9)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13775b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, r rVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            r.a(rVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.r$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<r> serializer() {
            return a.f13774a;
        }

        public Companion() {
        }
    }

    public r() {
        this((String) null, (Integer) null, (Integer) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    public static final void a(r self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.sdkName != null) {
            output.e(serialDesc, 0, ra.m0.f26414a, self.sdkName);
        }
        if (output.D() || self.versionMajor != null) {
            output.e(serialDesc, 1, H.f26353a, self.versionMajor);
        }
        if (output.D() || self.versionMinor != null) {
            output.e(serialDesc, 2, H.f26353a, self.versionMinor);
        }
        if (!output.D() && self.versionPatchlevel == null) {
            return;
        }
        output.e(serialDesc, 3, H.f26353a, self.versionPatchlevel);
    }

    /* renamed from: c, reason: from getter */
    public final Integer getVersionMajor() {
        return this.versionMajor;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getVersionMinor() {
        return this.versionMinor;
    }

    /* renamed from: g, reason: from getter */
    public final Integer getVersionPatchlevel() {
        return this.versionPatchlevel;
    }

    public /* synthetic */ r(int i, String str, Integer num, Integer num2, Integer num3, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.sdkName = null;
        } else {
            this.sdkName = str;
        }
        if ((i & 2) == 0) {
            this.versionMajor = null;
        } else {
            this.versionMajor = num;
        }
        if ((i & 4) == 0) {
            this.versionMinor = null;
        } else {
            this.versionMinor = num2;
        }
        if ((i & 8) == 0) {
            this.versionPatchlevel = null;
        } else {
            this.versionPatchlevel = num3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getSdkName() {
        return this.sdkName;
    }

    public r(String str, Integer num, Integer num2, Integer num3) {
        this.sdkName = str;
        this.versionMajor = num;
        this.versionMinor = num2;
        this.versionPatchlevel = num3;
    }

    public /* synthetic */ r(String str, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void h() {
    }
}
