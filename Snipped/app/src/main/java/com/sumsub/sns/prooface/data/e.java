package com.sumsub.sns.prooface.data;

import java.util.List;
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
import ra.InterfaceC1162A;
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0003\u0015\u001c\u0018B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBE\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u0015\u0010\u0019R(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u001e\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/sumsub/sns/prooface/data/e;", "", "", "clientErrorName", "clientErrorMessage", "", "Lcom/sumsub/sns/prooface/data/e$c;", "videoDevices", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/prooface/data/e;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getClientErrorName$annotations", "()V", "b", "getClientErrorMessage$annotations", "Ljava/util/List;", "e", "()Ljava/util/List;", "getVideoDevices$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String clientErrorName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String clientErrorMessage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final List<c> videoDevices;

    public static final class a implements InterfaceC1162A<e> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f20208a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f20209b;

        static {
            a aVar = new a();
            f20208a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.prooface.data.LivenessClientError", aVar, 3);
            pluginGeneratedSerialDescriptor.k("clientErrorName", true);
            pluginGeneratedSerialDescriptor.k("clientErrorMessage", true);
            pluginGeneratedSerialDescriptor.k("videoDevices", true);
            f20209b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e deserialize(InterfaceC1144d interfaceC1144d) {
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
                    obj = c2.D(descriptor, 0, m0.f26414a, obj);
                    i |= 1;
                } else if (q10 == 1) {
                    obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                    i |= 2;
                } else {
                    if (q10 != 2) {
                        throw new UnknownFieldException(q10);
                    }
                    obj3 = c2.D(descriptor, 2, new C1169d(c.a.f20211a, 0), obj3);
                    i |= 4;
                }
            }
            c2.b(descriptor);
            return new e(i, (String) obj, (String) obj2, (List) obj3, (i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(new C1169d(c.a.f20211a, 0))};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f20209b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, e eVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            e.a(eVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.prooface.data.e$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<e> serializer() {
            return a.f20208a;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0011\u0018B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/sumsub/sns/prooface/data/e$c;", "", "", "label", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/prooface/data/e$c;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "()Ljava/lang/String;", "getLabel$annotations", "()V", "Companion", "b", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC1080d
    public static final class c {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String label;

        public static final class a implements InterfaceC1162A<c> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f20211a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ pa.f f20212b;

            static {
                a aVar = new a();
                f20211a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.prooface.data.LivenessClientError.VideoDevice", aVar, 1);
                pluginGeneratedSerialDescriptor.k("label", true);
                f20212b = pluginGeneratedSerialDescriptor;
            }

            @Override // na.InterfaceC1077a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c deserialize(InterfaceC1144d interfaceC1144d) {
                pa.f descriptor = getDescriptor();
                InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                i0 i0Var = null;
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
                        obj = c2.D(descriptor, 0, m0.f26414a, obj);
                        i = 1;
                    }
                }
                c2.b(descriptor);
                return new c(i, (String) obj, i0Var);
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] childSerializers() {
                return new InterfaceC1078b[]{C1095a.a(m0.f26414a)};
            }

            @Override // na.InterfaceC1081e, na.InterfaceC1077a
            public pa.f getDescriptor() {
                return f20212b;
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] typeParametersSerializers() {
                return a0.f26382b;
            }

            @Override // na.InterfaceC1081e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(InterfaceC1145e interfaceC1145e, c cVar) {
                pa.f descriptor = getDescriptor();
                InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                c.a(cVar, c2, descriptor);
                c2.b(descriptor);
            }
        }

        /* renamed from: com.sumsub.sns.prooface.data.e$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC1078b<c> serializer() {
                return a.f20211a;
            }

            public Companion() {
            }
        }

        public c() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
            if (!output.D() && self.label == null) {
                return;
            }
            output.e(serialDesc, 0, m0.f26414a, self.label);
        }

        public /* synthetic */ c(int i, String str, i0 i0Var) {
            if ((i & 1) == 0) {
                this.label = null;
            } else {
                this.label = str;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public c(String str) {
            this.label = str;
        }

        public /* synthetic */ c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ void b() {
        }
    }

    public e() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public static final void a(e self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.clientErrorName != null) {
            output.e(serialDesc, 0, m0.f26414a, self.clientErrorName);
        }
        if (output.D() || self.clientErrorMessage != null) {
            output.e(serialDesc, 1, m0.f26414a, self.clientErrorMessage);
        }
        if (!output.D() && self.videoDevices == null) {
            return;
        }
        output.e(serialDesc, 2, new C1169d(c.a.f20211a, 0), self.videoDevices);
    }

    /* renamed from: c, reason: from getter */
    public final String getClientErrorName() {
        return this.clientErrorName;
    }

    public final List<c> e() {
        return this.videoDevices;
    }

    public /* synthetic */ e(int i, String str, String str2, List list, i0 i0Var) {
        if ((i & 1) == 0) {
            this.clientErrorName = null;
        } else {
            this.clientErrorName = str;
        }
        if ((i & 2) == 0) {
            this.clientErrorMessage = null;
        } else {
            this.clientErrorMessage = str2;
        }
        if ((i & 4) == 0) {
            this.videoDevices = null;
        } else {
            this.videoDevices = list;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getClientErrorMessage() {
        return this.clientErrorMessage;
    }

    public e(String str, String str2, List<c> list) {
        this.clientErrorName = str;
        this.clientErrorMessage = str2;
        this.videoDevices = list;
    }

    public /* synthetic */ e(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }
}
