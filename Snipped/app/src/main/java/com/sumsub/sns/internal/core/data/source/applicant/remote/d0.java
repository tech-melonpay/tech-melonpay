package com.sumsub.sns.internal.core.data.source.applicant.remote;

import com.sumsub.sns.internal.core.data.source.applicant.remote.EKycFlowStatus;
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

@InterfaceC1080d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002\u0011\u001fB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0013J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0013¨\u0006#"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/d0;", "", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/EKycFlowStatus;", "status", "<init>", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/EKycFlowStatus;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/source/applicant/remote/EKycFlowStatus;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/d0;Lqa/c;Lpa/f;)V", "()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/EKycFlowStatus;", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/EKycFlowStatus;)Lcom/sumsub/sns/internal/core/data/source/applicant/remote/d0;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/EKycFlowStatus;", "b", "getStatus$annotations", "()V", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class d0 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final EKycFlowStatus status;

    public static final class a implements InterfaceC1162A<d0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15981a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15982b;

        static {
            a aVar = new a();
            f15981a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.SkipEKycResponse", aVar, 1);
            pluginGeneratedSerialDescriptor.k("status", true);
            f15982b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 deserialize(InterfaceC1144d interfaceC1144d) {
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
                    obj = c2.D(descriptor, 0, EKycFlowStatus.a.f15900a, obj);
                    i = 1;
                }
            }
            c2.b(descriptor);
            return new d0(i, (EKycFlowStatus) obj, i0Var);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{C1095a.a(EKycFlowStatus.a.f15900a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15982b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, d0 d0Var) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            d0.a(d0Var, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.d0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<d0> serializer() {
            return a.f15981a;
        }

        public Companion() {
        }
    }

    public d0() {
        this((EKycFlowStatus) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* renamed from: a, reason: from getter */
    public final EKycFlowStatus getStatus() {
        return this.status;
    }

    public final EKycFlowStatus b() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof d0) && this.status == ((d0) other).status;
    }

    public int hashCode() {
        EKycFlowStatus eKycFlowStatus = this.status;
        if (eKycFlowStatus == null) {
            return 0;
        }
        return eKycFlowStatus.hashCode();
    }

    public String toString() {
        return "SkipEKycResponse(status=" + this.status + ')';
    }

    public /* synthetic */ d0(int i, EKycFlowStatus eKycFlowStatus, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.status = null;
        } else {
            this.status = eKycFlowStatus;
        }
    }

    public final d0 a(EKycFlowStatus status) {
        return new d0(status);
    }

    public d0(EKycFlowStatus eKycFlowStatus) {
        this.status = eKycFlowStatus;
    }

    public static /* synthetic */ d0 a(d0 d0Var, EKycFlowStatus eKycFlowStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            eKycFlowStatus = d0Var.status;
        }
        return d0Var.a(eKycFlowStatus);
    }

    public static final void a(d0 self, InterfaceC1143c output, pa.f serialDesc) {
        if (!output.D() && self.status == null) {
            return;
        }
        output.e(serialDesc, 0, EKycFlowStatus.a.f15900a, self.status);
    }

    public /* synthetic */ d0(EKycFlowStatus eKycFlowStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : eKycFlowStatus);
    }

    public static /* synthetic */ void c() {
    }
}
