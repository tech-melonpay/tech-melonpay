package com.sumsub.sns.internal.core.data.model;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBk\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJf\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u001b¨\u00068"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/LogParams;", "", "", "errorType", FirebaseAnalytics.Param.LOCATION, "externalUserId", "fileName", "applicantId", "message", "kind", "stacktrace", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "write$Self", "(Lcom/sumsub/sns/internal/core/data/model/LogParams;Lqa/c;Lpa/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/LogParams;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getErrorType", "getLocation", "getExternalUserId", "getFileName", "getApplicantId", "getMessage", "getKind", "getStacktrace", "Companion", "a", "b", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class LogParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String applicantId;
    private final String errorType;
    private final String externalUserId;
    private final String fileName;
    private final String kind;
    private final String location;
    private final String message;
    private final String stacktrace;

    public static final class a implements InterfaceC1162A<LogParams> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15263a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15264b;

        static {
            a aVar = new a();
            f15263a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.LogParams", aVar, 8);
            pluginGeneratedSerialDescriptor.k("errorType", true);
            pluginGeneratedSerialDescriptor.k(FirebaseAnalytics.Param.LOCATION, false);
            pluginGeneratedSerialDescriptor.k("externalUserId", true);
            pluginGeneratedSerialDescriptor.k("fileName", true);
            pluginGeneratedSerialDescriptor.k("applicantId", false);
            pluginGeneratedSerialDescriptor.k("message", false);
            pluginGeneratedSerialDescriptor.k("kind", true);
            pluginGeneratedSerialDescriptor.k("stacktrace", true);
            f15264b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LogParams deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                switch (q10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        str = c2.y(descriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        str2 = c2.y(descriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        obj = c2.D(descriptor, 2, m0.f26414a, obj);
                        i |= 4;
                        break;
                    case 3:
                        obj2 = c2.D(descriptor, 3, m0.f26414a, obj2);
                        i |= 8;
                        break;
                    case 4:
                        str3 = c2.y(descriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        str4 = c2.y(descriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        str5 = c2.y(descriptor, 6);
                        i |= 64;
                        break;
                    case 7:
                        obj3 = c2.D(descriptor, 7, m0.f26414a, obj3);
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            c2.b(descriptor);
            return new LogParams(i, str, str2, (String) obj, (String) obj2, str3, str4, str5, (String) obj3, (i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{m0Var, m0Var, C1095a.a(m0Var), C1095a.a(m0Var), m0Var, m0Var, m0Var, C1095a.a(m0Var)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15264b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, LogParams logParams) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            LogParams.write$Self(logParams, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.LogParams$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<LogParams> serializer() {
            return a.f15263a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ LogParams(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, i0 i0Var) {
        if (50 != (i & 50)) {
            a0.h(i, 50, a.f15263a.getDescriptor());
            throw null;
        }
        this.errorType = (i & 1) == 0 ? "msdkError" : str;
        this.location = str2;
        if ((i & 4) == 0) {
            this.externalUserId = null;
        } else {
            this.externalUserId = str3;
        }
        if ((i & 8) == 0) {
            this.fileName = null;
        } else {
            this.fileName = str4;
        }
        this.applicantId = str5;
        this.message = str6;
        if ((i & 64) == 0) {
            this.kind = "sdk";
        } else {
            this.kind = str7;
        }
        if ((i & 128) == 0) {
            this.stacktrace = null;
        } else {
            this.stacktrace = str8;
        }
    }

    public static final void write$Self(LogParams self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || !kotlin.jvm.internal.f.b(self.errorType, "msdkError")) {
            output.x(serialDesc, 0, self.errorType);
        }
        output.x(serialDesc, 1, self.location);
        if (output.D() || self.externalUserId != null) {
            output.e(serialDesc, 2, m0.f26414a, self.externalUserId);
        }
        if (output.D() || self.fileName != null) {
            output.e(serialDesc, 3, m0.f26414a, self.fileName);
        }
        output.x(serialDesc, 4, self.applicantId);
        output.x(serialDesc, 5, self.message);
        if (output.D() || !kotlin.jvm.internal.f.b(self.kind, "sdk")) {
            output.x(serialDesc, 6, self.kind);
        }
        if (!output.D() && self.stacktrace == null) {
            return;
        }
        output.e(serialDesc, 7, m0.f26414a, self.stacktrace);
    }

    /* renamed from: component1, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExternalUserId() {
        return this.externalUserId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getApplicantId() {
        return this.applicantId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component7, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStacktrace() {
        return this.stacktrace;
    }

    public final LogParams copy(String errorType, String location, String externalUserId, String fileName, String applicantId, String message, String kind, String stacktrace) {
        return new LogParams(errorType, location, externalUserId, fileName, applicantId, message, kind, stacktrace);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogParams)) {
            return false;
        }
        LogParams logParams = (LogParams) other;
        return kotlin.jvm.internal.f.b(this.errorType, logParams.errorType) && kotlin.jvm.internal.f.b(this.location, logParams.location) && kotlin.jvm.internal.f.b(this.externalUserId, logParams.externalUserId) && kotlin.jvm.internal.f.b(this.fileName, logParams.fileName) && kotlin.jvm.internal.f.b(this.applicantId, logParams.applicantId) && kotlin.jvm.internal.f.b(this.message, logParams.message) && kotlin.jvm.internal.f.b(this.kind, logParams.kind) && kotlin.jvm.internal.f.b(this.stacktrace, logParams.stacktrace);
    }

    public final String getApplicantId() {
        return this.applicantId;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final String getExternalUserId() {
        return this.externalUserId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStacktrace() {
        return this.stacktrace;
    }

    public int hashCode() {
        int c2 = C.v.c(this.errorType.hashCode() * 31, 31, this.location);
        String str = this.externalUserId;
        int hashCode = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileName;
        int c10 = C.v.c(C.v.c(C.v.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.applicantId), 31, this.message), 31, this.kind);
        String str3 = this.stacktrace;
        return c10 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LogParams(errorType=");
        sb2.append(this.errorType);
        sb2.append(", location=");
        sb2.append(this.location);
        sb2.append(", externalUserId=");
        sb2.append(this.externalUserId);
        sb2.append(", fileName=");
        sb2.append(this.fileName);
        sb2.append(", applicantId=");
        sb2.append(this.applicantId);
        sb2.append(", message=");
        sb2.append(this.message);
        sb2.append(", kind=");
        sb2.append(this.kind);
        sb2.append(", stacktrace=");
        return C.v.q(sb2, this.stacktrace, ')');
    }

    public LogParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.errorType = str;
        this.location = str2;
        this.externalUserId = str3;
        this.fileName = str4;
        this.applicantId = str5;
        this.message = str6;
        this.kind = str7;
        this.stacktrace = str8;
    }

    public /* synthetic */ LogParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "msdkError" : str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, str5, str6, (i & 64) != 0 ? "sdk" : str7, (i & 128) != 0 ? null : str8);
    }
}
