package com.sumsub.sentry;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1169d;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u001b*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0015\u001cB\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJB\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0001\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/sumsub/sentry/m0;", "T", "", "", "values", "<init>", "(Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/util/List;Lra/i0;)V", "T0", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "Lna/b;", "typeSerial0", "LO9/p;", "a", "(Lcom/sumsub/sentry/m0;Lqa/c;Lpa/f;Lna/b;)V", "Ljava/util/List;", "()Ljava/util/List;", "getValues$annotations", "()V", "Companion", "b", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class m0<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    public static final pa.f f13716b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final List<T> values;

    public static final class a<T> implements InterfaceC1162A<m0<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa.f f13718a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1078b<T> f13719b;

        public a() {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.SentryValues", this, 1);
            pluginGeneratedSerialDescriptor.k("values", true);
            this.f13718a = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m0<T> deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            ra.i0 i0Var = null;
            boolean z10 = true;
            int i = 0;
            Object obj = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else {
                    if (q10 != 0) {
                        throw new UnknownFieldException(q10);
                    }
                    obj = c2.C(descriptor, 0, new C1169d(this.f13719b, 0), obj);
                    i = 1;
                }
            }
            c2.b(descriptor);
            return new m0<>(i, (List) obj, i0Var);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{new C1169d(this.f13719b, 0)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return this.f13718a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return new InterfaceC1078b[]{this.f13719b};
        }

        public /* synthetic */ a(InterfaceC1078b interfaceC1078b) {
            this();
            this.f13719b = interfaceC1078b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, m0<T> m0Var) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            m0.a(m0Var, c2, descriptor, this.f13719b);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.m0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T0> InterfaceC1078b<m0<T0>> serializer(InterfaceC1078b<T0> interfaceC1078b) {
            return new a(interfaceC1078b);
        }

        public Companion() {
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.SentryValues", null, 1);
        pluginGeneratedSerialDescriptor.k("values", true);
        f13716b = pluginGeneratedSerialDescriptor;
    }

    public m0() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static final <T0> void a(m0<T0> self, InterfaceC1143c output, pa.f serialDesc, InterfaceC1078b<T0> typeSerial0) {
        if (!output.D() && kotlin.jvm.internal.f.b(self.values, new ArrayList(0))) {
            return;
        }
        output.C(serialDesc, 0, new C1169d(typeSerial0, 0), self.values);
    }

    public /* synthetic */ m0(int i, List list, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.values = new ArrayList(0);
        } else {
            this.values = list;
        }
    }

    public final List<T> a() {
        return this.values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m0(List<? extends T> list) {
        this.values = list;
    }

    public /* synthetic */ m0(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList(0) : list);
    }

    public static /* synthetic */ void b() {
    }
}
