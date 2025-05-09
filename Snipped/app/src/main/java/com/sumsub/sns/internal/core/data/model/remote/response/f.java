package com.sumsub.sns.internal.core.data.model.remote.response;

import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.remote.m;
import com.sumsub.sns.internal.core.data.model.remote.response.c;
import com.sumsub.sns.internal.core.data.model.remote.response.h;
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
import ra.InterfaceC1162A;
import ra.K;
import ra.a0;
import ra.i0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0002\u0017\u001aB7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0001\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0019J\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0019R.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010/\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010\u001d¨\u00063"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/response/f;", "", "Lcom/sumsub/sns/internal/core/data/model/remote/response/c;", "inspectionReview", "", "Lcom/sumsub/sns/internal/core/data/model/DocumentType;", "Lcom/sumsub/sns/internal/core/data/model/remote/m;", "requiredIdDocsStatus", "Lcom/sumsub/sns/internal/core/data/model/remote/response/h;", "workflowStatus", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/remote/response/c;Ljava/util/Map;Lcom/sumsub/sns/internal/core/data/model/remote/response/h;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/remote/response/c;Ljava/util/Map;Lcom/sumsub/sns/internal/core/data/model/remote/response/h;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/response/f;Lqa/c;Lpa/f;)V", "()Lcom/sumsub/sns/internal/core/data/model/remote/response/c;", "b", "()Ljava/util/Map;", "c", "()Lcom/sumsub/sns/internal/core/data/model/remote/response/h;", "(Lcom/sumsub/sns/internal/core/data/model/remote/response/c;Ljava/util/Map;Lcom/sumsub/sns/internal/core/data/model/remote/response/h;)Lcom/sumsub/sns/internal/core/data/model/remote/response/f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sumsub/sns/internal/core/data/model/remote/response/c;", "d", "getInspectionReview$annotations", "()V", "Ljava/util/Map;", "f", "getRequiredIdDocsStatus$annotations", "Lcom/sumsub/sns/internal/core/data/model/remote/response/h;", "h", "getWorkflowStatus$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class f {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final c inspectionReview;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Map<DocumentType, m> requiredIdDocsStatus;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final h workflowStatus;

    public static final class a implements InterfaceC1162A<f> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15768a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15769b;

        static {
            a aVar = new a();
            f15768a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.response.RequiredIdDocsStatusResponse", aVar, 3);
            pluginGeneratedSerialDescriptor.k("inspectionReview", true);
            pluginGeneratedSerialDescriptor.k("requiredIdDocsStatus", true);
            pluginGeneratedSerialDescriptor.k("workflowStatus", true);
            f15769b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f deserialize(InterfaceC1144d interfaceC1144d) {
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
                    obj = c2.D(descriptor, 0, c.a.f15683a, obj);
                    i |= 1;
                } else if (q10 == 1) {
                    obj2 = c2.C(descriptor, 1, new K(DocumentType.Companion.C0199a.f15257a, C1095a.a(m.a.f15661a)), obj2);
                    i |= 2;
                } else {
                    if (q10 != 2) {
                        throw new UnknownFieldException(q10);
                    }
                    obj3 = c2.D(descriptor, 2, h.a.f15783a, obj3);
                    i |= 4;
                }
            }
            c2.b(descriptor);
            return new f(i, (c) obj, (Map) obj2, (h) obj3, (i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{C1095a.a(c.a.f15683a), new K(DocumentType.Companion.C0199a.f15257a, C1095a.a(m.a.f15661a)), C1095a.a(h.a.f15783a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15769b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, f fVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            f.a(fVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.f$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<f> serializer() {
            return a.f15768a;
        }

        public Companion() {
        }
    }

    public f() {
        this((c) null, (Map) null, (h) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: a, reason: from getter */
    public final c getInspectionReview() {
        return this.inspectionReview;
    }

    public final Map<DocumentType, m> b() {
        return this.requiredIdDocsStatus;
    }

    /* renamed from: c, reason: from getter */
    public final h getWorkflowStatus() {
        return this.workflowStatus;
    }

    public final c d() {
        return this.inspectionReview;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return kotlin.jvm.internal.f.b(this.inspectionReview, fVar.inspectionReview) && kotlin.jvm.internal.f.b(this.requiredIdDocsStatus, fVar.requiredIdDocsStatus) && kotlin.jvm.internal.f.b(this.workflowStatus, fVar.workflowStatus);
    }

    public final Map<DocumentType, m> f() {
        return this.requiredIdDocsStatus;
    }

    public final h h() {
        return this.workflowStatus;
    }

    public int hashCode() {
        c cVar = this.inspectionReview;
        int hashCode = (this.requiredIdDocsStatus.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31)) * 31;
        h hVar = this.workflowStatus;
        return hashCode + (hVar != null ? hVar.hashCode() : 0);
    }

    public String toString() {
        return "RequiredIdDocsStatusResponse(inspectionReview=" + this.inspectionReview + ", requiredIdDocsStatus=" + this.requiredIdDocsStatus + ", workflowStatus=" + this.workflowStatus + ')';
    }

    public /* synthetic */ f(int i, c cVar, Map map, h hVar, i0 i0Var) {
        if ((i & 1) == 0) {
            this.inspectionReview = null;
        } else {
            this.inspectionReview = cVar;
        }
        if ((i & 2) == 0) {
            this.requiredIdDocsStatus = kotlin.collections.a.p();
        } else {
            this.requiredIdDocsStatus = map;
        }
        if ((i & 4) == 0) {
            this.workflowStatus = null;
        } else {
            this.workflowStatus = hVar;
        }
    }

    public final f a(c inspectionReview, Map<DocumentType, m> requiredIdDocsStatus, h workflowStatus) {
        return new f(inspectionReview, requiredIdDocsStatus, workflowStatus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f a(f fVar, c cVar, Map map, h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = fVar.inspectionReview;
        }
        if ((i & 2) != 0) {
            map = fVar.requiredIdDocsStatus;
        }
        if ((i & 4) != 0) {
            hVar = fVar.workflowStatus;
        }
        return fVar.a(cVar, (Map<DocumentType, m>) map, hVar);
    }

    public static final void a(f self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.inspectionReview != null) {
            output.e(serialDesc, 0, c.a.f15683a, self.inspectionReview);
        }
        if (output.D() || !kotlin.jvm.internal.f.b(self.requiredIdDocsStatus, kotlin.collections.a.p())) {
            output.C(serialDesc, 1, new K(DocumentType.Companion.C0199a.f15257a, C1095a.a(m.a.f15661a)), self.requiredIdDocsStatus);
        }
        if (!output.D() && self.workflowStatus == null) {
            return;
        }
        output.e(serialDesc, 2, h.a.f15783a, self.workflowStatus);
    }

    public f(c cVar, Map<DocumentType, m> map, h hVar) {
        this.inspectionReview = cVar;
        this.requiredIdDocsStatus = map;
        this.workflowStatus = hVar;
    }

    public /* synthetic */ f(c cVar, Map map, h hVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? kotlin.collections.a.p() : map, (i & 4) != 0 ? null : hVar);
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void i() {
    }
}
