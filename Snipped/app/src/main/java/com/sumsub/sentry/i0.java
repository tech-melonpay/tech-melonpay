package com.sumsub.sentry;

import com.sumsub.sentry.h0;
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
import ra.C1169d;
import ra.C1172g;
import ra.InterfaceC1162A;
import ra.K;

@InterfaceC1080d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 &2\u00020\u0001:\u0002\u0017\u001dB=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBQ\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001aR.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\"\u0012\u0004\b%\u0010\u001c\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/sumsub/sentry/i0;", "", "", "Lcom/sumsub/sentry/h0;", "frames", "", "", "registers", "", "snapshot", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/i0;Lqa/c;Lpa/f;)V", "Ljava/util/List;", "()Ljava/util/List;", "getFrames$annotations", "()V", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "getRegisters$annotations", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "getSnapshot$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final List<h0> frames;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Map<String, String> registers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Boolean snapshot;

    public static final class a implements InterfaceC1162A<i0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13675a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13676b;

        static {
            a aVar = new a();
            f13675a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.SentryStackTrace", aVar, 3);
            pluginGeneratedSerialDescriptor.k("frames", true);
            pluginGeneratedSerialDescriptor.k("registers", true);
            pluginGeneratedSerialDescriptor.k("snapshot", true);
            f13676b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i0 deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj = c2.D(descriptor, 0, new C1169d(h0.a.f13666a, 0), obj);
                    i |= 1;
                } else if (q10 == 1) {
                    ra.m0 m0Var = ra.m0.f26414a;
                    obj2 = c2.D(descriptor, 1, new K(m0Var, m0Var), obj2);
                    i |= 2;
                } else {
                    if (q10 != 2) {
                        throw new UnknownFieldException(q10);
                    }
                    obj3 = c2.D(descriptor, 2, C1172g.f26395a, obj3);
                    i |= 4;
                }
            }
            c2.b(descriptor);
            return new i0(i, (List) obj, (Map) obj2, (Boolean) obj3, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            InterfaceC1078b<?> a10 = C1095a.a(new C1169d(h0.a.f13666a, 0));
            ra.m0 m0Var = ra.m0.f26414a;
            return new InterfaceC1078b[]{a10, C1095a.a(new K(m0Var, m0Var)), C1095a.a(C1172g.f26395a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13676b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, i0 i0Var) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            i0.a(i0Var, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.i0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<i0> serializer() {
            return a.f13675a;
        }

        public Companion() {
        }
    }

    public i0() {
        this((List) null, (Map) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    public static final void a(i0 self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.frames != null) {
            output.e(serialDesc, 0, new C1169d(h0.a.f13666a, 0), self.frames);
        }
        if (output.D() || self.registers != null) {
            ra.m0 m0Var = ra.m0.f26414a;
            output.e(serialDesc, 1, new K(m0Var, m0Var), self.registers);
        }
        if (!output.D() && self.snapshot == null) {
            return;
        }
        output.e(serialDesc, 2, C1172g.f26395a, self.snapshot);
    }

    public final Map<String, String> c() {
        return this.registers;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getSnapshot() {
        return this.snapshot;
    }

    public /* synthetic */ i0(int i, List list, Map map, Boolean bool, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.frames = null;
        } else {
            this.frames = list;
        }
        if ((i & 2) == 0) {
            this.registers = null;
        } else {
            this.registers = map;
        }
        if ((i & 4) == 0) {
            this.snapshot = null;
        } else {
            this.snapshot = bool;
        }
    }

    public final List<h0> a() {
        return this.frames;
    }

    public i0(List<h0> list, Map<String, String> map, Boolean bool) {
        this.frames = list;
        this.registers = map;
        this.snapshot = bool;
    }

    public /* synthetic */ i0(List list, Map map, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : bool);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }
}
