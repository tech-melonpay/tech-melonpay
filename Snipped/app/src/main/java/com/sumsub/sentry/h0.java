package com.sumsub.sentry;

import java.util.List;
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
import ra.H;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b=\b\u0001\u0018\u0000 a2\u00020\u0001:\u0002&-B\u0089\u0002\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001a\u0010\u001bBÏ\u0001\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ(\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#HÇ\u0001¢\u0006\u0004\b&\u0010'R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010(\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010*R.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010,\u001a\u0004\b2\u00103R(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010(\u0012\u0004\b7\u0010,\u001a\u0004\b6\u0010*R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010,\u001a\u0004\b:\u0010;R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u00109\u0012\u0004\b?\u0010,\u001a\u0004\b>\u0010;R\"\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u00109\u0012\u0004\bA\u0010,\u001a\u0004\b@\u0010;R\"\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010,\u001a\u0004\bD\u0010ER\"\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010C\u0012\u0004\bG\u0010,\u001a\u0004\b0\u0010ER\"\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u00109\u0012\u0004\bI\u0010,\u001a\u0004\b&\u0010;R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u00109\u0012\u0004\bJ\u0010,\u001a\u0004\b8\u0010;R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bK\u0010L\u0012\u0004\bO\u0010,\u001a\u0004\bM\u0010NR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bP\u00109\u0012\u0004\bR\u0010,\u001a\u0004\bQ\u0010;R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bS\u0010L\u0012\u0004\bU\u0010,\u001a\u0004\bT\u0010NR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bM\u00109\u0012\u0004\bW\u0010,\u001a\u0004\bV\u0010;R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bX\u00109\u0012\u0004\bY\u0010,\u001a\u0004\bP\u0010;R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bZ\u00109\u0012\u0004\b\\\u0010,\u001a\u0004\b[\u0010;R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b]\u00109\u0012\u0004\b^\u0010,\u001a\u0004\bZ\u0010;R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u00109\u0012\u0004\b`\u0010,\u001a\u0004\b_\u0010;¨\u0006b"}, d2 = {"Lcom/sumsub/sentry/h0;", "", "", "", "preContext", "postContext", "", "vars", "", "framesOmitted", "filename", "function", "module", "lineno", "colno", "absPath", "contextLine", "", "inApp", "pkg", "isNative", "platform", "imageAddr", "symbolAddr", "instructionAddr", "rawFunction", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/h0;Lqa/c;Lpa/f;)V", "Ljava/util/List;", "C", "()Ljava/util/List;", "getPreContext$annotations", "()V", "b", "A", "getPostContext$annotations", "c", "Ljava/util/Map;", "I", "()Ljava/util/Map;", "getVars$annotations", "d", "i", "getFramesOmitted$annotations", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "getFilename$annotations", "f", "k", "getFunction$annotations", "u", "getModule$annotations", "h", "Ljava/lang/Integer;", "s", "()Ljava/lang/Integer;", "getLineno$annotations", "getColno$annotations", "j", "getAbsPath$annotations", "getContextLine$annotations", "l", "Ljava/lang/Boolean;", "o", "()Ljava/lang/Boolean;", "getInApp$annotations", "m", "w", "getPkg$annotations", "n", "K", "isNative$annotations", "y", "getPlatform$annotations", "p", "getImageAddr$annotations", "q", "G", "getSymbolAddr$annotations", "r", "getInstructionAddr$annotations", "E", "getRawFunction$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final List<String> preContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final List<String> postContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Map<String, String> vars;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final List<Integer> framesOmitted;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String filename;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String function;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final String module;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final Integer lineno;

    /* renamed from: i, reason: from kotlin metadata */
    public final Integer colno;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final String absPath;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final String contextLine;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final Boolean inApp;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final String pkg;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final Boolean isNative;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final String platform;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final String imageAddr;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final String symbolAddr;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final String instructionAddr;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final String rawFunction;

    public static final class a implements InterfaceC1162A<h0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13666a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13667b;

        static {
            a aVar = new a();
            f13666a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.SentryStackFrame", aVar, 15);
            pluginGeneratedSerialDescriptor.k("filename", true);
            pluginGeneratedSerialDescriptor.k("function", true);
            pluginGeneratedSerialDescriptor.k("module", true);
            pluginGeneratedSerialDescriptor.k("lineno", true);
            pluginGeneratedSerialDescriptor.k("colno", true);
            pluginGeneratedSerialDescriptor.k("abs_path", true);
            pluginGeneratedSerialDescriptor.k("context_line", true);
            pluginGeneratedSerialDescriptor.k("in_app", true);
            pluginGeneratedSerialDescriptor.k("package", true);
            pluginGeneratedSerialDescriptor.k("native", true);
            pluginGeneratedSerialDescriptor.k("platform", true);
            pluginGeneratedSerialDescriptor.k("image_addr", true);
            pluginGeneratedSerialDescriptor.k("symbol_addr", true);
            pluginGeneratedSerialDescriptor.k("instruction_addr", true);
            pluginGeneratedSerialDescriptor.k("raw_function", true);
            f13667b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h0 deserialize(InterfaceC1144d interfaceC1144d) {
            Object obj;
            Object obj2;
            Object obj3;
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            Object obj16 = null;
            Object obj17 = null;
            Object obj18 = null;
            int i = 0;
            boolean z10 = true;
            while (z10) {
                Object obj19 = obj7;
                int q10 = c2.q(descriptor);
                switch (q10) {
                    case -1:
                        obj7 = obj19;
                        z10 = false;
                        obj6 = obj6;
                        obj5 = obj5;
                        obj8 = obj8;
                        obj4 = obj4;
                        obj17 = obj17;
                        obj16 = obj16;
                    case 0:
                        i |= 1;
                        obj8 = obj8;
                        obj6 = obj6;
                        obj16 = obj16;
                        obj4 = obj4;
                        obj17 = c2.D(descriptor, 0, ra.m0.f26414a, obj17);
                        obj7 = obj19;
                        obj5 = obj5;
                    case 1:
                        obj2 = obj5;
                        obj3 = obj4;
                        obj18 = c2.D(descriptor, 1, ra.m0.f26414a, obj18);
                        i |= 2;
                        obj7 = obj19;
                        obj8 = obj8;
                        obj6 = obj6;
                        obj5 = obj2;
                        obj4 = obj3;
                    case 2:
                        obj3 = obj4;
                        obj2 = obj5;
                        obj7 = c2.D(descriptor, 2, ra.m0.f26414a, obj19);
                        i |= 4;
                        obj8 = obj8;
                        obj5 = obj2;
                        obj4 = obj3;
                    case 3:
                        obj3 = obj4;
                        obj8 = c2.D(descriptor, 3, H.f26353a, obj8);
                        i |= 8;
                        obj7 = obj19;
                        obj4 = obj3;
                    case 4:
                        obj = obj8;
                        obj9 = c2.D(descriptor, 4, H.f26353a, obj9);
                        i |= 16;
                        obj7 = obj19;
                        obj8 = obj;
                    case 5:
                        obj = obj8;
                        obj10 = c2.D(descriptor, 5, ra.m0.f26414a, obj10);
                        i |= 32;
                        obj7 = obj19;
                        obj8 = obj;
                    case 6:
                        obj = obj8;
                        obj11 = c2.D(descriptor, 6, ra.m0.f26414a, obj11);
                        i |= 64;
                        obj7 = obj19;
                        obj8 = obj;
                    case 7:
                        obj = obj8;
                        obj12 = c2.D(descriptor, 7, C1172g.f26395a, obj12);
                        i |= 128;
                        obj7 = obj19;
                        obj8 = obj;
                    case 8:
                        obj = obj8;
                        obj13 = c2.D(descriptor, 8, ra.m0.f26414a, obj13);
                        i |= 256;
                        obj7 = obj19;
                        obj8 = obj;
                    case 9:
                        obj = obj8;
                        obj14 = c2.D(descriptor, 9, C1172g.f26395a, obj14);
                        i |= 512;
                        obj7 = obj19;
                        obj8 = obj;
                    case 10:
                        obj = obj8;
                        obj15 = c2.D(descriptor, 10, ra.m0.f26414a, obj15);
                        i |= 1024;
                        obj7 = obj19;
                        obj8 = obj;
                    case 11:
                        obj = obj8;
                        obj16 = c2.D(descriptor, 11, ra.m0.f26414a, obj16);
                        i |= 2048;
                        obj7 = obj19;
                        obj8 = obj;
                    case 12:
                        obj = obj8;
                        obj6 = c2.D(descriptor, 12, ra.m0.f26414a, obj6);
                        i |= 4096;
                        obj7 = obj19;
                        obj8 = obj;
                    case 13:
                        obj = obj8;
                        obj5 = c2.D(descriptor, 13, ra.m0.f26414a, obj5);
                        i |= 8192;
                        obj7 = obj19;
                        obj8 = obj;
                    case 14:
                        obj = obj8;
                        obj4 = c2.D(descriptor, 14, ra.m0.f26414a, obj4);
                        i |= 16384;
                        obj7 = obj19;
                        obj8 = obj;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            Object obj20 = obj5;
            Object obj21 = obj6;
            Object obj22 = obj4;
            Object obj23 = obj17;
            c2.b(descriptor);
            return new h0(i, (String) obj23, (String) obj18, (String) obj7, (Integer) obj8, (Integer) obj9, (String) obj10, (String) obj11, (Boolean) obj12, (String) obj13, (Boolean) obj14, (String) obj15, (String) obj16, (String) obj21, (String) obj20, (String) obj22, null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            ra.m0 m0Var = ra.m0.f26414a;
            InterfaceC1078b<?> a10 = C1095a.a(m0Var);
            InterfaceC1078b<?> a11 = C1095a.a(m0Var);
            InterfaceC1078b<?> a12 = C1095a.a(m0Var);
            H h9 = H.f26353a;
            InterfaceC1078b<?> a13 = C1095a.a(h9);
            InterfaceC1078b<?> a14 = C1095a.a(h9);
            InterfaceC1078b<?> a15 = C1095a.a(m0Var);
            InterfaceC1078b<?> a16 = C1095a.a(m0Var);
            C1172g c1172g = C1172g.f26395a;
            return new InterfaceC1078b[]{a10, a11, a12, a13, a14, a15, a16, C1095a.a(c1172g), C1095a.a(m0Var), C1095a.a(c1172g), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13667b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, h0 h0Var) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            h0.a(h0Var, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.h0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<h0> serializer() {
            return a.f13666a;
        }

        public Companion() {
        }
    }

    public h0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public static final void a(h0 self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.filename != null) {
            output.e(serialDesc, 0, ra.m0.f26414a, self.filename);
        }
        if (output.D() || self.function != null) {
            output.e(serialDesc, 1, ra.m0.f26414a, self.function);
        }
        if (output.D() || self.module != null) {
            output.e(serialDesc, 2, ra.m0.f26414a, self.module);
        }
        if (output.D() || self.lineno != null) {
            output.e(serialDesc, 3, H.f26353a, self.lineno);
        }
        if (output.D() || self.colno != null) {
            output.e(serialDesc, 4, H.f26353a, self.colno);
        }
        if (output.D() || self.absPath != null) {
            output.e(serialDesc, 5, ra.m0.f26414a, self.absPath);
        }
        if (output.D() || self.contextLine != null) {
            output.e(serialDesc, 6, ra.m0.f26414a, self.contextLine);
        }
        if (output.D() || self.inApp != null) {
            output.e(serialDesc, 7, C1172g.f26395a, self.inApp);
        }
        if (output.D() || self.pkg != null) {
            output.e(serialDesc, 8, ra.m0.f26414a, self.pkg);
        }
        if (output.D() || self.isNative != null) {
            output.e(serialDesc, 9, C1172g.f26395a, self.isNative);
        }
        if (output.D() || self.platform != null) {
            output.e(serialDesc, 10, ra.m0.f26414a, self.platform);
        }
        if (output.D() || self.imageAddr != null) {
            output.e(serialDesc, 11, ra.m0.f26414a, self.imageAddr);
        }
        if (output.D() || self.symbolAddr != null) {
            output.e(serialDesc, 12, ra.m0.f26414a, self.symbolAddr);
        }
        if (output.D() || self.instructionAddr != null) {
            output.e(serialDesc, 13, ra.m0.f26414a, self.instructionAddr);
        }
        if (!output.D() && self.rawFunction == null) {
            return;
        }
        output.e(serialDesc, 14, ra.m0.f26414a, self.rawFunction);
    }

    public final List<String> A() {
        return this.postContext;
    }

    public final List<String> C() {
        return this.preContext;
    }

    /* renamed from: E, reason: from getter */
    public final String getRawFunction() {
        return this.rawFunction;
    }

    /* renamed from: G, reason: from getter */
    public final String getSymbolAddr() {
        return this.symbolAddr;
    }

    public final Map<String, String> I() {
        return this.vars;
    }

    /* renamed from: K, reason: from getter */
    public final Boolean getIsNative() {
        return this.isNative;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getColno() {
        return this.colno;
    }

    /* renamed from: e, reason: from getter */
    public final String getContextLine() {
        return this.contextLine;
    }

    /* renamed from: g, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    public final List<Integer> i() {
        return this.framesOmitted;
    }

    /* renamed from: k, reason: from getter */
    public final String getFunction() {
        return this.function;
    }

    /* renamed from: m, reason: from getter */
    public final String getImageAddr() {
        return this.imageAddr;
    }

    /* renamed from: o, reason: from getter */
    public final Boolean getInApp() {
        return this.inApp;
    }

    /* renamed from: q, reason: from getter */
    public final String getInstructionAddr() {
        return this.instructionAddr;
    }

    /* renamed from: s, reason: from getter */
    public final Integer getLineno() {
        return this.lineno;
    }

    /* renamed from: u, reason: from getter */
    public final String getModule() {
        return this.module;
    }

    /* renamed from: w, reason: from getter */
    public final String getPkg() {
        return this.pkg;
    }

    /* renamed from: y, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    public /* synthetic */ h0(int i, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, String str8, String str9, String str10, String str11, ra.i0 i0Var) {
        this.preContext = null;
        this.postContext = null;
        this.vars = null;
        this.framesOmitted = null;
        if ((i & 1) == 0) {
            this.filename = null;
        } else {
            this.filename = str;
        }
        if ((i & 2) == 0) {
            this.function = null;
        } else {
            this.function = str2;
        }
        if ((i & 4) == 0) {
            this.module = null;
        } else {
            this.module = str3;
        }
        if ((i & 8) == 0) {
            this.lineno = null;
        } else {
            this.lineno = num;
        }
        if ((i & 16) == 0) {
            this.colno = null;
        } else {
            this.colno = num2;
        }
        if ((i & 32) == 0) {
            this.absPath = null;
        } else {
            this.absPath = str4;
        }
        if ((i & 64) == 0) {
            this.contextLine = null;
        } else {
            this.contextLine = str5;
        }
        if ((i & 128) == 0) {
            this.inApp = null;
        } else {
            this.inApp = bool;
        }
        if ((i & 256) == 0) {
            this.pkg = null;
        } else {
            this.pkg = str6;
        }
        if ((i & 512) == 0) {
            this.isNative = null;
        } else {
            this.isNative = bool2;
        }
        if ((i & 1024) == 0) {
            this.platform = null;
        } else {
            this.platform = str7;
        }
        if ((i & 2048) == 0) {
            this.imageAddr = null;
        } else {
            this.imageAddr = str8;
        }
        if ((i & 4096) == 0) {
            this.symbolAddr = null;
        } else {
            this.symbolAddr = str9;
        }
        if ((i & 8192) == 0) {
            this.instructionAddr = null;
        } else {
            this.instructionAddr = str10;
        }
        if ((i & 16384) == 0) {
            this.rawFunction = null;
        } else {
            this.rawFunction = str11;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getAbsPath() {
        return this.absPath;
    }

    public h0(List<String> list, List<String> list2, Map<String, String> map, List<Integer> list3, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, String str8, String str9, String str10, String str11) {
        this.preContext = list;
        this.postContext = list2;
        this.vars = map;
        this.framesOmitted = list3;
        this.filename = str;
        this.function = str2;
        this.module = str3;
        this.lineno = num;
        this.colno = num2;
        this.absPath = str4;
        this.contextLine = str5;
        this.inApp = bool;
        this.pkg = str6;
        this.isNative = bool2;
        this.platform = str7;
        this.imageAddr = str8;
        this.symbolAddr = str9;
        this.instructionAddr = str10;
        this.rawFunction = str11;
    }

    public static /* synthetic */ void B() {
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

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void t() {
    }

    public static /* synthetic */ void v() {
    }

    public static /* synthetic */ void x() {
    }

    public static /* synthetic */ void z() {
    }

    public /* synthetic */ h0(List list, List list2, Map map, List list3, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? null : bool2, (i & 16384) != 0 ? null : str7, (i & 32768) != 0 ? null : str8, (i & 65536) != 0 ? null : str9, (i & 131072) != 0 ? null : str10, (i & 262144) != 0 ? null : str11);
    }
}
