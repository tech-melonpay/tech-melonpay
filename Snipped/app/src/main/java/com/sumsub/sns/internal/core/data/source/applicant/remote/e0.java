package com.sumsub.sns.internal.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.data.source.applicant.remote.ConfirmationStatus;
import com.sumsub.sns.internal.core.data.source.applicant.remote.ConfirmationType;
import com.sumsub.sns.internal.core.data.source.applicant.remote.EKycFlowStatus;
import com.sumsub.sns.internal.core.data.source.applicant.remote.i;
import com.sumsub.sns.internal.core.data.source.applicant.remote.p;
import com.sumsub.sns.internal.core.data.source.applicant.remote.s;
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
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0002\u0017\u0019B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bo\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$Jd\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0017\u0010%J\u0010\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b.\u0010(J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b3\u00104J(\u0010\u0017\u001a\u0002022\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208HÇ\u0001¢\u0006\u0004\b\u0017\u0010:R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010;\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010?\u0012\u0004\bA\u0010>\u001a\u0004\b@\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010B\u0012\u0004\bD\u0010>\u001a\u0004\bC\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010E\u0012\u0004\bG\u0010>\u001a\u0004\bF\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010H\u0012\u0004\bJ\u0010>\u001a\u0004\bI\u0010 R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010K\u0012\u0004\bM\u0010>\u001a\u0004\bL\u0010\"R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010N\u0012\u0004\bP\u0010>\u001a\u0004\bO\u0010$¨\u0006R"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/e0;", "Landroid/os/Parcelable;", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/EKycFlowStatus;", "status", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationType;", "confirmationType", "", "confirmationId", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationStatus;", "confirmationStatus", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/s;", "otpConfirmation", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/p;", "oAuthConfirmation", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/i;", "eidConfirmation", "<init>", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/EKycFlowStatus;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationType;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationStatus;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/s;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/p;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/i;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/source/applicant/remote/EKycFlowStatus;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationType;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationStatus;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/s;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/p;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/i;Lra/i0;)V", "a", "()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/EKycFlowStatus;", "b", "()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationType;", "c", "()Ljava/lang/String;", "d", "()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationStatus;", "e", "()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/s;", "f", "()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/p;", "g", "()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/i;", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/EKycFlowStatus;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationType;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationStatus;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/s;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/p;Lcom/sumsub/sns/internal/core/data/source/applicant/remote/i;)Lcom/sumsub/sns/internal/core/data/source/applicant/remote/e0;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LO9/p;", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/e0;Lqa/c;Lpa/f;)V", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/EKycFlowStatus;", "t", "getStatus$annotations", "()V", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationType;", "l", "getConfirmationType$annotations", "Ljava/lang/String;", "h", "getConfirmationId$annotations", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationStatus;", "j", "getConfirmationStatus$annotations", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/s;", "r", "getOtpConfirmation$annotations", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/p;", "p", "getOAuthConfirmation$annotations", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/i;", "n", "getEidConfirmation$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class e0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final EKycFlowStatus status;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final ConfirmationType confirmationType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String confirmationId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final ConfirmationStatus confirmationStatus;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final s otpConfirmation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final p oAuthConfirmation;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final i eidConfirmation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<e0> CREATOR = new c();

    public static final class a implements InterfaceC1162A<e0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15990a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15991b;

        static {
            a aVar = new a();
            f15990a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.SubmitApplicantDataResponse", aVar, 7);
            pluginGeneratedSerialDescriptor.k("status", true);
            pluginGeneratedSerialDescriptor.k("confirmationType", true);
            pluginGeneratedSerialDescriptor.k("confirmationId", true);
            pluginGeneratedSerialDescriptor.k("confirmationStatus", true);
            pluginGeneratedSerialDescriptor.k("otpConfirmation", true);
            pluginGeneratedSerialDescriptor.k("oauthConfirmation", true);
            pluginGeneratedSerialDescriptor.k("eidConfirmation", true);
            f15991b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e0 deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                switch (q10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        obj = c2.D(descriptor, 0, EKycFlowStatus.a.f15900a, obj);
                        i |= 1;
                        break;
                    case 1:
                        obj2 = c2.D(descriptor, 1, ConfirmationType.a.f15898a, obj2);
                        i |= 2;
                        break;
                    case 2:
                        obj3 = c2.D(descriptor, 2, m0.f26414a, obj3);
                        i |= 4;
                        break;
                    case 3:
                        obj4 = c2.D(descriptor, 3, ConfirmationStatus.a.f15896a, obj4);
                        i |= 8;
                        break;
                    case 4:
                        obj5 = c2.D(descriptor, 4, s.a.f16058a, obj5);
                        i |= 16;
                        break;
                    case 5:
                        obj6 = c2.D(descriptor, 5, p.a.f16048a, obj6);
                        i |= 32;
                        break;
                    case 6:
                        obj7 = c2.D(descriptor, 6, i.a.f16016a, obj7);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            c2.b(descriptor);
            return new e0(i, (EKycFlowStatus) obj, (ConfirmationType) obj2, (String) obj3, (ConfirmationStatus) obj4, (s) obj5, (p) obj6, (i) obj7, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{C1095a.a(EKycFlowStatus.a.f15900a), C1095a.a(ConfirmationType.a.f15898a), C1095a.a(m0.f26414a), C1095a.a(ConfirmationStatus.a.f15896a), C1095a.a(s.a.f16058a), C1095a.a(p.a.f16048a), C1095a.a(i.a.f16016a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15991b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, e0 e0Var) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            e0.a(e0Var, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.e0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<e0> serializer() {
            return a.f15990a;
        }

        public Companion() {
        }
    }

    public static final class c implements Parcelable.Creator<e0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 createFromParcel(Parcel parcel) {
            return new e0(parcel.readInt() == 0 ? null : EKycFlowStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ConfirmationType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : ConfirmationStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : s.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : p.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? i.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0[] newArray(int i) {
            return new e0[i];
        }
    }

    public e0() {
        this((EKycFlowStatus) null, (ConfirmationType) null, (String) null, (ConfirmationStatus) null, (s) null, (p) null, (i) null, 127, (DefaultConstructorMarker) null);
    }

    /* renamed from: a, reason: from getter */
    public final EKycFlowStatus getStatus() {
        return this.status;
    }

    /* renamed from: b, reason: from getter */
    public final ConfirmationType getConfirmationType() {
        return this.confirmationType;
    }

    /* renamed from: c, reason: from getter */
    public final String getConfirmationId() {
        return this.confirmationId;
    }

    /* renamed from: d, reason: from getter */
    public final ConfirmationStatus getConfirmationStatus() {
        return this.confirmationStatus;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final s getOtpConfirmation() {
        return this.otpConfirmation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) other;
        return this.status == e0Var.status && this.confirmationType == e0Var.confirmationType && kotlin.jvm.internal.f.b(this.confirmationId, e0Var.confirmationId) && this.confirmationStatus == e0Var.confirmationStatus && kotlin.jvm.internal.f.b(this.otpConfirmation, e0Var.otpConfirmation) && kotlin.jvm.internal.f.b(this.oAuthConfirmation, e0Var.oAuthConfirmation) && kotlin.jvm.internal.f.b(this.eidConfirmation, e0Var.eidConfirmation);
    }

    /* renamed from: f, reason: from getter */
    public final p getOAuthConfirmation() {
        return this.oAuthConfirmation;
    }

    /* renamed from: g, reason: from getter */
    public final i getEidConfirmation() {
        return this.eidConfirmation;
    }

    public final String h() {
        return this.confirmationId;
    }

    public int hashCode() {
        EKycFlowStatus eKycFlowStatus = this.status;
        int hashCode = (eKycFlowStatus == null ? 0 : eKycFlowStatus.hashCode()) * 31;
        ConfirmationType confirmationType = this.confirmationType;
        int hashCode2 = (hashCode + (confirmationType == null ? 0 : confirmationType.hashCode())) * 31;
        String str = this.confirmationId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ConfirmationStatus confirmationStatus = this.confirmationStatus;
        int hashCode4 = (hashCode3 + (confirmationStatus == null ? 0 : confirmationStatus.hashCode())) * 31;
        s sVar = this.otpConfirmation;
        int hashCode5 = (hashCode4 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        p pVar = this.oAuthConfirmation;
        int hashCode6 = (hashCode5 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        i iVar = this.eidConfirmation;
        return hashCode6 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final ConfirmationStatus j() {
        return this.confirmationStatus;
    }

    public final ConfirmationType l() {
        return this.confirmationType;
    }

    public final i n() {
        return this.eidConfirmation;
    }

    public final p p() {
        return this.oAuthConfirmation;
    }

    public final s r() {
        return this.otpConfirmation;
    }

    public final EKycFlowStatus t() {
        return this.status;
    }

    public String toString() {
        return "SubmitApplicantDataResponse(status=" + this.status + ", confirmationType=" + this.confirmationType + ", confirmationId=" + this.confirmationId + ", confirmationStatus=" + this.confirmationStatus + ", otpConfirmation=" + this.otpConfirmation + ", oAuthConfirmation=" + this.oAuthConfirmation + ", eidConfirmation=" + this.eidConfirmation + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        EKycFlowStatus eKycFlowStatus = this.status;
        if (eKycFlowStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(eKycFlowStatus.name());
        }
        ConfirmationType confirmationType = this.confirmationType;
        if (confirmationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(confirmationType.name());
        }
        parcel.writeString(this.confirmationId);
        ConfirmationStatus confirmationStatus = this.confirmationStatus;
        if (confirmationStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(confirmationStatus.name());
        }
        s sVar = this.otpConfirmation;
        if (sVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sVar.writeToParcel(parcel, flags);
        }
        p pVar = this.oAuthConfirmation;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar.writeToParcel(parcel, flags);
        }
        i iVar = this.eidConfirmation;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ e0(int i, EKycFlowStatus eKycFlowStatus, ConfirmationType confirmationType, String str, ConfirmationStatus confirmationStatus, s sVar, p pVar, i iVar, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.status = null;
        } else {
            this.status = eKycFlowStatus;
        }
        if ((i & 2) == 0) {
            this.confirmationType = null;
        } else {
            this.confirmationType = confirmationType;
        }
        if ((i & 4) == 0) {
            this.confirmationId = null;
        } else {
            this.confirmationId = str;
        }
        if ((i & 8) == 0) {
            this.confirmationStatus = null;
        } else {
            this.confirmationStatus = confirmationStatus;
        }
        if ((i & 16) == 0) {
            this.otpConfirmation = null;
        } else {
            this.otpConfirmation = sVar;
        }
        if ((i & 32) == 0) {
            this.oAuthConfirmation = null;
        } else {
            this.oAuthConfirmation = pVar;
        }
        if ((i & 64) == 0) {
            this.eidConfirmation = null;
        } else {
            this.eidConfirmation = iVar;
        }
    }

    public final e0 a(EKycFlowStatus status, ConfirmationType confirmationType, String confirmationId, ConfirmationStatus confirmationStatus, s otpConfirmation, p oAuthConfirmation, i eidConfirmation) {
        return new e0(status, confirmationType, confirmationId, confirmationStatus, otpConfirmation, oAuthConfirmation, eidConfirmation);
    }

    public e0(EKycFlowStatus eKycFlowStatus, ConfirmationType confirmationType, String str, ConfirmationStatus confirmationStatus, s sVar, p pVar, i iVar) {
        this.status = eKycFlowStatus;
        this.confirmationType = confirmationType;
        this.confirmationId = str;
        this.confirmationStatus = confirmationStatus;
        this.otpConfirmation = sVar;
        this.oAuthConfirmation = pVar;
        this.eidConfirmation = iVar;
    }

    public static /* synthetic */ e0 a(e0 e0Var, EKycFlowStatus eKycFlowStatus, ConfirmationType confirmationType, String str, ConfirmationStatus confirmationStatus, s sVar, p pVar, i iVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eKycFlowStatus = e0Var.status;
        }
        if ((i & 2) != 0) {
            confirmationType = e0Var.confirmationType;
        }
        ConfirmationType confirmationType2 = confirmationType;
        if ((i & 4) != 0) {
            str = e0Var.confirmationId;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            confirmationStatus = e0Var.confirmationStatus;
        }
        ConfirmationStatus confirmationStatus2 = confirmationStatus;
        if ((i & 16) != 0) {
            sVar = e0Var.otpConfirmation;
        }
        s sVar2 = sVar;
        if ((i & 32) != 0) {
            pVar = e0Var.oAuthConfirmation;
        }
        p pVar2 = pVar;
        if ((i & 64) != 0) {
            iVar = e0Var.eidConfirmation;
        }
        return e0Var.a(eKycFlowStatus, confirmationType2, str2, confirmationStatus2, sVar2, pVar2, iVar);
    }

    public static final void a(e0 self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.status != null) {
            output.e(serialDesc, 0, EKycFlowStatus.a.f15900a, self.status);
        }
        if (output.D() || self.confirmationType != null) {
            output.e(serialDesc, 1, ConfirmationType.a.f15898a, self.confirmationType);
        }
        if (output.D() || self.confirmationId != null) {
            output.e(serialDesc, 2, m0.f26414a, self.confirmationId);
        }
        if (output.D() || self.confirmationStatus != null) {
            output.e(serialDesc, 3, ConfirmationStatus.a.f15896a, self.confirmationStatus);
        }
        if (output.D() || self.otpConfirmation != null) {
            output.e(serialDesc, 4, s.a.f16058a, self.otpConfirmation);
        }
        if (output.D() || self.oAuthConfirmation != null) {
            output.e(serialDesc, 5, p.a.f16048a, self.oAuthConfirmation);
        }
        if (!output.D() && self.eidConfirmation == null) {
            return;
        }
        output.e(serialDesc, 6, i.a.f16016a, self.eidConfirmation);
    }

    public /* synthetic */ e0(EKycFlowStatus eKycFlowStatus, ConfirmationType confirmationType, String str, ConfirmationStatus confirmationStatus, s sVar, p pVar, i iVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : eKycFlowStatus, (i & 2) != 0 ? null : confirmationType, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : confirmationStatus, (i & 16) != 0 ? null : sVar, (i & 32) != 0 ? null : pVar, (i & 64) != 0 ? null : iVar);
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void s() {
    }

    public static /* synthetic */ void u() {
    }
}
