package com.sumsub.sns.internal.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.data.source.applicant.remote.j;
import com.sumsub.sns.internal.core.data.source.applicant.remote.q;
import com.sumsub.sns.internal.core.data.source.applicant.remote.t;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u0002\u0015\u0018B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010+\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u00104\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010\u001b¨\u00068"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/a;", "Landroid/os/Parcelable;", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/t;", "otp", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/q;", "oauth", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/j;", "eid", "<init>", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/t;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/q;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/j;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/source/applicant/remote/t;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/q;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/j;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/a;Lqa/c;Lpa/f;)V", "()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/t;", "b", "()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/q;", "c", "()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/j;", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/t;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/q;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/j;)Lcom/sumsub/sns/internal/core/data/source/applicant/remote/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/t;", "h", "getOtp$annotations", "()V", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/q;", "f", "getOauth$annotations", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/j;", "d", "getEid$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class a implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final t otp;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q oauth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final j eid;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.a$a, reason: collision with other inner class name */
    public static final class C0225a implements InterfaceC1162A<a> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0225a f15907a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15908b;

        static {
            C0225a c0225a = new C0225a();
            f15907a = c0225a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.ApplicantDataConfirmModel", c0225a, 3);
            pluginGeneratedSerialDescriptor.k("otp", true);
            pluginGeneratedSerialDescriptor.k("oauth", true);
            pluginGeneratedSerialDescriptor.k("eid", true);
            f15908b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a deserialize(InterfaceC1144d interfaceC1144d) {
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
                    obj = c2.D(descriptor, 0, t.a.f16061a, obj);
                    i |= 1;
                } else if (q10 == 1) {
                    obj2 = c2.D(descriptor, 1, q.a.f16051a, obj2);
                    i |= 2;
                } else {
                    if (q10 != 2) {
                        throw new UnknownFieldException(q10);
                    }
                    obj3 = c2.D(descriptor, 2, j.a.f16022a, obj3);
                    i |= 4;
                }
            }
            c2.b(descriptor);
            return new a(i, (t) obj, (q) obj2, (j) obj3, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{C1095a.a(t.a.f16061a), C1095a.a(q.a.f16051a), C1095a.a(j.a.f16022a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15908b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, a aVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            a.a(aVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<a> serializer() {
            return C0225a.f15907a;
        }

        public Companion() {
        }
    }

    public static final class c implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt() == 0 ? null : t.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : q.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? j.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    public a() {
        this((t) null, (q) null, (j) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: a, reason: from getter */
    public final t getOtp() {
        return this.otp;
    }

    /* renamed from: b, reason: from getter */
    public final q getOauth() {
        return this.oauth;
    }

    /* renamed from: c, reason: from getter */
    public final j getEid() {
        return this.eid;
    }

    public final j d() {
        return this.eid;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return kotlin.jvm.internal.f.b(this.otp, aVar.otp) && kotlin.jvm.internal.f.b(this.oauth, aVar.oauth) && kotlin.jvm.internal.f.b(this.eid, aVar.eid);
    }

    public final q f() {
        return this.oauth;
    }

    public final t h() {
        return this.otp;
    }

    public int hashCode() {
        t tVar = this.otp;
        int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
        q qVar = this.oauth;
        int hashCode2 = (hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        j jVar = this.eid;
        return hashCode2 + (jVar != null ? jVar.hashCode() : 0);
    }

    public String toString() {
        return "ApplicantDataConfirmModel(otp=" + this.otp + ", oauth=" + this.oauth + ", eid=" + this.eid + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        t tVar = this.otp;
        if (tVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tVar.writeToParcel(parcel, flags);
        }
        q qVar = this.oauth;
        if (qVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qVar.writeToParcel(parcel, flags);
        }
        j jVar = this.eid;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jVar.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ a(int i, t tVar, q qVar, j jVar, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.otp = null;
        } else {
            this.otp = tVar;
        }
        if ((i & 2) == 0) {
            this.oauth = null;
        } else {
            this.oauth = qVar;
        }
        if ((i & 4) == 0) {
            this.eid = null;
        } else {
            this.eid = jVar;
        }
    }

    public final a a(t otp, q oauth, j eid) {
        return new a(otp, oauth, eid);
    }

    public a(t tVar, q qVar, j jVar) {
        this.otp = tVar;
        this.oauth = qVar;
        this.eid = jVar;
    }

    public static /* synthetic */ a a(a aVar, t tVar, q qVar, j jVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tVar = aVar.otp;
        }
        if ((i & 2) != 0) {
            qVar = aVar.oauth;
        }
        if ((i & 4) != 0) {
            jVar = aVar.eid;
        }
        return aVar.a(tVar, qVar, jVar);
    }

    public static final void a(a self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.otp != null) {
            output.e(serialDesc, 0, t.a.f16061a, self.otp);
        }
        if (output.D() || self.oauth != null) {
            output.e(serialDesc, 1, q.a.f16051a, self.oauth);
        }
        if (!output.D() && self.eid == null) {
            return;
        }
        output.e(serialDesc, 2, j.a.f16022a, self.eid);
    }

    public /* synthetic */ a(t tVar, q qVar, j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tVar, (i & 2) != 0 ? null : qVar, (i & 4) != 0 ? null : jVar);
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void i() {
    }
}
