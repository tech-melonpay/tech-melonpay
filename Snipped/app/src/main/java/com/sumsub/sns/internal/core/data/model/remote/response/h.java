package com.sumsub.sns.internal.core.data.model.remote.response;

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
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002\u0015\u0018B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBK\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ@\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010+\u0012\u0004\b-\u0010&\u001a\u0004\b,\u0010\u001b¨\u0006/"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/response/h;", "", "", "workflowId", "runId", "runStatus", "", "levelChangePossible", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/response/h;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "c", "d", "()Ljava/lang/Boolean;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/sumsub/sns/internal/core/data/model/remote/response/h;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "k", "getWorkflowId$annotations", "()V", "g", "getRunId$annotations", "i", "getRunStatus$annotations", "Ljava/lang/Boolean;", "e", "getLevelChangePossible$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class h {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String workflowId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String runId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String runStatus;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Boolean levelChangePossible;

    public static final class a implements InterfaceC1162A<h> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15783a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15784b;

        static {
            a aVar = new a();
            f15783a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.response.WorkflowStatus", aVar, 4);
            pluginGeneratedSerialDescriptor.k("workflowId", true);
            pluginGeneratedSerialDescriptor.k("runId", true);
            pluginGeneratedSerialDescriptor.k("runStatus", true);
            pluginGeneratedSerialDescriptor.k("levelChangePossible", true);
            f15784b = pluginGeneratedSerialDescriptor;
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
                    obj3 = c2.D(descriptor, 2, m0.f26414a, obj3);
                    i |= 4;
                } else {
                    if (q10 != 3) {
                        throw new UnknownFieldException(q10);
                    }
                    obj4 = c2.D(descriptor, 3, C1172g.f26395a, obj4);
                    i |= 8;
                }
            }
            c2.b(descriptor);
            return new h(i, (String) obj, (String) obj2, (String) obj3, (Boolean) obj4, (i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(C1172g.f26395a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15784b;
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

    /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.h$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<h> serializer() {
            return a.f15783a;
        }

        public Companion() {
        }
    }

    public h() {
        this((String) null, (String) null, (String) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: a, reason: from getter */
    public final String getWorkflowId() {
        return this.workflowId;
    }

    /* renamed from: b, reason: from getter */
    public final String getRunId() {
        return this.runId;
    }

    /* renamed from: c, reason: from getter */
    public final String getRunStatus() {
        return this.runStatus;
    }

    /* renamed from: d, reason: from getter */
    public final Boolean getLevelChangePossible() {
        return this.levelChangePossible;
    }

    public final Boolean e() {
        return this.levelChangePossible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return kotlin.jvm.internal.f.b(this.workflowId, hVar.workflowId) && kotlin.jvm.internal.f.b(this.runId, hVar.runId) && kotlin.jvm.internal.f.b(this.runStatus, hVar.runStatus) && kotlin.jvm.internal.f.b(this.levelChangePossible, hVar.levelChangePossible);
    }

    public final String g() {
        return this.runId;
    }

    public int hashCode() {
        String str = this.workflowId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.runId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.runStatus;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.levelChangePossible;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String i() {
        return this.runStatus;
    }

    public final String k() {
        return this.workflowId;
    }

    public String toString() {
        return "WorkflowStatus(workflowId=" + this.workflowId + ", runId=" + this.runId + ", runStatus=" + this.runStatus + ", levelChangePossible=" + this.levelChangePossible + ')';
    }

    public /* synthetic */ h(int i, String str, String str2, String str3, Boolean bool, i0 i0Var) {
        if ((i & 1) == 0) {
            this.workflowId = null;
        } else {
            this.workflowId = str;
        }
        if ((i & 2) == 0) {
            this.runId = null;
        } else {
            this.runId = str2;
        }
        if ((i & 4) == 0) {
            this.runStatus = null;
        } else {
            this.runStatus = str3;
        }
        if ((i & 8) == 0) {
            this.levelChangePossible = null;
        } else {
            this.levelChangePossible = bool;
        }
    }

    public final h a(String workflowId, String runId, String runStatus, Boolean levelChangePossible) {
        return new h(workflowId, runId, runStatus, levelChangePossible);
    }

    public h(String str, String str2, String str3, Boolean bool) {
        this.workflowId = str;
        this.runId = str2;
        this.runStatus = str3;
        this.levelChangePossible = bool;
    }

    public static /* synthetic */ h a(h hVar, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hVar.workflowId;
        }
        if ((i & 2) != 0) {
            str2 = hVar.runId;
        }
        if ((i & 4) != 0) {
            str3 = hVar.runStatus;
        }
        if ((i & 8) != 0) {
            bool = hVar.levelChangePossible;
        }
        return hVar.a(str, str2, str3, bool);
    }

    public static final void a(h self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.workflowId != null) {
            output.e(serialDesc, 0, m0.f26414a, self.workflowId);
        }
        if (output.D() || self.runId != null) {
            output.e(serialDesc, 1, m0.f26414a, self.runId);
        }
        if (output.D() || self.runStatus != null) {
            output.e(serialDesc, 2, m0.f26414a, self.runStatus);
        }
        if (!output.D() && self.levelChangePossible == null) {
            return;
        }
        output.e(serialDesc, 3, C1172g.f26395a, self.levelChangePossible);
    }

    public /* synthetic */ h(String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
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
