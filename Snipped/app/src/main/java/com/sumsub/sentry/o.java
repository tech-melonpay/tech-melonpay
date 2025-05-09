package com.sumsub.sentry;

import com.google.firebase.messaging.Constants;
import java.util.Map;
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
import ra.InterfaceC1162A;
import ra.K;

@InterfaceC1080d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0001\u0018\u0000 92\u00020\u0001:\u0002\u001b\"B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fB\u0087\u0001\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0001\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\u0016\b\u0001\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010!\u001a\u0004\b$\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010#\u0012\u0004\b(\u0010!\u001a\u0004\b'\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010#\u0012\u0004\b+\u0010!\u001a\u0004\b*\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u0010!\u001a\u0004\b,\u0010.R.\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010!\u001a\u0004\b2\u00103R.\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u00101\u0012\u0004\b5\u0010!\u001a\u0004\b\u001b\u00103R\"\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010-\u0012\u0004\b8\u0010!\u001a\u0004\b7\u0010.¨\u0006:"}, d2 = {"Lcom/sumsub/sentry/o;", "", "Ljava/lang/Thread;", "thread", "", "type", "description", "helpLink", "", "handled", "", "meta", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "synthetic", "<init>", "(Ljava/lang/Thread;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/o;Lqa/c;Lpa/f;)V", "Ljava/lang/Thread;", "m", "()Ljava/lang/Thread;", "getThread$annotations", "()V", "b", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "getType$annotations", "c", "getDescription$annotations", "d", "g", "getHelpLink$annotations", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getHandled$annotations", "f", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "getMeta$annotations", "getData$annotations", "h", "k", "getSynthetic$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Thread thread;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String description;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String helpLink;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Boolean handled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Object> meta;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Object> data;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final Boolean synthetic;

    public static final class a implements InterfaceC1162A<o> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13742a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13743b;

        static {
            a aVar = new a();
            f13742a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.Mechanism", aVar, 7);
            pluginGeneratedSerialDescriptor.k("type", true);
            pluginGeneratedSerialDescriptor.k("description", true);
            pluginGeneratedSerialDescriptor.k("help_link", true);
            pluginGeneratedSerialDescriptor.k("handled", true);
            pluginGeneratedSerialDescriptor.k("meta", true);
            pluginGeneratedSerialDescriptor.k(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, true);
            pluginGeneratedSerialDescriptor.k("synthetic", true);
            f13743b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o deserialize(InterfaceC1144d interfaceC1144d) {
            boolean z10;
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            boolean z11 = true;
            while (z11) {
                int q10 = c2.q(descriptor);
                switch (q10) {
                    case -1:
                        z11 = false;
                        continue;
                    case 0:
                        z10 = z11;
                        obj = c2.D(descriptor, 0, ra.m0.f26414a, obj);
                        i |= 1;
                        break;
                    case 1:
                        z10 = z11;
                        obj2 = c2.D(descriptor, 1, ra.m0.f26414a, obj2);
                        i |= 2;
                        break;
                    case 2:
                        z10 = z11;
                        obj3 = c2.D(descriptor, 2, ra.m0.f26414a, obj3);
                        i |= 4;
                        break;
                    case 3:
                        z10 = z11;
                        obj4 = c2.D(descriptor, 3, C1172g.f26395a, obj4);
                        i |= 8;
                        break;
                    case 4:
                        z10 = z11;
                        obj5 = c2.D(descriptor, 4, new K(ra.m0.f26414a, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), obj5);
                        i |= 16;
                        break;
                    case 5:
                        z10 = z11;
                        obj6 = c2.D(descriptor, 5, new K(ra.m0.f26414a, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), obj6);
                        i |= 32;
                        break;
                    case 6:
                        obj7 = c2.D(descriptor, 6, C1172g.f26395a, obj7);
                        i |= 64;
                        continue;
                    default:
                        throw new UnknownFieldException(q10);
                }
                z11 = z10;
            }
            c2.b(descriptor);
            return new o(i, (String) obj, (String) obj2, (String) obj3, (Boolean) obj4, (Map) obj5, (Map) obj6, (Boolean) obj7, null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            ra.m0 m0Var = ra.m0.f26414a;
            InterfaceC1078b<?> a10 = C1095a.a(m0Var);
            InterfaceC1078b<?> a11 = C1095a.a(m0Var);
            InterfaceC1078b<?> a12 = C1095a.a(m0Var);
            C1172g c1172g = C1172g.f26395a;
            return new InterfaceC1078b[]{a10, a11, a12, C1095a.a(c1172g), C1095a.a(new K(m0Var, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0]))), C1095a.a(new K(m0Var, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0]))), C1095a.a(c1172g)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13743b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, o oVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            o.a(oVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.o$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<o> serializer() {
            return a.f13742a;
        }

        public Companion() {
        }
    }

    public o() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static final void a(o self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.type != null) {
            output.e(serialDesc, 0, ra.m0.f26414a, self.type);
        }
        if (output.D() || self.description != null) {
            output.e(serialDesc, 1, ra.m0.f26414a, self.description);
        }
        if (output.D() || self.helpLink != null) {
            output.e(serialDesc, 2, ra.m0.f26414a, self.helpLink);
        }
        if (output.D() || self.handled != null) {
            output.e(serialDesc, 3, C1172g.f26395a, self.handled);
        }
        if (output.D() || self.meta != null) {
            output.e(serialDesc, 4, new K(ra.m0.f26414a, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), self.meta);
        }
        if (output.D() || self.data != null) {
            output.e(serialDesc, 5, new K(ra.m0.f26414a, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), self.data);
        }
        if (!output.D() && self.synthetic == null) {
            return;
        }
        output.e(serialDesc, 6, C1172g.f26395a, self.synthetic);
    }

    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getHandled() {
        return this.handled;
    }

    /* renamed from: g, reason: from getter */
    public final String getHelpLink() {
        return this.helpLink;
    }

    public final Map<String, Object> i() {
        return this.meta;
    }

    /* renamed from: k, reason: from getter */
    public final Boolean getSynthetic() {
        return this.synthetic;
    }

    /* renamed from: m, reason: from getter */
    public final Thread getThread() {
        return this.thread;
    }

    /* renamed from: o, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public /* synthetic */ o(int i, String str, String str2, String str3, Boolean bool, Map map, Map map2, Boolean bool2, ra.i0 i0Var) {
        this.thread = null;
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.helpLink = null;
        } else {
            this.helpLink = str3;
        }
        if ((i & 8) == 0) {
            this.handled = null;
        } else {
            this.handled = bool;
        }
        if ((i & 16) == 0) {
            this.meta = null;
        } else {
            this.meta = map;
        }
        if ((i & 32) == 0) {
            this.data = null;
        } else {
            this.data = map2;
        }
        if ((i & 64) == 0) {
            this.synthetic = null;
        } else {
            this.synthetic = bool2;
        }
    }

    public final Map<String, Object> a() {
        return this.data;
    }

    public o(Thread thread, String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Boolean bool2) {
        this.thread = thread;
        this.type = str;
        this.description = str2;
        this.helpLink = str3;
        this.handled = bool;
        this.meta = map;
        this.data = map2;
        this.synthetic = bool2;
    }

    public /* synthetic */ o(Thread thread, String str, String str2, String str3, Boolean bool, Map map, Map map2, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : thread, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : map2, (i & 128) == 0 ? bool2 : null);
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
