package com.sumsub.sns.prooface.data;

import com.sumsub.sns.prooface.data.c;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0013\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0013\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/sumsub/sns/prooface/data/d;", "", "", "faceStatus", "Lcom/sumsub/sns/prooface/data/c;", "faceMesh", "<init>", "(Ljava/lang/String;Lcom/sumsub/sns/prooface/data/c;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/sumsub/sns/prooface/data/c;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/prooface/data/d;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getFaceStatus$annotations", "()V", "b", "Lcom/sumsub/sns/prooface/data/c;", "()Lcom/sumsub/sns/prooface/data/c;", "getFaceMesh$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String faceStatus;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final c faceMesh;

    public static final class a implements InterfaceC1162A<d> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f20203a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f20204b;

        static {
            a aVar = new a();
            f20203a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.prooface.data.FilterOutput", aVar, 2);
            pluginGeneratedSerialDescriptor.k("faceStatus", true);
            pluginGeneratedSerialDescriptor.k("faceMesh", true);
            f20204b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            i0 i0Var = null;
            boolean z10 = true;
            int i = 0;
            Object obj = null;
            Object obj2 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj = c2.D(descriptor, 0, m0.f26414a, obj);
                    i |= 1;
                } else {
                    if (q10 != 1) {
                        throw new UnknownFieldException(q10);
                    }
                    obj2 = c2.D(descriptor, 1, c.a.f20199a, obj2);
                    i |= 2;
                }
            }
            c2.b(descriptor);
            return new d(i, (String) obj, (c) obj2, i0Var);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{C1095a.a(m0.f26414a), C1095a.a(c.a.f20199a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f20204b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, d dVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            d.a(dVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.prooface.data.d$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<d> serializer() {
            return a.f20203a;
        }

        public Companion() {
        }
    }

    public d() {
        this((String) null, (c) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static final void a(d self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.faceStatus != null) {
            output.e(serialDesc, 0, m0.f26414a, self.faceStatus);
        }
        if (!output.D() && self.faceMesh == null) {
            return;
        }
        output.e(serialDesc, 1, c.a.f20199a, self.faceMesh);
    }

    /* renamed from: c, reason: from getter */
    public final String getFaceStatus() {
        return this.faceStatus;
    }

    public /* synthetic */ d(int i, String str, c cVar, i0 i0Var) {
        if ((i & 1) == 0) {
            this.faceStatus = null;
        } else {
            this.faceStatus = str;
        }
        if ((i & 2) == 0) {
            this.faceMesh = null;
        } else {
            this.faceMesh = cVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final c getFaceMesh() {
        return this.faceMesh;
    }

    public d(String str, c cVar) {
        this.faceStatus = str;
        this.faceMesh = cVar;
    }

    public /* synthetic */ d(String str, c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : cVar);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }
}
