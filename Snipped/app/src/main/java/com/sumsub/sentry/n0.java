package com.sumsub.sentry;

import com.sumsub.sentry.SpanStatus;
import com.sumsub.sentry.d0;
import com.sumsub.sentry.o0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import oa.C1095a;
import org.bouncycastle.asn1.BERTags;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.InterfaceC1162A;
import ra.K;

@InterfaceC1080d
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 C2\u00020\u0001:\u0002!)B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007Bf\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0015B~\b\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0016\b\u0001\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u001aJ(\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÇ\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020 2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b!\u0010#R)\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b!\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R)\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b)\u0010$\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010&R+\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b,\u0010$\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010&R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010(R \u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010$\u0012\u0004\b2\u0010(\u001a\u0004\b,\u0010&R*\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b3\u0010$\u0012\u0004\b4\u0010(\u001a\u0004\b!\u0010&\"\u0004\b!\u0010\u0007R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010(\u001a\u0004\b7\u00108R,\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010(\u001a\u0004\b<\u0010=R(\u0010@\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010A\"\u0004\b!\u0010B\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Lcom/sumsub/sentry/n0;", "", "spanContext", "<init>", "(Lcom/sumsub/sentry/n0;)V", "", "operation", "(Ljava/lang/String;)V", "Lcom/sumsub/sentry/d0;", "traceId", "Lcom/sumsub/sentry/o0;", "spanId", "parentSpanId", "Lcom/sumsub/sentry/p0;", "samplingDecision", "op", "description", "Lcom/sumsub/sentry/SpanStatus;", "status", "", "tags", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/p0;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/SpanStatus;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/SpanStatus;Ljava/util/Map;Lra/i0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/n0;Lqa/c;Lpa/f;)V", "(Lcom/sumsub/sentry/p0;)V", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "getTraceId-uFNw5ug$annotations", "()V", "b", "i", "getSpanId-L6urO5c$annotations", "c", "e", "getParentSpanId-CrewFg8$annotations", "d", "Lcom/sumsub/sentry/p0;", "getSamplingDecision$annotations", "getOp$annotations", "f", "getDescription$annotations", "g", "Lcom/sumsub/sentry/SpanStatus;", "k", "()Lcom/sumsub/sentry/SpanStatus;", "getStatus$annotations", "h", "Ljava/util/Map;", "m", "()Ljava/util/Map;", "getTags$annotations", "", "sampled", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)V", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String i = "trace";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String traceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String spanId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String parentSpanId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public p0 samplingDecision;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String op;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public String description;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final SpanStatus status;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final Map<String, String> tags;

    public static final class a implements InterfaceC1162A<n0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13732a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13733b;

        static {
            a aVar = new a();
            f13732a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.SpanContext", aVar, 7);
            pluginGeneratedSerialDescriptor.k("trace_id", false);
            pluginGeneratedSerialDescriptor.k("span_id", false);
            pluginGeneratedSerialDescriptor.k("parent_span_id", false);
            pluginGeneratedSerialDescriptor.k("op", false);
            pluginGeneratedSerialDescriptor.k("description", true);
            pluginGeneratedSerialDescriptor.k("status", true);
            pluginGeneratedSerialDescriptor.k("tags", true);
            f13733b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n0 deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            boolean z10 = true;
            int i = 0;
            Object obj = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            String str = null;
            Object obj5 = null;
            Object obj6 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                switch (q10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        obj = c2.C(descriptor, 0, d0.a.f13609a, obj);
                        i |= 1;
                        break;
                    case 1:
                        obj2 = c2.C(descriptor, 1, o0.a.f13746a, obj2);
                        i |= 2;
                        break;
                    case 2:
                        obj3 = c2.D(descriptor, 2, o0.a.f13746a, obj3);
                        i |= 4;
                        break;
                    case 3:
                        str = c2.y(descriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        obj4 = c2.D(descriptor, 4, ra.m0.f26414a, obj4);
                        i |= 16;
                        break;
                    case 5:
                        obj5 = c2.D(descriptor, 5, SpanStatus.a.f13538a, obj5);
                        i |= 32;
                        break;
                    case 6:
                        ra.m0 m0Var = ra.m0.f26414a;
                        obj6 = c2.C(descriptor, 6, new K(m0Var, m0Var), obj6);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            c2.b(descriptor);
            d0 d0Var = (d0) obj;
            o0 o0Var = (o0) obj2;
            o0 o0Var2 = (o0) obj3;
            return new n0(i, d0Var != null ? d0Var.b() : null, o0Var != null ? o0Var.c() : null, o0Var2 != null ? o0Var2.c() : null, str, (String) obj4, (SpanStatus) obj5, (Map) obj6, (ra.i0) null, (DefaultConstructorMarker) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            o0.a aVar = o0.a.f13746a;
            InterfaceC1078b<?> a10 = C1095a.a(aVar);
            ra.m0 m0Var = ra.m0.f26414a;
            return new InterfaceC1078b[]{d0.a.f13609a, aVar, a10, m0Var, C1095a.a(m0Var), C1095a.a(SpanStatus.a.f13538a), new K(m0Var, m0Var)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13733b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, n0 n0Var) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            n0.a(n0Var, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.n0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<n0> serializer() {
            return a.f13732a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ n0(int i9, String str, String str2, String str3, String str4, String str5, SpanStatus spanStatus, Map map, ra.i0 i0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9, str, str2, str3, str4, str5, spanStatus, (Map<String, String>) map, i0Var);
    }

    public static final void a(n0 self, InterfaceC1143c output, pa.f serialDesc) {
        output.C(serialDesc, 0, d0.a.f13609a, d0.a(self.traceId));
        o0.a aVar = o0.a.f13746a;
        output.C(serialDesc, 1, aVar, o0.a(self.spanId));
        String str = self.parentSpanId;
        output.e(serialDesc, 2, aVar, str != null ? o0.a(str) : null);
        output.x(serialDesc, 3, self.op);
        if (output.D() || self.description != null) {
            output.e(serialDesc, 4, ra.m0.f26414a, self.description);
        }
        if (output.D() || self.status != null) {
            output.e(serialDesc, 5, SpanStatus.a.f13538a, self.status);
        }
        if (!output.D() && kotlin.jvm.internal.f.b(self.tags, new ConcurrentHashMap())) {
            return;
        }
        ra.m0 m0Var = ra.m0.f26414a;
        output.C(serialDesc, 6, new K(m0Var, m0Var), self.tags);
    }

    /* renamed from: c, reason: from getter */
    public final String getOp() {
        return this.op;
    }

    /* renamed from: e, reason: from getter */
    public final String getParentSpanId() {
        return this.parentSpanId;
    }

    public final Boolean g() {
        p0 p0Var = this.samplingDecision;
        if (p0Var != null) {
            return Boolean.valueOf(p0Var.b());
        }
        return null;
    }

    /* renamed from: i, reason: from getter */
    public final String getSpanId() {
        return this.spanId;
    }

    /* renamed from: k, reason: from getter */
    public final SpanStatus getStatus() {
        return this.status;
    }

    public final Map<String, String> m() {
        return this.tags;
    }

    /* renamed from: o, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    public /* synthetic */ n0(String str, String str2, String str3, p0 p0Var, String str4, String str5, SpanStatus spanStatus, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, p0Var, str4, str5, spanStatus, map);
    }

    public n0(int i9, String str, String str2, String str3, String str4, String str5, SpanStatus spanStatus, Map<String, String> map, ra.i0 i0Var) {
        if (15 != (i9 & 15)) {
            ra.a0.h(i9, 15, a.f13732a.getDescriptor());
            throw null;
        }
        this.traceId = str;
        this.spanId = str2;
        this.parentSpanId = str3;
        this.samplingDecision = null;
        this.op = str4;
        if ((i9 & 16) == 0) {
            this.description = null;
        } else {
            this.description = str5;
        }
        if ((i9 & 32) == 0) {
            this.status = null;
        } else {
            this.status = spanStatus;
        }
        if ((i9 & 64) == 0) {
            this.tags = new ConcurrentHashMap();
        } else {
            this.tags = map;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final void a(String str) {
        this.description = str;
    }

    public final void a(Boolean bool) {
        if (bool == null) {
            a((p0) null);
        } else {
            a(new p0(bool.booleanValue(), null, 2, null));
        }
    }

    public n0(String str, String str2, String str3, p0 p0Var, String str4, String str5, SpanStatus spanStatus, Map<String, String> map) {
        this.traceId = str;
        this.spanId = str2;
        this.parentSpanId = str3;
        this.samplingDecision = p0Var;
        this.op = str4;
        this.description = str5;
        this.status = spanStatus;
        this.tags = map;
    }

    public final void a(p0 samplingDecision) {
        this.samplingDecision = samplingDecision;
    }

    public /* synthetic */ n0(String str, String str2, String str3, p0 p0Var, String str4, String str5, SpanStatus spanStatus, Map map, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i9 & 8) != 0 ? null : p0Var, str4, (i9 & 32) != 0 ? null : str5, (i9 & 64) != 0 ? null : spanStatus, (i9 & 128) != 0 ? new ConcurrentHashMap() : map, (DefaultConstructorMarker) null);
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

    public n0(n0 n0Var) {
        this(n0Var.traceId, n0Var.spanId, n0Var.parentSpanId, (p0) null, n0Var.op, n0Var.description, n0Var.status, new ConcurrentHashMap(n0Var.tags), 8, (DefaultConstructorMarker) null);
    }

    public n0(String str) {
        this(d0.a(null, 1, null), o0.a(null, 1, null), (String) null, (p0) null, str, (String) null, (SpanStatus) null, (Map) null, BERTags.FLAGS, (DefaultConstructorMarker) null);
    }
}
