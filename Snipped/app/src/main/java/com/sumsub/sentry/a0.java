package com.sumsub.sentry;

import com.sumsub.sentry.i0;
import com.sumsub.sentry.o;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0001\u0018\u0000 22\u00020\u0001:\u0002\u0019 BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBc\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001b\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001b\u0012\u0004\b$\u0010\u001f\u001a\u0004\b#\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\u001f\u001a\u0004\b'\u0010(R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010\u001f\u001a\u0004\b*\u0010,R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b1\u0010\u001f\u001a\u0004\b\u0019\u00100¨\u00063"}, d2 = {"Lcom/sumsub/sentry/a0;", "", "", "type", "value", "module", "", "threadId", "Lcom/sumsub/sentry/i0;", "stacktrace", "Lcom/sumsub/sentry/o;", "mechanism", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/sumsub/sentry/i0;Lcom/sumsub/sentry/o;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/sumsub/sentry/i0;Lcom/sumsub/sentry/o;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/a0;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "getType$annotations", "()V", "b", "k", "getValue$annotations", "c", "getModule$annotations", "d", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "getThreadId$annotations", "e", "Lcom/sumsub/sentry/i0;", "()Lcom/sumsub/sentry/i0;", "getStacktrace$annotations", "f", "Lcom/sumsub/sentry/o;", "()Lcom/sumsub/sentry/o;", "getMechanism$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String module;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Long threadId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final i0 stacktrace;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final o mechanism;

    public static final class a implements InterfaceC1162A<a0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13556a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13557b;

        static {
            a aVar = new a();
            f13556a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.SentryException", aVar, 6);
            pluginGeneratedSerialDescriptor.k("type", true);
            pluginGeneratedSerialDescriptor.k("value", true);
            pluginGeneratedSerialDescriptor.k("module", true);
            pluginGeneratedSerialDescriptor.k("thread_id", true);
            pluginGeneratedSerialDescriptor.k("stacktrace", true);
            pluginGeneratedSerialDescriptor.k("mechanism", true);
            f13557b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 deserialize(InterfaceC1144d interfaceC1144d) {
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
                        obj4 = c2.D(descriptor, 3, O.f26364a, obj4);
                        i |= 8;
                        break;
                    case 4:
                        obj5 = c2.D(descriptor, 4, i0.a.f13675a, obj5);
                        i |= 16;
                        break;
                    case 5:
                        obj6 = c2.D(descriptor, 5, o.a.f13742a, obj6);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            c2.b(descriptor);
            return new a0(i, (String) obj, (String) obj2, (String) obj3, (Long) obj4, (i0) obj5, (o) obj6, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            ra.m0 m0Var = ra.m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(O.f26364a), C1095a.a(i0.a.f13675a), C1095a.a(o.a.f13742a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13557b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, a0 a0Var) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            a0.a(a0Var, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.a0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<a0> serializer() {
            return a.f13556a;
        }

        public Companion() {
        }
    }

    public a0() {
        this((String) null, (String) null, (String) null, (Long) null, (i0) null, (o) null, 63, (DefaultConstructorMarker) null);
    }

    public static final void a(a0 self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.type != null) {
            output.e(serialDesc, 0, ra.m0.f26414a, self.type);
        }
        if (output.D() || self.value != null) {
            output.e(serialDesc, 1, ra.m0.f26414a, self.value);
        }
        if (output.D() || self.module != null) {
            output.e(serialDesc, 2, ra.m0.f26414a, self.module);
        }
        if (output.D() || self.threadId != null) {
            output.e(serialDesc, 3, O.f26364a, self.threadId);
        }
        if (output.D() || self.stacktrace != null) {
            output.e(serialDesc, 4, i0.a.f13675a, self.stacktrace);
        }
        if (!output.D() && self.mechanism == null) {
            return;
        }
        output.e(serialDesc, 5, o.a.f13742a, self.mechanism);
    }

    /* renamed from: c, reason: from getter */
    public final String getModule() {
        return this.module;
    }

    /* renamed from: e, reason: from getter */
    public final i0 getStacktrace() {
        return this.stacktrace;
    }

    /* renamed from: g, reason: from getter */
    public final Long getThreadId() {
        return this.threadId;
    }

    /* renamed from: i, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: k, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public /* synthetic */ a0(int i, String str, String str2, String str3, Long l10, i0 i0Var, o oVar, ra.i0 i0Var2) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.value = null;
        } else {
            this.value = str2;
        }
        if ((i & 4) == 0) {
            this.module = null;
        } else {
            this.module = str3;
        }
        if ((i & 8) == 0) {
            this.threadId = null;
        } else {
            this.threadId = l10;
        }
        if ((i & 16) == 0) {
            this.stacktrace = null;
        } else {
            this.stacktrace = i0Var;
        }
        if ((i & 32) == 0) {
            this.mechanism = null;
        } else {
            this.mechanism = oVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final o getMechanism() {
        return this.mechanism;
    }

    public a0(String str, String str2, String str3, Long l10, i0 i0Var, o oVar) {
        this.type = str;
        this.value = str2;
        this.module = str3;
        this.threadId = l10;
        this.stacktrace = i0Var;
        this.mechanism = oVar;
    }

    public /* synthetic */ a0(String str, String str2, String str3, Long l10, i0 i0Var, o oVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l10, (i & 16) != 0 ? null : i0Var, (i & 32) != 0 ? null : oVar);
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
}
