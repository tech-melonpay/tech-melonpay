package com.sumsub.sns.internal.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
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
import ra.H;
import ra.InterfaceC1162A;
import ra.O;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002\u0014\u0016Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0087\u0001\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ|\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0014\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b)\u0010#J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b.\u0010/J(\u0010\u0014\u001a\u00020-2\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203HÇ\u0001¢\u0006\u0004\b\u0014\u00105R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u00106\u0012\u0004\b;\u00109\u001a\u0004\b:\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00106\u0012\u0004\b=\u00109\u001a\u0004\b<\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u00106\u0012\u0004\b?\u00109\u001a\u0004\b>\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00106\u0012\u0004\bA\u00109\u001a\u0004\b@\u0010\u0015R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u00106\u0012\u0004\bC\u00109\u001a\u0004\bB\u0010\u0015R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u00106\u0012\u0004\bE\u00109\u001a\u0004\bD\u0010\u0015R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010F\u0012\u0004\bH\u00109\u001a\u0004\bG\u0010\u001dR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010I\u0012\u0004\bK\u00109\u001a\u0004\bJ\u0010\u001f¨\u0006M"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/b0;", "Landroid/os/Parcelable;", "", "id", "createdAt", "identifier", "identifierType", "targetType", "status", "targetId", "", "verificationCodeLength", "", "timeToResendInSec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lra/i0;)V", "a", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "h", "()Ljava/lang/Integer;", "i", "()Ljava/lang/Long;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/sumsub/sns/internal/core/data/source/applicant/remote/b0;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LO9/p;", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/b0;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "l", "getId$annotations", "()V", "j", "getCreatedAt$annotations", "n", "getIdentifier$annotations", "p", "getIdentifierType$annotations", "v", "getTargetType$annotations", "r", "getStatus$annotations", "t", "getTargetId$annotations", "Ljava/lang/Integer;", "z", "getVerificationCodeLength$annotations", "Ljava/lang/Long;", "x", "getTimeToResendInSec$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class b0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String createdAt;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String identifier;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String identifierType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String targetType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String status;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final String targetId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final Integer verificationCodeLength;

    /* renamed from: i, reason: from kotlin metadata */
    public final Long timeToResendInSec;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<b0> CREATOR = new c();

    public static final class a implements InterfaceC1162A<b0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15926a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15927b;

        static {
            a aVar = new a();
            f15926a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.RequestCodeResponse", aVar, 9);
            pluginGeneratedSerialDescriptor.k("id", true);
            pluginGeneratedSerialDescriptor.k("createdAt", true);
            pluginGeneratedSerialDescriptor.k("identifier", true);
            pluginGeneratedSerialDescriptor.k("identifierType", true);
            pluginGeneratedSerialDescriptor.k("targetType", true);
            pluginGeneratedSerialDescriptor.k("status", true);
            pluginGeneratedSerialDescriptor.k("targetId", true);
            pluginGeneratedSerialDescriptor.k("verificationCodeLength", true);
            pluginGeneratedSerialDescriptor.k("timeToResendInSec", true);
            f15927b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0 deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            int i = 0;
            while (z10) {
                int q10 = c2.q(descriptor);
                switch (q10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        obj = c2.D(descriptor, 0, m0.f26414a, obj);
                        i |= 1;
                        break;
                    case 1:
                        obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                        i |= 2;
                        break;
                    case 2:
                        obj3 = c2.D(descriptor, 2, m0.f26414a, obj3);
                        i |= 4;
                        break;
                    case 3:
                        obj4 = c2.D(descriptor, 3, m0.f26414a, obj4);
                        i |= 8;
                        break;
                    case 4:
                        obj5 = c2.D(descriptor, 4, m0.f26414a, obj5);
                        i |= 16;
                        break;
                    case 5:
                        obj6 = c2.D(descriptor, 5, m0.f26414a, obj6);
                        i |= 32;
                        break;
                    case 6:
                        obj7 = c2.D(descriptor, 6, m0.f26414a, obj7);
                        i |= 64;
                        break;
                    case 7:
                        obj8 = c2.D(descriptor, 7, H.f26353a, obj8);
                        i |= 128;
                        break;
                    case 8:
                        obj9 = c2.D(descriptor, 8, O.f26364a, obj9);
                        i |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            c2.b(descriptor);
            return new b0(i, (String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (Integer) obj8, (Long) obj9, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(H.f26353a), C1095a.a(O.f26364a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15927b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, b0 b0Var) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            b0.a(b0Var, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.b0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<b0> serializer() {
            return a.f15926a;
        }

        public Companion() {
        }
    }

    public static final class c implements Parcelable.Creator<b0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b0 createFromParcel(Parcel parcel) {
            return new b0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b0[] newArray(int i) {
            return new b0[i];
        }
    }

    public b0() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Long) null, 511, (DefaultConstructorMarker) null);
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: c, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: d, reason: from getter */
    public final String getIdentifierType() {
        return this.identifierType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final String getTargetType() {
        return this.targetType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) other;
        return kotlin.jvm.internal.f.b(this.id, b0Var.id) && kotlin.jvm.internal.f.b(this.createdAt, b0Var.createdAt) && kotlin.jvm.internal.f.b(this.identifier, b0Var.identifier) && kotlin.jvm.internal.f.b(this.identifierType, b0Var.identifierType) && kotlin.jvm.internal.f.b(this.targetType, b0Var.targetType) && kotlin.jvm.internal.f.b(this.status, b0Var.status) && kotlin.jvm.internal.f.b(this.targetId, b0Var.targetId) && kotlin.jvm.internal.f.b(this.verificationCodeLength, b0Var.verificationCodeLength) && kotlin.jvm.internal.f.b(this.timeToResendInSec, b0Var.timeToResendInSec);
    }

    /* renamed from: f, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: g, reason: from getter */
    public final String getTargetId() {
        return this.targetId;
    }

    /* renamed from: h, reason: from getter */
    public final Integer getVerificationCodeLength() {
        return this.verificationCodeLength;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.createdAt;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.identifier;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.identifierType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.targetType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.status;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.targetId;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.verificationCodeLength;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Long l10 = this.timeToResendInSec;
        return hashCode8 + (l10 != null ? l10.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final Long getTimeToResendInSec() {
        return this.timeToResendInSec;
    }

    public final String j() {
        return this.createdAt;
    }

    public final String l() {
        return this.id;
    }

    public final String n() {
        return this.identifier;
    }

    public final String p() {
        return this.identifierType;
    }

    public final String r() {
        return this.status;
    }

    public final String t() {
        return this.targetId;
    }

    public String toString() {
        return "RequestCodeResponse(id=" + this.id + ", createdAt=" + this.createdAt + ", identifier=" + this.identifier + ", identifierType=" + this.identifierType + ", targetType=" + this.targetType + ", status=" + this.status + ", targetId=" + this.targetId + ", verificationCodeLength=" + this.verificationCodeLength + ", timeToResendInSec=" + this.timeToResendInSec + ')';
    }

    public final String v() {
        return this.targetType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.identifier);
        parcel.writeString(this.identifierType);
        parcel.writeString(this.targetType);
        parcel.writeString(this.status);
        parcel.writeString(this.targetId);
        Integer num = this.verificationCodeLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l10 = this.timeToResendInSec;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l10.longValue());
        }
    }

    public final Long x() {
        return this.timeToResendInSec;
    }

    public final Integer z() {
        return this.verificationCodeLength;
    }

    public /* synthetic */ b0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Long l10, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str2;
        }
        if ((i & 4) == 0) {
            this.identifier = null;
        } else {
            this.identifier = str3;
        }
        if ((i & 8) == 0) {
            this.identifierType = null;
        } else {
            this.identifierType = str4;
        }
        if ((i & 16) == 0) {
            this.targetType = null;
        } else {
            this.targetType = str5;
        }
        if ((i & 32) == 0) {
            this.status = null;
        } else {
            this.status = str6;
        }
        if ((i & 64) == 0) {
            this.targetId = null;
        } else {
            this.targetId = str7;
        }
        if ((i & 128) == 0) {
            this.verificationCodeLength = null;
        } else {
            this.verificationCodeLength = num;
        }
        if ((i & 256) == 0) {
            this.timeToResendInSec = null;
        } else {
            this.timeToResendInSec = l10;
        }
    }

    public final b0 a(String id, String createdAt, String identifier, String identifierType, String targetType, String status, String targetId, Integer verificationCodeLength, Long timeToResendInSec) {
        return new b0(id, createdAt, identifier, identifierType, targetType, status, targetId, verificationCodeLength, timeToResendInSec);
    }

    public b0(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Long l10) {
        this.id = str;
        this.createdAt = str2;
        this.identifier = str3;
        this.identifierType = str4;
        this.targetType = str5;
        this.status = str6;
        this.targetId = str7;
        this.verificationCodeLength = num;
        this.timeToResendInSec = l10;
    }

    public static final void a(b0 self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.id != null) {
            output.e(serialDesc, 0, m0.f26414a, self.id);
        }
        if (output.D() || self.createdAt != null) {
            output.e(serialDesc, 1, m0.f26414a, self.createdAt);
        }
        if (output.D() || self.identifier != null) {
            output.e(serialDesc, 2, m0.f26414a, self.identifier);
        }
        if (output.D() || self.identifierType != null) {
            output.e(serialDesc, 3, m0.f26414a, self.identifierType);
        }
        if (output.D() || self.targetType != null) {
            output.e(serialDesc, 4, m0.f26414a, self.targetType);
        }
        if (output.D() || self.status != null) {
            output.e(serialDesc, 5, m0.f26414a, self.status);
        }
        if (output.D() || self.targetId != null) {
            output.e(serialDesc, 6, m0.f26414a, self.targetId);
        }
        if (output.D() || self.verificationCodeLength != null) {
            output.e(serialDesc, 7, H.f26353a, self.verificationCodeLength);
        }
        if (!output.D() && self.timeToResendInSec == null) {
            return;
        }
        output.e(serialDesc, 8, O.f26364a, self.timeToResendInSec);
    }

    public /* synthetic */ b0(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Long l10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : num, (i & 256) == 0 ? l10 : null);
    }

    public static /* synthetic */ void A() {
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

    public static /* synthetic */ void w() {
    }

    public static /* synthetic */ void y() {
    }
}
