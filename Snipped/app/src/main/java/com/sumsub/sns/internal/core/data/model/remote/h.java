package com.sumsub.sns.internal.core.data.model.remote;

import C.v;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.data.source.applicant.remote.ConfirmationType;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 32\u00020\u0001:\u0002\u0017\u001aB=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBQ\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJF\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010-\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001cR(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u00100\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010\u001e¨\u00064"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/h;", "", "", "sourceId", "docType", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationType;", "confirmationType", "", "Lcom/sumsub/sns/internal/core/data/model/h$d;", "fields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationType;Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationType;Ljava/util/List;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/h;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "c", "()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationType;", "d", "()Ljava/util/List;", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationType;Ljava/util/List;)Lcom/sumsub/sns/internal/core/data/model/remote/h;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "k", "getSourceId$annotations", "()V", "g", "getDocType$annotations", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationType;", "e", "getConfirmationType$annotations", "Ljava/util/List;", "i", "getFields$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class h {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String sourceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String docType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final ConfirmationType confirmationType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final List<h.d> fields;

    public static final class a implements InterfaceC1162A<h> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15620a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15621b;

        static {
            a aVar = new a();
            f15620a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.RemoteApplicantDataSource", aVar, 4);
            pluginGeneratedSerialDescriptor.k("sourceId", true);
            pluginGeneratedSerialDescriptor.k("docType", true);
            pluginGeneratedSerialDescriptor.k("confirmationType", true);
            pluginGeneratedSerialDescriptor.k("fields", true);
            f15621b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
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
                } else if (q10 == 2) {
                    obj3 = c2.D(descriptor, 2, ConfirmationType.a.f15898a, obj3);
                    i |= 4;
                } else {
                    if (q10 != 3) {
                        throw new UnknownFieldException(q10);
                    }
                    obj4 = c2.D(descriptor, 3, new C1169d(h.d.a.f15503a, 0), obj4);
                    i |= 8;
                }
            }
            c2.b(descriptor);
            return new h(i, (String) obj, (String) obj2, (ConfirmationType) obj3, (List) obj4, (i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(ConfirmationType.a.f15898a), C1095a.a(new C1169d(h.d.a.f15503a, 0))};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15621b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, h hVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            h.a(hVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.remote.h$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<h> serializer() {
            return a.f15620a;
        }

        public Companion() {
        }
    }

    public h() {
        this((String) null, (String) null, (ConfirmationType) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: a, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* renamed from: b, reason: from getter */
    public final String getDocType() {
        return this.docType;
    }

    /* renamed from: c, reason: from getter */
    public final ConfirmationType getConfirmationType() {
        return this.confirmationType;
    }

    public final List<h.d> d() {
        return this.fields;
    }

    public final ConfirmationType e() {
        return this.confirmationType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return kotlin.jvm.internal.f.b(this.sourceId, hVar.sourceId) && kotlin.jvm.internal.f.b(this.docType, hVar.docType) && this.confirmationType == hVar.confirmationType && kotlin.jvm.internal.f.b(this.fields, hVar.fields);
    }

    public final String g() {
        return this.docType;
    }

    public int hashCode() {
        String str = this.sourceId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.docType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConfirmationType confirmationType = this.confirmationType;
        int hashCode3 = (hashCode2 + (confirmationType == null ? 0 : confirmationType.hashCode())) * 31;
        List<h.d> list = this.fields;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final List<h.d> i() {
        return this.fields;
    }

    public final String k() {
        return this.sourceId;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteApplicantDataSource(sourceId=");
        sb2.append(this.sourceId);
        sb2.append(", docType=");
        sb2.append(this.docType);
        sb2.append(", confirmationType=");
        sb2.append(this.confirmationType);
        sb2.append(", fields=");
        return v.r(sb2, this.fields, ')');
    }

    public /* synthetic */ h(int i, String str, String str2, ConfirmationType confirmationType, List list, i0 i0Var) {
        if ((i & 1) == 0) {
            this.sourceId = null;
        } else {
            this.sourceId = str;
        }
        if ((i & 2) == 0) {
            this.docType = null;
        } else {
            this.docType = str2;
        }
        if ((i & 4) == 0) {
            this.confirmationType = null;
        } else {
            this.confirmationType = confirmationType;
        }
        if ((i & 8) == 0) {
            this.fields = null;
        } else {
            this.fields = list;
        }
    }

    public final h a(String sourceId, String docType, ConfirmationType confirmationType, List<h.d> fields) {
        return new h(sourceId, docType, confirmationType, fields);
    }

    public h(String str, String str2, ConfirmationType confirmationType, List<h.d> list) {
        this.sourceId = str;
        this.docType = str2;
        this.confirmationType = confirmationType;
        this.fields = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h a(h hVar, String str, String str2, ConfirmationType confirmationType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hVar.sourceId;
        }
        if ((i & 2) != 0) {
            str2 = hVar.docType;
        }
        if ((i & 4) != 0) {
            confirmationType = hVar.confirmationType;
        }
        if ((i & 8) != 0) {
            list = hVar.fields;
        }
        return hVar.a(str, str2, confirmationType, list);
    }

    public static final void a(h self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.sourceId != null) {
            output.e(serialDesc, 0, m0.f26414a, self.sourceId);
        }
        if (output.D() || self.docType != null) {
            output.e(serialDesc, 1, m0.f26414a, self.docType);
        }
        if (output.D() || self.confirmationType != null) {
            output.e(serialDesc, 2, ConfirmationType.a.f15898a, self.confirmationType);
        }
        if (!output.D() && self.fields == null) {
            return;
        }
        output.e(serialDesc, 3, new C1169d(h.d.a.f15503a, 0), self.fields);
    }

    public /* synthetic */ h(String str, String str2, ConfirmationType confirmationType, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : confirmationType, (i & 8) != 0 ? null : list);
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
