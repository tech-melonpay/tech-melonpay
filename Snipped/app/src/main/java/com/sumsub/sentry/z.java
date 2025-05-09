package com.sumsub.sentry;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sentry.SentryLevel;
import com.sumsub.sentry.a0;
import com.sumsub.sentry.b;
import com.sumsub.sentry.d;
import com.sumsub.sentry.d0;
import com.sumsub.sentry.g;
import com.sumsub.sentry.k0;
import com.sumsub.sentry.m0;
import com.sumsub.sentry.p;
import com.sumsub.sentry.q0;
import com.sumsub.sentry.s;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import oa.C1095a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1169d;
import ra.InterfaceC1162A;
import ra.K;

@InterfaceC1080d
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u0000 q2\u00020\u0001:\u00025NB¦\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018Bâ\u0002\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0016\b\u0001\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'\u0012\u0016\b\u0001\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020*\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011\u0012\u0016\b\u0001\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010-\u001a\u0004\u0018\u00010,ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010.J(\u00105\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202HÇ\u0001¢\u0006\u0004\b5\u00106R1\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0097\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0018\n\u0004\b7\u00108\u0012\u0004\b=\u0010>\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u00108\u0012\u0004\bA\u0010>\u001a\u0004\b@\u0010:R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010>\u001a\u0004\bD\u0010ER\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u00108\u0012\u0004\bI\u0010>\u001a\u0004\bH\u0010:R0\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bJ\u0010K\u0012\u0004\bP\u0010>\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR0\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bQ\u0010K\u0012\u0004\bS\u0010>\u001a\u0004\bR\u0010M\"\u0004\b5\u0010OR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bT\u0010U\u0012\u0004\bX\u0010>\u001a\u0004\bV\u0010WR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bY\u00108\u0012\u0004\b[\u0010>\u001a\u0004\bZ\u0010:R(\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\\\u0010]\u0012\u0004\b`\u0010>\u001a\u0004\b^\u0010_R.\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\ba\u0010b\u0012\u0004\be\u0010>\u001a\u0004\bc\u0010dR \u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bf\u0010g\u0012\u0004\bj\u0010>\u001a\u0004\bh\u0010iR\u0011\u0010n\u001a\u00020k8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0011\u0010p\u001a\u00020k8F¢\u0006\u0006\u001a\u0004\bo\u0010m\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Lcom/sumsub/sentry/z;", "Lcom/sumsub/sentry/u;", "Lcom/sumsub/sentry/d0;", "eventId", "", "timestamp", "Lcom/sumsub/sentry/p;", "message", "logger", "Lcom/sumsub/sentry/m0;", "Lcom/sumsub/sentry/k0;", "threads", "Lcom/sumsub/sentry/a0;", "exception", "Lcom/sumsub/sentry/SentryLevel;", FirebaseAnalytics.Param.LEVEL, "transaction", "", "fingerprint", "", "modules", "Lcom/sumsub/sentry/g;", "debugMeta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/p;Ljava/lang/String;Lcom/sumsub/sentry/m0;Lcom/sumsub/sentry/m0;Lcom/sumsub/sentry/SentryLevel;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/sumsub/sentry/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lcom/sumsub/sentry/d;", "contexts", "Lcom/sumsub/sentry/s;", "sdk", "tags", "release", "environment", "platform", "Lcom/sumsub/sentry/q0;", "user", "serverName", "dist", "", "Lcom/sumsub/sentry/b;", "breadcrumbs", "", "extra", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sentry/d;Lcom/sumsub/sentry/s;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/q0;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/p;Ljava/lang/String;Lcom/sumsub/sentry/m0;Lcom/sumsub/sentry/m0;Lcom/sumsub/sentry/SentryLevel;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/sumsub/sentry/g;Lra/i0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/z;Lqa/c;Lpa/f;)V", "o", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "getEventId-uFNw5ug$annotations", "()V", "p", "S", "getTimestamp$annotations", "q", "Lcom/sumsub/sentry/p;", "M", "()Lcom/sumsub/sentry/p;", "getMessage$annotations", "r", "K", "getLogger$annotations", "s", "Lcom/sumsub/sentry/m0;", "Q", "()Lcom/sumsub/sentry/m0;", "b", "(Lcom/sumsub/sentry/m0;)V", "getThreads$annotations", "t", "E", "getException$annotations", "u", "Lcom/sumsub/sentry/SentryLevel;", "I", "()Lcom/sumsub/sentry/SentryLevel;", "getLevel$annotations", "v", "U", "getTransaction$annotations", "w", "Ljava/util/List;", "G", "()Ljava/util/List;", "getFingerprint$annotations", "x", "Ljava/util/Map;", "O", "()Ljava/util/Map;", "getModules$annotations", "y", "Lcom/sumsub/sentry/g;", "B", "()Lcom/sumsub/sentry/g;", "getDebugMeta$annotations", "", "W", "()Z", "isCrashed", "X", "isErrored", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class z extends u {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public String eventId;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final String timestamp;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final p message;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final String logger;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public m0<k0> threads;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public m0<a0> exception;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final SentryLevel level;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final String transaction;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final List<String> fingerprint;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final Map<String, String> modules;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final g debugMeta;

    public static final class a implements InterfaceC1162A<z> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13826a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13827b;

        static {
            a aVar = new a();
            f13826a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.SentryEvent", aVar, 22);
            pluginGeneratedSerialDescriptor.k("contexts", true);
            pluginGeneratedSerialDescriptor.k("sdk", true);
            pluginGeneratedSerialDescriptor.k("tags", true);
            pluginGeneratedSerialDescriptor.k("release", true);
            pluginGeneratedSerialDescriptor.k("environment", true);
            pluginGeneratedSerialDescriptor.k("platform", true);
            pluginGeneratedSerialDescriptor.k("user", true);
            pluginGeneratedSerialDescriptor.k("server_name", true);
            pluginGeneratedSerialDescriptor.k("dist", true);
            pluginGeneratedSerialDescriptor.k("breadcrumbs", true);
            pluginGeneratedSerialDescriptor.k("extra", true);
            pluginGeneratedSerialDescriptor.k("event_id", true);
            pluginGeneratedSerialDescriptor.k("timestamp", true);
            pluginGeneratedSerialDescriptor.k("message", true);
            pluginGeneratedSerialDescriptor.k("logger", true);
            pluginGeneratedSerialDescriptor.k("threads", true);
            pluginGeneratedSerialDescriptor.k("exception", true);
            pluginGeneratedSerialDescriptor.k(FirebaseAnalytics.Param.LEVEL, true);
            pluginGeneratedSerialDescriptor.k("transaction", true);
            pluginGeneratedSerialDescriptor.k("fingerprint", true);
            pluginGeneratedSerialDescriptor.k("modules", true);
            pluginGeneratedSerialDescriptor.k("debug_meta", true);
            f13827b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z deserialize(InterfaceC1144d interfaceC1144d) {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            int i;
            Object obj6;
            Object obj7;
            Object obj8;
            Object obj9;
            Object obj10;
            Object obj11;
            int i9;
            Object obj12;
            Object obj13;
            Object obj14;
            Object obj15;
            Object obj16;
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj17 = null;
            Object obj18 = null;
            Object obj19 = null;
            Object obj20 = null;
            Object obj21 = null;
            Object obj22 = null;
            Object obj23 = null;
            Object obj24 = null;
            Object obj25 = null;
            Object obj26 = null;
            Object obj27 = null;
            Object obj28 = null;
            Object obj29 = null;
            Object obj30 = null;
            boolean z10 = true;
            String str = null;
            d dVar = null;
            Object obj31 = null;
            Object obj32 = null;
            Object obj33 = null;
            Object obj34 = null;
            Object obj35 = null;
            Object obj36 = null;
            int i10 = 0;
            while (z10) {
                Object obj37 = obj29;
                int q10 = c2.q(descriptor);
                Object obj38 = obj30;
                switch (q10) {
                    case -1:
                        z10 = false;
                        obj21 = obj21;
                        obj22 = obj22;
                        obj30 = obj38;
                        obj32 = obj32;
                        obj35 = obj35;
                        obj23 = obj23;
                        obj25 = obj25;
                        obj34 = obj34;
                        obj29 = obj37;
                    case 0:
                        obj = obj21;
                        obj2 = obj28;
                        obj3 = obj31;
                        Object obj39 = obj34;
                        obj4 = obj37;
                        Object obj40 = obj23;
                        Object obj41 = obj32;
                        obj5 = obj22;
                        dVar = c2.C(descriptor, 0, d.b.f13605a, dVar);
                        obj20 = obj20;
                        obj24 = obj24;
                        obj26 = obj26;
                        obj27 = obj27;
                        i = 1;
                        obj6 = obj41;
                        obj35 = obj35;
                        obj23 = obj40;
                        obj25 = obj25;
                        obj34 = obj39;
                        obj29 = obj4;
                        obj28 = obj2;
                        Object obj42 = obj;
                        obj7 = obj3;
                        obj21 = obj42;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 1:
                        obj2 = obj28;
                        Object obj43 = obj34;
                        obj4 = obj37;
                        Object obj44 = obj23;
                        Object obj45 = obj32;
                        obj5 = obj22;
                        obj = obj21;
                        obj3 = c2.D(descriptor, 1, s.a.f13780a, obj31);
                        obj6 = obj45;
                        obj23 = obj44;
                        obj24 = obj24;
                        obj26 = obj26;
                        obj27 = obj27;
                        i = 2;
                        obj35 = obj35;
                        obj34 = obj43;
                        obj25 = obj25;
                        obj29 = obj4;
                        obj28 = obj2;
                        Object obj422 = obj;
                        obj7 = obj3;
                        obj21 = obj422;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 2:
                        obj8 = obj28;
                        Object obj46 = obj34;
                        obj9 = obj37;
                        Object obj47 = obj23;
                        ra.m0 m0Var = ra.m0.f26414a;
                        K k3 = new K(m0Var, m0Var);
                        Object obj48 = obj32;
                        obj5 = obj22;
                        obj6 = c2.D(descriptor, 2, k3, obj48);
                        obj7 = obj31;
                        obj23 = obj47;
                        obj24 = obj24;
                        obj26 = obj26;
                        obj27 = obj27;
                        i = 4;
                        obj35 = obj35;
                        obj34 = obj46;
                        obj25 = obj25;
                        obj29 = obj9;
                        obj28 = obj8;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 3:
                        obj8 = obj28;
                        obj9 = obj37;
                        obj33 = c2.D(descriptor, 3, ra.m0.f26414a, obj33);
                        obj7 = obj31;
                        obj6 = obj32;
                        obj24 = obj24;
                        obj26 = obj26;
                        obj27 = obj27;
                        i = 8;
                        obj5 = obj22;
                        obj35 = obj35;
                        obj34 = obj34;
                        obj25 = obj25;
                        obj29 = obj9;
                        obj28 = obj8;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 4:
                        obj29 = obj37;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj36 = obj36;
                        obj26 = obj26;
                        obj28 = obj28;
                        obj25 = obj25;
                        i = 16;
                        obj5 = obj22;
                        obj34 = c2.D(descriptor, 4, ra.m0.f26414a, obj34);
                        obj27 = obj27;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 5:
                        obj10 = obj25;
                        obj11 = obj27;
                        i9 = 32;
                        obj35 = c2.D(descriptor, 5, ra.m0.f26414a, obj35);
                        obj29 = obj37;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj26 = obj26;
                        obj28 = obj28;
                        obj27 = obj11;
                        obj5 = obj22;
                        i = i9;
                        obj25 = obj10;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 6:
                        obj12 = obj25;
                        obj13 = obj26;
                        obj14 = obj27;
                        obj15 = obj28;
                        i = 64;
                        obj36 = c2.D(descriptor, 6, q0.a.f13768a, obj36);
                        obj29 = obj37;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj26 = obj13;
                        obj28 = obj15;
                        obj27 = obj14;
                        obj25 = obj12;
                        obj5 = obj22;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 7:
                        obj12 = obj25;
                        obj13 = obj26;
                        obj14 = obj27;
                        obj15 = obj28;
                        obj29 = c2.D(descriptor, 7, ra.m0.f26414a, obj37);
                        i = 128;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj26 = obj13;
                        obj28 = obj15;
                        obj27 = obj14;
                        obj25 = obj12;
                        obj5 = obj22;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 8:
                        obj10 = obj25;
                        obj11 = obj27;
                        i9 = 256;
                        obj38 = c2.D(descriptor, 8, ra.m0.f26414a, obj38);
                        obj7 = obj31;
                        obj6 = obj32;
                        obj29 = obj37;
                        obj26 = obj26;
                        obj27 = obj11;
                        obj5 = obj22;
                        i = i9;
                        obj25 = obj10;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 9:
                        obj12 = obj25;
                        obj14 = obj27;
                        obj19 = c2.D(descriptor, 9, new C1169d(b.a.f13588a, 0), obj19);
                        i = 512;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj29 = obj37;
                        obj26 = obj26;
                        obj27 = obj14;
                        obj25 = obj12;
                        obj5 = obj22;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 10:
                        obj15 = obj28;
                        obj14 = obj27;
                        obj12 = obj25;
                        obj13 = obj26;
                        obj17 = c2.D(descriptor, 10, new K(ra.m0.f26414a, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), obj17);
                        i = 1024;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj29 = obj37;
                        obj26 = obj13;
                        obj28 = obj15;
                        obj27 = obj14;
                        obj25 = obj12;
                        obj5 = obj22;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 11:
                        obj16 = obj28;
                        obj18 = c2.C(descriptor, 11, d0.a.f13609a, obj18);
                        i = 2048;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj29 = obj37;
                        obj28 = obj16;
                        obj5 = obj22;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 12:
                        obj16 = obj28;
                        str = c2.y(descriptor, 12);
                        i = 4096;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj29 = obj37;
                        obj28 = obj16;
                        obj5 = obj22;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 13:
                        obj16 = obj28;
                        obj20 = c2.D(descriptor, 13, p.a.f13751a, obj20);
                        i = 8192;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj29 = obj37;
                        obj28 = obj16;
                        obj5 = obj22;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 14:
                        obj16 = obj28;
                        obj21 = c2.D(descriptor, 14, ra.m0.f26414a, obj21);
                        i = 16384;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj29 = obj37;
                        obj28 = obj16;
                        obj5 = obj22;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 15:
                        obj16 = obj28;
                        obj22 = c2.D(descriptor, 15, m0.INSTANCE.serializer(k0.a.f13711a), obj22);
                        i = 32768;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj29 = obj37;
                        obj28 = obj16;
                        obj5 = obj22;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 16:
                        obj16 = obj28;
                        obj23 = c2.D(descriptor, 16, m0.INSTANCE.serializer(a0.a.f13556a), obj23);
                        i = 65536;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj29 = obj37;
                        obj28 = obj16;
                        obj5 = obj22;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 17:
                        obj16 = obj28;
                        obj24 = c2.D(descriptor, 17, SentryLevel.a.f13536a, obj24);
                        i = 131072;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj29 = obj37;
                        obj28 = obj16;
                        obj5 = obj22;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 18:
                        obj16 = obj28;
                        obj25 = c2.D(descriptor, 18, ra.m0.f26414a, obj25);
                        i = 262144;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj29 = obj37;
                        obj28 = obj16;
                        obj5 = obj22;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 19:
                        obj16 = obj28;
                        obj26 = c2.D(descriptor, 19, new C1169d(ra.m0.f26414a, 0), obj26);
                        i = 524288;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj29 = obj37;
                        obj28 = obj16;
                        obj5 = obj22;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 20:
                        ra.m0 m0Var2 = ra.m0.f26414a;
                        obj27 = c2.D(descriptor, 20, new K(m0Var2, m0Var2), obj27);
                        i = PKIFailureInfo.badCertTemplate;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj29 = obj37;
                        obj5 = obj22;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    case 21:
                        obj28 = c2.C(descriptor, 21, g.a.f13638a, obj28);
                        i = PKIFailureInfo.badSenderNonce;
                        obj7 = obj31;
                        obj6 = obj32;
                        obj29 = obj37;
                        obj5 = obj22;
                        i10 |= i;
                        obj31 = obj7;
                        obj22 = obj5;
                        obj30 = obj38;
                        obj32 = obj6;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            Object obj49 = obj20;
            Object obj50 = obj21;
            Object obj51 = obj25;
            Object obj52 = obj26;
            Object obj53 = obj27;
            Object obj54 = obj28;
            Object obj55 = obj29;
            Object obj56 = obj30;
            Object obj57 = obj34;
            Object obj58 = obj35;
            Object obj59 = obj23;
            Object obj60 = obj24;
            Object obj61 = obj32;
            Object obj62 = obj22;
            c2.b(descriptor);
            d0 d0Var = (d0) obj18;
            return new z(i10, dVar, (s) obj31, (Map) obj61, (String) obj33, (String) obj57, (String) obj58, (q0) obj36, (String) obj55, (String) obj56, (List) obj19, (Map) obj17, d0Var != null ? d0Var.b() : null, str, (p) obj49, (String) obj50, (m0) obj62, (m0) obj59, (SentryLevel) obj60, (String) obj51, (List) obj52, (Map) obj53, (g) obj54, null, null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            InterfaceC1078b<?> a10 = C1095a.a(s.a.f13780a);
            ra.m0 m0Var = ra.m0.f26414a;
            InterfaceC1078b<?> a11 = C1095a.a(new K(m0Var, m0Var));
            InterfaceC1078b<?> a12 = C1095a.a(m0Var);
            InterfaceC1078b<?> a13 = C1095a.a(m0Var);
            InterfaceC1078b<?> a14 = C1095a.a(m0Var);
            InterfaceC1078b<?> a15 = C1095a.a(q0.a.f13768a);
            InterfaceC1078b<?> a16 = C1095a.a(m0Var);
            InterfaceC1078b<?> a17 = C1095a.a(m0Var);
            InterfaceC1078b<?> a18 = C1095a.a(new C1169d(b.a.f13588a, 0));
            InterfaceC1078b<?> a19 = C1095a.a(new K(m0Var, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])));
            InterfaceC1078b<?> a20 = C1095a.a(p.a.f13751a);
            InterfaceC1078b<?> a21 = C1095a.a(m0Var);
            m0.Companion companion = m0.INSTANCE;
            return new InterfaceC1078b[]{d.b.f13605a, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, d0.a.f13609a, m0Var, a20, a21, C1095a.a(companion.serializer(k0.a.f13711a)), C1095a.a(companion.serializer(a0.a.f13556a)), C1095a.a(SentryLevel.a.f13536a), C1095a.a(m0Var), C1095a.a(new C1169d(m0Var, 0)), C1095a.a(new K(m0Var, m0Var)), g.a.f13638a};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13827b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, z zVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            z.a(zVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.z$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<z> serializer() {
            return a.f13826a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ z(int i, d dVar, s sVar, Map map, String str, String str2, String str3, q0 q0Var, String str4, String str5, List list, Map map2, String str6, String str7, p pVar, String str8, m0 m0Var, m0 m0Var2, SentryLevel sentryLevel, String str9, List list2, Map map3, g gVar, ra.i0 i0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, dVar, sVar, map, str, str2, str3, q0Var, str4, str5, list, map2, str6, str7, pVar, str8, m0Var, m0Var2, sentryLevel, str9, list2, map3, gVar, i0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (kotlin.jvm.internal.f.b(r0, r2.a(r2.a())) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.sumsub.sentry.z r4, qa.InterfaceC1143c r5, pa.f r6) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sentry.z.a(com.sumsub.sentry.z, qa.c, pa.f):void");
    }

    /* renamed from: B, reason: from getter */
    public final g getDebugMeta() {
        return this.debugMeta;
    }

    public final m0<a0> E() {
        return this.exception;
    }

    public final List<String> G() {
        return this.fingerprint;
    }

    /* renamed from: I, reason: from getter */
    public final SentryLevel getLevel() {
        return this.level;
    }

    /* renamed from: K, reason: from getter */
    public final String getLogger() {
        return this.logger;
    }

    /* renamed from: M, reason: from getter */
    public final p getMessage() {
        return this.message;
    }

    public final Map<String, String> O() {
        return this.modules;
    }

    public final m0<k0> Q() {
        return this.threads;
    }

    /* renamed from: S, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: U, reason: from getter */
    public final String getTransaction() {
        return this.transaction;
    }

    public final boolean W() {
        List<a0> a10;
        m0<a0> m0Var = this.exception;
        if (m0Var == null || (a10 = m0Var.a()) == null) {
            return false;
        }
        for (a0 a0Var : a10) {
            if (a0Var.getMechanism() != null && a0Var.getMechanism().getHandled() != null && !a0Var.getMechanism().getHandled().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean X() {
        List<a0> a10;
        m0<a0> m0Var = this.exception;
        return (m0Var == null || (a10 = m0Var.a()) == null || !(a10.isEmpty() ^ true)) ? false : true;
    }

    public final void b(m0<k0> m0Var) {
        this.threads = m0Var;
    }

    @Override // com.sumsub.sentry.u
    public void d(String str) {
        this.eventId = str;
    }

    @Override // com.sumsub.sentry.u
    /* renamed from: j, reason: from getter */
    public String getEventId() {
        return this.eventId;
    }

    public /* synthetic */ z(String str, String str2, p pVar, String str3, m0 m0Var, m0 m0Var2, SentryLevel sentryLevel, String str4, List list, Map map, g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, pVar, str3, m0Var, m0Var2, sentryLevel, str4, list, map, gVar);
    }

    public z(int i, d dVar, s sVar, Map<String, String> map, String str, String str2, String str3, q0 q0Var, String str4, String str5, List<b> list, Map<String, Object> map2, String str6, String str7, p pVar, String str8, m0<k0> m0Var, m0<a0> m0Var2, SentryLevel sentryLevel, String str9, List<String> list2, Map<String, String> map3, g gVar, ra.i0 i0Var) {
        super(i, dVar, sVar, map, str, str2, str3, q0Var, str4, str5, list, map2, i0Var);
        String str10;
        g gVar2;
        r rVar = null;
        byte b9 = 0;
        byte b10 = 0;
        this.eventId = (i & 2048) == 0 ? d0.a(null, 1, null) : str6;
        if ((i & 4096) == 0) {
            e eVar = e.f13611a;
            str10 = eVar.a(eVar.a());
        } else {
            str10 = str7;
        }
        this.timestamp = str10;
        if ((i & 8192) == 0) {
            this.message = null;
        } else {
            this.message = pVar;
        }
        if ((i & 16384) == 0) {
            this.logger = null;
        } else {
            this.logger = str8;
        }
        if ((32768 & i) == 0) {
            this.threads = null;
        } else {
            this.threads = m0Var;
        }
        if ((65536 & i) == 0) {
            this.exception = null;
        } else {
            this.exception = m0Var2;
        }
        if ((131072 & i) == 0) {
            this.level = null;
        } else {
            this.level = sentryLevel;
        }
        if ((262144 & i) == 0) {
            this.transaction = null;
        } else {
            this.transaction = str9;
        }
        if ((524288 & i) == 0) {
            this.fingerprint = null;
        } else {
            this.fingerprint = list2;
        }
        if ((1048576 & i) == 0) {
            this.modules = null;
        } else {
            this.modules = map3;
        }
        if ((2097152 & i) == 0) {
            gVar2 = new g(rVar, (List) (b10 == true ? 1 : 0), 3, (DefaultConstructorMarker) (b9 == true ? 1 : 0));
        } else {
            gVar2 = gVar;
        }
        this.debugMeta = gVar2;
    }

    public final void a(m0<a0> m0Var) {
        this.exception = m0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ z(java.lang.String r14, java.lang.String r15, com.sumsub.sentry.p r16, java.lang.String r17, com.sumsub.sentry.m0 r18, com.sumsub.sentry.m0 r19, com.sumsub.sentry.SentryLevel r20, java.lang.String r21, java.util.List r22, java.util.Map r23, com.sumsub.sentry.g r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r13 = this;
            r0 = r25
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto Ld
            r1 = 1
            java.lang.String r1 = com.sumsub.sentry.d0.a(r2, r1, r2)
            goto Le
        Ld:
            r1 = r14
        Le:
            r3 = r0 & 2
            if (r3 == 0) goto L1d
            com.sumsub.sentry.e r3 = com.sumsub.sentry.e.f13611a
            java.util.Date r4 = r3.a()
            java.lang.String r3 = r3.a(r4)
            goto L1e
        L1d:
            r3 = r15
        L1e:
            r4 = r0 & 4
            if (r4 == 0) goto L24
            r4 = r2
            goto L26
        L24:
            r4 = r16
        L26:
            r5 = r0 & 8
            if (r5 == 0) goto L2c
            r5 = r2
            goto L2e
        L2c:
            r5 = r17
        L2e:
            r6 = r0 & 16
            if (r6 == 0) goto L34
            r6 = r2
            goto L36
        L34:
            r6 = r18
        L36:
            r7 = r0 & 32
            if (r7 == 0) goto L3c
            r7 = r2
            goto L3e
        L3c:
            r7 = r19
        L3e:
            r8 = r0 & 64
            if (r8 == 0) goto L44
            r8 = r2
            goto L46
        L44:
            r8 = r20
        L46:
            r9 = r0 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L4c
            r9 = r2
            goto L4e
        L4c:
            r9 = r21
        L4e:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L54
            r10 = r2
            goto L56
        L54:
            r10 = r22
        L56:
            r11 = r0 & 512(0x200, float:7.17E-43)
            if (r11 == 0) goto L5c
            r11 = r2
            goto L5e
        L5c:
            r11 = r23
        L5e:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L69
            com.sumsub.sentry.g r0 = new com.sumsub.sentry.g
            r12 = 3
            r0.<init>(r2, r2, r12, r2)
            goto L6b
        L69:
            r0 = r24
        L6b:
            r2 = 0
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r0
            r26 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sentry.z.<init>(java.lang.String, java.lang.String, com.sumsub.sentry.p, java.lang.String, com.sumsub.sentry.m0, com.sumsub.sentry.m0, com.sumsub.sentry.SentryLevel, java.lang.String, java.util.List, java.util.Map, com.sumsub.sentry.g, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public z(String str, String str2, p pVar, String str3, m0<k0> m0Var, m0<a0> m0Var2, SentryLevel sentryLevel, String str4, List<String> list, Map<String, String> map, g gVar) {
        this.eventId = str;
        this.timestamp = str2;
        this.message = pVar;
        this.logger = str3;
        this.threads = m0Var;
        this.exception = m0Var2;
        this.level = sentryLevel;
        this.transaction = str4;
        this.fingerprint = list;
        this.modules = map;
        this.debugMeta = gVar;
    }

    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ void F() {
    }

    public static /* synthetic */ void H() {
    }

    public static /* synthetic */ void J() {
    }

    public static /* synthetic */ void L() {
    }

    public static /* synthetic */ void N() {
    }

    public static /* synthetic */ void P() {
    }

    public static /* synthetic */ void R() {
    }

    public static /* synthetic */ void T() {
    }

    public static /* synthetic */ void V() {
    }
}
