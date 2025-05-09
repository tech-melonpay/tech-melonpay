package com.sumsub.sns.internal.core.data.model.remote.response;

import C.v;
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
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0002\u0015\u0018BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017JL\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010%\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010)\u0012\u0004\b/\u0010(\u001a\u0004\b.\u0010\u0019R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010%\u0012\u0004\b1\u0010(\u001a\u0004\b0\u0010\u0017¨\u00063"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/response/b;", "", "", "description", "", "code", "correlationId", "errorCode", "errorName", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/response/b;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "()Ljava/lang/Integer;", "c", "d", "e", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/remote/response/b;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "j", "getDescription$annotations", "()V", "Ljava/lang/Integer;", "f", "getCode$annotations", "h", "getCorrelationId$annotations", "l", "getErrorCode$annotations", "n", "getErrorName$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String description;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Integer code;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String correlationId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Integer errorCode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String errorName;

    public static final class a implements InterfaceC1162A<b> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15680a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15681b;

        static {
            a aVar = new a();
            f15680a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.response.ApiErrorResponse", aVar, 5);
            pluginGeneratedSerialDescriptor.k("description", true);
            pluginGeneratedSerialDescriptor.k("code", true);
            pluginGeneratedSerialDescriptor.k("correlationId", true);
            pluginGeneratedSerialDescriptor.k("errorCode", true);
            pluginGeneratedSerialDescriptor.k("errorName", true);
            f15681b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj = c2.D(descriptor, 0, m0.f26414a, obj);
                    i |= 1;
                } else if (q10 == 1) {
                    obj2 = c2.D(descriptor, 1, H.f26353a, obj2);
                    i |= 2;
                } else if (q10 == 2) {
                    obj3 = c2.D(descriptor, 2, m0.f26414a, obj3);
                    i |= 4;
                } else if (q10 == 3) {
                    obj4 = c2.D(descriptor, 3, H.f26353a, obj4);
                    i |= 8;
                } else {
                    if (q10 != 4) {
                        throw new UnknownFieldException(q10);
                    }
                    obj5 = c2.D(descriptor, 4, m0.f26414a, obj5);
                    i |= 16;
                }
            }
            c2.b(descriptor);
            return new b(i, (String) obj, (Integer) obj2, (String) obj3, (Integer) obj4, (String) obj5, (i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            InterfaceC1078b<?> a10 = C1095a.a(m0Var);
            H h9 = H.f26353a;
            return new InterfaceC1078b[]{a10, C1095a.a(h9), C1095a.a(m0Var), C1095a.a(h9), C1095a.a(m0Var)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15681b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, b bVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            b.a(bVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<b> serializer() {
            return a.f15680a;
        }

        public Companion() {
        }
    }

    public b() {
        this((String) null, (Integer) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    /* renamed from: c, reason: from getter */
    public final String getCorrelationId() {
        return this.correlationId;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: e, reason: from getter */
    public final String getErrorName() {
        return this.errorName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return kotlin.jvm.internal.f.b(this.description, bVar.description) && kotlin.jvm.internal.f.b(this.code, bVar.code) && kotlin.jvm.internal.f.b(this.correlationId, bVar.correlationId) && kotlin.jvm.internal.f.b(this.errorCode, bVar.errorCode) && kotlin.jvm.internal.f.b(this.errorName, bVar.errorName);
    }

    public final Integer f() {
        return this.code;
    }

    public final String h() {
        return this.correlationId;
    }

    public int hashCode() {
        String str = this.description;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.code;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.correlationId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.errorCode;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.errorName;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String j() {
        return this.description;
    }

    public final Integer l() {
        return this.errorCode;
    }

    public final String n() {
        return this.errorName;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ApiErrorResponse(description=");
        sb2.append(this.description);
        sb2.append(", code=");
        sb2.append(this.code);
        sb2.append(", correlationId=");
        sb2.append(this.correlationId);
        sb2.append(", errorCode=");
        sb2.append(this.errorCode);
        sb2.append(", errorName=");
        return v.q(sb2, this.errorName, ')');
    }

    public /* synthetic */ b(int i, String str, Integer num, String str2, Integer num2, String str3, i0 i0Var) {
        if ((i & 1) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        if ((i & 2) == 0) {
            this.code = null;
        } else {
            this.code = num;
        }
        if ((i & 4) == 0) {
            this.correlationId = null;
        } else {
            this.correlationId = str2;
        }
        if ((i & 8) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = num2;
        }
        if ((i & 16) == 0) {
            this.errorName = null;
        } else {
            this.errorName = str3;
        }
    }

    public final b a(String description, Integer code, String correlationId, Integer errorCode, String errorName) {
        return new b(description, code, correlationId, errorCode, errorName);
    }

    public b(String str, Integer num, String str2, Integer num2, String str3) {
        this.description = str;
        this.code = num;
        this.correlationId = str2;
        this.errorCode = num2;
        this.errorName = str3;
    }

    public static /* synthetic */ b a(b bVar, String str, Integer num, String str2, Integer num2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.description;
        }
        if ((i & 2) != 0) {
            num = bVar.code;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            str2 = bVar.correlationId;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            num2 = bVar.errorCode;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            str3 = bVar.errorName;
        }
        return bVar.a(str, num3, str4, num4, str3);
    }

    public static final void a(b self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.description != null) {
            output.e(serialDesc, 0, m0.f26414a, self.description);
        }
        if (output.D() || self.code != null) {
            output.e(serialDesc, 1, H.f26353a, self.code);
        }
        if (output.D() || self.correlationId != null) {
            output.e(serialDesc, 2, m0.f26414a, self.correlationId);
        }
        if (output.D() || self.errorCode != null) {
            output.e(serialDesc, 3, H.f26353a, self.errorCode);
        }
        if (!output.D() && self.errorName == null) {
            return;
        }
        output.e(serialDesc, 4, m0.f26414a, self.errorName);
    }

    public /* synthetic */ b(String str, Integer num, String str2, Integer num2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3);
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void o() {
    }
}
