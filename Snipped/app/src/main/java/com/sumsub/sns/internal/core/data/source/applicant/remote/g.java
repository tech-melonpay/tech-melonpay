package com.sumsub.sns.internal.core.data.source.applicant.remote;

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
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002\u0014\u0017B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBK\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010#\u0012\u0004\b+\u0010&\u001a\u0004\b*\u0010\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010'\u0012\u0004\b-\u0010&\u001a\u0004\b,\u0010\u0018¨\u0006/"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/g;", "", "", "ok", "", "description", "code", "correlationId", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/g;Lqa/c;Lpa/f;)V", "()Ljava/lang/Integer;", "b", "()Ljava/lang/String;", "c", "d", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/source/applicant/remote/g;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "k", "getOk$annotations", "()V", "Ljava/lang/String;", "i", "getDescription$annotations", "e", "getCode$annotations", "g", "getCorrelationId$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class g {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Integer ok;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Integer code;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String correlationId;

    public static final class a implements InterfaceC1162A<g> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16002a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f16003b;

        static {
            a aVar = new a();
            f16002a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.BasicResponse", aVar, 4);
            pluginGeneratedSerialDescriptor.k("ok", true);
            pluginGeneratedSerialDescriptor.k("description", true);
            pluginGeneratedSerialDescriptor.k("code", true);
            pluginGeneratedSerialDescriptor.k("correlationId", true);
            f16003b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g deserialize(InterfaceC1144d interfaceC1144d) {
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
                    obj = c2.D(descriptor, 0, H.f26353a, obj);
                    i |= 1;
                } else if (q10 == 1) {
                    obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                    i |= 2;
                } else if (q10 == 2) {
                    obj3 = c2.D(descriptor, 2, H.f26353a, obj3);
                    i |= 4;
                } else {
                    if (q10 != 3) {
                        throw new UnknownFieldException(q10);
                    }
                    obj4 = c2.D(descriptor, 3, m0.f26414a, obj4);
                    i |= 8;
                }
            }
            c2.b(descriptor);
            return new g(i, (Integer) obj, (String) obj2, (Integer) obj3, (String) obj4, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            H h9 = H.f26353a;
            InterfaceC1078b<?> a10 = C1095a.a(h9);
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{a10, C1095a.a(m0Var), C1095a.a(h9), C1095a.a(m0Var)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f16003b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, g gVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            g.a(gVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.g$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<g> serializer() {
            return a.f16002a;
        }

        public Companion() {
        }
    }

    public g() {
        this((Integer) null, (String) null, (Integer) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: a, reason: from getter */
    public final Integer getOk() {
        return this.ok;
    }

    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    /* renamed from: d, reason: from getter */
    public final String getCorrelationId() {
        return this.correlationId;
    }

    public final Integer e() {
        return this.code;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return kotlin.jvm.internal.f.b(this.ok, gVar.ok) && kotlin.jvm.internal.f.b(this.description, gVar.description) && kotlin.jvm.internal.f.b(this.code, gVar.code) && kotlin.jvm.internal.f.b(this.correlationId, gVar.correlationId);
    }

    public final String g() {
        return this.correlationId;
    }

    public int hashCode() {
        Integer num = this.ok;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.code;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.correlationId;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String i() {
        return this.description;
    }

    public final Integer k() {
        return this.ok;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BasicResponse(ok=");
        sb2.append(this.ok);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", code=");
        sb2.append(this.code);
        sb2.append(", correlationId=");
        return C.v.q(sb2, this.correlationId, ')');
    }

    public /* synthetic */ g(int i, Integer num, String str, Integer num2, String str2, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.ok = null;
        } else {
            this.ok = num;
        }
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        if ((i & 4) == 0) {
            this.code = null;
        } else {
            this.code = num2;
        }
        if ((i & 8) == 0) {
            this.correlationId = null;
        } else {
            this.correlationId = str2;
        }
    }

    public final g a(Integer ok, String description, Integer code, String correlationId) {
        return new g(ok, description, code, correlationId);
    }

    public g(Integer num, String str, Integer num2, String str2) {
        this.ok = num;
        this.description = str;
        this.code = num2;
        this.correlationId = str2;
    }

    public static /* synthetic */ g a(g gVar, Integer num, String str, Integer num2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = gVar.ok;
        }
        if ((i & 2) != 0) {
            str = gVar.description;
        }
        if ((i & 4) != 0) {
            num2 = gVar.code;
        }
        if ((i & 8) != 0) {
            str2 = gVar.correlationId;
        }
        return gVar.a(num, str, num2, str2);
    }

    public static final void a(g self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.ok != null) {
            output.e(serialDesc, 0, H.f26353a, self.ok);
        }
        if (output.D() || self.description != null) {
            output.e(serialDesc, 1, m0.f26414a, self.description);
        }
        if (output.D() || self.code != null) {
            output.e(serialDesc, 2, H.f26353a, self.code);
        }
        if (!output.D() && self.correlationId == null) {
            return;
        }
        output.e(serialDesc, 3, m0.f26414a, self.correlationId);
    }

    public /* synthetic */ g(Integer num, String str, Integer num2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2);
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
