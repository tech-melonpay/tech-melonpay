package com.sumsub.sentry;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.sumsub.sentry.SentryLevel;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
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
import ra.K;

@InterfaceC1080d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0001\u0018\u0000 62\u00020\u0001:\u0002\u001c#BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\u000fB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0010Bo\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0001\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\f\u0010\u0015J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\"\u001a\u0004\b%\u0010&\"\u0004\b#\u0010\u0010R*\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010$\u0012\u0004\b*\u0010\"\u001a\u0004\b)\u0010&\"\u0004\b(\u0010\u0010R,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b.\u0010\"\u001a\u0004\b(\u0010-R*\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b/\u0010$\u0012\u0004\b0\u0010\"\u001a\u0004\b\u001c\u0010&\"\u0004\b\u001c\u0010\u0010R*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b5\u0010\"\u001a\u0004\b/\u00103\"\u0004\b\u001c\u00104¨\u00067"}, d2 = {"Lcom/sumsub/sentry/b;", "", "Ljava/util/Date;", "timestamp", "", "message", "type", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "category", "Lcom/sumsub/sentry/SentryLevel;", FirebaseAnalytics.Param.LEVEL, "<init>", "(Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/sumsub/sentry/SentryLevel;)V", "breadcrumb", "(Lcom/sumsub/sentry/b;)V", "(Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/sumsub/sentry/SentryLevel;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/b;Lqa/c;Lpa/f;)V", "Ljava/util/Date;", "i", "()Ljava/util/Date;", "getTimestamp$annotations", "()V", "b", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "getMessage$annotations", "c", "k", "getType$annotations", "d", "Ljava/util/Map;", "()Ljava/util/Map;", "getData$annotations", "e", "getCategory$annotations", "f", "Lcom/sumsub/sentry/SentryLevel;", "()Lcom/sumsub/sentry/SentryLevel;", "(Lcom/sumsub/sentry/SentryLevel;)V", "getLevel$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Date timestamp;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public String message;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Object> data;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public String category;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public SentryLevel level;

    public static final class a implements InterfaceC1162A<b> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13588a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13589b;

        static {
            a aVar = new a();
            f13588a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.Breadcrumb", aVar, 6);
            pluginGeneratedSerialDescriptor.k("timestamp", true);
            pluginGeneratedSerialDescriptor.k("message", true);
            pluginGeneratedSerialDescriptor.k("type", true);
            pluginGeneratedSerialDescriptor.k(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, true);
            pluginGeneratedSerialDescriptor.k("category", true);
            pluginGeneratedSerialDescriptor.k(FirebaseAnalytics.Param.LEVEL, true);
            f13589b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            boolean z10 = true;
            while (z10) {
                int q10 = c2.q(descriptor);
                switch (q10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        obj = c2.C(descriptor, 0, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Date.class), new InterfaceC1078b[0]), obj);
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
                        obj4 = c2.C(descriptor, 3, new K(ra.m0.f26414a, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), obj4);
                        i |= 8;
                        break;
                    case 4:
                        obj5 = c2.D(descriptor, 4, ra.m0.f26414a, obj5);
                        i |= 16;
                        break;
                    case 5:
                        obj6 = c2.D(descriptor, 5, SentryLevel.a.f13536a, obj6);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            c2.b(descriptor);
            return new b(i, (Date) obj, (String) obj2, (String) obj3, (Map) obj4, (String) obj5, (SentryLevel) obj6, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            kotlinx.serialization.a aVar = new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Date.class), new InterfaceC1078b[0]);
            ra.m0 m0Var = ra.m0.f26414a;
            return new InterfaceC1078b[]{aVar, C1095a.a(m0Var), C1095a.a(m0Var), new K(m0Var, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), C1095a.a(m0Var), C1095a.a(SentryLevel.a.f13536a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13589b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
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

    /* renamed from: com.sumsub.sentry.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<b> serializer() {
            return a.f13588a;
        }

        public Companion() {
        }
    }

    public b() {
        this((Date) null, (String) null, (String) null, (Map) null, (String) null, (SentryLevel) null, 63, (DefaultConstructorMarker) null);
    }

    public static final void a(b self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || !kotlin.jvm.internal.f.b(self.timestamp, e.f13611a.a())) {
            output.C(serialDesc, 0, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Date.class), new InterfaceC1078b[0]), self.timestamp);
        }
        if (output.D() || self.message != null) {
            output.e(serialDesc, 1, ra.m0.f26414a, self.message);
        }
        if (output.D() || self.type != null) {
            output.e(serialDesc, 2, ra.m0.f26414a, self.type);
        }
        if (output.D() || !kotlin.jvm.internal.f.b(self.data, new ConcurrentHashMap())) {
            output.C(serialDesc, 3, new K(ra.m0.f26414a, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), self.data);
        }
        if (output.D() || self.category != null) {
            output.e(serialDesc, 4, ra.m0.f26414a, self.category);
        }
        if (!output.D() && self.level == null) {
            return;
        }
        output.e(serialDesc, 5, SentryLevel.a.f13536a, self.level);
    }

    public static /* synthetic */ void b() {
    }

    public final void c(String str) {
        this.type = str;
    }

    /* renamed from: e, reason: from getter */
    public final SentryLevel getLevel() {
        return this.level;
    }

    /* renamed from: g, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: i, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: k, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public /* synthetic */ b(int i, Date date, String str, String str2, Map map, String str3, SentryLevel sentryLevel, ra.i0 i0Var) {
        this.timestamp = (i & 1) == 0 ? e.f13611a.a() : date;
        if ((i & 2) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i & 8) == 0) {
            this.data = new ConcurrentHashMap();
        } else {
            this.data = map;
        }
        if ((i & 16) == 0) {
            this.category = null;
        } else {
            this.category = str3;
        }
        if ((i & 32) == 0) {
            this.level = null;
        } else {
            this.level = sentryLevel;
        }
    }

    public final void b(String str) {
        this.message = str;
    }

    public final Map<String, Object> c() {
        return this.data;
    }

    /* renamed from: a, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public b(Date date, String str, String str2, Map<String, Object> map, String str3, SentryLevel sentryLevel) {
        this.timestamp = date;
        this.message = str;
        this.type = str2;
        this.data = map;
        this.category = str3;
        this.level = sentryLevel;
    }

    public final void a(String str) {
        this.category = str;
    }

    public final void a(SentryLevel sentryLevel) {
        this.level = sentryLevel;
    }

    public /* synthetic */ b(Date date, String str, String str2, Map map, String str3, SentryLevel sentryLevel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? e.f13611a.a() : date, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? new ConcurrentHashMap() : map, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? sentryLevel : null);
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

    public b(b bVar) {
        this(bVar.timestamp, bVar.message, bVar.type, new ConcurrentHashMap(bVar.data), bVar.category, bVar.level);
    }

    public b(String str) {
        this(e.f13611a.a(), str, (String) null, (Map) null, (String) null, (SentryLevel) null, 60, (DefaultConstructorMarker) null);
    }
}
